//Pablo Barreno
//Santiago Solorzano
//Diego Sosa

grammar DBMS;

//LEXER

LPAREN
	:	'('
	;

RPAREN
	:	')'
	;

LBRACKET
	:	'['
	;

RBRACKET
	:	']'
	;

EQ
	:	'='
	;

KL	
	:	'*'
	;

INT 
	:	'int' 
	;

CHAR	
	:	'char'
	;

BOOLEAN 
	:	'boolean'
	;

DATETIME
	:	'datetime'
	;

fragment LETTER 
	:	('a'..'z'|'A'..'Z')
	;

fragment DIGIT
	:	'0'..'9'
	;

fragment ASCII
	:	(' ' ..'~')
	|	'\\' 
	|	'\'' 
	|	'\"' 
	|	'\t' 
	| 	'\n' 
	;

fragment TWO_DIGITS   
	:	DIGIT DIGIT
	;

fragment THREE_DIGITS
	:	DIGIT TWO_DIGITS 
	;

fragment FOUR_DIGITS
	:	DIGIT THREE_DIGITS 
	;

fragment YEAR
	:	FOUR_DIGITS 
	;

fragment MONTH
	:	DIGIT
	|	TWO_DIGITS
	;

fragment DAY
	:	DIGIT 
	| 	TWO_DIGITS 
	; 

ID 
	:	LETTER ( LETTER | DIGIT )* 
	;

NUM 
	:	DIGIT ( DIGIT )* 
	;

FLOAT
	:	DIGIT ( DIGIT )* ('.' (DIGIT)* )? 
	;

CHARX	
	:	'\'' ASCII* '\''
	;

DATE
	:	YEAR '-' MONTH '-' DAY 
	;

WS 
	:	[\t\r\n\f ]+ -> skip
	;

COMMENT
	:	( '//' ~[\r\n]* '\r'? '\n' | '/*' .*? '*/') -> skip
	;

CREATE
	:	'CREATE'
	|	'Create'
	|	'create'
	;

DATABASE
	:	'DATABASE'
	|	'Database'
	|	'database'
	;

DATABASES
	:	'DATABASES'
	|	'Databases'
	|	'databases'
	;

TABLE
	:	'TABLE'
	|	'Table'
	|	'table'
	;

TABLES
	:	'TABLES'
	|	'Tables'
	|	'tables'
	;

COLUMN
	:	'COLUMN'
	|	'Column'
	|	'column'
	;

COLUMNS
	:	'COLUMNS'
	|	'Columns'
	|	'column'
	;

SHOW	
	:	'SHOW'
	|	'Show'
	|	'show'
	;

DROP
	:	'DROP'
	|	'Drop'
	|	'drop'
	;

ALTER
	:	'ALTER'
	|	'Alter'
	|	'alter'
	;
USE
	:	'USE'
	|	'Use'
	|	'use'
	;

RENAME
	:	'RENAME'
	|	'Rename'
	|	'rename'
	;

END_SQL
	:	';'
	;

COMMA
	:	','
	;

CONSTRAINT
	:	'CONSTRAINT'
	|	'Constraint'
	|	'constraint'
	;

KEY
	:	'KEY'
	|	'Key'
	|	'key'
	;

PRIMARY
	:	'PRIMARY'
	|	'Primary'
	|	'primary'
	;

FOREIGN
	:	'FOREIGN'
	|	'Foreign'
	|	'foreign'
	;

CHECK
	:	'CHECK'
	|	'Check'
	|	'check'
	;

SELECT
	:	'SELECT'
	|	'Select'
	|	'select'
	;

FROM
	:	'FROM'
	|	'From'
	|	'from'
	;

WHERE
	:	'WHERE'
	|	'Where'
	|	'where'
	;

ASC
	:	'ASC'
	|	'Asc'
	|	'asc'
	;

DESC
	:	'DESC'
	|	'Desc'
	|	'desc'
	;

//PARSER

sql 
	:	(sql_executable)+
	;

sql_executable
	:	sql_ddl
	|	sql_dml
	;

sql_ddl
	:	database_statement
	|	table_statement
	;

database_statement
	:	create_database
	|	alter_database
	|	drop_database
	|	show_database
	|	use_database
	;

table_statement
	:	create_table
	|	alter_table
	|	drop_table
	|	show_tables
	|	show_columns
	;

create_database
	:	CREATE DATABASE ID END_SQL
	;

alter_database
	:	ALTER DATABASE ID RENAME TO ID END_SQL
	;

drop_database
	:	DROP DATABASE ID END_SQL
	;

show_database
	:	SHOW DATABASES ID END_SQL
	;

use_database
	:	USE DATABASE ID END_SQL
	;

create_table
	:	CREATE TABLE ID LPAREN (column)+ RPAREN END_SQL;
	;

column
	:	ID type ( COMMA )
	|	constraint
	;

constraint
	:	CONSTRAINT 'PK_' ID PRIMARY KEY LPAREN ID (COMMA ID)* RPAREN
	|	CONSTRAINT 'FK_' ID FOREIGN KEY LPAREN ID (COMMA ID)* RPAREN REFERENCES ID RPAREN ID (COMMA ID)* LPAREN
	|	CONSTRAINT 'CH_' ID CHECK RPAREN expression LPAREN
	;	

type
	:	INT
	|	FLOAT
	|	DATE
	|	CHAR LPAREN NUM RPAREN
	;

alter_table
	:	ALTER TABLE ID RENAME TO ID END_SQL
	|	ALTER TABLE ID action END_SQL
	;

drop_table
	:	DROP DATABASE ID END_SQL
	;

show_tables
	:	SHOW TABLES END_SQL
	;

show_columns
	:	SHOW COLUMNS FROM ID END_SQL
	;

action
	:	ADD COLUMN ID type (constraint)+				
	|	ADD constraint
        |	DROP COLUMN ID
        |	DROP CONSTRAINT ID
	;

       
dml_statement 
	: 	insert_value
	|	update_value
	|	delete_value
	|	select_value
	;

insert_value
	:	INSERT INTO ID ( LPAREN ((ID)(COMMA ID)*)? RPAREN )? VALUES ( LPAREN ((literal)(COMMA literal)*)? RPAREN )? END_SQL
	;

update_value
	:	UPDATE ID SET ID EQ literal (COMMA ID EQ literal)* (WHERE expression)? END_SQL 
	;

delete_value
	:	DELETE FROM ID (WHERE expression)? END_SQL
	;

select_value
	:	SELECT (KL | ID (COMMA ID)* ) FROM ID (WHERE expression)?  (ORDER BY (ASC | DESC))? END_SQL
	;

literal
	:	NUM
	|	FLOAT
	|	DATE
	|	CHARX
	;

rel_op
	:	'<'									
	|	'>'
	| 	'<='
	|	'>='									
	|	'='									
	|	'<>'	
	;


cond_op
	:	'AND'
	|	'OR'
	;



expression							
	:	expression cond_op expr1
	|	expr1
	;
	
expr1								
	:	expr1 rel_op expr2
	|	expr2
	;
	
expr2								
	:	unifactor
	|	expr2 rel_op literal
	|	literal rel_op expr2
	;

unifactor
	:	'NOT' factor
	|	factor
	;
	
factor 		
	:	LPAREN expression RPAREN
	|	ID
	|	ID.ID
	;
	
