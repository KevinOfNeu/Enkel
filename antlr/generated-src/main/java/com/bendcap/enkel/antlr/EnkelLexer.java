// Generated from com/bendcap/enkel/antlr/Enkel.g4 by ANTLR 4.3

package com.bendcap.enkel.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EnkelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, VARIABLE=19, PRINT=20, EQUALS=21, NUMBER=22, STRING=23, 
		ID=24, QUALIFIED_NAME=25, WS=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'"
	};
	public static final String[] ruleNames = {
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "VARIABLE", "PRINT", "EQUALS", "NUMBER", "STRING", "ID", "QUALIFIED_NAME", 
		"WS"
	};


	public EnkelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Enkel.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\6\27\u008f"+
		"\n\27\r\27\16\27\u0090\3\30\3\30\7\30\u0095\n\30\f\30\16\30\u0098\13\30"+
		"\3\30\3\30\3\31\6\31\u009d\n\31\r\31\16\31\u009e\3\32\3\32\3\32\6\32\u00a4"+
		"\n\32\r\32\16\32\u00a5\3\33\6\33\u00a9\n\33\r\33\16\33\u00aa\3\33\3\33"+
		"\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\5"+
		"\3\2\62;\5\2\62;C\\c|\5\2\13\f\17\17\"\"\u00b2\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5<\3\2\2\2\7D\3\2\2\2\tI\3\2\2\2\13O\3"+
		"\2\2\2\rQ\3\2\2\2\17V\3\2\2\2\21X\3\2\2\2\23Z\3\2\2\2\25_\3\2\2\2\27a"+
		"\3\2\2\2\31c\3\2\2\2\33i\3\2\2\2\35p\3\2\2\2\37w\3\2\2\2!{\3\2\2\2#}\3"+
		"\2\2\2%\177\3\2\2\2\'\u0081\3\2\2\2)\u0085\3\2\2\2+\u008b\3\2\2\2-\u008e"+
		"\3\2\2\2/\u0092\3\2\2\2\61\u009c\3\2\2\2\63\u00a0\3\2\2\2\65\u00a8\3\2"+
		"\2\2\678\7e\2\289\7j\2\29:\7c\2\2:;\7t\2\2;\4\3\2\2\2<=\7d\2\2=>\7q\2"+
		"\2>?\7q\2\2?@\7n\2\2@A\7g\2\2AB\7c\2\2BC\7p\2\2C\6\3\2\2\2DE\7n\2\2EF"+
		"\7q\2\2FG\7p\2\2GH\7i\2\2H\b\3\2\2\2IJ\7h\2\2JK\7n\2\2KL\7q\2\2LM\7c\2"+
		"\2MN\7v\2\2N\n\3\2\2\2OP\7<\2\2P\f\3\2\2\2QR\7x\2\2RS\7q\2\2ST\7k\2\2"+
		"TU\7f\2\2U\16\3\2\2\2VW\7]\2\2W\20\3\2\2\2XY\7}\2\2Y\22\3\2\2\2Z[\7d\2"+
		"\2[\\\7{\2\2\\]\7v\2\2]^\7g\2\2^\24\3\2\2\2_`\7_\2\2`\26\3\2\2\2ab\7\177"+
		"\2\2b\30\3\2\2\2cd\7u\2\2de\7j\2\2ef\7q\2\2fg\7t\2\2gh\7v\2\2h\32\3\2"+
		"\2\2ij\7u\2\2jk\7v\2\2kl\7t\2\2lm\7k\2\2mn\7p\2\2no\7i\2\2o\34\3\2\2\2"+
		"pq\7f\2\2qr\7q\2\2rs\7w\2\2st\7d\2\2tu\7n\2\2uv\7g\2\2v\36\3\2\2\2wx\7"+
		"k\2\2xy\7p\2\2yz\7v\2\2z \3\2\2\2{|\7*\2\2|\"\3\2\2\2}~\7+\2\2~$\3\2\2"+
		"\2\177\u0080\7.\2\2\u0080&\3\2\2\2\u0081\u0082\7x\2\2\u0082\u0083\7c\2"+
		"\2\u0083\u0084\7t\2\2\u0084(\3\2\2\2\u0085\u0086\7r\2\2\u0086\u0087\7"+
		"t\2\2\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089\u008a\7v\2\2\u008a*"+
		"\3\2\2\2\u008b\u008c\7?\2\2\u008c,\3\2\2\2\u008d\u008f\t\2\2\2\u008e\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		".\3\2\2\2\u0092\u0096\7$\2\2\u0093\u0095\13\2\2\2\u0094\u0093\3\2\2\2"+
		"\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7$\2\2\u009a\60\3\2\2\2\u009b"+
		"\u009d\t\3\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\62\3\2\2\2\u00a0\u00a3\5\61\31\2\u00a1"+
		"\u00a2\7\60\2\2\u00a2\u00a4\5\61\31\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\64\3\2\2\2\u00a7"+
		"\u00a9\t\4\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\33\2\2\u00ad"+
		"\66\3\2\2\2\b\2\u0090\u0096\u009e\u00a5\u00aa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}