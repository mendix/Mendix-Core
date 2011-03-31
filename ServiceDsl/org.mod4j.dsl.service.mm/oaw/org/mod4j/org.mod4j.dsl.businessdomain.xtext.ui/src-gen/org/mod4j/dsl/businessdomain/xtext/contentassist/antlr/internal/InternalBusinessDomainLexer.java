package org.mendix.dsl.businessdomain.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalBusinessDomainLexer extends Lexer {
    public static final int T14=14;
    public static final int T29=29;
    public static final int T36=36;
    public static final int RULE_STRING=4;
    public static final int T35=35;
    public static final int T20=20;
    public static final int T34=34;
    public static final int T25=25;
    public static final int T18=18;
    public static final int T37=37;
    public static final int T26=26;
    public static final int RULE_INT=6;
    public static final int T32=32;
    public static final int T17=17;
    public static final int T16=16;
    public static final int T38=38;
    public static final int T41=41;
    public static final int T24=24;
    public static final int T19=19;
    public static final int T39=39;
    public static final int T21=21;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=5;
    public static final int T33=33;
    public static final int T11=11;
    public static final int T22=22;
    public static final int T43=43;
    public static final int T12=12;
    public static final int T23=23;
    public static final int T28=28;
    public static final int T42=42;
    public static final int T40=40;
    public static final int T13=13;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int EOF=-1;
    public static final int Tokens=44;
    public static final int RULE_ANY_OTHER=10;
    public static final int T31=31;
    public static final int RULE_SL_COMMENT=8;
    public static final int T27=27;
    public static final int T30=30;
    public InternalBusinessDomainLexer() {;} 
    public InternalBusinessDomainLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:10:5: ( '->' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:10:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:11:5: ( 'false' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:11:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:12:5: ( 'many' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:12:7: 'many'
            {
            match("many"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:13:5: ( 'one' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:13:7: 'one'
            {
            match("one"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:14:5: ( 'domain' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:14:7: 'domain'
            {
            match("domain"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:15:5: ( ';' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:15:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:16:5: ( 'association' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:16:7: 'association'
            {
            match("association"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:17:5: ( 'class' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:17:7: 'class'
            {
            match("class"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:18:5: ( '[' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:18:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:19:5: ( ']' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:19:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:20:5: ( 'inherits' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:20:7: 'inherits'
            {
            match("inherits"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:21:5: ( 'rules' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:21:7: 'rules'
            {
            match("rules"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:22:5: ( 'enumeration' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:22:7: 'enumeration'
            {
            match("enumeration"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:23:5: ( '=' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:23:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:24:5: ( 'unique' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:24:7: 'unique'
            {
            match("unique"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:25:5: ( ',' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:25:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:26:5: ( 'minlength' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:26:7: 'minlength'
            {
            match("minlength"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:27:5: ( 'maxlength' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:27:7: 'maxlength'
            {
            match("maxlength"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:28:5: ( 'regexp' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:28:7: 'regexp'
            {
            match("regexp"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:29:5: ( 'min' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:29:7: 'min'
            {
            match("min"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:30:5: ( 'max' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:30:7: 'max'
            {
            match("max"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:31:5: ( '<->' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:31:7: '<->'
            {
            match("<->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:32:5: ( 'ordered' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:32:7: 'ordered'
            {
            match("ordered"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:33:5: ( 'nullable' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:33:7: 'nullable'
            {
            match("nullable"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:34:5: ( 'derived' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:34:7: 'derived'
            {
            match("derived"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:35:5: ( 'writable' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:35:7: 'writable'
            {
            match("writable"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:36:5: ( 'boolean' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:36:7: 'boolean'
            {
            match("boolean"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:37:5: ( 'default' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:37:7: 'default'
            {
            match("default"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:38:5: ( 'true' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:38:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:39:5: ( 'string' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:39:7: 'string'
            {
            match("string"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:40:5: ( 'datetime' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:40:7: 'datetime'
            {
            match("datetime"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:41:5: ( 'integer' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:41:7: 'integer'
            {
            match("integer"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:42:5: ( 'decimal' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:42:7: 'decimal'
            {
            match("decimal"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3975:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3975:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3975:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3975:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3975:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3977:10: ( ( '0' .. '9' )+ )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3977:12: ( '0' .. '9' )+
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3977:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3977:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3979:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3979:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3979:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3979:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3979:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3979:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3979:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3979:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3979:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3979:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3979:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3979:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3981:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3981:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3981:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3981:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3983:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3983:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3983:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3983:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3983:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3983:41: ( '\\r' )? '\\n'
                    {
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3983:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3983:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3985:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3985:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3985:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3987:16: ( . )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3987:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=40;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='-') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='>') ) {
                alt12=1;
            }
            else {
                alt12=40;}
        }
        else if ( (LA12_0=='f') ) {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='a') ) {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='l') ) {
                    int LA12_64 = input.LA(4);

                    if ( (LA12_64=='s') ) {
                        int LA12_88 = input.LA(5);

                        if ( (LA12_88=='e') ) {
                            int LA12_114 = input.LA(6);

                            if ( ((LA12_114>='0' && LA12_114<='9')||(LA12_114>='A' && LA12_114<='Z')||LA12_114=='_'||(LA12_114>='a' && LA12_114<='z')) ) {
                                alt12=34;
                            }
                            else {
                                alt12=2;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='m') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='n') ) {
                    switch ( input.LA(4) ) {
                    case 'l':
                        {
                        int LA12_89 = input.LA(5);

                        if ( (LA12_89=='e') ) {
                            int LA12_115 = input.LA(6);

                            if ( (LA12_115=='n') ) {
                                int LA12_138 = input.LA(7);

                                if ( (LA12_138=='g') ) {
                                    int LA12_158 = input.LA(8);

                                    if ( (LA12_158=='t') ) {
                                        int LA12_176 = input.LA(9);

                                        if ( (LA12_176=='h') ) {
                                            int LA12_190 = input.LA(10);

                                            if ( ((LA12_190>='0' && LA12_190<='9')||(LA12_190>='A' && LA12_190<='Z')||LA12_190=='_'||(LA12_190>='a' && LA12_190<='z')) ) {
                                                alt12=34;
                                            }
                                            else {
                                                alt12=17;}
                                        }
                                        else {
                                            alt12=34;}
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                        }
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt12=34;
                        }
                        break;
                    default:
                        alt12=20;}

                }
                else {
                    alt12=34;}
                }
                break;
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 'x':
                    {
                    switch ( input.LA(4) ) {
                    case 'l':
                        {
                        int LA12_91 = input.LA(5);

                        if ( (LA12_91=='e') ) {
                            int LA12_116 = input.LA(6);

                            if ( (LA12_116=='n') ) {
                                int LA12_139 = input.LA(7);

                                if ( (LA12_139=='g') ) {
                                    int LA12_159 = input.LA(8);

                                    if ( (LA12_159=='t') ) {
                                        int LA12_177 = input.LA(9);

                                        if ( (LA12_177=='h') ) {
                                            int LA12_191 = input.LA(10);

                                            if ( ((LA12_191>='0' && LA12_191<='9')||(LA12_191>='A' && LA12_191<='Z')||LA12_191=='_'||(LA12_191>='a' && LA12_191<='z')) ) {
                                                alt12=34;
                                            }
                                            else {
                                                alt12=18;}
                                        }
                                        else {
                                            alt12=34;}
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                        }
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt12=34;
                        }
                        break;
                    default:
                        alt12=21;}

                    }
                    break;
                case 'n':
                    {
                    int LA12_67 = input.LA(4);

                    if ( (LA12_67=='y') ) {
                        int LA12_93 = input.LA(5);

                        if ( ((LA12_93>='0' && LA12_93<='9')||(LA12_93>='A' && LA12_93<='Z')||LA12_93=='_'||(LA12_93>='a' && LA12_93<='z')) ) {
                            alt12=34;
                        }
                        else {
                            alt12=3;}
                    }
                    else {
                        alt12=34;}
                    }
                    break;
                default:
                    alt12=34;}

                }
                break;
            default:
                alt12=34;}

        }
        else if ( (LA12_0=='o') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='d') ) {
                    int LA12_68 = input.LA(4);

                    if ( (LA12_68=='e') ) {
                        int LA12_94 = input.LA(5);

                        if ( (LA12_94=='r') ) {
                            int LA12_118 = input.LA(6);

                            if ( (LA12_118=='e') ) {
                                int LA12_140 = input.LA(7);

                                if ( (LA12_140=='d') ) {
                                    int LA12_160 = input.LA(8);

                                    if ( ((LA12_160>='0' && LA12_160<='9')||(LA12_160>='A' && LA12_160<='Z')||LA12_160=='_'||(LA12_160>='a' && LA12_160<='z')) ) {
                                        alt12=34;
                                    }
                                    else {
                                        alt12=23;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
                }
                break;
            case 'n':
                {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='e') ) {
                    int LA12_69 = input.LA(4);

                    if ( ((LA12_69>='0' && LA12_69<='9')||(LA12_69>='A' && LA12_69<='Z')||LA12_69=='_'||(LA12_69>='a' && LA12_69<='z')) ) {
                        alt12=34;
                    }
                    else {
                        alt12=4;}
                }
                else {
                    alt12=34;}
                }
                break;
            default:
                alt12=34;}

        }
        else if ( (LA12_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'c':
                    {
                    int LA12_70 = input.LA(4);

                    if ( (LA12_70=='i') ) {
                        int LA12_96 = input.LA(5);

                        if ( (LA12_96=='m') ) {
                            int LA12_119 = input.LA(6);

                            if ( (LA12_119=='a') ) {
                                int LA12_141 = input.LA(7);

                                if ( (LA12_141=='l') ) {
                                    int LA12_161 = input.LA(8);

                                    if ( ((LA12_161>='0' && LA12_161<='9')||(LA12_161>='A' && LA12_161<='Z')||LA12_161=='_'||(LA12_161>='a' && LA12_161<='z')) ) {
                                        alt12=34;
                                    }
                                    else {
                                        alt12=33;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                    }
                    break;
                case 'f':
                    {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='a') ) {
                        int LA12_97 = input.LA(5);

                        if ( (LA12_97=='u') ) {
                            int LA12_120 = input.LA(6);

                            if ( (LA12_120=='l') ) {
                                int LA12_142 = input.LA(7);

                                if ( (LA12_142=='t') ) {
                                    int LA12_162 = input.LA(8);

                                    if ( ((LA12_162>='0' && LA12_162<='9')||(LA12_162>='A' && LA12_162<='Z')||LA12_162=='_'||(LA12_162>='a' && LA12_162<='z')) ) {
                                        alt12=34;
                                    }
                                    else {
                                        alt12=28;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                    }
                    break;
                case 'r':
                    {
                    int LA12_72 = input.LA(4);

                    if ( (LA12_72=='i') ) {
                        int LA12_98 = input.LA(5);

                        if ( (LA12_98=='v') ) {
                            int LA12_121 = input.LA(6);

                            if ( (LA12_121=='e') ) {
                                int LA12_143 = input.LA(7);

                                if ( (LA12_143=='d') ) {
                                    int LA12_163 = input.LA(8);

                                    if ( ((LA12_163>='0' && LA12_163<='9')||(LA12_163>='A' && LA12_163<='Z')||LA12_163=='_'||(LA12_163>='a' && LA12_163<='z')) ) {
                                        alt12=34;
                                    }
                                    else {
                                        alt12=25;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                    }
                    break;
                default:
                    alt12=34;}

                }
                break;
            case 'o':
                {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='m') ) {
                    int LA12_73 = input.LA(4);

                    if ( (LA12_73=='a') ) {
                        int LA12_99 = input.LA(5);

                        if ( (LA12_99=='i') ) {
                            int LA12_122 = input.LA(6);

                            if ( (LA12_122=='n') ) {
                                int LA12_144 = input.LA(7);

                                if ( ((LA12_144>='0' && LA12_144<='9')||(LA12_144>='A' && LA12_144<='Z')||LA12_144=='_'||(LA12_144>='a' && LA12_144<='z')) ) {
                                    alt12=34;
                                }
                                else {
                                    alt12=5;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
                }
                break;
            case 'a':
                {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='t') ) {
                    int LA12_74 = input.LA(4);

                    if ( (LA12_74=='e') ) {
                        int LA12_100 = input.LA(5);

                        if ( (LA12_100=='t') ) {
                            int LA12_123 = input.LA(6);

                            if ( (LA12_123=='i') ) {
                                int LA12_145 = input.LA(7);

                                if ( (LA12_145=='m') ) {
                                    int LA12_165 = input.LA(8);

                                    if ( (LA12_165=='e') ) {
                                        int LA12_182 = input.LA(9);

                                        if ( ((LA12_182>='0' && LA12_182<='9')||(LA12_182>='A' && LA12_182<='Z')||LA12_182=='_'||(LA12_182>='a' && LA12_182<='z')) ) {
                                            alt12=34;
                                        }
                                        else {
                                            alt12=31;}
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
                }
                break;
            default:
                alt12=34;}

        }
        else if ( (LA12_0==';') ) {
            alt12=6;
        }
        else if ( (LA12_0=='a') ) {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='s') ) {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='s') ) {
                    int LA12_75 = input.LA(4);

                    if ( (LA12_75=='o') ) {
                        int LA12_101 = input.LA(5);

                        if ( (LA12_101=='c') ) {
                            int LA12_124 = input.LA(6);

                            if ( (LA12_124=='i') ) {
                                int LA12_146 = input.LA(7);

                                if ( (LA12_146=='a') ) {
                                    int LA12_166 = input.LA(8);

                                    if ( (LA12_166=='t') ) {
                                        int LA12_183 = input.LA(9);

                                        if ( (LA12_183=='i') ) {
                                            int LA12_193 = input.LA(10);

                                            if ( (LA12_193=='o') ) {
                                                int LA12_200 = input.LA(11);

                                                if ( (LA12_200=='n') ) {
                                                    int LA12_202 = input.LA(12);

                                                    if ( ((LA12_202>='0' && LA12_202<='9')||(LA12_202>='A' && LA12_202<='Z')||LA12_202=='_'||(LA12_202>='a' && LA12_202<='z')) ) {
                                                        alt12=34;
                                                    }
                                                    else {
                                                        alt12=7;}
                                                }
                                                else {
                                                    alt12=34;}
                                            }
                                            else {
                                                alt12=34;}
                                        }
                                        else {
                                            alt12=34;}
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='c') ) {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='l') ) {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='a') ) {
                    int LA12_76 = input.LA(4);

                    if ( (LA12_76=='s') ) {
                        int LA12_102 = input.LA(5);

                        if ( (LA12_102=='s') ) {
                            int LA12_125 = input.LA(6);

                            if ( ((LA12_125>='0' && LA12_125<='9')||(LA12_125>='A' && LA12_125<='Z')||LA12_125=='_'||(LA12_125>='a' && LA12_125<='z')) ) {
                                alt12=34;
                            }
                            else {
                                alt12=8;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='[') ) {
            alt12=9;
        }
        else if ( (LA12_0==']') ) {
            alt12=10;
        }
        else if ( (LA12_0=='i') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='n') ) {
                switch ( input.LA(3) ) {
                case 'h':
                    {
                    int LA12_77 = input.LA(4);

                    if ( (LA12_77=='e') ) {
                        int LA12_103 = input.LA(5);

                        if ( (LA12_103=='r') ) {
                            int LA12_126 = input.LA(6);

                            if ( (LA12_126=='i') ) {
                                int LA12_148 = input.LA(7);

                                if ( (LA12_148=='t') ) {
                                    int LA12_167 = input.LA(8);

                                    if ( (LA12_167=='s') ) {
                                        int LA12_184 = input.LA(9);

                                        if ( ((LA12_184>='0' && LA12_184<='9')||(LA12_184>='A' && LA12_184<='Z')||LA12_184=='_'||(LA12_184>='a' && LA12_184<='z')) ) {
                                            alt12=34;
                                        }
                                        else {
                                            alt12=11;}
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                    }
                    break;
                case 't':
                    {
                    int LA12_78 = input.LA(4);

                    if ( (LA12_78=='e') ) {
                        int LA12_104 = input.LA(5);

                        if ( (LA12_104=='g') ) {
                            int LA12_127 = input.LA(6);

                            if ( (LA12_127=='e') ) {
                                int LA12_149 = input.LA(7);

                                if ( (LA12_149=='r') ) {
                                    int LA12_168 = input.LA(8);

                                    if ( ((LA12_168>='0' && LA12_168<='9')||(LA12_168>='A' && LA12_168<='Z')||LA12_168=='_'||(LA12_168>='a' && LA12_168<='z')) ) {
                                        alt12=34;
                                    }
                                    else {
                                        alt12=32;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                    }
                    break;
                default:
                    alt12=34;}

            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='r') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='g') ) {
                    int LA12_79 = input.LA(4);

                    if ( (LA12_79=='e') ) {
                        int LA12_105 = input.LA(5);

                        if ( (LA12_105=='x') ) {
                            int LA12_128 = input.LA(6);

                            if ( (LA12_128=='p') ) {
                                int LA12_150 = input.LA(7);

                                if ( ((LA12_150>='0' && LA12_150<='9')||(LA12_150>='A' && LA12_150<='Z')||LA12_150=='_'||(LA12_150>='a' && LA12_150<='z')) ) {
                                    alt12=34;
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
                }
                break;
            case 'u':
                {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='l') ) {
                    int LA12_80 = input.LA(4);

                    if ( (LA12_80=='e') ) {
                        int LA12_106 = input.LA(5);

                        if ( (LA12_106=='s') ) {
                            int LA12_129 = input.LA(6);

                            if ( ((LA12_129>='0' && LA12_129<='9')||(LA12_129>='A' && LA12_129<='Z')||LA12_129=='_'||(LA12_129>='a' && LA12_129<='z')) ) {
                                alt12=34;
                            }
                            else {
                                alt12=12;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
                }
                break;
            default:
                alt12=34;}

        }
        else if ( (LA12_0=='e') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='n') ) {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='u') ) {
                    int LA12_81 = input.LA(4);

                    if ( (LA12_81=='m') ) {
                        int LA12_107 = input.LA(5);

                        if ( (LA12_107=='e') ) {
                            int LA12_130 = input.LA(6);

                            if ( (LA12_130=='r') ) {
                                int LA12_152 = input.LA(7);

                                if ( (LA12_152=='a') ) {
                                    int LA12_170 = input.LA(8);

                                    if ( (LA12_170=='t') ) {
                                        int LA12_186 = input.LA(9);

                                        if ( (LA12_186=='i') ) {
                                            int LA12_195 = input.LA(10);

                                            if ( (LA12_195=='o') ) {
                                                int LA12_201 = input.LA(11);

                                                if ( (LA12_201=='n') ) {
                                                    int LA12_203 = input.LA(12);

                                                    if ( ((LA12_203>='0' && LA12_203<='9')||(LA12_203>='A' && LA12_203<='Z')||LA12_203=='_'||(LA12_203>='a' && LA12_203<='z')) ) {
                                                        alt12=34;
                                                    }
                                                    else {
                                                        alt12=13;}
                                                }
                                                else {
                                                    alt12=34;}
                                            }
                                            else {
                                                alt12=34;}
                                        }
                                        else {
                                            alt12=34;}
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='=') ) {
            alt12=14;
        }
        else if ( (LA12_0=='u') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='n') ) {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='i') ) {
                    int LA12_82 = input.LA(4);

                    if ( (LA12_82=='q') ) {
                        int LA12_108 = input.LA(5);

                        if ( (LA12_108=='u') ) {
                            int LA12_131 = input.LA(6);

                            if ( (LA12_131=='e') ) {
                                int LA12_153 = input.LA(7);

                                if ( ((LA12_153>='0' && LA12_153<='9')||(LA12_153>='A' && LA12_153<='Z')||LA12_153=='_'||(LA12_153>='a' && LA12_153<='z')) ) {
                                    alt12=34;
                                }
                                else {
                                    alt12=15;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0==',') ) {
            alt12=16;
        }
        else if ( (LA12_0=='<') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='-') ) {
                alt12=22;
            }
            else {
                alt12=40;}
        }
        else if ( (LA12_0=='n') ) {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='u') ) {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='l') ) {
                    int LA12_83 = input.LA(4);

                    if ( (LA12_83=='l') ) {
                        int LA12_109 = input.LA(5);

                        if ( (LA12_109=='a') ) {
                            int LA12_132 = input.LA(6);

                            if ( (LA12_132=='b') ) {
                                int LA12_154 = input.LA(7);

                                if ( (LA12_154=='l') ) {
                                    int LA12_172 = input.LA(8);

                                    if ( (LA12_172=='e') ) {
                                        int LA12_187 = input.LA(9);

                                        if ( ((LA12_187>='0' && LA12_187<='9')||(LA12_187>='A' && LA12_187<='Z')||LA12_187=='_'||(LA12_187>='a' && LA12_187<='z')) ) {
                                            alt12=34;
                                        }
                                        else {
                                            alt12=24;}
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='w') ) {
            int LA12_19 = input.LA(2);

            if ( (LA12_19=='r') ) {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='i') ) {
                    int LA12_84 = input.LA(4);

                    if ( (LA12_84=='t') ) {
                        int LA12_110 = input.LA(5);

                        if ( (LA12_110=='a') ) {
                            int LA12_133 = input.LA(6);

                            if ( (LA12_133=='b') ) {
                                int LA12_155 = input.LA(7);

                                if ( (LA12_155=='l') ) {
                                    int LA12_173 = input.LA(8);

                                    if ( (LA12_173=='e') ) {
                                        int LA12_188 = input.LA(9);

                                        if ( ((LA12_188>='0' && LA12_188<='9')||(LA12_188>='A' && LA12_188<='Z')||LA12_188=='_'||(LA12_188>='a' && LA12_188<='z')) ) {
                                            alt12=34;
                                        }
                                        else {
                                            alt12=26;}
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='b') ) {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='o') ) {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='o') ) {
                    int LA12_85 = input.LA(4);

                    if ( (LA12_85=='l') ) {
                        int LA12_111 = input.LA(5);

                        if ( (LA12_111=='e') ) {
                            int LA12_134 = input.LA(6);

                            if ( (LA12_134=='a') ) {
                                int LA12_156 = input.LA(7);

                                if ( (LA12_156=='n') ) {
                                    int LA12_174 = input.LA(8);

                                    if ( ((LA12_174>='0' && LA12_174<='9')||(LA12_174>='A' && LA12_174<='Z')||LA12_174=='_'||(LA12_174>='a' && LA12_174<='z')) ) {
                                        alt12=34;
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='t') ) {
            int LA12_21 = input.LA(2);

            if ( (LA12_21=='r') ) {
                int LA12_57 = input.LA(3);

                if ( (LA12_57=='u') ) {
                    int LA12_86 = input.LA(4);

                    if ( (LA12_86=='e') ) {
                        int LA12_112 = input.LA(5);

                        if ( ((LA12_112>='0' && LA12_112<='9')||(LA12_112>='A' && LA12_112<='Z')||LA12_112=='_'||(LA12_112>='a' && LA12_112<='z')) ) {
                            alt12=34;
                        }
                        else {
                            alt12=29;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='s') ) {
            int LA12_22 = input.LA(2);

            if ( (LA12_22=='t') ) {
                int LA12_58 = input.LA(3);

                if ( (LA12_58=='r') ) {
                    int LA12_87 = input.LA(4);

                    if ( (LA12_87=='i') ) {
                        int LA12_113 = input.LA(5);

                        if ( (LA12_113=='n') ) {
                            int LA12_136 = input.LA(6);

                            if ( (LA12_136=='g') ) {
                                int LA12_157 = input.LA(7);

                                if ( ((LA12_157>='0' && LA12_157<='9')||(LA12_157>='A' && LA12_157<='Z')||LA12_157=='_'||(LA12_157>='a' && LA12_157<='z')) ) {
                                    alt12=34;
                                }
                                else {
                                    alt12=30;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_23 = input.LA(2);

            if ( ((LA12_23>='A' && LA12_23<='Z')||LA12_23=='_'||(LA12_23>='a' && LA12_23<='z')) ) {
                alt12=34;
            }
            else {
                alt12=40;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='l')||(LA12_0>='p' && LA12_0<='q')||LA12_0=='v'||(LA12_0>='x' && LA12_0<='z')) ) {
            alt12=34;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=35;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_26 = input.LA(2);

            if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFE')) ) {
                alt12=36;
            }
            else {
                alt12=40;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_27 = input.LA(2);

            if ( ((LA12_27>='\u0000' && LA12_27<='\uFFFE')) ) {
                alt12=36;
            }
            else {
                alt12=40;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=37;
                }
                break;
            case '/':
                {
                alt12=38;
                }
                break;
            default:
                alt12=40;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=39;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||LA12_0=='.'||LA12_0==':'||(LA12_0>='>' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFE')) ) {
            alt12=40;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:142: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:150: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:159: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:171: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:187: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:203: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1:211: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}