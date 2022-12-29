// Generated from java-escape by ANTLR 4.11.1

package listeners;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DartmouthBASICParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, STRING=5, REM_TEXT=6, COMMA=7, SEMI_COLON=8, 
		PRINT=9, L_PAREN=10, R_PAREN=11, EQUALS=12, DEF=13, LET=14, FOR=15, VAR=16, 
		DIGITS=17, DIGIT=18, END=19, STOP=20, GOTO=21, GOSUB=22, RETURN=23, EOL=24, 
		DIM=25, READ=26, DATA=27, IF=28, THEN=29, TO=30, STEP=31, NEXT=32, INPUT=33, 
		MULT=34, DIVIDE=35, ADD=36, SUBTRACT=37, FUNCTION_NAME=38, WS=39;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_statement = 2, RULE_expressionStatement = 3, 
		RULE_inputStatement = 4, RULE_forStatement = 5, RULE_loopBody = 6, RULE_loopTerminator = 7, 
		RULE_conditionalStatement = 8, RULE_dataStatement = 9, RULE_constantList = 10, 
		RULE_readStatement = 11, RULE_idList = 12, RULE_assignmentStatement = 13, 
		RULE_functionStatement = 14, RULE_printStatement = 15, RULE_printList = 16, 
		RULE_gotoStatement = 17, RULE_gosubStatement = 18, RULE_returnStatement = 19, 
		RULE_dimStatement = 20, RULE_remStatement = 21, RULE_endStatement = 22, 
		RULE_delimiter = 23, RULE_expression = 24, RULE_comparator = 25, RULE_number = 26, 
		RULE_varName = 27, RULE_integer = 28, RULE_real = 29, RULE_constant = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "statement", "expressionStatement", "inputStatement", 
			"forStatement", "loopBody", "loopTerminator", "conditionalStatement", 
			"dataStatement", "constantList", "readStatement", "idList", "assignmentStatement", 
			"functionStatement", "printStatement", "printList", "gotoStatement", 
			"gosubStatement", "returnStatement", "dimStatement", "remStatement", 
			"endStatement", "delimiter", "expression", "comparator", "number", "varName", 
			"integer", "real", "constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'^'", "'<'", "'>'", "'.'", null, null, "','", "';'", "'PRINT'", 
			"'('", "')'", "'='", "'DEF'", "'LET'", "'FOR'", null, null, null, "'END'", 
			"'STOP'", "'GOTO'", "'GOSUB'", "'RETURN'", null, "'DIM'", "'READ'", "'DATA'", 
			"'IF'", "'THEN'", "'TO'", "'STEP'", "'NEXT'", "'INPUT'", "'*'", "'/'", 
			"'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "STRING", "REM_TEXT", "COMMA", "SEMI_COLON", 
			"PRINT", "L_PAREN", "R_PAREN", "EQUALS", "DEF", "LET", "FOR", "VAR", 
			"DIGITS", "DIGIT", "END", "STOP", "GOTO", "GOSUB", "RETURN", "EOL", "DIM", 
			"READ", "DATA", "IF", "THEN", "TO", "STEP", "NEXT", "INPUT", "MULT", 
			"DIVIDE", "ADD", "SUBTRACT", "FUNCTION_NAME", "WS"
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

	public DartmouthBASICParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DartmouthBASICParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 196624L) != 0) {
				{
				{
				setState(62);
				line();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(EOF);
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
	public static class LineContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode EOL() { return getToken(DartmouthBASICParser.EOL, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			number();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 421426620016L) != 0) {
				{
				setState(71);
				statement();
				}
			}

			setState(74);
			match(EOL);
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
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public FunctionStatementContext functionStatement() {
			return getRuleContext(FunctionStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public GosubStatementContext gosubStatement() {
			return getRuleContext(GosubStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public DimStatementContext dimStatement() {
			return getRuleContext(DimStatementContext.class,0);
		}
		public RemStatementContext remStatement() {
			return getRuleContext(RemStatementContext.class,0);
		}
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public DataStatementContext dataStatement() {
			return getRuleContext(DataStatementContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public EndStatementContext endStatement() {
			return getRuleContext(EndStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				functionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				printStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				gotoStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				gosubStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				returnStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				dimStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(83);
				remStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(84);
				readStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(85);
				dataStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(86);
				conditionalStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(87);
				forStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(88);
				inputStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(89);
				expressionStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(90);
				endStatement();
				}
				break;
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			expression(0);
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
	public static class InputStatementContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(DartmouthBASICParser.INPUT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitInputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitInputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_inputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(INPUT);
			setState(96);
			expression(0);
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
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DartmouthBASICParser.FOR, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(DartmouthBASICParser.EQUALS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(DartmouthBASICParser.TO, 0); }
		public TerminalNode EOL() { return getToken(DartmouthBASICParser.EOL, 0); }
		public LoopBodyContext loopBody() {
			return getRuleContext(LoopBodyContext.class,0);
		}
		public TerminalNode STEP() { return getToken(DartmouthBASICParser.STEP, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(FOR);
			setState(99);
			varName();
			setState(100);
			match(EQUALS);
			setState(101);
			expression(0);
			setState(102);
			match(TO);
			setState(103);
			expression(0);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(104);
				match(STEP);
				setState(105);
				expression(0);
				}
			}

			setState(108);
			match(EOL);
			setState(109);
			loopBody();
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
	public static class LoopBodyContext extends ParserRuleContext {
		public LoopTerminatorContext loopTerminator() {
			return getRuleContext(LoopTerminatorContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public LoopBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterLoopBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitLoopBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitLoopBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBodyContext loopBody() throws RecognitionException {
		LoopBodyContext _localctx = new LoopBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_loopBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					line();
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(117);
			loopTerminator();
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
	public static class LoopTerminatorContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(DartmouthBASICParser.NEXT, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public LoopTerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopTerminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterLoopTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitLoopTerminator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitLoopTerminator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopTerminatorContext loopTerminator() throws RecognitionException {
		LoopTerminatorContext _localctx = new LoopTerminatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loopTerminator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			number();
			setState(120);
			match(NEXT);
			setState(121);
			idList();
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
	public static class ConditionalStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(DartmouthBASICParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(DartmouthBASICParser.THEN, 0); }
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditionalStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IF);
			setState(124);
			expression(0);
			setState(125);
			match(THEN);
			setState(126);
			expression(0);
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
	public static class DataStatementContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(DartmouthBASICParser.DATA, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public DataStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterDataStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitDataStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitDataStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataStatementContext dataStatement() throws RecognitionException {
		DataStatementContext _localctx = new DataStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dataStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(DATA);
			setState(129);
			constantList();
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
	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartmouthBASICParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartmouthBASICParser.COMMA, i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			constant();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(132);
				match(COMMA);
				setState(133);
				constant();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ReadStatementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(DartmouthBASICParser.READ, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public ReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterReadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitReadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitReadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_readStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(READ);
			setState(140);
			idList();
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
	public static class IdListContext extends ParserRuleContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartmouthBASICParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartmouthBASICParser.COMMA, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			varName();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(143);
				match(COMMA);
				setState(144);
				varName();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class AssignmentStatementContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(DartmouthBASICParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LET() { return getToken(DartmouthBASICParser.LET, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(150);
				match(LET);
				}
			}

			setState(153);
			varName();
			setState(154);
			match(EQUALS);
			setState(155);
			expression(0);
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
	public static class FunctionStatementContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(DartmouthBASICParser.DEF, 0); }
		public TerminalNode FUNCTION_NAME() { return getToken(DartmouthBASICParser.FUNCTION_NAME, 0); }
		public TerminalNode L_PAREN() { return getToken(DartmouthBASICParser.L_PAREN, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(DartmouthBASICParser.R_PAREN, 0); }
		public TerminalNode EQUALS() { return getToken(DartmouthBASICParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(DEF);
			setState(158);
			match(FUNCTION_NAME);
			setState(159);
			match(L_PAREN);
			setState(160);
			varName();
			setState(161);
			match(R_PAREN);
			setState(162);
			match(EQUALS);
			setState(163);
			expression(0);
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
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(DartmouthBASICParser.PRINT, 0); }
		public PrintListContext printList() {
			return getRuleContext(PrintListContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(DartmouthBASICParser.SEMI_COLON, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(PRINT);
			setState(166);
			printList();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(167);
				match(SEMI_COLON);
				}
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
	public static class PrintListContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DelimiterContext delimiter() {
			return getRuleContext(DelimiterContext.class,0);
		}
		public PrintListContext printList() {
			return getRuleContext(PrintListContext.class,0);
		}
		public PrintListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterPrintList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitPrintList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitPrintList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintListContext printList() throws RecognitionException {
		PrintListContext _localctx = new PrintListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_printList);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				expression(0);
				setState(171);
				delimiter();
				setState(172);
				printList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				expression(0);
				}
				break;
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
	public static class GotoStatementContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(DartmouthBASICParser.GOTO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(GOTO);
			setState(178);
			expression(0);
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
	public static class GosubStatementContext extends ParserRuleContext {
		public TerminalNode GOSUB() { return getToken(DartmouthBASICParser.GOSUB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GosubStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gosubStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterGosubStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitGosubStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitGosubStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GosubStatementContext gosubStatement() throws RecognitionException {
		GosubStatementContext _localctx = new GosubStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_gosubStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(GOSUB);
			setState(181);
			expression(0);
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(DartmouthBASICParser.RETURN, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(RETURN);
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
	public static class DimStatementContext extends ParserRuleContext {
		public TerminalNode DIM() { return getToken(DartmouthBASICParser.DIM, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(DartmouthBASICParser.EQUALS, 0); }
		public TerminalNode L_PAREN() { return getToken(DartmouthBASICParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(DartmouthBASICParser.R_PAREN, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public DimStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterDimStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitDimStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitDimStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimStatementContext dimStatement() throws RecognitionException {
		DimStatementContext _localctx = new DimStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dimStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(DIM);
			setState(186);
			varName();
			setState(187);
			match(EQUALS);
			setState(188);
			match(L_PAREN);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 196624L) != 0) {
				{
				{
				setState(189);
				number();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(R_PAREN);
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
	public static class RemStatementContext extends ParserRuleContext {
		public TerminalNode REM_TEXT() { return getToken(DartmouthBASICParser.REM_TEXT, 0); }
		public RemStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterRemStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitRemStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitRemStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemStatementContext remStatement() throws RecognitionException {
		RemStatementContext _localctx = new RemStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_remStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(REM_TEXT);
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
	public static class EndStatementContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(DartmouthBASICParser.END, 0); }
		public TerminalNode STOP() { return getToken(DartmouthBASICParser.STOP, 0); }
		public EndStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterEndStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitEndStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitEndStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndStatementContext endStatement() throws RecognitionException {
		EndStatementContext _localctx = new EndStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_endStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==END || _la==STOP) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class DelimiterContext extends ParserRuleContext {
		public TerminalNode SEMI_COLON() { return getToken(DartmouthBASICParser.SEMI_COLON, 0); }
		public TerminalNode COMMA() { return getToken(DartmouthBASICParser.COMMA, 0); }
		public DelimiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimiter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterDelimiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitDelimiter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitDelimiter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelimiterContext delimiter() throws RecognitionException {
		DelimiterContext _localctx = new DelimiterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_delimiter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !(_la==COMMA || _la==SEMI_COLON) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends ExpressionContext {
		public TerminalNode L_PAREN() { return getToken(DartmouthBASICParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(DartmouthBASICParser.R_PAREN, 0); }
		public ParenthesizedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExponentionalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExponentionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterExponentionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitExponentionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitExponentionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(DartmouthBASICParser.ADD, 0); }
		public TerminalNode SUBTRACT() { return getToken(DartmouthBASICParser.SUBTRACT, 0); }
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(DartmouthBASICParser.STRING, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceExpressionContext extends ExpressionContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ReferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitReferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ExpressionContext {
		public TerminalNode SUBTRACT() { return getToken(DartmouthBASICParser.SUBTRACT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(DartmouthBASICParser.MULT, 0); }
		public TerminalNode DIVIDE() { return getToken(DartmouthBASICParser.DIVIDE, 0); }
		public MultiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentExpressionContext extends ExpressionContext {
		public TerminalNode FUNCTION_NAME() { return getToken(DartmouthBASICParser.FUNCTION_NAME, 0); }
		public TerminalNode L_PAREN() { return getToken(DartmouthBASICParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(DartmouthBASICParser.R_PAREN, 0); }
		public ArgumentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterArgumentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitArgumentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitArgumentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(204);
				varName();
				}
				break;
			case 2:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(205);
					match(STRING);
					}
					break;
				case T__3:
				case VAR:
				case DIGITS:
					{
					setState(206);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(L_PAREN);
				setState(210);
				expression(0);
				setState(211);
				match(R_PAREN);
				}
				break;
			case 4:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				match(SUBTRACT);
				setState(214);
				expression(6);
				}
				break;
			case 5:
				{
				_localctx = new ArgumentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(FUNCTION_NAME);
				setState(216);
				match(L_PAREN);
				setState(217);
				expression(0);
				setState(218);
				match(R_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(235);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExponentionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(223);
						match(T__0);
						setState(224);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(226);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIVIDE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(229);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUBTRACT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(231);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(232);
						comparator();
						setState(233);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(DartmouthBASICParser.EQUALS, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comparator);
		int _la;
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(240);
				match(T__1);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==EQUALS) {
					{
					setState(241);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==EQUALS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(244);
				match(T__2);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==EQUALS) {
					{
					setState(245);
					_la = _input.LA(1);
					if ( !(_la==T__1 || _la==EQUALS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				}
				break;
			case EQUALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				match(EQUALS);
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
	public static class NumberContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_number);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				varName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				real();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				integer();
				}
				break;
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
	public static class VarNameContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(DartmouthBASICParser.VAR, 0); }
		public TerminalNode DIGIT() { return getToken(DartmouthBASICParser.DIGIT, 0); }
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitVarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitVarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(VAR);
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(257);
				match(DIGIT);
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
	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(DartmouthBASICParser.DIGITS, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(DIGITS);
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
	public static class RealContext extends ParserRuleContext {
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_real);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITS:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				integer();
				setState(263);
				match(T__3);
				setState(264);
				integer();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(T__3);
				setState(267);
				integer();
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
	public static class ConstantContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode STRING() { return getToken(DartmouthBASICParser.STRING, 0); }
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartmouthBASICListener ) ((DartmouthBASICListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartmouthBASICVisitor ) return ((DartmouthBASICVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constant);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				real();
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u0114\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0005\u0000@\b\u0000\n\u0000\f\u0000C\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001I\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\\\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005k\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0005\u0006q\b\u0006\n\u0006\f\u0006t\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u0087\b\n\n\n\f\n\u008a\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u0092\b\f\n\f\f\f\u0095\t\f\u0001\r\u0003"+
		"\r\u0098\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00a9\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b0\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u00bf\b\u0014\n\u0014\f\u0014\u00c2\t\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u00d0\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u00dd\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u00ec\b\u0018\n\u0018"+
		"\f\u0018\u00ef\t\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u00f3\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u00f7\b\u0019\u0001\u0019\u0003\u0019"+
		"\u00fa\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u00ff\b"+
		"\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0103\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u010d\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u0112\b\u001e\u0001\u001e\u0000\u00010\u001f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<\u0000\u0006\u0001\u0000\u0013\u0014\u0001\u0000\u0007\b"+
		"\u0001\u0000\"#\u0001\u0000$%\u0002\u0000\u0003\u0003\f\f\u0002\u0000"+
		"\u0002\u0002\f\f\u011f\u0000A\u0001\u0000\u0000\u0000\u0002F\u0001\u0000"+
		"\u0000\u0000\u0004[\u0001\u0000\u0000\u0000\u0006]\u0001\u0000\u0000\u0000"+
		"\b_\u0001\u0000\u0000\u0000\nb\u0001\u0000\u0000\u0000\fr\u0001\u0000"+
		"\u0000\u0000\u000ew\u0001\u0000\u0000\u0000\u0010{\u0001\u0000\u0000\u0000"+
		"\u0012\u0080\u0001\u0000\u0000\u0000\u0014\u0083\u0001\u0000\u0000\u0000"+
		"\u0016\u008b\u0001\u0000\u0000\u0000\u0018\u008e\u0001\u0000\u0000\u0000"+
		"\u001a\u0097\u0001\u0000\u0000\u0000\u001c\u009d\u0001\u0000\u0000\u0000"+
		"\u001e\u00a5\u0001\u0000\u0000\u0000 \u00af\u0001\u0000\u0000\u0000\""+
		"\u00b1\u0001\u0000\u0000\u0000$\u00b4\u0001\u0000\u0000\u0000&\u00b7\u0001"+
		"\u0000\u0000\u0000(\u00b9\u0001\u0000\u0000\u0000*\u00c5\u0001\u0000\u0000"+
		"\u0000,\u00c7\u0001\u0000\u0000\u0000.\u00c9\u0001\u0000\u0000\u00000"+
		"\u00dc\u0001\u0000\u0000\u00002\u00f9\u0001\u0000\u0000\u00004\u00fe\u0001"+
		"\u0000\u0000\u00006\u0100\u0001\u0000\u0000\u00008\u0104\u0001\u0000\u0000"+
		"\u0000:\u010c\u0001\u0000\u0000\u0000<\u0111\u0001\u0000\u0000\u0000>"+
		"@\u0003\u0002\u0001\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0005\u0000\u0000\u0001E\u0001"+
		"\u0001\u0000\u0000\u0000FH\u00034\u001a\u0000GI\u0003\u0004\u0002\u0000"+
		"HG\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000JK\u0005\u0018\u0000\u0000K\u0003\u0001\u0000\u0000\u0000L\\\u0003"+
		"\u001a\r\u0000M\\\u0003\u001c\u000e\u0000N\\\u0003\u001e\u000f\u0000O"+
		"\\\u0003\"\u0011\u0000P\\\u0003$\u0012\u0000Q\\\u0003&\u0013\u0000R\\"+
		"\u0003(\u0014\u0000S\\\u0003*\u0015\u0000T\\\u0003\u0016\u000b\u0000U"+
		"\\\u0003\u0012\t\u0000V\\\u0003\u0010\b\u0000W\\\u0003\n\u0005\u0000X"+
		"\\\u0003\b\u0004\u0000Y\\\u0003\u0006\u0003\u0000Z\\\u0003,\u0016\u0000"+
		"[L\u0001\u0000\u0000\u0000[M\u0001\u0000\u0000\u0000[N\u0001\u0000\u0000"+
		"\u0000[O\u0001\u0000\u0000\u0000[P\u0001\u0000\u0000\u0000[Q\u0001\u0000"+
		"\u0000\u0000[R\u0001\u0000\u0000\u0000[S\u0001\u0000\u0000\u0000[T\u0001"+
		"\u0000\u0000\u0000[U\u0001\u0000\u0000\u0000[V\u0001\u0000\u0000\u0000"+
		"[W\u0001\u0000\u0000\u0000[X\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000[Z\u0001\u0000\u0000\u0000\\\u0005\u0001\u0000\u0000\u0000]^\u0003"+
		"0\u0018\u0000^\u0007\u0001\u0000\u0000\u0000_`\u0005!\u0000\u0000`a\u0003"+
		"0\u0018\u0000a\t\u0001\u0000\u0000\u0000bc\u0005\u000f\u0000\u0000cd\u0003"+
		"6\u001b\u0000de\u0005\f\u0000\u0000ef\u00030\u0018\u0000fg\u0005\u001e"+
		"\u0000\u0000gj\u00030\u0018\u0000hi\u0005\u001f\u0000\u0000ik\u00030\u0018"+
		"\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lm\u0005\u0018\u0000\u0000mn\u0003\f\u0006\u0000n\u000b\u0001"+
		"\u0000\u0000\u0000oq\u0003\u0002\u0001\u0000po\u0001\u0000\u0000\u0000"+
		"qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0003\u000e"+
		"\u0007\u0000v\r\u0001\u0000\u0000\u0000wx\u00034\u001a\u0000xy\u0005 "+
		"\u0000\u0000yz\u0003\u0018\f\u0000z\u000f\u0001\u0000\u0000\u0000{|\u0005"+
		"\u001c\u0000\u0000|}\u00030\u0018\u0000}~\u0005\u001d\u0000\u0000~\u007f"+
		"\u00030\u0018\u0000\u007f\u0011\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"\u001b\u0000\u0000\u0081\u0082\u0003\u0014\n\u0000\u0082\u0013\u0001\u0000"+
		"\u0000\u0000\u0083\u0088\u0003<\u001e\u0000\u0084\u0085\u0005\u0007\u0000"+
		"\u0000\u0085\u0087\u0003<\u001e\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0015\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u001a\u0000\u0000"+
		"\u008c\u008d\u0003\u0018\f\u0000\u008d\u0017\u0001\u0000\u0000\u0000\u008e"+
		"\u0093\u00036\u001b\u0000\u008f\u0090\u0005\u0007\u0000\u0000\u0090\u0092"+
		"\u00036\u001b\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0095\u0001"+
		"\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0019\u0001\u0000\u0000\u0000\u0095\u0093\u0001"+
		"\u0000\u0000\u0000\u0096\u0098\u0005\u000e\u0000\u0000\u0097\u0096\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u00036\u001b\u0000\u009a\u009b\u0005\f"+
		"\u0000\u0000\u009b\u009c\u00030\u0018\u0000\u009c\u001b\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005\r\u0000\u0000\u009e\u009f\u0005&\u0000\u0000"+
		"\u009f\u00a0\u0005\n\u0000\u0000\u00a0\u00a1\u00036\u001b\u0000\u00a1"+
		"\u00a2\u0005\u000b\u0000\u0000\u00a2\u00a3\u0005\f\u0000\u0000\u00a3\u00a4"+
		"\u00030\u0018\u0000\u00a4\u001d\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005"+
		"\t\u0000\u0000\u00a6\u00a8\u0003 \u0010\u0000\u00a7\u00a9\u0005\b\u0000"+
		"\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u001f\u0001\u0000\u0000\u0000\u00aa\u00ab\u00030\u0018\u0000"+
		"\u00ab\u00ac\u0003.\u0017\u0000\u00ac\u00ad\u0003 \u0010\u0000\u00ad\u00b0"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b0\u00030\u0018\u0000\u00af\u00aa\u0001"+
		"\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0!\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0005\u0015\u0000\u0000\u00b2\u00b3\u00030\u0018"+
		"\u0000\u00b3#\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0016\u0000\u0000"+
		"\u00b5\u00b6\u00030\u0018\u0000\u00b6%\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0005\u0017\u0000\u0000\u00b8\'\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005"+
		"\u0019\u0000\u0000\u00ba\u00bb\u00036\u001b\u0000\u00bb\u00bc\u0005\f"+
		"\u0000\u0000\u00bc\u00c0\u0005\n\u0000\u0000\u00bd\u00bf\u00034\u001a"+
		"\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005\u000b\u0000\u0000\u00c4)\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0005\u0006\u0000\u0000\u00c6+\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0007\u0000\u0000\u0000\u00c8-\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0007\u0001\u0000\u0000\u00ca/\u0001\u0000\u0000\u0000\u00cb\u00cc\u0006"+
		"\u0018\uffff\uffff\u0000\u00cc\u00dd\u00036\u001b\u0000\u00cd\u00d0\u0005"+
		"\u0005\u0000\u0000\u00ce\u00d0\u00034\u001a\u0000\u00cf\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00dd\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0005\n\u0000\u0000\u00d2\u00d3\u00030\u0018"+
		"\u0000\u00d3\u00d4\u0005\u000b\u0000\u0000\u00d4\u00dd\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0005%\u0000\u0000\u00d6\u00dd\u00030\u0018\u0006\u00d7"+
		"\u00d8\u0005&\u0000\u0000\u00d8\u00d9\u0005\n\u0000\u0000\u00d9\u00da"+
		"\u00030\u0018\u0000\u00da\u00db\u0005\u000b\u0000\u0000\u00db\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dc\u00cb\u0001\u0000\u0000\u0000\u00dc\u00cf\u0001"+
		"\u0000\u0000\u0000\u00dc\u00d1\u0001\u0000\u0000\u0000\u00dc\u00d5\u0001"+
		"\u0000\u0000\u0000\u00dc\u00d7\u0001\u0000\u0000\u0000\u00dd\u00ed\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\n\u0005\u0000\u0000\u00df\u00e0\u0005\u0001"+
		"\u0000\u0000\u00e0\u00ec\u00030\u0018\u0006\u00e1\u00e2\n\u0004\u0000"+
		"\u0000\u00e2\u00e3\u0007\u0002\u0000\u0000\u00e3\u00ec\u00030\u0018\u0005"+
		"\u00e4\u00e5\n\u0003\u0000\u0000\u00e5\u00e6\u0007\u0003\u0000\u0000\u00e6"+
		"\u00ec\u00030\u0018\u0004\u00e7\u00e8\n\u0001\u0000\u0000\u00e8\u00e9"+
		"\u00032\u0019\u0000\u00e9\u00ea\u00030\u0018\u0002\u00ea\u00ec\u0001\u0000"+
		"\u0000\u0000\u00eb\u00de\u0001\u0000\u0000\u0000\u00eb\u00e1\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e4\u0001\u0000\u0000\u0000\u00eb\u00e7\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee1\u0001\u0000\u0000"+
		"\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f2\u0005\u0002\u0000"+
		"\u0000\u00f1\u00f3\u0007\u0004\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f6\u0005\u0003\u0000\u0000\u00f5\u00f7\u0007\u0005\u0000"+
		"\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00fa\u0005\f\u0000\u0000"+
		"\u00f9\u00f0\u0001\u0000\u0000\u0000\u00f9\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa3\u0001\u0000\u0000\u0000\u00fb"+
		"\u00ff\u00036\u001b\u0000\u00fc\u00ff\u0003:\u001d\u0000\u00fd\u00ff\u0003"+
		"8\u001c\u0000\u00fe\u00fb\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff5\u0001\u0000\u0000"+
		"\u0000\u0100\u0102\u0005\u0010\u0000\u0000\u0101\u0103\u0005\u0012\u0000"+
		"\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000"+
		"\u0000\u01037\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0011\u0000\u0000"+
		"\u01059\u0001\u0000\u0000\u0000\u0106\u0107\u00038\u001c\u0000\u0107\u0108"+
		"\u0005\u0004\u0000\u0000\u0108\u0109\u00038\u001c\u0000\u0109\u010d\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0005\u0004\u0000\u0000\u010b\u010d\u0003"+
		"8\u001c\u0000\u010c\u0106\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000"+
		"\u0000\u0000\u010d;\u0001\u0000\u0000\u0000\u010e\u0112\u00038\u001c\u0000"+
		"\u010f\u0112\u0005\u0005\u0000\u0000\u0110\u0112\u0003:\u001d\u0000\u0111"+
		"\u010e\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111"+
		"\u0110\u0001\u0000\u0000\u0000\u0112=\u0001\u0000\u0000\u0000\u0016AH"+
		"[jr\u0088\u0093\u0097\u00a8\u00af\u00c0\u00cf\u00dc\u00eb\u00ed\u00f2"+
		"\u00f6\u00f9\u00fe\u0102\u010c\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}