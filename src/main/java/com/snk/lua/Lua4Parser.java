// Generated from /Users/fripside/IdeaProjects/LuaParser/src/main/resources/Lua4.g4 by ANTLR 4.7
package com.snk.lua;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lua4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		If=1, Else=2, Elif=3, Do=4, End=5, Break=6, For=7, In=8, Local=9, Nil=10, 
		Not=11, Repeat=12, Return=13, Then=14, Until=15, While=16, Func=17, And=18, 
		Or=19, Equals=20, NEquals=21, GTEquals=22, LTEquals=23, GT=24, LT=25, 
		Add=26, Subtract=27, Multiply=28, Divide=29, Modulus=30, Pow=31, OBrace=32, 
		CBrace=33, OBracket=34, CBracket=35, OParen=36, CParen=37, SColon=38, 
		Assign=39, Comma=40, Colon=41, DOT=42, Conact=43, Args=44, String=45, 
		Name=46, WS=47, Number=48, Comment=49;
	public static final int
		RULE_chunk = 0, RULE_block = 1, RULE_statement = 2, RULE_returnStat = 3, 
		RULE_assignStat = 4, RULE_forStat = 5, RULE_whileStat = 6, RULE_repeatStat = 7, 
		RULE_ifStat = 8, RULE_expression = 9, RULE_exprList = 10, RULE_binOp = 11, 
		RULE_rightOp = 12, RULE_unaryOp = 13, RULE_prefixExp = 14, RULE_funcStat = 15, 
		RULE_funcBody = 16, RULE_funcArgs = 17, RULE_funcCall = 18, RULE_var = 19, 
		RULE_varOrExp = 20, RULE_funcCallArg = 21, RULE_varSuffix = 22, RULE_varList = 23, 
		RULE_upvalue = 24, RULE_paramList = 25, RULE_nameList = 26, RULE_tableConstructor = 27, 
		RULE_fieldList = 28, RULE_field = 29, RULE_fieldsep = 30;
	public static final String[] ruleNames = {
		"chunk", "block", "statement", "returnStat", "assignStat", "forStat", 
		"whileStat", "repeatStat", "ifStat", "expression", "exprList", "binOp", 
		"rightOp", "unaryOp", "prefixExp", "funcStat", "funcBody", "funcArgs", 
		"funcCall", "var", "varOrExp", "funcCallArg", "varSuffix", "varList", 
		"upvalue", "paramList", "nameList", "tableConstructor", "fieldList", "field", 
		"fieldsep"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'elseif'", "'do'", "'end'", "'break'", "'for'", 
		"'in'", "'local'", "'nil'", "'not'", "'repeat'", "'return'", "'then'", 
		"'until'", "'while'", "'function'", "'and'", "'or'", "'=='", "'~='", "'>='", 
		"'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'{'", 
		"'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','", "':'", "'.'", 
		"'..'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "If", "Else", "Elif", "Do", "End", "Break", "For", "In", "Local", 
		"Nil", "Not", "Repeat", "Return", "Then", "Until", "While", "Func", "And", 
		"Or", "Equals", "NEquals", "GTEquals", "LTEquals", "GT", "LT", "Add", 
		"Subtract", "Multiply", "Divide", "Modulus", "Pow", "OBrace", "CBrace", 
		"OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", "Comma", 
		"Colon", "DOT", "Conact", "Args", "String", "Name", "WS", "Number", "Comment"
	};
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
	public String getGrammarFileName() { return "Lua4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Lua4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ChunkContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Lua4Parser.EOF, 0); }
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitChunk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChunkContext chunk() throws RecognitionException {
		ChunkContext _localctx = new ChunkContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			block();
			setState(63);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << Do) | (1L << Break) | (1L << For) | (1L << Local) | (1L << Repeat) | (1L << While) | (1L << Func) | (1L << Modulus) | (1L << OParen) | (1L << SColon) | (1L << Name))) != 0)) {
				{
				{
				setState(65);
				statement();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(71);
				returnStat();
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

	public static class StatementContext extends ParserRuleContext {
		public AssignStatContext assignStat() {
			return getRuleContext(AssignStatContext.class,0);
		}
		public FuncStatContext funcStat() {
			return getRuleContext(FuncStatContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode Break() { return getToken(Lua4Parser.Break, 0); }
		public ForStatContext forStat() {
			return getRuleContext(ForStatContext.class,0);
		}
		public TerminalNode Do() { return getToken(Lua4Parser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(Lua4Parser.End, 0); }
		public WhileStatContext whileStat() {
			return getRuleContext(WhileStatContext.class,0);
		}
		public RepeatStatContext repeatStat() {
			return getRuleContext(RepeatStatContext.class,0);
		}
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(SColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				assignStat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				funcStat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				funcCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				match(Break);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				forStat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				match(Do);
				setState(81);
				block();
				setState(82);
				match(End);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(84);
				whileStat();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
				repeatStat();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(86);
				ifStat();
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

	public static class ReturnStatContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(Lua4Parser.Return, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ReturnStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitReturnStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returnStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(Return);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Nil) | (1L << Not) | (1L << Func) | (1L << Subtract) | (1L << Modulus) | (1L << OBrace) | (1L << OParen) | (1L << Args) | (1L << String) | (1L << Name) | (1L << Number))) != 0)) {
				{
				setState(90);
				exprList();
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SColon) {
				{
				setState(93);
				match(SColon);
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

	public static class AssignStatContext extends ParserRuleContext {
		public AssignStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStat; }
	 
		public AssignStatContext() { }
		public void copyFrom(AssignStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetValStatContext extends AssignStatContext {
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public SetValStatContext(AssignStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterSetValStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitSetValStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitSetValStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitLocalValStatContext extends AssignStatContext {
		public TerminalNode Local() { return getToken(Lua4Parser.Local, 0); }
		public NameListContext nameList() {
			return getRuleContext(NameListContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public InitLocalValStatContext(AssignStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterInitLocalValStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitInitLocalValStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitInitLocalValStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatContext assignStat() throws RecognitionException {
		AssignStatContext _localctx = new AssignStatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignStat);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Modulus:
			case Name:
				_localctx = new SetValStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				varList();
				setState(97);
				match(Assign);
				setState(98);
				exprList();
				}
				break;
			case Local:
				_localctx = new InitLocalValStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(Local);
				setState(101);
				nameList();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(102);
					match(Assign);
					setState(103);
					exprList();
					}
				}

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

	public static class ForStatContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(Lua4Parser.For, 0); }
		public List<TerminalNode> Name() { return getTokens(Lua4Parser.Name); }
		public TerminalNode Name(int i) {
			return getToken(Lua4Parser.Name, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Do() { return getToken(Lua4Parser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(Lua4Parser.End, 0); }
		public TerminalNode In() { return getToken(Lua4Parser.In, 0); }
		public ForStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterForStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitForStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitForStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatContext forStat() throws RecognitionException {
		ForStatContext _localctx = new ForStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forStat);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(For);
				setState(109);
				match(Name);
				setState(110);
				match(Assign);
				setState(111);
				expression(0);
				setState(112);
				match(Comma);
				setState(113);
				expression(0);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(114);
					match(Comma);
					setState(115);
					expression(0);
					}
				}

				setState(118);
				match(Do);
				setState(119);
				block();
				setState(120);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(For);
				setState(123);
				match(Name);
				setState(124);
				match(Comma);
				setState(125);
				match(Name);
				setState(126);
				match(In);
				setState(127);
				expression(0);
				setState(128);
				match(Do);
				setState(129);
				block();
				setState(130);
				match(End);
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

	public static class WhileStatContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(Lua4Parser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Do() { return getToken(Lua4Parser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(Lua4Parser.End, 0); }
		public WhileStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitWhileStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatContext whileStat() throws RecognitionException {
		WhileStatContext _localctx = new WhileStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(While);
			setState(135);
			expression(0);
			setState(136);
			match(Do);
			setState(137);
			block();
			setState(138);
			match(End);
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

	public static class RepeatStatContext extends ParserRuleContext {
		public TerminalNode Repeat() { return getToken(Lua4Parser.Repeat, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Until() { return getToken(Lua4Parser.Until, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RepeatStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterRepeatStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitRepeatStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitRepeatStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatStatContext repeatStat() throws RecognitionException {
		RepeatStatContext _localctx = new RepeatStatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_repeatStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(Repeat);
			setState(141);
			block();
			setState(142);
			match(Until);
			setState(143);
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

	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(Lua4Parser.If, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Then() { return getTokens(Lua4Parser.Then); }
		public TerminalNode Then(int i) {
			return getToken(Lua4Parser.Then, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode End() { return getToken(Lua4Parser.End, 0); }
		public List<TerminalNode> Elif() { return getTokens(Lua4Parser.Elif); }
		public TerminalNode Elif(int i) {
			return getToken(Lua4Parser.Elif, i);
		}
		public TerminalNode Else() { return getToken(Lua4Parser.Else, 0); }
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(If);
			setState(146);
			expression(0);
			setState(147);
			match(Then);
			setState(148);
			block();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Elif) {
				{
				{
				setState(149);
				match(Elif);
				setState(150);
				expression(0);
				setState(151);
				match(Then);
				setState(152);
				block();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(159);
				match(Else);
				setState(160);
				block();
				}
			}

			setState(163);
			match(End);
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
	public static class TableCreateExpContext extends ExpressionContext {
		public TableConstructorContext tableConstructor() {
			return getRuleContext(TableConstructorContext.class,0);
		}
		public TableCreateExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterTableCreateExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitTableCreateExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitTableCreateExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgsExpContext extends ExpressionContext {
		public TerminalNode Args() { return getToken(Lua4Parser.Args, 0); }
		public ArgsExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterArgsExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitArgsExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitArgsExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOpExpContext extends ExpressionContext {
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryOpExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterUnaryOpExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitUnaryOpExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitUnaryOpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinOpExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinOpContext binOp() {
			return getRuleContext(BinOpContext.class,0);
		}
		public BinOpExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterBinOpExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitBinOpExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitBinOpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RightOpExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RightOpContext rightOp() {
			return getRuleContext(RightOpContext.class,0);
		}
		public RightOpExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterRightOpExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitRightOpExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitRightOpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExpContext extends ExpressionContext {
		public TerminalNode String() { return getToken(Lua4Parser.String, 0); }
		public StringExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterStringExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitStringExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitStringExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValOrFuncCallExpContext extends ExpressionContext {
		public PrefixExpContext prefixExp() {
			return getRuleContext(PrefixExpContext.class,0);
		}
		public ValOrFuncCallExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterValOrFuncCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitValOrFuncCallExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitValOrFuncCallExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IgnoreExpContext extends ExpressionContext {
		public TerminalNode Number() { return getToken(Lua4Parser.Number, 0); }
		public TerminalNode Nil() { return getToken(Lua4Parser.Nil, 0); }
		public IgnoreExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterIgnoreExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitIgnoreExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitIgnoreExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnamedFuncDeclareContext extends ExpressionContext {
		public TerminalNode Func() { return getToken(Lua4Parser.Func, 0); }
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public UnnamedFuncDeclareContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterUnnamedFuncDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitUnnamedFuncDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitUnnamedFuncDeclare(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				{
				_localctx = new IgnoreExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(166);
				match(Number);
				}
				break;
			case Nil:
				{
				_localctx = new IgnoreExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(Nil);
				}
				break;
			case String:
				{
				_localctx = new StringExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(String);
				}
				break;
			case Args:
				{
				_localctx = new ArgsExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(Args);
				}
				break;
			case OBrace:
				{
				_localctx = new TableCreateExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				tableConstructor();
				}
				break;
			case Func:
				{
				_localctx = new UnnamedFuncDeclareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(Func);
				setState(172);
				funcBody();
				}
				break;
			case Modulus:
			case OParen:
			case Name:
				{
				_localctx = new ValOrFuncCallExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				prefixExp();
				}
				break;
			case Not:
			case Subtract:
				{
				_localctx = new UnaryOpExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				unaryOp();
				setState(175);
				expression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(187);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new BinOpExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(179);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(180);
						binOp();
						setState(181);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new RightOpExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(184);
						rightOp();
						setState(185);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			expression(0);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(193);
				match(Comma);
				setState(194);
				expression(0);
				}
				}
				setState(199);
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

	public static class BinOpContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(Lua4Parser.And, 0); }
		public TerminalNode Or() { return getToken(Lua4Parser.Or, 0); }
		public BinOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterBinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitBinOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitBinOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinOpContext binOp() throws RecognitionException {
		BinOpContext _localctx = new BinOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_binOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << And) | (1L << Or) | (1L << Equals) | (1L << NEquals) | (1L << GTEquals) | (1L << LTEquals) | (1L << GT) | (1L << LT) | (1L << Add) | (1L << Subtract) | (1L << Multiply) | (1L << Divide))) != 0)) ) {
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

	public static class RightOpContext extends ParserRuleContext {
		public RightOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterRightOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitRightOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitRightOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightOpContext rightOp() throws RecognitionException {
		RightOpContext _localctx = new RightOpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_rightOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !(_la==Pow || _la==Conact) ) {
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

	public static class UnaryOpContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(Lua4Parser.Not, 0); }
		public UnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOpContext unaryOp() throws RecognitionException {
		UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !(_la==Not || _la==Subtract) ) {
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

	public static class PrefixExpContext extends ParserRuleContext {
		public VarOrExpContext varOrExp() {
			return getRuleContext(VarOrExpContext.class,0);
		}
		public List<FuncCallArgContext> funcCallArg() {
			return getRuleContexts(FuncCallArgContext.class);
		}
		public FuncCallArgContext funcCallArg(int i) {
			return getRuleContext(FuncCallArgContext.class,i);
		}
		public PrefixExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterPrefixExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitPrefixExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitPrefixExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixExpContext prefixExp() throws RecognitionException {
		PrefixExpContext _localctx = new PrefixExpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_prefixExp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			varOrExp();
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(207);
					funcCallArg();
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class FuncStatContext extends ParserRuleContext {
		public FuncStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcStat; }
	 
		public FuncStatContext() { }
		public void copyFrom(FuncStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassFuncDeclareContext extends FuncStatContext {
		public TerminalNode Func() { return getToken(Lua4Parser.Func, 0); }
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public List<TerminalNode> Name() { return getTokens(Lua4Parser.Name); }
		public TerminalNode Name(int i) {
			return getToken(Lua4Parser.Name, i);
		}
		public ClassFuncDeclareContext(FuncStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterClassFuncDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitClassFuncDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitClassFuncDeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedFuncDeclareContext extends FuncStatContext {
		public TerminalNode Func() { return getToken(Lua4Parser.Func, 0); }
		public TerminalNode Name() { return getToken(Lua4Parser.Name, 0); }
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public NamedFuncDeclareContext(FuncStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterNamedFuncDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitNamedFuncDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitNamedFuncDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncStatContext funcStat() throws RecognitionException {
		FuncStatContext _localctx = new FuncStatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcStat);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new NamedFuncDeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(Func);
				setState(214);
				match(Name);
				setState(215);
				funcBody();
				}
				break;
			case 2:
				_localctx = new ClassFuncDeclareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(Func);
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					{
					setState(217);
					match(Name);
					setState(218);
					match(DOT);
					setState(219);
					match(Name);
					}
					}
					break;
				case 2:
					{
					{
					setState(220);
					match(Name);
					setState(221);
					match(Colon);
					setState(222);
					match(Name);
					}
					}
					break;
				}
				setState(225);
				funcBody();
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

	public static class FuncBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(Lua4Parser.End, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FuncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterFuncBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitFuncBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitFuncBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(OParen);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Args || _la==Name) {
				{
				setState(229);
				paramList();
				}
			}

			setState(232);
			match(CParen);
			setState(233);
			block();
			setState(234);
			match(End);
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

	public static class FuncArgsContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TableConstructorContext tableConstructor() {
			return getRuleContext(TableConstructorContext.class,0);
		}
		public TerminalNode String() { return getToken(Lua4Parser.String, 0); }
		public FuncArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterFuncArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitFuncArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitFuncArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncArgsContext funcArgs() throws RecognitionException {
		FuncArgsContext _localctx = new FuncArgsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funcArgs);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(OParen);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Nil) | (1L << Not) | (1L << Func) | (1L << Subtract) | (1L << Modulus) | (1L << OBrace) | (1L << OParen) | (1L << Args) | (1L << String) | (1L << Name) | (1L << Number))) != 0)) {
					{
					setState(237);
					exprList();
					}
				}

				setState(240);
				match(CParen);
				}
				break;
			case OBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				tableConstructor();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(String);
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

	public static class FuncCallContext extends ParserRuleContext {
		public VarOrExpContext varOrExp() {
			return getRuleContext(VarOrExpContext.class,0);
		}
		public List<FuncCallArgContext> funcCallArg() {
			return getRuleContexts(FuncCallArgContext.class);
		}
		public FuncCallArgContext funcCallArg(int i) {
			return getRuleContext(FuncCallArgContext.class,i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			varOrExp();
			setState(247); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(246);
					funcCallArg();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(249); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(Lua4Parser.Name, 0); }
		public TerminalNode Modulus() { return getToken(Lua4Parser.Modulus, 0); }
		public List<VarSuffixContext> varSuffix() {
			return getRuleContexts(VarSuffixContext.class);
		}
		public VarSuffixContext varSuffix(int i) {
			return getRuleContext(VarSuffixContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_var);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Modulus) {
				{
				setState(251);
				match(Modulus);
				}
			}

			setState(254);
			match(Name);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(255);
					varSuffix();
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class VarOrExpContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarOrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterVarOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitVarOrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitVarOrExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarOrExpContext varOrExp() throws RecognitionException {
		VarOrExpContext _localctx = new VarOrExpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_varOrExp);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Modulus:
			case Name:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				var();
				}
				break;
			case OParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(OParen);
				setState(263);
				expression(0);
				setState(264);
				match(CParen);
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

	public static class FuncCallArgContext extends ParserRuleContext {
		public FuncArgsContext funcArgs() {
			return getRuleContext(FuncArgsContext.class,0);
		}
		public TerminalNode Name() { return getToken(Lua4Parser.Name, 0); }
		public FuncCallArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterFuncCallArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitFuncCallArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitFuncCallArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallArgContext funcCallArg() throws RecognitionException {
		FuncCallArgContext _localctx = new FuncCallArgContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_funcCallArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(268);
				match(Colon);
				setState(269);
				match(Name);
				}
			}

			setState(272);
			funcArgs();
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

	public static class VarSuffixContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Name() { return getToken(Lua4Parser.Name, 0); }
		public List<FuncCallArgContext> funcCallArg() {
			return getRuleContexts(FuncCallArgContext.class);
		}
		public FuncCallArgContext funcCallArg(int i) {
			return getRuleContext(FuncCallArgContext.class,i);
		}
		public VarSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterVarSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitVarSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitVarSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSuffixContext varSuffix() throws RecognitionException {
		VarSuffixContext _localctx = new VarSuffixContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_varSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBrace) | (1L << OParen) | (1L << Colon) | (1L << String))) != 0)) {
				{
				{
				setState(274);
				funcCallArg();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBracket:
				{
				setState(280);
				match(OBracket);
				setState(281);
				expression(0);
				setState(282);
				match(CBracket);
				}
				break;
			case DOT:
				{
				setState(284);
				match(DOT);
				setState(285);
				match(Name);
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

	public static class VarListContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterVarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitVarList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			var();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(289);
				match(Comma);
				setState(290);
				var();
				}
				}
				setState(295);
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

	public static class UpvalueContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public UpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterUpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitUpvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitUpvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpvalueContext upvalue() throws RecognitionException {
		UpvalueContext _localctx = new UpvalueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_upvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(Modulus);
			setState(297);
			var();
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

	public static class ParamListContext extends ParserRuleContext {
		public NameListContext nameList() {
			return getRuleContext(NameListContext.class,0);
		}
		public TerminalNode Args() { return getToken(Lua4Parser.Args, 0); }
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_paramList);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Name:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				nameList();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(300);
					match(Comma);
					setState(301);
					match(Args);
					}
				}

				}
				break;
			case Args:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(Args);
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

	public static class NameListContext extends ParserRuleContext {
		public List<TerminalNode> Name() { return getTokens(Lua4Parser.Name); }
		public TerminalNode Name(int i) {
			return getToken(Lua4Parser.Name, i);
		}
		public NameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameListContext nameList() throws RecognitionException {
		NameListContext _localctx = new NameListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_nameList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(Name);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(308);
					match(Comma);
					setState(309);
					match(Name);
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class TableConstructorContext extends ParserRuleContext {
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TableConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterTableConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitTableConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitTableConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableConstructorContext tableConstructor() throws RecognitionException {
		TableConstructorContext _localctx = new TableConstructorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tableConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(OBrace);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Nil) | (1L << Not) | (1L << Func) | (1L << Subtract) | (1L << Modulus) | (1L << OBrace) | (1L << OBracket) | (1L << OParen) | (1L << Args) | (1L << String) | (1L << Name) | (1L << Number))) != 0)) {
				{
				setState(316);
				fieldList();
				}
			}

			setState(319);
			match(CBrace);
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

	public static class FieldListContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<FieldsepContext> fieldsep() {
			return getRuleContexts(FieldsepContext.class);
		}
		public FieldsepContext fieldsep(int i) {
			return getRuleContext(FieldsepContext.class,i);
		}
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fieldList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			field();
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(322);
					fieldsep();
					setState(323);
					field();
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SColon || _la==Comma) {
				{
				setState(330);
				fieldsep();
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

	public static class FieldContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Name() { return getToken(Lua4Parser.Name, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_field);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(OBracket);
				setState(334);
				expression(0);
				setState(335);
				match(CBracket);
				setState(336);
				match(Assign);
				setState(337);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(Name);
				setState(340);
				match(Assign);
				setState(341);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
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

	public static class FieldsepContext extends ParserRuleContext {
		public FieldsepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldsep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).enterFieldsep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lua4Listener ) ((Lua4Listener)listener).exitFieldsep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lua4Visitor ) return ((Lua4Visitor<? extends T>)visitor).visitFieldsep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsepContext fieldsep() throws RecognitionException {
		FieldsepContext _localctx = new FieldsepContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fieldsep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if ( !(_la==SColon || _la==Comma) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u015e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\3\7\3E\n\3\f\3\16\3H\13\3\3\3\5\3K\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\5\3\5\5\5^\n\5\3\5\5\5a\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6k\n\6\5\6m\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7w\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u0087\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u009d\n\n\f\n\16\n\u00a0\13\n\3"+
		"\n\3\n\5\n\u00a4\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00b4\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u00be\n\13\f\13\16\13\u00c1\13\13\3\f\3\f\3\f\7\f\u00c6\n\f"+
		"\f\f\16\f\u00c9\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\7\20\u00d3"+
		"\n\20\f\20\16\20\u00d6\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u00e2\n\21\3\21\5\21\u00e5\n\21\3\22\3\22\5\22\u00e9\n\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u00f1\n\23\3\23\3\23\3\23\5\23\u00f6"+
		"\n\23\3\24\3\24\6\24\u00fa\n\24\r\24\16\24\u00fb\3\25\5\25\u00ff\n\25"+
		"\3\25\3\25\7\25\u0103\n\25\f\25\16\25\u0106\13\25\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u010d\n\26\3\27\3\27\5\27\u0111\n\27\3\27\3\27\3\30\7\30\u0116"+
		"\n\30\f\30\16\30\u0119\13\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0121"+
		"\n\30\3\31\3\31\3\31\7\31\u0126\n\31\f\31\16\31\u0129\13\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\5\33\u0131\n\33\3\33\5\33\u0134\n\33\3\34\3\34\3"+
		"\34\7\34\u0139\n\34\f\34\16\34\u013c\13\34\3\35\3\35\5\35\u0140\n\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\7\36\u0148\n\36\f\36\16\36\u014b\13\36\3"+
		"\36\5\36\u014e\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u015a\n\37\3 \3 \3 \2\3\24!\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>\2\6\3\2\24\37\4\2!!--\4\2\r\r\35\35\4\2("+
		"(**\2\u0172\2@\3\2\2\2\4F\3\2\2\2\6Y\3\2\2\2\b[\3\2\2\2\nl\3\2\2\2\f\u0086"+
		"\3\2\2\2\16\u0088\3\2\2\2\20\u008e\3\2\2\2\22\u0093\3\2\2\2\24\u00b3\3"+
		"\2\2\2\26\u00c2\3\2\2\2\30\u00ca\3\2\2\2\32\u00cc\3\2\2\2\34\u00ce\3\2"+
		"\2\2\36\u00d0\3\2\2\2 \u00e4\3\2\2\2\"\u00e6\3\2\2\2$\u00f5\3\2\2\2&\u00f7"+
		"\3\2\2\2(\u00fe\3\2\2\2*\u010c\3\2\2\2,\u0110\3\2\2\2.\u0117\3\2\2\2\60"+
		"\u0122\3\2\2\2\62\u012a\3\2\2\2\64\u0133\3\2\2\2\66\u0135\3\2\2\28\u013d"+
		"\3\2\2\2:\u0143\3\2\2\2<\u0159\3\2\2\2>\u015b\3\2\2\2@A\5\4\3\2AB\7\2"+
		"\2\3B\3\3\2\2\2CE\5\6\4\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GJ\3"+
		"\2\2\2HF\3\2\2\2IK\5\b\5\2JI\3\2\2\2JK\3\2\2\2K\5\3\2\2\2LZ\7(\2\2MZ\5"+
		"\n\6\2NZ\5 \21\2OZ\5&\24\2PZ\7\b\2\2QZ\5\f\7\2RS\7\6\2\2ST\5\4\3\2TU\7"+
		"\7\2\2UZ\3\2\2\2VZ\5\16\b\2WZ\5\20\t\2XZ\5\22\n\2YL\3\2\2\2YM\3\2\2\2"+
		"YN\3\2\2\2YO\3\2\2\2YP\3\2\2\2YQ\3\2\2\2YR\3\2\2\2YV\3\2\2\2YW\3\2\2\2"+
		"YX\3\2\2\2Z\7\3\2\2\2[]\7\17\2\2\\^\5\26\f\2]\\\3\2\2\2]^\3\2\2\2^`\3"+
		"\2\2\2_a\7(\2\2`_\3\2\2\2`a\3\2\2\2a\t\3\2\2\2bc\5\60\31\2cd\7)\2\2de"+
		"\5\26\f\2em\3\2\2\2fg\7\13\2\2gj\5\66\34\2hi\7)\2\2ik\5\26\f\2jh\3\2\2"+
		"\2jk\3\2\2\2km\3\2\2\2lb\3\2\2\2lf\3\2\2\2m\13\3\2\2\2no\7\t\2\2op\7\60"+
		"\2\2pq\7)\2\2qr\5\24\13\2rs\7*\2\2sv\5\24\13\2tu\7*\2\2uw\5\24\13\2vt"+
		"\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\6\2\2yz\5\4\3\2z{\7\7\2\2{\u0087\3\2"+
		"\2\2|}\7\t\2\2}~\7\60\2\2~\177\7*\2\2\177\u0080\7\60\2\2\u0080\u0081\7"+
		"\n\2\2\u0081\u0082\5\24\13\2\u0082\u0083\7\6\2\2\u0083\u0084\5\4\3\2\u0084"+
		"\u0085\7\7\2\2\u0085\u0087\3\2\2\2\u0086n\3\2\2\2\u0086|\3\2\2\2\u0087"+
		"\r\3\2\2\2\u0088\u0089\7\22\2\2\u0089\u008a\5\24\13\2\u008a\u008b\7\6"+
		"\2\2\u008b\u008c\5\4\3\2\u008c\u008d\7\7\2\2\u008d\17\3\2\2\2\u008e\u008f"+
		"\7\16\2\2\u008f\u0090\5\4\3\2\u0090\u0091\7\21\2\2\u0091\u0092\5\24\13"+
		"\2\u0092\21\3\2\2\2\u0093\u0094\7\3\2\2\u0094\u0095\5\24\13\2\u0095\u0096"+
		"\7\20\2\2\u0096\u009e\5\4\3\2\u0097\u0098\7\5\2\2\u0098\u0099\5\24\13"+
		"\2\u0099\u009a\7\20\2\2\u009a\u009b\5\4\3\2\u009b\u009d\3\2\2\2\u009c"+
		"\u0097\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a3\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\4\2\2\u00a2"+
		"\u00a4\5\4\3\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a6\7\7\2\2\u00a6\23\3\2\2\2\u00a7\u00a8\b\13\1\2\u00a8\u00b4"+
		"\7\62\2\2\u00a9\u00b4\7\f\2\2\u00aa\u00b4\7/\2\2\u00ab\u00b4\7.\2\2\u00ac"+
		"\u00b4\58\35\2\u00ad\u00ae\7\23\2\2\u00ae\u00b4\5\"\22\2\u00af\u00b4\5"+
		"\36\20\2\u00b0\u00b1\5\34\17\2\u00b1\u00b2\5\24\13\3\u00b2\u00b4\3\2\2"+
		"\2\u00b3\u00a7\3\2\2\2\u00b3\u00a9\3\2\2\2\u00b3\u00aa\3\2\2\2\u00b3\u00ab"+
		"\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3"+
		"\u00b0\3\2\2\2\u00b4\u00bf\3\2\2\2\u00b5\u00b6\f\5\2\2\u00b6\u00b7\5\30"+
		"\r\2\u00b7\u00b8\5\24\13\6\u00b8\u00be\3\2\2\2\u00b9\u00ba\f\4\2\2\u00ba"+
		"\u00bb\5\32\16\2\u00bb\u00bc\5\24\13\4\u00bc\u00be\3\2\2\2\u00bd\u00b5"+
		"\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\25\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c7\5\24\13"+
		"\2\u00c3\u00c4\7*\2\2\u00c4\u00c6\5\24\13\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\27\3\2\2"+
		"\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\t\2\2\2\u00cb\31\3\2\2\2\u00cc\u00cd"+
		"\t\3\2\2\u00cd\33\3\2\2\2\u00ce\u00cf\t\4\2\2\u00cf\35\3\2\2\2\u00d0\u00d4"+
		"\5*\26\2\u00d1\u00d3\5,\27\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\37\3\2\2\2\u00d6\u00d4\3\2\2"+
		"\2\u00d7\u00d8\7\23\2\2\u00d8\u00d9\7\60\2\2\u00d9\u00e5\5\"\22\2\u00da"+
		"\u00e1\7\23\2\2\u00db\u00dc\7\60\2\2\u00dc\u00dd\7,\2\2\u00dd\u00e2\7"+
		"\60\2\2\u00de\u00df\7\60\2\2\u00df\u00e0\7+\2\2\u00e0\u00e2\7\60\2\2\u00e1"+
		"\u00db\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\5\""+
		"\22\2\u00e4\u00d7\3\2\2\2\u00e4\u00da\3\2\2\2\u00e5!\3\2\2\2\u00e6\u00e8"+
		"\7&\2\2\u00e7\u00e9\5\64\33\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2"+
		"\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7\'\2\2\u00eb\u00ec\5\4\3\2\u00ec\u00ed"+
		"\7\7\2\2\u00ed#\3\2\2\2\u00ee\u00f0\7&\2\2\u00ef\u00f1\5\26\f\2\u00f0"+
		"\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f6\7\'"+
		"\2\2\u00f3\u00f6\58\35\2\u00f4\u00f6\7/\2\2\u00f5\u00ee\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6%\3\2\2\2\u00f7\u00f9\5*\26\2"+
		"\u00f8\u00fa\5,\27\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\'\3\2\2\2\u00fd\u00ff\7 \2\2\u00fe"+
		"\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0104\7\60"+
		"\2\2\u0101\u0103\5.\30\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105)\3\2\2\2\u0106\u0104\3\2\2\2"+
		"\u0107\u010d\5(\25\2\u0108\u0109\7&\2\2\u0109\u010a\5\24\13\2\u010a\u010b"+
		"\7\'\2\2\u010b\u010d\3\2\2\2\u010c\u0107\3\2\2\2\u010c\u0108\3\2\2\2\u010d"+
		"+\3\2\2\2\u010e\u010f\7+\2\2\u010f\u0111\7\60\2\2\u0110\u010e\3\2\2\2"+
		"\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\5$\23\2\u0113-\3"+
		"\2\2\2\u0114\u0116\5,\27\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0120\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u011a\u011b\7$\2\2\u011b\u011c\5\24\13\2\u011c\u011d\7%\2\2\u011d"+
		"\u0121\3\2\2\2\u011e\u011f\7,\2\2\u011f\u0121\7\60\2\2\u0120\u011a\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0121/\3\2\2\2\u0122\u0127\5(\25\2\u0123\u0124"+
		"\7*\2\2\u0124\u0126\5(\25\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\61\3\2\2\2\u0129\u0127\3\2\2"+
		"\2\u012a\u012b\7 \2\2\u012b\u012c\5(\25\2\u012c\63\3\2\2\2\u012d\u0130"+
		"\5\66\34\2\u012e\u012f\7*\2\2\u012f\u0131\7.\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0134\7.\2\2\u0133\u012d\3\2"+
		"\2\2\u0133\u0132\3\2\2\2\u0134\65\3\2\2\2\u0135\u013a\7\60\2\2\u0136\u0137"+
		"\7*\2\2\u0137\u0139\7\60\2\2\u0138\u0136\3\2\2\2\u0139\u013c\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\67\3\2\2\2\u013c\u013a\3\2\2"+
		"\2\u013d\u013f\7\"\2\2\u013e\u0140\5:\36\2\u013f\u013e\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\7#\2\2\u01429\3\2\2\2\u0143\u0149"+
		"\5<\37\2\u0144\u0145\5> \2\u0145\u0146\5<\37\2\u0146\u0148\3\2\2\2\u0147"+
		"\u0144\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014e\5> \2\u014d\u014c"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e;\3\2\2\2\u014f\u0150\7$\2\2\u0150\u0151"+
		"\5\24\13\2\u0151\u0152\7%\2\2\u0152\u0153\7)\2\2\u0153\u0154\5\24\13\2"+
		"\u0154\u015a\3\2\2\2\u0155\u0156\7\60\2\2\u0156\u0157\7)\2\2\u0157\u015a"+
		"\5\24\13\2\u0158\u015a\5\24\13\2\u0159\u014f\3\2\2\2\u0159\u0155\3\2\2"+
		"\2\u0159\u0158\3\2\2\2\u015a=\3\2\2\2\u015b\u015c\t\5\2\2\u015c?\3\2\2"+
		"\2&FJY]`jlv\u0086\u009e\u00a3\u00b3\u00bd\u00bf\u00c7\u00d4\u00e1\u00e4"+
		"\u00e8\u00f0\u00f5\u00fb\u00fe\u0104\u010c\u0110\u0117\u0120\u0127\u0130"+
		"\u0133\u013a\u013f\u0149\u014d\u0159";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}