// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi;

import com.intellij.navigation.ItemPresentation;
import org.jetbrains.annotations.NotNull;
import scala.Option;
import scala.collection.immutable.Seq;

import java.util.List;

public interface HaskellTypeSignature extends HaskellDeclarationElement {

  @NotNull
  List<HaskellCcontext> getCcontextList();

  @NotNull
  List<HaskellPragma> getPragmaList();

  @NotNull
  List<HaskellQNames> getQNamesList();

  @NotNull
  HaskellTtype getTtype();

  String getName();

  ItemPresentation getPresentation();

  Seq<HaskellNamedElement> getIdentifierElements();

  Option<String> getModuleName();

}
