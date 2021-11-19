// Generated from antlr4-grammar-sql-comments/src/main/antlr4/CommentsGrammar.g4 by ANTLR 4.9.3
package org.antlr.sql.dialects.comments;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommentsGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, LINE_COMMENT=3, DOUBLE_QUOTE_ID=4, SINGLE_QUOTE=5, SQUARE_BRACKET_ID=6, 
		LOCAL_ID=7, DECIMAL=8, ID=9, STRING=10, BINARY=11, FLOAT=12, REAL=13, 
		EQUAL=14, GREATER=15, LESS=16, EXCLAMATION=17, PLUS_ASSIGN=18, MINUS_ASSIGN=19, 
		MULT_ASSIGN=20, DIV_ASSIGN=21, MOD_ASSIGN=22, AND_ASSIGN=23, XOR_ASSIGN=24, 
		OR_ASSIGN=25, DOUBLE_BAR=26, DOT=27, UNDERLINE=28, AT=29, SHARP=30, DOLLAR=31, 
		LR_BRACKET=32, RR_BRACKET=33, COMMA=34, SEMI=35, COLON=36, DOUBLE_COLON=37, 
		STAR=38, DIVIDE=39, MODULE=40, PLUS=41, MINUS=42, BIT_NOT=43, BIT_OR=44, 
		BIT_AND=45, BIT_XOR=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMMENT", "LINE_COMMENT", "DOUBLE_QUOTE_ID", "SINGLE_QUOTE", "SQUARE_BRACKET_ID", 
			"LOCAL_ID", "DECIMAL", "ID", "STRING", "BINARY", "FLOAT", "REAL", "EQUAL", 
			"GREATER", "LESS", "EXCLAMATION", "PLUS_ASSIGN", "MINUS_ASSIGN", "MULT_ASSIGN", 
			"DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", "XOR_ASSIGN", "OR_ASSIGN", 
			"DOUBLE_BAR", "DOT", "UNDERLINE", "AT", "SHARP", "DOLLAR", "LR_BRACKET", 
			"RR_BRACKET", "COMMA", "SEMI", "COLON", "DOUBLE_COLON", "STAR", "DIVIDE", 
			"MODULE", "PLUS", "MINUS", "BIT_NOT", "BIT_OR", "BIT_AND", "BIT_XOR", 
			"LETTER", "DEC_DOT_DEC", "HEX_DIGIT", "DEC_DIGIT", "FullWidthLetter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'''", null, null, null, null, null, null, 
			null, null, "'='", "'>'", "'<'", "'!'", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'&='", "'^='", "'|='", "'||'", "'.'", "'_'", "'@'", "'#'", "'$'", 
			"'('", "')'", "','", "';'", "':'", "'::'", "'*'", "'/'", "'%'", "'+'", 
			"'-'", "'~'", "'|'", "'&'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "LINE_COMMENT", "DOUBLE_QUOTE_ID", "SINGLE_QUOTE", 
			"SQUARE_BRACKET_ID", "LOCAL_ID", "DECIMAL", "ID", "STRING", "BINARY", 
			"FLOAT", "REAL", "EQUAL", "GREATER", "LESS", "EXCLAMATION", "PLUS_ASSIGN", 
			"MINUS_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", 
			"XOR_ASSIGN", "OR_ASSIGN", "DOUBLE_BAR", "DOT", "UNDERLINE", "AT", "SHARP", 
			"DOLLAR", "LR_BRACKET", "RR_BRACKET", "COMMA", "SEMI", "COLON", "DOUBLE_COLON", 
			"STAR", "DIVIDE", "MODULE", "PLUS", "MINUS", "BIT_NOT", "BIT_OR", "BIT_AND", 
			"BIT_XOR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CommentsGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CommentsGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0149\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\6\2k\n\2\r\2\16\2l\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3v\n\3\f\3"+
		"\16\3y\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u0082\n\4\3\4\7\4\u0085\n"+
		"\4\f\4\16\4\u0088\13\4\3\5\3\5\6\5\u008c\n\5\r\5\16\5\u008d\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\7\7\u0098\n\7\f\7\16\7\u009b\13\7\3\7\3\7\3\b\3"+
		"\b\3\b\7\b\u00a2\n\b\f\b\16\b\u00a5\13\b\3\t\6\t\u00a8\n\t\r\t\16\t\u00a9"+
		"\3\n\3\n\5\n\u00ae\n\n\3\n\3\n\7\n\u00b2\n\n\f\n\16\n\u00b5\13\n\3\13"+
		"\5\13\u00b8\n\13\3\13\3\13\3\13\3\13\7\13\u00be\n\13\f\13\16\13\u00c1"+
		"\13\13\3\13\3\13\3\f\3\f\3\f\7\f\u00c8\n\f\f\f\16\f\u00cb\13\f\3\r\3\r"+
		"\3\16\3\16\5\16\u00d1\n\16\3\16\3\16\5\16\u00d5\n\16\3\16\6\16\u00d8\n"+
		"\16\r\16\16\16\u00d9\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\6\61\u012b\n\61\r\61\16\61\u012c\3\61\3\61\6\61\u0131\n\61\r\61"+
		"\16\61\u0132\3\61\6\61\u0136\n\61\r\61\16\61\u0137\3\61\3\61\3\61\3\61"+
		"\6\61\u013e\n\61\r\61\16\61\u013f\5\61\u0142\n\61\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3w\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2a\2c\2e\2"+
		"g\2\3\2\16\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2$$\3\2__\6\2%&\62;B\\a"+
		"a\5\2%%C\\aa\3\2))\4\2--//\4\2C\\aa\4\2\62;CH\3\2\62;\f\2\u00c2\u00d8"+
		"\u00da\u00f8\u00fa\u2001\u2c02\u3001\u3042\u3191\u3302\u3381\u3402\u4001"+
		"\u4e02\ud801\uf902\ufb01\uff02\ufff2\2\u015e\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3j\3\2\2\2\5p\3\2\2\2\7\u0081\3\2\2\2\t\u0089"+
		"\3\2\2\2\13\u0091\3\2\2\2\r\u0093\3\2\2\2\17\u009e\3\2\2\2\21\u00a7\3"+
		"\2\2\2\23\u00ad\3\2\2\2\25\u00b7\3\2\2\2\27\u00c4\3\2\2\2\31\u00cc\3\2"+
		"\2\2\33\u00d0\3\2\2\2\35\u00db\3\2\2\2\37\u00dd\3\2\2\2!\u00df\3\2\2\2"+
		"#\u00e1\3\2\2\2%\u00e3\3\2\2\2\'\u00e6\3\2\2\2)\u00e9\3\2\2\2+\u00ec\3"+
		"\2\2\2-\u00ef\3\2\2\2/\u00f2\3\2\2\2\61\u00f5\3\2\2\2\63\u00f8\3\2\2\2"+
		"\65\u00fb\3\2\2\2\67\u00fe\3\2\2\29\u0100\3\2\2\2;\u0102\3\2\2\2=\u0104"+
		"\3\2\2\2?\u0106\3\2\2\2A\u0108\3\2\2\2C\u010a\3\2\2\2E\u010c\3\2\2\2G"+
		"\u010e\3\2\2\2I\u0110\3\2\2\2K\u0112\3\2\2\2M\u0115\3\2\2\2O\u0117\3\2"+
		"\2\2Q\u0119\3\2\2\2S\u011b\3\2\2\2U\u011d\3\2\2\2W\u011f\3\2\2\2Y\u0121"+
		"\3\2\2\2[\u0123\3\2\2\2]\u0125\3\2\2\2_\u0127\3\2\2\2a\u0141\3\2\2\2c"+
		"\u0143\3\2\2\2e\u0145\3\2\2\2g\u0147\3\2\2\2ik\t\2\2\2ji\3\2\2\2kl\3\2"+
		"\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\b\2\2\2o\4\3\2\2\2pq\7\61\2\2qr\7"+
		",\2\2rw\3\2\2\2sv\5\5\3\2tv\13\2\2\2us\3\2\2\2ut\3\2\2\2vy\3\2\2\2wx\3"+
		"\2\2\2wu\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7,\2\2{|\7\61\2\2|\6\3\2\2\2}~"+
		"\7/\2\2~\u0082\7/\2\2\177\u0080\7\61\2\2\u0080\u0082\7\61\2\2\u0081}\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0082\u0086\3\2\2\2\u0083\u0085\n\3\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\b\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\7$\2\2\u008a\u008c"+
		"\n\4\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7$\2\2\u0090\n\3\2\2\2"+
		"\u0091\u0092\7)\2\2\u0092\f\3\2\2\2\u0093\u0099\7]\2\2\u0094\u0098\n\5"+
		"\2\2\u0095\u0096\7_\2\2\u0096\u0098\7_\2\2\u0097\u0094\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7_\2\2\u009d\16\3\2\2\2"+
		"\u009e\u00a3\7B\2\2\u009f\u00a2\t\6\2\2\u00a0\u00a2\5g\64\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\20\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\5e\63"+
		"\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\22\3\2\2\2\u00ab\u00ae\t\7\2\2\u00ac\u00ae\5g\64\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b3\3\2\2\2\u00af\u00b2\t\6"+
		"\2\2\u00b0\u00b2\5g\64\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\24\3\2\2"+
		"\2\u00b5\u00b3\3\2\2\2\u00b6\u00b8\7P\2\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bf\7)\2\2\u00ba\u00be\n\b\2\2\u00bb"+
		"\u00bc\7)\2\2\u00bc\u00be\7)\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2"+
		"\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7)\2\2\u00c3\26\3\2\2\2\u00c4"+
		"\u00c5\7\62\2\2\u00c5\u00c9\7Z\2\2\u00c6\u00c8\5c\62\2\u00c7\u00c6\3\2"+
		"\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\30\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\5a\61\2\u00cd\32\3\2\2\2\u00ce"+
		"\u00d1\5\21\t\2\u00cf\u00d1\5a\61\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\7G\2\2\u00d3\u00d5\t\t\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d8\5e"+
		"\63\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\34\3\2\2\2\u00db\u00dc\7?\2\2\u00dc\36\3\2\2\2\u00dd"+
		"\u00de\7@\2\2\u00de \3\2\2\2\u00df\u00e0\7>\2\2\u00e0\"\3\2\2\2\u00e1"+
		"\u00e2\7#\2\2\u00e2$\3\2\2\2\u00e3\u00e4\7-\2\2\u00e4\u00e5\7?\2\2\u00e5"+
		"&\3\2\2\2\u00e6\u00e7\7/\2\2\u00e7\u00e8\7?\2\2\u00e8(\3\2\2\2\u00e9\u00ea"+
		"\7,\2\2\u00ea\u00eb\7?\2\2\u00eb*\3\2\2\2\u00ec\u00ed\7\61\2\2\u00ed\u00ee"+
		"\7?\2\2\u00ee,\3\2\2\2\u00ef\u00f0\7\'\2\2\u00f0\u00f1\7?\2\2\u00f1.\3"+
		"\2\2\2\u00f2\u00f3\7(\2\2\u00f3\u00f4\7?\2\2\u00f4\60\3\2\2\2\u00f5\u00f6"+
		"\7`\2\2\u00f6\u00f7\7?\2\2\u00f7\62\3\2\2\2\u00f8\u00f9\7~\2\2\u00f9\u00fa"+
		"\7?\2\2\u00fa\64\3\2\2\2\u00fb\u00fc\7~\2\2\u00fc\u00fd\7~\2\2\u00fd\66"+
		"\3\2\2\2\u00fe\u00ff\7\60\2\2\u00ff8\3\2\2\2\u0100\u0101\7a\2\2\u0101"+
		":\3\2\2\2\u0102\u0103\7B\2\2\u0103<\3\2\2\2\u0104\u0105\7%\2\2\u0105>"+
		"\3\2\2\2\u0106\u0107\7&\2\2\u0107@\3\2\2\2\u0108\u0109\7*\2\2\u0109B\3"+
		"\2\2\2\u010a\u010b\7+\2\2\u010bD\3\2\2\2\u010c\u010d\7.\2\2\u010dF\3\2"+
		"\2\2\u010e\u010f\7=\2\2\u010fH\3\2\2\2\u0110\u0111\7<\2\2\u0111J\3\2\2"+
		"\2\u0112\u0113\7<\2\2\u0113\u0114\7<\2\2\u0114L\3\2\2\2\u0115\u0116\7"+
		",\2\2\u0116N\3\2\2\2\u0117\u0118\7\61\2\2\u0118P\3\2\2\2\u0119\u011a\7"+
		"\'\2\2\u011aR\3\2\2\2\u011b\u011c\7-\2\2\u011cT\3\2\2\2\u011d\u011e\7"+
		"/\2\2\u011eV\3\2\2\2\u011f\u0120\7\u0080\2\2\u0120X\3\2\2\2\u0121\u0122"+
		"\7~\2\2\u0122Z\3\2\2\2\u0123\u0124\7(\2\2\u0124\\\3\2\2\2\u0125\u0126"+
		"\7`\2\2\u0126^\3\2\2\2\u0127\u0128\t\n\2\2\u0128`\3\2\2\2\u0129\u012b"+
		"\5e\63\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\7\60\2\2\u012f\u0131\5"+
		"e\63\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0142\3\2\2\2\u0134\u0136\5e\63\2\u0135\u0134\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013a\7\60\2\2\u013a\u0142\3\2\2\2\u013b\u013d\7"+
		"\60\2\2\u013c\u013e\5e\63\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u012a\3\2"+
		"\2\2\u0141\u0135\3\2\2\2\u0141\u013b\3\2\2\2\u0142b\3\2\2\2\u0143\u0144"+
		"\t\13\2\2\u0144d\3\2\2\2\u0145\u0146\t\f\2\2\u0146f\3\2\2\2\u0147\u0148"+
		"\t\r\2\2\u0148h\3\2\2\2\35\2luw\u0081\u0086\u008d\u0097\u0099\u00a1\u00a3"+
		"\u00a9\u00ad\u00b1\u00b3\u00b7\u00bd\u00bf\u00c9\u00d0\u00d4\u00d9\u012c"+
		"\u0132\u0137\u013f\u0141\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}