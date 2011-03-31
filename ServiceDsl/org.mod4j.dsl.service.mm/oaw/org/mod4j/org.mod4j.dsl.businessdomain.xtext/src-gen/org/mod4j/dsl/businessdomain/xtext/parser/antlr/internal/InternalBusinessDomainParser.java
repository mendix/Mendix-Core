package org.mendix.dsl.businessdomain.xtext.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.mendix.dsl.businessdomain.xtext.services.BusinessDomainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalBusinessDomainParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "';'", "'association'", "'<->'", "'->'", "'ordered'", "'class'", "'inherits'", "'['", "'rules'", "']'", "'enumeration'", "'='", "'unique'", "','", "'nullable'", "'derived'", "'writable'", "'boolean'", "'default'", "'true'", "'false'", "'string'", "'minlength'", "'maxlength'", "'regexp'", "'datetime'", "'integer'", "'min'", "'max'", "'decimal'", "'many'", "'one'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;

        public InternalBusinessDomainParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g"; }


     
     	private BusinessDomainGrammarAccess grammarAccess;
     	
        public InternalBusinessDomainParser(TokenStream input, IAstFactory factory, BusinessDomainGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "BusinessDomainModel";	
       	} 



    // $ANTLR start entryRuleBusinessDomainModel
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:73:1: entryRuleBusinessDomainModel returns [EObject current=null] : iv_ruleBusinessDomainModel= ruleBusinessDomainModel EOF ;
    public final EObject entryRuleBusinessDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessDomainModel = null;


        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:73:61: (iv_ruleBusinessDomainModel= ruleBusinessDomainModel EOF )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:74:2: iv_ruleBusinessDomainModel= ruleBusinessDomainModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBusinessDomainModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleBusinessDomainModel_in_entryRuleBusinessDomainModel73);
            iv_ruleBusinessDomainModel=ruleBusinessDomainModel();
            _fsp--;

             current =iv_ruleBusinessDomainModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessDomainModel83); 

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
    // $ANTLR end entryRuleBusinessDomainModel


    // $ANTLR start ruleBusinessDomainModel
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:81:1: ruleBusinessDomainModel returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'domain' (lv_name_2= RULE_ID ) ';' ( (lv_types_4= ruleBusinessClass ) | (lv_enumerations_5= ruleEnumeration ) | (lv_associations_6= ruleAssociation ) )* ) ;
    public final EObject ruleBusinessDomainModel() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_types_4 = null;

        EObject lv_enumerations_5 = null;

        EObject lv_associations_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:86:6: ( ( (lv_description_0= RULE_STRING )? 'domain' (lv_name_2= RULE_ID ) ';' ( (lv_types_4= ruleBusinessClass ) | (lv_enumerations_5= ruleEnumeration ) | (lv_associations_6= ruleAssociation ) )* ) )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:87:1: ( (lv_description_0= RULE_STRING )? 'domain' (lv_name_2= RULE_ID ) ';' ( (lv_types_4= ruleBusinessClass ) | (lv_enumerations_5= ruleEnumeration ) | (lv_associations_6= ruleAssociation ) )* )
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:87:1: ( (lv_description_0= RULE_STRING )? 'domain' (lv_name_2= RULE_ID ) ';' ( (lv_types_4= ruleBusinessClass ) | (lv_enumerations_5= ruleEnumeration ) | (lv_associations_6= ruleAssociation ) )* )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:87:2: (lv_description_0= RULE_STRING )? 'domain' (lv_name_2= RULE_ID ) ';' ( (lv_types_4= ruleBusinessClass ) | (lv_enumerations_5= ruleEnumeration ) | (lv_associations_6= ruleAssociation ) )*
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:87:2: (lv_description_0= RULE_STRING )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:89:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBusinessDomainModel130); 

                    		createLeafNode(grammarAccess.getBusinessDomainModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBusinessDomainModelRule().getType().getClassifier());
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

            match(input,11,FOLLOW_11_in_ruleBusinessDomainModel148); 

                    createLeafNode(grammarAccess.getBusinessDomainModelAccess().getDomainKeyword_1(), null); 
                
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:111:1: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:113:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessDomainModel170); 

            		createLeafNode(grammarAccess.getBusinessDomainModelAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBusinessDomainModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_ruleBusinessDomainModel187); 

                    createLeafNode(grammarAccess.getBusinessDomainModelAccess().getSemicolonKeyword_3(), null); 
                
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:135:1: ( (lv_types_4= ruleBusinessClass ) | (lv_enumerations_5= ruleEnumeration ) | (lv_associations_6= ruleAssociation ) )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case RULE_STRING:
                    {
                    switch ( input.LA(2) ) {
                    case 22:
                        {
                        alt2=2;
                        }
                        break;
                    case 17:
                        {
                        alt2=1;
                        }
                        break;
                    case 13:
                        {
                        alt2=3;
                        }
                        break;

                    }

                    }
                    break;
                case 17:
                    {
                    alt2=1;
                    }
                    break;
                case 22:
                    {
                    alt2=2;
                    }
                    break;
                case 13:
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:135:2: (lv_types_4= ruleBusinessClass )
            	    {
            	    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:135:2: (lv_types_4= ruleBusinessClass )
            	    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:138:6: lv_types_4= ruleBusinessClass
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBusinessDomainModelAccess().getTypesBusinessClassParserRuleCall_4_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBusinessClass_in_ruleBusinessDomainModel222);
            	    lv_types_4=ruleBusinessClass();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBusinessDomainModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "types", lv_types_4, "BusinessClass", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:157:6: (lv_enumerations_5= ruleEnumeration )
            	    {
            	    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:157:6: (lv_enumerations_5= ruleEnumeration )
            	    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:160:6: lv_enumerations_5= ruleEnumeration
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBusinessDomainModelAccess().getEnumerationsEnumerationParserRuleCall_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumeration_in_ruleBusinessDomainModel266);
            	    lv_enumerations_5=ruleEnumeration();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBusinessDomainModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "enumerations", lv_enumerations_5, "Enumeration", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:179:6: (lv_associations_6= ruleAssociation )
            	    {
            	    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:179:6: (lv_associations_6= ruleAssociation )
            	    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:182:6: lv_associations_6= ruleAssociation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBusinessDomainModelAccess().getAssociationsAssociationParserRuleCall_4_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssociation_in_ruleBusinessDomainModel310);
            	    lv_associations_6=ruleAssociation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBusinessDomainModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "associations", lv_associations_6, "Association", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end ruleBusinessDomainModel


    // $ANTLR start entryRuleAssociation
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:207:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:207:53: (iv_ruleAssociation= ruleAssociation EOF )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:208:2: iv_ruleAssociation= ruleAssociation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssociationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation349);
            iv_ruleAssociation=ruleAssociation();
            _fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation359); 

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
    // $ANTLR end entryRuleAssociation


    // $ANTLR start ruleAssociation
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:215:1: ruleAssociation returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'association' ( RULE_ID ) (lv_sourceRoleName_3= RULE_ID ) (lv_sourceMultiplicity_4= ruleMultiplicity ) ( (lv_bidirectional_5= '<->' ) | '->' ) (lv_targetMultiplicity_7= ruleMultiplicity ) ( RULE_ID ) (lv_targetRoleName_9= RULE_ID ) (lv_ordered_10= 'ordered' )? ';' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_sourceRoleName_3=null;
        Token lv_bidirectional_5=null;
        Token lv_targetRoleName_9=null;
        Token lv_ordered_10=null;
        Enumerator lv_sourceMultiplicity_4 = null;

        Enumerator lv_targetMultiplicity_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:220:6: ( ( (lv_description_0= RULE_STRING )? 'association' ( RULE_ID ) (lv_sourceRoleName_3= RULE_ID ) (lv_sourceMultiplicity_4= ruleMultiplicity ) ( (lv_bidirectional_5= '<->' ) | '->' ) (lv_targetMultiplicity_7= ruleMultiplicity ) ( RULE_ID ) (lv_targetRoleName_9= RULE_ID ) (lv_ordered_10= 'ordered' )? ';' ) )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:221:1: ( (lv_description_0= RULE_STRING )? 'association' ( RULE_ID ) (lv_sourceRoleName_3= RULE_ID ) (lv_sourceMultiplicity_4= ruleMultiplicity ) ( (lv_bidirectional_5= '<->' ) | '->' ) (lv_targetMultiplicity_7= ruleMultiplicity ) ( RULE_ID ) (lv_targetRoleName_9= RULE_ID ) (lv_ordered_10= 'ordered' )? ';' )
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:221:1: ( (lv_description_0= RULE_STRING )? 'association' ( RULE_ID ) (lv_sourceRoleName_3= RULE_ID ) (lv_sourceMultiplicity_4= ruleMultiplicity ) ( (lv_bidirectional_5= '<->' ) | '->' ) (lv_targetMultiplicity_7= ruleMultiplicity ) ( RULE_ID ) (lv_targetRoleName_9= RULE_ID ) (lv_ordered_10= 'ordered' )? ';' )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:221:2: (lv_description_0= RULE_STRING )? 'association' ( RULE_ID ) (lv_sourceRoleName_3= RULE_ID ) (lv_sourceMultiplicity_4= ruleMultiplicity ) ( (lv_bidirectional_5= '<->' ) | '->' ) (lv_targetMultiplicity_7= ruleMultiplicity ) ( RULE_ID ) (lv_targetRoleName_9= RULE_ID ) (lv_ordered_10= 'ordered' )? ';'
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:221:2: (lv_description_0= RULE_STRING )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:223:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssociation406); 

                    		createLeafNode(grammarAccess.getAssociationAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
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

            match(input,13,FOLLOW_13_in_ruleAssociation424); 

                    createLeafNode(grammarAccess.getAssociationAccess().getAssociationKeyword_1(), null); 
                
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:245:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:248:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation446); 

            		createLeafNode(grammarAccess.getAssociationAccess().getSourceBusinessClassCrossReference_2_0(), "source"); 
            	

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:261:2: (lv_sourceRoleName_3= RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:263:6: lv_sourceRoleName_3= RULE_ID
            {
            lv_sourceRoleName_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation471); 

            		createLeafNode(grammarAccess.getAssociationAccess().getSourceRoleNameIDTerminalRuleCall_3_0(), "sourceRoleName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "sourceRoleName", lv_sourceRoleName_3, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:281:2: (lv_sourceMultiplicity_4= ruleMultiplicity )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:284:6: lv_sourceMultiplicity_4= ruleMultiplicity
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssociationAccess().getSourceMultiplicityMultiplicityEnumRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleAssociation513);
            lv_sourceMultiplicity_4=ruleMultiplicity();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "sourceMultiplicity", lv_sourceMultiplicity_4, "Multiplicity", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:302:2: ( (lv_bidirectional_5= '<->' ) | '->' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("302:2: ( (lv_bidirectional_5= '<->' ) | '->' )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:302:3: (lv_bidirectional_5= '<->' )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:302:3: (lv_bidirectional_5= '<->' )
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:304:6: lv_bidirectional_5= '<->'
                    {
                    lv_bidirectional_5=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleAssociation539); 

                            createLeafNode(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_5_0_0(), "bidirectional"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "bidirectional", true, "<->", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:324:6: '->'
                    {
                    match(input,15,FOLLOW_15_in_ruleAssociation567); 

                            createLeafNode(grammarAccess.getAssociationAccess().getHyphenMinusGreaterThanSignKeyword_5_1(), null); 
                        

                    }
                    break;

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:328:2: (lv_targetMultiplicity_7= ruleMultiplicity )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:331:6: lv_targetMultiplicity_7= ruleMultiplicity
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssociationAccess().getTargetMultiplicityMultiplicityEnumRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleAssociation602);
            lv_targetMultiplicity_7=ruleMultiplicity();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "targetMultiplicity", lv_targetMultiplicity_7, "Multiplicity", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:349:2: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:352:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation628); 

            		createLeafNode(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassCrossReference_7_0(), "target"); 
            	

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:365:2: (lv_targetRoleName_9= RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:367:6: lv_targetRoleName_9= RULE_ID
            {
            lv_targetRoleName_9=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation653); 

            		createLeafNode(grammarAccess.getAssociationAccess().getTargetRoleNameIDTerminalRuleCall_8_0(), "targetRoleName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "targetRoleName", lv_targetRoleName_9, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:385:2: (lv_ordered_10= 'ordered' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:387:6: lv_ordered_10= 'ordered'
                    {
                    lv_ordered_10=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_ruleAssociation682); 

                            createLeafNode(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_9_0(), "ordered"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "ordered", true, "ordered", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleAssociation705); 

                    createLeafNode(grammarAccess.getAssociationAccess().getSemicolonKeyword_10(), null); 
                

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
    // $ANTLR end ruleAssociation


    // $ANTLR start entryRuleBusinessClass
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:417:1: entryRuleBusinessClass returns [EObject current=null] : iv_ruleBusinessClass= ruleBusinessClass EOF ;
    public final EObject entryRuleBusinessClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessClass = null;


        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:417:55: (iv_ruleBusinessClass= ruleBusinessClass EOF )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:418:2: iv_ruleBusinessClass= ruleBusinessClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBusinessClassRule(), currentNode); 
            pushFollow(FOLLOW_ruleBusinessClass_in_entryRuleBusinessClass738);
            iv_ruleBusinessClass=ruleBusinessClass();
            _fsp--;

             current =iv_ruleBusinessClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClass748); 

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
    // $ANTLR end entryRuleBusinessClass


    // $ANTLR start ruleBusinessClass
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:425:1: ruleBusinessClass returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) ( 'inherits' ( RULE_ID ) )? '[' (lv_properties_6= ruleProperty )* ( 'rules' '[' (lv_businessRules_9= ruleAbstractBusinessRule )* ']' )? ']' ) ;
    public final EObject ruleBusinessClass() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_properties_6 = null;

        EObject lv_businessRules_9 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:430:6: ( ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) ( 'inherits' ( RULE_ID ) )? '[' (lv_properties_6= ruleProperty )* ( 'rules' '[' (lv_businessRules_9= ruleAbstractBusinessRule )* ']' )? ']' ) )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:431:1: ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) ( 'inherits' ( RULE_ID ) )? '[' (lv_properties_6= ruleProperty )* ( 'rules' '[' (lv_businessRules_9= ruleAbstractBusinessRule )* ']' )? ']' )
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:431:1: ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) ( 'inherits' ( RULE_ID ) )? '[' (lv_properties_6= ruleProperty )* ( 'rules' '[' (lv_businessRules_9= ruleAbstractBusinessRule )* ']' )? ']' )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:431:2: (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) ( 'inherits' ( RULE_ID ) )? '[' (lv_properties_6= ruleProperty )* ( 'rules' '[' (lv_businessRules_9= ruleAbstractBusinessRule )* ']' )? ']'
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:431:2: (lv_description_0= RULE_STRING )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:433:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBusinessClass795); 

                    		createLeafNode(grammarAccess.getBusinessClassAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBusinessClassRule().getType().getClassifier());
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

            match(input,17,FOLLOW_17_in_ruleBusinessClass813); 

                    createLeafNode(grammarAccess.getBusinessClassAccess().getClassKeyword_1(), null); 
                
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:455:1: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:457:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClass835); 

            		createLeafNode(grammarAccess.getBusinessClassAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBusinessClassRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:475:2: ( 'inherits' ( RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:475:3: 'inherits' ( RULE_ID )
                    {
                    match(input,18,FOLLOW_18_in_ruleBusinessClass853); 

                            createLeafNode(grammarAccess.getBusinessClassAccess().getInheritsKeyword_3_0(), null); 
                        
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:479:1: ( RULE_ID )
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:482:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getBusinessClassRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClass875); 

                    		createLeafNode(grammarAccess.getBusinessClassAccess().getSuperclassBusinessClassCrossReference_3_1_0(), "superclass"); 
                    	

                    }


                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleBusinessClass889); 

                    createLeafNode(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_4(), null); 
                
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:499:1: (lv_properties_6= ruleProperty )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)||LA8_0==29||LA8_0==33||(LA8_0>=37 && LA8_0<=38)||LA8_0==41) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:502:6: lv_properties_6= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBusinessClassAccess().getPropertiesPropertyParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleBusinessClass923);
            	    lv_properties_6=ruleProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBusinessClassRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "properties", lv_properties_6, "Property", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:520:3: ( 'rules' '[' (lv_businessRules_9= ruleAbstractBusinessRule )* ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:520:4: 'rules' '[' (lv_businessRules_9= ruleAbstractBusinessRule )* ']'
                    {
                    match(input,20,FOLLOW_20_in_ruleBusinessClass938); 

                            createLeafNode(grammarAccess.getBusinessClassAccess().getRulesKeyword_6_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleBusinessClass947); 

                            createLeafNode(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_6_1(), null); 
                        
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:528:1: (lv_businessRules_9= ruleAbstractBusinessRule )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||LA9_0==24) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:531:6: lv_businessRules_9= ruleAbstractBusinessRule
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getBusinessClassAccess().getBusinessRulesAbstractBusinessRuleParserRuleCall_6_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAbstractBusinessRule_in_ruleBusinessClass981);
                    	    lv_businessRules_9=ruleAbstractBusinessRule();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getBusinessClassRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "businessRules", lv_businessRules_9, "AbstractBusinessRule", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match(input,21,FOLLOW_21_in_ruleBusinessClass995); 

                            createLeafNode(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_6_3(), null); 
                        

                    }
                    break;

            }

            match(input,21,FOLLOW_21_in_ruleBusinessClass1006); 

                    createLeafNode(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_7(), null); 
                

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
    // $ANTLR end ruleBusinessClass


    // $ANTLR start entryRuleEnumeration
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:564:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:564:53: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:565:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration1039);
            iv_ruleEnumeration=ruleEnumeration();
            _fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration1049); 

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
    // $ANTLR end entryRuleEnumeration


    // $ANTLR start ruleEnumeration
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:572:1: ruleEnumeration returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) '[' (lv_enumerationLiterals_4= ruleEnumerationLiteral )+ ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_enumerationLiterals_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:577:6: ( ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) '[' (lv_enumerationLiterals_4= ruleEnumerationLiteral )+ ']' ) )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:578:1: ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) '[' (lv_enumerationLiterals_4= ruleEnumerationLiteral )+ ']' )
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:578:1: ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) '[' (lv_enumerationLiterals_4= ruleEnumerationLiteral )+ ']' )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:578:2: (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) '[' (lv_enumerationLiterals_4= ruleEnumerationLiteral )+ ']'
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:578:2: (lv_description_0= RULE_STRING )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:580:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumeration1096); 

                    		createLeafNode(grammarAccess.getEnumerationAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEnumerationRule().getType().getClassifier());
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

            match(input,22,FOLLOW_22_in_ruleEnumeration1114); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1(), null); 
                
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:602:1: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:604:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration1136); 

            		createLeafNode(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,19,FOLLOW_19_in_ruleEnumeration1153); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_3(), null); 
                
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:626:1: (lv_enumerationLiterals_4= ruleEnumerationLiteral )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:629:6: lv_enumerationLiterals_4= ruleEnumerationLiteral
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration1187);
            	    lv_enumerationLiterals_4=ruleEnumerationLiteral();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEnumerationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "enumerationLiterals", lv_enumerationLiterals_4, "EnumerationLiteral", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            match(input,21,FOLLOW_21_in_ruleEnumeration1201); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_5(), null); 
                

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
    // $ANTLR end ruleEnumeration


    // $ANTLR start entryRuleEnumerationLiteral
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:658:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:658:60: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:659:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1234);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();
            _fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral1244); 

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
    // $ANTLR end entryRuleEnumerationLiteral


    // $ANTLR start ruleEnumerationLiteral
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:666:1: ruleEnumerationLiteral returns [EObject current=null] : ( (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_INT ) ) ';' ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_persistedValue_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:671:6: ( ( (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_INT ) ) ';' ) )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:672:1: ( (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_INT ) ) ';' )
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:672:1: ( (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_INT ) ) ';' )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:672:2: (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_INT ) ) ';'
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:672:2: (lv_name_0= RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:674:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationLiteral1291); 

            		createLeafNode(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:692:2: ( '=' (lv_persistedValue_2= RULE_INT ) )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:692:3: '=' (lv_persistedValue_2= RULE_INT )
            {
            match(input,23,FOLLOW_23_in_ruleEnumerationLiteral1309); 

                    createLeafNode(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0(), null); 
                
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:696:1: (lv_persistedValue_2= RULE_INT )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:698:6: lv_persistedValue_2= RULE_INT
            {
            lv_persistedValue_2=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumerationLiteral1331); 

            		createLeafNode(grammarAccess.getEnumerationLiteralAccess().getPersistedValueINTTerminalRuleCall_1_1_0(), "persistedValue"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "persistedValue", lv_persistedValue_2, "INT", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleEnumerationLiteral1349); 

                    createLeafNode(grammarAccess.getEnumerationLiteralAccess().getSemicolonKeyword_2(), null); 
                

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
    // $ANTLR end ruleEnumerationLiteral


    // $ANTLR start entryRuleAbstractBusinessRule
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:727:1: entryRuleAbstractBusinessRule returns [EObject current=null] : iv_ruleAbstractBusinessRule= ruleAbstractBusinessRule EOF ;
    public final EObject entryRuleAbstractBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractBusinessRule = null;


        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:727:62: (iv_ruleAbstractBusinessRule= ruleAbstractBusinessRule EOF )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:728:2: iv_ruleAbstractBusinessRule= ruleAbstractBusinessRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractBusinessRuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractBusinessRule_in_entryRuleAbstractBusinessRule1382);
            iv_ruleAbstractBusinessRule=ruleAbstractBusinessRule();
            _fsp--;

             current =iv_ruleAbstractBusinessRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractBusinessRule1392); 

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
    // $ANTLR end entryRuleAbstractBusinessRule


    // $ANTLR start ruleAbstractBusinessRule
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:735:1: ruleAbstractBusinessRule returns [EObject current=null] : (this_BusinessRule_0= ruleBusinessRule | this_UniqueRule_1= ruleUniqueRule ) ;
    public final EObject ruleAbstractBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject this_BusinessRule_0 = null;

        EObject this_UniqueRule_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:740:6: ( (this_BusinessRule_0= ruleBusinessRule | this_UniqueRule_1= ruleUniqueRule ) )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:741:1: (this_BusinessRule_0= ruleBusinessRule | this_UniqueRule_1= ruleUniqueRule )
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:741:1: (this_BusinessRule_0= ruleBusinessRule | this_UniqueRule_1= ruleUniqueRule )
            int alt13=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    alt13=1;
                }
                else if ( (LA13_1==24) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("741:1: (this_BusinessRule_0= ruleBusinessRule | this_UniqueRule_1= ruleUniqueRule )", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case 24:
                {
                alt13=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("741:1: (this_BusinessRule_0= ruleBusinessRule | this_UniqueRule_1= ruleUniqueRule )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:742:5: this_BusinessRule_0= ruleBusinessRule
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractBusinessRuleAccess().getBusinessRuleParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBusinessRule_in_ruleAbstractBusinessRule1439);
                    this_BusinessRule_0=ruleBusinessRule();
                    _fsp--;

                     
                            current = this_BusinessRule_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:752:5: this_UniqueRule_1= ruleUniqueRule
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractBusinessRuleAccess().getUniqueRuleParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUniqueRule_in_ruleAbstractBusinessRule1466);
                    this_UniqueRule_1=ruleUniqueRule();
                    _fsp--;

                     
                            current = this_UniqueRule_1; 
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
    // $ANTLR end ruleAbstractBusinessRule


    // $ANTLR start entryRuleBusinessRule
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:767:1: entryRuleBusinessRule returns [EObject current=null] : iv_ruleBusinessRule= ruleBusinessRule EOF ;
    public final EObject entryRuleBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessRule = null;


        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:767:54: (iv_ruleBusinessRule= ruleBusinessRule EOF )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:768:2: iv_ruleBusinessRule= ruleBusinessRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBusinessRuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule1498);
            iv_ruleBusinessRule=ruleBusinessRule();
            _fsp--;

             current =iv_ruleBusinessRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessRule1508); 

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
    // $ANTLR end entryRuleBusinessRule


    // $ANTLR start ruleBusinessRule
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:775:1: ruleBusinessRule returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ';' ) ;
    public final EObject ruleBusinessRule() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:780:6: ( ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ';' ) )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:781:1: ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ';' )
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:781:1: ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ';' )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:781:2: (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ';'
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:781:2: (lv_description_0= RULE_STRING )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:783:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBusinessRule1555); 

                    		createLeafNode(grammarAccess.getBusinessRuleAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBusinessRuleRule().getType().getClassifier());
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

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:801:3: (lv_name_1= RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:803:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessRule1586); 

            		createLeafNode(grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBusinessRuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_ruleBusinessRule1603); 

                    createLeafNode(grammarAccess.getBusinessRuleAccess().getSemicolonKeyword_2(), null); 
                

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
    // $ANTLR end ruleBusinessRule


    // $ANTLR start entryRuleUniqueRule
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:832:1: entryRuleUniqueRule returns [EObject current=null] : iv_ruleUniqueRule= ruleUniqueRule EOF ;
    public final EObject entryRuleUniqueRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueRule = null;


        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:832:52: (iv_ruleUniqueRule= ruleUniqueRule EOF )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:833:2: iv_ruleUniqueRule= ruleUniqueRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUniqueRuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleUniqueRule_in_entryRuleUniqueRule1636);
            iv_ruleUniqueRule=ruleUniqueRule();
            _fsp--;

             current =iv_ruleUniqueRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueRule1646); 

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
    // $ANTLR end entryRuleUniqueRule


    // $ANTLR start ruleUniqueRule
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:840:1: ruleUniqueRule returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'unique' (lv_name_2= RULE_ID ) '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']' ) ;
    public final EObject ruleUniqueRule() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:845:6: ( ( (lv_description_0= RULE_STRING )? 'unique' (lv_name_2= RULE_ID ) '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']' ) )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:846:1: ( (lv_description_0= RULE_STRING )? 'unique' (lv_name_2= RULE_ID ) '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']' )
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:846:1: ( (lv_description_0= RULE_STRING )? 'unique' (lv_name_2= RULE_ID ) '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']' )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:846:2: (lv_description_0= RULE_STRING )? 'unique' (lv_name_2= RULE_ID ) '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']'
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:846:2: (lv_description_0= RULE_STRING )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:848:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUniqueRule1693); 

                    		createLeafNode(grammarAccess.getUniqueRuleAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUniqueRuleRule().getType().getClassifier());
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

            match(input,24,FOLLOW_24_in_ruleUniqueRule1711); 

                    createLeafNode(grammarAccess.getUniqueRuleAccess().getUniqueKeyword_1(), null); 
                
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:870:1: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:872:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueRule1733); 

            		createLeafNode(grammarAccess.getUniqueRuleAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUniqueRuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,19,FOLLOW_19_in_ruleUniqueRule1750); 

                    createLeafNode(grammarAccess.getUniqueRuleAccess().getLeftSquareBracketKeyword_3(), null); 
                
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:894:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:897:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUniqueRuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueRule1772); 

            		createLeafNode(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_4_0(), "properties"); 
            	

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:910:2: ( ',' ( RULE_ID ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:910:3: ',' ( RULE_ID )
            	    {
            	    match(input,25,FOLLOW_25_in_ruleUniqueRule1785); 

            	            createLeafNode(grammarAccess.getUniqueRuleAccess().getCommaKeyword_5_0(), null); 
            	        
            	    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:914:1: ( RULE_ID )
            	    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:917:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getUniqueRuleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueRule1807); 

            	    		createLeafNode(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_5_1_0(), "properties"); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_ruleUniqueRule1821); 

                    createLeafNode(grammarAccess.getUniqueRuleAccess().getRightSquareBracketKeyword_6(), null); 
                

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
    // $ANTLR end ruleUniqueRule


    // $ANTLR start entryRuleProperty
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:941:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:941:50: (iv_ruleProperty= ruleProperty EOF )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:942:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1854);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1864); 

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
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:949:1: ruleProperty returns [EObject current=null] : ( (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty ) (lv_nullable_6= 'nullable' )? ( (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )? )? ';' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_nullable_6=null;
        Token lv_derived_7=null;
        Token lv_writable_8=null;
        EObject this_BoolProperty_0 = null;

        EObject this_StringProperty_1 = null;

        EObject this_DateTimeProperty_2 = null;

        EObject this_IntegerProperty_3 = null;

        EObject this_DecimalProperty_4 = null;

        EObject this_EnumerationProperty_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:954:6: ( ( (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty ) (lv_nullable_6= 'nullable' )? ( (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )? )? ';' ) )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:955:1: ( (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty ) (lv_nullable_6= 'nullable' )? ( (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )? )? ';' )
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:955:1: ( (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty ) (lv_nullable_6= 'nullable' )? ( (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )? )? ';' )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:955:2: (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty ) (lv_nullable_6= 'nullable' )? ( (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )? )? ';'
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:955:2: (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty )
            int alt17=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 37:
                    {
                    alt17=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt17=6;
                    }
                    break;
                case 38:
                    {
                    alt17=4;
                    }
                    break;
                case 29:
                    {
                    alt17=1;
                    }
                    break;
                case 33:
                    {
                    alt17=2;
                    }
                    break;
                case 41:
                    {
                    alt17=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("955:2: (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty )", 17, 1, input);

                    throw nvae;
                }

                }
                break;
            case 29:
                {
                alt17=1;
                }
                break;
            case 33:
                {
                alt17=2;
                }
                break;
            case 37:
                {
                alt17=3;
                }
                break;
            case 38:
                {
                alt17=4;
                }
                break;
            case 41:
                {
                alt17=5;
                }
                break;
            case RULE_ID:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("955:2: (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:956:5: this_BoolProperty_0= ruleBoolProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getBoolPropertyParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBoolProperty_in_ruleProperty1912);
                    this_BoolProperty_0=ruleBoolProperty();
                    _fsp--;

                     
                            current = this_BoolProperty_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:966:5: this_StringProperty_1= ruleStringProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getStringPropertyParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringProperty_in_ruleProperty1939);
                    this_StringProperty_1=ruleStringProperty();
                    _fsp--;

                     
                            current = this_StringProperty_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:976:5: this_DateTimeProperty_2= ruleDateTimeProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getDateTimePropertyParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDateTimeProperty_in_ruleProperty1966);
                    this_DateTimeProperty_2=ruleDateTimeProperty();
                    _fsp--;

                     
                            current = this_DateTimeProperty_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:986:5: this_IntegerProperty_3= ruleIntegerProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getIntegerPropertyParserRuleCall_0_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntegerProperty_in_ruleProperty1993);
                    this_IntegerProperty_3=ruleIntegerProperty();
                    _fsp--;

                     
                            current = this_IntegerProperty_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:996:5: this_DecimalProperty_4= ruleDecimalProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getDecimalPropertyParserRuleCall_0_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDecimalProperty_in_ruleProperty2020);
                    this_DecimalProperty_4=ruleDecimalProperty();
                    _fsp--;

                     
                            current = this_DecimalProperty_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1006:5: this_EnumerationProperty_5= ruleEnumerationProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getEnumerationPropertyParserRuleCall_0_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumerationProperty_in_ruleProperty2047);
                    this_EnumerationProperty_5=ruleEnumerationProperty();
                    _fsp--;

                     
                            current = this_EnumerationProperty_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1014:2: (lv_nullable_6= 'nullable' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1016:6: lv_nullable_6= 'nullable'
                    {
                    lv_nullable_6=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleProperty2068); 

                            createLeafNode(grammarAccess.getPropertyAccess().getNullableNullableKeyword_1_0(), "nullable"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "nullable", true, "nullable", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1035:3: ( (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )? )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1035:4: (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )?
                    {
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1035:4: (lv_derived_7= 'derived' )
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1037:6: lv_derived_7= 'derived'
                    {
                    lv_derived_7=(Token)input.LT(1);
                    match(input,27,FOLLOW_27_in_ruleProperty2104); 

                            createLeafNode(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_2_0_0(), "derived"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "derived", true, "derived", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1056:2: (lv_writable_8= 'writable' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==28) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1058:6: lv_writable_8= 'writable'
                            {
                            lv_writable_8=(Token)input.LT(1);
                            match(input,28,FOLLOW_28_in_ruleProperty2138); 

                                    createLeafNode(grammarAccess.getPropertyAccess().getWritableWritableKeyword_2_1_0(), "writable"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "writable", true, "writable", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleProperty2163); 

                    createLeafNode(grammarAccess.getPropertyAccess().getSemicolonKeyword_3(), null); 
                

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
    // $ANTLR end ruleProperty


    // $ANTLR start entryRuleBoolProperty
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1088:1: entryRuleBoolProperty returns [EObject current=null] : iv_ruleBoolProperty= ruleBoolProperty EOF ;
    public final EObject entryRuleBoolProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolProperty = null;


        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1088:54: (iv_ruleBoolProperty= ruleBoolProperty EOF )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1089:2: iv_ruleBoolProperty= ruleBoolProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBoolPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleBoolProperty_in_entryRuleBoolProperty2196);
            iv_ruleBoolProperty=ruleBoolProperty();
            _fsp--;

             current =iv_ruleBoolProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolProperty2206); 

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
    // $ANTLR end entryRuleBoolProperty


    // $ANTLR start ruleBoolProperty
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1096:1: ruleBoolProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' ) )? ) ;
    public final EObject ruleBoolProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;
        Token lv_hasDefault_3=null;
        Token lv_defaultValue_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1101:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' ) )? ) )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1102:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' ) )? )
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1102:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' ) )? )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1102:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' ) )?
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1102:2: (lv_description_0= RULE_STRING )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1104:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBoolProperty2253); 

                    		createLeafNode(grammarAccess.getBoolPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBoolPropertyRule().getType().getClassifier());
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

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1122:3: (lv_dataType_1= 'boolean' )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1124:6: lv_dataType_1= 'boolean'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,29,FOLLOW_29_in_ruleBoolProperty2283); 

                    createLeafNode(grammarAccess.getBoolPropertyAccess().getDataTypeBooleanKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBoolPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "boolean", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1143:2: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1145:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBoolProperty2318); 

            		createLeafNode(grammarAccess.getBoolPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBoolPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1163:2: ( (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1163:3: (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1163:3: (lv_hasDefault_3= 'default' )
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1165:6: lv_hasDefault_3= 'default'
                    {
                    lv_hasDefault_3=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleBoolProperty2348); 

                            createLeafNode(grammarAccess.getBoolPropertyAccess().getHasDefaultDefaultKeyword_3_0_0(), "hasDefault"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBoolPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hasDefault", true, "default", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1184:2: ( (lv_defaultValue_4= 'true' ) | 'false' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==31) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==32) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1184:2: ( (lv_defaultValue_4= 'true' ) | 'false' )", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1184:3: (lv_defaultValue_4= 'true' )
                            {
                            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1184:3: (lv_defaultValue_4= 'true' )
                            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1186:6: lv_defaultValue_4= 'true'
                            {
                            lv_defaultValue_4=(Token)input.LT(1);
                            match(input,31,FOLLOW_31_in_ruleBoolProperty2383); 

                                    createLeafNode(grammarAccess.getBoolPropertyAccess().getDefaultValueTrueKeyword_3_1_0_0(), "defaultValue"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getBoolPropertyRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "defaultValue", true, "true", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1206:6: 'false'
                            {
                            match(input,32,FOLLOW_32_in_ruleBoolProperty2411); 

                                    createLeafNode(grammarAccess.getBoolPropertyAccess().getFalseKeyword_3_1_1(), null); 
                                

                            }
                            break;

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
    // $ANTLR end ruleBoolProperty


    // $ANTLR start entryRuleStringProperty
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1217:1: entryRuleStringProperty returns [EObject current=null] : iv_ruleStringProperty= ruleStringProperty EOF ;
    public final EObject entryRuleStringProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringProperty = null;


        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1217:56: (iv_ruleStringProperty= ruleStringProperty EOF )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1218:2: iv_ruleStringProperty= ruleStringProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringProperty_in_entryRuleStringProperty2447);
            iv_ruleStringProperty=ruleStringProperty();
            _fsp--;

             current =iv_ruleStringProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringProperty2457); 

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
    // $ANTLR end entryRuleStringProperty


    // $ANTLR start ruleStringProperty
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1225:1: ruleStringProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ( 'minlength' (lv_minLength_6= RULE_INT ) )? ( 'maxlength' (lv_maxLength_8= RULE_INT ) )? ( 'regexp' (lv_regularExpression_10= RULE_STRING ) )? ) ;
    public final EObject ruleStringProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;
        Token lv_hasDefault_3=null;
        Token lv_defaultValue_4=null;
        Token lv_minLength_6=null;
        Token lv_maxLength_8=null;
        Token lv_regularExpression_10=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1230:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ( 'minlength' (lv_minLength_6= RULE_INT ) )? ( 'maxlength' (lv_maxLength_8= RULE_INT ) )? ( 'regexp' (lv_regularExpression_10= RULE_STRING ) )? ) )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1231:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ( 'minlength' (lv_minLength_6= RULE_INT ) )? ( 'maxlength' (lv_maxLength_8= RULE_INT ) )? ( 'regexp' (lv_regularExpression_10= RULE_STRING ) )? )
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1231:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ( 'minlength' (lv_minLength_6= RULE_INT ) )? ( 'maxlength' (lv_maxLength_8= RULE_INT ) )? ( 'regexp' (lv_regularExpression_10= RULE_STRING ) )? )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1231:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ( 'minlength' (lv_minLength_6= RULE_INT ) )? ( 'maxlength' (lv_maxLength_8= RULE_INT ) )? ( 'regexp' (lv_regularExpression_10= RULE_STRING ) )?
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1231:2: (lv_description_0= RULE_STRING )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1233:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringProperty2504); 

                    		createLeafNode(grammarAccess.getStringPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringPropertyRule().getType().getClassifier());
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

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1251:3: (lv_dataType_1= 'string' )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1253:6: lv_dataType_1= 'string'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,33,FOLLOW_33_in_ruleStringProperty2534); 

                    createLeafNode(grammarAccess.getStringPropertyAccess().getDataTypeStringKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "string", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1272:2: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1274:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringProperty2569); 

            		createLeafNode(grammarAccess.getStringPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1292:2: ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1292:3: (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1292:3: (lv_hasDefault_3= 'default' )
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1294:6: lv_hasDefault_3= 'default'
                    {
                    lv_hasDefault_3=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleStringProperty2599); 

                            createLeafNode(grammarAccess.getStringPropertyAccess().getHasDefaultDefaultKeyword_3_0_0(), "hasDefault"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hasDefault", true, "default", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1313:2: (lv_defaultValue_4= RULE_STRING )
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1315:6: lv_defaultValue_4= RULE_STRING
                    {
                    lv_defaultValue_4=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringProperty2634); 

                    		createLeafNode(grammarAccess.getStringPropertyAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0(), "defaultValue"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "defaultValue", lv_defaultValue_4, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1333:4: ( 'minlength' (lv_minLength_6= RULE_INT ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1333:5: 'minlength' (lv_minLength_6= RULE_INT )
                    {
                    match(input,34,FOLLOW_34_in_ruleStringProperty2654); 

                            createLeafNode(grammarAccess.getStringPropertyAccess().getMinlengthKeyword_4_0(), null); 
                        
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1337:1: (lv_minLength_6= RULE_INT )
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1339:6: lv_minLength_6= RULE_INT
                    {
                    lv_minLength_6=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringProperty2676); 

                    		createLeafNode(grammarAccess.getStringPropertyAccess().getMinLengthINTTerminalRuleCall_4_1_0(), "minLength"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "minLength", lv_minLength_6, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1357:4: ( 'maxlength' (lv_maxLength_8= RULE_INT ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1357:5: 'maxlength' (lv_maxLength_8= RULE_INT )
                    {
                    match(input,35,FOLLOW_35_in_ruleStringProperty2696); 

                            createLeafNode(grammarAccess.getStringPropertyAccess().getMaxlengthKeyword_5_0(), null); 
                        
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1361:1: (lv_maxLength_8= RULE_INT )
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1363:6: lv_maxLength_8= RULE_INT
                    {
                    lv_maxLength_8=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringProperty2718); 

                    		createLeafNode(grammarAccess.getStringPropertyAccess().getMaxLengthINTTerminalRuleCall_5_1_0(), "maxLength"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "maxLength", lv_maxLength_8, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1381:4: ( 'regexp' (lv_regularExpression_10= RULE_STRING ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1381:5: 'regexp' (lv_regularExpression_10= RULE_STRING )
                    {
                    match(input,36,FOLLOW_36_in_ruleStringProperty2738); 

                            createLeafNode(grammarAccess.getStringPropertyAccess().getRegexpKeyword_6_0(), null); 
                        
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1385:1: (lv_regularExpression_10= RULE_STRING )
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1387:6: lv_regularExpression_10= RULE_STRING
                    {
                    lv_regularExpression_10=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringProperty2760); 

                    		createLeafNode(grammarAccess.getStringPropertyAccess().getRegularExpressionSTRINGTerminalRuleCall_6_1_0(), "regularExpression"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "regularExpression", lv_regularExpression_10, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

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
    // $ANTLR end ruleStringProperty


    // $ANTLR start entryRuleDateTimeProperty
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1412:1: entryRuleDateTimeProperty returns [EObject current=null] : iv_ruleDateTimeProperty= ruleDateTimeProperty EOF ;
    public final EObject entryRuleDateTimeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimeProperty = null;


        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1412:58: (iv_ruleDateTimeProperty= ruleDateTimeProperty EOF )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1413:2: iv_ruleDateTimeProperty= ruleDateTimeProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDateTimePropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDateTimeProperty_in_entryRuleDateTimeProperty2803);
            iv_ruleDateTimeProperty=ruleDateTimeProperty();
            _fsp--;

             current =iv_ruleDateTimeProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeProperty2813); 

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
    // $ANTLR end entryRuleDateTimeProperty


    // $ANTLR start ruleDateTimeProperty
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1420:1: ruleDateTimeProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ) ;
    public final EObject ruleDateTimeProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;
        Token lv_hasDefault_3=null;
        Token lv_defaultValue_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1425:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ) )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1426:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? )
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1426:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1426:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )?
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1426:2: (lv_description_0= RULE_STRING )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1428:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDateTimeProperty2860); 

                    		createLeafNode(grammarAccess.getDateTimePropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDateTimePropertyRule().getType().getClassifier());
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

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1446:3: (lv_dataType_1= 'datetime' )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1448:6: lv_dataType_1= 'datetime'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,37,FOLLOW_37_in_ruleDateTimeProperty2890); 

                    createLeafNode(grammarAccess.getDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDateTimePropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "datetime", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1467:2: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1469:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDateTimeProperty2925); 

            		createLeafNode(grammarAccess.getDateTimePropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDateTimePropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1487:2: ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1487:3: (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1487:3: (lv_hasDefault_3= 'default' )
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1489:6: lv_hasDefault_3= 'default'
                    {
                    lv_hasDefault_3=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleDateTimeProperty2955); 

                            createLeafNode(grammarAccess.getDateTimePropertyAccess().getHasDefaultDefaultKeyword_3_0_0(), "hasDefault"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDateTimePropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hasDefault", true, "default", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1508:2: (lv_defaultValue_4= RULE_STRING )
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1510:6: lv_defaultValue_4= RULE_STRING
                    {
                    lv_defaultValue_4=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDateTimeProperty2990); 

                    		createLeafNode(grammarAccess.getDateTimePropertyAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0(), "defaultValue"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDateTimePropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "defaultValue", lv_defaultValue_4, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

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
    // $ANTLR end ruleDateTimeProperty


    // $ANTLR start entryRuleIntegerProperty
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1535:1: entryRuleIntegerProperty returns [EObject current=null] : iv_ruleIntegerProperty= ruleIntegerProperty EOF ;
    public final EObject entryRuleIntegerProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerProperty = null;


        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1535:57: (iv_ruleIntegerProperty= ruleIntegerProperty EOF )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1536:2: iv_ruleIntegerProperty= ruleIntegerProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntegerPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntegerProperty_in_entryRuleIntegerProperty3033);
            iv_ruleIntegerProperty=ruleIntegerProperty();
            _fsp--;

             current =iv_ruleIntegerProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerProperty3043); 

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
    // $ANTLR end entryRuleIntegerProperty


    // $ANTLR start ruleIntegerProperty
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1543:1: ruleIntegerProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT ) )? ( 'min' (lv_minValue_6= RULE_INT ) )? ( 'max' (lv_maxValue_8= RULE_INT ) )? ) ;
    public final EObject ruleIntegerProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;
        Token lv_hasDefault_3=null;
        Token lv_defaultValue_4=null;
        Token lv_minValue_6=null;
        Token lv_maxValue_8=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1548:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT ) )? ( 'min' (lv_minValue_6= RULE_INT ) )? ( 'max' (lv_maxValue_8= RULE_INT ) )? ) )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1549:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT ) )? ( 'min' (lv_minValue_6= RULE_INT ) )? ( 'max' (lv_maxValue_8= RULE_INT ) )? )
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1549:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT ) )? ( 'min' (lv_minValue_6= RULE_INT ) )? ( 'max' (lv_maxValue_8= RULE_INT ) )? )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1549:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT ) )? ( 'min' (lv_minValue_6= RULE_INT ) )? ( 'max' (lv_maxValue_8= RULE_INT ) )?
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1549:2: (lv_description_0= RULE_STRING )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1551:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIntegerProperty3090); 

                    		createLeafNode(grammarAccess.getIntegerPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerPropertyRule().getType().getClassifier());
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

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1569:3: (lv_dataType_1= 'integer' )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1571:6: lv_dataType_1= 'integer'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,38,FOLLOW_38_in_ruleIntegerProperty3120); 

                    createLeafNode(grammarAccess.getIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIntegerPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "integer", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1590:2: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1592:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerProperty3155); 

            		createLeafNode(grammarAccess.getIntegerPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIntegerPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1610:2: ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1610:3: (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1610:3: (lv_hasDefault_3= 'default' )
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1612:6: lv_hasDefault_3= 'default'
                    {
                    lv_hasDefault_3=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleIntegerProperty3185); 

                            createLeafNode(grammarAccess.getIntegerPropertyAccess().getHasDefaultDefaultKeyword_3_0_0(), "hasDefault"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hasDefault", true, "default", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1631:2: (lv_defaultValue_4= RULE_INT )
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1633:6: lv_defaultValue_4= RULE_INT
                    {
                    lv_defaultValue_4=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerProperty3220); 

                    		createLeafNode(grammarAccess.getIntegerPropertyAccess().getDefaultValueINTTerminalRuleCall_3_1_0(), "defaultValue"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "defaultValue", lv_defaultValue_4, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1651:4: ( 'min' (lv_minValue_6= RULE_INT ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1651:5: 'min' (lv_minValue_6= RULE_INT )
                    {
                    match(input,39,FOLLOW_39_in_ruleIntegerProperty3240); 

                            createLeafNode(grammarAccess.getIntegerPropertyAccess().getMinKeyword_4_0(), null); 
                        
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1655:1: (lv_minValue_6= RULE_INT )
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1657:6: lv_minValue_6= RULE_INT
                    {
                    lv_minValue_6=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerProperty3262); 

                    		createLeafNode(grammarAccess.getIntegerPropertyAccess().getMinValueINTTerminalRuleCall_4_1_0(), "minValue"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "minValue", lv_minValue_6, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1675:4: ( 'max' (lv_maxValue_8= RULE_INT ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1675:5: 'max' (lv_maxValue_8= RULE_INT )
                    {
                    match(input,40,FOLLOW_40_in_ruleIntegerProperty3282); 

                            createLeafNode(grammarAccess.getIntegerPropertyAccess().getMaxKeyword_5_0(), null); 
                        
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1679:1: (lv_maxValue_8= RULE_INT )
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1681:6: lv_maxValue_8= RULE_INT
                    {
                    lv_maxValue_8=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerProperty3304); 

                    		createLeafNode(grammarAccess.getIntegerPropertyAccess().getMaxValueINTTerminalRuleCall_5_1_0(), "maxValue"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "maxValue", lv_maxValue_8, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

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
    // $ANTLR end ruleIntegerProperty


    // $ANTLR start entryRuleDecimalProperty
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1706:1: entryRuleDecimalProperty returns [EObject current=null] : iv_ruleDecimalProperty= ruleDecimalProperty EOF ;
    public final EObject entryRuleDecimalProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalProperty = null;


        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1706:57: (iv_ruleDecimalProperty= ruleDecimalProperty EOF )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1707:2: iv_ruleDecimalProperty= ruleDecimalProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDecimalPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDecimalProperty_in_entryRuleDecimalProperty3347);
            iv_ruleDecimalProperty=ruleDecimalProperty();
            _fsp--;

             current =iv_ruleDecimalProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalProperty3357); 

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
    // $ANTLR end entryRuleDecimalProperty


    // $ANTLR start ruleDecimalProperty
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1714:1: ruleDecimalProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleDecimalProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1719:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) ) )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1720:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1720:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1720:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID )
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1720:2: (lv_description_0= RULE_STRING )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1722:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecimalProperty3404); 

                    		createLeafNode(grammarAccess.getDecimalPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDecimalPropertyRule().getType().getClassifier());
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

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1740:3: (lv_dataType_1= 'decimal' )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1742:6: lv_dataType_1= 'decimal'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,41,FOLLOW_41_in_ruleDecimalProperty3434); 

                    createLeafNode(grammarAccess.getDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDecimalPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "decimal", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1761:2: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1763:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecimalProperty3469); 

            		createLeafNode(grammarAccess.getDecimalPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDecimalPropertyRule().getType().getClassifier());
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
    // $ANTLR end ruleDecimalProperty


    // $ANTLR start entryRuleEnumerationProperty
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1788:1: entryRuleEnumerationProperty returns [EObject current=null] : iv_ruleEnumerationProperty= ruleEnumerationProperty EOF ;
    public final EObject entryRuleEnumerationProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationProperty = null;


        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1788:61: (iv_ruleEnumerationProperty= ruleEnumerationProperty EOF )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1789:2: iv_ruleEnumerationProperty= ruleEnumerationProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumerationProperty_in_entryRuleEnumerationProperty3510);
            iv_ruleEnumerationProperty=ruleEnumerationProperty();
            _fsp--;

             current =iv_ruleEnumerationProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationProperty3520); 

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
    // $ANTLR end entryRuleEnumerationProperty


    // $ANTLR start ruleEnumerationProperty
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1796:1: ruleEnumerationProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID ) )? ) ;
    public final EObject ruleEnumerationProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_hasDefault_3=null;
        Token lv_defaultValueAsString_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1801:6: ( ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID ) )? ) )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1802:1: ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID ) )? )
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1802:1: ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID ) )? )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1802:2: (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID ) )?
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1802:2: (lv_description_0= RULE_STRING )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1804:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumerationProperty3567); 

                    		createLeafNode(grammarAccess.getEnumerationPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEnumerationPropertyRule().getType().getClassifier());
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

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1822:3: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1825:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationProperty3598); 

            		createLeafNode(grammarAccess.getEnumerationPropertyAccess().getTypeEnumerationCrossReference_1_0(), "type"); 
            	

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1838:2: (lv_name_2= RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1840:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationProperty3623); 

            		createLeafNode(grammarAccess.getEnumerationPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1858:2: ( (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==30) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1858:3: (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1858:3: (lv_hasDefault_3= 'default' )
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1860:6: lv_hasDefault_3= 'default'
                    {
                    lv_hasDefault_3=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleEnumerationProperty3653); 

                            createLeafNode(grammarAccess.getEnumerationPropertyAccess().getHasDefaultDefaultKeyword_3_0_0(), "hasDefault"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEnumerationPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hasDefault", true, "default", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1879:2: (lv_defaultValueAsString_4= RULE_ID )
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1881:6: lv_defaultValueAsString_4= RULE_ID
                    {
                    lv_defaultValueAsString_4=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationProperty3688); 

                    		createLeafNode(grammarAccess.getEnumerationPropertyAccess().getDefaultValueAsStringIDTerminalRuleCall_3_1_0(), "defaultValueAsString"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEnumerationPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "defaultValueAsString", lv_defaultValueAsString_4, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

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
    // $ANTLR end ruleEnumerationProperty


    // $ANTLR start ruleMultiplicity
    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1906:1: ruleMultiplicity returns [Enumerator current=null] : ( ( 'many' ) | ( 'one' ) ) ;
    public final Enumerator ruleMultiplicity() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1910:6: ( ( ( 'many' ) | ( 'one' ) ) )
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1911:1: ( ( 'many' ) | ( 'one' ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1911:1: ( ( 'many' ) | ( 'one' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            else if ( (LA38_0==43) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1911:1: ( ( 'many' ) | ( 'one' ) )", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1911:2: ( 'many' )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1911:2: ( 'many' )
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1911:4: 'many'
                    {
                    match(input,42,FOLLOW_42_in_ruleMultiplicity3745); 

                            current = grammarAccess.getMultiplicityAccess().getZeroManyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMultiplicityAccess().getZeroManyEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1917:6: ( 'one' )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1917:6: ( 'one' )
                    // ../org.mendix.dsl.businessdomain.xtext/src-gen/org/mendix/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1917:8: 'one'
                    {
                    match(input,43,FOLLOW_43_in_ruleMultiplicity3760); 

                            current = grammarAccess.getMultiplicityAccess().getZeroOneEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMultiplicityAccess().getZeroOneEnumLiteralDeclaration_1(), null); 
                        

                    }


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
    // $ANTLR end ruleMultiplicity


 

    public static final BitSet FOLLOW_ruleBusinessDomainModel_in_entryRuleBusinessDomainModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessDomainModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBusinessDomainModel130 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleBusinessDomainModel148 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessDomainModel170 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBusinessDomainModel187 = new BitSet(new long[]{0x0000000000422012L});
    public static final BitSet FOLLOW_ruleBusinessClass_in_ruleBusinessDomainModel222 = new BitSet(new long[]{0x0000000000422012L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleBusinessDomainModel266 = new BitSet(new long[]{0x0000000000422012L});
    public static final BitSet FOLLOW_ruleAssociation_in_ruleBusinessDomainModel310 = new BitSet(new long[]{0x0000000000422012L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssociation406 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAssociation424 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation446 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation471 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleAssociation513 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleAssociation539 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_15_in_ruleAssociation567 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleAssociation602 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation628 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation653 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_16_in_ruleAssociation682 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssociation705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClass_in_entryRuleBusinessClass738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClass748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBusinessClass795 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBusinessClass813 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClass835 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleBusinessClass853 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClass875 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBusinessClass889 = new BitSet(new long[]{0x0000026220300030L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleBusinessClass923 = new BitSet(new long[]{0x0000026220300030L});
    public static final BitSet FOLLOW_20_in_ruleBusinessClass938 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBusinessClass947 = new BitSet(new long[]{0x0000000001200030L});
    public static final BitSet FOLLOW_ruleAbstractBusinessRule_in_ruleBusinessClass981 = new BitSet(new long[]{0x0000000001200030L});
    public static final BitSet FOLLOW_21_in_ruleBusinessClass995 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBusinessClass1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumeration1096 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEnumeration1114 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration1136 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEnumeration1153 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration1187 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_21_in_ruleEnumeration1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteral1291 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEnumerationLiteral1309 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumerationLiteral1331 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnumerationLiteral1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractBusinessRule_in_entryRuleAbstractBusinessRule1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractBusinessRule1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_ruleAbstractBusinessRule1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueRule_in_ruleAbstractBusinessRule1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule1498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessRule1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBusinessRule1555 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessRule1586 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBusinessRule1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueRule_in_entryRuleUniqueRule1636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueRule1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUniqueRule1693 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleUniqueRule1711 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueRule1733 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUniqueRule1750 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueRule1772 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_ruleUniqueRule1785 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueRule1807 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleUniqueRule1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolProperty_in_ruleProperty1912 = new BitSet(new long[]{0x000000000C001000L});
    public static final BitSet FOLLOW_ruleStringProperty_in_ruleProperty1939 = new BitSet(new long[]{0x000000000C001000L});
    public static final BitSet FOLLOW_ruleDateTimeProperty_in_ruleProperty1966 = new BitSet(new long[]{0x000000000C001000L});
    public static final BitSet FOLLOW_ruleIntegerProperty_in_ruleProperty1993 = new BitSet(new long[]{0x000000000C001000L});
    public static final BitSet FOLLOW_ruleDecimalProperty_in_ruleProperty2020 = new BitSet(new long[]{0x000000000C001000L});
    public static final BitSet FOLLOW_ruleEnumerationProperty_in_ruleProperty2047 = new BitSet(new long[]{0x000000000C001000L});
    public static final BitSet FOLLOW_26_in_ruleProperty2068 = new BitSet(new long[]{0x0000000008001000L});
    public static final BitSet FOLLOW_27_in_ruleProperty2104 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_28_in_ruleProperty2138 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProperty2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolProperty_in_entryRuleBoolProperty2196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolProperty2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBoolProperty2253 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleBoolProperty2283 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBoolProperty2318 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleBoolProperty2348 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_ruleBoolProperty2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBoolProperty2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringProperty_in_entryRuleStringProperty2447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringProperty2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringProperty2504 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleStringProperty2534 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringProperty2569 = new BitSet(new long[]{0x0000001C40000002L});
    public static final BitSet FOLLOW_30_in_ruleStringProperty2599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringProperty2634 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_34_in_ruleStringProperty2654 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringProperty2676 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_35_in_ruleStringProperty2696 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringProperty2718 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleStringProperty2738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringProperty2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeProperty_in_entryRuleDateTimeProperty2803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeProperty2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDateTimeProperty2860 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDateTimeProperty2890 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDateTimeProperty2925 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleDateTimeProperty2955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDateTimeProperty2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerProperty_in_entryRuleIntegerProperty3033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerProperty3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIntegerProperty3090 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleIntegerProperty3120 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerProperty3155 = new BitSet(new long[]{0x0000018040000002L});
    public static final BitSet FOLLOW_30_in_ruleIntegerProperty3185 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerProperty3220 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_39_in_ruleIntegerProperty3240 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerProperty3262 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleIntegerProperty3282 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerProperty3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalProperty_in_entryRuleDecimalProperty3347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalProperty3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecimalProperty3404 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleDecimalProperty3434 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecimalProperty3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationProperty_in_entryRuleEnumerationProperty3510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationProperty3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumerationProperty3567 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationProperty3598 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationProperty3623 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleEnumerationProperty3653 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationProperty3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleMultiplicity3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleMultiplicity3760 = new BitSet(new long[]{0x0000000000000002L});

}