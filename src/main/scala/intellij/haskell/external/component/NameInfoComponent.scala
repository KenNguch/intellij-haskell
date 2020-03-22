/*
 * Copyright 2014-2019 Rik van der Kleij
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package intellij.haskell.external.component

import com.github.blemale.scaffeine.{LoadingCache, Scaffeine}
import com.intellij.openapi.progress.ProgressManager
import com.intellij.openapi.project.Project
import com.intellij.psi.{PsiElement, PsiFile}
import intellij.haskell.external.repl.StackRepl.StackReplOutput
import intellij.haskell.external.repl.StackReplsManager
import intellij.haskell.psi._
import intellij.haskell.util.StringUtil.escapeString
import intellij.haskell.util.{HaskellProjectUtil, StringUtil}

private[component] object NameInfoComponent {

  import intellij.haskell.external.component.NameInfoComponentResult._

  private final val ProjectInfoPattern = """(.+)-- Defined at (.+):([\d]+):([\d]+)""".r
  private final val LibraryModuleInfoPattern = """(.+)-- Defined in [`‘]([\w\.\-]+):([\w\.\-]+)['’]""".r
  private final val ModuleInfoPattern = """(.+)-- Defined in [`‘]([\w\.\-]+)['’]""".r
  private final val InfixInfoPattern = """(infix.+)""".r

  private final val Cache: LoadingCache[Key, NameInfoResult] = Scaffeine().build((k: Key) => findNameInfoResult(k))

  private case class Key(psiFile: PsiFile, name: String)

  def findNameInfo(psiElement: PsiElement): NameInfoResult = {
    HaskellPsiUtil.findQualifiedName(psiElement) match {
      case Some(qualifiedNameElement) => findNameInfo(qualifiedNameElement, None)
      case None => Left(NoInfoAvailable(psiElement.getText, psiElement.getContainingFile.getOriginalFile.getName))
    }
  }

  def invalidate(psiFile: PsiFile): Unit = {
    Cache.asMap().filter(_._1.psiFile == psiFile).keys.foreach(Cache.invalidate)
  }

  def invalidateElements(psiFile: PsiFile, qualifiedNamedElements: Iterable[HaskellQualifiedNameElement]): Unit = {
    val allKeys = qualifiedNamedElements.map(qne => {
      Key(psiFile, qne.getName)
    })
    val keys = allKeys.filter(k => Cache.getIfPresent(k).exists(_.exists(_.exists(_.isInstanceOf[ProjectNameInfo]))))
    Cache.invalidateAll(keys)
  }

  def invalidateAll(project: Project): Unit = {
    Cache.asMap().map(_._1.psiFile).filter(_.getProject == project).foreach(invalidate)
  }

  private def findNameInfo(qualifiedNameElement: HaskellQualifiedNameElement, importQualifier: Option[String]): NameInfoResult = {
    ProgressManager.checkCanceled()

    val psiFile = qualifiedNameElement.getContainingFile.getOriginalFile
    val qName = importQualifier match {
      case None => qualifiedNameElement.getName
      case Some(q) => q + "." + qualifiedNameElement.getIdentifierElement.getName
    }
    val key = Key(psiFile, qName)

    ProgressManager.checkCanceled()

    val result = Cache.get(key)
    result match {
      case Right(_) => result
      case Left(ReadActionTimeout(_)) | Left(IndexNotReady) | Left(ModuleNotAvailable(_)) | Left(ReplNotAvailable) =>
        Cache.invalidate(key)
        result
      case _ => result
    }
  }

  private def findNameInfoResult(key: Key): NameInfoResult = {
    ProgressManager.checkCanceled()

    val psiFile = key.psiFile
    val project = psiFile.getProject
    val name = key.name
    val isSourceFile = HaskellProjectUtil.isSourceFile(psiFile)
    if (isSourceFile) {
      StackReplsManager.getProjectRepl(psiFile) match {
        case Some(repl) =>
          ProgressManager.checkCanceled()

          if (!repl.available) {
            Left(ReplNotAvailable)
          } else {
            repl.findInfo(psiFile, name) match {
              case Some(output) if output.stdoutLines.nonEmpty & output.stderrLines.isEmpty => Right(createNameInfos(project, output))
              case None => Left(ReplNotAvailable)
              case _ => Left(NoInfoAvailable(key.name, psiFile.getName))
            }
          }
        case None => Left(ReplNotAvailable)
      }
    } else {
      HaskellPsiUtil.findModuleName(psiFile) match {
        case None => Left(NoInfoAvailable(key.name, psiFile.getName))
        case Some(mn) =>
          ProgressManager.checkCanceled()

          if (LibraryPackageInfoComponent.findLibraryModuleName(mn).contains(true)) {
            StackReplsManager.getGlobalRepl2(project) match {
              case Some(repl) =>
                ProgressManager.checkCanceled()

                repl.findInfo(mn, name) match {
                  case Some(output) if output.stdoutLines.nonEmpty & output.stderrLines.isEmpty => Right(createNameInfos(project, output))
                  case _ => Left(NoInfoAvailable(key.name, psiFile.getName))
                }
              case None => Left(ReplNotAvailable)
            }
          } else {
            Left(NoInfoAvailable(key.name, psiFile.getName))
          }
      }
    }
  }

  private def createNameInfos(project: Project, output: StackReplOutput): Iterable[NameInfo] = {
    output.stdoutLines.flatMap(l => createNameInfo(l, project))
  }

  private def createNameInfo(outputLine: String, project: Project): Option[NameInfo] = {
    val result = outputLine match {
      case ProjectInfoPattern(declaration, filePath, lineNr, colNr) => Some(ProjectNameInfo(declaration, filePath, lineNr.toInt, colNr.toInt))
      case LibraryModuleInfoPattern(declaration, packageId, moduleName) =>
        LibraryPackageInfoComponent.toPackageNameversion(packageId) match {
          case Some(packageNameVersion) => Some(LibraryNameInfo(declaration, Some(packageNameVersion.name), moduleName))
          case None => Some(LibraryNameInfo(declaration, None, moduleName))
        }
      case ModuleInfoPattern(declaration, moduleName) => Some(LibraryNameInfo(declaration, None, moduleName))
      case InfixInfoPattern(declaration) => Some(InfixInfo(declaration))
      case _ => None
    }
    result
  }
}

object NameInfoComponentResult {
  type NameInfoResult = Either[NoInfo, Iterable[NameInfo]]

  sealed trait NameInfo {

    def declaration: String

    def shortenedDeclaration: String = StringUtil.sanitizeDeclaration(declaration)

    def escapedDeclaration: String = escapeString(declaration).replaceAll("""\s+""", " ")
  }

  case class ProjectNameInfo(declaration: String, filePath: String, lineNr: Int, columnNr: Int) extends NameInfo

  case class LibraryNameInfo(declaration: String, packageName: Option[String], moduleName: String) extends NameInfo

  case class InfixInfo(declaration: String) extends NameInfo

}