// Generated from java-escape by ANTLR 4.11.1
package org.antlr.sql.dialects.comments;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CommentsGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

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
	public String getGrammarFileName() { return "java-escape"; }

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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommentsGrammarVisitor ) return ((CommentsGrammarVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
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
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 140737488355292L) != 0 );
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommentsGrammarVisitor ) return ((CommentsGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommentsGrammarVisitor ) return ((CommentsGrammarVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommentsGrammarVisitor ) return ((CommentsGrammarVisitor<? extends T>)visitor).visitMultiline_comment(this);
			else return visitor.visitChildren(this);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommentsGrammarVisitor ) return ((CommentsGrammarVisitor<? extends T>)visitor).visitLine_comment(this);
			else return visitor.visitChildren(this);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommentsGrammarVisitor ) return ((CommentsGrammarVisitor<? extends T>)visitor).visitNon_comment(this);
			else return visitor.visitChildren(this);
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
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 140737488355280L) != 0) ) {
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
		"\u0004\u0001.#\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f\u0000"+
		"\u000f\u0001\u0000\u0003\u0000\u0013\b\u0000\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u0017\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u001b\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0001"+
		"\u0002\u0000\u0004\u0004\u0006. \u0000\r\u0001\u0000\u0000\u0000\u0002"+
		"\u0016\u0001\u0000\u0000\u0000\u0004\u001a\u0001\u0000\u0000\u0000\u0006"+
		"\u001c\u0001\u0000\u0000\u0000\b\u001e\u0001\u0000\u0000\u0000\n \u0001"+
		"\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001\u0000\u0000"+
		"\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0012\u0001\u0000\u0000\u0000"+
		"\u0011\u0013\u0005\u0000\u0000\u0001\u0012\u0011\u0001\u0000\u0000\u0000"+
		"\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0001\u0001\u0000\u0000\u0000"+
		"\u0014\u0017\u0003\u0004\u0002\u0000\u0015\u0017\u0003\n\u0005\u0000\u0016"+
		"\u0014\u0001\u0000\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017"+
		"\u0003\u0001\u0000\u0000\u0000\u0018\u001b\u0003\u0006\u0003\u0000\u0019"+
		"\u001b\u0003\b\u0004\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u0019"+
		"\u0001\u0000\u0000\u0000\u001b\u0005\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0005\u0002\u0000\u0000\u001d\u0007\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0005\u0003\u0000\u0000\u001f\t\u0001\u0000\u0000\u0000 !\u0007\u0000"+
		"\u0000\u0000!\u000b\u0001\u0000\u0000\u0000\u0004\u000f\u0012\u0016\u001a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}