lexer grammar InternalBusinessDomain;
@header {
package org.mod4j.dsl.businessdomain.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : '->' ;
T12 : 'false' ;
T13 : 'many' ;
T14 : 'one' ;
T15 : 'domain' ;
T16 : ';' ;
T17 : 'association' ;
T18 : 'class' ;
T19 : '[' ;
T20 : ']' ;
T21 : 'inherits' ;
T22 : 'rules' ;
T23 : 'enumeration' ;
T24 : '=' ;
T25 : 'unique' ;
T26 : ',' ;
T27 : 'minlength' ;
T28 : 'maxlength' ;
T29 : 'regexp' ;
T30 : 'min' ;
T31 : 'max' ;
T32 : '<->' ;
T33 : 'ordered' ;
T34 : 'nullable' ;
T35 : 'derived' ;
T36 : 'writable' ;
T37 : 'boolean' ;
T38 : 'default' ;
T39 : 'true' ;
T40 : 'string' ;
T41 : 'datetime' ;
T42 : 'integer' ;
T43 : 'decimal' ;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 3975
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 3977
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 3979
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 3981
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 3983
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 3985
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 3987
RULE_ANY_OTHER : .;


