/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package intellij.haskell;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static intellij.haskell.psi.HaskellTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>_HaskellLexer.flex</tt>
 */
public class _HaskellLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int NCOMMENT = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1952 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\5\3\1\5\1\6\20\3\1\7\47\3");

  /* The ZZ_CMAP_A table has 512 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\1\1\4\0\1\1\3\0\1\1\1\3\1\35\1\36\1\2\21\0\1\1\1\4\1\72\1\71\1\5\2\73\1\42"+
    "\1\70\1\111\1\112\1\73\1\74\1\113\1\25\1\75\1\73\1\30\4\64\3\33\2\24\1\105"+
    "\1\114\1\76\1\101\1\77\1\100\1\102\1\54\1\57\1\55\1\27\1\37\1\60\1\67\1\51"+
    "\1\63\1\23\1\56\1\47\1\66\1\45\1\34\1\63\1\53\1\62\1\50\1\52\1\46\1\61\1\23"+
    "\1\32\1\65\1\23\1\115\1\21\1\40\1\44\1\41\1\116\1\26\1\121\1\17\1\10\1\11"+
    "\1\7\1\122\1\130\1\6\2\22\1\13\1\126\1\12\1\16\1\125\1\22\1\15\1\14\1\123"+
    "\1\20\1\43\1\127\1\31\1\124\1\22\1\117\1\103\1\120\1\104\6\0\1\35\242\0\2"+
    "\35\46\0\1\106\1\0\1\107\77\0\1\110\62\0\1\73\72\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\2\3\1\4\11\5\1\6\1\7"+
    "\1\10\1\4\1\10\1\11\1\12\1\4\1\13\1\1"+
    "\1\4\1\14\2\4\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\3\5\4\35\5\0\2\4\1\5"+
    "\1\36\1\37\3\5\1\40\4\5\1\41\2\5\1\0"+
    "\1\4\1\0\1\7\2\0\1\4\1\42\1\23\1\43"+
    "\4\0\1\21\1\0\1\44\1\0\1\45\1\22\1\24"+
    "\1\21\1\46\1\47\4\5\1\50\1\51\1\2\6\0"+
    "\1\52\1\53\11\5\1\54\2\5\1\55\1\0\1\55"+
    "\1\0\1\56\1\57\1\60\36\0\2\61\1\62\4\5"+
    "\2\50\1\2\7\0\6\5\1\63\1\64\2\5\1\65"+
    "\30\0\1\66\1\67\2\5\1\2\3\0\1\70\6\5"+
    "\1\71\2\0\1\5\1\72\1\0\1\73\1\74\1\5"+
    "\1\75\4\5\3\0\1\76\2\5\1\77\1\5\1\100"+
    "\3\0\1\101\1\0\1\102\21\0\1\103\2\0\1\42"+
    "\3\0\1\104\1\105\1\106";

  private static int [] zzUnpackAction() {
    int [] result = new int[285];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\131\0\262\0\u010b\0\u0164\0\262\0\u01bd\0\u0216"+
    "\0\u026f\0\u02c8\0\u0321\0\u037a\0\u03d3\0\u042c\0\u0485\0\u04de"+
    "\0\u0537\0\u0590\0\u05e9\0\u0642\0\u069b\0\262\0\u042c\0\u06f4"+
    "\0\u074d\0\u07a6\0\u07ff\0\u0858\0\u08b1\0\u090a\0\u0963\0\u06f4"+
    "\0\u06f4\0\u06f4\0\u09bc\0\262\0\262\0\262\0\262\0\262"+
    "\0\262\0\262\0\262\0\262\0\u0a15\0\262\0\u0a6e\0\u0ac7"+
    "\0\u0b20\0\262\0\u0b79\0\u0bd2\0\u0c2b\0\u0c84\0\u0cdd\0\u0d36"+
    "\0\u0d8f\0\u0de8\0\u0e41\0\u0e9a\0\u0ef3\0\u042c\0\u0f4c\0\u0fa5"+
    "\0\u0ffe\0\u1057\0\u042c\0\u10b0\0\u1109\0\u1162\0\u11bb\0\u042c"+
    "\0\u1214\0\u126d\0\u12c6\0\u131f\0\u1378\0\u13d1\0\u142a\0\u1483"+
    "\0\u14dc\0\u1535\0\u06f4\0\262\0\u158e\0\u15e7\0\u1640\0\u1699"+
    "\0\u16f2\0\u07a6\0\262\0\u174b\0\262\0\u06f4\0\u06f4\0\u17a4"+
    "\0\u17a4\0\u17fd\0\u1856\0\u18af\0\u1908\0\u1961\0\u19ba\0\262"+
    "\0\u1a13\0\u1a6c\0\u1ac5\0\u1b1e\0\u1b77\0\u1bd0\0\u1c29\0\262"+
    "\0\u1c82\0\u1cdb\0\u1d34\0\u1d8d\0\u1de6\0\u1e3f\0\u1e98\0\u1ef1"+
    "\0\u1f4a\0\u1fa3\0\u042c\0\u1ffc\0\u2055\0\u20ae\0\u2107\0\u2160"+
    "\0\u2160\0\u158e\0\u15e7\0\262\0\u21b9\0\u2212\0\u226b\0\u22c4"+
    "\0\u231d\0\u2376\0\u23cf\0\u2428\0\u2481\0\u24da\0\u2533\0\u258c"+
    "\0\u25e5\0\u263e\0\u2697\0\u26f0\0\u2749\0\u27a2\0\u27fb\0\u2854"+
    "\0\u28ad\0\u2906\0\u295f\0\u29b8\0\u2a11\0\u2a6a\0\u2ac3\0\u2b1c"+
    "\0\u2b75\0\u2bce\0\262\0\u2c27\0\262\0\u2c80\0\u2cd9\0\u2d32"+
    "\0\u2d8b\0\u2de4\0\262\0\u2e3d\0\u2e96\0\u2eef\0\u2f48\0\u2fa1"+
    "\0\u2ffa\0\u3053\0\u30ac\0\u3105\0\u315e\0\u31b7\0\u3210\0\u3269"+
    "\0\u32c2\0\u042c\0\u042c\0\u331b\0\u3374\0\u042c\0\u33cd\0\u3426"+
    "\0\u347f\0\u34d8\0\u3531\0\u358a\0\u35e3\0\u363c\0\u3695\0\u36ee"+
    "\0\u3747\0\u37a0\0\u37f9\0\u3852\0\u38ab\0\u3904\0\u395d\0\u39b6"+
    "\0\u3a0f\0\u3a68\0\u3ac1\0\u3b1a\0\u3b73\0\u3bcc\0\u3c25\0\u042c"+
    "\0\u3c7e\0\u3cd7\0\u3d30\0\u3d89\0\u3de2\0\u3e3b\0\u3e94\0\u3eed"+
    "\0\u3f46\0\u3f9f\0\u3ff8\0\u4051\0\u40aa\0\u042c\0\u4103\0\u415c"+
    "\0\u41b5\0\u042c\0\u420e\0\u042c\0\u042c\0\u4267\0\u042c\0\u42c0"+
    "\0\u4319\0\u4372\0\u43cb\0\u4424\0\u447d\0\u44d6\0\u042c\0\u452f"+
    "\0\u4588\0\u042c\0\u45e1\0\u042c\0\u463a\0\u4693\0\u46ec\0\u042c"+
    "\0\u4745\0\u042c\0\u479e\0\u47f7\0\u4850\0\u48a9\0\u4902\0\u495b"+
    "\0\u49b4\0\u4a0d\0\u4a66\0\u4abf\0\u4b18\0\u4b71\0\u4bca\0\u4c23"+
    "\0\u4c7c\0\u4cd5\0\u4d2e\0\262\0\u4d87\0\u4de0\0\262\0\u4e39"+
    "\0\u4e92\0\u4eeb\0\262\0\262\0\262";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[285];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\1\4\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\2\16\1\17\1\20\1\16"+
    "\1\21\1\16\1\22\1\23\1\24\1\16\1\22\1\25"+
    "\1\16\1\22\1\23\1\22\1\0\1\4\1\22\1\26"+
    "\1\27\1\30\1\16\1\30\17\22\1\23\3\22\1\31"+
    "\1\32\2\30\1\33\1\34\1\35\1\30\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\2\16"+
    "\1\57\2\16\1\60\1\61\1\16\2\62\1\63\22\62"+
    "\1\64\7\62\1\0\61\62\1\65\11\62\132\0\1\4"+
    "\2\0\1\4\31\0\1\4\75\0\1\6\126\0\1\66"+
    "\2\0\1\66\1\30\1\67\1\0\1\70\1\71\6\0"+
    "\1\72\1\30\3\0\1\73\10\0\1\66\3\0\1\30"+
    "\1\0\1\30\25\0\1\74\13\30\30\0\1\75\1\16"+
    "\1\76\2\16\1\77\6\16\1\0\3\16\1\0\7\16"+
    "\2\0\1\16\1\0\1\16\1\0\1\16\1\0\24\16"+
    "\30\0\5\16\1\100\2\16\5\0\1\75\10\16\1\101"+
    "\2\16\1\0\3\16\1\0\7\16\2\0\1\16\1\0"+
    "\1\16\1\0\1\16\1\0\24\16\30\0\10\16\5\0"+
    "\1\75\3\16\1\102\4\16\1\103\2\16\1\0\3\16"+
    "\1\0\1\104\6\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\30\0\10\16\5\0\1\75\5\16"+
    "\1\105\5\16\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\30\0\10\16"+
    "\5\0\1\75\3\16\1\106\7\16\1\0\3\16\1\0"+
    "\7\16\2\0\1\16\1\0\1\16\1\0\1\16\1\0"+
    "\24\16\30\0\10\16\5\0\1\75\3\16\1\107\7\16"+
    "\1\0\3\16\1\0\7\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\24\16\30\0\10\16\5\0\1\75"+
    "\13\16\1\0\3\16\1\0\7\16\2\0\1\16\1\0"+
    "\1\16\1\0\1\16\1\0\24\16\30\0\10\16\5\0"+
    "\1\75\1\16\1\110\11\16\1\0\3\16\1\0\7\16"+
    "\2\0\1\16\1\0\1\16\1\0\1\16\1\0\24\16"+
    "\30\0\10\16\5\0\1\75\5\16\1\111\5\16\1\0"+
    "\3\16\1\0\1\112\6\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\24\16\30\0\10\16\2\113\2\0"+
    "\1\113\1\114\13\113\1\114\3\113\1\114\7\113\2\0"+
    "\3\113\1\114\1\113\1\114\25\113\14\114\13\113\1\115"+
    "\7\113\5\0\1\116\13\22\1\0\3\22\1\0\7\22"+
    "\2\0\1\22\1\0\1\22\1\0\1\22\1\0\24\22"+
    "\30\0\10\22\11\0\1\117\7\0\1\120\2\0\1\23"+
    "\3\0\1\23\2\0\1\23\3\0\1\117\24\0\1\23"+
    "\51\0\1\30\13\0\1\121\2\0\1\23\1\122\2\0"+
    "\1\23\2\0\1\23\6\0\1\30\1\0\1\30\17\0"+
    "\1\23\5\0\5\30\1\123\6\30\12\0\1\124\21\0"+
    "\1\117\4\0\1\125\2\0\1\120\2\0\1\23\3\0"+
    "\1\23\2\126\1\23\1\125\2\0\1\117\24\0\1\23"+
    "\51\0\1\30\13\0\1\30\3\0\1\30\14\0\1\30"+
    "\1\0\1\30\25\0\14\30\23\0\3\127\1\0\15\127"+
    "\1\130\46\127\1\0\14\127\1\131\23\127\3\132\1\133"+
    "\15\132\1\134\47\132\1\133\37\132\5\0\1\30\13\0"+
    "\1\121\2\0\1\23\1\30\2\0\1\23\2\0\1\23"+
    "\6\0\1\30\1\0\1\30\17\0\1\23\5\0\14\30"+
    "\120\0\1\135\40\0\1\30\13\0\1\30\3\0\1\136"+
    "\14\0\1\30\1\0\1\30\25\0\14\30\30\0\1\30"+
    "\13\16\1\30\1\16\2\0\1\30\1\16\2\0\1\16"+
    "\7\0\1\16\1\30\1\16\1\30\25\0\14\30\13\0"+
    "\10\16\5\0\1\30\13\0\1\30\3\0\1\30\14\0"+
    "\1\30\1\0\1\30\25\0\5\30\1\137\6\30\30\0"+
    "\1\140\13\0\1\140\3\0\1\140\14\0\1\140\1\0"+
    "\1\140\25\0\13\140\1\141\50\0\1\142\110\0\1\75"+
    "\13\16\1\0\3\16\1\0\7\16\2\0\1\16\1\0"+
    "\1\16\1\0\1\16\1\0\24\16\30\0\3\16\1\143"+
    "\3\16\1\144\5\0\1\75\10\16\1\145\2\16\1\0"+
    "\3\16\1\0\7\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\30\0\10\16\5\0\1\75\13\16"+
    "\1\0\3\16\1\0\7\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\24\16\30\0\7\16\1\146\3\0"+
    "\1\62\245\0\1\147\35\0\1\150\104\0\1\66\2\0"+
    "\1\66\1\0\1\67\1\0\1\70\1\71\6\0\1\72"+
    "\15\0\1\66\101\0\1\151\2\0\1\152\127\0\1\153"+
    "\131\0\1\154\1\155\1\0\1\156\125\0\1\157\123\0"+
    "\1\30\13\0\1\30\3\0\1\30\14\0\1\30\1\0"+
    "\1\30\25\0\14\30\12\0\1\160\10\0\2\161\2\0"+
    "\1\161\1\74\13\161\1\74\3\161\1\74\14\161\1\74"+
    "\1\161\1\74\25\161\14\74\23\161\5\0\1\75\130\0"+
    "\1\75\1\16\1\162\4\16\1\163\4\16\1\0\3\16"+
    "\1\0\7\16\2\0\1\16\1\0\1\16\1\0\1\16"+
    "\1\0\24\16\30\0\10\16\5\0\1\75\13\16\1\0"+
    "\3\16\1\0\7\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\30\0\4\16\1\164\3\16\5\0"+
    "\1\75\7\16\1\165\3\16\1\0\3\16\1\0\7\16"+
    "\2\0\1\16\1\0\1\16\1\0\1\16\1\0\24\16"+
    "\30\0\10\16\5\0\1\75\1\16\1\166\5\16\1\167"+
    "\3\16\1\0\3\16\1\0\7\16\2\0\1\16\1\0"+
    "\1\16\1\0\1\16\1\0\24\16\30\0\10\16\5\0"+
    "\1\75\13\16\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\30\0\2\16"+
    "\1\170\5\16\5\0\1\75\6\16\1\171\4\16\1\0"+
    "\3\16\1\0\7\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\30\0\10\16\5\0\1\75\13\16"+
    "\1\0\3\16\1\0\7\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\24\16\30\0\6\16\1\172\1\16"+
    "\5\0\1\75\13\16\1\0\3\16\1\0\7\16\2\0"+
    "\1\16\1\0\1\16\1\0\1\16\1\0\24\16\30\0"+
    "\2\16\1\173\5\16\5\0\1\75\13\16\1\0\3\16"+
    "\1\0\1\174\6\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\30\0\10\16\5\0\1\75\6\16"+
    "\1\175\4\16\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\30\0\10\16"+
    "\24\0\1\176\3\0\1\176\2\0\1\176\30\0\1\176"+
    "\51\0\1\30\13\0\1\30\2\0\1\176\1\30\2\0"+
    "\1\176\2\0\1\176\6\0\1\30\1\0\1\30\17\0"+
    "\1\176\5\0\14\30\34\0\1\177\12\0\1\176\3\0"+
    "\1\176\2\0\1\176\30\0\1\176\51\0\1\116\147\0"+
    "\1\200\1\201\2\0\1\200\2\0\1\200\30\0\1\200"+
    "\7\0\1\201\34\0\2\176\2\0\31\176\2\0\72\176"+
    "\2\113\2\0\1\113\1\114\13\113\1\114\3\113\1\114"+
    "\7\113\2\0\3\113\1\114\1\113\1\114\25\113\14\114"+
    "\23\113\2\122\2\0\125\122\30\0\1\202\2\0\1\202"+
    "\30\0\1\202\53\0\3\203\5\0\1\203\4\0\1\203"+
    "\1\0\3\203\2\0\1\203\3\0\1\203\14\0\2\203"+
    "\1\0\2\203\3\0\1\203\34\0\1\203\77\0\1\204"+
    "\47\0\1\127\2\0\1\127\2\0\1\127\1\205\2\0"+
    "\1\127\2\0\1\206\1\0\1\127\1\207\1\206\1\210"+
    "\1\0\1\206\3\0\1\211\2\0\2\127\1\212\1\213"+
    "\1\214\1\215\1\216\1\217\2\0\1\220\1\221\1\0"+
    "\1\222\1\223\1\217\1\214\1\0\1\206\2\0\1\214"+
    "\2\127\27\0\1\127\1\0\1\127\12\0\1\140\13\0"+
    "\1\140\3\0\1\140\14\0\1\140\1\0\1\140\23\0"+
    "\1\204\1\0\14\140\24\0\4\224\2\0\1\132\2\0"+
    "\1\132\2\0\1\132\1\225\2\0\1\132\2\0\1\132"+
    "\1\0\1\132\1\226\1\132\1\227\1\0\1\132\2\0"+
    "\1\224\1\230\2\0\2\132\1\231\1\232\1\233\1\234"+
    "\1\235\1\236\2\0\1\237\1\240\1\0\1\241\1\242"+
    "\1\236\1\233\1\0\1\132\2\0\1\233\2\132\27\0"+
    "\1\132\1\0\1\132\12\0\1\140\13\0\1\140\3\0"+
    "\1\140\14\0\1\140\1\0\1\140\25\0\14\140\23\0"+
    "\2\243\1\244\2\243\1\245\112\243\1\0\10\243\5\0"+
    "\1\75\13\16\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\30\0\4\16"+
    "\1\246\3\16\5\0\1\75\3\16\1\247\7\16\1\0"+
    "\3\16\1\0\7\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\30\0\10\16\5\0\1\75\2\16"+
    "\1\250\10\16\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\30\0\10\16"+
    "\5\0\1\75\3\16\1\251\7\16\1\0\3\16\1\0"+
    "\7\16\2\0\1\16\1\0\1\16\1\0\1\16\1\0"+
    "\24\16\30\0\10\16\2\0\1\252\1\253\125\0\2\151"+
    "\2\0\15\151\1\254\107\151\17\0\1\255\120\0\1\256"+
    "\131\0\1\257\126\0\1\260\5\0\1\261\131\0\1\262"+
    "\123\0\1\263\120\0\2\161\2\0\125\161\5\0\1\75"+
    "\1\264\12\16\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\30\0\10\16"+
    "\5\0\1\75\13\16\1\0\3\16\1\0\7\16\2\0"+
    "\1\16\1\0\1\16\1\0\1\16\1\0\24\16\30\0"+
    "\2\16\1\265\5\16\5\0\1\75\10\16\1\266\2\16"+
    "\1\0\3\16\1\0\7\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\24\16\30\0\10\16\5\0\1\75"+
    "\3\16\1\267\7\16\1\0\3\16\1\0\7\16\2\0"+
    "\1\16\1\0\1\16\1\0\1\16\1\0\24\16\30\0"+
    "\10\16\5\0\1\75\13\16\1\0\3\16\1\0\1\270"+
    "\6\16\2\0\1\16\1\0\1\16\1\0\1\16\1\0"+
    "\24\16\30\0\10\16\5\0\1\75\1\271\12\16\1\0"+
    "\3\16\1\0\7\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\30\0\10\16\5\0\1\75\13\16"+
    "\1\0\3\16\1\0\1\272\6\16\2\0\1\16\1\0"+
    "\1\16\1\0\1\16\1\0\24\16\30\0\10\16\5\0"+
    "\1\75\3\16\1\273\7\16\1\0\3\16\1\0\7\16"+
    "\2\0\1\16\1\0\1\16\1\0\1\16\1\0\24\16"+
    "\30\0\10\16\5\0\1\75\13\16\1\0\3\16\1\0"+
    "\7\16\2\0\1\16\1\0\1\16\1\0\1\16\1\0"+
    "\24\16\30\0\2\16\1\274\5\16\5\0\1\75\6\16"+
    "\1\275\4\16\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\30\0\10\16"+
    "\5\0\1\75\3\16\1\276\7\16\1\0\3\16\1\0"+
    "\7\16\2\0\1\16\1\0\1\16\1\0\1\16\1\0"+
    "\24\16\30\0\10\16\11\0\1\117\12\0\1\176\3\0"+
    "\1\176\2\0\1\176\3\0\1\117\24\0\1\176\166\0"+
    "\1\277\32\0\1\200\3\0\1\200\2\0\1\200\30\0"+
    "\1\200\74\0\1\300\2\0\1\300\30\0\1\300\70\0"+
    "\1\206\3\0\1\206\2\0\1\206\30\0\1\206\3\0"+
    "\1\204\77\0\1\301\7\0\1\302\5\0\1\303\62\0"+
    "\3\304\5\0\1\304\4\0\1\304\1\0\3\304\2\0"+
    "\1\304\3\0\1\304\14\0\2\304\1\0\2\304\3\0"+
    "\1\304\34\0\1\304\43\0\1\217\10\0\1\305\2\0"+
    "\1\306\1\0\1\307\13\0\1\127\63\0\1\127\1\0"+
    "\1\127\3\0\1\127\2\0\1\127\1\0\1\127\2\0"+
    "\3\127\2\0\20\127\1\0\3\127\12\0\1\127\12\0"+
    "\1\127\61\0\1\301\5\0\1\310\124\0\1\127\140\0"+
    "\1\127\104\0\1\311\11\0\1\312\3\0\1\313\10\0"+
    "\1\127\1\0\1\314\115\0\1\127\133\0\1\310\127\0"+
    "\1\314\5\0\1\127\105\0\1\301\10\0\1\127\130\0"+
    "\1\127\7\0\1\127\51\0\4\224\14\0\1\132\14\0"+
    "\1\224\122\0\1\132\2\0\1\132\30\0\1\132\103\0"+
    "\1\315\7\0\1\316\5\0\1\317\62\0\3\132\5\0"+
    "\1\132\4\0\1\132\1\0\3\132\2\0\1\132\3\0"+
    "\1\132\14\0\2\132\1\0\2\132\3\0\1\132\34\0"+
    "\1\132\43\0\1\236\10\0\1\320\2\0\1\321\1\0"+
    "\1\322\13\0\1\132\63\0\1\132\1\0\1\132\3\0"+
    "\1\132\2\0\1\132\1\0\1\132\2\0\3\132\2\0"+
    "\20\132\1\0\3\132\12\0\1\132\12\0\1\132\61\0"+
    "\1\315\5\0\1\323\124\0\1\132\140\0\1\132\104\0"+
    "\1\132\11\0\1\324\3\0\1\325\10\0\1\132\1\0"+
    "\1\326\115\0\1\132\133\0\1\323\127\0\1\326\5\0"+
    "\1\132\105\0\1\315\10\0\1\132\130\0\1\132\7\0"+
    "\1\132\53\0\1\243\132\0\1\75\3\16\1\327\7\16"+
    "\1\0\3\16\1\0\7\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\24\16\30\0\10\16\5\0\1\75"+
    "\4\16\1\330\6\16\1\0\3\16\1\0\7\16\2\0"+
    "\1\16\1\0\1\16\1\0\1\16\1\0\24\16\30\0"+
    "\10\16\5\0\1\75\12\16\1\331\1\0\3\16\1\0"+
    "\7\16\2\0\1\16\1\0\1\16\1\0\1\16\1\0"+
    "\24\16\30\0\10\16\5\0\1\75\7\16\1\332\3\16"+
    "\1\0\3\16\1\0\7\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\24\16\30\0\10\16\3\0\1\253"+
    "\125\0\2\151\1\333\16\151\1\254\107\151\13\0\1\334"+
    "\123\0\1\335\130\0\1\260\131\0\1\151\132\0\1\151"+
    "\135\0\1\336\123\0\1\260\124\0\1\75\13\16\1\0"+
    "\3\16\1\0\3\16\1\337\3\16\2\0\1\16\1\0"+
    "\1\16\1\0\1\16\1\0\24\16\30\0\10\16\5\0"+
    "\1\75\13\16\1\0\3\16\1\0\1\340\6\16\2\0"+
    "\1\16\1\0\1\16\1\0\1\16\1\0\24\16\30\0"+
    "\10\16\5\0\1\75\7\16\1\341\3\16\1\0\3\16"+
    "\1\0\7\16\2\0\1\16\1\0\1\16\1\0\1\16"+
    "\1\0\24\16\30\0\10\16\5\0\1\75\1\342\12\16"+
    "\1\0\3\16\1\0\7\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\24\16\30\0\10\16\5\0\1\75"+
    "\12\16\1\343\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\30\0\10\16"+
    "\5\0\1\75\13\16\1\0\3\16\1\0\7\16\2\0"+
    "\1\16\1\0\1\16\1\0\1\344\1\0\24\16\30\0"+
    "\10\16\5\0\1\75\13\16\1\0\3\16\1\0\7\16"+
    "\2\0\1\16\1\0\1\16\1\0\1\16\1\0\24\16"+
    "\30\0\3\16\1\345\4\16\5\0\1\75\6\16\1\346"+
    "\4\16\1\0\3\16\1\0\7\16\2\0\1\16\1\0"+
    "\1\16\1\0\1\16\1\0\24\16\30\0\10\16\6\0"+
    "\1\347\152\0\1\300\2\0\1\300\30\0\1\300\3\0"+
    "\1\204\107\0\1\127\120\0\1\127\155\0\1\127\53\0"+
    "\3\304\5\0\1\304\4\0\1\304\1\0\3\304\2\0"+
    "\1\304\3\0\1\304\14\0\2\304\1\0\2\304\3\0"+
    "\1\304\3\0\1\204\30\0\1\304\62\0\1\127\132\0"+
    "\1\127\105\0\1\127\24\0\1\127\127\0\1\127\123\0"+
    "\1\127\16\0\1\204\117\0\1\127\103\0\1\127\143\0"+
    "\1\127\132\0\1\132\120\0\1\132\155\0\1\132\117\0"+
    "\1\132\132\0\1\132\105\0\1\132\24\0\1\132\127\0"+
    "\1\132\131\0\1\132\103\0\1\132\143\0\1\132\67\0"+
    "\1\350\1\75\13\16\1\0\3\16\1\0\7\16\2\0"+
    "\1\16\1\0\1\16\1\0\1\16\1\0\24\16\30\0"+
    "\10\16\5\0\1\75\5\16\1\351\5\16\1\0\3\16"+
    "\1\0\7\16\2\0\1\16\1\0\1\16\1\0\1\16"+
    "\1\0\24\16\30\0\10\16\5\0\1\75\3\16\1\352"+
    "\7\16\1\0\3\16\1\0\7\16\2\0\1\16\1\0"+
    "\1\16\1\0\1\16\1\0\24\16\30\0\10\16\2\151"+
    "\1\0\16\151\1\254\107\151\20\0\1\353\122\0\1\261"+
    "\133\0\1\151\120\0\1\75\5\16\1\354\1\16\1\355"+
    "\3\16\1\0\3\16\1\0\7\16\2\0\1\16\1\0"+
    "\1\16\1\0\1\16\1\0\24\16\30\0\10\16\5\0"+
    "\1\75\4\16\1\356\6\16\1\0\3\16\1\0\7\16"+
    "\2\0\1\16\1\0\1\16\1\0\1\16\1\0\24\16"+
    "\30\0\10\16\5\0\1\75\13\16\1\0\3\16\1\0"+
    "\7\16\2\0\1\16\1\0\1\16\1\0\1\16\1\0"+
    "\24\16\30\0\2\16\1\357\5\16\5\0\1\75\13\16"+
    "\1\0\3\16\1\0\7\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\24\16\30\0\1\16\1\360\6\16"+
    "\5\0\1\75\5\16\1\361\5\16\1\0\3\16\1\0"+
    "\7\16\2\0\1\16\1\0\1\16\1\0\1\16\1\0"+
    "\24\16\30\0\10\16\5\0\1\75\1\362\12\16\1\0"+
    "\3\16\1\0\7\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\30\0\10\16\5\0\1\75\13\16"+
    "\1\0\3\16\1\0\7\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\24\16\30\0\4\16\1\363\3\16"+
    "\12\0\1\364\124\0\1\365\1\366\126\0\1\75\3\16"+
    "\1\367\7\16\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\30\0\10\16"+
    "\10\0\1\261\125\0\1\75\11\16\1\370\1\16\1\0"+
    "\3\16\1\0\7\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\30\0\10\16\5\0\1\75\4\16"+
    "\1\371\6\16\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\30\0\10\16"+
    "\5\0\1\75\13\16\1\0\3\16\1\0\7\16\2\0"+
    "\1\16\1\0\1\16\1\0\1\16\1\0\24\16\30\0"+
    "\2\16\1\372\5\16\5\0\1\75\4\16\1\373\6\16"+
    "\1\0\3\16\1\0\7\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\24\16\30\0\10\16\5\0\1\75"+
    "\3\16\1\374\7\16\1\0\3\16\1\0\7\16\2\0"+
    "\1\16\1\0\1\16\1\0\1\16\1\0\24\16\30\0"+
    "\10\16\117\0\1\375\23\0\1\376\144\0\1\377\107\0"+
    "\1\75\3\16\1\u0100\7\16\1\0\3\16\1\0\7\16"+
    "\2\0\1\16\1\0\1\16\1\0\1\16\1\0\24\16"+
    "\30\0\10\16\4\0\1\u0101\1\75\13\16\1\0\3\16"+
    "\1\0\7\16\2\0\1\16\1\0\1\16\1\0\1\16"+
    "\1\0\24\16\30\0\10\16\5\0\1\75\13\16\1\0"+
    "\3\16\1\0\7\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\30\0\1\16\1\u0102\6\16\17\0"+
    "\1\u0103\125\0\1\u0104\242\0\1\u0105\10\0\1\u0106\2\0"+
    "\1\u0107\135\0\1\u0108\235\0\1\u0109\13\0\1\u010a\250\0"+
    "\1\u010b\33\0\1\u010c\107\0\1\u010d\146\0\1\u010e\115\0"+
    "\1\u010f\242\0\1\u0110\130\0\1\u0111\14\0\1\u0112\131\0"+
    "\1\u0113\242\0\1\u0114\22\0\1\u0115\130\0\1\u0116\232\0"+
    "\1\u0117\27\0\1\u0118\126\0\1\u0119\130\0\1\u011a\124\0"+
    "\1\u011b\242\0\1\u011c\130\0\1\u011d\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[20292];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\2\1\1\11\17\1\1\11\15\1\11\11"+
    "\1\1\1\11\3\1\1\11\3\1\5\0\20\1\1\0"+
    "\1\1\1\0\1\1\2\0\3\1\1\11\4\0\1\1"+
    "\1\0\1\11\1\0\1\11\12\1\1\11\1\1\6\0"+
    "\1\11\16\1\1\0\1\1\1\0\2\1\1\11\36\0"+
    "\1\11\1\1\1\11\5\1\1\11\1\1\7\0\13\1"+
    "\30\0\5\1\3\0\10\1\2\0\2\1\1\0\10\1"+
    "\3\0\6\1\3\0\1\1\1\0\1\1\21\0\1\11"+
    "\2\0\1\11\3\0\3\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[285];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _HaskellLexer() {
    this(null);
  }
    private int commentStart;
    private int commentDepth;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _HaskellLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        switch (zzLexicalState) {
            case NCOMMENT: {
              int state = yystate();
        yybegin(YYINITIAL);
        zzStartRead = commentStart;
        return HS_NCOMMENT;
            }
            case 286: break;
            default:
        return null;
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return com.intellij.psi.TokenType.BAD_CHARACTER;
            }
          case 71: break;
          case 2: 
            { return com.intellij.psi.TokenType.WHITE_SPACE;
            }
          case 72: break;
          case 3: 
            { return HS_NEWLINE;
            }
          case 73: break;
          case 4: 
            { return HS_VARSYM_ID;
            }
          case 74: break;
          case 5: 
            { return HS_VAR_ID;
            }
          case 75: break;
          case 6: 
            { return HS_BACKSLASH;
            }
          case 76: break;
          case 7: 
            { return HS_CON_ID;
            }
          case 77: break;
          case 8: 
            { return HS_DECIMAL;
            }
          case 78: break;
          case 9: 
            { return HS_RIGHT_BRACKET;
            }
          case 79: break;
          case 10: 
            { return HS_UNDERSCORE;
            }
          case 80: break;
          case 11: 
            { return HS_QUOTE;
            }
          case 81: break;
          case 12: 
            { return HS_DOT;
            }
          case 82: break;
          case 13: 
            { return HS_EQUAL;
            }
          case 83: break;
          case 14: 
            { return HS_AT;
            }
          case 84: break;
          case 15: 
            { return HS_VERTICAL_BAR;
            }
          case 85: break;
          case 16: 
            { return HS_TILDE;
            }
          case 86: break;
          case 17: 
            { return HS_CONSYM_ID;
            }
          case 87: break;
          case 18: 
            { return HS_LEFT_ARROW;
            }
          case 88: break;
          case 19: 
            { return HS_RIGHT_ARROW;
            }
          case 89: break;
          case 20: 
            { return HS_DOUBLE_RIGHT_ARROW;
            }
          case 90: break;
          case 21: 
            { return HS_LEFT_PAREN;
            }
          case 91: break;
          case 22: 
            { return HS_RIGHT_PAREN;
            }
          case 92: break;
          case 23: 
            { return HS_COMMA;
            }
          case 93: break;
          case 24: 
            { return HS_SEMICOLON;
            }
          case 94: break;
          case 25: 
            { return HS_LEFT_BRACKET;
            }
          case 95: break;
          case 26: 
            { return HS_BACKQUOTE;
            }
          case 96: break;
          case 27: 
            { return HS_LEFT_BRACE;
            }
          case 97: break;
          case 28: 
            { return HS_RIGHT_BRACE;
            }
          case 98: break;
          case 29: 
            { 
            }
          case 99: break;
          case 30: 
            { return HS_IF;
            }
          case 100: break;
          case 31: 
            { return HS_IN;
            }
          case 101: break;
          case 32: 
            { return HS_DO;
            }
          case 102: break;
          case 33: 
            { return HS_OF;
            }
          case 103: break;
          case 34: 
            { return HS_COMMENT;
            }
          case 104: break;
          case 35: 
            { return HS_NCOMMENT_END;
            }
          case 105: break;
          case 36: 
            { return HS_STRING_LITERAL;
            }
          case 106: break;
          case 37: 
            { return HS_DOT_DOT;
            }
          case 107: break;
          case 38: 
            { return HS_COLON_COLON;
            }
          case 108: break;
          case 39: 
            { return HS_NCOMMENT_START;
            }
          case 109: break;
          case 40: 
            { if (commentDepth > 0) {
            commentDepth--;
        }
        else {
             int state = yystate();
             yybegin(YYINITIAL);
             zzStartRead = commentStart;
             return HS_NCOMMENT;
        }
            }
          case 110: break;
          case 41: 
            { commentDepth++;
            }
          case 111: break;
          case 42: 
            { return HS_PRAGMA_END;
            }
          case 112: break;
          case 43: 
            { return HS_SHEBANG_LINE;
            }
          case 113: break;
          case 44: 
            { return HS_LET;
            }
          case 114: break;
          case 45: 
            { return HS_FLOAT;
            }
          case 115: break;
          case 46: 
            { return HS_OCTAL;
            }
          case 116: break;
          case 47: 
            { return HS_HEXADECIMAL;
            }
          case 117: break;
          case 48: 
            { return HS_CHARACTER_LITERAL;
            }
          case 118: break;
          case 49: 
            { yybegin(NCOMMENT);
    commentDepth = 0;
    commentStart = getTokenStart();
            }
          case 119: break;
          case 50: 
            { return HS_PRAGMA_START;
            }
          case 120: break;
          case 51: 
            { return HS_DATA;
            }
          case 121: break;
          case 52: 
            { return HS_ELSE;
            }
          case 122: break;
          case 53: 
            { return HS_CASE;
            }
          case 123: break;
          case 54: 
            { return HS_TYPE;
            }
          case 124: break;
          case 55: 
            { return HS_THEN;
            }
          case 125: break;
          case 56: 
            { return HS_INFIX;
            }
          case 126: break;
          case 57: 
            { return HS_CLASS;
            }
          case 127: break;
          case 58: 
            { return HS_WHERE;
            }
          case 128: break;
          case 59: 
            { return HS_INFIXL;
            }
          case 129: break;
          case 60: 
            { return HS_INFIXR;
            }
          case 130: break;
          case 61: 
            { return HS_IMPORT;
            }
          case 131: break;
          case 62: 
            { return HS_MODULE;
            }
          case 132: break;
          case 63: 
            { return HS_DEFAULT;
            }
          case 133: break;
          case 64: 
            { return HS_NEWTYPE;
            }
          case 134: break;
          case 65: 
            { return HS_INSTANCE;
            }
          case 135: break;
          case 66: 
            { return HS_DERIVING;
            }
          case 136: break;
          case 67: 
            { return HS_TYPE_FAMILY;
            }
          case 137: break;
          case 68: 
            { return HS_TYPE_INSTANCE;
            }
          case 138: break;
          case 69: 
            { return HS_FOREIGN_IMPORT;
            }
          case 139: break;
          case 70: 
            { return HS_FOREIGN_EXPORT;
            }
          case 140: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
