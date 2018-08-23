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
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, VARIABLE=22, PRINT=23, EQUALS=24, 
		NUMBER=25, STRING=26, ID=27, QUALIFIED_NAME=28, WS=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'"
	};
	public static final String[] ruleNames = {
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "VARIABLE", "PRINT", "EQUALS", "NUMBER", 
		"STRING", "ID", "QUALIFIED_NAME", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00ba\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\6\32\u009b\n\32"+
		"\r\32\16\32\u009c\3\33\3\33\7\33\u00a1\n\33\f\33\16\33\u00a4\13\33\3\33"+
		"\3\33\3\34\6\34\u00a9\n\34\r\34\16\34\u00aa\3\35\3\35\3\35\6\35\u00b0"+
		"\n\35\r\35\16\35\u00b1\3\36\6\36\u00b5\n\36\r\36\16\36\u00b6\3\36\3\36"+
		"\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37\3\2\5\3\2\62;\5\2\62;C\\c|\5\2\13\f\17\17\"\"\u00be\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3"+
		"\2\2\2\5?\3\2\2\2\7D\3\2\2\2\tL\3\2\2\2\13Q\3\2\2\2\rW\3\2\2\2\17\\\3"+
		"\2\2\2\21^\3\2\2\2\23`\3\2\2\2\25e\3\2\2\2\27g\3\2\2\2\31i\3\2\2\2\33"+
		"o\3\2\2\2\35v\3\2\2\2\37}\3\2\2\2!\u0081\3\2\2\2#\u0083\3\2\2\2%\u0085"+
		"\3\2\2\2\'\u0087\3\2\2\2)\u0089\3\2\2\2+\u008b\3\2\2\2-\u008d\3\2\2\2"+
		"/\u0091\3\2\2\2\61\u0097\3\2\2\2\63\u009a\3\2\2\2\65\u009e\3\2\2\2\67"+
		"\u00a8\3\2\2\29\u00ac\3\2\2\2;\u00b4\3\2\2\2=>\7\61\2\2>\4\3\2\2\2?@\7"+
		"e\2\2@A\7j\2\2AB\7c\2\2BC\7t\2\2C\6\3\2\2\2DE\7d\2\2EF\7q\2\2FG\7q\2\2"+
		"GH\7n\2\2HI\7g\2\2IJ\7c\2\2JK\7p\2\2K\b\3\2\2\2LM\7n\2\2MN\7q\2\2NO\7"+
		"p\2\2OP\7i\2\2P\n\3\2\2\2QR\7h\2\2RS\7n\2\2ST\7q\2\2TU\7c\2\2UV\7v\2\2"+
		"V\f\3\2\2\2WX\7x\2\2XY\7q\2\2YZ\7k\2\2Z[\7f\2\2[\16\3\2\2\2\\]\7]\2\2"+
		"]\20\3\2\2\2^_\7}\2\2_\22\3\2\2\2`a\7d\2\2ab\7{\2\2bc\7v\2\2cd\7g\2\2"+
		"d\24\3\2\2\2ef\7_\2\2f\26\3\2\2\2gh\7\177\2\2h\30\3\2\2\2ij\7u\2\2jk\7"+
		"j\2\2kl\7q\2\2lm\7t\2\2mn\7v\2\2n\32\3\2\2\2op\7u\2\2pq\7v\2\2qr\7t\2"+
		"\2rs\7k\2\2st\7p\2\2tu\7i\2\2u\34\3\2\2\2vw\7f\2\2wx\7q\2\2xy\7w\2\2y"+
		"z\7d\2\2z{\7n\2\2{|\7g\2\2|\36\3\2\2\2}~\7k\2\2~\177\7p\2\2\177\u0080"+
		"\7v\2\2\u0080 \3\2\2\2\u0081\u0082\7*\2\2\u0082\"\3\2\2\2\u0083\u0084"+
		"\7+\2\2\u0084$\3\2\2\2\u0085\u0086\7,\2\2\u0086&\3\2\2\2\u0087\u0088\7"+
		"-\2\2\u0088(\3\2\2\2\u0089\u008a\7.\2\2\u008a*\3\2\2\2\u008b\u008c\7/"+
		"\2\2\u008c,\3\2\2\2\u008d\u008e\7x\2\2\u008e\u008f\7c\2\2\u008f\u0090"+
		"\7t\2\2\u0090.\3\2\2\2\u0091\u0092\7r\2\2\u0092\u0093\7t\2\2\u0093\u0094"+
		"\7k\2\2\u0094\u0095\7p\2\2\u0095\u0096\7v\2\2\u0096\60\3\2\2\2\u0097\u0098"+
		"\7?\2\2\u0098\62\3\2\2\2\u0099\u009b\t\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\64\3\2\2"+
		"\2\u009e\u00a2\7$\2\2\u009f\u00a1\13\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a6\7$\2\2\u00a6\66\3\2\2\2\u00a7\u00a9\t\3\2\2"+
		"\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab8\3\2\2\2\u00ac\u00af\5\67\34\2\u00ad\u00ae\7\60\2\2\u00ae"+
		"\u00b0\5\67\34\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2:\3\2\2\2\u00b3\u00b5\t\4\2\2\u00b4\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\b\36\2\2\u00b9<\3\2\2\2\b\2\u009c\u00a2\u00aa"+
		"\u00b1\u00b6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}