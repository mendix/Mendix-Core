package org.mendix.dsl.datacontract.xtext.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.mendix.dsl.datacontract.xtext.services.DataContractGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalDataContractParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datacontract'", "';'", "'from'", "'import'", "'businessclass'", "'enumeration'", "'class'", "'represents'", "'['", "'references'", "']'", "'as'", "'custom'", "'boolean'", "'string'", "'datetime'", "'integer'", "'decimal'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalDataContractParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g"; }


     
     	private DataContractGrammarAccess grammarAccess;
     	
        public InternalDataContractParser(TokenStream input, IAstFactory factory, DataContractGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DataContractModel";	
       	} 



    // $ANTLR start entryRuleDataContractModel
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:72:1: entryRuleDataContractModel returns [EObject current=null] : iv_ruleDataContractModel= ruleDataContractModel EOF ;
    public final EObject entryRuleDataContractModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataContractModel = null;


        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:72:59: (iv_ruleDataContractModel= ruleDataContractModel EOF )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:73:2: iv_ruleDataContractModel= ruleDataContractModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataContractModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataContractModel_in_entryRuleDataContractModel73);
            iv_ruleDataContractModel=ruleDataContractModel();
            _fsp--;

             current =iv_ruleDataContractModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataContractModel83); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataContractModel


    // $ANTLR start ruleDataContractModel
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:80:1: ruleDataContractModel returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'datacontract' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* ( (lv_dtos_5= ruleDto ) | (lv_enumerations_6= ruleEnumerationDto ) )* ) ;
    public final EObject ruleDataContractModel() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_externalReferences_4 = null;

        EObject lv_dtos_5 = null;

        EObject lv_enumerations_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:85:6: ( ( (lv_description_0= RULE_STRING )? 'datacontract' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* ( (lv_dtos_5= ruleDto ) | (lv_enumerations_6= ruleEnumerationDto ) )* ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:86:1: ( (lv_description_0= RULE_STRING )? 'datacontract' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* ( (lv_dtos_5= ruleDto ) | (lv_enumerations_6= ruleEnumerationDto ) )* )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:86:1: ( (lv_description_0= RULE_STRING )? 'datacontract' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* ( (lv_dtos_5= ruleDto ) | (lv_enumerations_6= ruleEnumerationDto ) )* )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:86:2: (lv_description_0= RULE_STRING )? 'datacontract' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* ( (lv_dtos_5= ruleDto ) | (lv_enumerations_6= ruleEnumerationDto ) )*
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:86:2: (lv_description_0= RULE_STRING )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:88:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataContractModel130); 

                    		createLeafNode(grammarAccess.getDataContractModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDataContractModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleDataContractModel148); 

                    createLeafNode(grammarAccess.getDataContractModelAccess().getDatacontractKeyword_1(), null); 
                
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:110:1: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:112:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataContractModel170); 

            		createLeafNode(grammarAccess.getDataContractModelAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataContractModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_ruleDataContractModel187); 

                    createLeafNode(grammarAccess.getDataContractModelAccess().getSemicolonKeyword_3(), null); 
                
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:134:1: (lv_externalReferences_4= ruleExternalReference )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==13) ) {
                        alt2=1;
                    }


                }
                else if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:137:6: lv_externalReferences_4= ruleExternalReference
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDataContractModelAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleExternalReference_in_ruleDataContractModel221);
            	    lv_externalReferences_4=ruleExternalReference();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDataContractModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "externalReferences", lv_externalReferences_4, "ExternalReference", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:155:3: ( (lv_dtos_5= ruleDto ) | (lv_enumerations_6= ruleEnumerationDto ) )*
            loop3:
            do {
                int alt3=3;
                switch ( input.LA(1) ) {
                case RULE_STRING:
                    {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==17||LA3_2==23) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==16) ) {
                        alt3=2;
                    }


                    }
                    break;
                case 17:
                case 23:
                    {
                    alt3=1;
                    }
                    break;
                case 16:
                    {
                    alt3=2;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:155:4: (lv_dtos_5= ruleDto )
            	    {
            	    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:155:4: (lv_dtos_5= ruleDto )
            	    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:158:6: lv_dtos_5= ruleDto
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDataContractModelAccess().getDtosDtoParserRuleCall_5_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDto_in_ruleDataContractModel261);
            	    lv_dtos_5=ruleDto();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDataContractModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "dtos", lv_dtos_5, "Dto", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:177:6: (lv_enumerations_6= ruleEnumerationDto )
            	    {
            	    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:177:6: (lv_enumerations_6= ruleEnumerationDto )
            	    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:180:6: lv_enumerations_6= ruleEnumerationDto
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDataContractModelAccess().getEnumerationsEnumerationDtoParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumerationDto_in_ruleDataContractModel305);
            	    lv_enumerations_6=ruleEnumerationDto();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDataContractModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "enumerations", lv_enumerations_6, "EnumerationDto", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataContractModel


    // $ANTLR start entryRuleDto
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:205:1: entryRuleDto returns [EObject current=null] : iv_ruleDto= ruleDto EOF ;
    public final EObject entryRuleDto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDto = null;


        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:205:45: (iv_ruleDto= ruleDto EOF )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:206:2: iv_ruleDto= ruleDto EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoRule(), currentNode); 
            pushFollow(FOLLOW_ruleDto_in_entryRuleDto344);
            iv_ruleDto=ruleDto();
            _fsp--;

             current =iv_ruleDto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDto354); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDto


    // $ANTLR start ruleDto
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:213:1: ruleDto returns [EObject current=null] : (this_BusinessClassDto_0= ruleBusinessClassDto | this_CustomDto_1= ruleCustomDto ) ;
    public final EObject ruleDto() throws RecognitionException {
        EObject current = null;

        EObject this_BusinessClassDto_0 = null;

        EObject this_CustomDto_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:218:6: ( (this_BusinessClassDto_0= ruleBusinessClassDto | this_CustomDto_1= ruleCustomDto ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:219:1: (this_BusinessClassDto_0= ruleBusinessClassDto | this_CustomDto_1= ruleCustomDto )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:219:1: (this_BusinessClassDto_0= ruleBusinessClassDto | this_CustomDto_1= ruleCustomDto )
            int alt4=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==17) ) {
                    alt4=1;
                }
                else if ( (LA4_1==23) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("219:1: (this_BusinessClassDto_0= ruleBusinessClassDto | this_CustomDto_1= ruleCustomDto )", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("219:1: (this_BusinessClassDto_0= ruleBusinessClassDto | this_CustomDto_1= ruleCustomDto )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:220:5: this_BusinessClassDto_0= ruleBusinessClassDto
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDtoAccess().getBusinessClassDtoParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBusinessClassDto_in_ruleDto401);
                    this_BusinessClassDto_0=ruleBusinessClassDto();
                    _fsp--;

                     
                            current = this_BusinessClassDto_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:230:5: this_CustomDto_1= ruleCustomDto
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDtoAccess().getCustomDtoParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCustomDto_in_ruleDto428);
                    this_CustomDto_1=ruleCustomDto();
                    _fsp--;

                     
                            current = this_CustomDto_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDto


    // $ANTLR start entryRuleExternalReference
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:245:1: entryRuleExternalReference returns [EObject current=null] : iv_ruleExternalReference= ruleExternalReference EOF ;
    public final EObject entryRuleExternalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalReference = null;


        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:245:59: (iv_ruleExternalReference= ruleExternalReference EOF )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:246:2: iv_ruleExternalReference= ruleExternalReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExternalReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleExternalReference_in_entryRuleExternalReference460);
            iv_ruleExternalReference=ruleExternalReference();
            _fsp--;

             current =iv_ruleExternalReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalReference470); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExternalReference


    // $ANTLR start ruleExternalReference
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:253:1: ruleExternalReference returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'from' (lv_modelname_2= RULE_ID ) (lv_keyword_3= ( 'import' | 'businessclass' | 'enumeration' ) ) (lv_name_4= RULE_ID ) ';' ) ;
    public final EObject ruleExternalReference() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_modelname_2=null;
        Token lv_keyword_3=null;
        Token lv_name_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:258:6: ( ( (lv_description_0= RULE_STRING )? 'from' (lv_modelname_2= RULE_ID ) (lv_keyword_3= ( 'import' | 'businessclass' | 'enumeration' ) ) (lv_name_4= RULE_ID ) ';' ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:259:1: ( (lv_description_0= RULE_STRING )? 'from' (lv_modelname_2= RULE_ID ) (lv_keyword_3= ( 'import' | 'businessclass' | 'enumeration' ) ) (lv_name_4= RULE_ID ) ';' )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:259:1: ( (lv_description_0= RULE_STRING )? 'from' (lv_modelname_2= RULE_ID ) (lv_keyword_3= ( 'import' | 'businessclass' | 'enumeration' ) ) (lv_name_4= RULE_ID ) ';' )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:259:2: (lv_description_0= RULE_STRING )? 'from' (lv_modelname_2= RULE_ID ) (lv_keyword_3= ( 'import' | 'businessclass' | 'enumeration' ) ) (lv_name_4= RULE_ID ) ';'
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:259:2: (lv_description_0= RULE_STRING )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:261:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExternalReference517); 

                    		createLeafNode(grammarAccess.getExternalReferenceAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExternalReferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleExternalReference535); 

                    createLeafNode(grammarAccess.getExternalReferenceAccess().getFromKeyword_1(), null); 
                
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:283:1: (lv_modelname_2= RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:285:6: lv_modelname_2= RULE_ID
            {
            lv_modelname_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalReference557); 

            		createLeafNode(grammarAccess.getExternalReferenceAccess().getModelnameIDTerminalRuleCall_2_0(), "modelname"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExternalReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "modelname", lv_modelname_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:303:2: (lv_keyword_3= ( 'import' | 'businessclass' | 'enumeration' ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:305:6: lv_keyword_3= ( 'import' | 'businessclass' | 'enumeration' )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:305:19: ( 'import' | 'businessclass' | 'enumeration' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("305:19: ( 'import' | 'businessclass' | 'enumeration' )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:305:20: 'import'
                    {
                    match(input,14,FOLLOW_14_in_ruleExternalReference587); 

                            createLeafNode(grammarAccess.getExternalReferenceAccess().getKeywordImportKeyword_3_0_0(), "keyword"); 
                        

                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:311:6: 'businessclass'
                    {
                    match(input,15,FOLLOW_15_in_ruleExternalReference603); 

                            createLeafNode(grammarAccess.getExternalReferenceAccess().getKeywordBusinessclassKeyword_3_0_1(), "keyword"); 
                        

                    }
                    break;
                case 3 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:317:6: 'enumeration'
                    {
                    match(input,16,FOLLOW_16_in_ruleExternalReference619); 

                            createLeafNode(grammarAccess.getExternalReferenceAccess().getKeywordEnumerationKeyword_3_0_2(), "keyword"); 
                        

                    }
                    break;

            }


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExternalReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "keyword", /* lv_keyword_3 */ input.LT(-1), null, lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:337:2: (lv_name_4= RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:339:6: lv_name_4= RULE_ID
            {
            lv_name_4=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalReference656); 

            		createLeafNode(grammarAccess.getExternalReferenceAccess().getNameIDTerminalRuleCall_4_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExternalReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_4, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_ruleExternalReference673); 

                    createLeafNode(grammarAccess.getExternalReferenceAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExternalReference


    // $ANTLR start entryRuleBusinessClassDto
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:368:1: entryRuleBusinessClassDto returns [EObject current=null] : iv_ruleBusinessClassDto= ruleBusinessClassDto EOF ;
    public final EObject entryRuleBusinessClassDto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessClassDto = null;


        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:368:58: (iv_ruleBusinessClassDto= ruleBusinessClassDto EOF )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:369:2: iv_ruleBusinessClassDto= ruleBusinessClassDto EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBusinessClassDtoRule(), currentNode); 
            pushFollow(FOLLOW_ruleBusinessClassDto_in_entryRuleBusinessClassDto706);
            iv_ruleBusinessClassDto=ruleBusinessClassDto();
            _fsp--;

             current =iv_ruleBusinessClassDto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClassDto716); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBusinessClassDto


    // $ANTLR start ruleBusinessClassDto
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:376:1: ruleBusinessClassDto returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ( ';' | ( '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']' ) ) ) ;
    public final EObject ruleBusinessClassDto() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_propertyReferences_7 = null;

        EObject lv_associationReferences_10 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:381:6: ( ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ( ';' | ( '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']' ) ) ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:382:1: ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ( ';' | ( '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']' ) ) )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:382:1: ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ( ';' | ( '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']' ) ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:382:2: (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ( ';' | ( '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']' ) )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:382:2: (lv_description_0= RULE_STRING )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:384:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBusinessClassDto763); 

                    		createLeafNode(grammarAccess.getBusinessClassDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBusinessClassDtoRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_ruleBusinessClassDto781); 

                    createLeafNode(grammarAccess.getBusinessClassDtoAccess().getClassKeyword_1(), null); 
                
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:406:1: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:408:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassDto803); 

            		createLeafNode(grammarAccess.getBusinessClassDtoAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBusinessClassDtoRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,18,FOLLOW_18_in_ruleBusinessClassDto820); 

                    createLeafNode(grammarAccess.getBusinessClassDtoAccess().getRepresentsKeyword_3(), null); 
                
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:430:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:433:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getBusinessClassDtoRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassDto842); 

            		createLeafNode(grammarAccess.getBusinessClassDtoAccess().getBaseExternalReferenceCrossReference_4_0(), "base"); 
            	

            }

            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:446:2: ( ';' | ( '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            else if ( (LA11_0==19) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("446:2: ( ';' | ( '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']' ) )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:446:3: ';'
                    {
                    match(input,12,FOLLOW_12_in_ruleBusinessClassDto855); 

                            createLeafNode(grammarAccess.getBusinessClassDtoAccess().getSemicolonKeyword_5_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:451:6: ( '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']' )
                    {
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:451:6: ( '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']' )
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:451:7: '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']'
                    {
                    match(input,19,FOLLOW_19_in_ruleBusinessClassDto871); 

                            createLeafNode(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_1_0(), null); 
                        
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:455:1: (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:458:6: lv_propertyReferences_7= ruleBusinessClassPropertyReference
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesBusinessClassPropertyReferenceParserRuleCall_5_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBusinessClassPropertyReference_in_ruleBusinessClassDto905);
                    	    lv_propertyReferences_7=ruleBusinessClassPropertyReference();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getBusinessClassDtoRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "propertyReferences", lv_propertyReferences_7, "BusinessClassPropertyReference", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:476:3: ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==20) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:476:4: 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']'
                            {
                            match(input,20,FOLLOW_20_in_ruleBusinessClassDto920); 

                                    createLeafNode(grammarAccess.getBusinessClassDtoAccess().getReferencesKeyword_5_1_2_0(), null); 
                                
                            match(input,19,FOLLOW_19_in_ruleBusinessClassDto929); 

                                    createLeafNode(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_1_2_1(), null); 
                                
                            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:484:1: (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+
                            int cnt9=0;
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==RULE_ID) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:487:6: lv_associationReferences_10= ruleBusinessClassAssociationRoleReference
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesBusinessClassAssociationRoleReferenceParserRuleCall_5_1_2_2_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleBusinessClassAssociationRoleReference_in_ruleBusinessClassDto963);
                            	    lv_associationReferences_10=ruleBusinessClassAssociationRoleReference();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getBusinessClassDtoRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        
                            	    	        try {
                            	    	       		add(current, "associationReferences", lv_associationReferences_10, "BusinessClassAssociationRoleReference", currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt9 >= 1 ) break loop9;
                                        EarlyExitException eee =
                                            new EarlyExitException(9, input);
                                        throw eee;
                                }
                                cnt9++;
                            } while (true);

                            match(input,21,FOLLOW_21_in_ruleBusinessClassDto977); 

                                    createLeafNode(grammarAccess.getBusinessClassDtoAccess().getRightSquareBracketKeyword_5_1_2_3(), null); 
                                

                            }
                            break;

                    }

                    match(input,21,FOLLOW_21_in_ruleBusinessClassDto988); 

                            createLeafNode(grammarAccess.getBusinessClassDtoAccess().getRightSquareBracketKeyword_5_1_3(), null); 
                        

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBusinessClassDto


    // $ANTLR start entryRuleEnumerationDto
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:520:1: entryRuleEnumerationDto returns [EObject current=null] : iv_ruleEnumerationDto= ruleEnumerationDto EOF ;
    public final EObject entryRuleEnumerationDto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationDto = null;


        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:520:56: (iv_ruleEnumerationDto= ruleEnumerationDto EOF )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:521:2: iv_ruleEnumerationDto= ruleEnumerationDto EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationDtoRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumerationDto_in_entryRuleEnumerationDto1023);
            iv_ruleEnumerationDto=ruleEnumerationDto();
            _fsp--;

             current =iv_ruleEnumerationDto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationDto1033); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumerationDto


    // $ANTLR start ruleEnumerationDto
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:528:1: ruleEnumerationDto returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ';' ) ;
    public final EObject ruleEnumerationDto() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:533:6: ( ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ';' ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:534:1: ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ';' )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:534:1: ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ';' )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:534:2: (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ';'
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:534:2: (lv_description_0= RULE_STRING )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:536:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumerationDto1080); 

                    		createLeafNode(grammarAccess.getEnumerationDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEnumerationDtoRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleEnumerationDto1098); 

                    createLeafNode(grammarAccess.getEnumerationDtoAccess().getEnumerationKeyword_1(), null); 
                
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:558:1: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:560:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationDto1120); 

            		createLeafNode(grammarAccess.getEnumerationDtoAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationDtoRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,18,FOLLOW_18_in_ruleEnumerationDto1137); 

                    createLeafNode(grammarAccess.getEnumerationDtoAccess().getRepresentsKeyword_3(), null); 
                
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:582:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:585:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationDtoRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationDto1159); 

            		createLeafNode(grammarAccess.getEnumerationDtoAccess().getBaseExternalReferenceCrossReference_4_0(), "base"); 
            	

            }

            match(input,12,FOLLOW_12_in_ruleEnumerationDto1171); 

                    createLeafNode(grammarAccess.getEnumerationDtoAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumerationDto


    // $ANTLR start entryRuleBusinessClassPropertyReference
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:609:1: entryRuleBusinessClassPropertyReference returns [EObject current=null] : iv_ruleBusinessClassPropertyReference= ruleBusinessClassPropertyReference EOF ;
    public final EObject entryRuleBusinessClassPropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessClassPropertyReference = null;


        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:609:72: (iv_ruleBusinessClassPropertyReference= ruleBusinessClassPropertyReference EOF )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:610:2: iv_ruleBusinessClassPropertyReference= ruleBusinessClassPropertyReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBusinessClassPropertyReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleBusinessClassPropertyReference_in_entryRuleBusinessClassPropertyReference1204);
            iv_ruleBusinessClassPropertyReference=ruleBusinessClassPropertyReference();
            _fsp--;

             current =iv_ruleBusinessClassPropertyReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClassPropertyReference1214); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBusinessClassPropertyReference


    // $ANTLR start ruleBusinessClassPropertyReference
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:617:1: ruleBusinessClassPropertyReference returns [EObject current=null] : ( (lv_name_0= RULE_ID ) ';' ) ;
    public final EObject ruleBusinessClassPropertyReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:622:6: ( ( (lv_name_0= RULE_ID ) ';' ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:623:1: ( (lv_name_0= RULE_ID ) ';' )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:623:1: ( (lv_name_0= RULE_ID ) ';' )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:623:2: (lv_name_0= RULE_ID ) ';'
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:623:2: (lv_name_0= RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:625:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassPropertyReference1261); 

            		createLeafNode(grammarAccess.getBusinessClassPropertyReferenceAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBusinessClassPropertyReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_ruleBusinessClassPropertyReference1278); 

                    createLeafNode(grammarAccess.getBusinessClassPropertyReferenceAccess().getSemicolonKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBusinessClassPropertyReference


    // $ANTLR start entryRuleBusinessClassAssociationRoleReference
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:654:1: entryRuleBusinessClassAssociationRoleReference returns [EObject current=null] : iv_ruleBusinessClassAssociationRoleReference= ruleBusinessClassAssociationRoleReference EOF ;
    public final EObject entryRuleBusinessClassAssociationRoleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessClassAssociationRoleReference = null;


        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:654:79: (iv_ruleBusinessClassAssociationRoleReference= ruleBusinessClassAssociationRoleReference EOF )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:655:2: iv_ruleBusinessClassAssociationRoleReference= ruleBusinessClassAssociationRoleReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBusinessClassAssociationRoleReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleBusinessClassAssociationRoleReference_in_entryRuleBusinessClassAssociationRoleReference1311);
            iv_ruleBusinessClassAssociationRoleReference=ruleBusinessClassAssociationRoleReference();
            _fsp--;

             current =iv_ruleBusinessClassAssociationRoleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClassAssociationRoleReference1321); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBusinessClassAssociationRoleReference


    // $ANTLR start ruleBusinessClassAssociationRoleReference
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:662:1: ruleBusinessClassAssociationRoleReference returns [EObject current=null] : ( (lv_name_0= RULE_ID ) 'as' ( RULE_ID ) ';' ) ;
    public final EObject ruleBusinessClassAssociationRoleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:667:6: ( ( (lv_name_0= RULE_ID ) 'as' ( RULE_ID ) ';' ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:668:1: ( (lv_name_0= RULE_ID ) 'as' ( RULE_ID ) ';' )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:668:1: ( (lv_name_0= RULE_ID ) 'as' ( RULE_ID ) ';' )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:668:2: (lv_name_0= RULE_ID ) 'as' ( RULE_ID ) ';'
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:668:2: (lv_name_0= RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:670:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassAssociationRoleReference1368); 

            		createLeafNode(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBusinessClassAssociationRoleReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,22,FOLLOW_22_in_ruleBusinessClassAssociationRoleReference1385); 

                    createLeafNode(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getAsKeyword_1(), null); 
                
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:692:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:695:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getBusinessClassAssociationRoleReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassAssociationRoleReference1407); 

            		createLeafNode(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeDtoCrossReference_2_0(), "dtoType"); 
            	

            }

            match(input,12,FOLLOW_12_in_ruleBusinessClassAssociationRoleReference1419); 

                    createLeafNode(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBusinessClassAssociationRoleReference


    // $ANTLR start entryRuleCustomDto
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:719:1: entryRuleCustomDto returns [EObject current=null] : iv_ruleCustomDto= ruleCustomDto EOF ;
    public final EObject entryRuleCustomDto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomDto = null;


        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:719:51: (iv_ruleCustomDto= ruleCustomDto EOF )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:720:2: iv_ruleCustomDto= ruleCustomDto EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCustomDtoRule(), currentNode); 
            pushFollow(FOLLOW_ruleCustomDto_in_entryRuleCustomDto1452);
            iv_ruleCustomDto=ruleCustomDto();
            _fsp--;

             current =iv_ruleCustomDto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomDto1462); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCustomDto


    // $ANTLR start ruleCustomDto
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:727:1: ruleCustomDto returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'custom' (lv_name_2= RULE_ID ) '[' (lv_properties_4= ruleDtoProperty )+ ']' ) ;
    public final EObject ruleCustomDto() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_properties_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:732:6: ( ( (lv_description_0= RULE_STRING )? 'custom' (lv_name_2= RULE_ID ) '[' (lv_properties_4= ruleDtoProperty )+ ']' ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:733:1: ( (lv_description_0= RULE_STRING )? 'custom' (lv_name_2= RULE_ID ) '[' (lv_properties_4= ruleDtoProperty )+ ']' )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:733:1: ( (lv_description_0= RULE_STRING )? 'custom' (lv_name_2= RULE_ID ) '[' (lv_properties_4= ruleDtoProperty )+ ']' )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:733:2: (lv_description_0= RULE_STRING )? 'custom' (lv_name_2= RULE_ID ) '[' (lv_properties_4= ruleDtoProperty )+ ']'
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:733:2: (lv_description_0= RULE_STRING )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:735:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCustomDto1509); 

                    		createLeafNode(grammarAccess.getCustomDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCustomDtoRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            match(input,23,FOLLOW_23_in_ruleCustomDto1527); 

                    createLeafNode(grammarAccess.getCustomDtoAccess().getCustomKeyword_1(), null); 
                
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:757:1: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:759:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomDto1549); 

            		createLeafNode(grammarAccess.getCustomDtoAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCustomDtoRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,19,FOLLOW_19_in_ruleCustomDto1566); 

                    createLeafNode(grammarAccess.getCustomDtoAccess().getLeftSquareBracketKeyword_3(), null); 
                
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:781:1: (lv_properties_4= ruleDtoProperty )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)||(LA14_0>=24 && LA14_0<=28)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:784:6: lv_properties_4= ruleDtoProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCustomDtoAccess().getPropertiesDtoPropertyParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDtoProperty_in_ruleCustomDto1600);
            	    lv_properties_4=ruleDtoProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCustomDtoRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "properties", lv_properties_4, "DtoProperty", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            match(input,21,FOLLOW_21_in_ruleCustomDto1614); 

                    createLeafNode(grammarAccess.getCustomDtoAccess().getRightSquareBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCustomDto


    // $ANTLR start entryRuleDtoProperty
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:813:1: entryRuleDtoProperty returns [EObject current=null] : iv_ruleDtoProperty= ruleDtoProperty EOF ;
    public final EObject entryRuleDtoProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoProperty = null;


        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:813:53: (iv_ruleDtoProperty= ruleDtoProperty EOF )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:814:2: iv_ruleDtoProperty= ruleDtoProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoProperty_in_entryRuleDtoProperty1647);
            iv_ruleDtoProperty=ruleDtoProperty();
            _fsp--;

             current =iv_ruleDtoProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoProperty1657); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDtoProperty


    // $ANTLR start ruleDtoProperty
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:821:1: ruleDtoProperty returns [EObject current=null] : ( (this_DtoBooleanProperty_0= ruleDtoBooleanProperty | this_DtoStringProperty_1= ruleDtoStringProperty | this_DtoDateTimeProperty_2= ruleDtoDateTimeProperty | this_DtoIntegerProperty_3= ruleDtoIntegerProperty | this_DtoDecimalProperty_4= ruleDtoDecimalProperty | this_DtoEnumerationProperty_5= ruleDtoEnumerationProperty ) ';' ) ;
    public final EObject ruleDtoProperty() throws RecognitionException {
        EObject current = null;

        EObject this_DtoBooleanProperty_0 = null;

        EObject this_DtoStringProperty_1 = null;

        EObject this_DtoDateTimeProperty_2 = null;

        EObject this_DtoIntegerProperty_3 = null;

        EObject this_DtoDecimalProperty_4 = null;

        EObject this_DtoEnumerationProperty_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:826:6: ( ( (this_DtoBooleanProperty_0= ruleDtoBooleanProperty | this_DtoStringProperty_1= ruleDtoStringProperty | this_DtoDateTimeProperty_2= ruleDtoDateTimeProperty | this_DtoIntegerProperty_3= ruleDtoIntegerProperty | this_DtoDecimalProperty_4= ruleDtoDecimalProperty | this_DtoEnumerationProperty_5= ruleDtoEnumerationProperty ) ';' ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:827:1: ( (this_DtoBooleanProperty_0= ruleDtoBooleanProperty | this_DtoStringProperty_1= ruleDtoStringProperty | this_DtoDateTimeProperty_2= ruleDtoDateTimeProperty | this_DtoIntegerProperty_3= ruleDtoIntegerProperty | this_DtoDecimalProperty_4= ruleDtoDecimalProperty | this_DtoEnumerationProperty_5= ruleDtoEnumerationProperty ) ';' )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:827:1: ( (this_DtoBooleanProperty_0= ruleDtoBooleanProperty | this_DtoStringProperty_1= ruleDtoStringProperty | this_DtoDateTimeProperty_2= ruleDtoDateTimeProperty | this_DtoIntegerProperty_3= ruleDtoIntegerProperty | this_DtoDecimalProperty_4= ruleDtoDecimalProperty | this_DtoEnumerationProperty_5= ruleDtoEnumerationProperty ) ';' )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:827:2: (this_DtoBooleanProperty_0= ruleDtoBooleanProperty | this_DtoStringProperty_1= ruleDtoStringProperty | this_DtoDateTimeProperty_2= ruleDtoDateTimeProperty | this_DtoIntegerProperty_3= ruleDtoIntegerProperty | this_DtoDecimalProperty_4= ruleDtoDecimalProperty | this_DtoEnumerationProperty_5= ruleDtoEnumerationProperty ) ';'
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:827:2: (this_DtoBooleanProperty_0= ruleDtoBooleanProperty | this_DtoStringProperty_1= ruleDtoStringProperty | this_DtoDateTimeProperty_2= ruleDtoDateTimeProperty | this_DtoIntegerProperty_3= ruleDtoIntegerProperty | this_DtoDecimalProperty_4= ruleDtoDecimalProperty | this_DtoEnumerationProperty_5= ruleDtoEnumerationProperty )
            int alt15=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt15=6;
                    }
                    break;
                case 27:
                    {
                    alt15=4;
                    }
                    break;
                case 25:
                    {
                    alt15=2;
                    }
                    break;
                case 26:
                    {
                    alt15=3;
                    }
                    break;
                case 24:
                    {
                    alt15=1;
                    }
                    break;
                case 28:
                    {
                    alt15=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("827:2: (this_DtoBooleanProperty_0= ruleDtoBooleanProperty | this_DtoStringProperty_1= ruleDtoStringProperty | this_DtoDateTimeProperty_2= ruleDtoDateTimeProperty | this_DtoIntegerProperty_3= ruleDtoIntegerProperty | this_DtoDecimalProperty_4= ruleDtoDecimalProperty | this_DtoEnumerationProperty_5= ruleDtoEnumerationProperty )", 15, 1, input);

                    throw nvae;
                }

                }
                break;
            case 24:
                {
                alt15=1;
                }
                break;
            case 25:
                {
                alt15=2;
                }
                break;
            case 26:
                {
                alt15=3;
                }
                break;
            case 27:
                {
                alt15=4;
                }
                break;
            case 28:
                {
                alt15=5;
                }
                break;
            case RULE_ID:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("827:2: (this_DtoBooleanProperty_0= ruleDtoBooleanProperty | this_DtoStringProperty_1= ruleDtoStringProperty | this_DtoDateTimeProperty_2= ruleDtoDateTimeProperty | this_DtoIntegerProperty_3= ruleDtoIntegerProperty | this_DtoDecimalProperty_4= ruleDtoDecimalProperty | this_DtoEnumerationProperty_5= ruleDtoEnumerationProperty )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:828:5: this_DtoBooleanProperty_0= ruleDtoBooleanProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDtoPropertyAccess().getDtoBooleanPropertyParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDtoBooleanProperty_in_ruleDtoProperty1705);
                    this_DtoBooleanProperty_0=ruleDtoBooleanProperty();
                    _fsp--;

                     
                            current = this_DtoBooleanProperty_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:838:5: this_DtoStringProperty_1= ruleDtoStringProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDtoPropertyAccess().getDtoStringPropertyParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDtoStringProperty_in_ruleDtoProperty1732);
                    this_DtoStringProperty_1=ruleDtoStringProperty();
                    _fsp--;

                     
                            current = this_DtoStringProperty_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:848:5: this_DtoDateTimeProperty_2= ruleDtoDateTimeProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDtoPropertyAccess().getDtoDateTimePropertyParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDtoDateTimeProperty_in_ruleDtoProperty1759);
                    this_DtoDateTimeProperty_2=ruleDtoDateTimeProperty();
                    _fsp--;

                     
                            current = this_DtoDateTimeProperty_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:858:5: this_DtoIntegerProperty_3= ruleDtoIntegerProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDtoPropertyAccess().getDtoIntegerPropertyParserRuleCall_0_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDtoIntegerProperty_in_ruleDtoProperty1786);
                    this_DtoIntegerProperty_3=ruleDtoIntegerProperty();
                    _fsp--;

                     
                            current = this_DtoIntegerProperty_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:868:5: this_DtoDecimalProperty_4= ruleDtoDecimalProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDtoPropertyAccess().getDtoDecimalPropertyParserRuleCall_0_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDtoDecimalProperty_in_ruleDtoProperty1813);
                    this_DtoDecimalProperty_4=ruleDtoDecimalProperty();
                    _fsp--;

                     
                            current = this_DtoDecimalProperty_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:878:5: this_DtoEnumerationProperty_5= ruleDtoEnumerationProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDtoPropertyAccess().getDtoEnumerationPropertyParserRuleCall_0_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDtoEnumerationProperty_in_ruleDtoProperty1840);
                    this_DtoEnumerationProperty_5=ruleDtoEnumerationProperty();
                    _fsp--;

                     
                            current = this_DtoEnumerationProperty_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleDtoProperty1849); 

                    createLeafNode(grammarAccess.getDtoPropertyAccess().getSemicolonKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDtoProperty


    // $ANTLR start entryRuleDtoBooleanProperty
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:897:1: entryRuleDtoBooleanProperty returns [EObject current=null] : iv_ruleDtoBooleanProperty= ruleDtoBooleanProperty EOF ;
    public final EObject entryRuleDtoBooleanProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoBooleanProperty = null;


        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:897:60: (iv_ruleDtoBooleanProperty= ruleDtoBooleanProperty EOF )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:898:2: iv_ruleDtoBooleanProperty= ruleDtoBooleanProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoBooleanPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoBooleanProperty_in_entryRuleDtoBooleanProperty1882);
            iv_ruleDtoBooleanProperty=ruleDtoBooleanProperty();
            _fsp--;

             current =iv_ruleDtoBooleanProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoBooleanProperty1892); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDtoBooleanProperty


    // $ANTLR start ruleDtoBooleanProperty
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:905:1: ruleDtoBooleanProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleDtoBooleanProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:910:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:911:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:911:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:911:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:911:2: (lv_description_0= RULE_STRING )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:913:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDtoBooleanProperty1939); 

                    		createLeafNode(grammarAccess.getDtoBooleanPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDtoBooleanPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:931:3: (lv_dataType_1= 'boolean' )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:933:6: lv_dataType_1= 'boolean'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,24,FOLLOW_24_in_ruleDtoBooleanProperty1969); 

                    createLeafNode(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeBooleanKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoBooleanPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "boolean", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:952:2: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:954:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoBooleanProperty2004); 

            		createLeafNode(grammarAccess.getDtoBooleanPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoBooleanPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDtoBooleanProperty


    // $ANTLR start entryRuleDtoStringProperty
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:979:1: entryRuleDtoStringProperty returns [EObject current=null] : iv_ruleDtoStringProperty= ruleDtoStringProperty EOF ;
    public final EObject entryRuleDtoStringProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoStringProperty = null;


        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:979:59: (iv_ruleDtoStringProperty= ruleDtoStringProperty EOF )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:980:2: iv_ruleDtoStringProperty= ruleDtoStringProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoStringPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoStringProperty_in_entryRuleDtoStringProperty2045);
            iv_ruleDtoStringProperty=ruleDtoStringProperty();
            _fsp--;

             current =iv_ruleDtoStringProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoStringProperty2055); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDtoStringProperty


    // $ANTLR start ruleDtoStringProperty
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:987:1: ruleDtoStringProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleDtoStringProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:992:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:993:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:993:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:993:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:993:2: (lv_description_0= RULE_STRING )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:995:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDtoStringProperty2102); 

                    		createLeafNode(grammarAccess.getDtoStringPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDtoStringPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1013:3: (lv_dataType_1= 'string' )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1015:6: lv_dataType_1= 'string'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_ruleDtoStringProperty2132); 

                    createLeafNode(grammarAccess.getDtoStringPropertyAccess().getDataTypeStringKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoStringPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "string", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1034:2: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1036:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoStringProperty2167); 

            		createLeafNode(grammarAccess.getDtoStringPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoStringPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDtoStringProperty


    // $ANTLR start entryRuleDtoDateTimeProperty
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1061:1: entryRuleDtoDateTimeProperty returns [EObject current=null] : iv_ruleDtoDateTimeProperty= ruleDtoDateTimeProperty EOF ;
    public final EObject entryRuleDtoDateTimeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoDateTimeProperty = null;


        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1061:61: (iv_ruleDtoDateTimeProperty= ruleDtoDateTimeProperty EOF )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1062:2: iv_ruleDtoDateTimeProperty= ruleDtoDateTimeProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoDateTimePropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoDateTimeProperty_in_entryRuleDtoDateTimeProperty2208);
            iv_ruleDtoDateTimeProperty=ruleDtoDateTimeProperty();
            _fsp--;

             current =iv_ruleDtoDateTimeProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoDateTimeProperty2218); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDtoDateTimeProperty


    // $ANTLR start ruleDtoDateTimeProperty
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1069:1: ruleDtoDateTimeProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleDtoDateTimeProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1074:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1075:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1075:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1075:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1075:2: (lv_description_0= RULE_STRING )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1077:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDtoDateTimeProperty2265); 

                    		createLeafNode(grammarAccess.getDtoDateTimePropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDtoDateTimePropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1095:3: (lv_dataType_1= 'datetime' )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1097:6: lv_dataType_1= 'datetime'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,26,FOLLOW_26_in_ruleDtoDateTimeProperty2295); 

                    createLeafNode(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoDateTimePropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "datetime", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1116:2: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1118:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoDateTimeProperty2330); 

            		createLeafNode(grammarAccess.getDtoDateTimePropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoDateTimePropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDtoDateTimeProperty


    // $ANTLR start entryRuleDtoIntegerProperty
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1143:1: entryRuleDtoIntegerProperty returns [EObject current=null] : iv_ruleDtoIntegerProperty= ruleDtoIntegerProperty EOF ;
    public final EObject entryRuleDtoIntegerProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoIntegerProperty = null;


        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1143:60: (iv_ruleDtoIntegerProperty= ruleDtoIntegerProperty EOF )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1144:2: iv_ruleDtoIntegerProperty= ruleDtoIntegerProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoIntegerPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoIntegerProperty_in_entryRuleDtoIntegerProperty2371);
            iv_ruleDtoIntegerProperty=ruleDtoIntegerProperty();
            _fsp--;

             current =iv_ruleDtoIntegerProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoIntegerProperty2381); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDtoIntegerProperty


    // $ANTLR start ruleDtoIntegerProperty
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1151:1: ruleDtoIntegerProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleDtoIntegerProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1156:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1157:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1157:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1157:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1157:2: (lv_description_0= RULE_STRING )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1159:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDtoIntegerProperty2428); 

                    		createLeafNode(grammarAccess.getDtoIntegerPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDtoIntegerPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1177:3: (lv_dataType_1= 'integer' )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1179:6: lv_dataType_1= 'integer'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,27,FOLLOW_27_in_ruleDtoIntegerProperty2458); 

                    createLeafNode(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoIntegerPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "integer", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1198:2: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1200:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoIntegerProperty2493); 

            		createLeafNode(grammarAccess.getDtoIntegerPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoIntegerPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDtoIntegerProperty


    // $ANTLR start entryRuleDtoDecimalProperty
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1225:1: entryRuleDtoDecimalProperty returns [EObject current=null] : iv_ruleDtoDecimalProperty= ruleDtoDecimalProperty EOF ;
    public final EObject entryRuleDtoDecimalProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoDecimalProperty = null;


        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1225:60: (iv_ruleDtoDecimalProperty= ruleDtoDecimalProperty EOF )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1226:2: iv_ruleDtoDecimalProperty= ruleDtoDecimalProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoDecimalPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoDecimalProperty_in_entryRuleDtoDecimalProperty2534);
            iv_ruleDtoDecimalProperty=ruleDtoDecimalProperty();
            _fsp--;

             current =iv_ruleDtoDecimalProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoDecimalProperty2544); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDtoDecimalProperty


    // $ANTLR start ruleDtoDecimalProperty
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1233:1: ruleDtoDecimalProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleDtoDecimalProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1238:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1239:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1239:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1239:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1239:2: (lv_description_0= RULE_STRING )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1241:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDtoDecimalProperty2591); 

                    		createLeafNode(grammarAccess.getDtoDecimalPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDtoDecimalPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1259:3: (lv_dataType_1= 'decimal' )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1261:6: lv_dataType_1= 'decimal'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,28,FOLLOW_28_in_ruleDtoDecimalProperty2621); 

                    createLeafNode(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoDecimalPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "decimal", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1280:2: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1282:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoDecimalProperty2656); 

            		createLeafNode(grammarAccess.getDtoDecimalPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoDecimalPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDtoDecimalProperty


    // $ANTLR start entryRuleDtoEnumerationProperty
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1307:1: entryRuleDtoEnumerationProperty returns [EObject current=null] : iv_ruleDtoEnumerationProperty= ruleDtoEnumerationProperty EOF ;
    public final EObject entryRuleDtoEnumerationProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoEnumerationProperty = null;


        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1307:64: (iv_ruleDtoEnumerationProperty= ruleDtoEnumerationProperty EOF )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1308:2: iv_ruleDtoEnumerationProperty= ruleDtoEnumerationProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoEnumerationPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoEnumerationProperty_in_entryRuleDtoEnumerationProperty2697);
            iv_ruleDtoEnumerationProperty=ruleDtoEnumerationProperty();
            _fsp--;

             current =iv_ruleDtoEnumerationProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoEnumerationProperty2707); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDtoEnumerationProperty


    // $ANTLR start ruleDtoEnumerationProperty
    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1315:1: ruleDtoEnumerationProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleDtoEnumerationProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1320:6: ( ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1321:1: ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1321:1: ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1321:2: (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1321:2: (lv_description_0= RULE_STRING )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1323:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDtoEnumerationProperty2754); 

                    		createLeafNode(grammarAccess.getDtoEnumerationPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDtoEnumerationPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1341:3: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1344:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDtoEnumerationPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoEnumerationProperty2785); 

            		createLeafNode(grammarAccess.getDtoEnumerationPropertyAccess().getTypeEnumerationDtoCrossReference_1_0(), "type"); 
            	

            }

            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1357:2: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext/src-gen/org/mendix/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1359:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoEnumerationProperty2810); 

            		createLeafNode(grammarAccess.getDtoEnumerationPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoEnumerationPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDtoEnumerationProperty


 

    public static final BitSet FOLLOW_ruleDataContractModel_in_entryRuleDataContractModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataContractModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataContractModel130 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleDataContractModel148 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataContractModel170 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataContractModel187 = new BitSet(new long[]{0x0000000000832012L});
    public static final BitSet FOLLOW_ruleExternalReference_in_ruleDataContractModel221 = new BitSet(new long[]{0x0000000000832012L});
    public static final BitSet FOLLOW_ruleDto_in_ruleDataContractModel261 = new BitSet(new long[]{0x0000000000830012L});
    public static final BitSet FOLLOW_ruleEnumerationDto_in_ruleDataContractModel305 = new BitSet(new long[]{0x0000000000830012L});
    public static final BitSet FOLLOW_ruleDto_in_entryRuleDto344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDto354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassDto_in_ruleDto401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomDto_in_ruleDto428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_entryRuleExternalReference460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalReference470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExternalReference517 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleExternalReference535 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalReference557 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_14_in_ruleExternalReference587 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15_in_ruleExternalReference603 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16_in_ruleExternalReference619 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalReference656 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExternalReference673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassDto_in_entryRuleBusinessClassDto706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClassDto716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBusinessClassDto763 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBusinessClassDto781 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassDto803 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBusinessClassDto820 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassDto842 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_12_in_ruleBusinessClassDto855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBusinessClassDto871 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBusinessClassPropertyReference_in_ruleBusinessClassDto905 = new BitSet(new long[]{0x0000000000300020L});
    public static final BitSet FOLLOW_20_in_ruleBusinessClassDto920 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBusinessClassDto929 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBusinessClassAssociationRoleReference_in_ruleBusinessClassDto963 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_21_in_ruleBusinessClassDto977 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBusinessClassDto988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDto_in_entryRuleEnumerationDto1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationDto1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumerationDto1080 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEnumerationDto1098 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationDto1120 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEnumerationDto1137 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationDto1159 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnumerationDto1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassPropertyReference_in_entryRuleBusinessClassPropertyReference1204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClassPropertyReference1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassPropertyReference1261 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBusinessClassPropertyReference1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassAssociationRoleReference_in_entryRuleBusinessClassAssociationRoleReference1311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClassAssociationRoleReference1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassAssociationRoleReference1368 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBusinessClassAssociationRoleReference1385 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassAssociationRoleReference1407 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBusinessClassAssociationRoleReference1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomDto_in_entryRuleCustomDto1452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomDto1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomDto1509 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCustomDto1527 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomDto1549 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCustomDto1566 = new BitSet(new long[]{0x000000001F000030L});
    public static final BitSet FOLLOW_ruleDtoProperty_in_ruleCustomDto1600 = new BitSet(new long[]{0x000000001F200030L});
    public static final BitSet FOLLOW_21_in_ruleCustomDto1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoProperty_in_entryRuleDtoProperty1647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoProperty1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoBooleanProperty_in_ruleDtoProperty1705 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleDtoStringProperty_in_ruleDtoProperty1732 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleDtoDateTimeProperty_in_ruleDtoProperty1759 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleDtoIntegerProperty_in_ruleDtoProperty1786 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleDtoDecimalProperty_in_ruleDtoProperty1813 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleDtoEnumerationProperty_in_ruleDtoProperty1840 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDtoProperty1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoBooleanProperty_in_entryRuleDtoBooleanProperty1882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoBooleanProperty1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDtoBooleanProperty1939 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDtoBooleanProperty1969 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoBooleanProperty2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoStringProperty_in_entryRuleDtoStringProperty2045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoStringProperty2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDtoStringProperty2102 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDtoStringProperty2132 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoStringProperty2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoDateTimeProperty_in_entryRuleDtoDateTimeProperty2208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoDateTimeProperty2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDtoDateTimeProperty2265 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDtoDateTimeProperty2295 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoDateTimeProperty2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoIntegerProperty_in_entryRuleDtoIntegerProperty2371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoIntegerProperty2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDtoIntegerProperty2428 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDtoIntegerProperty2458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoIntegerProperty2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoDecimalProperty_in_entryRuleDtoDecimalProperty2534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoDecimalProperty2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDtoDecimalProperty2591 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDtoDecimalProperty2621 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoDecimalProperty2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoEnumerationProperty_in_entryRuleDtoEnumerationProperty2697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoEnumerationProperty2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDtoEnumerationProperty2754 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoEnumerationProperty2785 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoEnumerationProperty2810 = new BitSet(new long[]{0x0000000000000002L});

}