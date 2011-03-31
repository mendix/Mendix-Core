lexer grammar InternalService;
@header {
package org.mod4j.dsl.service.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'list' ;
T12 : 'create' ;
T13 : 'read' ;
T14 : 'update' ;
T15 : 'delete' ;
T16 : 'listall' ;
T17 : 'find' ;
T18 : 'add' ;
T19 : 'remove' ;
T20 : 'get' ;
T21 : 'service' ;
T22 : ';' ;
T23 : 'reference' ;
T24 : 'from' ;
T25 : 'import' ;
T26 : 'method' ;
T27 : 'in' ;
T28 : '(' ;
T29 : ')' ;
T30 : ',' ;
T31 : 'out' ;
T32 : 'for' ;
T33 : 'crud' ;

// $ANTLR src "../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g" 2039
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g" 2041
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g" 2043
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g" 2045
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g" 2047
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g" 2049
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g" 2051
RULE_ANY_OTHER : .;


