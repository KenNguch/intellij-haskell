// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaskellQuasiQuote extends HaskellCompositeElement {

  @Nullable
  HaskellInsideQqExpression getInsideQqExpression();

  @Nullable
  HaskellQName getQName();

  @Nullable
  HaskellSimpletype getSimpletype();

  @NotNull
  List<HaskellTopDeclaration> getTopDeclarationList();

}
