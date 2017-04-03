package application.model;
// Generated from DBMS.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DBMSParser extends Parser {
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
	public static final int
		RULE_intx = 0, RULE_floatx = 1, RULE_datex = 2, RULE_charx = 3, RULE_and = 4, 
		RULE_or = 5, RULE_not = 6, RULE_create = 7, RULE_database = 8, RULE_databases = 9, 
		RULE_table = 10, RULE_tables = 11, RULE_column = 12, RULE_columns = 13, 
		RULE_show = 14, RULE_drop = 15, RULE_alter = 16, RULE_use = 17, RULE_rename = 18, 
		RULE_constraint = 19, RULE_key = 20, RULE_primary = 21, RULE_foreign = 22, 
		RULE_check = 23, RULE_select = 24, RULE_from = 25, RULE_where = 26, RULE_asc = 27, 
		RULE_desc = 28, RULE_to = 29, RULE_references = 30, RULE_add = 31, RULE_insert = 32, 
		RULE_into = 33, RULE_values = 34, RULE_update = 35, RULE_set = 36, RULE_delete = 37, 
		RULE_order = 38, RULE_by = 39, RULE_sql = 40, RULE_sql_executable = 41, 
		RULE_sql_ddl = 42, RULE_database_statement = 43, RULE_table_statement = 44, 
		RULE_comma_id_k = 45, RULE_comma_literal_k = 46, RULE_comma_id_eq_literal_k = 47, 
		RULE_comma_action_k = 48, RULE_create_database = 49, RULE_alter_database = 50, 
		RULE_drop_database = 51, RULE_show_database = 52, RULE_use_database = 53, 
		RULE_comma_id_type_k = 54, RULE_comma_constraint_constraintAt_k = 55, 
		RULE_create_table = 56, RULE_constraintAt = 57, RULE_primaryKey = 58, 
		RULE_foreignKey = 59, RULE_checks = 60, RULE_type = 61, RULE_alter_table = 62, 
		RULE_drop_table = 63, RULE_show_tables = 64, RULE_show_columns = 65, RULE_action = 66, 
		RULE_sql_dml = 67, RULE_some_order = 68, RULE_insert_value = 69, RULE_update_value = 70, 
		RULE_delete_value = 71, RULE_select_value = 72, RULE_where_exp = 73, RULE_order_by = 74, 
		RULE_comma_id_ad_k = 75, RULE_select_k_id = 76, RULE_literal = 77, RULE_rel_op = 78, 
		RULE_cond_op = 79, RULE_add_op = 80, RULE_mult_op = 81, RULE_exp = 82, 
		RULE_expression = 83, RULE_andExpr = 84, RULE_factor = 85, RULE_primaryExpr = 86, 
		RULE_compareExpr = 87, RULE_term = 88;
	public static final String[] ruleNames = {
		"intx", "floatx", "datex", "charx", "and", "or", "not", "create", "database", 
		"databases", "table", "tables", "column", "columns", "show", "drop", "alter", 
		"use", "rename", "constraint", "key", "primary", "foreign", "check", "select", 
		"from", "where", "asc", "desc", "to", "references", "add", "insert", "into", 
		"values", "update", "set", "delete", "order", "by", "sql", "sql_executable", 
		"sql_ddl", "database_statement", "table_statement", "comma_id_k", "comma_literal_k", 
		"comma_id_eq_literal_k", "comma_action_k", "create_database", "alter_database", 
		"drop_database", "show_database", "use_database", "comma_id_type_k", "comma_constraint_constraintAt_k", 
		"create_table", "constraintAt", "primaryKey", "foreignKey", "checks", 
		"type", "alter_table", "drop_table", "show_tables", "show_columns", "action", 
		"sql_dml", "some_order", "insert_value", "update_value", "delete_value", 
		"select_value", "where_exp", "order_by", "comma_id_ad_k", "select_k_id", 
		"literal", "rel_op", "cond_op", "add_op", "mult_op", "exp", "expression", 
		"andExpr", "factor", "primaryExpr", "compareExpr", "term"
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

	@Override
	public String getGrammarFileName() { return "DBMS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DBMSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IntxContext extends ParserRuleContext {
		public IntxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterIntx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitIntx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitIntx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntxContext intx() throws RecognitionException {
		IntxContext _localctx = new IntxContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_intx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class FloatxContext extends ParserRuleContext {
		public FloatxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterFloatx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitFloatx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitFloatx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatxContext floatx() throws RecognitionException {
		FloatxContext _localctx = new FloatxContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_floatx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class DatexContext extends ParserRuleContext {
		public DatexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterDatex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitDatex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitDatex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatexContext datex() throws RecognitionException {
		DatexContext _localctx = new DatexContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_datex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class CharxContext extends ParserRuleContext {
		public CharxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterCharx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitCharx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitCharx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharxContext charx() throws RecognitionException {
		CharxContext _localctx = new CharxContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_charx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class AndContext extends ParserRuleContext {
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OrContext extends ParserRuleContext {
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class NotContext extends ParserRuleContext {
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_not);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class CreateContext extends ParserRuleContext {
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_create);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class DatabaseContext extends ParserRuleContext {
		public DatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseContext database() throws RecognitionException {
		DatabaseContext _localctx = new DatabaseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class DatabasesContext extends ParserRuleContext {
		public DatabasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterDatabases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitDatabases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitDatabases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabasesContext databases() throws RecognitionException {
		DatabasesContext _localctx = new DatabasesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_databases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TableContext extends ParserRuleContext {
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TablesContext extends ParserRuleContext {
		public TablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitTables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablesContext tables() throws RecognitionException {
		TablesContext _localctx = new TablesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ColumnContext extends ParserRuleContext {
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ColumnsContext extends ParserRuleContext {
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ShowContext extends ParserRuleContext {
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterShow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitShow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitShow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_show);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class DropContext extends ParserRuleContext {
		public DropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterDrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitDrop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitDrop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropContext drop() throws RecognitionException {
		DropContext _localctx = new DropContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_drop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class AlterContext extends ParserRuleContext {
		public AlterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterAlter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitAlter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitAlter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterContext alter() throws RecognitionException {
		AlterContext _localctx = new AlterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_alter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class UseContext extends ParserRuleContext {
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_use);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__51) | (1L << T__52))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class RenameContext extends ParserRuleContext {
		public RenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterRename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitRename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitRename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameContext rename() throws RecognitionException {
		RenameContext _localctx = new RenameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__53) | (1L << T__54) | (1L << T__55))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ConstraintContext extends ParserRuleContext {
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__56) | (1L << T__57) | (1L << T__58))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class KeyContext extends ParserRuleContext {
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__60) | (1L << T__61))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__63 - 63)) | (1L << (T__64 - 63)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ForeignContext extends ParserRuleContext {
		public ForeignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterForeign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitForeign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitForeign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignContext foreign() throws RecognitionException {
		ForeignContext _localctx = new ForeignContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_foreign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class CheckContext extends ParserRuleContext {
		public CheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_check);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class SelectContext extends ParserRuleContext {
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class FromContext extends ParserRuleContext {
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (T__74 - 75)) | (1L << (T__75 - 75)) | (1L << (T__76 - 75)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class WhereContext extends ParserRuleContext {
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class AscContext extends ParserRuleContext {
		public AscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterAsc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitAsc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitAsc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AscContext asc() throws RecognitionException {
		AscContext _localctx = new AscContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_asc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class DescContext extends ParserRuleContext {
		public DescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitDesc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescContext desc() throws RecognitionException {
		DescContext _localctx = new DescContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (T__83 - 84)) | (1L << (T__84 - 84)) | (1L << (T__85 - 84)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ToContext extends ParserRuleContext {
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_to);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (T__87 - 87)) | (1L << (T__88 - 87)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ReferencesContext extends ParserRuleContext {
		public ReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_references; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterReferences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitReferences(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferencesContext references() throws RecognitionException {
		ReferencesContext _localctx = new ReferencesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (T__89 - 90)) | (1L << (T__90 - 90)) | (1L << (T__91 - 90)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (T__92 - 93)) | (1L << (T__93 - 93)) | (1L << (T__94 - 93)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class InsertContext extends ParserRuleContext {
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (T__96 - 96)) | (1L << (T__97 - 96)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class IntoContext extends ParserRuleContext {
		public IntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitInto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntoContext into() throws RecognitionException {
		IntoContext _localctx = new IntoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_into);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (T__98 - 99)) | (1L << (T__99 - 99)) | (1L << (T__100 - 99)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ValuesContext extends ParserRuleContext {
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (T__101 - 102)) | (1L << (T__102 - 102)) | (1L << (T__103 - 102)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class UpdateContext extends ParserRuleContext {
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (T__104 - 105)) | (1L << (T__105 - 105)) | (1L << (T__106 - 105)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class SetContext extends ParserRuleContext {
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (T__107 - 108)) | (1L << (T__108 - 108)) | (1L << (T__109 - 108)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class DeleteContext extends ParserRuleContext {
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (T__110 - 111)) | (1L << (T__111 - 111)) | (1L << (T__112 - 111)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OrderContext extends ParserRuleContext {
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (T__113 - 114)) | (1L << (T__114 - 114)) | (1L << (T__115 - 114)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ByContext extends ParserRuleContext {
		public ByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ByContext by() throws RecognitionException {
		ByContext _localctx = new ByContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (T__116 - 117)) | (1L << (T__117 - 117)) | (1L << (T__118 - 117)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class SqlContext extends ParserRuleContext {
		public List<Sql_executableContext> sql_executable() {
			return getRuleContexts(Sql_executableContext.class);
		}
		public Sql_executableContext sql_executable(int i) {
			return getRuleContext(Sql_executableContext.class,i);
		}
		public SqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterSql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitSql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitSql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlContext sql() throws RecognitionException {
		SqlContext _localctx = new SqlContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_sql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(258);
				sql_executable();
				}
				}
				setState(261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (T__95 - 72)) | (1L << (T__96 - 72)) | (1L << (T__97 - 72)) | (1L << (T__104 - 72)) | (1L << (T__105 - 72)) | (1L << (T__106 - 72)) | (1L << (T__110 - 72)) | (1L << (T__111 - 72)) | (1L << (T__112 - 72)))) != 0) );
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

	public static class Sql_executableContext extends ParserRuleContext {
		public Sql_ddlContext sql_ddl() {
			return getRuleContext(Sql_ddlContext.class,0);
		}
		public Sql_dmlContext sql_dml() {
			return getRuleContext(Sql_dmlContext.class,0);
		}
		public Sql_executableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_executable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterSql_executable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitSql_executable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitSql_executable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_executableContext sql_executable() throws RecognitionException {
		Sql_executableContext _localctx = new Sql_executableContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sql_executable);
		try {
			setState(265);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case T__23:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				sql_ddl();
				}
				break;
			case T__71:
			case T__72:
			case T__73:
			case T__95:
			case T__96:
			case T__97:
			case T__104:
			case T__105:
			case T__106:
			case T__110:
			case T__111:
			case T__112:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				sql_dml();
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

	public static class Sql_ddlContext extends ParserRuleContext {
		public Database_statementContext database_statement() {
			return getRuleContext(Database_statementContext.class,0);
		}
		public Table_statementContext table_statement() {
			return getRuleContext(Table_statementContext.class,0);
		}
		public Sql_ddlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_ddl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterSql_ddl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitSql_ddl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitSql_ddl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_ddlContext sql_ddl() throws RecognitionException {
		Sql_ddlContext _localctx = new Sql_ddlContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_sql_ddl);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				database_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				table_statement();
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

	public static class Database_statementContext extends ParserRuleContext {
		public Create_databaseContext create_database() {
			return getRuleContext(Create_databaseContext.class,0);
		}
		public Alter_databaseContext alter_database() {
			return getRuleContext(Alter_databaseContext.class,0);
		}
		public Drop_databaseContext drop_database() {
			return getRuleContext(Drop_databaseContext.class,0);
		}
		public Show_databaseContext show_database() {
			return getRuleContext(Show_databaseContext.class,0);
		}
		public Use_databaseContext use_database() {
			return getRuleContext(Use_databaseContext.class,0);
		}
		public Database_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterDatabase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitDatabase_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitDatabase_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_statementContext database_statement() throws RecognitionException {
		Database_statementContext _localctx = new Database_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_database_statement);
		try {
			setState(276);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				create_database();
				}
				break;
			case T__47:
			case T__48:
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				alter_database();
				}
				break;
			case T__44:
			case T__45:
			case T__46:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				drop_database();
				}
				break;
			case T__41:
			case T__42:
			case T__43:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				show_database();
				}
				break;
			case T__50:
			case T__51:
			case T__52:
				enterOuterAlt(_localctx, 5);
				{
				setState(275);
				use_database();
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

	public static class Table_statementContext extends ParserRuleContext {
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public Alter_tableContext alter_table() {
			return getRuleContext(Alter_tableContext.class,0);
		}
		public Drop_tableContext drop_table() {
			return getRuleContext(Drop_tableContext.class,0);
		}
		public Show_tablesContext show_tables() {
			return getRuleContext(Show_tablesContext.class,0);
		}
		public Show_columnsContext show_columns() {
			return getRuleContext(Show_columnsContext.class,0);
		}
		public Table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterTable_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitTable_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitTable_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_statementContext table_statement() throws RecognitionException {
		Table_statementContext _localctx = new Table_statementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_table_statement);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				create_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				alter_table();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				drop_table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				show_tables();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				show_columns();
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

	public static class Comma_id_kContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public Comma_id_kContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_id_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterComma_id_k(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitComma_id_k(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitComma_id_k(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_id_kContext comma_id_k() throws RecognitionException {
		Comma_id_kContext _localctx = new Comma_id_kContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_comma_id_k);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(285);
				match(COMMA);
				setState(286);
				match(ID);
				}
				}
				setState(291);
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

	public static class Comma_literal_kContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public Comma_literal_kContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_literal_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterComma_literal_k(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitComma_literal_k(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitComma_literal_k(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_literal_kContext comma_literal_k() throws RecognitionException {
		Comma_literal_kContext _localctx = new Comma_literal_kContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_comma_literal_k);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(292);
				match(COMMA);
				setState(293);
				literal();
				}
				}
				setState(298);
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

	public static class Comma_id_eq_literal_kContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public List<TerminalNode> EQ() { return getTokens(DBMSParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(DBMSParser.EQ, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public Comma_id_eq_literal_kContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_id_eq_literal_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterComma_id_eq_literal_k(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitComma_id_eq_literal_k(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitComma_id_eq_literal_k(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_id_eq_literal_kContext comma_id_eq_literal_k() throws RecognitionException {
		Comma_id_eq_literal_kContext _localctx = new Comma_id_eq_literal_kContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_comma_id_eq_literal_k);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(299);
				match(COMMA);
				setState(300);
				match(ID);
				setState(301);
				match(EQ);
				setState(302);
				literal();
				}
				}
				setState(307);
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

	public static class Comma_action_kContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public Comma_action_kContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_action_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterComma_action_k(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitComma_action_k(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitComma_action_k(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_action_kContext comma_action_k() throws RecognitionException {
		Comma_action_kContext _localctx = new Comma_action_kContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_comma_action_k);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(308);
				match(COMMA);
				setState(309);
				action();
				}
				}
				setState(314);
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

	public static class Create_databaseContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Create_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterCreate_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitCreate_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitCreate_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_databaseContext create_database() throws RecognitionException {
		Create_databaseContext _localctx = new Create_databaseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_create_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			create();
			setState(316);
			database();
			setState(317);
			match(ID);
			setState(318);
			match(END_SQL);
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

	public static class Alter_databaseContext extends ParserRuleContext {
		public AlterContext alter() {
			return getRuleContext(AlterContext.class,0);
		}
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public RenameContext rename() {
			return getRuleContext(RenameContext.class,0);
		}
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Alter_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterAlter_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitAlter_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitAlter_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_databaseContext alter_database() throws RecognitionException {
		Alter_databaseContext _localctx = new Alter_databaseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_alter_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			alter();
			setState(321);
			database();
			setState(322);
			match(ID);
			setState(323);
			rename();
			setState(324);
			to();
			setState(325);
			match(ID);
			setState(326);
			match(END_SQL);
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

	public static class Drop_databaseContext extends ParserRuleContext {
		public DropContext drop() {
			return getRuleContext(DropContext.class,0);
		}
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Drop_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterDrop_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitDrop_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitDrop_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_databaseContext drop_database() throws RecognitionException {
		Drop_databaseContext _localctx = new Drop_databaseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_drop_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			drop();
			setState(329);
			database();
			setState(330);
			match(ID);
			setState(331);
			match(END_SQL);
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

	public static class Show_databaseContext extends ParserRuleContext {
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public DatabasesContext databases() {
			return getRuleContext(DatabasesContext.class,0);
		}
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Show_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterShow_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitShow_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitShow_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_databaseContext show_database() throws RecognitionException {
		Show_databaseContext _localctx = new Show_databaseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_show_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			show();
			setState(334);
			databases();
			setState(335);
			match(END_SQL);
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

	public static class Use_databaseContext extends ParserRuleContext {
		public UseContext use() {
			return getRuleContext(UseContext.class,0);
		}
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Use_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterUse_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitUse_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitUse_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_databaseContext use_database() throws RecognitionException {
		Use_databaseContext _localctx = new Use_databaseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_use_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			use();
			setState(338);
			database();
			setState(339);
			match(ID);
			setState(340);
			match(END_SQL);
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

	public static class Comma_id_type_kContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Comma_id_type_kContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_id_type_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterComma_id_type_k(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitComma_id_type_k(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitComma_id_type_k(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_id_type_kContext comma_id_type_k() throws RecognitionException {
		Comma_id_type_kContext _localctx = new Comma_id_type_kContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_comma_id_type_k);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(342);
					match(COMMA);
					setState(343);
					match(ID);
					setState(344);
					type();
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Comma_constraint_constraintAt_kContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public List<ConstraintAtContext> constraintAt() {
			return getRuleContexts(ConstraintAtContext.class);
		}
		public ConstraintAtContext constraintAt(int i) {
			return getRuleContext(ConstraintAtContext.class,i);
		}
		public Comma_constraint_constraintAt_kContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_constraint_constraintAt_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterComma_constraint_constraintAt_k(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitComma_constraint_constraintAt_k(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitComma_constraint_constraintAt_k(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_constraint_constraintAt_kContext comma_constraint_constraintAt_k() throws RecognitionException {
		Comma_constraint_constraintAt_kContext _localctx = new Comma_constraint_constraintAt_kContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_comma_constraint_constraintAt_k);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(350);
				match(COMMA);
				setState(351);
				constraint();
				setState(352);
				constraintAt();
				}
				}
				setState(358);
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

	public static class Create_tableContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(DBMSParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Comma_id_type_kContext comma_id_type_k() {
			return getRuleContext(Comma_id_type_kContext.class,0);
		}
		public Comma_constraint_constraintAt_kContext comma_constraint_constraintAt_k() {
			return getRuleContext(Comma_constraint_constraintAt_kContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBMSParser.RPAREN, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterCreate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitCreate_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitCreate_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_create_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			create();
			setState(360);
			table();
			setState(361);
			match(ID);
			setState(362);
			match(LPAREN);
			setState(363);
			match(ID);
			setState(364);
			type();
			setState(365);
			comma_id_type_k();
			setState(366);
			comma_constraint_constraintAt_k();
			setState(367);
			match(RPAREN);
			setState(368);
			match(END_SQL);
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

	public static class ConstraintAtContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public ForeignKeyContext foreignKey() {
			return getRuleContext(ForeignKeyContext.class,0);
		}
		public ChecksContext checks() {
			return getRuleContext(ChecksContext.class,0);
		}
		public ConstraintAtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintAt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterConstraintAt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitConstraintAt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitConstraintAt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintAtContext constraintAt() throws RecognitionException {
		ConstraintAtContext _localctx = new ConstraintAtContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_constraintAt);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				primaryKey();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				foreignKey();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				checks();
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

	public static class PrimaryKeyContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DBMSParser.LPAREN, 0); }
		public Comma_id_kContext comma_id_k() {
			return getRuleContext(Comma_id_kContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBMSParser.RPAREN, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterPrimaryKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitPrimaryKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_primaryKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(ID);
			setState(376);
			primary();
			setState(377);
			key();
			setState(378);
			match(LPAREN);
			setState(379);
			match(ID);
			setState(380);
			comma_id_k();
			setState(381);
			match(RPAREN);
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

	public static class ForeignKeyContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public ForeignContext foreign() {
			return getRuleContext(ForeignContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(DBMSParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DBMSParser.LPAREN, i);
		}
		public List<Comma_id_kContext> comma_id_k() {
			return getRuleContexts(Comma_id_kContext.class);
		}
		public Comma_id_kContext comma_id_k(int i) {
			return getRuleContext(Comma_id_kContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(DBMSParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DBMSParser.RPAREN, i);
		}
		public ReferencesContext references() {
			return getRuleContext(ReferencesContext.class,0);
		}
		public ForeignKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterForeignKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitForeignKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitForeignKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyContext foreignKey() throws RecognitionException {
		ForeignKeyContext _localctx = new ForeignKeyContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_foreignKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(ID);
			setState(384);
			foreign();
			setState(385);
			key();
			setState(386);
			match(LPAREN);
			setState(387);
			match(ID);
			setState(388);
			comma_id_k();
			setState(389);
			match(RPAREN);
			setState(390);
			references();
			setState(391);
			match(ID);
			setState(392);
			match(LPAREN);
			setState(393);
			match(ID);
			setState(394);
			comma_id_k();
			setState(395);
			match(RPAREN);
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

	public static class ChecksContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public CheckContext check() {
			return getRuleContext(CheckContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DBMSParser.LPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBMSParser.RPAREN, 0); }
		public ChecksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterChecks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitChecks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitChecks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChecksContext checks() throws RecognitionException {
		ChecksContext _localctx = new ChecksContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_checks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(ID);
			setState(398);
			check();
			setState(399);
			match(LPAREN);
			setState(400);
			exp();
			setState(401);
			match(RPAREN);
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
		public IntxContext intx() {
			return getRuleContext(IntxContext.class,0);
		}
		public FloatxContext floatx() {
			return getRuleContext(FloatxContext.class,0);
		}
		public DatexContext datex() {
			return getRuleContext(DatexContext.class,0);
		}
		public CharxContext charx() {
			return getRuleContext(CharxContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DBMSParser.LPAREN, 0); }
		public TerminalNode NUM() { return getToken(DBMSParser.NUM, 0); }
		public TerminalNode RPAREN() { return getToken(DBMSParser.RPAREN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_type);
		try {
			setState(411);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				intx();
				}
				break;
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				floatx();
				}
				break;
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				datex();
				}
				break;
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(406);
				charx();
				setState(407);
				match(LPAREN);
				setState(408);
				match(NUM);
				setState(409);
				match(RPAREN);
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

	public static class Alter_tableContext extends ParserRuleContext {
		public AlterContext alter() {
			return getRuleContext(AlterContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public RenameContext rename() {
			return getRuleContext(RenameContext.class,0);
		}
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public Comma_action_kContext comma_action_k() {
			return getRuleContext(Comma_action_kContext.class,0);
		}
		public Alter_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterAlter_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitAlter_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitAlter_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_tableContext alter_table() throws RecognitionException {
		Alter_tableContext _localctx = new Alter_tableContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_alter_table);
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				alter();
				setState(414);
				table();
				setState(415);
				match(ID);
				setState(416);
				rename();
				setState(417);
				to();
				setState(418);
				match(ID);
				setState(419);
				match(END_SQL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				alter();
				setState(422);
				table();
				setState(423);
				match(ID);
				setState(424);
				action();
				setState(425);
				comma_action_k();
				setState(426);
				match(END_SQL);
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

	public static class Drop_tableContext extends ParserRuleContext {
		public DropContext drop() {
			return getRuleContext(DropContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Drop_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterDrop_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitDrop_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitDrop_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_tableContext drop_table() throws RecognitionException {
		Drop_tableContext _localctx = new Drop_tableContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_drop_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			drop();
			setState(431);
			table();
			setState(432);
			match(ID);
			setState(433);
			match(END_SQL);
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

	public static class Show_tablesContext extends ParserRuleContext {
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public TablesContext tables() {
			return getRuleContext(TablesContext.class,0);
		}
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Show_tablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_tables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterShow_tables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitShow_tables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitShow_tables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_tablesContext show_tables() throws RecognitionException {
		Show_tablesContext _localctx = new Show_tablesContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_show_tables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			show();
			setState(436);
			tables();
			setState(437);
			match(END_SQL);
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

	public static class Show_columnsContext extends ParserRuleContext {
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Show_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterShow_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitShow_columns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitShow_columns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_columnsContext show_columns() throws RecognitionException {
		Show_columnsContext _localctx = new Show_columnsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_show_columns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			show();
			setState(440);
			columns();
			setState(441);
			from();
			setState(442);
			match(ID);
			setState(443);
			match(END_SQL);
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

	public static class ActionContext extends ParserRuleContext {
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public List<ConstraintAtContext> constraintAt() {
			return getRuleContexts(ConstraintAtContext.class);
		}
		public ConstraintAtContext constraintAt(int i) {
			return getRuleContext(ConstraintAtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public DropContext drop() {
			return getRuleContext(DropContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_action);
		int _la;
		try {
			int _alt;
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				add();
				setState(446);
				column();
				setState(447);
				match(ID);
				setState(448);
				type();
				setState(460);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__56) | (1L << T__57) | (1L << T__58))) != 0)) {
					{
					setState(449);
					constraint();
					setState(450);
					constraintAt();
					setState(457);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(451);
							match(COMMA);
							setState(452);
							constraint();
							setState(453);
							constraintAt();
							}
							} 
						}
						setState(459);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				add();
				setState(463);
				constraint();
				setState(464);
				constraintAt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				drop();
				setState(467);
				column();
				setState(468);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				drop();
				setState(471);
				constraint();
				setState(472);
				match(ID);
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

	public static class Sql_dmlContext extends ParserRuleContext {
		public Insert_valueContext insert_value() {
			return getRuleContext(Insert_valueContext.class,0);
		}
		public Update_valueContext update_value() {
			return getRuleContext(Update_valueContext.class,0);
		}
		public Delete_valueContext delete_value() {
			return getRuleContext(Delete_valueContext.class,0);
		}
		public Select_valueContext select_value() {
			return getRuleContext(Select_valueContext.class,0);
		}
		public Sql_dmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_dml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterSql_dml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitSql_dml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitSql_dml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_dmlContext sql_dml() throws RecognitionException {
		Sql_dmlContext _localctx = new Sql_dmlContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_sql_dml);
		try {
			setState(480);
			switch (_input.LA(1)) {
			case T__95:
			case T__96:
			case T__97:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				insert_value();
				}
				break;
			case T__104:
			case T__105:
			case T__106:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				update_value();
				}
				break;
			case T__110:
			case T__111:
			case T__112:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				delete_value();
				}
				break;
			case T__71:
			case T__72:
			case T__73:
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				select_value();
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

	public static class Some_orderContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DBMSParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public Comma_id_kContext comma_id_k() {
			return getRuleContext(Comma_id_kContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBMSParser.RPAREN, 0); }
		public Some_orderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_some_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterSome_order(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitSome_order(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitSome_order(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Some_orderContext some_order() throws RecognitionException {
		Some_orderContext _localctx = new Some_orderContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_some_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(482);
				match(LPAREN);
				setState(483);
				match(ID);
				setState(484);
				comma_id_k();
				setState(485);
				match(RPAREN);
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

	public static class Insert_valueContext extends ParserRuleContext {
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public IntoContext into() {
			return getRuleContext(IntoContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public Some_orderContext some_order() {
			return getRuleContext(Some_orderContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DBMSParser.LPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Comma_literal_kContext comma_literal_k() {
			return getRuleContext(Comma_literal_kContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBMSParser.RPAREN, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Insert_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterInsert_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitInsert_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitInsert_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_valueContext insert_value() throws RecognitionException {
		Insert_valueContext _localctx = new Insert_valueContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_insert_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			insert();
			setState(490);
			into();
			setState(491);
			match(ID);
			setState(492);
			some_order();
			setState(493);
			values();
			setState(494);
			match(LPAREN);
			setState(495);
			literal();
			setState(496);
			comma_literal_k();
			setState(497);
			match(RPAREN);
			setState(498);
			match(END_SQL);
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

	public static class Update_valueContext extends ParserRuleContext {
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TerminalNode EQ() { return getToken(DBMSParser.EQ, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Comma_id_eq_literal_kContext comma_id_eq_literal_k() {
			return getRuleContext(Comma_id_eq_literal_kContext.class,0);
		}
		public Where_expContext where_exp() {
			return getRuleContext(Where_expContext.class,0);
		}
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Update_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterUpdate_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitUpdate_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitUpdate_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_valueContext update_value() throws RecognitionException {
		Update_valueContext _localctx = new Update_valueContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_update_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			update();
			setState(501);
			match(ID);
			setState(502);
			set();
			setState(503);
			match(ID);
			setState(504);
			match(EQ);
			setState(505);
			literal();
			setState(506);
			comma_id_eq_literal_k();
			setState(507);
			where_exp();
			setState(508);
			match(END_SQL);
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

	public static class Delete_valueContext extends ParserRuleContext {
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public Where_expContext where_exp() {
			return getRuleContext(Where_expContext.class,0);
		}
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Delete_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterDelete_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitDelete_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitDelete_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_valueContext delete_value() throws RecognitionException {
		Delete_valueContext _localctx = new Delete_valueContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_delete_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			delete();
			setState(511);
			from();
			setState(512);
			match(ID);
			setState(513);
			where_exp();
			setState(514);
			match(END_SQL);
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

	public static class Select_valueContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public Select_k_idContext select_k_id() {
			return getRuleContext(Select_k_idContext.class,0);
		}
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public Comma_id_kContext comma_id_k() {
			return getRuleContext(Comma_id_kContext.class,0);
		}
		public Where_expContext where_exp() {
			return getRuleContext(Where_expContext.class,0);
		}
		public Order_byContext order_by() {
			return getRuleContext(Order_byContext.class,0);
		}
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Select_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterSelect_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitSelect_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitSelect_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_valueContext select_value() throws RecognitionException {
		Select_valueContext _localctx = new Select_valueContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_select_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			select();
			setState(517);
			select_k_id();
			setState(518);
			from();
			setState(519);
			match(ID);
			setState(520);
			comma_id_k();
			setState(521);
			where_exp();
			setState(522);
			order_by();
			setState(523);
			match(END_SQL);
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

	public static class Where_expContext extends ParserRuleContext {
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Where_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterWhere_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitWhere_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitWhere_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_expContext where_exp() throws RecognitionException {
		Where_expContext _localctx = new Where_expContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_where_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_la = _input.LA(1);
			if (((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)))) != 0)) {
				{
				setState(525);
				where();
				setState(526);
				exp();
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

	public static class Order_byContext extends ParserRuleContext {
		public OrderContext order() {
			return getRuleContext(OrderContext.class,0);
		}
		public ByContext by() {
			return getRuleContext(ByContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public Comma_id_ad_kContext comma_id_ad_k() {
			return getRuleContext(Comma_id_ad_kContext.class,0);
		}
		public AscContext asc() {
			return getRuleContext(AscContext.class,0);
		}
		public DescContext desc() {
			return getRuleContext(DescContext.class,0);
		}
		public Order_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterOrder_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitOrder_by(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitOrder_by(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_byContext order_by() throws RecognitionException {
		Order_byContext _localctx = new Order_byContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_order_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_la = _input.LA(1);
			if (((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (T__113 - 114)) | (1L << (T__114 - 114)) | (1L << (T__115 - 114)))) != 0)) {
				{
				setState(530);
				order();
				setState(531);
				by();
				setState(532);
				match(ID);
				setState(535);
				switch (_input.LA(1)) {
				case T__80:
				case T__81:
				case T__82:
					{
					setState(533);
					asc();
					}
					break;
				case T__83:
				case T__84:
				case T__85:
					{
					setState(534);
					desc();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(537);
				comma_id_ad_k();
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

	public static class Comma_id_ad_kContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public List<AscContext> asc() {
			return getRuleContexts(AscContext.class);
		}
		public AscContext asc(int i) {
			return getRuleContext(AscContext.class,i);
		}
		public List<DescContext> desc() {
			return getRuleContexts(DescContext.class);
		}
		public DescContext desc(int i) {
			return getRuleContext(DescContext.class,i);
		}
		public Comma_id_ad_kContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_id_ad_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterComma_id_ad_k(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitComma_id_ad_k(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitComma_id_ad_k(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_id_ad_kContext comma_id_ad_k() throws RecognitionException {
		Comma_id_ad_kContext _localctx = new Comma_id_ad_kContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_comma_id_ad_k);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(541);
				match(COMMA);
				setState(542);
				match(ID);
				setState(545);
				switch (_input.LA(1)) {
				case T__80:
				case T__81:
				case T__82:
					{
					setState(543);
					asc();
					}
					break;
				case T__83:
				case T__84:
				case T__85:
					{
					setState(544);
					desc();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(551);
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

	public static class Select_k_idContext extends ParserRuleContext {
		public TerminalNode KL() { return getToken(DBMSParser.KL, 0); }
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public Comma_id_kContext comma_id_k() {
			return getRuleContext(Comma_id_kContext.class,0);
		}
		public Select_k_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_k_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterSelect_k_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitSelect_k_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitSelect_k_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_k_idContext select_k_id() throws RecognitionException {
		Select_k_idContext _localctx = new Select_k_idContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_select_k_id);
		try {
			setState(555);
			switch (_input.LA(1)) {
			case KL:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				match(KL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				match(ID);
				setState(554);
				comma_id_k();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(DBMSParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DBMSParser.FLOAT, 0); }
		public TerminalNode DATE() { return getToken(DBMSParser.DATE, 0); }
		public TerminalNode CHARX() { return getToken(DBMSParser.CHARX, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (NUM - 138)) | (1L << (FLOAT - 138)) | (1L << (CHARX - 138)) | (1L << (DATE - 138)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Rel_opContext extends ParserRuleContext {
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitRel_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitRel_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			_la = _input.LA(1);
			if ( !(((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (T__119 - 120)) | (1L << (T__120 - 120)) | (1L << (T__121 - 120)) | (1L << (T__122 - 120)) | (1L << (T__123 - 120)) | (1L << (EQ - 120)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Cond_opContext extends ParserRuleContext {
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterCond_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitCond_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitCond_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_cond_op);
		try {
			setState(563);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				and();
				}
				break;
			case T__15:
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				or();
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

	public static class Add_opContext extends ParserRuleContext {
		public Add_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterAdd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitAdd_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitAdd_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_opContext add_op() throws RecognitionException {
		Add_opContext _localctx = new Add_opContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_add_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			_la = _input.LA(1);
			if ( !(_la==T__124 || _la==T__125) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Mult_opContext extends ParserRuleContext {
		public Mult_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterMult_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitMult_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitMult_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mult_opContext mult_op() throws RecognitionException {
		Mult_opContext _localctx = new Mult_opContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_mult_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_la = _input.LA(1);
			if ( !(((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (T__126 - 127)) | (1L << (T__127 - 127)) | (1L << (KL - 127)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ExpContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_exp);
		try {
			setState(571);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
			case T__20:
			case LPAREN:
			case ID:
			case NUM:
			case FLOAT:
			case CHARX:
			case DATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				expression(0);
				}
				break;
			case T__113:
			case T__114:
			case T__115:
			case RPAREN:
			case END_SQL:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpressionContext extends ParserRuleContext {
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(574);
			andExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(576);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(577);
					or();
					setState(578);
					andExpr(0);
					}
					} 
				}
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class AndExprContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		return andExpr(0);
	}

	private AndExprContext andExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExprContext _localctx = new AndExprContext(_ctx, _parentState);
		AndExprContext _prevctx = _localctx;
		int _startState = 168;
		enterRecursionRule(_localctx, 168, RULE_andExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(586);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(594);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpr);
					setState(588);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(589);
					and();
					setState(590);
					factor();
					}
					} 
				}
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_factor);
		try {
			setState(601);
			switch (_input.LA(1)) {
			case LPAREN:
			case ID:
			case NUM:
			case FLOAT:
			case CHARX:
			case DATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				primaryExpr();
				}
				break;
			case T__18:
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				not();
				setState(599);
				primaryExpr();
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

	public static class PrimaryExprContext extends ParserRuleContext {
		public CompareExprContext compareExpr() {
			return getRuleContext(CompareExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DBMSParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBMSParser.RPAREN, 0); }
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_primaryExpr);
		try {
			setState(608);
			switch (_input.LA(1)) {
			case ID:
			case NUM:
			case FLOAT:
			case CHARX:
			case DATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				compareExpr();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				match(LPAREN);
				setState(605);
				expression(0);
				setState(606);
				match(RPAREN);
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

	public static class CompareExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public CompareExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitCompareExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExprContext compareExpr() throws RecognitionException {
		CompareExprContext _localctx = new CompareExprContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_compareExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			term();
			setState(611);
			rel_op();
			setState(612);
			term();
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_term);
		try {
			setState(616);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				match(ID);
				}
				break;
			case NUM:
			case FLOAT:
			case CHARX:
			case DATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				literal();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 83:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 84:
			return andExpr_sempred((AndExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpr_sempred(AndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0093\u026d\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\6*\u0106\n*\r*\16*\u0107\3+\3+\5+\u010c"+
		"\n+\3,\3,\5,\u0110\n,\3-\3-\3-\3-\3-\5-\u0117\n-\3.\3.\3.\3.\3.\5.\u011e"+
		"\n.\3/\3/\7/\u0122\n/\f/\16/\u0125\13/\3\60\3\60\7\60\u0129\n\60\f\60"+
		"\16\60\u012c\13\60\3\61\3\61\3\61\3\61\7\61\u0132\n\61\f\61\16\61\u0135"+
		"\13\61\3\62\3\62\7\62\u0139\n\62\f\62\16\62\u013c\13\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\78\u015c\n"+
		"8\f8\168\u015f\138\39\39\39\39\79\u0165\n9\f9\169\u0168\139\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\5;\u0178\n;\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\5?\u019e\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\5@\u01af\n@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\7D\u01ca\nD\fD\16D\u01cd\13D\5D\u01cf\nD\3D\3D\3D"+
		"\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u01dd\nD\3E\3E\3E\3E\5E\u01e3\nE\3F\3F"+
		"\3F\3F\3F\5F\u01ea\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H"+
		"\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K"+
		"\5K\u0213\nK\3L\3L\3L\3L\3L\5L\u021a\nL\3L\3L\5L\u021e\nL\3M\3M\3M\3M"+
		"\5M\u0224\nM\7M\u0226\nM\fM\16M\u0229\13M\3N\3N\3N\5N\u022e\nN\3O\3O\3"+
		"P\3P\3Q\3Q\5Q\u0236\nQ\3R\3R\3S\3S\3T\3T\5T\u023e\nT\3U\3U\3U\3U\3U\3"+
		"U\3U\7U\u0247\nU\fU\16U\u024a\13U\3V\3V\3V\3V\3V\3V\3V\7V\u0253\nV\fV"+
		"\16V\u0256\13V\3W\3W\3W\3W\5W\u025c\nW\3X\3X\3X\3X\3X\5X\u0263\nX\3Y\3"+
		"Y\3Y\3Y\3Z\3Z\5Z\u026b\nZ\3Z\2\4\u00a8\u00aa[\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\2.\3\2\3\5\3\2\6\b\3\2\t\13\3\2\f\16\3\2\17\21\3\2"+
		"\22\24\3\2\25\27\3\2\30\32\3\2\33\35\3\2\36 \3\2!#\3\2$&\3\2\')\3\2)+"+
		"\3\2,.\3\2/\61\3\2\62\64\3\2\65\67\3\28:\3\2;=\3\2>@\3\2AC\3\2DF\3\2G"+
		"I\3\2JL\3\2MO\3\2PR\3\2SU\3\2VX\3\2Y[\3\2\\^\3\2_a\3\2bd\3\2eg\3\2hj\3"+
		"\2km\3\2np\3\2qs\3\2tv\3\2wy\3\2\u008c\u008f\4\2z~\u0087\u0087\3\2\177"+
		"\u0080\4\2\u0081\u0082\u0088\u0088\u0240\2\u00b4\3\2\2\2\4\u00b6\3\2\2"+
		"\2\6\u00b8\3\2\2\2\b\u00ba\3\2\2\2\n\u00bc\3\2\2\2\f\u00be\3\2\2\2\16"+
		"\u00c0\3\2\2\2\20\u00c2\3\2\2\2\22\u00c4\3\2\2\2\24\u00c6\3\2\2\2\26\u00c8"+
		"\3\2\2\2\30\u00ca\3\2\2\2\32\u00cc\3\2\2\2\34\u00ce\3\2\2\2\36\u00d0\3"+
		"\2\2\2 \u00d2\3\2\2\2\"\u00d4\3\2\2\2$\u00d6\3\2\2\2&\u00d8\3\2\2\2(\u00da"+
		"\3\2\2\2*\u00dc\3\2\2\2,\u00de\3\2\2\2.\u00e0\3\2\2\2\60\u00e2\3\2\2\2"+
		"\62\u00e4\3\2\2\2\64\u00e6\3\2\2\2\66\u00e8\3\2\2\28\u00ea\3\2\2\2:\u00ec"+
		"\3\2\2\2<\u00ee\3\2\2\2>\u00f0\3\2\2\2@\u00f2\3\2\2\2B\u00f4\3\2\2\2D"+
		"\u00f6\3\2\2\2F\u00f8\3\2\2\2H\u00fa\3\2\2\2J\u00fc\3\2\2\2L\u00fe\3\2"+
		"\2\2N\u0100\3\2\2\2P\u0102\3\2\2\2R\u0105\3\2\2\2T\u010b\3\2\2\2V\u010f"+
		"\3\2\2\2X\u0116\3\2\2\2Z\u011d\3\2\2\2\\\u0123\3\2\2\2^\u012a\3\2\2\2"+
		"`\u0133\3\2\2\2b\u013a\3\2\2\2d\u013d\3\2\2\2f\u0142\3\2\2\2h\u014a\3"+
		"\2\2\2j\u014f\3\2\2\2l\u0153\3\2\2\2n\u015d\3\2\2\2p\u0166\3\2\2\2r\u0169"+
		"\3\2\2\2t\u0177\3\2\2\2v\u0179\3\2\2\2x\u0181\3\2\2\2z\u018f\3\2\2\2|"+
		"\u019d\3\2\2\2~\u01ae\3\2\2\2\u0080\u01b0\3\2\2\2\u0082\u01b5\3\2\2\2"+
		"\u0084\u01b9\3\2\2\2\u0086\u01dc\3\2\2\2\u0088\u01e2\3\2\2\2\u008a\u01e9"+
		"\3\2\2\2\u008c\u01eb\3\2\2\2\u008e\u01f6\3\2\2\2\u0090\u0200\3\2\2\2\u0092"+
		"\u0206\3\2\2\2\u0094\u0212\3\2\2\2\u0096\u021d\3\2\2\2\u0098\u0227\3\2"+
		"\2\2\u009a\u022d\3\2\2\2\u009c\u022f\3\2\2\2\u009e\u0231\3\2\2\2\u00a0"+
		"\u0235\3\2\2\2\u00a2\u0237\3\2\2\2\u00a4\u0239\3\2\2\2\u00a6\u023d\3\2"+
		"\2\2\u00a8\u023f\3\2\2\2\u00aa\u024b\3\2\2\2\u00ac\u025b\3\2\2\2\u00ae"+
		"\u0262\3\2\2\2\u00b0\u0264\3\2\2\2\u00b2\u026a\3\2\2\2\u00b4\u00b5\t\2"+
		"\2\2\u00b5\3\3\2\2\2\u00b6\u00b7\t\3\2\2\u00b7\5\3\2\2\2\u00b8\u00b9\t"+
		"\4\2\2\u00b9\7\3\2\2\2\u00ba\u00bb\t\5\2\2\u00bb\t\3\2\2\2\u00bc\u00bd"+
		"\t\6\2\2\u00bd\13\3\2\2\2\u00be\u00bf\t\7\2\2\u00bf\r\3\2\2\2\u00c0\u00c1"+
		"\t\b\2\2\u00c1\17\3\2\2\2\u00c2\u00c3\t\t\2\2\u00c3\21\3\2\2\2\u00c4\u00c5"+
		"\t\n\2\2\u00c5\23\3\2\2\2\u00c6\u00c7\t\13\2\2\u00c7\25\3\2\2\2\u00c8"+
		"\u00c9\t\f\2\2\u00c9\27\3\2\2\2\u00ca\u00cb\t\r\2\2\u00cb\31\3\2\2\2\u00cc"+
		"\u00cd\t\16\2\2\u00cd\33\3\2\2\2\u00ce\u00cf\t\17\2\2\u00cf\35\3\2\2\2"+
		"\u00d0\u00d1\t\20\2\2\u00d1\37\3\2\2\2\u00d2\u00d3\t\21\2\2\u00d3!\3\2"+
		"\2\2\u00d4\u00d5\t\22\2\2\u00d5#\3\2\2\2\u00d6\u00d7\t\23\2\2\u00d7%\3"+
		"\2\2\2\u00d8\u00d9\t\24\2\2\u00d9\'\3\2\2\2\u00da\u00db\t\25\2\2\u00db"+
		")\3\2\2\2\u00dc\u00dd\t\26\2\2\u00dd+\3\2\2\2\u00de\u00df\t\27\2\2\u00df"+
		"-\3\2\2\2\u00e0\u00e1\t\30\2\2\u00e1/\3\2\2\2\u00e2\u00e3\t\31\2\2\u00e3"+
		"\61\3\2\2\2\u00e4\u00e5\t\32\2\2\u00e5\63\3\2\2\2\u00e6\u00e7\t\33\2\2"+
		"\u00e7\65\3\2\2\2\u00e8\u00e9\t\34\2\2\u00e9\67\3\2\2\2\u00ea\u00eb\t"+
		"\35\2\2\u00eb9\3\2\2\2\u00ec\u00ed\t\36\2\2\u00ed;\3\2\2\2\u00ee\u00ef"+
		"\t\37\2\2\u00ef=\3\2\2\2\u00f0\u00f1\t \2\2\u00f1?\3\2\2\2\u00f2\u00f3"+
		"\t!\2\2\u00f3A\3\2\2\2\u00f4\u00f5\t\"\2\2\u00f5C\3\2\2\2\u00f6\u00f7"+
		"\t#\2\2\u00f7E\3\2\2\2\u00f8\u00f9\t$\2\2\u00f9G\3\2\2\2\u00fa\u00fb\t"+
		"%\2\2\u00fbI\3\2\2\2\u00fc\u00fd\t&\2\2\u00fdK\3\2\2\2\u00fe\u00ff\t\'"+
		"\2\2\u00ffM\3\2\2\2\u0100\u0101\t(\2\2\u0101O\3\2\2\2\u0102\u0103\t)\2"+
		"\2\u0103Q\3\2\2\2\u0104\u0106\5T+\2\u0105\u0104\3\2\2\2\u0106\u0107\3"+
		"\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108S\3\2\2\2\u0109\u010c"+
		"\5V,\2\u010a\u010c\5\u0088E\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2"+
		"\u010cU\3\2\2\2\u010d\u0110\5X-\2\u010e\u0110\5Z.\2\u010f\u010d\3\2\2"+
		"\2\u010f\u010e\3\2\2\2\u0110W\3\2\2\2\u0111\u0117\5d\63\2\u0112\u0117"+
		"\5f\64\2\u0113\u0117\5h\65\2\u0114\u0117\5j\66\2\u0115\u0117\5l\67\2\u0116"+
		"\u0111\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0115\3\2\2\2\u0117Y\3\2\2\2\u0118\u011e\5r:\2\u0119\u011e"+
		"\5~@\2\u011a\u011e\5\u0080A\2\u011b\u011e\5\u0082B\2\u011c\u011e\5\u0084"+
		"C\2\u011d\u0118\3\2\2\2\u011d\u0119\3\2\2\2\u011d\u011a\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e[\3\2\2\2\u011f\u0120\7\u0093"+
		"\2\2\u0120\u0122\7\u008b\2\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124]\3\2\2\2\u0125\u0123\3\2\2\2"+
		"\u0126\u0127\7\u0093\2\2\u0127\u0129\5\u009cO\2\u0128\u0126\3\2\2\2\u0129"+
		"\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b_\3\2\2\2"+
		"\u012c\u012a\3\2\2\2\u012d\u012e\7\u0093\2\2\u012e\u012f\7\u008b\2\2\u012f"+
		"\u0130\7\u0087\2\2\u0130\u0132\5\u009cO\2\u0131\u012d\3\2\2\2\u0132\u0135"+
		"\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134a\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u0137\7\u0093\2\2\u0137\u0139\5\u0086D\2\u0138\u0136"+
		"\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"c\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\5\20\t\2\u013e\u013f\5\22\n"+
		"\2\u013f\u0140\7\u008b\2\2\u0140\u0141\7\u0092\2\2\u0141e\3\2\2\2\u0142"+
		"\u0143\5\"\22\2\u0143\u0144\5\22\n\2\u0144\u0145\7\u008b\2\2\u0145\u0146"+
		"\5&\24\2\u0146\u0147\5<\37\2\u0147\u0148\7\u008b\2\2\u0148\u0149\7\u0092"+
		"\2\2\u0149g\3\2\2\2\u014a\u014b\5 \21\2\u014b\u014c\5\22\n\2\u014c\u014d"+
		"\7\u008b\2\2\u014d\u014e\7\u0092\2\2\u014ei\3\2\2\2\u014f\u0150\5\36\20"+
		"\2\u0150\u0151\5\24\13\2\u0151\u0152\7\u0092\2\2\u0152k\3\2\2\2\u0153"+
		"\u0154\5$\23\2\u0154\u0155\5\22\n\2\u0155\u0156\7\u008b\2\2\u0156\u0157"+
		"\7\u0092\2\2\u0157m\3\2\2\2\u0158\u0159\7\u0093\2\2\u0159\u015a\7\u008b"+
		"\2\2\u015a\u015c\5|?\2\u015b\u0158\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015eo\3\2\2\2\u015f\u015d\3\2\2\2\u0160"+
		"\u0161\7\u0093\2\2\u0161\u0162\5(\25\2\u0162\u0163\5t;\2\u0163\u0165\3"+
		"\2\2\2\u0164\u0160\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167q\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\5\20\t\2"+
		"\u016a\u016b\5\26\f\2\u016b\u016c\7\u008b\2\2\u016c\u016d\7\u0083\2\2"+
		"\u016d\u016e\7\u008b\2\2\u016e\u016f\5|?\2\u016f\u0170\5n8\2\u0170\u0171"+
		"\5p9\2\u0171\u0172\7\u0084\2\2\u0172\u0173\7\u0092\2\2\u0173s\3\2\2\2"+
		"\u0174\u0178\5v<\2\u0175\u0178\5x=\2\u0176\u0178\5z>\2\u0177\u0174\3\2"+
		"\2\2\u0177\u0175\3\2\2\2\u0177\u0176\3\2\2\2\u0178u\3\2\2\2\u0179\u017a"+
		"\7\u008b\2\2\u017a\u017b\5,\27\2\u017b\u017c\5*\26\2\u017c\u017d\7\u0083"+
		"\2\2\u017d\u017e\7\u008b\2\2\u017e\u017f\5\\/\2\u017f\u0180\7\u0084\2"+
		"\2\u0180w\3\2\2\2\u0181\u0182\7\u008b\2\2\u0182\u0183\5.\30\2\u0183\u0184"+
		"\5*\26\2\u0184\u0185\7\u0083\2\2\u0185\u0186\7\u008b\2\2\u0186\u0187\5"+
		"\\/\2\u0187\u0188\7\u0084\2\2\u0188\u0189\5> \2\u0189\u018a\7\u008b\2"+
		"\2\u018a\u018b\7\u0083\2\2\u018b\u018c\7\u008b\2\2\u018c\u018d\5\\/\2"+
		"\u018d\u018e\7\u0084\2\2\u018ey\3\2\2\2\u018f\u0190\7\u008b\2\2\u0190"+
		"\u0191\5\60\31\2\u0191\u0192\7\u0083\2\2\u0192\u0193\5\u00a6T\2\u0193"+
		"\u0194\7\u0084\2\2\u0194{\3\2\2\2\u0195\u019e\5\2\2\2\u0196\u019e\5\4"+
		"\3\2\u0197\u019e\5\6\4\2\u0198\u0199\5\b\5\2\u0199\u019a\7\u0083\2\2\u019a"+
		"\u019b\7\u008c\2\2\u019b\u019c\7\u0084\2\2\u019c\u019e\3\2\2\2\u019d\u0195"+
		"\3\2\2\2\u019d\u0196\3\2\2\2\u019d\u0197\3\2\2\2\u019d\u0198\3\2\2\2\u019e"+
		"}\3\2\2\2\u019f\u01a0\5\"\22\2\u01a0\u01a1\5\26\f\2\u01a1\u01a2\7\u008b"+
		"\2\2\u01a2\u01a3\5&\24\2\u01a3\u01a4\5<\37\2\u01a4\u01a5\7\u008b\2\2\u01a5"+
		"\u01a6\7\u0092\2\2\u01a6\u01af\3\2\2\2\u01a7\u01a8\5\"\22\2\u01a8\u01a9"+
		"\5\26\f\2\u01a9\u01aa\7\u008b\2\2\u01aa\u01ab\5\u0086D\2\u01ab\u01ac\5"+
		"b\62\2\u01ac\u01ad\7\u0092\2\2\u01ad\u01af\3\2\2\2\u01ae\u019f\3\2\2\2"+
		"\u01ae\u01a7\3\2\2\2\u01af\177\3\2\2\2\u01b0\u01b1\5 \21\2\u01b1\u01b2"+
		"\5\26\f\2\u01b2\u01b3\7\u008b\2\2\u01b3\u01b4\7\u0092\2\2\u01b4\u0081"+
		"\3\2\2\2\u01b5\u01b6\5\36\20\2\u01b6\u01b7\5\30\r\2\u01b7\u01b8\7\u0092"+
		"\2\2\u01b8\u0083\3\2\2\2\u01b9\u01ba\5\36\20\2\u01ba\u01bb\5\34\17\2\u01bb"+
		"\u01bc\5\64\33\2\u01bc\u01bd\7\u008b\2\2\u01bd\u01be\7\u0092\2\2\u01be"+
		"\u0085\3\2\2\2\u01bf\u01c0\5@!\2\u01c0\u01c1\5\32\16\2\u01c1\u01c2\7\u008b"+
		"\2\2\u01c2\u01ce\5|?\2\u01c3\u01c4\5(\25\2\u01c4\u01cb\5t;\2\u01c5\u01c6"+
		"\7\u0093\2\2\u01c6\u01c7\5(\25\2\u01c7\u01c8\5t;\2\u01c8\u01ca\3\2\2\2"+
		"\u01c9\u01c5\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01c3\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01dd\3\2\2\2\u01d0\u01d1\5@!\2\u01d1\u01d2\5(\25"+
		"\2\u01d2\u01d3\5t;\2\u01d3\u01dd\3\2\2\2\u01d4\u01d5\5 \21\2\u01d5\u01d6"+
		"\5\32\16\2\u01d6\u01d7\7\u008b\2\2\u01d7\u01dd\3\2\2\2\u01d8\u01d9\5 "+
		"\21\2\u01d9\u01da\5(\25\2\u01da\u01db\7\u008b\2\2\u01db\u01dd\3\2\2\2"+
		"\u01dc\u01bf\3\2\2\2\u01dc\u01d0\3\2\2\2\u01dc\u01d4\3\2\2\2\u01dc\u01d8"+
		"\3\2\2\2\u01dd\u0087\3\2\2\2\u01de\u01e3\5\u008cG\2\u01df\u01e3\5\u008e"+
		"H\2\u01e0\u01e3\5\u0090I\2\u01e1\u01e3\5\u0092J\2\u01e2\u01de\3\2\2\2"+
		"\u01e2\u01df\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3\u0089"+
		"\3\2\2\2\u01e4\u01e5\7\u0083\2\2\u01e5\u01e6\7\u008b\2\2\u01e6\u01e7\5"+
		"\\/\2\u01e7\u01e8\7\u0084\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e4\3\2\2\2"+
		"\u01e9\u01ea\3\2\2\2\u01ea\u008b\3\2\2\2\u01eb\u01ec\5B\"\2\u01ec\u01ed"+
		"\5D#\2\u01ed\u01ee\7\u008b\2\2\u01ee\u01ef\5\u008aF\2\u01ef\u01f0\5F$"+
		"\2\u01f0\u01f1\7\u0083\2\2\u01f1\u01f2\5\u009cO\2\u01f2\u01f3\5^\60\2"+
		"\u01f3\u01f4\7\u0084\2\2\u01f4\u01f5\7\u0092\2\2\u01f5\u008d\3\2\2\2\u01f6"+
		"\u01f7\5H%\2\u01f7\u01f8\7\u008b\2\2\u01f8\u01f9\5J&\2\u01f9\u01fa\7\u008b"+
		"\2\2\u01fa\u01fb\7\u0087\2\2\u01fb\u01fc\5\u009cO\2\u01fc\u01fd\5`\61"+
		"\2\u01fd\u01fe\5\u0094K\2\u01fe\u01ff\7\u0092\2\2\u01ff\u008f\3\2\2\2"+
		"\u0200\u0201\5L\'\2\u0201\u0202\5\64\33\2\u0202\u0203\7\u008b\2\2\u0203"+
		"\u0204\5\u0094K\2\u0204\u0205\7\u0092\2\2\u0205\u0091\3\2\2\2\u0206\u0207"+
		"\5\62\32\2\u0207\u0208\5\u009aN\2\u0208\u0209\5\64\33\2\u0209\u020a\7"+
		"\u008b\2\2\u020a\u020b\5\\/\2\u020b\u020c\5\u0094K\2\u020c\u020d\5\u0096"+
		"L\2\u020d\u020e\7\u0092\2\2\u020e\u0093\3\2\2\2\u020f\u0210\5\66\34\2"+
		"\u0210\u0211\5\u00a6T\2\u0211\u0213\3\2\2\2\u0212\u020f\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213\u0095\3\2\2\2\u0214\u0215\5N(\2\u0215\u0216\5P)\2"+
		"\u0216\u0219\7\u008b\2\2\u0217\u021a\58\35\2\u0218\u021a\5:\36\2\u0219"+
		"\u0217\3\2\2\2\u0219\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\5\u0098"+
		"M\2\u021c\u021e\3\2\2\2\u021d\u0214\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u0097\3\2\2\2\u021f\u0220\7\u0093\2\2\u0220\u0223\7\u008b\2\2\u0221\u0224"+
		"\58\35\2\u0222\u0224\5:\36\2\u0223\u0221\3\2\2\2\u0223\u0222\3\2\2\2\u0224"+
		"\u0226\3\2\2\2\u0225\u021f\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2"+
		"\2\2\u0227\u0228\3\2\2\2\u0228\u0099\3\2\2\2\u0229\u0227\3\2\2\2\u022a"+
		"\u022e\7\u0088\2\2\u022b\u022c\7\u008b\2\2\u022c\u022e\5\\/\2\u022d\u022a"+
		"\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u009b\3\2\2\2\u022f\u0230\t*\2\2\u0230"+
		"\u009d\3\2\2\2\u0231\u0232\t+\2\2\u0232\u009f\3\2\2\2\u0233\u0236\5\n"+
		"\6\2\u0234\u0236\5\f\7\2\u0235\u0233\3\2\2\2\u0235\u0234\3\2\2\2\u0236"+
		"\u00a1\3\2\2\2\u0237\u0238\t,\2\2\u0238\u00a3\3\2\2\2\u0239\u023a\t-\2"+
		"\2\u023a\u00a5\3\2\2\2\u023b\u023e\5\u00a8U\2\u023c\u023e\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023d\u023c\3\2\2\2\u023e\u00a7\3\2\2\2\u023f\u0240\bU"+
		"\1\2\u0240\u0241\5\u00aaV\2\u0241\u0248\3\2\2\2\u0242\u0243\f\3\2\2\u0243"+
		"\u0244\5\f\7\2\u0244\u0245\5\u00aaV\2\u0245\u0247\3\2\2\2\u0246\u0242"+
		"\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249"+
		"\u00a9\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024c\bV\1\2\u024c\u024d\5\u00ac"+
		"W\2\u024d\u0254\3\2\2\2\u024e\u024f\f\3\2\2\u024f\u0250\5\n\6\2\u0250"+
		"\u0251\5\u00acW\2\u0251\u0253\3\2\2\2\u0252\u024e\3\2\2\2\u0253\u0256"+
		"\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u00ab\3\2\2\2\u0256"+
		"\u0254\3\2\2\2\u0257\u025c\5\u00aeX\2\u0258\u0259\5\16\b\2\u0259\u025a"+
		"\5\u00aeX\2\u025a\u025c\3\2\2\2\u025b\u0257\3\2\2\2\u025b\u0258\3\2\2"+
		"\2\u025c\u00ad\3\2\2\2\u025d\u0263\5\u00b0Y\2\u025e\u025f\7\u0083\2\2"+
		"\u025f\u0260\5\u00a8U\2\u0260\u0261\7\u0084\2\2\u0261\u0263\3\2\2\2\u0262"+
		"\u025d\3\2\2\2\u0262\u025e\3\2\2\2\u0263\u00af\3\2\2\2\u0264\u0265\5\u00b2"+
		"Z\2\u0265\u0266\5\u009eP\2\u0266\u0267\5\u00b2Z\2\u0267\u00b1\3\2\2\2"+
		"\u0268\u026b\7\u008b\2\2\u0269\u026b\5\u009cO\2\u026a\u0268\3\2\2\2\u026a"+
		"\u0269\3\2\2\2\u026b\u00b3\3\2\2\2\"\u0107\u010b\u010f\u0116\u011d\u0123"+
		"\u012a\u0133\u013a\u015d\u0166\u0177\u019d\u01ae\u01cb\u01ce\u01dc\u01e2"+
		"\u01e9\u0212\u0219\u021d\u0223\u0227\u022d\u0235\u023d\u0248\u0254\u025b"+
		"\u0262\u026a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}