lexer grammar InternalBusinessDomain;
@header {
package org.mod4j.dsl.businessdomain.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'domain' ;
T12 : ';' ;
T13 : 'association' ;
T14 : '<->' ;
T15 : '->' ;
T16 : 'ordered' ;
T17 : 'class' ;
T18 : 'inherits' ;
T19 : '[' ;
T20 : 'rules' ;
T21 : ']' ;
T22 : 'enumeration' ;
T23 : '=' ;
T24 : 'unique' ;
T25 : ',' ;
T26 : 'nullable' ;
T27 : 'derived' ;
T28 : 'writable' ;
T29 : 'boolean' ;
T30 : 'default' ;
T31 : 'true' ;
T32 : 'false' ;
T33 : 'string' ;
T34 : 'minlength' ;
T35 : 'maxlength' ;
T36 : 'regexp' ;
T37 : 'datetime' ;
T38 : 'integer' ;
T39 : 'min' ;
T40 : 'max' ;
T41 : 'decimal' ;
T42 : 'many' ;
T43 : 'one' ;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 1930
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 1932
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 1934
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 1936
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 1938
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 1940
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 1942
RULE_ANY_OTHER : .;


