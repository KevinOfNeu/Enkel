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
		T__36=1, T__35=2, T__34=3, T__33=4, T__32=5, T__31=6, T__30=7, T__29=8, 
		T__28=9, T__27=10, T__26=11, T__25=12, T__24=13, T__23=14, T__22=15, T__21=16, 
		T__20=17, T__19=18, T__18=19, T__17=20, T__16=21, T__15=22, T__14=23, 
		T__13=24, T__12=25, T__11=26, T__10=27, T__9=28, T__8=29, T__7=30, T__6=31, 
		T__5=32, T__4=33, T__3=34, T__2=35, T__1=36, T__0=37, VARIABLE=38, PRINT=39, 
		EQUALS=40, NUMBER=41, BOOL=42, STRING=43, ID=44, WS=45;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'char'", "'new'", "'return'", "'!='", "'float'", 
		"'void'", "'{'", "'byte'", "'}'", "'for'", "'if'", "'<='", "'short'", 
		"'double'", "'from'", "'int'", "'('", "'*'", "','", "'.'", "'->'", "'boolean'", 
		"'long'", "'to'", "'>='", "'['", "'=='", "'<'", "']'", "'>'", "'string'", 
		"'else'", "'super'", "')'", "'+'", "'-'", "'var'", "'print'", "'='", "NUMBER", 
		"BOOL", "STRING", "ID", "WS"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_classDeclaration = 1, RULE_className = 2, 
		RULE_classBody = 3, RULE_function = 4, RULE_functionDeclaration = 5, RULE_parametersList = 6, 
		RULE_functionName = 7, RULE_parameter = 8, RULE_parameterWithDefaultValue = 9, 
		RULE_type = 10, RULE_primitiveType = 11, RULE_classType = 12, RULE_block = 13, 
		RULE_statement = 14, RULE_variableDeclaration = 15, RULE_printStatement = 16, 
		RULE_returnStatement = 17, RULE_ifStatement = 18, RULE_forStatement = 19, 
		RULE_forConditions = 20, RULE_name = 21, RULE_argumentList = 22, RULE_argument = 23, 
		RULE_namedArgument = 24, RULE_expression = 25, RULE_variableReference = 26, 
		RULE_value = 27, RULE_qualifiedName = 28;
	public static final String[] ruleNames = {
		"compilationUnit", "classDeclaration", "className", "classBody", "function", 
		"functionDeclaration", "parametersList", "functionName", "parameter", 
		"parameterWithDefaultValue", "type", "primitiveType", "classType", "block", 
		"statement", "variableDeclaration", "printStatement", "returnStatement", 
		"ifStatement", "forStatement", "forConditions", "name", "argumentList", 
		"argument", "namedArgument", "expression", "variableReference", "value", 
		"qualifiedName"
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
			setState(58); classDeclaration();
			setState(59); match(EOF);
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
			setState(61); className();
			setState(62); match(T__29);
			setState(63); classBody();
			setState(64); match(T__27);
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
			setState(66); match(ID);
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
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__31) | (1L << T__30) | (1L << T__28) | (1L << T__23) | (1L << T__22) | (1L << T__20) | (1L << T__14) | (1L << T__13) | (1L << T__5) | (1L << ID))) != 0)) {
				{
				{
				setState(68); function();
				}
				}
				setState(73);
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
			setState(74); functionDeclaration();
			setState(75); block();
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
		public ParametersListContext parametersList() {
			return getRuleContext(ParametersListContext.class,0);
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
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(77); type();
				}
				break;
			}
			setState(80); functionName();
			setState(82);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(81); match(T__19);
				}
			}

			setState(85);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__31) | (1L << T__30) | (1L << T__28) | (1L << T__23) | (1L << T__22) | (1L << T__20) | (1L << T__14) | (1L << T__13) | (1L << T__5) | (1L << ID))) != 0)) {
				{
				setState(84); parametersList();
				}
			}

			setState(88);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(87); match(T__2);
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

	public static class ParametersListContext extends ParserRuleContext {
		public ParameterWithDefaultValueContext parameterWithDefaultValue(int i) {
			return getRuleContext(ParameterWithDefaultValueContext.class,i);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public List<ParameterWithDefaultValueContext> parameterWithDefaultValue() {
			return getRuleContexts(ParameterWithDefaultValueContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterParametersList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitParametersList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitParametersList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersListContext parametersList() throws RecognitionException {
		ParametersListContext _localctx = new ParametersListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametersList);
		int _la;
		try {
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90); parameter();
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(91); match(T__17);
					setState(92); parameter();
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); parameter();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(99); match(T__17);
					setState(100); parameterWithDefaultValue();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106); parameterWithDefaultValue();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(107); match(T__17);
					setState(108); parameterWithDefaultValue();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		enterRule(_localctx, 14, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(ID);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EnkelParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); type();
			setState(119); match(ID);
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

	public static class ParameterWithDefaultValueContext extends ParserRuleContext {
		public ExpressionContext defaultValue;
		public TerminalNode ID() { return getToken(EnkelParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterWithDefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterWithDefaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterParameterWithDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitParameterWithDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitParameterWithDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterWithDefaultValueContext parameterWithDefaultValue() throws RecognitionException {
		ParameterWithDefaultValueContext _localctx = new ParameterWithDefaultValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameterWithDefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); type();
			setState(122); match(ID);
			setState(123); match(EQUALS);
			setState(124); ((ParameterWithDefaultValueContext)_localctx).defaultValue = expression(0);
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
		enterRule(_localctx, 20, RULE_type);
		try {
			setState(128);
			switch (_input.LA(1)) {
			case T__35:
			case T__31:
			case T__30:
			case T__28:
			case T__23:
			case T__22:
			case T__20:
			case T__14:
			case T__13:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(126); primitiveType();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); classType();
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
		enterRule(_localctx, 22, RULE_primitiveType);
		int _la;
		try {
			setState(210);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); match(T__14);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(131); match(T__10);
					setState(132); match(T__7);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); match(T__5);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(139); match(T__10);
					setState(140); match(T__7);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(146); match(T__35);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(147); match(T__10);
					setState(148); match(T__7);
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(154); match(T__28);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(155); match(T__10);
					setState(156); match(T__7);
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(162); match(T__23);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(163); match(T__10);
					setState(164); match(T__7);
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 6);
				{
				setState(170); match(T__20);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(171); match(T__10);
					setState(172); match(T__7);
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(178); match(T__13);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(179); match(T__10);
					setState(180); match(T__7);
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 8);
				{
				setState(186); match(T__31);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(187); match(T__10);
					setState(188); match(T__7);
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 9);
				{
				setState(194); match(T__22);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(195); match(T__10);
					setState(196); match(T__7);
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 10);
				{
				setState(202); match(T__30);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(203); match(T__10);
					setState(204); match(T__7);
					}
					}
					setState(209);
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
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); qualifiedName();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(213); match(T__10);
				setState(214); match(T__7);
				}
				}
				setState(219);
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
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); match(T__29);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__33) | (1L << T__29) | (1L << T__26) | (1L << T__25) | (1L << T__19) | (1L << T__3) | (1L << VARIABLE) | (1L << PRINT) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(221); statement();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227); match(T__27);
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
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(236);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(229); block();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(230); variableDeclaration();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(231); printStatement();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(232); forStatement();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 5);
				{
				setState(233); returnStatement();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 6);
				{
				setState(234); ifStatement();
				}
				break;
			case T__34:
			case T__19:
			case T__3:
			case NUMBER:
			case BOOL:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(235); expression(0);
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
		enterRule(_localctx, 30, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); match(VARIABLE);
			setState(239); name();
			setState(240); match(EQUALS);
			setState(241); expression(0);
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
		enterRule(_localctx, 32, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(PRINT);
			setState(244); expression(0);
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
	public static class ReturnVoidContext extends ReturnStatementContext {
		public ReturnVoidContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterReturnVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitReturnVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitReturnVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnWithValueContext extends ReturnStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnWithValueContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterReturnWithValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitReturnWithValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitReturnWithValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnStatement);
		try {
			setState(249);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new ReturnWithValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246); match(T__33);
				setState(247); expression(0);
				}
				break;

			case 2:
				_localctx = new ReturnVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248); match(T__33);
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

	public static class IfStatementContext extends ParserRuleContext {
		public StatementContext trueStatement;
		public StatementContext falseStatement;
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); match(T__25);
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(252); match(T__19);
				}
				break;
			}
			setState(255); expression(0);
			setState(257);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(256); match(T__2);
				}
			}

			setState(259); ((IfStatementContext)_localctx).trueStatement = statement();
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(260); match(T__4);
				setState(261); ((IfStatementContext)_localctx).falseStatement = statement();
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

	public static class ForStatementContext extends ParserRuleContext {
		public ForConditionsContext forConditions() {
			return getRuleContext(ForConditionsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); match(T__26);
			setState(266);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(265); match(T__19);
				}
			}

			setState(268); forConditions();
			setState(270);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(269); match(T__2);
				}
			}

			setState(272); statement();
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

	public static class ForConditionsContext extends ParserRuleContext {
		public VariableReferenceContext iterator;
		public ExpressionContext startExpr;
		public Token range;
		public ExpressionContext endExpr;
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ForConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forConditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterForConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitForConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitForConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionsContext forConditions() throws RecognitionException {
		ForConditionsContext _localctx = new ForConditionsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forConditions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); ((ForConditionsContext)_localctx).iterator = variableReference();
			setState(275); match(T__21);
			setState(276); ((ForConditionsContext)_localctx).startExpr = expression(0);
			setState(277); ((ForConditionsContext)_localctx).range = match(T__12);
			setState(278); ((ForConditionsContext)_localctx).endExpr = expression(0);
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
		enterRule(_localctx, 42, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); match(ID);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	 
		public ArgumentListContext() { }
		public void copyFrom(ArgumentListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnnamedArgumentsListContext extends ArgumentListContext {
		public ArgumentContext a;
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public UnnamedArgumentsListContext(ArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterUnnamedArgumentsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitUnnamedArgumentsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitUnnamedArgumentsList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedArgumentsListContext extends ArgumentListContext {
		public List<NamedArgumentContext> namedArgument() {
			return getRuleContexts(NamedArgumentContext.class);
		}
		public NamedArgumentContext namedArgument(int i) {
			return getRuleContext(NamedArgumentContext.class,i);
		}
		public NamedArgumentsListContext(ArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterNamedArgumentsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitNamedArgumentsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitNamedArgumentsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_argumentList);
		int _la;
		try {
			setState(302);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new UnnamedArgumentsListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__19) | (1L << T__3) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					setState(282); argument();
					}
				}

				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(285); match(T__17);
					setState(286); ((UnnamedArgumentsListContext)_localctx).a = argument();
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				_localctx = new NamedArgumentsListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(292); namedArgument();
					}
				}

				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(295); match(T__17);
					setState(296); namedArgument();
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); expression(0);
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

	public static class NamedArgumentContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitNamedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedArgumentContext namedArgument() throws RecognitionException {
		NamedArgumentContext _localctx = new NamedArgumentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_namedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); name();
			setState(307); match(T__15);
			setState(308); expression(0);
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
	public static class AddContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstractContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public SubstractContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterSubstract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitSubstract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitSubstract(this);
			else return visitor.visitChildren(this);
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
	public static class DivideContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public DivideContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitDivide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitDivide(this);
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
	public static class MultiplyContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MultiplyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public Token cmp;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SupercallContext extends ExpressionContext {
		public Token superCall;
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public SupercallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterSupercall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitSupercall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitSupercall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends ExpressionContext {
		public ExpressionContext owner;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class ConstructorCallContext extends ExpressionContext {
		public Token newCall;
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ConstructorCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterConstructorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitConstructorCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitConstructorCall(this);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				_localctx = new VarReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(311); variableReference();
				}
				break;

			case 2:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(312); functionName();
				setState(313); match(T__19);
				setState(314); argumentList();
				setState(315); match(T__2);
				}
				break;

			case 3:
				{
				_localctx = new SupercallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317); ((SupercallContext)_localctx).superCall = match(T__3);
				setState(318); match(T__19);
				setState(319); argumentList();
				setState(320); match(T__2);
				}
				break;

			case 4:
				{
				_localctx = new ConstructorCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(322); ((ConstructorCallContext)_localctx).newCall = match(T__34);
				setState(323); className();
				setState(324); match(T__19);
				setState(325); argumentList();
				setState(326); match(T__2);
				}
				break;

			case 5:
				{
				_localctx = new ValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(328); value();
				}
				break;

			case 6:
				{
				_localctx = new MultiplyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(329); match(T__19);
				setState(330); expression(0);
				setState(331); match(T__18);
				setState(332); expression(0);
				setState(333); match(T__2);
				}
				break;

			case 7:
				{
				_localctx = new DivideContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(335); match(T__19);
				setState(336); expression(0);
				setState(337); match(T__36);
				setState(338); expression(0);
				setState(339); match(T__2);
				}
				break;

			case 8:
				{
				_localctx = new AddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341); match(T__19);
				setState(342); expression(0);
				setState(343); match(T__1);
				setState(344); expression(0);
				setState(345); match(T__2);
				}
				break;

			case 9:
				{
				_localctx = new SubstractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(347); match(T__19);
				setState(348); expression(0);
				setState(349); match(T__0);
				setState(350); expression(0);
				setState(351); match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(392);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(355);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(356); match(T__18);
						setState(357); expression(14);
						}
						break;

					case 2:
						{
						_localctx = new DivideContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(358);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(359); match(T__36);
						setState(360); expression(12);
						}
						break;

					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(361);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(362); match(T__1);
						setState(363); expression(10);
						}
						break;

					case 4:
						{
						_localctx = new SubstractContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(364);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(365); match(T__0);
						setState(366); expression(8);
						}
						break;

					case 5:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(367);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(368); ((ConditionalExpressionContext)_localctx).cmp = match(T__6);
						setState(369); expression(7);
						}
						break;

					case 6:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(370);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(371); ((ConditionalExpressionContext)_localctx).cmp = match(T__8);
						setState(372); expression(6);
						}
						break;

					case 7:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(373);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(374); ((ConditionalExpressionContext)_localctx).cmp = match(T__9);
						setState(375); expression(5);
						}
						break;

					case 8:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(376);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(377); ((ConditionalExpressionContext)_localctx).cmp = match(T__32);
						setState(378); expression(4);
						}
						break;

					case 9:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(379);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(380); ((ConditionalExpressionContext)_localctx).cmp = match(T__11);
						setState(381); expression(3);
						}
						break;

					case 10:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(382);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(383); ((ConditionalExpressionContext)_localctx).cmp = match(T__24);
						setState(384); expression(2);
						}
						break;

					case 11:
						{
						_localctx = new FunctionCallContext(new ExpressionContext(_parentctx, _parentState));
						((FunctionCallContext)_localctx).owner = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(385);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(386); match(T__16);
						setState(387); functionName();
						setState(388); match(T__19);
						setState(389); argumentList();
						setState(390); match(T__2);
						}
						break;
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 52, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397); match(ID);
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
		public TerminalNode BOOL() { return getToken(EnkelParser.BOOL, 0); }
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
		enterRule(_localctx, 54, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << STRING))) != 0)) ) {
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(EnkelParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EnkelParser.ID, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnkelVisitor ) return ((EnkelVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401); match(ID);
			setState(404); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(402); match(T__16);
				setState(403); match(ID);
				}
				}
				setState(406); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__16 );
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
		case 25: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);

		case 1: return precpred(_ctx, 11);

		case 2: return precpred(_ctx, 9);

		case 3: return precpred(_ctx, 7);

		case 4: return precpred(_ctx, 6);

		case 5: return precpred(_ctx, 5);

		case 6: return precpred(_ctx, 4);

		case 7: return precpred(_ctx, 3);

		case 8: return precpred(_ctx, 2);

		case 9: return precpred(_ctx, 1);

		case 10: return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u019b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\7\5H\n\5\f\5\16\5K\13\5\3\6\3\6\3\6\3\7\5\7Q"+
		"\n\7\3\7\3\7\5\7U\n\7\3\7\5\7X\n\7\3\7\5\7[\n\7\3\b\3\b\3\b\7\b`\n\b\f"+
		"\b\16\bc\13\b\3\b\3\b\3\b\7\bh\n\b\f\b\16\bk\13\b\3\b\3\b\3\b\7\bp\n\b"+
		"\f\b\16\bs\13\b\5\bu\n\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\5\f\u0083\n\f\3\r\3\r\3\r\7\r\u0088\n\r\f\r\16\r\u008b\13\r\3"+
		"\r\3\r\3\r\7\r\u0090\n\r\f\r\16\r\u0093\13\r\3\r\3\r\3\r\7\r\u0098\n\r"+
		"\f\r\16\r\u009b\13\r\3\r\3\r\3\r\7\r\u00a0\n\r\f\r\16\r\u00a3\13\r\3\r"+
		"\3\r\3\r\7\r\u00a8\n\r\f\r\16\r\u00ab\13\r\3\r\3\r\3\r\7\r\u00b0\n\r\f"+
		"\r\16\r\u00b3\13\r\3\r\3\r\3\r\7\r\u00b8\n\r\f\r\16\r\u00bb\13\r\3\r\3"+
		"\r\3\r\7\r\u00c0\n\r\f\r\16\r\u00c3\13\r\3\r\3\r\3\r\7\r\u00c8\n\r\f\r"+
		"\16\r\u00cb\13\r\3\r\3\r\3\r\7\r\u00d0\n\r\f\r\16\r\u00d3\13\r\5\r\u00d5"+
		"\n\r\3\16\3\16\3\16\7\16\u00da\n\16\f\16\16\16\u00dd\13\16\3\17\3\17\7"+
		"\17\u00e1\n\17\f\17\16\17\u00e4\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u00ef\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\5\23\u00fc\n\23\3\24\3\24\5\24\u0100\n\24\3\24\3\24\5"+
		"\24\u0104\n\24\3\24\3\24\3\24\5\24\u0109\n\24\3\25\3\25\5\25\u010d\n\25"+
		"\3\25\3\25\5\25\u0111\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\30\5\30\u011e\n\30\3\30\3\30\7\30\u0122\n\30\f\30\16\30\u0125"+
		"\13\30\3\30\5\30\u0128\n\30\3\30\3\30\7\30\u012c\n\30\f\30\16\30\u012f"+
		"\13\30\5\30\u0131\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0164"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u018b\n\33\f\33"+
		"\16\33\u018e\13\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\6\36\u0197\n\36"+
		"\r\36\16\36\u0198\3\36\2\3\64\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:\2\3\3\2+-\u01c2\2<\3\2\2\2\4?\3\2\2\2\6D\3\2\2"+
		"\2\bI\3\2\2\2\nL\3\2\2\2\fP\3\2\2\2\16t\3\2\2\2\20v\3\2\2\2\22x\3\2\2"+
		"\2\24{\3\2\2\2\26\u0082\3\2\2\2\30\u00d4\3\2\2\2\32\u00d6\3\2\2\2\34\u00de"+
		"\3\2\2\2\36\u00ee\3\2\2\2 \u00f0\3\2\2\2\"\u00f5\3\2\2\2$\u00fb\3\2\2"+
		"\2&\u00fd\3\2\2\2(\u010a\3\2\2\2*\u0114\3\2\2\2,\u011a\3\2\2\2.\u0130"+
		"\3\2\2\2\60\u0132\3\2\2\2\62\u0134\3\2\2\2\64\u0163\3\2\2\2\66\u018f\3"+
		"\2\2\28\u0191\3\2\2\2:\u0193\3\2\2\2<=\5\4\3\2=>\7\2\2\3>\3\3\2\2\2?@"+
		"\5\6\4\2@A\7\n\2\2AB\5\b\5\2BC\7\f\2\2C\5\3\2\2\2DE\7.\2\2E\7\3\2\2\2"+
		"FH\5\n\6\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\t\3\2\2\2KI\3\2\2"+
		"\2LM\5\f\7\2MN\5\34\17\2N\13\3\2\2\2OQ\5\26\f\2PO\3\2\2\2PQ\3\2\2\2QR"+
		"\3\2\2\2RT\5\20\t\2SU\7\24\2\2TS\3\2\2\2TU\3\2\2\2UW\3\2\2\2VX\5\16\b"+
		"\2WV\3\2\2\2WX\3\2\2\2XZ\3\2\2\2Y[\7%\2\2ZY\3\2\2\2Z[\3\2\2\2[\r\3\2\2"+
		"\2\\a\5\22\n\2]^\7\26\2\2^`\5\22\n\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3"+
		"\2\2\2bu\3\2\2\2ca\3\2\2\2di\5\22\n\2ef\7\26\2\2fh\5\24\13\2ge\3\2\2\2"+
		"hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2ju\3\2\2\2ki\3\2\2\2lq\5\24\13\2mn\7\26"+
		"\2\2np\5\24\13\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3"+
		"\2\2\2t\\\3\2\2\2td\3\2\2\2tl\3\2\2\2u\17\3\2\2\2vw\7.\2\2w\21\3\2\2\2"+
		"xy\5\26\f\2yz\7.\2\2z\23\3\2\2\2{|\5\26\f\2|}\7.\2\2}~\7*\2\2~\177\5\64"+
		"\33\2\177\25\3\2\2\2\u0080\u0083\5\30\r\2\u0081\u0083\5\32\16\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\27\3\2\2\2\u0084\u0089\7\31\2"+
		"\2\u0085\u0086\7\35\2\2\u0086\u0088\7 \2\2\u0087\u0085\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u00d5\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u0091\7\"\2\2\u008d\u008e\7\35\2\2\u008e\u0090\7"+
		" \2\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u00d5\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0099\7\4"+
		"\2\2\u0095\u0096\7\35\2\2\u0096\u0098\7 \2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00d5\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u00a1\7\13\2\2\u009d\u009e\7\35\2\2\u009e"+
		"\u00a0\7 \2\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00d5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a9\7\20\2\2\u00a5\u00a6\7\35\2\2\u00a6\u00a8\7 \2\2\u00a7\u00a5\3"+
		"\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00d5\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b1\7\23\2\2\u00ad\u00ae\7"+
		"\35\2\2\u00ae\u00b0\7 \2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00d5\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00b9\7\32\2\2\u00b5\u00b6\7\35\2\2\u00b6\u00b8\7 \2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00d5\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c1\7\b\2\2\u00bd"+
		"\u00be\7\35\2\2\u00be\u00c0\7 \2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00d5\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c9\7\21\2\2\u00c5\u00c6\7\35\2\2\u00c6\u00c8\7"+
		" \2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00d5\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d1\7\t"+
		"\2\2\u00cd\u00ce\7\35\2\2\u00ce\u00d0\7 \2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d4\u0084\3\2\2\2\u00d4\u008c\3\2\2\2\u00d4"+
		"\u0094\3\2\2\2\u00d4\u009c\3\2\2\2\u00d4\u00a4\3\2\2\2\u00d4\u00ac\3\2"+
		"\2\2\u00d4\u00b4\3\2\2\2\u00d4\u00bc\3\2\2\2\u00d4\u00c4\3\2\2\2\u00d4"+
		"\u00cc\3\2\2\2\u00d5\31\3\2\2\2\u00d6\u00db\5:\36\2\u00d7\u00d8\7\35\2"+
		"\2\u00d8\u00da\7 \2\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\33\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00e2\7\n\2\2\u00df\u00e1\5\36\20\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3"+
		"\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\7\f\2\2\u00e6\35\3\2\2\2\u00e7\u00ef\5\34\17"+
		"\2\u00e8\u00ef\5 \21\2\u00e9\u00ef\5\"\22\2\u00ea\u00ef\5(\25\2\u00eb"+
		"\u00ef\5$\23\2\u00ec\u00ef\5&\24\2\u00ed\u00ef\5\64\33\2\u00ee\u00e7\3"+
		"\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ee"+
		"\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\37\3\2\2"+
		"\2\u00f0\u00f1\7(\2\2\u00f1\u00f2\5,\27\2\u00f2\u00f3\7*\2\2\u00f3\u00f4"+
		"\5\64\33\2\u00f4!\3\2\2\2\u00f5\u00f6\7)\2\2\u00f6\u00f7\5\64\33\2\u00f7"+
		"#\3\2\2\2\u00f8\u00f9\7\6\2\2\u00f9\u00fc\5\64\33\2\u00fa\u00fc\7\6\2"+
		"\2\u00fb\u00f8\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc%\3\2\2\2\u00fd\u00ff"+
		"\7\16\2\2\u00fe\u0100\7\24\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2"+
		"\u0100\u0101\3\2\2\2\u0101\u0103\5\64\33\2\u0102\u0104\7%\2\2\u0103\u0102"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0108\5\36\20\2"+
		"\u0106\u0107\7#\2\2\u0107\u0109\5\36\20\2\u0108\u0106\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\'\3\2\2\2\u010a\u010c\7\r\2\2\u010b\u010d\7\24\2\2\u010c"+
		"\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\5*"+
		"\26\2\u010f\u0111\7%\2\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\5\36\20\2\u0113)\3\2\2\2\u0114\u0115\5\66\34"+
		"\2\u0115\u0116\7\22\2\2\u0116\u0117\5\64\33\2\u0117\u0118\7\33\2\2\u0118"+
		"\u0119\5\64\33\2\u0119+\3\2\2\2\u011a\u011b\7.\2\2\u011b-\3\2\2\2\u011c"+
		"\u011e\5\60\31\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0123\3"+
		"\2\2\2\u011f\u0120\7\26\2\2\u0120\u0122\5\60\31\2\u0121\u011f\3\2\2\2"+
		"\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0131"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0128\5\62\32\2\u0127\u0126\3\2\2\2"+
		"\u0127\u0128\3\2\2\2\u0128\u012d\3\2\2\2\u0129\u012a\7\26\2\2\u012a\u012c"+
		"\5\62\32\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2"+
		"\u012d\u012e\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u011d"+
		"\3\2\2\2\u0130\u0127\3\2\2\2\u0131/\3\2\2\2\u0132\u0133\5\64\33\2\u0133"+
		"\61\3\2\2\2\u0134\u0135\5,\27\2\u0135\u0136\7\30\2\2\u0136\u0137\5\64"+
		"\33\2\u0137\63\3\2\2\2\u0138\u0139\b\33\1\2\u0139\u0164\5\66\34\2\u013a"+
		"\u013b\5\20\t\2\u013b\u013c\7\24\2\2\u013c\u013d\5.\30\2\u013d\u013e\7"+
		"%\2\2\u013e\u0164\3\2\2\2\u013f\u0140\7$\2\2\u0140\u0141\7\24\2\2\u0141"+
		"\u0142\5.\30\2\u0142\u0143\7%\2\2\u0143\u0164\3\2\2\2\u0144\u0145\7\5"+
		"\2\2\u0145\u0146\5\6\4\2\u0146\u0147\7\24\2\2\u0147\u0148\5.\30\2\u0148"+
		"\u0149\7%\2\2\u0149\u0164\3\2\2\2\u014a\u0164\58\35\2\u014b\u014c\7\24"+
		"\2\2\u014c\u014d\5\64\33\2\u014d\u014e\7\25\2\2\u014e\u014f\5\64\33\2"+
		"\u014f\u0150\7%\2\2\u0150\u0164\3\2\2\2\u0151\u0152\7\24\2\2\u0152\u0153"+
		"\5\64\33\2\u0153\u0154\7\3\2\2\u0154\u0155\5\64\33\2\u0155\u0156\7%\2"+
		"\2\u0156\u0164\3\2\2\2\u0157\u0158\7\24\2\2\u0158\u0159\5\64\33\2\u0159"+
		"\u015a\7&\2\2\u015a\u015b\5\64\33\2\u015b\u015c\7%\2\2\u015c\u0164\3\2"+
		"\2\2\u015d\u015e\7\24\2\2\u015e\u015f\5\64\33\2\u015f\u0160\7\'\2\2\u0160"+
		"\u0161\5\64\33\2\u0161\u0162\7%\2\2\u0162\u0164\3\2\2\2\u0163\u0138\3"+
		"\2\2\2\u0163\u013a\3\2\2\2\u0163\u013f\3\2\2\2\u0163\u0144\3\2\2\2\u0163"+
		"\u014a\3\2\2\2\u0163\u014b\3\2\2\2\u0163\u0151\3\2\2\2\u0163\u0157\3\2"+
		"\2\2\u0163\u015d\3\2\2\2\u0164\u018c\3\2\2\2\u0165\u0166\f\17\2\2\u0166"+
		"\u0167\7\25\2\2\u0167\u018b\5\64\33\20\u0168\u0169\f\r\2\2\u0169\u016a"+
		"\7\3\2\2\u016a\u018b\5\64\33\16\u016b\u016c\f\13\2\2\u016c\u016d\7&\2"+
		"\2\u016d\u018b\5\64\33\f\u016e\u016f\f\t\2\2\u016f\u0170\7\'\2\2\u0170"+
		"\u018b\5\64\33\n\u0171\u0172\f\b\2\2\u0172\u0173\7!\2\2\u0173\u018b\5"+
		"\64\33\t\u0174\u0175\f\7\2\2\u0175\u0176\7\37\2\2\u0176\u018b\5\64\33"+
		"\b\u0177\u0178\f\6\2\2\u0178\u0179\7\36\2\2\u0179\u018b\5\64\33\7\u017a"+
		"\u017b\f\5\2\2\u017b\u017c\7\7\2\2\u017c\u018b\5\64\33\6\u017d\u017e\f"+
		"\4\2\2\u017e\u017f\7\34\2\2\u017f\u018b\5\64\33\5\u0180\u0181\f\3\2\2"+
		"\u0181\u0182\7\17\2\2\u0182\u018b\5\64\33\4\u0183\u0184\f\25\2\2\u0184"+
		"\u0185\7\27\2\2\u0185\u0186\5\20\t\2\u0186\u0187\7\24\2\2\u0187\u0188"+
		"\5.\30\2\u0188\u0189\7%\2\2\u0189\u018b\3\2\2\2\u018a\u0165\3\2\2\2\u018a"+
		"\u0168\3\2\2\2\u018a\u016b\3\2\2\2\u018a\u016e\3\2\2\2\u018a\u0171\3\2"+
		"\2\2\u018a\u0174\3\2\2\2\u018a\u0177\3\2\2\2\u018a\u017a\3\2\2\2\u018a"+
		"\u017d\3\2\2\2\u018a\u0180\3\2\2\2\u018a\u0183\3\2\2\2\u018b\u018e\3\2"+
		"\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\65\3\2\2\2\u018e\u018c"+
		"\3\2\2\2\u018f\u0190\7.\2\2\u0190\67\3\2\2\2\u0191\u0192\t\2\2\2\u0192"+
		"9\3\2\2\2\u0193\u0196\7.\2\2\u0194\u0195\7\27\2\2\u0195\u0197\7.\2\2\u0196"+
		"\u0194\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199;\3\2\2\2)IPTWZaiqt\u0082\u0089\u0091\u0099\u00a1\u00a9\u00b1"+
		"\u00b9\u00c1\u00c9\u00d1\u00d4\u00db\u00e2\u00ee\u00fb\u00ff\u0103\u0108"+
		"\u010c\u0110\u011d\u0123\u0127\u012d\u0130\u0163\u018a\u018c\u0198";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}