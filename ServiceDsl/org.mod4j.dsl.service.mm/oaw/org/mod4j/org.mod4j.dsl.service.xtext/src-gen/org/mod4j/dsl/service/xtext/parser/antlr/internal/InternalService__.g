lexer grammar InternalService;
@header {
package org.mod4j.dsl.service.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'service' ;
T12 : ';' ;
T13 : 'for' ;
T14 : 'reference' ;
T15 : 'from' ;
T16 : 'import' ;
T17 : 'method' ;
T18 : 'in' ;
T19 : '(' ;
T20 : ',' ;
T21 : ')' ;
T22 : 'out' ;
T23 : 'crud' ;
T24 : 'create' ;
T25 : 'read' ;
T26 : 'update' ;
T27 : 'delete' ;
T28 : 'listall' ;
T29 : 'find' ;
T30 : 'add' ;
T31 : 'remove' ;
T32 : 'get' ;
T33 : 'list' ;

// $ANTLR src "../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g" 1057
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g" 1059
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g" 1061
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g" 1063
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g" 1065
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g" 1067
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g" 1069
RULE_ANY_OTHER : .;


