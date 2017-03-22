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
		LPAREN=18, RPAREN=19, LBRACKET=20, RBRACKET=21, EQ=22, KL=23, INT=24, 
		CHAR=25, AND=26, OR=27, NOT=28, BOOLEAN=29, DATETIME=30, ID=31, NUM=32, 
		FLOAT=33, CHARX=34, DATE=35, WS=36, COMMENT=37, CREATE=38, DATABASE=39, 
		DATABASES=40, TABLE=41, TABLES=42, COLUMN=43, COLUMNS=44, SHOW=45, DROP=46, 
		ALTER=47, USE=48, RENAME=49, END_SQL=50, COMMA=51, CONSTRAINT=52, KEY=53, 
		PRIMARY=54, FOREIGN=55, CHECK=56, SELECT=57, FROM=58, WHERE=59, ASC=60, 
		DESC=61, TO=62, REFERENCES=63, ADD=64, INSERT=65, INTO=66, VALUES=67, 
		UPDATE=68, SET=69, DELETE=70, ORDER=71, BY=72;
	public static final int
		RULE_sql = 0, RULE_sql_executable = 1, RULE_sql_ddl = 2, RULE_database_statement = 3, 
		RULE_table_statement = 4, RULE_create_database = 5, RULE_alter_database = 6, 
		RULE_drop_database = 7, RULE_show_database = 8, RULE_use_database = 9, 
		RULE_create_table = 10, RULE_column = 11, RULE_constraint = 12, RULE_type = 13, 
		RULE_alter_table = 14, RULE_drop_table = 15, RULE_show_tables = 16, RULE_show_columns = 17, 
		RULE_action = 18, RULE_sql_dml = 19, RULE_insert_value = 20, RULE_update_value = 21, 
		RULE_delete_value = 22, RULE_select_value = 23, RULE_literal = 24, RULE_rel_op = 25, 
		RULE_cond_op = 26, RULE_eq_op = 27, RULE_add_op = 28, RULE_mult_op = 29, 
		RULE_exp = 30, RULE_expression = 31, RULE_andExpr = 32, RULE_eqExpr = 33, 
		RULE_relationExpr = 34, RULE_unaryExpr = 35, RULE_unifactor = 36, RULE_factor = 37;
	public static final String[] ruleNames = {
		"sql", "sql_executable", "sql_ddl", "database_statement", "table_statement", 
		"create_database", "alter_database", "drop_database", "show_database", 
		"use_database", "create_table", "column", "constraint", "type", "alter_table", 
		"drop_table", "show_tables", "show_columns", "action", "sql_dml", "insert_value", 
		"update_value", "delete_value", "select_value", "literal", "rel_op", "cond_op", 
		"eq_op", "add_op", "mult_op", "exp", "expression", "andExpr", "eqExpr", 
		"relationExpr", "unaryExpr", "unifactor", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PK_'", "'FK_'", "'CH_'", "'<'", "'>'", "'<='", "'>='", "'<>'", 
		"'AND'", "'OR'", "'=='", "'!='", "'+'", "'-'", "'/'", "'%'", "'NOT'", 
		"'('", "')'", "'['", "']'", "'='", "'*'", "'int'", "'char'", null, null, 
		null, "'boolean'", "'datetime'", null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
		"EQ", "KL", "INT", "CHAR", "AND", "OR", "NOT", "BOOLEAN", "DATETIME", 
		"ID", "NUM", "FLOAT", "CHARX", "DATE", "WS", "COMMENT", "CREATE", "DATABASE", 
		"DATABASES", "TABLE", "TABLES", "COLUMN", "COLUMNS", "SHOW", "DROP", "ALTER", 
		"USE", "RENAME", "END_SQL", "COMMA", "CONSTRAINT", "KEY", "PRIMARY", "FOREIGN", 
		"CHECK", "SELECT", "FROM", "WHERE", "ASC", "DESC", "TO", "REFERENCES", 
		"ADD", "INSERT", "INTO", "VALUES", "UPDATE", "SET", "DELETE", "ORDER", 
		"BY"
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
		enterRule(_localctx, 0, RULE_sql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				sql_executable();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (CREATE - 38)) | (1L << (SHOW - 38)) | (1L << (DROP - 38)) | (1L << (ALTER - 38)) | (1L << (USE - 38)) | (1L << (SELECT - 38)) | (1L << (INSERT - 38)) | (1L << (UPDATE - 38)) | (1L << (DELETE - 38)))) != 0) );
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
		enterRule(_localctx, 2, RULE_sql_executable);
		try {
			setState(83);
			switch (_input.LA(1)) {
			case CREATE:
			case SHOW:
			case DROP:
			case ALTER:
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				sql_ddl();
				}
				break;
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
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
		enterRule(_localctx, 4, RULE_sql_ddl);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				database_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
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
		enterRule(_localctx, 6, RULE_database_statement);
		try {
			setState(94);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				create_database();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				alter_database();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				drop_database();
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				show_database();
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
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
		enterRule(_localctx, 8, RULE_table_statement);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				create_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				alter_table();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				drop_table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				show_tables();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
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

	public static class Create_databaseContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(DBMSParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(DBMSParser.DATABASE, 0); }
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
		enterRule(_localctx, 10, RULE_create_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(CREATE);
			setState(104);
			match(DATABASE);
			setState(105);
			match(ID);
			setState(106);
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
		public TerminalNode ALTER() { return getToken(DBMSParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(DBMSParser.DATABASE, 0); }
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public TerminalNode RENAME() { return getToken(DBMSParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(DBMSParser.TO, 0); }
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
		enterRule(_localctx, 12, RULE_alter_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(ALTER);
			setState(109);
			match(DATABASE);
			setState(110);
			match(ID);
			setState(111);
			match(RENAME);
			setState(112);
			match(TO);
			setState(113);
			match(ID);
			setState(114);
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
		public TerminalNode DROP() { return getToken(DBMSParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(DBMSParser.DATABASE, 0); }
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
		enterRule(_localctx, 14, RULE_drop_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(DROP);
			setState(117);
			match(DATABASE);
			setState(118);
			match(ID);
			setState(119);
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
		public TerminalNode SHOW() { return getToken(DBMSParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(DBMSParser.DATABASES, 0); }
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
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
		enterRule(_localctx, 16, RULE_show_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(SHOW);
			setState(122);
			match(DATABASES);
			setState(123);
			match(ID);
			setState(124);
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
		public TerminalNode USE() { return getToken(DBMSParser.USE, 0); }
		public TerminalNode DATABASE() { return getToken(DBMSParser.DATABASE, 0); }
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
		enterRule(_localctx, 18, RULE_use_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(USE);
			setState(127);
			match(DATABASE);
			setState(128);
			match(ID);
			setState(129);
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

	public static class Create_tableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(DBMSParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(DBMSParser.TABLE, 0); }
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(DBMSParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DBMSParser.RPAREN, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
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
		enterRule(_localctx, 20, RULE_create_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(CREATE);
			setState(132);
			match(TABLE);
			setState(133);
			match(ID);
			setState(134);
			match(LPAREN);
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				column();
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==CONSTRAINT );
			setState(140);
			match(RPAREN);
			setState(141);
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

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DBMSParser.COMMA, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_column);
		try {
			setState(148);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(ID);
				setState(144);
				type();
				{
				setState(145);
				match(COMMA);
				}
				}
				break;
			case CONSTRAINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				constraint();
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

	public static class ConstraintContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(DBMSParser.CONSTRAINT, 0); }
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public TerminalNode PRIMARY() { return getToken(DBMSParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(DBMSParser.KEY, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(DBMSParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DBMSParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(DBMSParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DBMSParser.RPAREN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public TerminalNode FOREIGN() { return getToken(DBMSParser.FOREIGN, 0); }
		public TerminalNode REFERENCES() { return getToken(DBMSParser.REFERENCES, 0); }
		public TerminalNode CHECK() { return getToken(DBMSParser.CHECK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_constraint);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(CONSTRAINT);
				setState(151);
				match(T__0);
				setState(152);
				match(ID);
				setState(153);
				match(PRIMARY);
				setState(154);
				match(KEY);
				setState(155);
				match(LPAREN);
				setState(156);
				match(ID);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(157);
					match(COMMA);
					setState(158);
					match(ID);
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(CONSTRAINT);
				setState(166);
				match(T__1);
				setState(167);
				match(ID);
				setState(168);
				match(FOREIGN);
				setState(169);
				match(KEY);
				setState(170);
				match(LPAREN);
				setState(171);
				match(ID);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(172);
					match(COMMA);
					setState(173);
					match(ID);
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179);
				match(RPAREN);
				setState(180);
				match(REFERENCES);
				setState(181);
				match(ID);
				setState(182);
				match(RPAREN);
				setState(183);
				match(ID);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(184);
					match(COMMA);
					setState(185);
					match(ID);
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(191);
				match(LPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(CONSTRAINT);
				setState(193);
				match(T__2);
				setState(194);
				match(ID);
				setState(195);
				match(CHECK);
				setState(196);
				match(RPAREN);
				setState(197);
				expression(0);
				setState(198);
				match(LPAREN);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DBMSParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(DBMSParser.FLOAT, 0); }
		public TerminalNode DATE() { return getToken(DBMSParser.DATE, 0); }
		public TerminalNode CHAR() { return getToken(DBMSParser.CHAR, 0); }
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
		enterRule(_localctx, 26, RULE_type);
		try {
			setState(209);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(FLOAT);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(DATE);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(CHAR);
				setState(206);
				match(LPAREN);
				setState(207);
				match(NUM);
				setState(208);
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
		public TerminalNode ALTER() { return getToken(DBMSParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(DBMSParser.TABLE, 0); }
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public TerminalNode RENAME() { return getToken(DBMSParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(DBMSParser.TO, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
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
		enterRule(_localctx, 28, RULE_alter_table);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(ALTER);
				setState(212);
				match(TABLE);
				setState(213);
				match(ID);
				setState(214);
				match(RENAME);
				setState(215);
				match(TO);
				setState(216);
				match(ID);
				setState(217);
				match(END_SQL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(ALTER);
				setState(219);
				match(TABLE);
				setState(220);
				match(ID);
				setState(221);
				action();
				setState(222);
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
		public TerminalNode DROP() { return getToken(DBMSParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(DBMSParser.DATABASE, 0); }
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
		enterRule(_localctx, 30, RULE_drop_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(DROP);
			setState(227);
			match(DATABASE);
			setState(228);
			match(ID);
			setState(229);
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
		public TerminalNode SHOW() { return getToken(DBMSParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(DBMSParser.TABLES, 0); }
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
		enterRule(_localctx, 32, RULE_show_tables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(SHOW);
			setState(232);
			match(TABLES);
			setState(233);
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
		public TerminalNode SHOW() { return getToken(DBMSParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(DBMSParser.COLUMNS, 0); }
		public TerminalNode FROM() { return getToken(DBMSParser.FROM, 0); }
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
		enterRule(_localctx, 34, RULE_show_columns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(SHOW);
			setState(236);
			match(COLUMNS);
			setState(237);
			match(FROM);
			setState(238);
			match(ID);
			setState(239);
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
		public TerminalNode ADD() { return getToken(DBMSParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(DBMSParser.COLUMN, 0); }
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
		public TerminalNode DROP() { return getToken(DBMSParser.DROP, 0); }
		public TerminalNode CONSTRAINT() { return getToken(DBMSParser.CONSTRAINT, 0); }
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
		enterRule(_localctx, 36, RULE_action);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(ADD);
				setState(242);
				match(COLUMN);
				setState(243);
				match(ID);
				setState(244);
				type();
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(245);
					constraint();
					}
					}
					setState(248); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONSTRAINT );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(ADD);
				setState(251);
				constraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(DROP);
				setState(253);
				match(COLUMN);
				setState(254);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				match(DROP);
				setState(256);
				match(CONSTRAINT);
				setState(257);
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
		enterRule(_localctx, 38, RULE_sql_dml);
		try {
			setState(264);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				insert_value();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				update_value();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				delete_value();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
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

	public static class Insert_valueContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(DBMSParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(DBMSParser.INTO, 0); }
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public TerminalNode VALUES() { return getToken(DBMSParser.VALUES, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(DBMSParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DBMSParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(DBMSParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DBMSParser.RPAREN, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
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
		enterRule(_localctx, 40, RULE_insert_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(INSERT);
			setState(267);
			match(INTO);
			setState(268);
			match(ID);
			setState(281);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(269);
				match(LPAREN);
				setState(278);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					{
					setState(270);
					match(ID);
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(271);
						match(COMMA);
						setState(272);
						match(ID);
						}
						}
						setState(277);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(280);
				match(RPAREN);
				}
			}

			setState(283);
			match(VALUES);
			setState(296);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(284);
				match(LPAREN);
				setState(293);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << FLOAT) | (1L << CHARX) | (1L << DATE))) != 0)) {
					{
					{
					setState(285);
					literal();
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(286);
						match(COMMA);
						setState(287);
						literal();
						}
						}
						setState(292);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(295);
				match(RPAREN);
				}
			}

			setState(298);
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
		public TerminalNode UPDATE() { return getToken(DBMSParser.UPDATE, 0); }
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public TerminalNode SET() { return getToken(DBMSParser.SET, 0); }
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
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public TerminalNode WHERE() { return getToken(DBMSParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_update_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(UPDATE);
			setState(301);
			match(ID);
			setState(302);
			match(SET);
			setState(303);
			match(ID);
			setState(304);
			match(EQ);
			setState(305);
			literal();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(306);
				match(COMMA);
				setState(307);
				match(ID);
				setState(308);
				match(EQ);
				setState(309);
				literal();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(315);
				match(WHERE);
				setState(316);
				expression(0);
				}
			}

			setState(319);
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
		public TerminalNode DELETE() { return getToken(DBMSParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(DBMSParser.FROM, 0); }
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public TerminalNode WHERE() { return getToken(DBMSParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_delete_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(DELETE);
			setState(322);
			match(FROM);
			setState(323);
			match(ID);
			setState(326);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(324);
				match(WHERE);
				setState(325);
				expression(0);
				}
			}

			setState(328);
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
		public TerminalNode SELECT() { return getToken(DBMSParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(DBMSParser.FROM, 0); }
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public TerminalNode KL() { return getToken(DBMSParser.KL, 0); }
		public TerminalNode WHERE() { return getToken(DBMSParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(DBMSParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(DBMSParser.BY, 0); }
		public TerminalNode ASC() { return getToken(DBMSParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(DBMSParser.DESC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
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
		enterRule(_localctx, 46, RULE_select_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(SELECT);
			setState(340);
			switch (_input.LA(1)) {
			case KL:
				{
				setState(331);
				match(KL);
				}
				break;
			case ID:
				{
				setState(332);
				match(ID);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(333);
					match(COMMA);
					setState(334);
					match(ID);
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(342);
			match(FROM);
			setState(343);
			match(ID);
			setState(346);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(344);
				match(WHERE);
				setState(345);
				expression(0);
				}
			}

			setState(351);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(348);
				match(ORDER);
				setState(349);
				match(BY);
				setState(350);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(353);
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
		enterRule(_localctx, 48, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << FLOAT) | (1L << CHARX) | (1L << DATE))) != 0)) ) {
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
		enterRule(_localctx, 50, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << EQ))) != 0)) ) {
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
		enterRule(_localctx, 52, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
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

	public static class Eq_opContext extends ParserRuleContext {
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitEq_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitEq_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
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
		enterRule(_localctx, 56, RULE_add_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
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
		enterRule(_localctx, 58, RULE_mult_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << KL))) != 0)) ) {
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
		enterRule(_localctx, 60, RULE_exp);
		try {
			setState(369);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				expression(0);
				}
				break;
			case EOF:
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
		public TerminalNode OR() { return getToken(DBMSParser.OR, 0); }
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(372);
			andExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(379);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(374);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(375);
					match(OR);
					setState(376);
					andExpr(0);
					}
					} 
				}
				setState(381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public EqExprContext eqExpr() {
			return getRuleContext(EqExprContext.class,0);
		}
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public TerminalNode AND() { return getToken(DBMSParser.AND, 0); }
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_andExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(383);
			eqExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpr);
					setState(385);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(386);
					match(AND);
					setState(387);
					eqExpr(0);
					}
					} 
				}
				setState(392);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqExprContext extends ParserRuleContext {
		public RelationExprContext relationExpr() {
			return getRuleContext(RelationExprContext.class,0);
		}
		public EqExprContext eqExpr() {
			return getRuleContext(EqExprContext.class,0);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public EqExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqExprContext eqExpr() throws RecognitionException {
		return eqExpr(0);
	}

	private EqExprContext eqExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqExprContext _localctx = new EqExprContext(_ctx, _parentState);
		EqExprContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_eqExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(394);
			relationExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_eqExpr);
					setState(396);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(397);
					eq_op();
					setState(398);
					relationExpr(0);
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class RelationExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public RelationExprContext relationExpr() {
			return getRuleContext(RelationExprContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public RelationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterRelationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitRelationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitRelationExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationExprContext relationExpr() throws RecognitionException {
		return relationExpr(0);
	}

	private RelationExprContext relationExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationExprContext _localctx = new RelationExprContext(_ctx, _parentState);
		RelationExprContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_relationExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(406);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationExpr);
					setState(408);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(409);
					rel_op();
					setState(410);
					unaryExpr();
					}
					} 
				}
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class UnaryExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TerminalNode NOT() { return getToken(DBMSParser.NOT, 0); }
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(LPAREN);
			setState(419);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(418);
				match(NOT);
				}
			}

			setState(421);
			match(ID);
			setState(422);
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

	public static class UnifactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnifactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unifactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterUnifactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitUnifactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitUnifactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnifactorContext unifactor() throws RecognitionException {
		UnifactorContext _localctx = new UnifactorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_unifactor);
		try {
			setState(427);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(T__16);
				setState(425);
				factor();
				}
				break;
			case LPAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DBMSParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBMSParser.RPAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
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
		enterRule(_localctx, 74, RULE_factor);
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(LPAREN);
				setState(430);
				expression(0);
				setState(431);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				match(ID);
				setState(435);
				matchWildcard();
				setState(436);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 31:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 32:
			return andExpr_sempred((AndExprContext)_localctx, predIndex);
		case 33:
			return eqExpr_sempred((EqExprContext)_localctx, predIndex);
		case 34:
			return relationExpr_sempred((RelationExprContext)_localctx, predIndex);
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
	private boolean eqExpr_sempred(EqExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationExpr_sempred(RelationExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3J\u01ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\6\2P\n\2\r\2\16\2Q\3\3"+
		"\3\3\5\3V\n\3\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\3\5\3\5\5\5a\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\5\6h\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\6\f\u008b\n\f\r\f\16\f\u008c\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0097\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u00a2\n\16\f\16\16\16\u00a5\13\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u00b1\n\16\f\16\16\16\u00b4\13\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u00bd\n\16\f\16\16\16\u00c0\13\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00cb\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00d4\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e3\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\6\24\u00f9\n\24\r\24\16\24\u00fa\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u0105\n\24\3\25\3\25\3\25\3\25\5\25\u010b\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u0114\n\26\f\26\16\26\u0117\13\26\5\26"+
		"\u0119\n\26\3\26\5\26\u011c\n\26\3\26\3\26\3\26\3\26\3\26\7\26\u0123\n"+
		"\26\f\26\16\26\u0126\13\26\5\26\u0128\n\26\3\26\5\26\u012b\n\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0139\n\27"+
		"\f\27\16\27\u013c\13\27\3\27\3\27\5\27\u0140\n\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0149\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\7\31"+
		"\u0152\n\31\f\31\16\31\u0155\13\31\5\31\u0157\n\31\3\31\3\31\3\31\3\31"+
		"\5\31\u015d\n\31\3\31\3\31\3\31\5\31\u0162\n\31\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \5 \u0174\n \3!"+
		"\3!\3!\3!\3!\3!\7!\u017c\n!\f!\16!\u017f\13!\3\"\3\"\3\"\3\"\3\"\3\"\7"+
		"\"\u0187\n\"\f\"\16\"\u018a\13\"\3#\3#\3#\3#\3#\3#\3#\7#\u0193\n#\f#\16"+
		"#\u0196\13#\3$\3$\3$\3$\3$\3$\3$\7$\u019f\n$\f$\16$\u01a2\13$\3%\3%\5"+
		"%\u01a6\n%\3%\3%\3%\3&\3&\3&\5&\u01ae\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\5\'\u01b8\n\'\3\'\2\6@BDF(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJL\2\t\3\2>?\3\2\"%\4\2\6\n\30\30\3\2\13"+
		"\f\3\2\r\16\3\2\17\20\4\2\21\22\31\31\u01c6\2O\3\2\2\2\4U\3\2\2\2\6Y\3"+
		"\2\2\2\b`\3\2\2\2\ng\3\2\2\2\fi\3\2\2\2\16n\3\2\2\2\20v\3\2\2\2\22{\3"+
		"\2\2\2\24\u0080\3\2\2\2\26\u0085\3\2\2\2\30\u0096\3\2\2\2\32\u00ca\3\2"+
		"\2\2\34\u00d3\3\2\2\2\36\u00e2\3\2\2\2 \u00e4\3\2\2\2\"\u00e9\3\2\2\2"+
		"$\u00ed\3\2\2\2&\u0104\3\2\2\2(\u010a\3\2\2\2*\u010c\3\2\2\2,\u012e\3"+
		"\2\2\2.\u0143\3\2\2\2\60\u014c\3\2\2\2\62\u0165\3\2\2\2\64\u0167\3\2\2"+
		"\2\66\u0169\3\2\2\28\u016b\3\2\2\2:\u016d\3\2\2\2<\u016f\3\2\2\2>\u0173"+
		"\3\2\2\2@\u0175\3\2\2\2B\u0180\3\2\2\2D\u018b\3\2\2\2F\u0197\3\2\2\2H"+
		"\u01a3\3\2\2\2J\u01ad\3\2\2\2L\u01b7\3\2\2\2NP\5\4\3\2ON\3\2\2\2PQ\3\2"+
		"\2\2QO\3\2\2\2QR\3\2\2\2R\3\3\2\2\2SV\5\6\4\2TV\5(\25\2US\3\2\2\2UT\3"+
		"\2\2\2V\5\3\2\2\2WZ\5\b\5\2XZ\5\n\6\2YW\3\2\2\2YX\3\2\2\2Z\7\3\2\2\2["+
		"a\5\f\7\2\\a\5\16\b\2]a\5\20\t\2^a\5\22\n\2_a\5\24\13\2`[\3\2\2\2`\\\3"+
		"\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\t\3\2\2\2bh\5\26\f\2ch\5\36\20\2"+
		"dh\5 \21\2eh\5\"\22\2fh\5$\23\2gb\3\2\2\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2"+
		"\2gf\3\2\2\2h\13\3\2\2\2ij\7(\2\2jk\7)\2\2kl\7!\2\2lm\7\64\2\2m\r\3\2"+
		"\2\2no\7\61\2\2op\7)\2\2pq\7!\2\2qr\7\63\2\2rs\7@\2\2st\7!\2\2tu\7\64"+
		"\2\2u\17\3\2\2\2vw\7\60\2\2wx\7)\2\2xy\7!\2\2yz\7\64\2\2z\21\3\2\2\2{"+
		"|\7/\2\2|}\7*\2\2}~\7!\2\2~\177\7\64\2\2\177\23\3\2\2\2\u0080\u0081\7"+
		"\62\2\2\u0081\u0082\7)\2\2\u0082\u0083\7!\2\2\u0083\u0084\7\64\2\2\u0084"+
		"\25\3\2\2\2\u0085\u0086\7(\2\2\u0086\u0087\7+\2\2\u0087\u0088\7!\2\2\u0088"+
		"\u008a\7\24\2\2\u0089\u008b\5\30\r\2\u008a\u0089\3\2\2\2\u008b\u008c\3"+
		"\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\7\25\2\2\u008f\u0090\7\64\2\2\u0090\27\3\2\2\2\u0091\u0092\7!\2"+
		"\2\u0092\u0093\5\34\17\2\u0093\u0094\7\65\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0097\5\32\16\2\u0096\u0091\3\2\2\2\u0096\u0095\3\2\2\2\u0097\31\3\2"+
		"\2\2\u0098\u0099\7\66\2\2\u0099\u009a\7\3\2\2\u009a\u009b\7!\2\2\u009b"+
		"\u009c\78\2\2\u009c\u009d\7\67\2\2\u009d\u009e\7\24\2\2\u009e\u00a3\7"+
		"!\2\2\u009f\u00a0\7\65\2\2\u00a0\u00a2\7!\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00cb\7\25\2\2\u00a7\u00a8\7\66\2\2\u00a8"+
		"\u00a9\7\4\2\2\u00a9\u00aa\7!\2\2\u00aa\u00ab\79\2\2\u00ab\u00ac\7\67"+
		"\2\2\u00ac\u00ad\7\24\2\2\u00ad\u00b2\7!\2\2\u00ae\u00af\7\65\2\2\u00af"+
		"\u00b1\7!\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00b6\7\25\2\2\u00b6\u00b7\7A\2\2\u00b7\u00b8\7!\2\2\u00b8\u00b9\7\25"+
		"\2\2\u00b9\u00be\7!\2\2\u00ba\u00bb\7\65\2\2\u00bb\u00bd\7!\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00cb\7\24\2\2\u00c2"+
		"\u00c3\7\66\2\2\u00c3\u00c4\7\5\2\2\u00c4\u00c5\7!\2\2\u00c5\u00c6\7:"+
		"\2\2\u00c6\u00c7\7\25\2\2\u00c7\u00c8\5@!\2\u00c8\u00c9\7\24\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u0098\3\2\2\2\u00ca\u00a7\3\2\2\2\u00ca\u00c2\3\2"+
		"\2\2\u00cb\33\3\2\2\2\u00cc\u00d4\7\32\2\2\u00cd\u00d4\7#\2\2\u00ce\u00d4"+
		"\7%\2\2\u00cf\u00d0\7\33\2\2\u00d0\u00d1\7\24\2\2\u00d1\u00d2\7\"\2\2"+
		"\u00d2\u00d4\7\25\2\2\u00d3\u00cc\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00ce"+
		"\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4\35\3\2\2\2\u00d5\u00d6\7\61\2\2\u00d6"+
		"\u00d7\7+\2\2\u00d7\u00d8\7!\2\2\u00d8\u00d9\7\63\2\2\u00d9\u00da\7@\2"+
		"\2\u00da\u00db\7!\2\2\u00db\u00e3\7\64\2\2\u00dc\u00dd\7\61\2\2\u00dd"+
		"\u00de\7+\2\2\u00de\u00df\7!\2\2\u00df\u00e0\5&\24\2\u00e0\u00e1\7\64"+
		"\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00d5\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e3"+
		"\37\3\2\2\2\u00e4\u00e5\7\60\2\2\u00e5\u00e6\7)\2\2\u00e6\u00e7\7!\2\2"+
		"\u00e7\u00e8\7\64\2\2\u00e8!\3\2\2\2\u00e9\u00ea\7/\2\2\u00ea\u00eb\7"+
		",\2\2\u00eb\u00ec\7\64\2\2\u00ec#\3\2\2\2\u00ed\u00ee\7/\2\2\u00ee\u00ef"+
		"\7.\2\2\u00ef\u00f0\7<\2\2\u00f0\u00f1\7!\2\2\u00f1\u00f2\7\64\2\2\u00f2"+
		"%\3\2\2\2\u00f3\u00f4\7B\2\2\u00f4\u00f5\7-\2\2\u00f5\u00f6\7!\2\2\u00f6"+
		"\u00f8\5\34\17\2\u00f7\u00f9\5\32\16\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0105\3\2\2\2\u00fc"+
		"\u00fd\7B\2\2\u00fd\u0105\5\32\16\2\u00fe\u00ff\7\60\2\2\u00ff\u0100\7"+
		"-\2\2\u0100\u0105\7!\2\2\u0101\u0102\7\60\2\2\u0102\u0103\7\66\2\2\u0103"+
		"\u0105\7!\2\2\u0104\u00f3\3\2\2\2\u0104\u00fc\3\2\2\2\u0104\u00fe\3\2"+
		"\2\2\u0104\u0101\3\2\2\2\u0105\'\3\2\2\2\u0106\u010b\5*\26\2\u0107\u010b"+
		"\5,\27\2\u0108\u010b\5.\30\2\u0109\u010b\5\60\31\2\u010a\u0106\3\2\2\2"+
		"\u010a\u0107\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b)\3"+
		"\2\2\2\u010c\u010d\7C\2\2\u010d\u010e\7D\2\2\u010e\u011b\7!\2\2\u010f"+
		"\u0118\7\24\2\2\u0110\u0115\7!\2\2\u0111\u0112\7\65\2\2\u0112\u0114\7"+
		"!\2\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0110\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\7\25\2\2\u011b"+
		"\u010f\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u012a\7E"+
		"\2\2\u011e\u0127\7\24\2\2\u011f\u0124\5\62\32\2\u0120\u0121\7\65\2\2\u0121"+
		"\u0123\5\62\32\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3"+
		"\2\2\2\u0124\u0125\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0127"+
		"\u011f\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\7\25"+
		"\2\2\u012a\u011e\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\7\64\2\2\u012d+\3\2\2\2\u012e\u012f\7F\2\2\u012f\u0130\7!\2\2\u0130"+
		"\u0131\7G\2\2\u0131\u0132\7!\2\2\u0132\u0133\7\30\2\2\u0133\u013a\5\62"+
		"\32\2\u0134\u0135\7\65\2\2\u0135\u0136\7!\2\2\u0136\u0137\7\30\2\2\u0137"+
		"\u0139\5\62\32\2\u0138\u0134\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3"+
		"\2\2\2\u013a\u013b\3\2\2\2\u013b\u013f\3\2\2\2\u013c\u013a\3\2\2\2\u013d"+
		"\u013e\7=\2\2\u013e\u0140\5@!\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2"+
		"\2\u0140\u0141\3\2\2\2\u0141\u0142\7\64\2\2\u0142-\3\2\2\2\u0143\u0144"+
		"\7H\2\2\u0144\u0145\7<\2\2\u0145\u0148\7!\2\2\u0146\u0147\7=\2\2\u0147"+
		"\u0149\5@!\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2"+
		"\2\u014a\u014b\7\64\2\2\u014b/\3\2\2\2\u014c\u0156\7;\2\2\u014d\u0157"+
		"\7\31\2\2\u014e\u0153\7!\2\2\u014f\u0150\7\65\2\2\u0150\u0152\7!\2\2\u0151"+
		"\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u014d\3\2\2\2\u0156"+
		"\u014e\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\7<\2\2\u0159\u015c\7!\2"+
		"\2\u015a\u015b\7=\2\2\u015b\u015d\5@!\2\u015c\u015a\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u0161\3\2\2\2\u015e\u015f\7I\2\2\u015f\u0160\7J\2\2\u0160"+
		"\u0162\t\2\2\2\u0161\u015e\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\u0164\7\64\2\2\u0164\61\3\2\2\2\u0165\u0166\t\3\2\2\u0166\63"+
		"\3\2\2\2\u0167\u0168\t\4\2\2\u0168\65\3\2\2\2\u0169\u016a\t\5\2\2\u016a"+
		"\67\3\2\2\2\u016b\u016c\t\6\2\2\u016c9\3\2\2\2\u016d\u016e\t\7\2\2\u016e"+
		";\3\2\2\2\u016f\u0170\t\b\2\2\u0170=\3\2\2\2\u0171\u0174\5@!\2\u0172\u0174"+
		"\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174?\3\2\2\2\u0175"+
		"\u0176\b!\1\2\u0176\u0177\5B\"\2\u0177\u017d\3\2\2\2\u0178\u0179\f\3\2"+
		"\2\u0179\u017a\7\35\2\2\u017a\u017c\5B\"\2\u017b\u0178\3\2\2\2\u017c\u017f"+
		"\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017eA\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u0180\u0181\b\"\1\2\u0181\u0182\5D#\2\u0182\u0188\3\2\2"+
		"\2\u0183\u0184\f\3\2\2\u0184\u0185\7\34\2\2\u0185\u0187\5D#\2\u0186\u0183"+
		"\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"C\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\b#\1\2\u018c\u018d\5F$\2\u018d"+
		"\u0194\3\2\2\2\u018e\u018f\f\3\2\2\u018f\u0190\58\35\2\u0190\u0191\5F"+
		"$\2\u0191\u0193\3\2\2\2\u0192\u018e\3\2\2\2\u0193\u0196\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195E\3\2\2\2\u0196\u0194\3\2\2\2"+
		"\u0197\u0198\b$\1\2\u0198\u0199\5H%\2\u0199\u01a0\3\2\2\2\u019a\u019b"+
		"\f\3\2\2\u019b\u019c\5\64\33\2\u019c\u019d\5H%\2\u019d\u019f\3\2\2\2\u019e"+
		"\u019a\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1G\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a5\7\24\2\2\u01a4\u01a6"+
		"\7\36\2\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2"+
		"\u01a7\u01a8\7!\2\2\u01a8\u01a9\7\25\2\2\u01a9I\3\2\2\2\u01aa\u01ab\7"+
		"\23\2\2\u01ab\u01ae\5L\'\2\u01ac\u01ae\5L\'\2\u01ad\u01aa\3\2\2\2\u01ad"+
		"\u01ac\3\2\2\2\u01aeK\3\2\2\2\u01af\u01b0\7\24\2\2\u01b0\u01b1\5@!\2\u01b1"+
		"\u01b2\7\25\2\2\u01b2\u01b8\3\2\2\2\u01b3\u01b8\7!\2\2\u01b4\u01b5\7!"+
		"\2\2\u01b5\u01b6\13\2\2\2\u01b6\u01b8\7!\2\2\u01b7\u01af\3\2\2\2\u01b7"+
		"\u01b3\3\2\2\2\u01b7\u01b4\3\2\2\2\u01b8M\3\2\2\2\'QUY`g\u008c\u0096\u00a3"+
		"\u00b2\u00be\u00ca\u00d3\u00e2\u00fa\u0104\u010a\u0115\u0118\u011b\u0124"+
		"\u0127\u012a\u013a\u013f\u0148\u0153\u0156\u015c\u0161\u0173\u017d\u0188"+
		"\u0194\u01a0\u01a5\u01ad\u01b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}