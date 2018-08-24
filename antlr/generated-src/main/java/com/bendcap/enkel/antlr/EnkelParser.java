// Generated from com/bendcap/enkel/antlr/Enkel.g4 by ANTLR 4.3

package com.bendcap.enkel.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EnkelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__21=1, T__20=2, T__19=3, T__18=4, T__17=5, T__16=6, T__15=7, T__14=8, 
		T__13=9, T__12=10, T__11=11, T__10=12, T__9=13, T__8=14, T__7=15, T__6=16, 
		T__5=17, T__4=18, T__3=19, T__2=20, T__1=21, T__0=22, VARIABLE=23, PRINT=24, 
		EQUALS=25, NUMBER=26, STRING=27, ID=28, QUALIFIED_NAME=29, WS=30;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'char'", "'boolean'", "'return'", "'long'", "'float'", 
		"'void'", "'['", "'{'", "'byte'", "']'", "'}'", "'short'", "'string'", 
		"'double'", "'int'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'var'", 
		"'print'", "'='", "NUMBER", "STRING", "ID", "QUALIFIED_NAME", "WS"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_classDeclaration = 1, RULE_className = 2, 
		RULE_classBody = 3, RULE_function = 4, RULE_functionDeclaration = 5, RULE_functionName = 6, 
		RULE_functionArgument = 7, RULE_functionParamdefaultValue = 8, RULE_type = 9, 
		RULE_primitiveType = 10, RULE_classType = 11, RULE_block = 12, RULE_statement = 13, 
		RULE_variableDeclaration = 14, RULE_printStatement = 15, RULE_returnStatement = 16, 
		RULE_functionCall = 17, RULE_name = 18, RULE_expressionList = 19, RULE_expression = 20, 
		RULE_variableReference = 21, RULE_value = 22;
	public static final String[] ruleNames = {
		"compilationUnit", "classDeclaration", "className", "classBody", "function", 
		"functionDeclaration", "functionName", "functionArgument", "functionParamdefaultValue", 
		"type", "primitiveType", "classType", "block", "statement", "variableDeclaration", 
		"printStatement", "returnStatement", "functionCall", "name", "expressionList", 
		"expression", "variableReference", "value"
	};

	@Override
	public String getGrammarFileName() { return "Enkel.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EnkelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(EnkelParser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); classDeclaration();
			setState(47); match(EOF);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); className();
			setState(50); match(T__13);
			setState(51); classBody();
			setState(52); match(T__10);
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EnkelParser.ID, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(ID);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__19) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__12) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << ID) | (1L << QUALIFIED_NAME))) != 0)) {
				{
				{
				setState(56); function();
				}
				}
				setState(61);
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); functionDeclaration();
			setState(63); block();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<FunctionArgumentContext> functionArgument() {
			return getRuleContexts(FunctionArgumentContext.class);
		}
		public FunctionArgumentContext functionArgument(int i) {
			return getRuleContext(FunctionArgumentContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__19) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__12) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << QUALIFIED_NAME))) != 0)) {
				{
				setState(65); type();
				}
			}

			setState(68); functionName();
			setState(69); match(T__5);
			setState(78);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__19) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__12) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << QUALIFIED_NAME))) != 0)) {
				{
				setState(70); functionArgument();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(71); match(T__1);
					setState(72); functionArgument();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(80); match(T__4);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EnkelParser.ID, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(ID);
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

	public static class FunctionArgumentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EnkelParser.ID, 0); }
		public FunctionParamdefaultValueContext functionParamdefaultValue() {
			return getRuleContext(FunctionParamdefaultValueContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterFunctionArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitFunctionArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitFunctionArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentContext functionArgument() throws RecognitionException {
		FunctionArgumentContext _localctx = new FunctionArgumentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); type();
			setState(85); match(ID);
			setState(87);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(86); functionParamdefaultValue();
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

	public static class FunctionParamdefaultValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionParamdefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParamdefaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterFunctionParamdefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitFunctionParamdefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitFunctionParamdefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParamdefaultValueContext functionParamdefaultValue() throws RecognitionException {
		FunctionParamdefaultValueContext _localctx = new FunctionParamdefaultValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionParamdefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(EQUALS);
			setState(90); expression(0);
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(94);
			switch (_input.LA(1)) {
			case T__20:
			case T__19:
			case T__17:
			case T__16:
			case T__15:
			case T__12:
			case T__9:
			case T__8:
			case T__7:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); primitiveType();
				}
				break;
			case QUALIFIED_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); classType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primitiveType);
		int _la;
		try {
			setState(176);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(96); match(T__19);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(97); match(T__14);
					setState(98); match(T__11);
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); match(T__8);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(105); match(T__14);
					setState(106); match(T__11);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(112); match(T__20);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(113); match(T__14);
					setState(114); match(T__11);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(120); match(T__12);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(121); match(T__14);
					setState(122); match(T__11);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(128); match(T__9);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(129); match(T__14);
					setState(130); match(T__11);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 6);
				{
				setState(136); match(T__6);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(137); match(T__14);
					setState(138); match(T__11);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 7);
				{
				setState(144); match(T__17);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(145); match(T__14);
					setState(146); match(T__11);
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 8);
				{
				setState(152); match(T__16);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(153); match(T__14);
					setState(154); match(T__11);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 9);
				{
				setState(160); match(T__7);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(161); match(T__14);
					setState(162); match(T__11);
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 10);
				{
				setState(168); match(T__15);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(169); match(T__14);
					setState(170); match(T__11);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode QUALIFIED_NAME() { return getToken(EnkelParser.QUALIFIED_NAME, 0); }
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(QUALIFIED_NAME);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(179); match(T__14);
				setState(180); match(T__11);
				}
				}
				setState(185);
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

	public static class BlockContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); match(T__13);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__13) | (1L << T__5) | (1L << VARIABLE) | (1L << PRINT) | (1L << NUMBER) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(187); statement();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193); match(T__10);
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
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(200);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196); variableDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197); printStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(198); functionCall();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(199); returnStatement();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(EnkelParser.EQUALS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(EnkelParser.VARIABLE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); match(VARIABLE);
			setState(203); name();
			setState(204); match(EQUALS);
			setState(205); expression(0);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(EnkelParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(PRINT);
			setState(208); expression(0);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RETURNVOIDContext extends ReturnStatementContext {
		public RETURNVOIDContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterRETURNVOID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitRETURNVOID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitRETURNVOID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RETURNWITHVALUEContext extends ReturnStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RETURNWITHVALUEContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterRETURNWITHVALUE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitRETURNWITHVALUE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitRETURNWITHVALUE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnStatement);
		int _la;
		try {
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new RETURNVOIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210); match(T__18);
				}
				break;

			case 2:
				_localctx = new RETURNWITHVALUEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(211); match(T__18);
					}
				}

				setState(214); expression(0);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); functionName();
			setState(218); match(T__5);
			setState(219); expressionList();
			setState(220); match(T__4);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EnkelParser.ID, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(ID);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << NUMBER) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(224); expression(0);
				}
			}

			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(227); match(T__1);
				setState(228); expression(0);
				}
				}
				setState(233);
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
	public static class ValueExprContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitValueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ADDContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ADDContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterADD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitADD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitADD(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarReferenceContext extends ExpressionContext {
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public VarReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterVarReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitVarReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitVarReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SUBSTRACTContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public SUBSTRACTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterSUBSTRACT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitSUBSTRACT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitSUBSTRACT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FUNCALLContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FUNCALLContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterFUNCALL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitFUNCALL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitFUNCALL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MULTIPLYContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MULTIPLYContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterMULTIPLY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitMULTIPLY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitMULTIPLY(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DIVIDEContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public DIVIDEContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterDIVIDE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitDIVIDE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitDIVIDE(this);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new VarReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(235); variableReference();
				}
				break;

			case 2:
				{
				_localctx = new ValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236); value();
				}
				break;

			case 3:
				{
				_localctx = new FUNCALLContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237); functionCall();
				}
				break;

			case 4:
				{
				_localctx = new MULTIPLYContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238); match(T__5);
				setState(239); expression(0);
				setState(240); match(T__3);
				setState(241); expression(0);
				setState(242); match(T__4);
				}
				break;

			case 5:
				{
				_localctx = new DIVIDEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244); match(T__5);
				setState(245); expression(0);
				setState(246); match(T__21);
				setState(247); expression(0);
				setState(248); match(T__4);
				}
				break;

			case 6:
				{
				_localctx = new ADDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250); match(T__5);
				setState(251); expression(0);
				setState(252); match(T__2);
				setState(253); expression(0);
				setState(254); match(T__4);
				}
				break;

			case 7:
				{
				_localctx = new SUBSTRACTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256); match(T__5);
				setState(257); expression(0);
				setState(258); match(T__0);
				setState(259); expression(0);
				setState(260); match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(276);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new MULTIPLYContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(264);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(265); match(T__3);
						setState(266); expression(8);
						}
						break;

					case 2:
						{
						_localctx = new DIVIDEContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(267);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(268); match(T__21);
						setState(269); expression(6);
						}
						break;

					case 3:
						{
						_localctx = new ADDContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(270);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(271); match(T__2);
						setState(272); expression(4);
						}
						break;

					case 4:
						{
						_localctx = new SUBSTRACTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(274); match(T__0);
						setState(275); expression(2);
						}
						break;
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class VariableReferenceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EnkelParser.ID, 0); }
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); match(ID);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(EnkelParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(EnkelParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		case 20: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);

		case 1: return precpred(_ctx, 5);

		case 2: return precpred(_ctx, 3);

		case 3: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u0120\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\7\5<\n\5\f\5\16\5?\13\5\3\6\3\6\3\6"+
		"\3\7\5\7E\n\7\3\7\3\7\3\7\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\5\7Q\n\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\5\tZ\n\t\3\n\3\n\3\n\3\13\3\13\5\13a\n\13\3\f"+
		"\3\f\3\f\7\ff\n\f\f\f\16\fi\13\f\3\f\3\f\3\f\7\fn\n\f\f\f\16\fq\13\f\3"+
		"\f\3\f\3\f\7\fv\n\f\f\f\16\fy\13\f\3\f\3\f\3\f\7\f~\n\f\f\f\16\f\u0081"+
		"\13\f\3\f\3\f\3\f\7\f\u0086\n\f\f\f\16\f\u0089\13\f\3\f\3\f\3\f\7\f\u008e"+
		"\n\f\f\f\16\f\u0091\13\f\3\f\3\f\3\f\7\f\u0096\n\f\f\f\16\f\u0099\13\f"+
		"\3\f\3\f\3\f\7\f\u009e\n\f\f\f\16\f\u00a1\13\f\3\f\3\f\3\f\7\f\u00a6\n"+
		"\f\f\f\16\f\u00a9\13\f\3\f\3\f\3\f\7\f\u00ae\n\f\f\f\16\f\u00b1\13\f\5"+
		"\f\u00b3\n\f\3\r\3\r\3\r\7\r\u00b8\n\r\f\r\16\r\u00bb\13\r\3\16\3\16\7"+
		"\16\u00bf\n\16\f\16\16\16\u00c2\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00cb\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\5\22\u00d7\n\22\3\22\5\22\u00da\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\25\5\25\u00e4\n\25\3\25\3\25\7\25\u00e8\n\25\f\25\16\25\u00eb\13"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\5\26\u0109\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u0117\n\26\f\26\16\26\u011a\13\26\3\27\3\27\3\30\3\30"+
		"\3\30\2\3*\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\3\3\2"+
		"\34\35\u0135\2\60\3\2\2\2\4\63\3\2\2\2\68\3\2\2\2\b=\3\2\2\2\n@\3\2\2"+
		"\2\fD\3\2\2\2\16T\3\2\2\2\20V\3\2\2\2\22[\3\2\2\2\24`\3\2\2\2\26\u00b2"+
		"\3\2\2\2\30\u00b4\3\2\2\2\32\u00bc\3\2\2\2\34\u00ca\3\2\2\2\36\u00cc\3"+
		"\2\2\2 \u00d1\3\2\2\2\"\u00d9\3\2\2\2$\u00db\3\2\2\2&\u00e0\3\2\2\2(\u00e3"+
		"\3\2\2\2*\u0108\3\2\2\2,\u011b\3\2\2\2.\u011d\3\2\2\2\60\61\5\4\3\2\61"+
		"\62\7\2\2\3\62\3\3\2\2\2\63\64\5\6\4\2\64\65\7\13\2\2\65\66\5\b\5\2\66"+
		"\67\7\16\2\2\67\5\3\2\2\289\7\36\2\29\7\3\2\2\2:<\5\n\6\2;:\3\2\2\2<?"+
		"\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\t\3\2\2\2?=\3\2\2\2@A\5\f\7\2AB\5\32\16"+
		"\2B\13\3\2\2\2CE\5\24\13\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\5\16\b\2GP"+
		"\7\23\2\2HM\5\20\t\2IJ\7\27\2\2JL\5\20\t\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2"+
		"\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PH\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\24"+
		"\2\2S\r\3\2\2\2TU\7\36\2\2U\17\3\2\2\2VW\5\24\13\2WY\7\36\2\2XZ\5\22\n"+
		"\2YX\3\2\2\2YZ\3\2\2\2Z\21\3\2\2\2[\\\7\33\2\2\\]\5*\26\2]\23\3\2\2\2"+
		"^a\5\26\f\2_a\5\30\r\2`^\3\2\2\2`_\3\2\2\2a\25\3\2\2\2bg\7\5\2\2cd\7\n"+
		"\2\2df\7\r\2\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\u00b3\3\2\2\2"+
		"ig\3\2\2\2jo\7\20\2\2kl\7\n\2\2ln\7\r\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2"+
		"\2op\3\2\2\2p\u00b3\3\2\2\2qo\3\2\2\2rw\7\4\2\2st\7\n\2\2tv\7\r\2\2us"+
		"\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\u00b3\3\2\2\2yw\3\2\2\2z\177\7"+
		"\f\2\2{|\7\n\2\2|~\7\r\2\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u00b3\3\2\2\2\u0081\177\3\2\2\2\u0082\u0087\7\17\2\2\u0083"+
		"\u0084\7\n\2\2\u0084\u0086\7\r\2\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u00b3\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008f\7\22\2\2\u008b\u008c\7\n\2\2\u008c\u008e\7"+
		"\r\2\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u00b3\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0097\7\7"+
		"\2\2\u0093\u0094\7\n\2\2\u0094\u0096\7\r\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u00b3\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u009a\u009f\7\b\2\2\u009b\u009c\7\n\2\2\u009c"+
		"\u009e\7\r\2\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00b3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a7\7\21\2\2\u00a3\u00a4\7\n\2\2\u00a4\u00a6\7\r\2\2\u00a5\u00a3\3"+
		"\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00b3\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00af\7\t\2\2\u00ab\u00ac\7\n"+
		"\2\2\u00ac\u00ae\7\r\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b2b\3\2\2\2\u00b2j\3\2\2\2\u00b2r\3\2\2\2\u00b2z\3\2\2\2\u00b2"+
		"\u0082\3\2\2\2\u00b2\u008a\3\2\2\2\u00b2\u0092\3\2\2\2\u00b2\u009a\3\2"+
		"\2\2\u00b2\u00a2\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b3\27\3\2\2\2\u00b4\u00b9"+
		"\7\37\2\2\u00b5\u00b6\7\n\2\2\u00b6\u00b8\7\r\2\2\u00b7\u00b5\3\2\2\2"+
		"\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\31"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c0\7\13\2\2\u00bd\u00bf\5\34\17"+
		"\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\16\2\2"+
		"\u00c4\33\3\2\2\2\u00c5\u00cb\5\32\16\2\u00c6\u00cb\5\36\20\2\u00c7\u00cb"+
		"\5 \21\2\u00c8\u00cb\5$\23\2\u00c9\u00cb\5\"\22\2\u00ca\u00c5\3\2\2\2"+
		"\u00ca\u00c6\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9"+
		"\3\2\2\2\u00cb\35\3\2\2\2\u00cc\u00cd\7\31\2\2\u00cd\u00ce\5&\24\2\u00ce"+
		"\u00cf\7\33\2\2\u00cf\u00d0\5*\26\2\u00d0\37\3\2\2\2\u00d1\u00d2\7\32"+
		"\2\2\u00d2\u00d3\5*\26\2\u00d3!\3\2\2\2\u00d4\u00da\7\6\2\2\u00d5\u00d7"+
		"\7\6\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00da\5*\26\2\u00d9\u00d4\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da#\3\2\2\2"+
		"\u00db\u00dc\5\16\b\2\u00dc\u00dd\7\23\2\2\u00dd\u00de\5(\25\2\u00de\u00df"+
		"\7\24\2\2\u00df%\3\2\2\2\u00e0\u00e1\7\36\2\2\u00e1\'\3\2\2\2\u00e2\u00e4"+
		"\5*\26\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e9\3\2\2\2\u00e5"+
		"\u00e6\7\27\2\2\u00e6\u00e8\5*\26\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3"+
		"\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea)\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00ec\u00ed\b\26\1\2\u00ed\u0109\5,\27\2\u00ee\u0109\5.\30\2"+
		"\u00ef\u0109\5$\23\2\u00f0\u00f1\7\23\2\2\u00f1\u00f2\5*\26\2\u00f2\u00f3"+
		"\7\25\2\2\u00f3\u00f4\5*\26\2\u00f4\u00f5\7\24\2\2\u00f5\u0109\3\2\2\2"+
		"\u00f6\u00f7\7\23\2\2\u00f7\u00f8\5*\26\2\u00f8\u00f9\7\3\2\2\u00f9\u00fa"+
		"\5*\26\2\u00fa\u00fb\7\24\2\2\u00fb\u0109\3\2\2\2\u00fc\u00fd\7\23\2\2"+
		"\u00fd\u00fe\5*\26\2\u00fe\u00ff\7\26\2\2\u00ff\u0100\5*\26\2\u0100\u0101"+
		"\7\24\2\2\u0101\u0109\3\2\2\2\u0102\u0103\7\23\2\2\u0103\u0104\5*\26\2"+
		"\u0104\u0105\7\30\2\2\u0105\u0106\5*\26\2\u0106\u0107\7\24\2\2\u0107\u0109"+
		"\3\2\2\2\u0108\u00ec\3\2\2\2\u0108\u00ee\3\2\2\2\u0108\u00ef\3\2\2\2\u0108"+
		"\u00f0\3\2\2\2\u0108\u00f6\3\2\2\2\u0108\u00fc\3\2\2\2\u0108\u0102\3\2"+
		"\2\2\u0109\u0118\3\2\2\2\u010a\u010b\f\t\2\2\u010b\u010c\7\25\2\2\u010c"+
		"\u0117\5*\26\n\u010d\u010e\f\7\2\2\u010e\u010f\7\3\2\2\u010f\u0117\5*"+
		"\26\b\u0110\u0111\f\5\2\2\u0111\u0112\7\26\2\2\u0112\u0117\5*\26\6\u0113"+
		"\u0114\f\3\2\2\u0114\u0115\7\30\2\2\u0115\u0117\5*\26\4\u0116\u010a\3"+
		"\2\2\2\u0116\u010d\3\2\2\2\u0116\u0110\3\2\2\2\u0116\u0113\3\2\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119+\3\2\2\2"+
		"\u011a\u0118\3\2\2\2\u011b\u011c\7\36\2\2\u011c-\3\2\2\2\u011d\u011e\t"+
		"\2\2\2\u011e/\3\2\2\2\35=DMPY`gow\177\u0087\u008f\u0097\u009f\u00a7\u00af"+
		"\u00b2\u00b9\u00c0\u00ca\u00d6\u00d9\u00e3\u00e9\u0108\u0116\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}