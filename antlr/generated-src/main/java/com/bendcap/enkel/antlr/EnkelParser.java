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
		VARIABLE=1, PRINT=2, EQUALS=3, NUMBER=4, STRING=5, ID=6, WS=7;
	public static final String[] tokenNames = {
		"<INVALID>", "'var'", "'print'", "'='", "NUMBER", "STRING", "ID", "WS"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_variable = 1, RULE_print = 2, RULE_value = 3;
	public static final String[] ruleNames = {
		"compilationUnit", "variable", "print", "value"
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
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public TerminalNode EOF() { return getToken(EnkelParser.EOF, 0); }
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
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
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARIABLE || _la==PRINT) {
				{
				setState(10);
				switch (_input.LA(1)) {
				case VARIABLE:
					{
					setState(8); variable();
					}
					break;
				case PRINT:
					{
					setState(9); print();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(15); match(EOF);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EnkelParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(EnkelParser.EQUALS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(EnkelParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); match(VARIABLE);
			setState(18); match(ID);
			setState(19); match(EQUALS);
			setState(20); value();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EnkelParser.ID, 0); }
		public TerminalNode PRINT() { return getToken(EnkelParser.PRINT, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnkelListener ) ((EnkelListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); match(PRINT);
			setState(23); match(ID);
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
		public Token op;
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
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		try {
			setState(27);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(25); ((ValueContext)_localctx).op = match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(26); ((ValueContext)_localctx).op = match(STRING);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t \4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\7\2\r\n\2\f\2\16\2\20\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\5\5\36\n\5\3\5\2\2\6\2\4\6\b\2\2\36\2"+
		"\16\3\2\2\2\4\23\3\2\2\2\6\30\3\2\2\2\b\35\3\2\2\2\n\r\5\4\3\2\13\r\5"+
		"\6\4\2\f\n\3\2\2\2\f\13\3\2\2\2\r\20\3\2\2\2\16\f\3\2\2\2\16\17\3\2\2"+
		"\2\17\21\3\2\2\2\20\16\3\2\2\2\21\22\7\2\2\3\22\3\3\2\2\2\23\24\7\3\2"+
		"\2\24\25\7\b\2\2\25\26\7\5\2\2\26\27\5\b\5\2\27\5\3\2\2\2\30\31\7\4\2"+
		"\2\31\32\7\b\2\2\32\7\3\2\2\2\33\36\7\6\2\2\34\36\7\7\2\2\35\33\3\2\2"+
		"\2\35\34\3\2\2\2\36\t\3\2\2\2\5\f\16\35";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}