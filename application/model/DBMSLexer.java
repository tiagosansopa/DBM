package application.model;
// Generated from DBMS.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DBMSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, LPAREN=129, RPAREN=130, LBRACKET=131, 
		RBRACKET=132, EQ=133, KL=134, BOOLEAN=135, DATETIME=136, ID=137, NUM=138, 
		FLOAT=139, CHARX=140, DATE=141, WS=142, COMMENT=143, END_SQL=144, COMMA=145;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
		"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
		"T__65", "T__66", "T__67", "T__68", "T__69", "T__70", "T__71", "T__72", 
		"T__73", "T__74", "T__75", "T__76", "T__77", "T__78", "T__79", "T__80", 
		"T__81", "T__82", "T__83", "T__84", "T__85", "T__86", "T__87", "T__88", 
		"T__89", "T__90", "T__91", "T__92", "T__93", "T__94", "T__95", "T__96", 
		"T__97", "T__98", "T__99", "T__100", "T__101", "T__102", "T__103", "T__104", 
		"T__105", "T__106", "T__107", "T__108", "T__109", "T__110", "T__111", 
		"T__112", "T__113", "T__114", "T__115", "T__116", "T__117", "T__118", 
		"T__119", "T__120", "T__121", "T__122", "T__123", "T__124", "T__125", 
		"T__126", "T__127", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "EQ", 
		"KL", "BOOLEAN", "DATETIME", "LETTER", "DIGIT", "ASCII", "TWO_DIGITS", 
		"THREE_DIGITS", "FOUR_DIGITS", "YEAR", "MONTH", "DAY", "ID", "NUM", "FLOAT", 
		"CHARX", "DATE", "WS", "COMMENT", "END_SQL", "COMMA"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'INT'", "'Int'", "'int'", "'FLOAT'", "'Float'", "'float'", "'DATE'", 
		"'Date'", "'date'", "'CHAR'", "'Char'", "'char'", "'and'", "'AND'", "'And'", 
		"'or'", "'OR'", "'Or'", "'not'", "'NOT'", "'Not'", "'CREATE'", "'Create'", 
		"'create'", "'DATABASE'", "'Database'", "'database'", "'DATABASES'", "'Databases'", 
		"'databases'", "'TABLE'", "'Table'", "'table'", "'TABLES'", "'Tables'", 
		"'tables'", "'COLUMN'", "'Column'", "'column'", "'COLUMNS'", "'Columns'", 
		"'SHOW'", "'Show'", "'show'", "'DROP'", "'Drop'", "'drop'", "'ALTER'", 
		"'Alter'", "'alter'", "'USE'", "'Use'", "'use'", "'RENAME'", "'Rename'", 
		"'rename'", "'CONSTRAINT'", "'Constraint'", "'constraint'", "'KEY'", "'Key'", 
		"'key'", "'PRIMARY'", "'Primary'", "'primary'", "'FOREIGN'", "'Foreign'", 
		"'foreign'", "'CHECK'", "'Check'", "'check'", "'SELECT'", "'Select'", 
		"'select'", "'FROM'", "'From'", "'from'", "'WHERE'", "'Where'", "'where'", 
		"'ASC'", "'Asc'", "'asc'", "'DESC'", "'Desc'", "'desc'", "'TO'", "'To'", 
		"'to'", "'REFERENCES'", "'References'", "'references'", "'ADD'", "'Add'", 
		"'add'", "'INSERT'", "'Insert'", "'insert'", "'INTO'", "'Into'", "'into'", 
		"'VALUES'", "'Values'", "'values'", "'UPDATE'", "'Update'", "'update'", 
		"'SET'", "'Set'", "'set'", "'DELETE'", "'Delete'", "'delete'", "'ORDER'", 
		"'Order'", "'order'", "'BY'", "'By'", "'by'", "'<'", "'>'", "'<='", "'>='", 
		"'<>'", "'+'", "'-'", "'/'", "'%'", "'('", "')'", "'['", "']'", "'='", 
		"'*'", "'boolean'", "'datetime'", null, null, null, null, null, null, 
		null, "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "LPAREN", "RPAREN", 
		"LBRACKET", "RBRACKET", "EQ", "KL", "BOOLEAN", "DATETIME", "ID", "NUM", 
		"FLOAT", "CHARX", "DATE", "WS", "COMMENT", "END_SQL", "COMMA"
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


	public DBMSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DBMS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\u0093\u04a1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k"+
		"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv"+
		"\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t"+
		"\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
		"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089"+
		"\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d"+
		"\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092"+
		"\t\u0092\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096"+
		"\4\u0097\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b"+
		"\t\u009b\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3"+
		"/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\38\38\38\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3"+
		"F\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3"+
		"J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3"+
		"N\3N\3N\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3"+
		"R\3R\3S\3S\3S\3S\3T\3T\3T\3T\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3W\3W\3W\3"+
		"W\3W\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3"+
		"]\3^\3^\3^\3^\3_\3_\3_\3_\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3a\3b\3b\3b\3"+
		"b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3f\3f\3"+
		"f\3f\3f\3g\3g\3g\3g\3g\3g\3g\3h\3h\3h\3h\3h\3h\3h\3i\3i\3i\3i\3i\3i\3"+
		"i\3j\3j\3j\3j\3j\3j\3j\3k\3k\3k\3k\3k\3k\3k\3l\3l\3l\3l\3l\3l\3l\3m\3"+
		"m\3m\3m\3n\3n\3n\3n\3o\3o\3o\3o\3p\3p\3p\3p\3p\3p\3p\3q\3q\3q\3q\3q\3"+
		"q\3q\3r\3r\3r\3r\3r\3r\3r\3s\3s\3s\3s\3s\3s\3t\3t\3t\3t\3t\3t\3u\3u\3"+
		"u\3u\3u\3u\3v\3v\3v\3w\3w\3w\3x\3x\3x\3y\3y\3z\3z\3{\3{\3{\3|\3|\3|\3"+
		"}\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087"+
		"\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\5\u008c\u0437\n\u008c\3\u008d"+
		"\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u0090"+
		"\3\u0090\3\u0091\3\u0091\5\u0091\u0446\n\u0091\3\u0092\3\u0092\5\u0092"+
		"\u044a\n\u0092\3\u0093\3\u0093\3\u0093\3\u0093\7\u0093\u0450\n\u0093\f"+
		"\u0093\16\u0093\u0453\13\u0093\3\u0094\3\u0094\7\u0094\u0457\n\u0094\f"+
		"\u0094\16\u0094\u045a\13\u0094\3\u0095\3\u0095\7\u0095\u045e\n\u0095\f"+
		"\u0095\16\u0095\u0461\13\u0095\3\u0095\3\u0095\7\u0095\u0465\n\u0095\f"+
		"\u0095\16\u0095\u0468\13\u0095\5\u0095\u046a\n\u0095\3\u0096\3\u0096\7"+
		"\u0096\u046e\n\u0096\f\u0096\16\u0096\u0471\13\u0096\3\u0096\3\u0096\3"+
		"\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\6\u0098\u047c\n"+
		"\u0098\r\u0098\16\u0098\u047d\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\7\u0099\u0486\n\u0099\f\u0099\16\u0099\u0489\13\u0099\3\u0099"+
		"\5\u0099\u048c\n\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\7\u0099"+
		"\u0493\n\u0099\f\u0099\16\u0099\u0496\13\u0099\3\u0099\3\u0099\5\u0099"+
		"\u049a\n\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009b\3\u009b\3\u0494"+
		"\2\u009c\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66"+
		"k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG"+
		"\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f"+
		"Q\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3"+
		"[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7"+
		"e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3k\u00d5l\u00d7m\u00d9n\u00db"+
		"o\u00ddp\u00dfq\u00e1r\u00e3s\u00e5t\u00e7u\u00e9v\u00ebw\u00edx\u00ef"+
		"y\u00f1z\u00f3{\u00f5|\u00f7}\u00f9~\u00fb\177\u00fd\u0080\u00ff\u0081"+
		"\u0101\u0082\u0103\u0083\u0105\u0084\u0107\u0085\u0109\u0086\u010b\u0087"+
		"\u010d\u0088\u010f\u0089\u0111\u008a\u0113\2\u0115\2\u0117\2\u0119\2\u011b"+
		"\2\u011d\2\u011f\2\u0121\2\u0123\2\u0125\u008b\u0127\u008c\u0129\u008d"+
		"\u012b\u008e\u012d\u008f\u012f\u0090\u0131\u0091\u0133\u0092\u0135\u0093"+
		"\3\2\6\4\2C\\c|\5\2\13\f\"(*\u0080\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u04a6"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2"+
		"\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd"+
		"\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2"+
		"\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df"+
		"\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2"+
		"\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1"+
		"\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2"+
		"\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\2\u0101\3\2\2\2\2\u0103"+
		"\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109\3\2\2\2\2\u010b\3\2\2"+
		"\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2\2\2\u0125\3\2\2\2\2\u0127"+
		"\3\2\2\2\2\u0129\3\2\2\2\2\u012b\3\2\2\2\2\u012d\3\2\2\2\2\u012f\3\2\2"+
		"\2\2\u0131\3\2\2\2\2\u0133\3\2\2\2\2\u0135\3\2\2\2\3\u0137\3\2\2\2\5\u013b"+
		"\3\2\2\2\7\u013f\3\2\2\2\t\u0143\3\2\2\2\13\u0149\3\2\2\2\r\u014f\3\2"+
		"\2\2\17\u0155\3\2\2\2\21\u015a\3\2\2\2\23\u015f\3\2\2\2\25\u0164\3\2\2"+
		"\2\27\u0169\3\2\2\2\31\u016e\3\2\2\2\33\u0173\3\2\2\2\35\u0177\3\2\2\2"+
		"\37\u017b\3\2\2\2!\u017f\3\2\2\2#\u0182\3\2\2\2%\u0185\3\2\2\2\'\u0188"+
		"\3\2\2\2)\u018c\3\2\2\2+\u0190\3\2\2\2-\u0194\3\2\2\2/\u019b\3\2\2\2\61"+
		"\u01a2\3\2\2\2\63\u01a9\3\2\2\2\65\u01b2\3\2\2\2\67\u01bb\3\2\2\29\u01c4"+
		"\3\2\2\2;\u01ce\3\2\2\2=\u01d8\3\2\2\2?\u01e2\3\2\2\2A\u01e8\3\2\2\2C"+
		"\u01ee\3\2\2\2E\u01f4\3\2\2\2G\u01fb\3\2\2\2I\u0202\3\2\2\2K\u0209\3\2"+
		"\2\2M\u0210\3\2\2\2O\u0217\3\2\2\2Q\u021e\3\2\2\2S\u0226\3\2\2\2U\u022e"+
		"\3\2\2\2W\u0233\3\2\2\2Y\u0238\3\2\2\2[\u023d\3\2\2\2]\u0242\3\2\2\2_"+
		"\u0247\3\2\2\2a\u024c\3\2\2\2c\u0252\3\2\2\2e\u0258\3\2\2\2g\u025e\3\2"+
		"\2\2i\u0262\3\2\2\2k\u0266\3\2\2\2m\u026a\3\2\2\2o\u0271\3\2\2\2q\u0278"+
		"\3\2\2\2s\u027f\3\2\2\2u\u028a\3\2\2\2w\u0295\3\2\2\2y\u02a0\3\2\2\2{"+
		"\u02a4\3\2\2\2}\u02a8\3\2\2\2\177\u02ac\3\2\2\2\u0081\u02b4\3\2\2\2\u0083"+
		"\u02bc\3\2\2\2\u0085\u02c4\3\2\2\2\u0087\u02cc\3\2\2\2\u0089\u02d4\3\2"+
		"\2\2\u008b\u02dc\3\2\2\2\u008d\u02e2\3\2\2\2\u008f\u02e8\3\2\2\2\u0091"+
		"\u02ee\3\2\2\2\u0093\u02f5\3\2\2\2\u0095\u02fc\3\2\2\2\u0097\u0303\3\2"+
		"\2\2\u0099\u0308\3\2\2\2\u009b\u030d\3\2\2\2\u009d\u0312\3\2\2\2\u009f"+
		"\u0318\3\2\2\2\u00a1\u031e\3\2\2\2\u00a3\u0324\3\2\2\2\u00a5\u0328\3\2"+
		"\2\2\u00a7\u032c\3\2\2\2\u00a9\u0330\3\2\2\2\u00ab\u0335\3\2\2\2\u00ad"+
		"\u033a\3\2\2\2\u00af\u033f\3\2\2\2\u00b1\u0342\3\2\2\2\u00b3\u0345\3\2"+
		"\2\2\u00b5\u0348\3\2\2\2\u00b7\u0353\3\2\2\2\u00b9\u035e\3\2\2\2\u00bb"+
		"\u0369\3\2\2\2\u00bd\u036d\3\2\2\2\u00bf\u0371\3\2\2\2\u00c1\u0375\3\2"+
		"\2\2\u00c3\u037c\3\2\2\2\u00c5\u0383\3\2\2\2\u00c7\u038a\3\2\2\2\u00c9"+
		"\u038f\3\2\2\2\u00cb\u0394\3\2\2\2\u00cd\u0399\3\2\2\2\u00cf\u03a0\3\2"+
		"\2\2\u00d1\u03a7\3\2\2\2\u00d3\u03ae\3\2\2\2\u00d5\u03b5\3\2\2\2\u00d7"+
		"\u03bc\3\2\2\2\u00d9\u03c3\3\2\2\2\u00db\u03c7\3\2\2\2\u00dd\u03cb\3\2"+
		"\2\2\u00df\u03cf\3\2\2\2\u00e1\u03d6\3\2\2\2\u00e3\u03dd\3\2\2\2\u00e5"+
		"\u03e4\3\2\2\2\u00e7\u03ea\3\2\2\2\u00e9\u03f0\3\2\2\2\u00eb\u03f6\3\2"+
		"\2\2\u00ed\u03f9\3\2\2\2\u00ef\u03fc\3\2\2\2\u00f1\u03ff\3\2\2\2\u00f3"+
		"\u0401\3\2\2\2\u00f5\u0403\3\2\2\2\u00f7\u0406\3\2\2\2\u00f9\u0409\3\2"+
		"\2\2\u00fb\u040c\3\2\2\2\u00fd\u040e\3\2\2\2\u00ff\u0410\3\2\2\2\u0101"+
		"\u0412\3\2\2\2\u0103\u0414\3\2\2\2\u0105\u0416\3\2\2\2\u0107\u0418\3\2"+
		"\2\2\u0109\u041a\3\2\2\2\u010b\u041c\3\2\2\2\u010d\u041e\3\2\2\2\u010f"+
		"\u0420\3\2\2\2\u0111\u0428\3\2\2\2\u0113\u0431\3\2\2\2\u0115\u0433\3\2"+
		"\2\2\u0117\u0436\3\2\2\2\u0119\u0438\3\2\2\2\u011b\u043b\3\2\2\2\u011d"+
		"\u043e\3\2\2\2\u011f\u0441\3\2\2\2\u0121\u0445\3\2\2\2\u0123\u0449\3\2"+
		"\2\2\u0125\u044b\3\2\2\2\u0127\u0454\3\2\2\2\u0129\u045b\3\2\2\2\u012b"+
		"\u046b\3\2\2\2\u012d\u0474\3\2\2\2\u012f\u047b\3\2\2\2\u0131\u0499\3\2"+
		"\2\2\u0133\u049d\3\2\2\2\u0135\u049f\3\2\2\2\u0137\u0138\7K\2\2\u0138"+
		"\u0139\7P\2\2\u0139\u013a\7V\2\2\u013a\4\3\2\2\2\u013b\u013c\7K\2\2\u013c"+
		"\u013d\7p\2\2\u013d\u013e\7v\2\2\u013e\6\3\2\2\2\u013f\u0140\7k\2\2\u0140"+
		"\u0141\7p\2\2\u0141\u0142\7v\2\2\u0142\b\3\2\2\2\u0143\u0144\7H\2\2\u0144"+
		"\u0145\7N\2\2\u0145\u0146\7Q\2\2\u0146\u0147\7C\2\2\u0147\u0148\7V\2\2"+
		"\u0148\n\3\2\2\2\u0149\u014a\7H\2\2\u014a\u014b\7n\2\2\u014b\u014c\7q"+
		"\2\2\u014c\u014d\7c\2\2\u014d\u014e\7v\2\2\u014e\f\3\2\2\2\u014f\u0150"+
		"\7h\2\2\u0150\u0151\7n\2\2\u0151\u0152\7q\2\2\u0152\u0153\7c\2\2\u0153"+
		"\u0154\7v\2\2\u0154\16\3\2\2\2\u0155\u0156\7F\2\2\u0156\u0157\7C\2\2\u0157"+
		"\u0158\7V\2\2\u0158\u0159\7G\2\2\u0159\20\3\2\2\2\u015a\u015b\7F\2\2\u015b"+
		"\u015c\7c\2\2\u015c\u015d\7v\2\2\u015d\u015e\7g\2\2\u015e\22\3\2\2\2\u015f"+
		"\u0160\7f\2\2\u0160\u0161\7c\2\2\u0161\u0162\7v\2\2\u0162\u0163\7g\2\2"+
		"\u0163\24\3\2\2\2\u0164\u0165\7E\2\2\u0165\u0166\7J\2\2\u0166\u0167\7"+
		"C\2\2\u0167\u0168\7T\2\2\u0168\26\3\2\2\2\u0169\u016a\7E\2\2\u016a\u016b"+
		"\7j\2\2\u016b\u016c\7c\2\2\u016c\u016d\7t\2\2\u016d\30\3\2\2\2\u016e\u016f"+
		"\7e\2\2\u016f\u0170\7j\2\2\u0170\u0171\7c\2\2\u0171\u0172\7t\2\2\u0172"+
		"\32\3\2\2\2\u0173\u0174\7c\2\2\u0174\u0175\7p\2\2\u0175\u0176\7f\2\2\u0176"+
		"\34\3\2\2\2\u0177\u0178\7C\2\2\u0178\u0179\7P\2\2\u0179\u017a\7F\2\2\u017a"+
		"\36\3\2\2\2\u017b\u017c\7C\2\2\u017c\u017d\7p\2\2\u017d\u017e\7f\2\2\u017e"+
		" \3\2\2\2\u017f\u0180\7q\2\2\u0180\u0181\7t\2\2\u0181\"\3\2\2\2\u0182"+
		"\u0183\7Q\2\2\u0183\u0184\7T\2\2\u0184$\3\2\2\2\u0185\u0186\7Q\2\2\u0186"+
		"\u0187\7t\2\2\u0187&\3\2\2\2\u0188\u0189\7p\2\2\u0189\u018a\7q\2\2\u018a"+
		"\u018b\7v\2\2\u018b(\3\2\2\2\u018c\u018d\7P\2\2\u018d\u018e\7Q\2\2\u018e"+
		"\u018f\7V\2\2\u018f*\3\2\2\2\u0190\u0191\7P\2\2\u0191\u0192\7q\2\2\u0192"+
		"\u0193\7v\2\2\u0193,\3\2\2\2\u0194\u0195\7E\2\2\u0195\u0196\7T\2\2\u0196"+
		"\u0197\7G\2\2\u0197\u0198\7C\2\2\u0198\u0199\7V\2\2\u0199\u019a\7G\2\2"+
		"\u019a.\3\2\2\2\u019b\u019c\7E\2\2\u019c\u019d\7t\2\2\u019d\u019e\7g\2"+
		"\2\u019e\u019f\7c\2\2\u019f\u01a0\7v\2\2\u01a0\u01a1\7g\2\2\u01a1\60\3"+
		"\2\2\2\u01a2\u01a3\7e\2\2\u01a3\u01a4\7t\2\2\u01a4\u01a5\7g\2\2\u01a5"+
		"\u01a6\7c\2\2\u01a6\u01a7\7v\2\2\u01a7\u01a8\7g\2\2\u01a8\62\3\2\2\2\u01a9"+
		"\u01aa\7F\2\2\u01aa\u01ab\7C\2\2\u01ab\u01ac\7V\2\2\u01ac\u01ad\7C\2\2"+
		"\u01ad\u01ae\7D\2\2\u01ae\u01af\7C\2\2\u01af\u01b0\7U\2\2\u01b0\u01b1"+
		"\7G\2\2\u01b1\64\3\2\2\2\u01b2\u01b3\7F\2\2\u01b3\u01b4\7c\2\2\u01b4\u01b5"+
		"\7v\2\2\u01b5\u01b6\7c\2\2\u01b6\u01b7\7d\2\2\u01b7\u01b8\7c\2\2\u01b8"+
		"\u01b9\7u\2\2\u01b9\u01ba\7g\2\2\u01ba\66\3\2\2\2\u01bb\u01bc\7f\2\2\u01bc"+
		"\u01bd\7c\2\2\u01bd\u01be\7v\2\2\u01be\u01bf\7c\2\2\u01bf\u01c0\7d\2\2"+
		"\u01c0\u01c1\7c\2\2\u01c1\u01c2\7u\2\2\u01c2\u01c3\7g\2\2\u01c38\3\2\2"+
		"\2\u01c4\u01c5\7F\2\2\u01c5\u01c6\7C\2\2\u01c6\u01c7\7V\2\2\u01c7\u01c8"+
		"\7C\2\2\u01c8\u01c9\7D\2\2\u01c9\u01ca\7C\2\2\u01ca\u01cb\7U\2\2\u01cb"+
		"\u01cc\7G\2\2\u01cc\u01cd\7U\2\2\u01cd:\3\2\2\2\u01ce\u01cf\7F\2\2\u01cf"+
		"\u01d0\7c\2\2\u01d0\u01d1\7v\2\2\u01d1\u01d2\7c\2\2\u01d2\u01d3\7d\2\2"+
		"\u01d3\u01d4\7c\2\2\u01d4\u01d5\7u\2\2\u01d5\u01d6\7g\2\2\u01d6\u01d7"+
		"\7u\2\2\u01d7<\3\2\2\2\u01d8\u01d9\7f\2\2\u01d9\u01da\7c\2\2\u01da\u01db"+
		"\7v\2\2\u01db\u01dc\7c\2\2\u01dc\u01dd\7d\2\2\u01dd\u01de\7c\2\2\u01de"+
		"\u01df\7u\2\2\u01df\u01e0\7g\2\2\u01e0\u01e1\7u\2\2\u01e1>\3\2\2\2\u01e2"+
		"\u01e3\7V\2\2\u01e3\u01e4\7C\2\2\u01e4\u01e5\7D\2\2\u01e5\u01e6\7N\2\2"+
		"\u01e6\u01e7\7G\2\2\u01e7@\3\2\2\2\u01e8\u01e9\7V\2\2\u01e9\u01ea\7c\2"+
		"\2\u01ea\u01eb\7d\2\2\u01eb\u01ec\7n\2\2\u01ec\u01ed\7g\2\2\u01edB\3\2"+
		"\2\2\u01ee\u01ef\7v\2\2\u01ef\u01f0\7c\2\2\u01f0\u01f1\7d\2\2\u01f1\u01f2"+
		"\7n\2\2\u01f2\u01f3\7g\2\2\u01f3D\3\2\2\2\u01f4\u01f5\7V\2\2\u01f5\u01f6"+
		"\7C\2\2\u01f6\u01f7\7D\2\2\u01f7\u01f8\7N\2\2\u01f8\u01f9\7G\2\2\u01f9"+
		"\u01fa\7U\2\2\u01faF\3\2\2\2\u01fb\u01fc\7V\2\2\u01fc\u01fd\7c\2\2\u01fd"+
		"\u01fe\7d\2\2\u01fe\u01ff\7n\2\2\u01ff\u0200\7g\2\2\u0200\u0201\7u\2\2"+
		"\u0201H\3\2\2\2\u0202\u0203\7v\2\2\u0203\u0204\7c\2\2\u0204\u0205\7d\2"+
		"\2\u0205\u0206\7n\2\2\u0206\u0207\7g\2\2\u0207\u0208\7u\2\2\u0208J\3\2"+
		"\2\2\u0209\u020a\7E\2\2\u020a\u020b\7Q\2\2\u020b\u020c\7N\2\2\u020c\u020d"+
		"\7W\2\2\u020d\u020e\7O\2\2\u020e\u020f\7P\2\2\u020fL\3\2\2\2\u0210\u0211"+
		"\7E\2\2\u0211\u0212\7q\2\2\u0212\u0213\7n\2\2\u0213\u0214\7w\2\2\u0214"+
		"\u0215\7o\2\2\u0215\u0216\7p\2\2\u0216N\3\2\2\2\u0217\u0218\7e\2\2\u0218"+
		"\u0219\7q\2\2\u0219\u021a\7n\2\2\u021a\u021b\7w\2\2\u021b\u021c\7o\2\2"+
		"\u021c\u021d\7p\2\2\u021dP\3\2\2\2\u021e\u021f\7E\2\2\u021f\u0220\7Q\2"+
		"\2\u0220\u0221\7N\2\2\u0221\u0222\7W\2\2\u0222\u0223\7O\2\2\u0223\u0224"+
		"\7P\2\2\u0224\u0225\7U\2\2\u0225R\3\2\2\2\u0226\u0227\7E\2\2\u0227\u0228"+
		"\7q\2\2\u0228\u0229\7n\2\2\u0229\u022a\7w\2\2\u022a\u022b\7o\2\2\u022b"+
		"\u022c\7p\2\2\u022c\u022d\7u\2\2\u022dT\3\2\2\2\u022e\u022f\7U\2\2\u022f"+
		"\u0230\7J\2\2\u0230\u0231\7Q\2\2\u0231\u0232\7Y\2\2\u0232V\3\2\2\2\u0233"+
		"\u0234\7U\2\2\u0234\u0235\7j\2\2\u0235\u0236\7q\2\2\u0236\u0237\7y\2\2"+
		"\u0237X\3\2\2\2\u0238\u0239\7u\2\2\u0239\u023a\7j\2\2\u023a\u023b\7q\2"+
		"\2\u023b\u023c\7y\2\2\u023cZ\3\2\2\2\u023d\u023e\7F\2\2\u023e\u023f\7"+
		"T\2\2\u023f\u0240\7Q\2\2\u0240\u0241\7R\2\2\u0241\\\3\2\2\2\u0242\u0243"+
		"\7F\2\2\u0243\u0244\7t\2\2\u0244\u0245\7q\2\2\u0245\u0246\7r\2\2\u0246"+
		"^\3\2\2\2\u0247\u0248\7f\2\2\u0248\u0249\7t\2\2\u0249\u024a\7q\2\2\u024a"+
		"\u024b\7r\2\2\u024b`\3\2\2\2\u024c\u024d\7C\2\2\u024d\u024e\7N\2\2\u024e"+
		"\u024f\7V\2\2\u024f\u0250\7G\2\2\u0250\u0251\7T\2\2\u0251b\3\2\2\2\u0252"+
		"\u0253\7C\2\2\u0253\u0254\7n\2\2\u0254\u0255\7v\2\2\u0255\u0256\7g\2\2"+
		"\u0256\u0257\7t\2\2\u0257d\3\2\2\2\u0258\u0259\7c\2\2\u0259\u025a\7n\2"+
		"\2\u025a\u025b\7v\2\2\u025b\u025c\7g\2\2\u025c\u025d\7t\2\2\u025df\3\2"+
		"\2\2\u025e\u025f\7W\2\2\u025f\u0260\7U\2\2\u0260\u0261\7G\2\2\u0261h\3"+
		"\2\2\2\u0262\u0263\7W\2\2\u0263\u0264\7u\2\2\u0264\u0265\7g\2\2\u0265"+
		"j\3\2\2\2\u0266\u0267\7w\2\2\u0267\u0268\7u\2\2\u0268\u0269\7g\2\2\u0269"+
		"l\3\2\2\2\u026a\u026b\7T\2\2\u026b\u026c\7G\2\2\u026c\u026d\7P\2\2\u026d"+
		"\u026e\7C\2\2\u026e\u026f\7O\2\2\u026f\u0270\7G\2\2\u0270n\3\2\2\2\u0271"+
		"\u0272\7T\2\2\u0272\u0273\7g\2\2\u0273\u0274\7p\2\2\u0274\u0275\7c\2\2"+
		"\u0275\u0276\7o\2\2\u0276\u0277\7g\2\2\u0277p\3\2\2\2\u0278\u0279\7t\2"+
		"\2\u0279\u027a\7g\2\2\u027a\u027b\7p\2\2\u027b\u027c\7c\2\2\u027c\u027d"+
		"\7o\2\2\u027d\u027e\7g\2\2\u027er\3\2\2\2\u027f\u0280\7E\2\2\u0280\u0281"+
		"\7Q\2\2\u0281\u0282\7P\2\2\u0282\u0283\7U\2\2\u0283\u0284\7V\2\2\u0284"+
		"\u0285\7T\2\2\u0285\u0286\7C\2\2\u0286\u0287\7K\2\2\u0287\u0288\7P\2\2"+
		"\u0288\u0289\7V\2\2\u0289t\3\2\2\2\u028a\u028b\7E\2\2\u028b\u028c\7q\2"+
		"\2\u028c\u028d\7p\2\2\u028d\u028e\7u\2\2\u028e\u028f\7v\2\2\u028f\u0290"+
		"\7t\2\2\u0290\u0291\7c\2\2\u0291\u0292\7k\2\2\u0292\u0293\7p\2\2\u0293"+
		"\u0294\7v\2\2\u0294v\3\2\2\2\u0295\u0296\7e\2\2\u0296\u0297\7q\2\2\u0297"+
		"\u0298\7p\2\2\u0298\u0299\7u\2\2\u0299\u029a\7v\2\2\u029a\u029b\7t\2\2"+
		"\u029b\u029c\7c\2\2\u029c\u029d\7k\2\2\u029d\u029e\7p\2\2\u029e\u029f"+
		"\7v\2\2\u029fx\3\2\2\2\u02a0\u02a1\7M\2\2\u02a1\u02a2\7G\2\2\u02a2\u02a3"+
		"\7[\2\2\u02a3z\3\2\2\2\u02a4\u02a5\7M\2\2\u02a5\u02a6\7g\2\2\u02a6\u02a7"+
		"\7{\2\2\u02a7|\3\2\2\2\u02a8\u02a9\7m\2\2\u02a9\u02aa\7g\2\2\u02aa\u02ab"+
		"\7{\2\2\u02ab~\3\2\2\2\u02ac\u02ad\7R\2\2\u02ad\u02ae\7T\2\2\u02ae\u02af"+
		"\7K\2\2\u02af\u02b0\7O\2\2\u02b0\u02b1\7C\2\2\u02b1\u02b2\7T\2\2\u02b2"+
		"\u02b3\7[\2\2\u02b3\u0080\3\2\2\2\u02b4\u02b5\7R\2\2\u02b5\u02b6\7t\2"+
		"\2\u02b6\u02b7\7k\2\2\u02b7\u02b8\7o\2\2\u02b8\u02b9\7c\2\2\u02b9\u02ba"+
		"\7t\2\2\u02ba\u02bb\7{\2\2\u02bb\u0082\3\2\2\2\u02bc\u02bd\7r\2\2\u02bd"+
		"\u02be\7t\2\2\u02be\u02bf\7k\2\2\u02bf\u02c0\7o\2\2\u02c0\u02c1\7c\2\2"+
		"\u02c1\u02c2\7t\2\2\u02c2\u02c3\7{\2\2\u02c3\u0084\3\2\2\2\u02c4\u02c5"+
		"\7H\2\2\u02c5\u02c6\7Q\2\2\u02c6\u02c7\7T\2\2\u02c7\u02c8\7G\2\2\u02c8"+
		"\u02c9\7K\2\2\u02c9\u02ca\7I\2\2\u02ca\u02cb\7P\2\2\u02cb\u0086\3\2\2"+
		"\2\u02cc\u02cd\7H\2\2\u02cd\u02ce\7q\2\2\u02ce\u02cf\7t\2\2\u02cf\u02d0"+
		"\7g\2\2\u02d0\u02d1\7k\2\2\u02d1\u02d2\7i\2\2\u02d2\u02d3\7p\2\2\u02d3"+
		"\u0088\3\2\2\2\u02d4\u02d5\7h\2\2\u02d5\u02d6\7q\2\2\u02d6\u02d7\7t\2"+
		"\2\u02d7\u02d8\7g\2\2\u02d8\u02d9\7k\2\2\u02d9\u02da\7i\2\2\u02da\u02db"+
		"\7p\2\2\u02db\u008a\3\2\2\2\u02dc\u02dd\7E\2\2\u02dd\u02de\7J\2\2\u02de"+
		"\u02df\7G\2\2\u02df\u02e0\7E\2\2\u02e0\u02e1\7M\2\2\u02e1\u008c\3\2\2"+
		"\2\u02e2\u02e3\7E\2\2\u02e3\u02e4\7j\2\2\u02e4\u02e5\7g\2\2\u02e5\u02e6"+
		"\7e\2\2\u02e6\u02e7\7m\2\2\u02e7\u008e\3\2\2\2\u02e8\u02e9\7e\2\2\u02e9"+
		"\u02ea\7j\2\2\u02ea\u02eb\7g\2\2\u02eb\u02ec\7e\2\2\u02ec\u02ed\7m\2\2"+
		"\u02ed\u0090\3\2\2\2\u02ee\u02ef\7U\2\2\u02ef\u02f0\7G\2\2\u02f0\u02f1"+
		"\7N\2\2\u02f1\u02f2\7G\2\2\u02f2\u02f3\7E\2\2\u02f3\u02f4\7V\2\2\u02f4"+
		"\u0092\3\2\2\2\u02f5\u02f6\7U\2\2\u02f6\u02f7\7g\2\2\u02f7\u02f8\7n\2"+
		"\2\u02f8\u02f9\7g\2\2\u02f9\u02fa\7e\2\2\u02fa\u02fb\7v\2\2\u02fb\u0094"+
		"\3\2\2\2\u02fc\u02fd\7u\2\2\u02fd\u02fe\7g\2\2\u02fe\u02ff\7n\2\2\u02ff"+
		"\u0300\7g\2\2\u0300\u0301\7e\2\2\u0301\u0302\7v\2\2\u0302\u0096\3\2\2"+
		"\2\u0303\u0304\7H\2\2\u0304\u0305\7T\2\2\u0305\u0306\7Q\2\2\u0306\u0307"+
		"\7O\2\2\u0307\u0098\3\2\2\2\u0308\u0309\7H\2\2\u0309\u030a\7t\2\2\u030a"+
		"\u030b\7q\2\2\u030b\u030c\7o\2\2\u030c\u009a\3\2\2\2\u030d\u030e\7h\2"+
		"\2\u030e\u030f\7t\2\2\u030f\u0310\7q\2\2\u0310\u0311\7o\2\2\u0311\u009c"+
		"\3\2\2\2\u0312\u0313\7Y\2\2\u0313\u0314\7J\2\2\u0314\u0315\7G\2\2\u0315"+
		"\u0316\7T\2\2\u0316\u0317\7G\2\2\u0317\u009e\3\2\2\2\u0318\u0319\7Y\2"+
		"\2\u0319\u031a\7j\2\2\u031a\u031b\7g\2\2\u031b\u031c\7t\2\2\u031c\u031d"+
		"\7g\2\2\u031d\u00a0\3\2\2\2\u031e\u031f\7y\2\2\u031f\u0320\7j\2\2\u0320"+
		"\u0321\7g\2\2\u0321\u0322\7t\2\2\u0322\u0323\7g\2\2\u0323\u00a2\3\2\2"+
		"\2\u0324\u0325\7C\2\2\u0325\u0326\7U\2\2\u0326\u0327\7E\2\2\u0327\u00a4"+
		"\3\2\2\2\u0328\u0329\7C\2\2\u0329\u032a\7u\2\2\u032a\u032b\7e\2\2\u032b"+
		"\u00a6\3\2\2\2\u032c\u032d\7c\2\2\u032d\u032e\7u\2\2\u032e\u032f\7e\2"+
		"\2\u032f\u00a8\3\2\2\2\u0330\u0331\7F\2\2\u0331\u0332\7G\2\2\u0332\u0333"+
		"\7U\2\2\u0333\u0334\7E\2\2\u0334\u00aa\3\2\2\2\u0335\u0336\7F\2\2\u0336"+
		"\u0337\7g\2\2\u0337\u0338\7u\2\2\u0338\u0339\7e\2\2\u0339\u00ac\3\2\2"+
		"\2\u033a\u033b\7f\2\2\u033b\u033c\7g\2\2\u033c\u033d\7u\2\2\u033d\u033e"+
		"\7e\2\2\u033e\u00ae\3\2\2\2\u033f\u0340\7V\2\2\u0340\u0341\7Q\2\2\u0341"+
		"\u00b0\3\2\2\2\u0342\u0343\7V\2\2\u0343\u0344\7q\2\2\u0344\u00b2\3\2\2"+
		"\2\u0345\u0346\7v\2\2\u0346\u0347\7q\2\2\u0347\u00b4\3\2\2\2\u0348\u0349"+
		"\7T\2\2\u0349\u034a\7G\2\2\u034a\u034b\7H\2\2\u034b\u034c\7G\2\2\u034c"+
		"\u034d\7T\2\2\u034d\u034e\7G\2\2\u034e\u034f\7P\2\2\u034f\u0350\7E\2\2"+
		"\u0350\u0351\7G\2\2\u0351\u0352\7U\2\2\u0352\u00b6\3\2\2\2\u0353\u0354"+
		"\7T\2\2\u0354\u0355\7g\2\2\u0355\u0356\7h\2\2\u0356\u0357\7g\2\2\u0357"+
		"\u0358\7t\2\2\u0358\u0359\7g\2\2\u0359\u035a\7p\2\2\u035a\u035b\7e\2\2"+
		"\u035b\u035c\7g\2\2\u035c\u035d\7u\2\2\u035d\u00b8\3\2\2\2\u035e\u035f"+
		"\7t\2\2\u035f\u0360\7g\2\2\u0360\u0361\7h\2\2\u0361\u0362\7g\2\2\u0362"+
		"\u0363\7t\2\2\u0363\u0364\7g\2\2\u0364\u0365\7p\2\2\u0365\u0366\7e\2\2"+
		"\u0366\u0367\7g\2\2\u0367\u0368\7u\2\2\u0368\u00ba\3\2\2\2\u0369\u036a"+
		"\7C\2\2\u036a\u036b\7F\2\2\u036b\u036c\7F\2\2\u036c\u00bc\3\2\2\2\u036d"+
		"\u036e\7C\2\2\u036e\u036f\7f\2\2\u036f\u0370\7f\2\2\u0370\u00be\3\2\2"+
		"\2\u0371\u0372\7c\2\2\u0372\u0373\7f\2\2\u0373\u0374\7f\2\2\u0374\u00c0"+
		"\3\2\2\2\u0375\u0376\7K\2\2\u0376\u0377\7P\2\2\u0377\u0378\7U\2\2\u0378"+
		"\u0379\7G\2\2\u0379\u037a\7T\2\2\u037a\u037b\7V\2\2\u037b\u00c2\3\2\2"+
		"\2\u037c\u037d\7K\2\2\u037d\u037e\7p\2\2\u037e\u037f\7u\2\2\u037f\u0380"+
		"\7g\2\2\u0380\u0381\7t\2\2\u0381\u0382\7v\2\2\u0382\u00c4\3\2\2\2\u0383"+
		"\u0384\7k\2\2\u0384\u0385\7p\2\2\u0385\u0386\7u\2\2\u0386\u0387\7g\2\2"+
		"\u0387\u0388\7t\2\2\u0388\u0389\7v\2\2\u0389\u00c6\3\2\2\2\u038a\u038b"+
		"\7K\2\2\u038b\u038c\7P\2\2\u038c\u038d\7V\2\2\u038d\u038e\7Q\2\2\u038e"+
		"\u00c8\3\2\2\2\u038f\u0390\7K\2\2\u0390\u0391\7p\2\2\u0391\u0392\7v\2"+
		"\2\u0392\u0393\7q\2\2\u0393\u00ca\3\2\2\2\u0394\u0395\7k\2\2\u0395\u0396"+
		"\7p\2\2\u0396\u0397\7v\2\2\u0397\u0398\7q\2\2\u0398\u00cc\3\2\2\2\u0399"+
		"\u039a\7X\2\2\u039a\u039b\7C\2\2\u039b\u039c\7N\2\2\u039c\u039d\7W\2\2"+
		"\u039d\u039e\7G\2\2\u039e\u039f\7U\2\2\u039f\u00ce\3\2\2\2\u03a0\u03a1"+
		"\7X\2\2\u03a1\u03a2\7c\2\2\u03a2\u03a3\7n\2\2\u03a3\u03a4\7w\2\2\u03a4"+
		"\u03a5\7g\2\2\u03a5\u03a6\7u\2\2\u03a6\u00d0\3\2\2\2\u03a7\u03a8\7x\2"+
		"\2\u03a8\u03a9\7c\2\2\u03a9\u03aa\7n\2\2\u03aa\u03ab\7w\2\2\u03ab\u03ac"+
		"\7g\2\2\u03ac\u03ad\7u\2\2\u03ad\u00d2\3\2\2\2\u03ae\u03af\7W\2\2\u03af"+
		"\u03b0\7R\2\2\u03b0\u03b1\7F\2\2\u03b1\u03b2\7C\2\2\u03b2\u03b3\7V\2\2"+
		"\u03b3\u03b4\7G\2\2\u03b4\u00d4\3\2\2\2\u03b5\u03b6\7W\2\2\u03b6\u03b7"+
		"\7r\2\2\u03b7\u03b8\7f\2\2\u03b8\u03b9\7c\2\2\u03b9\u03ba\7v\2\2\u03ba"+
		"\u03bb\7g\2\2\u03bb\u00d6\3\2\2\2\u03bc\u03bd\7w\2\2\u03bd\u03be\7r\2"+
		"\2\u03be\u03bf\7f\2\2\u03bf\u03c0\7c\2\2\u03c0\u03c1\7v\2\2\u03c1\u03c2"+
		"\7g\2\2\u03c2\u00d8\3\2\2\2\u03c3\u03c4\7U\2\2\u03c4\u03c5\7G\2\2\u03c5"+
		"\u03c6\7V\2\2\u03c6\u00da\3\2\2\2\u03c7\u03c8\7U\2\2\u03c8\u03c9\7g\2"+
		"\2\u03c9\u03ca\7v\2\2\u03ca\u00dc\3\2\2\2\u03cb\u03cc\7u\2\2\u03cc\u03cd"+
		"\7g\2\2\u03cd\u03ce\7v\2\2\u03ce\u00de\3\2\2\2\u03cf\u03d0\7F\2\2\u03d0"+
		"\u03d1\7G\2\2\u03d1\u03d2\7N\2\2\u03d2\u03d3\7G\2\2\u03d3\u03d4\7V\2\2"+
		"\u03d4\u03d5\7G\2\2\u03d5\u00e0\3\2\2\2\u03d6\u03d7\7F\2\2\u03d7\u03d8"+
		"\7g\2\2\u03d8\u03d9\7n\2\2\u03d9\u03da\7g\2\2\u03da\u03db\7v\2\2\u03db"+
		"\u03dc\7g\2\2\u03dc\u00e2\3\2\2\2\u03dd\u03de\7f\2\2\u03de\u03df\7g\2"+
		"\2\u03df\u03e0\7n\2\2\u03e0\u03e1\7g\2\2\u03e1\u03e2\7v\2\2\u03e2\u03e3"+
		"\7g\2\2\u03e3\u00e4\3\2\2\2\u03e4\u03e5\7Q\2\2\u03e5\u03e6\7T\2\2\u03e6"+
		"\u03e7\7F\2\2\u03e7\u03e8\7G\2\2\u03e8\u03e9\7T\2\2\u03e9\u00e6\3\2\2"+
		"\2\u03ea\u03eb\7Q\2\2\u03eb\u03ec\7t\2\2\u03ec\u03ed\7f\2\2\u03ed\u03ee"+
		"\7g\2\2\u03ee\u03ef\7t\2\2\u03ef\u00e8\3\2\2\2\u03f0\u03f1\7q\2\2\u03f1"+
		"\u03f2\7t\2\2\u03f2\u03f3\7f\2\2\u03f3\u03f4\7g\2\2\u03f4\u03f5\7t\2\2"+
		"\u03f5\u00ea\3\2\2\2\u03f6\u03f7\7D\2\2\u03f7\u03f8\7[\2\2\u03f8\u00ec"+
		"\3\2\2\2\u03f9\u03fa\7D\2\2\u03fa\u03fb\7{\2\2\u03fb\u00ee\3\2\2\2\u03fc"+
		"\u03fd\7d\2\2\u03fd\u03fe\7{\2\2\u03fe\u00f0\3\2\2\2\u03ff\u0400\7>\2"+
		"\2\u0400\u00f2\3\2\2\2\u0401\u0402\7@\2\2\u0402\u00f4\3\2\2\2\u0403\u0404"+
		"\7>\2\2\u0404\u0405\7?\2\2\u0405\u00f6\3\2\2\2\u0406\u0407\7@\2\2\u0407"+
		"\u0408\7?\2\2\u0408\u00f8\3\2\2\2\u0409\u040a\7>\2\2\u040a\u040b\7@\2"+
		"\2\u040b\u00fa\3\2\2\2\u040c\u040d\7-\2\2\u040d\u00fc\3\2\2\2\u040e\u040f"+
		"\7/\2\2\u040f\u00fe\3\2\2\2\u0410\u0411\7\61\2\2\u0411\u0100\3\2\2\2\u0412"+
		"\u0413\7\'\2\2\u0413\u0102\3\2\2\2\u0414\u0415\7*\2\2\u0415\u0104\3\2"+
		"\2\2\u0416\u0417\7+\2\2\u0417\u0106\3\2\2\2\u0418\u0419\7]\2\2\u0419\u0108"+
		"\3\2\2\2\u041a\u041b\7_\2\2\u041b\u010a\3\2\2\2\u041c\u041d\7?\2\2\u041d"+
		"\u010c\3\2\2\2\u041e\u041f\7,\2\2\u041f\u010e\3\2\2\2\u0420\u0421\7d\2"+
		"\2\u0421\u0422\7q\2\2\u0422\u0423\7q\2\2\u0423\u0424\7n\2\2\u0424\u0425"+
		"\7g\2\2\u0425\u0426\7c\2\2\u0426\u0427\7p\2\2\u0427\u0110\3\2\2\2\u0428"+
		"\u0429\7f\2\2\u0429\u042a\7c\2\2\u042a\u042b\7v\2\2\u042b\u042c\7g\2\2"+
		"\u042c\u042d\7v\2\2\u042d\u042e\7k\2\2\u042e\u042f\7o\2\2\u042f\u0430"+
		"\7g\2\2\u0430\u0112\3\2\2\2\u0431\u0432\t\2\2\2\u0432\u0114\3\2\2\2\u0433"+
		"\u0434\4\62;\2\u0434\u0116\3\2\2\2\u0435\u0437\t\3\2\2\u0436\u0435\3\2"+
		"\2\2\u0437\u0118\3\2\2\2\u0438\u0439\5\u0115\u008b\2\u0439\u043a\5\u0115"+
		"\u008b\2\u043a\u011a\3\2\2\2\u043b\u043c\5\u0115\u008b\2\u043c\u043d\5"+
		"\u0119\u008d\2\u043d\u011c\3\2\2\2\u043e\u043f\5\u0115\u008b\2\u043f\u0440"+
		"\5\u011b\u008e\2\u0440\u011e\3\2\2\2\u0441\u0442\5\u011d\u008f\2\u0442"+
		"\u0120\3\2\2\2\u0443\u0446\5\u0115\u008b\2\u0444\u0446\5\u0119\u008d\2"+
		"\u0445\u0443\3\2\2\2\u0445\u0444\3\2\2\2\u0446\u0122\3\2\2\2\u0447\u044a"+
		"\5\u0115\u008b\2\u0448\u044a\5\u0119\u008d\2\u0449\u0447\3\2\2\2\u0449"+
		"\u0448\3\2\2\2\u044a\u0124\3\2\2\2\u044b\u0451\5\u0113\u008a\2\u044c\u0450"+
		"\5\u0113\u008a\2\u044d\u0450\5\u0115\u008b\2\u044e\u0450\7a\2\2\u044f"+
		"\u044c\3\2\2\2\u044f\u044d\3\2\2\2\u044f\u044e\3\2\2\2\u0450\u0453\3\2"+
		"\2\2\u0451\u044f\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0126\3\2\2\2\u0453"+
		"\u0451\3\2\2\2\u0454\u0458\5\u0115\u008b\2\u0455\u0457\5\u0115\u008b\2"+
		"\u0456\u0455\3\2\2\2\u0457\u045a\3\2\2\2\u0458\u0456\3\2\2\2\u0458\u0459"+
		"\3\2\2\2\u0459\u0128\3\2\2\2\u045a\u0458\3\2\2\2\u045b\u045f\5\u0115\u008b"+
		"\2\u045c\u045e\5\u0115\u008b\2\u045d\u045c\3\2\2\2\u045e\u0461\3\2\2\2"+
		"\u045f\u045d\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0469\3\2\2\2\u0461\u045f"+
		"\3\2\2\2\u0462\u0466\7\60\2\2\u0463\u0465\5\u0115\u008b\2\u0464\u0463"+
		"\3\2\2\2\u0465\u0468\3\2\2\2\u0466\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467"+
		"\u046a\3\2\2\2\u0468\u0466\3\2\2\2\u0469\u0462\3\2\2\2\u0469\u046a\3\2"+
		"\2\2\u046a\u012a\3\2\2\2\u046b\u046f\7)\2\2\u046c\u046e\5\u0117\u008c"+
		"\2\u046d\u046c\3\2\2\2\u046e\u0471\3\2\2\2\u046f\u046d\3\2\2\2\u046f\u0470"+
		"\3\2\2\2\u0470\u0472\3\2\2\2\u0471\u046f\3\2\2\2\u0472\u0473\7)\2\2\u0473"+
		"\u012c\3\2\2\2\u0474\u0475\5\u011f\u0090\2\u0475\u0476\7/\2\2\u0476\u0477"+
		"\5\u0121\u0091\2\u0477\u0478\7/\2\2\u0478\u0479\5\u0123\u0092\2\u0479"+
		"\u012e\3\2\2\2\u047a\u047c\t\4\2\2\u047b\u047a\3\2\2\2\u047c\u047d\3\2"+
		"\2\2\u047d\u047b\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u047f\3\2\2\2\u047f"+
		"\u0480\b\u0098\2\2\u0480\u0130\3\2\2\2\u0481\u0482\7\61\2\2\u0482\u0483"+
		"\7\61\2\2\u0483\u0487\3\2\2\2\u0484\u0486\n\5\2\2\u0485\u0484\3\2\2\2"+
		"\u0486\u0489\3\2\2\2\u0487\u0485\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u048b"+
		"\3\2\2\2\u0489\u0487\3\2\2\2\u048a\u048c\7\17\2\2\u048b\u048a\3\2\2\2"+
		"\u048b\u048c\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u049a\7\f\2\2\u048e\u048f"+
		"\7\61\2\2\u048f\u0490\7,\2\2\u0490\u0494\3\2\2\2\u0491\u0493\13\2\2\2"+
		"\u0492\u0491\3\2\2\2\u0493\u0496\3\2\2\2\u0494\u0495\3\2\2\2\u0494\u0492"+
		"\3\2\2\2\u0495\u0497\3\2\2\2\u0496\u0494\3\2\2\2\u0497\u0498\7,\2\2\u0498"+
		"\u049a\7\61\2\2\u0499\u0481\3\2\2\2\u0499\u048e\3\2\2\2\u049a\u049b\3"+
		"\2\2\2\u049b\u049c\b\u0099\2\2\u049c\u0132\3\2\2\2\u049d\u049e\7=\2\2"+
		"\u049e\u0134\3\2\2\2\u049f\u04a0\7.\2\2\u04a0\u0136\3\2\2\2\22\2\u0436"+
		"\u0445\u0449\u044f\u0451\u0458\u045f\u0466\u0469\u046f\u047d\u0487\u048b"+
		"\u0494\u0499\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}