// Generated from CommentsGrammar.g4 by ANTLR 4.9.2
package org.antlr.sql.comments;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommentsGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
	public static final int
		RULE_root = 0, RULE_statement = 1, RULE_comment = 2, RULE_multiline_comment = 3, 
		RULE_line_comment = 4, RULE_non_comment = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "statement", "comment", "multiline_comment", "line_comment", 
			"non_comment"
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

	@Override
	public String getGrammarFileName() { return "CommentsGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CommentsGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode EOF() { return getToken(CommentsGrammarParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommentsGrammarListener ) ((CommentsGrammarListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommentsGrammarListener ) ((CommentsGrammarListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				statement();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << LINE_COMMENT) | (1L << DOUBLE_QUOTE_ID) | (1L << SQUARE_BRACKET_ID) | (1L << LOCAL_ID) | (1L << DECIMAL) | (1L << ID) | (1L << STRING) | (1L << BINARY) | (1L << FLOAT) | (1L << REAL) | (1L << EQUAL) | (1L << GREATER) | (1L << LESS) | (1L << EXCLAMATION) | (1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MULT_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << AND_ASSIGN) | (1L << XOR_ASSIGN) | (1L << OR_ASSIGN) | (1L << DOUBLE_BAR) | (1L << DOT) | (1L << UNDERLINE) | (1L << AT) | (1L << SHARP) | (1L << DOLLAR) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << SEMI) | (1L << COLON) | (1L << DOUBLE_COLON) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << BIT_OR) | (1L << BIT_AND) | (1L << BIT_XOR))) != 0) );
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(17);
				match(EOF);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Non_commentContext non_comment() {
			return getRuleContext(Non_commentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommentsGrammarListener ) ((CommentsGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommentsGrammarListener ) ((CommentsGrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
			case LINE_COMMENT:
				{
				setState(20);
				comment();
				}
				break;
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case LOCAL_ID:
			case DECIMAL:
			case ID:
			case STRING:
			case BINARY:
			case FLOAT:
			case REAL:
			case EQUAL:
			case GREATER:
			case LESS:
			case EXCLAMATION:
			case PLUS_ASSIGN:
			case MINUS_ASSIGN:
			case MULT_ASSIGN:
			case DIV_ASSIGN:
			case MOD_ASSIGN:
			case AND_ASSIGN:
			case XOR_ASSIGN:
			case OR_ASSIGN:
			case DOUBLE_BAR:
			case DOT:
			case UNDERLINE:
			case AT:
			case SHARP:
			case DOLLAR:
			case LR_BRACKET:
			case RR_BRACKET:
			case COMMA:
			case SEMI:
			case COLON:
			case DOUBLE_COLON:
			case STAR:
			case DIVIDE:
			case MODULE:
			case PLUS:
			case MINUS:
			case BIT_NOT:
			case BIT_OR:
			case BIT_AND:
			case BIT_XOR:
				{
				setState(21);
				non_comment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public Multiline_commentContext multiline_comment() {
			return getRuleContext(Multiline_commentContext.class,0);
		}
		public Line_commentContext line_comment() {
			return getRuleContext(Line_commentContext.class,0);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommentsGrammarListener ) ((CommentsGrammarListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommentsGrammarListener ) ((CommentsGrammarListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comment);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				multiline_comment();
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				line_comment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiline_commentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(CommentsGrammarParser.COMMENT, 0); }
		public Multiline_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiline_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommentsGrammarListener ) ((CommentsGrammarListener)listener).enterMultiline_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommentsGrammarListener ) ((CommentsGrammarListener)listener).exitMultiline_comment(this);
		}
	}

	public final Multiline_commentContext multiline_comment() throws RecognitionException {
		Multiline_commentContext _localctx = new Multiline_commentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multiline_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Line_commentContext extends ParserRuleContext {
		public TerminalNode LINE_COMMENT() { return getToken(CommentsGrammarParser.LINE_COMMENT, 0); }
		public Line_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommentsGrammarListener ) ((CommentsGrammarListener)listener).enterLine_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommentsGrammarListener ) ((CommentsGrammarListener)listener).exitLine_comment(this);
		}
	}

	public final Line_commentContext line_comment() throws RecognitionException {
		Line_commentContext _localctx = new Line_commentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_line_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(LINE_COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_commentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CommentsGrammarParser.ID, 0); }
		public TerminalNode DOUBLE_QUOTE_ID() { return getToken(CommentsGrammarParser.DOUBLE_QUOTE_ID, 0); }
		public TerminalNode SQUARE_BRACKET_ID() { return getToken(CommentsGrammarParser.SQUARE_BRACKET_ID, 0); }
		public TerminalNode LOCAL_ID() { return getToken(CommentsGrammarParser.LOCAL_ID, 0); }
		public TerminalNode DECIMAL() { return getToken(CommentsGrammarParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(CommentsGrammarParser.STRING, 0); }
		public TerminalNode BINARY() { return getToken(CommentsGrammarParser.BINARY, 0); }
		public TerminalNode FLOAT() { return getToken(CommentsGrammarParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(CommentsGrammarParser.REAL, 0); }
		public TerminalNode EQUAL() { return getToken(CommentsGrammarParser.EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(CommentsGrammarParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(CommentsGrammarParser.LESS, 0); }
		public TerminalNode EXCLAMATION() { return getToken(CommentsGrammarParser.EXCLAMATION, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(CommentsGrammarParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(CommentsGrammarParser.MINUS_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(CommentsGrammarParser.MULT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(CommentsGrammarParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(CommentsGrammarParser.MOD_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(CommentsGrammarParser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(CommentsGrammarParser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(CommentsGrammarParser.OR_ASSIGN, 0); }
		public TerminalNode DOUBLE_BAR() { return getToken(CommentsGrammarParser.DOUBLE_BAR, 0); }
		public TerminalNode DOT() { return getToken(CommentsGrammarParser.DOT, 0); }
		public TerminalNode UNDERLINE() { return getToken(CommentsGrammarParser.UNDERLINE, 0); }
		public TerminalNode AT() { return getToken(CommentsGrammarParser.AT, 0); }
		public TerminalNode SHARP() { return getToken(CommentsGrammarParser.SHARP, 0); }
		public TerminalNode DOLLAR() { return getToken(CommentsGrammarParser.DOLLAR, 0); }
		public TerminalNode LR_BRACKET() { return getToken(CommentsGrammarParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(CommentsGrammarParser.RR_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(CommentsGrammarParser.COMMA, 0); }
		public TerminalNode SEMI() { return getToken(CommentsGrammarParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(CommentsGrammarParser.COLON, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(CommentsGrammarParser.DOUBLE_COLON, 0); }
		public TerminalNode STAR() { return getToken(CommentsGrammarParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(CommentsGrammarParser.DIVIDE, 0); }
		public TerminalNode MODULE() { return getToken(CommentsGrammarParser.MODULE, 0); }
		public TerminalNode PLUS() { return getToken(CommentsGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CommentsGrammarParser.MINUS, 0); }
		public TerminalNode BIT_NOT() { return getToken(CommentsGrammarParser.BIT_NOT, 0); }
		public TerminalNode BIT_OR() { return getToken(CommentsGrammarParser.BIT_OR, 0); }
		public TerminalNode BIT_AND() { return getToken(CommentsGrammarParser.BIT_AND, 0); }
		public TerminalNode BIT_XOR() { return getToken(CommentsGrammarParser.BIT_XOR, 0); }
		public Non_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommentsGrammarListener ) ((CommentsGrammarListener)listener).enterNon_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommentsGrammarListener ) ((CommentsGrammarListener)listener).exitNon_comment(this);
		}
	}

	public final Non_commentContext non_comment() throws RecognitionException {
		Non_commentContext _localctx = new Non_commentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_non_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_QUOTE_ID) | (1L << SQUARE_BRACKET_ID) | (1L << LOCAL_ID) | (1L << DECIMAL) | (1L << ID) | (1L << STRING) | (1L << BINARY) | (1L << FLOAT) | (1L << REAL) | (1L << EQUAL) | (1L << GREATER) | (1L << LESS) | (1L << EXCLAMATION) | (1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MULT_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << AND_ASSIGN) | (1L << XOR_ASSIGN) | (1L << OR_ASSIGN) | (1L << DOUBLE_BAR) | (1L << DOT) | (1L << UNDERLINE) | (1L << AT) | (1L << SHARP) | (1L << DOLLAR) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << SEMI) | (1L << COLON) | (1L << DOUBLE_COLON) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << BIT_NOT) | (1L << BIT_OR) | (1L << BIT_AND) | (1L << BIT_XOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60%\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\2\5\2"+
		"\25\n\2\3\3\3\3\5\3\31\n\3\3\4\3\4\5\4\35\n\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\2\2\b\2\4\6\b\n\f\2\3\4\2\6\6\b\60\2\"\2\17\3\2\2\2\4\30\3\2\2\2"+
		"\6\34\3\2\2\2\b\36\3\2\2\2\n \3\2\2\2\f\"\3\2\2\2\16\20\5\4\3\2\17\16"+
		"\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\25"+
		"\7\2\2\3\24\23\3\2\2\2\24\25\3\2\2\2\25\3\3\2\2\2\26\31\5\6\4\2\27\31"+
		"\5\f\7\2\30\26\3\2\2\2\30\27\3\2\2\2\31\5\3\2\2\2\32\35\5\b\5\2\33\35"+
		"\5\n\6\2\34\32\3\2\2\2\34\33\3\2\2\2\35\7\3\2\2\2\36\37\7\4\2\2\37\t\3"+
		"\2\2\2 !\7\5\2\2!\13\3\2\2\2\"#\t\2\2\2#\r\3\2\2\2\6\21\24\30\34";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}