package org.mendix.dsl.datacontract.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalDataContractLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=29;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=6;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalDataContractLexer() {;} 
    public InternalDataContractLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:10:5: ( 'import' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:10:7: 'import'
            {
            match("import"); 


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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:11:5: ( 'businessclass' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:11:7: 'businessclass'
            {
            match("businessclass"); 


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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:12:5: ( 'enumeration' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:12:7: 'enumeration'
            {
            match("enumeration"); 


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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:13:5: ( ';' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:13:7: ';'
            {
            match(';'); 

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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:14:5: ( 'datacontract' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:14:7: 'datacontract'
            {
            match("datacontract"); 


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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:15:5: ( 'from' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:15:7: 'from'
            {
            match("from"); 


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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:16:5: ( 'class' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:16:7: 'class'
            {
            match("class"); 


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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:17:5: ( 'represents' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:17:7: 'represents'
            {
            match("represents"); 


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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:18:5: ( '[' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:18:7: '['
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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:19:5: ( ']' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:19:7: ']'
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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:20:5: ( 'references' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:20:7: 'references'
            {
            match("references"); 


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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:21:5: ( 'as' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:21:7: 'as'
            {
            match("as"); 


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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:22:5: ( 'custom' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:22:7: 'custom'
            {
            match("custom"); 


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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:23:5: ( 'boolean' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:23:7: 'boolean'
            {
            match("boolean"); 


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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:24:5: ( 'string' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:24:7: 'string'
            {
            match("string"); 


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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:25:5: ( 'datetime' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:25:7: 'datetime'
            {
            match("datetime"); 


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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:26:5: ( 'integer' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:26:7: 'integer'
            {
            match("integer"); 


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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:27:5: ( 'decimal' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:27:7: 'decimal'
            {
            match("decimal"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2615:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2615:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2615:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2615:11: '^'
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

            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2615:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:
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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2617:10: ( ( '0' .. '9' )+ )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2617:12: ( '0' .. '9' )+
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2617:12: ( '0' .. '9' )+
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
            	    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2617:13: '0' .. '9'
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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2619:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2619:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2619:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("2619:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2619:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2619:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2619:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2619:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2619:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2619:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2619:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2619:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2621:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2621:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2621:24: ( options {greedy=false; } : . )*
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
            	    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2621:52: .
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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2623:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2623:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2623:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2623:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2623:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2623:41: ( '\\r' )? '\\n'
                    {
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2623:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2623:41: '\\r'
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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2625:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2625:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2625:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:
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
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2627:16: ( . )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2627:18: .
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
        // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=25;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA12_21 = input.LA(3);

                if ( (LA12_21=='t') ) {
                    int LA12_43 = input.LA(4);

                    if ( (LA12_43=='e') ) {
                        int LA12_57 = input.LA(5);

                        if ( (LA12_57=='g') ) {
                            int LA12_71 = input.LA(6);

                            if ( (LA12_71=='e') ) {
                                int LA12_85 = input.LA(7);

                                if ( (LA12_85=='r') ) {
                                    int LA12_98 = input.LA(8);

                                    if ( ((LA12_98>='0' && LA12_98<='9')||(LA12_98>='A' && LA12_98<='Z')||LA12_98=='_'||(LA12_98>='a' && LA12_98<='z')) ) {
                                        alt12=19;
                                    }
                                    else {
                                        alt12=17;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
                }
                break;
            case 'm':
                {
                int LA12_22 = input.LA(3);

                if ( (LA12_22=='p') ) {
                    int LA12_44 = input.LA(4);

                    if ( (LA12_44=='o') ) {
                        int LA12_58 = input.LA(5);

                        if ( (LA12_58=='r') ) {
                            int LA12_72 = input.LA(6);

                            if ( (LA12_72=='t') ) {
                                int LA12_86 = input.LA(7);

                                if ( ((LA12_86>='0' && LA12_86<='9')||(LA12_86>='A' && LA12_86<='Z')||LA12_86=='_'||(LA12_86>='a' && LA12_86<='z')) ) {
                                    alt12=19;
                                }
                                else {
                                    alt12=1;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
                }
                break;
            default:
                alt12=19;}

        }
        else if ( (LA12_0=='b') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_24 = input.LA(3);

                if ( (LA12_24=='o') ) {
                    int LA12_45 = input.LA(4);

                    if ( (LA12_45=='l') ) {
                        int LA12_59 = input.LA(5);

                        if ( (LA12_59=='e') ) {
                            int LA12_73 = input.LA(6);

                            if ( (LA12_73=='a') ) {
                                int LA12_87 = input.LA(7);

                                if ( (LA12_87=='n') ) {
                                    int LA12_100 = input.LA(8);

                                    if ( ((LA12_100>='0' && LA12_100<='9')||(LA12_100>='A' && LA12_100<='Z')||LA12_100=='_'||(LA12_100>='a' && LA12_100<='z')) ) {
                                        alt12=19;
                                    }
                                    else {
                                        alt12=14;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
                }
                break;
            case 'u':
                {
                int LA12_25 = input.LA(3);

                if ( (LA12_25=='s') ) {
                    int LA12_46 = input.LA(4);

                    if ( (LA12_46=='i') ) {
                        int LA12_60 = input.LA(5);

                        if ( (LA12_60=='n') ) {
                            int LA12_74 = input.LA(6);

                            if ( (LA12_74=='e') ) {
                                int LA12_88 = input.LA(7);

                                if ( (LA12_88=='s') ) {
                                    int LA12_101 = input.LA(8);

                                    if ( (LA12_101=='s') ) {
                                        int LA12_112 = input.LA(9);

                                        if ( (LA12_112=='c') ) {
                                            int LA12_119 = input.LA(10);

                                            if ( (LA12_119=='l') ) {
                                                int LA12_125 = input.LA(11);

                                                if ( (LA12_125=='a') ) {
                                                    int LA12_130 = input.LA(12);

                                                    if ( (LA12_130=='s') ) {
                                                        int LA12_135 = input.LA(13);

                                                        if ( (LA12_135=='s') ) {
                                                            int LA12_138 = input.LA(14);

                                                            if ( ((LA12_138>='0' && LA12_138<='9')||(LA12_138>='A' && LA12_138<='Z')||LA12_138=='_'||(LA12_138>='a' && LA12_138<='z')) ) {
                                                                alt12=19;
                                                            }
                                                            else {
                                                                alt12=2;}
                                                        }
                                                        else {
                                                            alt12=19;}
                                                    }
                                                    else {
                                                        alt12=19;}
                                                }
                                                else {
                                                    alt12=19;}
                                            }
                                            else {
                                                alt12=19;}
                                        }
                                        else {
                                            alt12=19;}
                                    }
                                    else {
                                        alt12=19;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
                }
                break;
            default:
                alt12=19;}

        }
        else if ( (LA12_0=='e') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='n') ) {
                int LA12_26 = input.LA(3);

                if ( (LA12_26=='u') ) {
                    int LA12_47 = input.LA(4);

                    if ( (LA12_47=='m') ) {
                        int LA12_61 = input.LA(5);

                        if ( (LA12_61=='e') ) {
                            int LA12_75 = input.LA(6);

                            if ( (LA12_75=='r') ) {
                                int LA12_89 = input.LA(7);

                                if ( (LA12_89=='a') ) {
                                    int LA12_102 = input.LA(8);

                                    if ( (LA12_102=='t') ) {
                                        int LA12_113 = input.LA(9);

                                        if ( (LA12_113=='i') ) {
                                            int LA12_120 = input.LA(10);

                                            if ( (LA12_120=='o') ) {
                                                int LA12_126 = input.LA(11);

                                                if ( (LA12_126=='n') ) {
                                                    int LA12_131 = input.LA(12);

                                                    if ( ((LA12_131>='0' && LA12_131<='9')||(LA12_131>='A' && LA12_131<='Z')||LA12_131=='_'||(LA12_131>='a' && LA12_131<='z')) ) {
                                                        alt12=19;
                                                    }
                                                    else {
                                                        alt12=3;}
                                                }
                                                else {
                                                    alt12=19;}
                                            }
                                            else {
                                                alt12=19;}
                                        }
                                        else {
                                            alt12=19;}
                                    }
                                    else {
                                        alt12=19;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
            }
            else {
                alt12=19;}
        }
        else if ( (LA12_0==';') ) {
            alt12=4;
        }
        else if ( (LA12_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA12_28 = input.LA(3);

                if ( (LA12_28=='c') ) {
                    int LA12_48 = input.LA(4);

                    if ( (LA12_48=='i') ) {
                        int LA12_62 = input.LA(5);

                        if ( (LA12_62=='m') ) {
                            int LA12_76 = input.LA(6);

                            if ( (LA12_76=='a') ) {
                                int LA12_90 = input.LA(7);

                                if ( (LA12_90=='l') ) {
                                    int LA12_103 = input.LA(8);

                                    if ( ((LA12_103>='0' && LA12_103<='9')||(LA12_103>='A' && LA12_103<='Z')||LA12_103=='_'||(LA12_103>='a' && LA12_103<='z')) ) {
                                        alt12=19;
                                    }
                                    else {
                                        alt12=18;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
                }
                break;
            case 'a':
                {
                int LA12_29 = input.LA(3);

                if ( (LA12_29=='t') ) {
                    switch ( input.LA(4) ) {
                    case 'e':
                        {
                        int LA12_63 = input.LA(5);

                        if ( (LA12_63=='t') ) {
                            int LA12_77 = input.LA(6);

                            if ( (LA12_77=='i') ) {
                                int LA12_91 = input.LA(7);

                                if ( (LA12_91=='m') ) {
                                    int LA12_104 = input.LA(8);

                                    if ( (LA12_104=='e') ) {
                                        int LA12_115 = input.LA(9);

                                        if ( ((LA12_115>='0' && LA12_115<='9')||(LA12_115>='A' && LA12_115<='Z')||LA12_115=='_'||(LA12_115>='a' && LA12_115<='z')) ) {
                                            alt12=19;
                                        }
                                        else {
                                            alt12=16;}
                                    }
                                    else {
                                        alt12=19;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                        }
                        break;
                    case 'a':
                        {
                        int LA12_64 = input.LA(5);

                        if ( (LA12_64=='c') ) {
                            int LA12_78 = input.LA(6);

                            if ( (LA12_78=='o') ) {
                                int LA12_92 = input.LA(7);

                                if ( (LA12_92=='n') ) {
                                    int LA12_105 = input.LA(8);

                                    if ( (LA12_105=='t') ) {
                                        int LA12_116 = input.LA(9);

                                        if ( (LA12_116=='r') ) {
                                            int LA12_122 = input.LA(10);

                                            if ( (LA12_122=='a') ) {
                                                int LA12_127 = input.LA(11);

                                                if ( (LA12_127=='c') ) {
                                                    int LA12_132 = input.LA(12);

                                                    if ( (LA12_132=='t') ) {
                                                        int LA12_137 = input.LA(13);

                                                        if ( ((LA12_137>='0' && LA12_137<='9')||(LA12_137>='A' && LA12_137<='Z')||LA12_137=='_'||(LA12_137>='a' && LA12_137<='z')) ) {
                                                            alt12=19;
                                                        }
                                                        else {
                                                            alt12=5;}
                                                    }
                                                    else {
                                                        alt12=19;}
                                                }
                                                else {
                                                    alt12=19;}
                                            }
                                            else {
                                                alt12=19;}
                                        }
                                        else {
                                            alt12=19;}
                                    }
                                    else {
                                        alt12=19;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                        }
                        break;
                    default:
                        alt12=19;}

                }
                else {
                    alt12=19;}
                }
                break;
            default:
                alt12=19;}

        }
        else if ( (LA12_0=='f') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='r') ) {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='o') ) {
                    int LA12_50 = input.LA(4);

                    if ( (LA12_50=='m') ) {
                        int LA12_65 = input.LA(5);

                        if ( ((LA12_65>='0' && LA12_65<='9')||(LA12_65>='A' && LA12_65<='Z')||LA12_65=='_'||(LA12_65>='a' && LA12_65<='z')) ) {
                            alt12=19;
                        }
                        else {
                            alt12=6;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
            }
            else {
                alt12=19;}
        }
        else if ( (LA12_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA12_31 = input.LA(3);

                if ( (LA12_31=='a') ) {
                    int LA12_51 = input.LA(4);

                    if ( (LA12_51=='s') ) {
                        int LA12_66 = input.LA(5);

                        if ( (LA12_66=='s') ) {
                            int LA12_80 = input.LA(6);

                            if ( ((LA12_80>='0' && LA12_80<='9')||(LA12_80>='A' && LA12_80<='Z')||LA12_80=='_'||(LA12_80>='a' && LA12_80<='z')) ) {
                                alt12=19;
                            }
                            else {
                                alt12=7;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
                }
                break;
            case 'u':
                {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='s') ) {
                    int LA12_52 = input.LA(4);

                    if ( (LA12_52=='t') ) {
                        int LA12_67 = input.LA(5);

                        if ( (LA12_67=='o') ) {
                            int LA12_81 = input.LA(6);

                            if ( (LA12_81=='m') ) {
                                int LA12_94 = input.LA(7);

                                if ( ((LA12_94>='0' && LA12_94<='9')||(LA12_94>='A' && LA12_94<='Z')||LA12_94=='_'||(LA12_94>='a' && LA12_94<='z')) ) {
                                    alt12=19;
                                }
                                else {
                                    alt12=13;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
                }
                break;
            default:
                alt12=19;}

        }
        else if ( (LA12_0=='r') ) {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='e') ) {
                switch ( input.LA(3) ) {
                case 'p':
                    {
                    int LA12_53 = input.LA(4);

                    if ( (LA12_53=='r') ) {
                        int LA12_68 = input.LA(5);

                        if ( (LA12_68=='e') ) {
                            int LA12_82 = input.LA(6);

                            if ( (LA12_82=='s') ) {
                                int LA12_95 = input.LA(7);

                                if ( (LA12_95=='e') ) {
                                    int LA12_107 = input.LA(8);

                                    if ( (LA12_107=='n') ) {
                                        int LA12_117 = input.LA(9);

                                        if ( (LA12_117=='t') ) {
                                            int LA12_123 = input.LA(10);

                                            if ( (LA12_123=='s') ) {
                                                int LA12_128 = input.LA(11);

                                                if ( ((LA12_128>='0' && LA12_128<='9')||(LA12_128>='A' && LA12_128<='Z')||LA12_128=='_'||(LA12_128>='a' && LA12_128<='z')) ) {
                                                    alt12=19;
                                                }
                                                else {
                                                    alt12=8;}
                                            }
                                            else {
                                                alt12=19;}
                                        }
                                        else {
                                            alt12=19;}
                                    }
                                    else {
                                        alt12=19;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                    }
                    break;
                case 'f':
                    {
                    int LA12_54 = input.LA(4);

                    if ( (LA12_54=='e') ) {
                        int LA12_69 = input.LA(5);

                        if ( (LA12_69=='r') ) {
                            int LA12_83 = input.LA(6);

                            if ( (LA12_83=='e') ) {
                                int LA12_96 = input.LA(7);

                                if ( (LA12_96=='n') ) {
                                    int LA12_108 = input.LA(8);

                                    if ( (LA12_108=='c') ) {
                                        int LA12_118 = input.LA(9);

                                        if ( (LA12_118=='e') ) {
                                            int LA12_124 = input.LA(10);

                                            if ( (LA12_124=='s') ) {
                                                int LA12_129 = input.LA(11);

                                                if ( ((LA12_129>='0' && LA12_129<='9')||(LA12_129>='A' && LA12_129<='Z')||LA12_129=='_'||(LA12_129>='a' && LA12_129<='z')) ) {
                                                    alt12=19;
                                                }
                                                else {
                                                    alt12=11;}
                                            }
                                            else {
                                                alt12=19;}
                                        }
                                        else {
                                            alt12=19;}
                                    }
                                    else {
                                        alt12=19;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                    }
                    break;
                default:
                    alt12=19;}

            }
            else {
                alt12=19;}
        }
        else if ( (LA12_0=='[') ) {
            alt12=9;
        }
        else if ( (LA12_0==']') ) {
            alt12=10;
        }
        else if ( (LA12_0=='a') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='s') ) {
                int LA12_36 = input.LA(3);

                if ( ((LA12_36>='0' && LA12_36<='9')||(LA12_36>='A' && LA12_36<='Z')||LA12_36=='_'||(LA12_36>='a' && LA12_36<='z')) ) {
                    alt12=19;
                }
                else {
                    alt12=12;}
            }
            else {
                alt12=19;}
        }
        else if ( (LA12_0=='s') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='t') ) {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='r') ) {
                    int LA12_56 = input.LA(4);

                    if ( (LA12_56=='i') ) {
                        int LA12_70 = input.LA(5);

                        if ( (LA12_70=='n') ) {
                            int LA12_84 = input.LA(6);

                            if ( (LA12_84=='g') ) {
                                int LA12_97 = input.LA(7);

                                if ( ((LA12_97>='0' && LA12_97<='9')||(LA12_97>='A' && LA12_97<='Z')||LA12_97=='_'||(LA12_97>='a' && LA12_97<='z')) ) {
                                    alt12=19;
                                }
                                else {
                                    alt12=15;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
            }
            else {
                alt12=19;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_13 = input.LA(2);

            if ( ((LA12_13>='A' && LA12_13<='Z')||LA12_13=='_'||(LA12_13>='a' && LA12_13<='z')) ) {
                alt12=19;
            }
            else {
                alt12=25;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='q')||(LA12_0>='t' && LA12_0<='z')) ) {
            alt12=19;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=20;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_16 = input.LA(2);

            if ( ((LA12_16>='\u0000' && LA12_16<='\uFFFE')) ) {
                alt12=21;
            }
            else {
                alt12=25;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_17 = input.LA(2);

            if ( ((LA12_17>='\u0000' && LA12_17<='\uFFFE')) ) {
                alt12=21;
            }
            else {
                alt12=25;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=22;
                }
                break;
            case '/':
                {
                alt12=23;
                }
                break;
            default:
                alt12=25;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=24;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFE')) ) {
            alt12=25;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:82: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:90: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 21 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:99: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:111: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:127: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:143: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1:151: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}