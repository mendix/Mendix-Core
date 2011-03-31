lexer grammar InternalDataContract;
@header {
package org.mod4j.dsl.datacontract.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'datacontract' ;
T12 : ';' ;
T13 : 'from' ;
T14 : 'import' ;
T15 : 'businessclass' ;
T16 : 'enumeration' ;
T17 : 'class' ;
T18 : 'represents' ;
T19 : '[' ;
T20 : 'references' ;
T21 : ']' ;
T22 : 'as' ;
T23 : 'custom' ;
T24 : 'boolean' ;
T25 : 'string' ;
T26 : 'datetime' ;
T27 : 'integer' ;
T28 : 'decimal' ;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g" 1383
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g" 1385
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g" 1387
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g" 1389
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g" 1391
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g" 1393
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g" 1395
RULE_ANY_OTHER : .;


