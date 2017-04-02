package application.model;
// Generated from Expression.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, LPAREN=16, 
		RPAREN=17, ID=18, NUM=19, FLOAT=20, CHARX=21, DATE=22, WS=23, COMMENT=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "LETTER", "DIGIT", 
		"ASCII", "TWO_DIGITS", "THREE_DIGITS", "FOUR_DIGITS", "YEAR", "MONTH", 
		"DAY", "LPAREN", "RPAREN", "ID", "NUM", "FLOAT", "CHARX", "DATE", "WS", 
		"COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'OR'", "'Or'", "'or'", "'AND'", "'And'", "'and'", "'NOT'", "'Not'", 
		"'not'", "'<'", "'>'", "'<='", "'>='", "'=='", "'<>'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "LPAREN", "RPAREN", "ID", "NUM", "FLOAT", "CHARX", 
		"DATE", "WS", "COMMENT"
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


	public ExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00e6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\5\23|\n\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\5\30\u008b\n\30\3\31\3\31"+
		"\5\31\u008f\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u0099\n"+
		"\34\f\34\16\34\u009c\13\34\3\35\3\35\7\35\u00a0\n\35\f\35\16\35\u00a3"+
		"\13\35\3\36\3\36\7\36\u00a7\n\36\f\36\16\36\u00aa\13\36\3\36\3\36\7\36"+
		"\u00ae\n\36\f\36\16\36\u00b1\13\36\5\36\u00b3\n\36\3\37\3\37\7\37\u00b7"+
		"\n\37\f\37\16\37\u00ba\13\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\6!\u00c5\n"+
		"!\r!\16!\u00c6\3!\3!\3\"\3\"\3\"\3\"\7\"\u00cf\n\"\f\"\16\"\u00d2\13\""+
		"\3\"\5\"\u00d5\n\"\3\"\3\"\3\"\3\"\3\"\7\"\u00dc\n\"\f\"\16\"\u00df\13"+
		"\"\3\"\3\"\5\"\u00e3\n\"\3\"\3\"\3\u00dd\2#\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2#\2%\2\'\2)\2+\2-\2"+
		"/\2\61\2\63\22\65\23\67\249\25;\26=\27?\30A\31C\32\3\2\6\4\2C\\c|\5\2"+
		"\13\f\"(*\u0080\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u00eb\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\3E\3\2\2\2\5H\3\2\2\2\7K\3\2\2\2\tN\3\2\2\2\13R\3\2\2\2\rV\3\2\2\2\17"+
		"Z\3\2\2\2\21^\3\2\2\2\23b\3\2\2\2\25f\3\2\2\2\27h\3\2\2\2\31j\3\2\2\2"+
		"\33m\3\2\2\2\35p\3\2\2\2\37s\3\2\2\2!v\3\2\2\2#x\3\2\2\2%{\3\2\2\2\'}"+
		"\3\2\2\2)\u0080\3\2\2\2+\u0083\3\2\2\2-\u0086\3\2\2\2/\u008a\3\2\2\2\61"+
		"\u008e\3\2\2\2\63\u0090\3\2\2\2\65\u0092\3\2\2\2\67\u0094\3\2\2\29\u009d"+
		"\3\2\2\2;\u00a4\3\2\2\2=\u00b4\3\2\2\2?\u00bd\3\2\2\2A\u00c4\3\2\2\2C"+
		"\u00e2\3\2\2\2EF\7Q\2\2FG\7T\2\2G\4\3\2\2\2HI\7Q\2\2IJ\7t\2\2J\6\3\2\2"+
		"\2KL\7q\2\2LM\7t\2\2M\b\3\2\2\2NO\7C\2\2OP\7P\2\2PQ\7F\2\2Q\n\3\2\2\2"+
		"RS\7C\2\2ST\7p\2\2TU\7f\2\2U\f\3\2\2\2VW\7c\2\2WX\7p\2\2XY\7f\2\2Y\16"+
		"\3\2\2\2Z[\7P\2\2[\\\7Q\2\2\\]\7V\2\2]\20\3\2\2\2^_\7P\2\2_`\7q\2\2`a"+
		"\7v\2\2a\22\3\2\2\2bc\7p\2\2cd\7q\2\2de\7v\2\2e\24\3\2\2\2fg\7>\2\2g\26"+
		"\3\2\2\2hi\7@\2\2i\30\3\2\2\2jk\7>\2\2kl\7?\2\2l\32\3\2\2\2mn\7@\2\2n"+
		"o\7?\2\2o\34\3\2\2\2pq\7?\2\2qr\7?\2\2r\36\3\2\2\2st\7>\2\2tu\7@\2\2u"+
		" \3\2\2\2vw\t\2\2\2w\"\3\2\2\2xy\4\62;\2y$\3\2\2\2z|\t\3\2\2{z\3\2\2\2"+
		"|&\3\2\2\2}~\5#\22\2~\177\5#\22\2\177(\3\2\2\2\u0080\u0081\5#\22\2\u0081"+
		"\u0082\5\'\24\2\u0082*\3\2\2\2\u0083\u0084\5#\22\2\u0084\u0085\5)\25\2"+
		"\u0085,\3\2\2\2\u0086\u0087\5+\26\2\u0087.\3\2\2\2\u0088\u008b\5#\22\2"+
		"\u0089\u008b\5\'\24\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\60"+
		"\3\2\2\2\u008c\u008f\5#\22\2\u008d\u008f\5\'\24\2\u008e\u008c\3\2\2\2"+
		"\u008e\u008d\3\2\2\2\u008f\62\3\2\2\2\u0090\u0091\7*\2\2\u0091\64\3\2"+
		"\2\2\u0092\u0093\7+\2\2\u0093\66\3\2\2\2\u0094\u009a\5!\21\2\u0095\u0099"+
		"\5!\21\2\u0096\u0099\5#\22\2\u0097\u0099\7a\2\2\u0098\u0095\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b8\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a1"+
		"\5#\22\2\u009e\u00a0\5#\22\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2:\3\2\2\2\u00a3\u00a1\3\2\2\2"+
		"\u00a4\u00a8\5#\22\2\u00a5\u00a7\5#\22\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00b2\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00af\7\60\2\2\u00ac\u00ae\5#\22\2\u00ad\u00ac\3"+
		"\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3<\3\2\2\2\u00b4\u00b8\7)\2\2\u00b5\u00b7\5%\23\2\u00b6\u00b5"+
		"\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7)\2\2\u00bc>\3\2\2\2\u00bd"+
		"\u00be\5-\27\2\u00be\u00bf\7/\2\2\u00bf\u00c0\5/\30\2\u00c0\u00c1\7/\2"+
		"\2\u00c1\u00c2\5\61\31\2\u00c2@\3\2\2\2\u00c3\u00c5\t\4\2\2\u00c4\u00c3"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c9\b!\2\2\u00c9B\3\2\2\2\u00ca\u00cb\7\61\2\2"+
		"\u00cb\u00cc\7\61\2\2\u00cc\u00d0\3\2\2\2\u00cd\u00cf\n\5\2\2\u00ce\u00cd"+
		"\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\7\17\2\2\u00d4\u00d3\3"+
		"\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00e3\7\f\2\2\u00d7"+
		"\u00d8\7\61\2\2\u00d8\u00d9\7,\2\2\u00d9\u00dd\3\2\2\2\u00da\u00dc\13"+
		"\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00de\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7,"+
		"\2\2\u00e1\u00e3\7\61\2\2\u00e2\u00ca\3\2\2\2\u00e2\u00d7\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\b\"\2\2\u00e5D\3\2\2\2\22\2{\u008a\u008e\u0098"+
		"\u009a\u00a1\u00a8\u00af\u00b2\u00b8\u00c6\u00d0\u00d4\u00dd\u00e2\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}