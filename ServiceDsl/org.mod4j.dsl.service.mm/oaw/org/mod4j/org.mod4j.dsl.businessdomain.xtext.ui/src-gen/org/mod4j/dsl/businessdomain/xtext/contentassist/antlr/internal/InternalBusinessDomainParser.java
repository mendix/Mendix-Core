package org.mendix.dsl.businessdomain.xtext.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.mendix.dsl.businessdomain.xtext.services.BusinessDomainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalBusinessDomainParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'->'", "'false'", "'many'", "'one'", "'domain'", "';'", "'association'", "'class'", "'['", "']'", "'inherits'", "'rules'", "'enumeration'", "'='", "'unique'", "','", "'minlength'", "'maxlength'", "'regexp'", "'min'", "'max'", "'<->'", "'ordered'", "'nullable'", "'derived'", "'writable'", "'boolean'", "'default'", "'true'", "'string'", "'datetime'", "'integer'", "'decimal'"
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
    public String getGrammarFileName() { return "../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g"; }


     
     	private BusinessDomainGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BusinessDomainGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleBusinessDomainModel
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:60:1: entryRuleBusinessDomainModel : ruleBusinessDomainModel EOF ;
    public final void entryRuleBusinessDomainModel() throws RecognitionException {
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:60:30: ( ruleBusinessDomainModel EOF )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:61:1: ruleBusinessDomainModel EOF
            {
             before(grammarAccess.getBusinessDomainModelRule()); 
            pushFollow(FOLLOW_ruleBusinessDomainModel_in_entryRuleBusinessDomainModel60);
            ruleBusinessDomainModel();
            _fsp--;

             after(grammarAccess.getBusinessDomainModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessDomainModel67); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBusinessDomainModel


    // $ANTLR start ruleBusinessDomainModel
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:68:1: ruleBusinessDomainModel : ( ( rule__BusinessDomainModel__Group__0 ) ) ;
    public final void ruleBusinessDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:72:2: ( ( ( rule__BusinessDomainModel__Group__0 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:73:1: ( ( rule__BusinessDomainModel__Group__0 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:73:1: ( ( rule__BusinessDomainModel__Group__0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:74:1: ( rule__BusinessDomainModel__Group__0 )
            {
             before(grammarAccess.getBusinessDomainModelAccess().getGroup()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:75:1: ( rule__BusinessDomainModel__Group__0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:75:2: rule__BusinessDomainModel__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessDomainModel__Group__0_in_ruleBusinessDomainModel94);
            rule__BusinessDomainModel__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBusinessDomainModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBusinessDomainModel


    // $ANTLR start entryRuleAssociation
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:87:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:87:22: ( ruleAssociation EOF )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:88:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation120);
            ruleAssociation();
            _fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation127); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAssociation


    // $ANTLR start ruleAssociation
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:95:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:99:2: ( ( ( rule__Association__Group__0 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:100:1: ( ( rule__Association__Group__0 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:100:1: ( ( rule__Association__Group__0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:101:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:102:1: ( rule__Association__Group__0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:102:2: rule__Association__Group__0
            {
            pushFollow(FOLLOW_rule__Association__Group__0_in_ruleAssociation154);
            rule__Association__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAssociation


    // $ANTLR start entryRuleBusinessClass
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:114:1: entryRuleBusinessClass : ruleBusinessClass EOF ;
    public final void entryRuleBusinessClass() throws RecognitionException {
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:114:24: ( ruleBusinessClass EOF )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:115:1: ruleBusinessClass EOF
            {
             before(grammarAccess.getBusinessClassRule()); 
            pushFollow(FOLLOW_ruleBusinessClass_in_entryRuleBusinessClass180);
            ruleBusinessClass();
            _fsp--;

             after(grammarAccess.getBusinessClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClass187); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBusinessClass


    // $ANTLR start ruleBusinessClass
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:122:1: ruleBusinessClass : ( ( rule__BusinessClass__Group__0 ) ) ;
    public final void ruleBusinessClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:126:2: ( ( ( rule__BusinessClass__Group__0 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:127:1: ( ( rule__BusinessClass__Group__0 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:127:1: ( ( rule__BusinessClass__Group__0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:128:1: ( rule__BusinessClass__Group__0 )
            {
             before(grammarAccess.getBusinessClassAccess().getGroup()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:129:1: ( rule__BusinessClass__Group__0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:129:2: rule__BusinessClass__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessClass__Group__0_in_ruleBusinessClass214);
            rule__BusinessClass__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBusinessClass


    // $ANTLR start entryRuleEnumeration
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:141:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:141:22: ( ruleEnumeration EOF )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:142:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration240);
            ruleEnumeration();
            _fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration247); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEnumeration


    // $ANTLR start ruleEnumeration
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:149:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:153:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:154:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:154:1: ( ( rule__Enumeration__Group__0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:155:1: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:156:1: ( rule__Enumeration__Group__0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:156:2: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration274);
            rule__Enumeration__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumeration


    // $ANTLR start entryRuleEnumerationLiteral
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:168:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:168:29: ( ruleEnumerationLiteral EOF )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:169:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral300);
            ruleEnumerationLiteral();
            _fsp--;

             after(grammarAccess.getEnumerationLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral307); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEnumerationLiteral


    // $ANTLR start ruleEnumerationLiteral
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:176:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:180:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:181:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:181:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:182:1: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:183:1: ( rule__EnumerationLiteral__Group__0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:183:2: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral334);
            rule__EnumerationLiteral__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumerationLiteral


    // $ANTLR start entryRuleAbstractBusinessRule
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:195:1: entryRuleAbstractBusinessRule : ruleAbstractBusinessRule EOF ;
    public final void entryRuleAbstractBusinessRule() throws RecognitionException {
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:195:31: ( ruleAbstractBusinessRule EOF )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:196:1: ruleAbstractBusinessRule EOF
            {
             before(grammarAccess.getAbstractBusinessRuleRule()); 
            pushFollow(FOLLOW_ruleAbstractBusinessRule_in_entryRuleAbstractBusinessRule360);
            ruleAbstractBusinessRule();
            _fsp--;

             after(grammarAccess.getAbstractBusinessRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractBusinessRule367); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAbstractBusinessRule


    // $ANTLR start ruleAbstractBusinessRule
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:203:1: ruleAbstractBusinessRule : ( ( rule__AbstractBusinessRule__Alternatives ) ) ;
    public final void ruleAbstractBusinessRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:207:2: ( ( ( rule__AbstractBusinessRule__Alternatives ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:208:1: ( ( rule__AbstractBusinessRule__Alternatives ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:208:1: ( ( rule__AbstractBusinessRule__Alternatives ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:209:1: ( rule__AbstractBusinessRule__Alternatives )
            {
             before(grammarAccess.getAbstractBusinessRuleAccess().getAlternatives()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:210:1: ( rule__AbstractBusinessRule__Alternatives )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:210:2: rule__AbstractBusinessRule__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractBusinessRule__Alternatives_in_ruleAbstractBusinessRule394);
            rule__AbstractBusinessRule__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getAbstractBusinessRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAbstractBusinessRule


    // $ANTLR start entryRuleBusinessRule
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:222:1: entryRuleBusinessRule : ruleBusinessRule EOF ;
    public final void entryRuleBusinessRule() throws RecognitionException {
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:222:23: ( ruleBusinessRule EOF )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:223:1: ruleBusinessRule EOF
            {
             before(grammarAccess.getBusinessRuleRule()); 
            pushFollow(FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule420);
            ruleBusinessRule();
            _fsp--;

             after(grammarAccess.getBusinessRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessRule427); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBusinessRule


    // $ANTLR start ruleBusinessRule
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:230:1: ruleBusinessRule : ( ( rule__BusinessRule__Group__0 ) ) ;
    public final void ruleBusinessRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:234:2: ( ( ( rule__BusinessRule__Group__0 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:235:1: ( ( rule__BusinessRule__Group__0 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:235:1: ( ( rule__BusinessRule__Group__0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:236:1: ( rule__BusinessRule__Group__0 )
            {
             before(grammarAccess.getBusinessRuleAccess().getGroup()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:237:1: ( rule__BusinessRule__Group__0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:237:2: rule__BusinessRule__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__0_in_ruleBusinessRule454);
            rule__BusinessRule__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBusinessRule


    // $ANTLR start entryRuleUniqueRule
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:249:1: entryRuleUniqueRule : ruleUniqueRule EOF ;
    public final void entryRuleUniqueRule() throws RecognitionException {
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:249:21: ( ruleUniqueRule EOF )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:250:1: ruleUniqueRule EOF
            {
             before(grammarAccess.getUniqueRuleRule()); 
            pushFollow(FOLLOW_ruleUniqueRule_in_entryRuleUniqueRule480);
            ruleUniqueRule();
            _fsp--;

             after(grammarAccess.getUniqueRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueRule487); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleUniqueRule


    // $ANTLR start ruleUniqueRule
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:257:1: ruleUniqueRule : ( ( rule__UniqueRule__Group__0 ) ) ;
    public final void ruleUniqueRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:261:2: ( ( ( rule__UniqueRule__Group__0 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:262:1: ( ( rule__UniqueRule__Group__0 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:262:1: ( ( rule__UniqueRule__Group__0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:263:1: ( rule__UniqueRule__Group__0 )
            {
             before(grammarAccess.getUniqueRuleAccess().getGroup()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:264:1: ( rule__UniqueRule__Group__0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:264:2: rule__UniqueRule__Group__0
            {
            pushFollow(FOLLOW_rule__UniqueRule__Group__0_in_ruleUniqueRule514);
            rule__UniqueRule__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUniqueRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUniqueRule


    // $ANTLR start entryRuleProperty
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:276:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:276:19: ( ruleProperty EOF )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:277:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty540);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty547); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:284:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:288:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:289:1: ( ( rule__Property__Group__0 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:289:1: ( ( rule__Property__Group__0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:290:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:291:1: ( rule__Property__Group__0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:291:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty574);
            rule__Property__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProperty


    // $ANTLR start entryRuleBoolProperty
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:303:1: entryRuleBoolProperty : ruleBoolProperty EOF ;
    public final void entryRuleBoolProperty() throws RecognitionException {
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:303:23: ( ruleBoolProperty EOF )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:304:1: ruleBoolProperty EOF
            {
             before(grammarAccess.getBoolPropertyRule()); 
            pushFollow(FOLLOW_ruleBoolProperty_in_entryRuleBoolProperty600);
            ruleBoolProperty();
            _fsp--;

             after(grammarAccess.getBoolPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolProperty607); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBoolProperty


    // $ANTLR start ruleBoolProperty
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:311:1: ruleBoolProperty : ( ( rule__BoolProperty__Group__0 ) ) ;
    public final void ruleBoolProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:315:2: ( ( ( rule__BoolProperty__Group__0 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:316:1: ( ( rule__BoolProperty__Group__0 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:316:1: ( ( rule__BoolProperty__Group__0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:317:1: ( rule__BoolProperty__Group__0 )
            {
             before(grammarAccess.getBoolPropertyAccess().getGroup()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:318:1: ( rule__BoolProperty__Group__0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:318:2: rule__BoolProperty__Group__0
            {
            pushFollow(FOLLOW_rule__BoolProperty__Group__0_in_ruleBoolProperty634);
            rule__BoolProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBoolPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBoolProperty


    // $ANTLR start entryRuleStringProperty
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:330:1: entryRuleStringProperty : ruleStringProperty EOF ;
    public final void entryRuleStringProperty() throws RecognitionException {
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:330:25: ( ruleStringProperty EOF )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:331:1: ruleStringProperty EOF
            {
             before(grammarAccess.getStringPropertyRule()); 
            pushFollow(FOLLOW_ruleStringProperty_in_entryRuleStringProperty660);
            ruleStringProperty();
            _fsp--;

             after(grammarAccess.getStringPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringProperty667); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStringProperty


    // $ANTLR start ruleStringProperty
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:338:1: ruleStringProperty : ( ( rule__StringProperty__Group__0 ) ) ;
    public final void ruleStringProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:342:2: ( ( ( rule__StringProperty__Group__0 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:343:1: ( ( rule__StringProperty__Group__0 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:343:1: ( ( rule__StringProperty__Group__0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:344:1: ( rule__StringProperty__Group__0 )
            {
             before(grammarAccess.getStringPropertyAccess().getGroup()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:345:1: ( rule__StringProperty__Group__0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:345:2: rule__StringProperty__Group__0
            {
            pushFollow(FOLLOW_rule__StringProperty__Group__0_in_ruleStringProperty694);
            rule__StringProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStringProperty


    // $ANTLR start entryRuleDateTimeProperty
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:357:1: entryRuleDateTimeProperty : ruleDateTimeProperty EOF ;
    public final void entryRuleDateTimeProperty() throws RecognitionException {
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:357:27: ( ruleDateTimeProperty EOF )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:358:1: ruleDateTimeProperty EOF
            {
             before(grammarAccess.getDateTimePropertyRule()); 
            pushFollow(FOLLOW_ruleDateTimeProperty_in_entryRuleDateTimeProperty720);
            ruleDateTimeProperty();
            _fsp--;

             after(grammarAccess.getDateTimePropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeProperty727); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDateTimeProperty


    // $ANTLR start ruleDateTimeProperty
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:365:1: ruleDateTimeProperty : ( ( rule__DateTimeProperty__Group__0 ) ) ;
    public final void ruleDateTimeProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:369:2: ( ( ( rule__DateTimeProperty__Group__0 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:370:1: ( ( rule__DateTimeProperty__Group__0 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:370:1: ( ( rule__DateTimeProperty__Group__0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:371:1: ( rule__DateTimeProperty__Group__0 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getGroup()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:372:1: ( rule__DateTimeProperty__Group__0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:372:2: rule__DateTimeProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DateTimeProperty__Group__0_in_ruleDateTimeProperty754);
            rule__DateTimeProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDateTimePropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDateTimeProperty


    // $ANTLR start entryRuleIntegerProperty
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:384:1: entryRuleIntegerProperty : ruleIntegerProperty EOF ;
    public final void entryRuleIntegerProperty() throws RecognitionException {
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:384:26: ( ruleIntegerProperty EOF )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:385:1: ruleIntegerProperty EOF
            {
             before(grammarAccess.getIntegerPropertyRule()); 
            pushFollow(FOLLOW_ruleIntegerProperty_in_entryRuleIntegerProperty780);
            ruleIntegerProperty();
            _fsp--;

             after(grammarAccess.getIntegerPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerProperty787); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleIntegerProperty


    // $ANTLR start ruleIntegerProperty
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:392:1: ruleIntegerProperty : ( ( rule__IntegerProperty__Group__0 ) ) ;
    public final void ruleIntegerProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:396:2: ( ( ( rule__IntegerProperty__Group__0 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:397:1: ( ( rule__IntegerProperty__Group__0 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:397:1: ( ( rule__IntegerProperty__Group__0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:398:1: ( rule__IntegerProperty__Group__0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:399:1: ( rule__IntegerProperty__Group__0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:399:2: rule__IntegerProperty__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerProperty__Group__0_in_ruleIntegerProperty814);
            rule__IntegerProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleIntegerProperty


    // $ANTLR start entryRuleDecimalProperty
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:411:1: entryRuleDecimalProperty : ruleDecimalProperty EOF ;
    public final void entryRuleDecimalProperty() throws RecognitionException {
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:411:26: ( ruleDecimalProperty EOF )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:412:1: ruleDecimalProperty EOF
            {
             before(grammarAccess.getDecimalPropertyRule()); 
            pushFollow(FOLLOW_ruleDecimalProperty_in_entryRuleDecimalProperty840);
            ruleDecimalProperty();
            _fsp--;

             after(grammarAccess.getDecimalPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalProperty847); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDecimalProperty


    // $ANTLR start ruleDecimalProperty
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:419:1: ruleDecimalProperty : ( ( rule__DecimalProperty__Group__0 ) ) ;
    public final void ruleDecimalProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:423:2: ( ( ( rule__DecimalProperty__Group__0 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:424:1: ( ( rule__DecimalProperty__Group__0 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:424:1: ( ( rule__DecimalProperty__Group__0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:425:1: ( rule__DecimalProperty__Group__0 )
            {
             before(grammarAccess.getDecimalPropertyAccess().getGroup()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:426:1: ( rule__DecimalProperty__Group__0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:426:2: rule__DecimalProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DecimalProperty__Group__0_in_ruleDecimalProperty874);
            rule__DecimalProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDecimalPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDecimalProperty


    // $ANTLR start entryRuleEnumerationProperty
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:438:1: entryRuleEnumerationProperty : ruleEnumerationProperty EOF ;
    public final void entryRuleEnumerationProperty() throws RecognitionException {
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:438:30: ( ruleEnumerationProperty EOF )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:439:1: ruleEnumerationProperty EOF
            {
             before(grammarAccess.getEnumerationPropertyRule()); 
            pushFollow(FOLLOW_ruleEnumerationProperty_in_entryRuleEnumerationProperty900);
            ruleEnumerationProperty();
            _fsp--;

             after(grammarAccess.getEnumerationPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationProperty907); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEnumerationProperty


    // $ANTLR start ruleEnumerationProperty
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:446:1: ruleEnumerationProperty : ( ( rule__EnumerationProperty__Group__0 ) ) ;
    public final void ruleEnumerationProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:450:2: ( ( ( rule__EnumerationProperty__Group__0 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:451:1: ( ( rule__EnumerationProperty__Group__0 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:451:1: ( ( rule__EnumerationProperty__Group__0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:452:1: ( rule__EnumerationProperty__Group__0 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getGroup()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:453:1: ( rule__EnumerationProperty__Group__0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:453:2: rule__EnumerationProperty__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationProperty__Group__0_in_ruleEnumerationProperty934);
            rule__EnumerationProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumerationProperty


    // $ANTLR start ruleMultiplicity
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:466:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:470:1: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:471:1: ( ( rule__Multiplicity__Alternatives ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:471:1: ( ( rule__Multiplicity__Alternatives ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:472:1: ( rule__Multiplicity__Alternatives )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:473:1: ( rule__Multiplicity__Alternatives )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:473:2: rule__Multiplicity__Alternatives
            {
            pushFollow(FOLLOW_rule__Multiplicity__Alternatives_in_ruleMultiplicity971);
            rule__Multiplicity__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMultiplicity


    // $ANTLR start rule__BusinessDomainModel__Alternatives_4
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:488:1: rule__BusinessDomainModel__Alternatives_4 : ( ( ( rule__BusinessDomainModel__TypesAssignment_4_0 ) ) | ( ( rule__BusinessDomainModel__EnumerationsAssignment_4_1 ) ) | ( ( rule__BusinessDomainModel__AssociationsAssignment_4_2 ) ) );
    public final void rule__BusinessDomainModel__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:492:1: ( ( ( rule__BusinessDomainModel__TypesAssignment_4_0 ) ) | ( ( rule__BusinessDomainModel__EnumerationsAssignment_4_1 ) ) | ( ( rule__BusinessDomainModel__AssociationsAssignment_4_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt1=3;
                    }
                    break;
                case 18:
                    {
                    alt1=1;
                    }
                    break;
                case 23:
                    {
                    alt1=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("488:1: rule__BusinessDomainModel__Alternatives_4 : ( ( ( rule__BusinessDomainModel__TypesAssignment_4_0 ) ) | ( ( rule__BusinessDomainModel__EnumerationsAssignment_4_1 ) ) | ( ( rule__BusinessDomainModel__AssociationsAssignment_4_2 ) ) );", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 18:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("488:1: rule__BusinessDomainModel__Alternatives_4 : ( ( ( rule__BusinessDomainModel__TypesAssignment_4_0 ) ) | ( ( rule__BusinessDomainModel__EnumerationsAssignment_4_1 ) ) | ( ( rule__BusinessDomainModel__AssociationsAssignment_4_2 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:493:1: ( ( rule__BusinessDomainModel__TypesAssignment_4_0 ) )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:493:1: ( ( rule__BusinessDomainModel__TypesAssignment_4_0 ) )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:494:1: ( rule__BusinessDomainModel__TypesAssignment_4_0 )
                    {
                     before(grammarAccess.getBusinessDomainModelAccess().getTypesAssignment_4_0()); 
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:495:1: ( rule__BusinessDomainModel__TypesAssignment_4_0 )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:495:2: rule__BusinessDomainModel__TypesAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__BusinessDomainModel__TypesAssignment_4_0_in_rule__BusinessDomainModel__Alternatives_41010);
                    rule__BusinessDomainModel__TypesAssignment_4_0();
                    _fsp--;


                    }

                     after(grammarAccess.getBusinessDomainModelAccess().getTypesAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:499:6: ( ( rule__BusinessDomainModel__EnumerationsAssignment_4_1 ) )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:499:6: ( ( rule__BusinessDomainModel__EnumerationsAssignment_4_1 ) )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:500:1: ( rule__BusinessDomainModel__EnumerationsAssignment_4_1 )
                    {
                     before(grammarAccess.getBusinessDomainModelAccess().getEnumerationsAssignment_4_1()); 
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:501:1: ( rule__BusinessDomainModel__EnumerationsAssignment_4_1 )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:501:2: rule__BusinessDomainModel__EnumerationsAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__BusinessDomainModel__EnumerationsAssignment_4_1_in_rule__BusinessDomainModel__Alternatives_41028);
                    rule__BusinessDomainModel__EnumerationsAssignment_4_1();
                    _fsp--;


                    }

                     after(grammarAccess.getBusinessDomainModelAccess().getEnumerationsAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:505:6: ( ( rule__BusinessDomainModel__AssociationsAssignment_4_2 ) )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:505:6: ( ( rule__BusinessDomainModel__AssociationsAssignment_4_2 ) )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:506:1: ( rule__BusinessDomainModel__AssociationsAssignment_4_2 )
                    {
                     before(grammarAccess.getBusinessDomainModelAccess().getAssociationsAssignment_4_2()); 
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:507:1: ( rule__BusinessDomainModel__AssociationsAssignment_4_2 )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:507:2: rule__BusinessDomainModel__AssociationsAssignment_4_2
                    {
                    pushFollow(FOLLOW_rule__BusinessDomainModel__AssociationsAssignment_4_2_in_rule__BusinessDomainModel__Alternatives_41046);
                    rule__BusinessDomainModel__AssociationsAssignment_4_2();
                    _fsp--;


                    }

                     after(grammarAccess.getBusinessDomainModelAccess().getAssociationsAssignment_4_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__Alternatives_4


    // $ANTLR start rule__Association__Alternatives_5
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:516:1: rule__Association__Alternatives_5 : ( ( ( rule__Association__BidirectionalAssignment_5_0 ) ) | ( '->' ) );
    public final void rule__Association__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:520:1: ( ( ( rule__Association__BidirectionalAssignment_5_0 ) ) | ( '->' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==32) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("516:1: rule__Association__Alternatives_5 : ( ( ( rule__Association__BidirectionalAssignment_5_0 ) ) | ( '->' ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:521:1: ( ( rule__Association__BidirectionalAssignment_5_0 ) )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:521:1: ( ( rule__Association__BidirectionalAssignment_5_0 ) )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:522:1: ( rule__Association__BidirectionalAssignment_5_0 )
                    {
                     before(grammarAccess.getAssociationAccess().getBidirectionalAssignment_5_0()); 
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:523:1: ( rule__Association__BidirectionalAssignment_5_0 )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:523:2: rule__Association__BidirectionalAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__Association__BidirectionalAssignment_5_0_in_rule__Association__Alternatives_51079);
                    rule__Association__BidirectionalAssignment_5_0();
                    _fsp--;


                    }

                     after(grammarAccess.getAssociationAccess().getBidirectionalAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:527:6: ( '->' )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:527:6: ( '->' )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:528:1: '->'
                    {
                     before(grammarAccess.getAssociationAccess().getHyphenMinusGreaterThanSignKeyword_5_1()); 
                    match(input,11,FOLLOW_11_in_rule__Association__Alternatives_51098); 
                     after(grammarAccess.getAssociationAccess().getHyphenMinusGreaterThanSignKeyword_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Alternatives_5


    // $ANTLR start rule__AbstractBusinessRule__Alternatives
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:540:1: rule__AbstractBusinessRule__Alternatives : ( ( ruleBusinessRule ) | ( ruleUniqueRule ) );
    public final void rule__AbstractBusinessRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:544:1: ( ( ruleBusinessRule ) | ( ruleUniqueRule ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    alt3=1;
                }
                else if ( (LA3_1==25) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("540:1: rule__AbstractBusinessRule__Alternatives : ( ( ruleBusinessRule ) | ( ruleUniqueRule ) );", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 25:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("540:1: rule__AbstractBusinessRule__Alternatives : ( ( ruleBusinessRule ) | ( ruleUniqueRule ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:545:1: ( ruleBusinessRule )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:545:1: ( ruleBusinessRule )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:546:1: ruleBusinessRule
                    {
                     before(grammarAccess.getAbstractBusinessRuleAccess().getBusinessRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBusinessRule_in_rule__AbstractBusinessRule__Alternatives1132);
                    ruleBusinessRule();
                    _fsp--;

                     after(grammarAccess.getAbstractBusinessRuleAccess().getBusinessRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:551:6: ( ruleUniqueRule )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:551:6: ( ruleUniqueRule )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:552:1: ruleUniqueRule
                    {
                     before(grammarAccess.getAbstractBusinessRuleAccess().getUniqueRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUniqueRule_in_rule__AbstractBusinessRule__Alternatives1149);
                    ruleUniqueRule();
                    _fsp--;

                     after(grammarAccess.getAbstractBusinessRuleAccess().getUniqueRuleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractBusinessRule__Alternatives


    // $ANTLR start rule__Property__Alternatives_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:562:1: rule__Property__Alternatives_0 : ( ( ruleBoolProperty ) | ( ruleStringProperty ) | ( ruleDateTimeProperty ) | ( ruleIntegerProperty ) | ( ruleDecimalProperty ) | ( ruleEnumerationProperty ) );
    public final void rule__Property__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:566:1: ( ( ruleBoolProperty ) | ( ruleStringProperty ) | ( ruleDateTimeProperty ) | ( ruleIntegerProperty ) | ( ruleDecimalProperty ) | ( ruleEnumerationProperty ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 40:
                    {
                    alt4=2;
                    }
                    break;
                case 37:
                    {
                    alt4=1;
                    }
                    break;
                case 43:
                    {
                    alt4=5;
                    }
                    break;
                case RULE_ID:
                    {
                    alt4=6;
                    }
                    break;
                case 41:
                    {
                    alt4=3;
                    }
                    break;
                case 42:
                    {
                    alt4=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("562:1: rule__Property__Alternatives_0 : ( ( ruleBoolProperty ) | ( ruleStringProperty ) | ( ruleDateTimeProperty ) | ( ruleIntegerProperty ) | ( ruleDecimalProperty ) | ( ruleEnumerationProperty ) );", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case 37:
                {
                alt4=1;
                }
                break;
            case 40:
                {
                alt4=2;
                }
                break;
            case 41:
                {
                alt4=3;
                }
                break;
            case 42:
                {
                alt4=4;
                }
                break;
            case 43:
                {
                alt4=5;
                }
                break;
            case RULE_ID:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("562:1: rule__Property__Alternatives_0 : ( ( ruleBoolProperty ) | ( ruleStringProperty ) | ( ruleDateTimeProperty ) | ( ruleIntegerProperty ) | ( ruleDecimalProperty ) | ( ruleEnumerationProperty ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:567:1: ( ruleBoolProperty )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:567:1: ( ruleBoolProperty )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:568:1: ruleBoolProperty
                    {
                     before(grammarAccess.getPropertyAccess().getBoolPropertyParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleBoolProperty_in_rule__Property__Alternatives_01181);
                    ruleBoolProperty();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getBoolPropertyParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:573:6: ( ruleStringProperty )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:573:6: ( ruleStringProperty )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:574:1: ruleStringProperty
                    {
                     before(grammarAccess.getPropertyAccess().getStringPropertyParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleStringProperty_in_rule__Property__Alternatives_01198);
                    ruleStringProperty();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getStringPropertyParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:579:6: ( ruleDateTimeProperty )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:579:6: ( ruleDateTimeProperty )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:580:1: ruleDateTimeProperty
                    {
                     before(grammarAccess.getPropertyAccess().getDateTimePropertyParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleDateTimeProperty_in_rule__Property__Alternatives_01215);
                    ruleDateTimeProperty();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getDateTimePropertyParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:585:6: ( ruleIntegerProperty )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:585:6: ( ruleIntegerProperty )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:586:1: ruleIntegerProperty
                    {
                     before(grammarAccess.getPropertyAccess().getIntegerPropertyParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleIntegerProperty_in_rule__Property__Alternatives_01232);
                    ruleIntegerProperty();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getIntegerPropertyParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:591:6: ( ruleDecimalProperty )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:591:6: ( ruleDecimalProperty )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:592:1: ruleDecimalProperty
                    {
                     before(grammarAccess.getPropertyAccess().getDecimalPropertyParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleDecimalProperty_in_rule__Property__Alternatives_01249);
                    ruleDecimalProperty();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getDecimalPropertyParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:597:6: ( ruleEnumerationProperty )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:597:6: ( ruleEnumerationProperty )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:598:1: ruleEnumerationProperty
                    {
                     before(grammarAccess.getPropertyAccess().getEnumerationPropertyParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_ruleEnumerationProperty_in_rule__Property__Alternatives_01266);
                    ruleEnumerationProperty();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getEnumerationPropertyParserRuleCall_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Alternatives_0


    // $ANTLR start rule__BoolProperty__Alternatives_3_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:608:1: rule__BoolProperty__Alternatives_3_1 : ( ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) ) | ( 'false' ) );
    public final void rule__BoolProperty__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:612:1: ( ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==39) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("608:1: rule__BoolProperty__Alternatives_3_1 : ( ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) ) | ( 'false' ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:613:1: ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:613:1: ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:614:1: ( rule__BoolProperty__DefaultValueAssignment_3_1_0 )
                    {
                     before(grammarAccess.getBoolPropertyAccess().getDefaultValueAssignment_3_1_0()); 
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:615:1: ( rule__BoolProperty__DefaultValueAssignment_3_1_0 )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:615:2: rule__BoolProperty__DefaultValueAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_rule__BoolProperty__DefaultValueAssignment_3_1_0_in_rule__BoolProperty__Alternatives_3_11298);
                    rule__BoolProperty__DefaultValueAssignment_3_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getBoolPropertyAccess().getDefaultValueAssignment_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:619:6: ( 'false' )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:619:6: ( 'false' )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:620:1: 'false'
                    {
                     before(grammarAccess.getBoolPropertyAccess().getFalseKeyword_3_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__BoolProperty__Alternatives_3_11317); 
                     after(grammarAccess.getBoolPropertyAccess().getFalseKeyword_3_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__Alternatives_3_1


    // $ANTLR start rule__Multiplicity__Alternatives
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:632:1: rule__Multiplicity__Alternatives : ( ( ( 'many' ) ) | ( ( 'one' ) ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:636:1: ( ( ( 'many' ) ) | ( ( 'one' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("632:1: rule__Multiplicity__Alternatives : ( ( ( 'many' ) ) | ( ( 'one' ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:637:1: ( ( 'many' ) )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:637:1: ( ( 'many' ) )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:638:1: ( 'many' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getZeroManyEnumLiteralDeclaration_0()); 
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:639:1: ( 'many' )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:639:3: 'many'
                    {
                    match(input,13,FOLLOW_13_in_rule__Multiplicity__Alternatives1352); 

                    }

                     after(grammarAccess.getMultiplicityAccess().getZeroManyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:644:6: ( ( 'one' ) )
                    {
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:644:6: ( ( 'one' ) )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:645:1: ( 'one' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getZeroOneEnumLiteralDeclaration_1()); 
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:646:1: ( 'one' )
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:646:3: 'one'
                    {
                    match(input,14,FOLLOW_14_in_rule__Multiplicity__Alternatives1373); 

                    }

                     after(grammarAccess.getMultiplicityAccess().getZeroOneEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplicity__Alternatives


    // $ANTLR start rule__BusinessDomainModel__Group__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:660:1: rule__BusinessDomainModel__Group__0 : ( ( rule__BusinessDomainModel__DescriptionAssignment_0 )? ) rule__BusinessDomainModel__Group__1 ;
    public final void rule__BusinessDomainModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:664:1: ( ( ( rule__BusinessDomainModel__DescriptionAssignment_0 )? ) rule__BusinessDomainModel__Group__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:665:1: ( ( rule__BusinessDomainModel__DescriptionAssignment_0 )? ) rule__BusinessDomainModel__Group__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:665:1: ( ( rule__BusinessDomainModel__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:666:1: ( rule__BusinessDomainModel__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBusinessDomainModelAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:667:1: ( rule__BusinessDomainModel__DescriptionAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:667:2: rule__BusinessDomainModel__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BusinessDomainModel__DescriptionAssignment_0_in_rule__BusinessDomainModel__Group__01412);
                    rule__BusinessDomainModel__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessDomainModelAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessDomainModel__Group__1_in_rule__BusinessDomainModel__Group__01422);
            rule__BusinessDomainModel__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__Group__0


    // $ANTLR start rule__BusinessDomainModel__Group__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:678:1: rule__BusinessDomainModel__Group__1 : ( 'domain' ) rule__BusinessDomainModel__Group__2 ;
    public final void rule__BusinessDomainModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:682:1: ( ( 'domain' ) rule__BusinessDomainModel__Group__2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:683:1: ( 'domain' ) rule__BusinessDomainModel__Group__2
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:683:1: ( 'domain' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:684:1: 'domain'
            {
             before(grammarAccess.getBusinessDomainModelAccess().getDomainKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__BusinessDomainModel__Group__11451); 
             after(grammarAccess.getBusinessDomainModelAccess().getDomainKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessDomainModel__Group__2_in_rule__BusinessDomainModel__Group__11461);
            rule__BusinessDomainModel__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__Group__1


    // $ANTLR start rule__BusinessDomainModel__Group__2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:698:1: rule__BusinessDomainModel__Group__2 : ( ( rule__BusinessDomainModel__NameAssignment_2 ) ) rule__BusinessDomainModel__Group__3 ;
    public final void rule__BusinessDomainModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:702:1: ( ( ( rule__BusinessDomainModel__NameAssignment_2 ) ) rule__BusinessDomainModel__Group__3 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:703:1: ( ( rule__BusinessDomainModel__NameAssignment_2 ) ) rule__BusinessDomainModel__Group__3
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:703:1: ( ( rule__BusinessDomainModel__NameAssignment_2 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:704:1: ( rule__BusinessDomainModel__NameAssignment_2 )
            {
             before(grammarAccess.getBusinessDomainModelAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:705:1: ( rule__BusinessDomainModel__NameAssignment_2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:705:2: rule__BusinessDomainModel__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BusinessDomainModel__NameAssignment_2_in_rule__BusinessDomainModel__Group__21489);
            rule__BusinessDomainModel__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessDomainModelAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessDomainModel__Group__3_in_rule__BusinessDomainModel__Group__21498);
            rule__BusinessDomainModel__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__Group__2


    // $ANTLR start rule__BusinessDomainModel__Group__3
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:716:1: rule__BusinessDomainModel__Group__3 : ( ';' ) rule__BusinessDomainModel__Group__4 ;
    public final void rule__BusinessDomainModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:720:1: ( ( ';' ) rule__BusinessDomainModel__Group__4 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:721:1: ( ';' ) rule__BusinessDomainModel__Group__4
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:721:1: ( ';' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:722:1: ';'
            {
             before(grammarAccess.getBusinessDomainModelAccess().getSemicolonKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__BusinessDomainModel__Group__31527); 
             after(grammarAccess.getBusinessDomainModelAccess().getSemicolonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__BusinessDomainModel__Group__4_in_rule__BusinessDomainModel__Group__31537);
            rule__BusinessDomainModel__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__Group__3


    // $ANTLR start rule__BusinessDomainModel__Group__4
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:736:1: rule__BusinessDomainModel__Group__4 : ( ( rule__BusinessDomainModel__Alternatives_4 )* ) ;
    public final void rule__BusinessDomainModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:740:1: ( ( ( rule__BusinessDomainModel__Alternatives_4 )* ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:741:1: ( ( rule__BusinessDomainModel__Alternatives_4 )* )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:741:1: ( ( rule__BusinessDomainModel__Alternatives_4 )* )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:742:1: ( rule__BusinessDomainModel__Alternatives_4 )*
            {
             before(grammarAccess.getBusinessDomainModelAccess().getAlternatives_4()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:743:1: ( rule__BusinessDomainModel__Alternatives_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING||(LA8_0>=17 && LA8_0<=18)||LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:743:2: rule__BusinessDomainModel__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__BusinessDomainModel__Alternatives_4_in_rule__BusinessDomainModel__Group__41565);
            	    rule__BusinessDomainModel__Alternatives_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBusinessDomainModelAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__Group__4


    // $ANTLR start rule__Association__Group__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:763:1: rule__Association__Group__0 : ( ( rule__Association__DescriptionAssignment_0 )? ) rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:767:1: ( ( ( rule__Association__DescriptionAssignment_0 )? ) rule__Association__Group__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:768:1: ( ( rule__Association__DescriptionAssignment_0 )? ) rule__Association__Group__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:768:1: ( ( rule__Association__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:769:1: ( rule__Association__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getAssociationAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:770:1: ( rule__Association__DescriptionAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:770:2: rule__Association__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Association__DescriptionAssignment_0_in_rule__Association__Group__01610);
                    rule__Association__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__1_in_rule__Association__Group__01620);
            rule__Association__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__0


    // $ANTLR start rule__Association__Group__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:781:1: rule__Association__Group__1 : ( 'association' ) rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:785:1: ( ( 'association' ) rule__Association__Group__2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:786:1: ( 'association' ) rule__Association__Group__2
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:786:1: ( 'association' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:787:1: 'association'
            {
             before(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Association__Group__11649); 
             after(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__2_in_rule__Association__Group__11659);
            rule__Association__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__1


    // $ANTLR start rule__Association__Group__2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:801:1: rule__Association__Group__2 : ( ( rule__Association__SourceAssignment_2 ) ) rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:805:1: ( ( ( rule__Association__SourceAssignment_2 ) ) rule__Association__Group__3 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:806:1: ( ( rule__Association__SourceAssignment_2 ) ) rule__Association__Group__3
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:806:1: ( ( rule__Association__SourceAssignment_2 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:807:1: ( rule__Association__SourceAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getSourceAssignment_2()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:808:1: ( rule__Association__SourceAssignment_2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:808:2: rule__Association__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Association__SourceAssignment_2_in_rule__Association__Group__21687);
            rule__Association__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__3_in_rule__Association__Group__21696);
            rule__Association__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__2


    // $ANTLR start rule__Association__Group__3
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:819:1: rule__Association__Group__3 : ( ( rule__Association__SourceRoleNameAssignment_3 ) ) rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:823:1: ( ( ( rule__Association__SourceRoleNameAssignment_3 ) ) rule__Association__Group__4 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:824:1: ( ( rule__Association__SourceRoleNameAssignment_3 ) ) rule__Association__Group__4
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:824:1: ( ( rule__Association__SourceRoleNameAssignment_3 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:825:1: ( rule__Association__SourceRoleNameAssignment_3 )
            {
             before(grammarAccess.getAssociationAccess().getSourceRoleNameAssignment_3()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:826:1: ( rule__Association__SourceRoleNameAssignment_3 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:826:2: rule__Association__SourceRoleNameAssignment_3
            {
            pushFollow(FOLLOW_rule__Association__SourceRoleNameAssignment_3_in_rule__Association__Group__31724);
            rule__Association__SourceRoleNameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceRoleNameAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__4_in_rule__Association__Group__31733);
            rule__Association__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__3


    // $ANTLR start rule__Association__Group__4
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:837:1: rule__Association__Group__4 : ( ( rule__Association__SourceMultiplicityAssignment_4 ) ) rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:841:1: ( ( ( rule__Association__SourceMultiplicityAssignment_4 ) ) rule__Association__Group__5 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:842:1: ( ( rule__Association__SourceMultiplicityAssignment_4 ) ) rule__Association__Group__5
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:842:1: ( ( rule__Association__SourceMultiplicityAssignment_4 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:843:1: ( rule__Association__SourceMultiplicityAssignment_4 )
            {
             before(grammarAccess.getAssociationAccess().getSourceMultiplicityAssignment_4()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:844:1: ( rule__Association__SourceMultiplicityAssignment_4 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:844:2: rule__Association__SourceMultiplicityAssignment_4
            {
            pushFollow(FOLLOW_rule__Association__SourceMultiplicityAssignment_4_in_rule__Association__Group__41761);
            rule__Association__SourceMultiplicityAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceMultiplicityAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__5_in_rule__Association__Group__41770);
            rule__Association__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__4


    // $ANTLR start rule__Association__Group__5
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:855:1: rule__Association__Group__5 : ( ( rule__Association__Alternatives_5 ) ) rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:859:1: ( ( ( rule__Association__Alternatives_5 ) ) rule__Association__Group__6 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:860:1: ( ( rule__Association__Alternatives_5 ) ) rule__Association__Group__6
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:860:1: ( ( rule__Association__Alternatives_5 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:861:1: ( rule__Association__Alternatives_5 )
            {
             before(grammarAccess.getAssociationAccess().getAlternatives_5()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:862:1: ( rule__Association__Alternatives_5 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:862:2: rule__Association__Alternatives_5
            {
            pushFollow(FOLLOW_rule__Association__Alternatives_5_in_rule__Association__Group__51798);
            rule__Association__Alternatives_5();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getAlternatives_5()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__6_in_rule__Association__Group__51807);
            rule__Association__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__5


    // $ANTLR start rule__Association__Group__6
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:873:1: rule__Association__Group__6 : ( ( rule__Association__TargetMultiplicityAssignment_6 ) ) rule__Association__Group__7 ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:877:1: ( ( ( rule__Association__TargetMultiplicityAssignment_6 ) ) rule__Association__Group__7 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:878:1: ( ( rule__Association__TargetMultiplicityAssignment_6 ) ) rule__Association__Group__7
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:878:1: ( ( rule__Association__TargetMultiplicityAssignment_6 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:879:1: ( rule__Association__TargetMultiplicityAssignment_6 )
            {
             before(grammarAccess.getAssociationAccess().getTargetMultiplicityAssignment_6()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:880:1: ( rule__Association__TargetMultiplicityAssignment_6 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:880:2: rule__Association__TargetMultiplicityAssignment_6
            {
            pushFollow(FOLLOW_rule__Association__TargetMultiplicityAssignment_6_in_rule__Association__Group__61835);
            rule__Association__TargetMultiplicityAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetMultiplicityAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__7_in_rule__Association__Group__61844);
            rule__Association__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__6


    // $ANTLR start rule__Association__Group__7
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:891:1: rule__Association__Group__7 : ( ( rule__Association__TargetAssignment_7 ) ) rule__Association__Group__8 ;
    public final void rule__Association__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:895:1: ( ( ( rule__Association__TargetAssignment_7 ) ) rule__Association__Group__8 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:896:1: ( ( rule__Association__TargetAssignment_7 ) ) rule__Association__Group__8
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:896:1: ( ( rule__Association__TargetAssignment_7 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:897:1: ( rule__Association__TargetAssignment_7 )
            {
             before(grammarAccess.getAssociationAccess().getTargetAssignment_7()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:898:1: ( rule__Association__TargetAssignment_7 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:898:2: rule__Association__TargetAssignment_7
            {
            pushFollow(FOLLOW_rule__Association__TargetAssignment_7_in_rule__Association__Group__71872);
            rule__Association__TargetAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__8_in_rule__Association__Group__71881);
            rule__Association__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__7


    // $ANTLR start rule__Association__Group__8
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:909:1: rule__Association__Group__8 : ( ( rule__Association__TargetRoleNameAssignment_8 ) ) rule__Association__Group__9 ;
    public final void rule__Association__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:913:1: ( ( ( rule__Association__TargetRoleNameAssignment_8 ) ) rule__Association__Group__9 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:914:1: ( ( rule__Association__TargetRoleNameAssignment_8 ) ) rule__Association__Group__9
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:914:1: ( ( rule__Association__TargetRoleNameAssignment_8 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:915:1: ( rule__Association__TargetRoleNameAssignment_8 )
            {
             before(grammarAccess.getAssociationAccess().getTargetRoleNameAssignment_8()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:916:1: ( rule__Association__TargetRoleNameAssignment_8 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:916:2: rule__Association__TargetRoleNameAssignment_8
            {
            pushFollow(FOLLOW_rule__Association__TargetRoleNameAssignment_8_in_rule__Association__Group__81909);
            rule__Association__TargetRoleNameAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetRoleNameAssignment_8()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__9_in_rule__Association__Group__81918);
            rule__Association__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__8


    // $ANTLR start rule__Association__Group__9
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:927:1: rule__Association__Group__9 : ( ( rule__Association__OrderedAssignment_9 )? ) rule__Association__Group__10 ;
    public final void rule__Association__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:931:1: ( ( ( rule__Association__OrderedAssignment_9 )? ) rule__Association__Group__10 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:932:1: ( ( rule__Association__OrderedAssignment_9 )? ) rule__Association__Group__10
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:932:1: ( ( rule__Association__OrderedAssignment_9 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:933:1: ( rule__Association__OrderedAssignment_9 )?
            {
             before(grammarAccess.getAssociationAccess().getOrderedAssignment_9()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:934:1: ( rule__Association__OrderedAssignment_9 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:934:2: rule__Association__OrderedAssignment_9
                    {
                    pushFollow(FOLLOW_rule__Association__OrderedAssignment_9_in_rule__Association__Group__91946);
                    rule__Association__OrderedAssignment_9();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getOrderedAssignment_9()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__10_in_rule__Association__Group__91956);
            rule__Association__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__9


    // $ANTLR start rule__Association__Group__10
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:945:1: rule__Association__Group__10 : ( ';' ) ;
    public final void rule__Association__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:949:1: ( ( ';' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:950:1: ( ';' )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:950:1: ( ';' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:951:1: ';'
            {
             before(grammarAccess.getAssociationAccess().getSemicolonKeyword_10()); 
            match(input,16,FOLLOW_16_in_rule__Association__Group__101985); 
             after(grammarAccess.getAssociationAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__10


    // $ANTLR start rule__BusinessClass__Group__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:986:1: rule__BusinessClass__Group__0 : ( ( rule__BusinessClass__DescriptionAssignment_0 )? ) rule__BusinessClass__Group__1 ;
    public final void rule__BusinessClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:990:1: ( ( ( rule__BusinessClass__DescriptionAssignment_0 )? ) rule__BusinessClass__Group__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:991:1: ( ( rule__BusinessClass__DescriptionAssignment_0 )? ) rule__BusinessClass__Group__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:991:1: ( ( rule__BusinessClass__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:992:1: ( rule__BusinessClass__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBusinessClassAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:993:1: ( rule__BusinessClass__DescriptionAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:993:2: rule__BusinessClass__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BusinessClass__DescriptionAssignment_0_in_rule__BusinessClass__Group__02042);
                    rule__BusinessClass__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__1_in_rule__BusinessClass__Group__02052);
            rule__BusinessClass__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group__0


    // $ANTLR start rule__BusinessClass__Group__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1004:1: rule__BusinessClass__Group__1 : ( 'class' ) rule__BusinessClass__Group__2 ;
    public final void rule__BusinessClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1008:1: ( ( 'class' ) rule__BusinessClass__Group__2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1009:1: ( 'class' ) rule__BusinessClass__Group__2
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1009:1: ( 'class' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1010:1: 'class'
            {
             before(grammarAccess.getBusinessClassAccess().getClassKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__BusinessClass__Group__12081); 
             after(grammarAccess.getBusinessClassAccess().getClassKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__2_in_rule__BusinessClass__Group__12091);
            rule__BusinessClass__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group__1


    // $ANTLR start rule__BusinessClass__Group__2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1024:1: rule__BusinessClass__Group__2 : ( ( rule__BusinessClass__NameAssignment_2 ) ) rule__BusinessClass__Group__3 ;
    public final void rule__BusinessClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1028:1: ( ( ( rule__BusinessClass__NameAssignment_2 ) ) rule__BusinessClass__Group__3 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1029:1: ( ( rule__BusinessClass__NameAssignment_2 ) ) rule__BusinessClass__Group__3
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1029:1: ( ( rule__BusinessClass__NameAssignment_2 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1030:1: ( rule__BusinessClass__NameAssignment_2 )
            {
             before(grammarAccess.getBusinessClassAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1031:1: ( rule__BusinessClass__NameAssignment_2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1031:2: rule__BusinessClass__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BusinessClass__NameAssignment_2_in_rule__BusinessClass__Group__22119);
            rule__BusinessClass__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__3_in_rule__BusinessClass__Group__22128);
            rule__BusinessClass__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group__2


    // $ANTLR start rule__BusinessClass__Group__3
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1042:1: rule__BusinessClass__Group__3 : ( ( rule__BusinessClass__Group_3__0 )? ) rule__BusinessClass__Group__4 ;
    public final void rule__BusinessClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1046:1: ( ( ( rule__BusinessClass__Group_3__0 )? ) rule__BusinessClass__Group__4 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1047:1: ( ( rule__BusinessClass__Group_3__0 )? ) rule__BusinessClass__Group__4
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1047:1: ( ( rule__BusinessClass__Group_3__0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1048:1: ( rule__BusinessClass__Group_3__0 )?
            {
             before(grammarAccess.getBusinessClassAccess().getGroup_3()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1049:1: ( rule__BusinessClass__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1049:2: rule__BusinessClass__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BusinessClass__Group_3__0_in_rule__BusinessClass__Group__32156);
                    rule__BusinessClass__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__4_in_rule__BusinessClass__Group__32166);
            rule__BusinessClass__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group__3


    // $ANTLR start rule__BusinessClass__Group__4
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1060:1: rule__BusinessClass__Group__4 : ( '[' ) rule__BusinessClass__Group__5 ;
    public final void rule__BusinessClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1064:1: ( ( '[' ) rule__BusinessClass__Group__5 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1065:1: ( '[' ) rule__BusinessClass__Group__5
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1065:1: ( '[' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1066:1: '['
            {
             before(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__BusinessClass__Group__42195); 
             after(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__5_in_rule__BusinessClass__Group__42205);
            rule__BusinessClass__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group__4


    // $ANTLR start rule__BusinessClass__Group__5
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1080:1: rule__BusinessClass__Group__5 : ( ( rule__BusinessClass__PropertiesAssignment_5 )* ) rule__BusinessClass__Group__6 ;
    public final void rule__BusinessClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1084:1: ( ( ( rule__BusinessClass__PropertiesAssignment_5 )* ) rule__BusinessClass__Group__6 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1085:1: ( ( rule__BusinessClass__PropertiesAssignment_5 )* ) rule__BusinessClass__Group__6
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1085:1: ( ( rule__BusinessClass__PropertiesAssignment_5 )* )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1086:1: ( rule__BusinessClass__PropertiesAssignment_5 )*
            {
             before(grammarAccess.getBusinessClassAccess().getPropertiesAssignment_5()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1087:1: ( rule__BusinessClass__PropertiesAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)||LA13_0==37||(LA13_0>=40 && LA13_0<=43)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1087:2: rule__BusinessClass__PropertiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__BusinessClass__PropertiesAssignment_5_in_rule__BusinessClass__Group__52233);
            	    rule__BusinessClass__PropertiesAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getBusinessClassAccess().getPropertiesAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__6_in_rule__BusinessClass__Group__52243);
            rule__BusinessClass__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group__5


    // $ANTLR start rule__BusinessClass__Group__6
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1098:1: rule__BusinessClass__Group__6 : ( ( rule__BusinessClass__Group_6__0 )? ) rule__BusinessClass__Group__7 ;
    public final void rule__BusinessClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1102:1: ( ( ( rule__BusinessClass__Group_6__0 )? ) rule__BusinessClass__Group__7 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1103:1: ( ( rule__BusinessClass__Group_6__0 )? ) rule__BusinessClass__Group__7
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1103:1: ( ( rule__BusinessClass__Group_6__0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1104:1: ( rule__BusinessClass__Group_6__0 )?
            {
             before(grammarAccess.getBusinessClassAccess().getGroup_6()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1105:1: ( rule__BusinessClass__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1105:2: rule__BusinessClass__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__BusinessClass__Group_6__0_in_rule__BusinessClass__Group__62271);
                    rule__BusinessClass__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassAccess().getGroup_6()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__7_in_rule__BusinessClass__Group__62281);
            rule__BusinessClass__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group__6


    // $ANTLR start rule__BusinessClass__Group__7
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1116:1: rule__BusinessClass__Group__7 : ( ']' ) ;
    public final void rule__BusinessClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1120:1: ( ( ']' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1121:1: ( ']' )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1121:1: ( ']' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1122:1: ']'
            {
             before(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_7()); 
            match(input,20,FOLLOW_20_in_rule__BusinessClass__Group__72310); 
             after(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group__7


    // $ANTLR start rule__BusinessClass__Group_3__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1151:1: rule__BusinessClass__Group_3__0 : ( 'inherits' ) rule__BusinessClass__Group_3__1 ;
    public final void rule__BusinessClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1155:1: ( ( 'inherits' ) rule__BusinessClass__Group_3__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1156:1: ( 'inherits' ) rule__BusinessClass__Group_3__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1156:1: ( 'inherits' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1157:1: 'inherits'
            {
             before(grammarAccess.getBusinessClassAccess().getInheritsKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__BusinessClass__Group_3__02362); 
             after(grammarAccess.getBusinessClassAccess().getInheritsKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group_3__1_in_rule__BusinessClass__Group_3__02372);
            rule__BusinessClass__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group_3__0


    // $ANTLR start rule__BusinessClass__Group_3__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1171:1: rule__BusinessClass__Group_3__1 : ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) ) ;
    public final void rule__BusinessClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1175:1: ( ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1176:1: ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1176:1: ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1177:1: ( rule__BusinessClass__SuperclassAssignment_3_1 )
            {
             before(grammarAccess.getBusinessClassAccess().getSuperclassAssignment_3_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1178:1: ( rule__BusinessClass__SuperclassAssignment_3_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1178:2: rule__BusinessClass__SuperclassAssignment_3_1
            {
            pushFollow(FOLLOW_rule__BusinessClass__SuperclassAssignment_3_1_in_rule__BusinessClass__Group_3__12400);
            rule__BusinessClass__SuperclassAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassAccess().getSuperclassAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group_3__1


    // $ANTLR start rule__BusinessClass__Group_6__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1192:1: rule__BusinessClass__Group_6__0 : ( 'rules' ) rule__BusinessClass__Group_6__1 ;
    public final void rule__BusinessClass__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1196:1: ( ( 'rules' ) rule__BusinessClass__Group_6__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1197:1: ( 'rules' ) rule__BusinessClass__Group_6__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1197:1: ( 'rules' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1198:1: 'rules'
            {
             before(grammarAccess.getBusinessClassAccess().getRulesKeyword_6_0()); 
            match(input,22,FOLLOW_22_in_rule__BusinessClass__Group_6__02439); 
             after(grammarAccess.getBusinessClassAccess().getRulesKeyword_6_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group_6__1_in_rule__BusinessClass__Group_6__02449);
            rule__BusinessClass__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group_6__0


    // $ANTLR start rule__BusinessClass__Group_6__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1212:1: rule__BusinessClass__Group_6__1 : ( '[' ) rule__BusinessClass__Group_6__2 ;
    public final void rule__BusinessClass__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1216:1: ( ( '[' ) rule__BusinessClass__Group_6__2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1217:1: ( '[' ) rule__BusinessClass__Group_6__2
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1217:1: ( '[' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1218:1: '['
            {
             before(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_6_1()); 
            match(input,19,FOLLOW_19_in_rule__BusinessClass__Group_6__12478); 
             after(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_6_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group_6__2_in_rule__BusinessClass__Group_6__12488);
            rule__BusinessClass__Group_6__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group_6__1


    // $ANTLR start rule__BusinessClass__Group_6__2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1232:1: rule__BusinessClass__Group_6__2 : ( ( rule__BusinessClass__BusinessRulesAssignment_6_2 )* ) rule__BusinessClass__Group_6__3 ;
    public final void rule__BusinessClass__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1236:1: ( ( ( rule__BusinessClass__BusinessRulesAssignment_6_2 )* ) rule__BusinessClass__Group_6__3 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1237:1: ( ( rule__BusinessClass__BusinessRulesAssignment_6_2 )* ) rule__BusinessClass__Group_6__3
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1237:1: ( ( rule__BusinessClass__BusinessRulesAssignment_6_2 )* )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1238:1: ( rule__BusinessClass__BusinessRulesAssignment_6_2 )*
            {
             before(grammarAccess.getBusinessClassAccess().getBusinessRulesAssignment_6_2()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1239:1: ( rule__BusinessClass__BusinessRulesAssignment_6_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)||LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1239:2: rule__BusinessClass__BusinessRulesAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_rule__BusinessClass__BusinessRulesAssignment_6_2_in_rule__BusinessClass__Group_6__22516);
            	    rule__BusinessClass__BusinessRulesAssignment_6_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getBusinessClassAccess().getBusinessRulesAssignment_6_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group_6__3_in_rule__BusinessClass__Group_6__22526);
            rule__BusinessClass__Group_6__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group_6__2


    // $ANTLR start rule__BusinessClass__Group_6__3
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1250:1: rule__BusinessClass__Group_6__3 : ( ']' ) ;
    public final void rule__BusinessClass__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1254:1: ( ( ']' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1255:1: ( ']' )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1255:1: ( ']' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1256:1: ']'
            {
             before(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_6_3()); 
            match(input,20,FOLLOW_20_in_rule__BusinessClass__Group_6__32555); 
             after(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group_6__3


    // $ANTLR start rule__Enumeration__Group__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1277:1: rule__Enumeration__Group__0 : ( ( rule__Enumeration__DescriptionAssignment_0 )? ) rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1281:1: ( ( ( rule__Enumeration__DescriptionAssignment_0 )? ) rule__Enumeration__Group__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1282:1: ( ( rule__Enumeration__DescriptionAssignment_0 )? ) rule__Enumeration__Group__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1282:1: ( ( rule__Enumeration__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1283:1: ( rule__Enumeration__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumerationAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1284:1: ( rule__Enumeration__DescriptionAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1284:2: rule__Enumeration__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Enumeration__DescriptionAssignment_0_in_rule__Enumeration__Group__02598);
                    rule__Enumeration__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02608);
            rule__Enumeration__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__0


    // $ANTLR start rule__Enumeration__Group__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1295:1: rule__Enumeration__Group__1 : ( 'enumeration' ) rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1299:1: ( ( 'enumeration' ) rule__Enumeration__Group__2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1300:1: ( 'enumeration' ) rule__Enumeration__Group__2
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1300:1: ( 'enumeration' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1301:1: 'enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Enumeration__Group__12637); 
             after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12647);
            rule__Enumeration__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__1


    // $ANTLR start rule__Enumeration__Group__2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1315:1: rule__Enumeration__Group__2 : ( ( rule__Enumeration__NameAssignment_2 ) ) rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1319:1: ( ( ( rule__Enumeration__NameAssignment_2 ) ) rule__Enumeration__Group__3 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1320:1: ( ( rule__Enumeration__NameAssignment_2 ) ) rule__Enumeration__Group__3
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1320:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1321:1: ( rule__Enumeration__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1322:1: ( rule__Enumeration__NameAssignment_2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1322:2: rule__Enumeration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Enumeration__NameAssignment_2_in_rule__Enumeration__Group__22675);
            rule__Enumeration__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22684);
            rule__Enumeration__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__2


    // $ANTLR start rule__Enumeration__Group__3
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1333:1: rule__Enumeration__Group__3 : ( '[' ) rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1337:1: ( ( '[' ) rule__Enumeration__Group__4 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1338:1: ( '[' ) rule__Enumeration__Group__4
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1338:1: ( '[' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1339:1: '['
            {
             before(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__Enumeration__Group__32713); 
             after(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32723);
            rule__Enumeration__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__3


    // $ANTLR start rule__Enumeration__Group__4
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1353:1: rule__Enumeration__Group__4 : ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* ) ) rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1357:1: ( ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* ) ) rule__Enumeration__Group__5 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1358:1: ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* ) ) rule__Enumeration__Group__5
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1358:1: ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1359:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1359:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1360:1: ( rule__Enumeration__EnumerationLiteralsAssignment_4 )
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_4()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1361:1: ( rule__Enumeration__EnumerationLiteralsAssignment_4 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1361:2: rule__Enumeration__EnumerationLiteralsAssignment_4
            {
            pushFollow(FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_4_in_rule__Enumeration__Group__42753);
            rule__Enumeration__EnumerationLiteralsAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_4()); 

            }

            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1364:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1365:1: ( rule__Enumeration__EnumerationLiteralsAssignment_4 )*
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_4()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1366:1: ( rule__Enumeration__EnumerationLiteralsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1366:2: rule__Enumeration__EnumerationLiteralsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_4_in_rule__Enumeration__Group__42765);
            	    rule__Enumeration__EnumerationLiteralsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_4()); 

            }


            }

            pushFollow(FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__42777);
            rule__Enumeration__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__4


    // $ANTLR start rule__Enumeration__Group__5
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1378:1: rule__Enumeration__Group__5 : ( ']' ) ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1382:1: ( ( ']' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1383:1: ( ']' )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1383:1: ( ']' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1384:1: ']'
            {
             before(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__Enumeration__Group__52806); 
             after(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__5


    // $ANTLR start rule__EnumerationLiteral__Group__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1409:1: rule__EnumerationLiteral__Group__0 : ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1413:1: ( ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1414:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1414:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1415:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1416:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1416:2: rule__EnumerationLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__02853);
            rule__EnumerationLiteral__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__02862);
            rule__EnumerationLiteral__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationLiteral__Group__0


    // $ANTLR start rule__EnumerationLiteral__Group__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1427:1: rule__EnumerationLiteral__Group__1 : ( ( rule__EnumerationLiteral__Group_1__0 ) ) rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1431:1: ( ( ( rule__EnumerationLiteral__Group_1__0 ) ) rule__EnumerationLiteral__Group__2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1432:1: ( ( rule__EnumerationLiteral__Group_1__0 ) ) rule__EnumerationLiteral__Group__2
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1432:1: ( ( rule__EnumerationLiteral__Group_1__0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1433:1: ( rule__EnumerationLiteral__Group_1__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1434:1: ( rule__EnumerationLiteral__Group_1__0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1434:2: rule__EnumerationLiteral__Group_1__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__0_in_rule__EnumerationLiteral__Group__12890);
            rule__EnumerationLiteral__Group_1__0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__12899);
            rule__EnumerationLiteral__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationLiteral__Group__1


    // $ANTLR start rule__EnumerationLiteral__Group__2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1445:1: rule__EnumerationLiteral__Group__2 : ( ';' ) ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1449:1: ( ( ';' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1450:1: ( ';' )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1450:1: ( ';' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1451:1: ';'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getSemicolonKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__EnumerationLiteral__Group__22928); 
             after(grammarAccess.getEnumerationLiteralAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationLiteral__Group__2


    // $ANTLR start rule__EnumerationLiteral__Group_1__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1470:1: rule__EnumerationLiteral__Group_1__0 : ( '=' ) rule__EnumerationLiteral__Group_1__1 ;
    public final void rule__EnumerationLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1474:1: ( ( '=' ) rule__EnumerationLiteral__Group_1__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1475:1: ( '=' ) rule__EnumerationLiteral__Group_1__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1475:1: ( '=' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1476:1: '='
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__EnumerationLiteral__Group_1__02970); 
             after(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__1_in_rule__EnumerationLiteral__Group_1__02980);
            rule__EnumerationLiteral__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationLiteral__Group_1__0


    // $ANTLR start rule__EnumerationLiteral__Group_1__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1490:1: rule__EnumerationLiteral__Group_1__1 : ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1494:1: ( ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1495:1: ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1495:1: ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1496:1: ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getPersistedValueAssignment_1_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1497:1: ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1497:2: rule__EnumerationLiteral__PersistedValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__PersistedValueAssignment_1_1_in_rule__EnumerationLiteral__Group_1__13008);
            rule__EnumerationLiteral__PersistedValueAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getPersistedValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationLiteral__Group_1__1


    // $ANTLR start rule__BusinessRule__Group__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1511:1: rule__BusinessRule__Group__0 : ( ( rule__BusinessRule__DescriptionAssignment_0 )? ) rule__BusinessRule__Group__1 ;
    public final void rule__BusinessRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1515:1: ( ( ( rule__BusinessRule__DescriptionAssignment_0 )? ) rule__BusinessRule__Group__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1516:1: ( ( rule__BusinessRule__DescriptionAssignment_0 )? ) rule__BusinessRule__Group__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1516:1: ( ( rule__BusinessRule__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1517:1: ( rule__BusinessRule__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBusinessRuleAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1518:1: ( rule__BusinessRule__DescriptionAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1518:2: rule__BusinessRule__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BusinessRule__DescriptionAssignment_0_in_rule__BusinessRule__Group__03046);
                    rule__BusinessRule__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessRuleAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessRule__Group__1_in_rule__BusinessRule__Group__03056);
            rule__BusinessRule__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessRule__Group__0


    // $ANTLR start rule__BusinessRule__Group__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1529:1: rule__BusinessRule__Group__1 : ( ( rule__BusinessRule__NameAssignment_1 ) ) rule__BusinessRule__Group__2 ;
    public final void rule__BusinessRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1533:1: ( ( ( rule__BusinessRule__NameAssignment_1 ) ) rule__BusinessRule__Group__2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1534:1: ( ( rule__BusinessRule__NameAssignment_1 ) ) rule__BusinessRule__Group__2
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1534:1: ( ( rule__BusinessRule__NameAssignment_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1535:1: ( rule__BusinessRule__NameAssignment_1 )
            {
             before(grammarAccess.getBusinessRuleAccess().getNameAssignment_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1536:1: ( rule__BusinessRule__NameAssignment_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1536:2: rule__BusinessRule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BusinessRule__NameAssignment_1_in_rule__BusinessRule__Group__13084);
            rule__BusinessRule__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessRule__Group__2_in_rule__BusinessRule__Group__13093);
            rule__BusinessRule__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessRule__Group__1


    // $ANTLR start rule__BusinessRule__Group__2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1547:1: rule__BusinessRule__Group__2 : ( ';' ) ;
    public final void rule__BusinessRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1551:1: ( ( ';' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1552:1: ( ';' )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1552:1: ( ';' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1553:1: ';'
            {
             before(grammarAccess.getBusinessRuleAccess().getSemicolonKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__BusinessRule__Group__23122); 
             after(grammarAccess.getBusinessRuleAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessRule__Group__2


    // $ANTLR start rule__UniqueRule__Group__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1572:1: rule__UniqueRule__Group__0 : ( ( rule__UniqueRule__DescriptionAssignment_0 )? ) rule__UniqueRule__Group__1 ;
    public final void rule__UniqueRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1576:1: ( ( ( rule__UniqueRule__DescriptionAssignment_0 )? ) rule__UniqueRule__Group__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1577:1: ( ( rule__UniqueRule__DescriptionAssignment_0 )? ) rule__UniqueRule__Group__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1577:1: ( ( rule__UniqueRule__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1578:1: ( rule__UniqueRule__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getUniqueRuleAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1579:1: ( rule__UniqueRule__DescriptionAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1579:2: rule__UniqueRule__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__UniqueRule__DescriptionAssignment_0_in_rule__UniqueRule__Group__03163);
                    rule__UniqueRule__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUniqueRuleAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__1_in_rule__UniqueRule__Group__03173);
            rule__UniqueRule__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__Group__0


    // $ANTLR start rule__UniqueRule__Group__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1590:1: rule__UniqueRule__Group__1 : ( 'unique' ) rule__UniqueRule__Group__2 ;
    public final void rule__UniqueRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1594:1: ( ( 'unique' ) rule__UniqueRule__Group__2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1595:1: ( 'unique' ) rule__UniqueRule__Group__2
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1595:1: ( 'unique' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1596:1: 'unique'
            {
             before(grammarAccess.getUniqueRuleAccess().getUniqueKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__UniqueRule__Group__13202); 
             after(grammarAccess.getUniqueRuleAccess().getUniqueKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__2_in_rule__UniqueRule__Group__13212);
            rule__UniqueRule__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__Group__1


    // $ANTLR start rule__UniqueRule__Group__2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1610:1: rule__UniqueRule__Group__2 : ( ( rule__UniqueRule__NameAssignment_2 ) ) rule__UniqueRule__Group__3 ;
    public final void rule__UniqueRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1614:1: ( ( ( rule__UniqueRule__NameAssignment_2 ) ) rule__UniqueRule__Group__3 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1615:1: ( ( rule__UniqueRule__NameAssignment_2 ) ) rule__UniqueRule__Group__3
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1615:1: ( ( rule__UniqueRule__NameAssignment_2 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1616:1: ( rule__UniqueRule__NameAssignment_2 )
            {
             before(grammarAccess.getUniqueRuleAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1617:1: ( rule__UniqueRule__NameAssignment_2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1617:2: rule__UniqueRule__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__UniqueRule__NameAssignment_2_in_rule__UniqueRule__Group__23240);
            rule__UniqueRule__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getUniqueRuleAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__3_in_rule__UniqueRule__Group__23249);
            rule__UniqueRule__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__Group__2


    // $ANTLR start rule__UniqueRule__Group__3
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1628:1: rule__UniqueRule__Group__3 : ( '[' ) rule__UniqueRule__Group__4 ;
    public final void rule__UniqueRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1632:1: ( ( '[' ) rule__UniqueRule__Group__4 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1633:1: ( '[' ) rule__UniqueRule__Group__4
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1633:1: ( '[' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1634:1: '['
            {
             before(grammarAccess.getUniqueRuleAccess().getLeftSquareBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__UniqueRule__Group__33278); 
             after(grammarAccess.getUniqueRuleAccess().getLeftSquareBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__4_in_rule__UniqueRule__Group__33288);
            rule__UniqueRule__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__Group__3


    // $ANTLR start rule__UniqueRule__Group__4
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1648:1: rule__UniqueRule__Group__4 : ( ( rule__UniqueRule__PropertiesAssignment_4 ) ) rule__UniqueRule__Group__5 ;
    public final void rule__UniqueRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1652:1: ( ( ( rule__UniqueRule__PropertiesAssignment_4 ) ) rule__UniqueRule__Group__5 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1653:1: ( ( rule__UniqueRule__PropertiesAssignment_4 ) ) rule__UniqueRule__Group__5
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1653:1: ( ( rule__UniqueRule__PropertiesAssignment_4 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1654:1: ( rule__UniqueRule__PropertiesAssignment_4 )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesAssignment_4()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1655:1: ( rule__UniqueRule__PropertiesAssignment_4 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1655:2: rule__UniqueRule__PropertiesAssignment_4
            {
            pushFollow(FOLLOW_rule__UniqueRule__PropertiesAssignment_4_in_rule__UniqueRule__Group__43316);
            rule__UniqueRule__PropertiesAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getUniqueRuleAccess().getPropertiesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__5_in_rule__UniqueRule__Group__43325);
            rule__UniqueRule__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__Group__4


    // $ANTLR start rule__UniqueRule__Group__5
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1666:1: rule__UniqueRule__Group__5 : ( ( rule__UniqueRule__Group_5__0 )* ) rule__UniqueRule__Group__6 ;
    public final void rule__UniqueRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1670:1: ( ( ( rule__UniqueRule__Group_5__0 )* ) rule__UniqueRule__Group__6 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1671:1: ( ( rule__UniqueRule__Group_5__0 )* ) rule__UniqueRule__Group__6
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1671:1: ( ( rule__UniqueRule__Group_5__0 )* )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1672:1: ( rule__UniqueRule__Group_5__0 )*
            {
             before(grammarAccess.getUniqueRuleAccess().getGroup_5()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1673:1: ( rule__UniqueRule__Group_5__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1673:2: rule__UniqueRule__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__UniqueRule__Group_5__0_in_rule__UniqueRule__Group__53353);
            	    rule__UniqueRule__Group_5__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getUniqueRuleAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__6_in_rule__UniqueRule__Group__53363);
            rule__UniqueRule__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__Group__5


    // $ANTLR start rule__UniqueRule__Group__6
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1684:1: rule__UniqueRule__Group__6 : ( ']' ) ;
    public final void rule__UniqueRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1688:1: ( ( ']' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1689:1: ( ']' )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1689:1: ( ']' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1690:1: ']'
            {
             before(grammarAccess.getUniqueRuleAccess().getRightSquareBracketKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__UniqueRule__Group__63392); 
             after(grammarAccess.getUniqueRuleAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__Group__6


    // $ANTLR start rule__UniqueRule__Group_5__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1717:1: rule__UniqueRule__Group_5__0 : ( ',' ) rule__UniqueRule__Group_5__1 ;
    public final void rule__UniqueRule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1721:1: ( ( ',' ) rule__UniqueRule__Group_5__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1722:1: ( ',' ) rule__UniqueRule__Group_5__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1722:1: ( ',' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1723:1: ','
            {
             before(grammarAccess.getUniqueRuleAccess().getCommaKeyword_5_0()); 
            match(input,26,FOLLOW_26_in_rule__UniqueRule__Group_5__03442); 
             after(grammarAccess.getUniqueRuleAccess().getCommaKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group_5__1_in_rule__UniqueRule__Group_5__03452);
            rule__UniqueRule__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__Group_5__0


    // $ANTLR start rule__UniqueRule__Group_5__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1737:1: rule__UniqueRule__Group_5__1 : ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) ) ;
    public final void rule__UniqueRule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1741:1: ( ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1742:1: ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1742:1: ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1743:1: ( rule__UniqueRule__PropertiesAssignment_5_1 )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesAssignment_5_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1744:1: ( rule__UniqueRule__PropertiesAssignment_5_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1744:2: rule__UniqueRule__PropertiesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__UniqueRule__PropertiesAssignment_5_1_in_rule__UniqueRule__Group_5__13480);
            rule__UniqueRule__PropertiesAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getUniqueRuleAccess().getPropertiesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__Group_5__1


    // $ANTLR start rule__Property__Group__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1758:1: rule__Property__Group__0 : ( ( rule__Property__Alternatives_0 ) ) rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1762:1: ( ( ( rule__Property__Alternatives_0 ) ) rule__Property__Group__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1763:1: ( ( rule__Property__Alternatives_0 ) ) rule__Property__Group__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1763:1: ( ( rule__Property__Alternatives_0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1764:1: ( rule__Property__Alternatives_0 )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1765:1: ( rule__Property__Alternatives_0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1765:2: rule__Property__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_0_in_rule__Property__Group__03518);
            rule__Property__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03527);
            rule__Property__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__0


    // $ANTLR start rule__Property__Group__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1776:1: rule__Property__Group__1 : ( ( rule__Property__NullableAssignment_1 )? ) rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1780:1: ( ( ( rule__Property__NullableAssignment_1 )? ) rule__Property__Group__2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1781:1: ( ( rule__Property__NullableAssignment_1 )? ) rule__Property__Group__2
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1781:1: ( ( rule__Property__NullableAssignment_1 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1782:1: ( rule__Property__NullableAssignment_1 )?
            {
             before(grammarAccess.getPropertyAccess().getNullableAssignment_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1783:1: ( rule__Property__NullableAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1783:2: rule__Property__NullableAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Property__NullableAssignment_1_in_rule__Property__Group__13555);
                    rule__Property__NullableAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getNullableAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13565);
            rule__Property__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__1


    // $ANTLR start rule__Property__Group__2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1794:1: rule__Property__Group__2 : ( ( rule__Property__Group_2__0 )? ) rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1798:1: ( ( ( rule__Property__Group_2__0 )? ) rule__Property__Group__3 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1799:1: ( ( rule__Property__Group_2__0 )? ) rule__Property__Group__3
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1799:1: ( ( rule__Property__Group_2__0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1800:1: ( rule__Property__Group_2__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_2()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1801:1: ( rule__Property__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1801:2: rule__Property__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_2__0_in_rule__Property__Group__23593);
                    rule__Property__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__23603);
            rule__Property__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__2


    // $ANTLR start rule__Property__Group__3
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1812:1: rule__Property__Group__3 : ( ';' ) ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1816:1: ( ( ';' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1817:1: ( ';' )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1817:1: ( ';' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1818:1: ';'
            {
             before(grammarAccess.getPropertyAccess().getSemicolonKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Property__Group__33632); 
             after(grammarAccess.getPropertyAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__3


    // $ANTLR start rule__Property__Group_2__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1839:1: rule__Property__Group_2__0 : ( ( rule__Property__DerivedAssignment_2_0 ) ) rule__Property__Group_2__1 ;
    public final void rule__Property__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1843:1: ( ( ( rule__Property__DerivedAssignment_2_0 ) ) rule__Property__Group_2__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1844:1: ( ( rule__Property__DerivedAssignment_2_0 ) ) rule__Property__Group_2__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1844:1: ( ( rule__Property__DerivedAssignment_2_0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1845:1: ( rule__Property__DerivedAssignment_2_0 )
            {
             before(grammarAccess.getPropertyAccess().getDerivedAssignment_2_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1846:1: ( rule__Property__DerivedAssignment_2_0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1846:2: rule__Property__DerivedAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Property__DerivedAssignment_2_0_in_rule__Property__Group_2__03675);
            rule__Property__DerivedAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getDerivedAssignment_2_0()); 

            }

            pushFollow(FOLLOW_rule__Property__Group_2__1_in_rule__Property__Group_2__03684);
            rule__Property__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group_2__0


    // $ANTLR start rule__Property__Group_2__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1857:1: rule__Property__Group_2__1 : ( ( rule__Property__WritableAssignment_2_1 )? ) ;
    public final void rule__Property__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1861:1: ( ( ( rule__Property__WritableAssignment_2_1 )? ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1862:1: ( ( rule__Property__WritableAssignment_2_1 )? )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1862:1: ( ( rule__Property__WritableAssignment_2_1 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1863:1: ( rule__Property__WritableAssignment_2_1 )?
            {
             before(grammarAccess.getPropertyAccess().getWritableAssignment_2_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1864:1: ( rule__Property__WritableAssignment_2_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1864:2: rule__Property__WritableAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Property__WritableAssignment_2_1_in_rule__Property__Group_2__13712);
                    rule__Property__WritableAssignment_2_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getWritableAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group_2__1


    // $ANTLR start rule__BoolProperty__Group__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1878:1: rule__BoolProperty__Group__0 : ( ( rule__BoolProperty__DescriptionAssignment_0 )? ) rule__BoolProperty__Group__1 ;
    public final void rule__BoolProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1882:1: ( ( ( rule__BoolProperty__DescriptionAssignment_0 )? ) rule__BoolProperty__Group__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1883:1: ( ( rule__BoolProperty__DescriptionAssignment_0 )? ) rule__BoolProperty__Group__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1883:1: ( ( rule__BoolProperty__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1884:1: ( rule__BoolProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBoolPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1885:1: ( rule__BoolProperty__DescriptionAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1885:2: rule__BoolProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BoolProperty__DescriptionAssignment_0_in_rule__BoolProperty__Group__03751);
                    rule__BoolProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoolPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BoolProperty__Group__1_in_rule__BoolProperty__Group__03761);
            rule__BoolProperty__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__Group__0


    // $ANTLR start rule__BoolProperty__Group__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1896:1: rule__BoolProperty__Group__1 : ( ( rule__BoolProperty__DataTypeAssignment_1 ) ) rule__BoolProperty__Group__2 ;
    public final void rule__BoolProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1900:1: ( ( ( rule__BoolProperty__DataTypeAssignment_1 ) ) rule__BoolProperty__Group__2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1901:1: ( ( rule__BoolProperty__DataTypeAssignment_1 ) ) rule__BoolProperty__Group__2
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1901:1: ( ( rule__BoolProperty__DataTypeAssignment_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1902:1: ( rule__BoolProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getBoolPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1903:1: ( rule__BoolProperty__DataTypeAssignment_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1903:2: rule__BoolProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__BoolProperty__DataTypeAssignment_1_in_rule__BoolProperty__Group__13789);
            rule__BoolProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBoolPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__BoolProperty__Group__2_in_rule__BoolProperty__Group__13798);
            rule__BoolProperty__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__Group__1


    // $ANTLR start rule__BoolProperty__Group__2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1914:1: rule__BoolProperty__Group__2 : ( ( rule__BoolProperty__NameAssignment_2 ) ) rule__BoolProperty__Group__3 ;
    public final void rule__BoolProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1918:1: ( ( ( rule__BoolProperty__NameAssignment_2 ) ) rule__BoolProperty__Group__3 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1919:1: ( ( rule__BoolProperty__NameAssignment_2 ) ) rule__BoolProperty__Group__3
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1919:1: ( ( rule__BoolProperty__NameAssignment_2 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1920:1: ( rule__BoolProperty__NameAssignment_2 )
            {
             before(grammarAccess.getBoolPropertyAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1921:1: ( rule__BoolProperty__NameAssignment_2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1921:2: rule__BoolProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BoolProperty__NameAssignment_2_in_rule__BoolProperty__Group__23826);
            rule__BoolProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBoolPropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BoolProperty__Group__3_in_rule__BoolProperty__Group__23835);
            rule__BoolProperty__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__Group__2


    // $ANTLR start rule__BoolProperty__Group__3
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1932:1: rule__BoolProperty__Group__3 : ( ( rule__BoolProperty__Group_3__0 )? ) ;
    public final void rule__BoolProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1936:1: ( ( ( rule__BoolProperty__Group_3__0 )? ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1937:1: ( ( rule__BoolProperty__Group_3__0 )? )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1937:1: ( ( rule__BoolProperty__Group_3__0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1938:1: ( rule__BoolProperty__Group_3__0 )?
            {
             before(grammarAccess.getBoolPropertyAccess().getGroup_3()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1939:1: ( rule__BoolProperty__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1939:2: rule__BoolProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BoolProperty__Group_3__0_in_rule__BoolProperty__Group__33863);
                    rule__BoolProperty__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoolPropertyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__Group__3


    // $ANTLR start rule__BoolProperty__Group_3__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1957:1: rule__BoolProperty__Group_3__0 : ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) ) rule__BoolProperty__Group_3__1 ;
    public final void rule__BoolProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1961:1: ( ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) ) rule__BoolProperty__Group_3__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1962:1: ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) ) rule__BoolProperty__Group_3__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1962:1: ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1963:1: ( rule__BoolProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getBoolPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1964:1: ( rule__BoolProperty__HasDefaultAssignment_3_0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1964:2: rule__BoolProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__BoolProperty__HasDefaultAssignment_3_0_in_rule__BoolProperty__Group_3__03906);
            rule__BoolProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getBoolPropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__BoolProperty__Group_3__1_in_rule__BoolProperty__Group_3__03915);
            rule__BoolProperty__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__Group_3__0


    // $ANTLR start rule__BoolProperty__Group_3__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1975:1: rule__BoolProperty__Group_3__1 : ( ( rule__BoolProperty__Alternatives_3_1 ) ) ;
    public final void rule__BoolProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1979:1: ( ( ( rule__BoolProperty__Alternatives_3_1 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1980:1: ( ( rule__BoolProperty__Alternatives_3_1 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1980:1: ( ( rule__BoolProperty__Alternatives_3_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1981:1: ( rule__BoolProperty__Alternatives_3_1 )
            {
             before(grammarAccess.getBoolPropertyAccess().getAlternatives_3_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1982:1: ( rule__BoolProperty__Alternatives_3_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1982:2: rule__BoolProperty__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__BoolProperty__Alternatives_3_1_in_rule__BoolProperty__Group_3__13943);
            rule__BoolProperty__Alternatives_3_1();
            _fsp--;


            }

             after(grammarAccess.getBoolPropertyAccess().getAlternatives_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__Group_3__1


    // $ANTLR start rule__StringProperty__Group__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1996:1: rule__StringProperty__Group__0 : ( ( rule__StringProperty__DescriptionAssignment_0 )? ) rule__StringProperty__Group__1 ;
    public final void rule__StringProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2000:1: ( ( ( rule__StringProperty__DescriptionAssignment_0 )? ) rule__StringProperty__Group__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2001:1: ( ( rule__StringProperty__DescriptionAssignment_0 )? ) rule__StringProperty__Group__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2001:1: ( ( rule__StringProperty__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2002:1: ( rule__StringProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2003:1: ( rule__StringProperty__DescriptionAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2003:2: rule__StringProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__DescriptionAssignment_0_in_rule__StringProperty__Group__03981);
                    rule__StringProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__1_in_rule__StringProperty__Group__03991);
            rule__StringProperty__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group__0


    // $ANTLR start rule__StringProperty__Group__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2014:1: rule__StringProperty__Group__1 : ( ( rule__StringProperty__DataTypeAssignment_1 ) ) rule__StringProperty__Group__2 ;
    public final void rule__StringProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2018:1: ( ( ( rule__StringProperty__DataTypeAssignment_1 ) ) rule__StringProperty__Group__2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2019:1: ( ( rule__StringProperty__DataTypeAssignment_1 ) ) rule__StringProperty__Group__2
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2019:1: ( ( rule__StringProperty__DataTypeAssignment_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2020:1: ( rule__StringProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2021:1: ( rule__StringProperty__DataTypeAssignment_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2021:2: rule__StringProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__StringProperty__DataTypeAssignment_1_in_rule__StringProperty__Group__14019);
            rule__StringProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__2_in_rule__StringProperty__Group__14028);
            rule__StringProperty__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group__1


    // $ANTLR start rule__StringProperty__Group__2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2032:1: rule__StringProperty__Group__2 : ( ( rule__StringProperty__NameAssignment_2 ) ) rule__StringProperty__Group__3 ;
    public final void rule__StringProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2036:1: ( ( ( rule__StringProperty__NameAssignment_2 ) ) rule__StringProperty__Group__3 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2037:1: ( ( rule__StringProperty__NameAssignment_2 ) ) rule__StringProperty__Group__3
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2037:1: ( ( rule__StringProperty__NameAssignment_2 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2038:1: ( rule__StringProperty__NameAssignment_2 )
            {
             before(grammarAccess.getStringPropertyAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2039:1: ( rule__StringProperty__NameAssignment_2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2039:2: rule__StringProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__StringProperty__NameAssignment_2_in_rule__StringProperty__Group__24056);
            rule__StringProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__3_in_rule__StringProperty__Group__24065);
            rule__StringProperty__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group__2


    // $ANTLR start rule__StringProperty__Group__3
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2050:1: rule__StringProperty__Group__3 : ( ( rule__StringProperty__Group_3__0 )? ) rule__StringProperty__Group__4 ;
    public final void rule__StringProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2054:1: ( ( ( rule__StringProperty__Group_3__0 )? ) rule__StringProperty__Group__4 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2055:1: ( ( rule__StringProperty__Group_3__0 )? ) rule__StringProperty__Group__4
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2055:1: ( ( rule__StringProperty__Group_3__0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2056:1: ( rule__StringProperty__Group_3__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_3()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2057:1: ( rule__StringProperty__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2057:2: rule__StringProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__Group_3__0_in_rule__StringProperty__Group__34093);
                    rule__StringProperty__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringPropertyAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__4_in_rule__StringProperty__Group__34103);
            rule__StringProperty__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group__3


    // $ANTLR start rule__StringProperty__Group__4
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2068:1: rule__StringProperty__Group__4 : ( ( rule__StringProperty__Group_4__0 )? ) rule__StringProperty__Group__5 ;
    public final void rule__StringProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2072:1: ( ( ( rule__StringProperty__Group_4__0 )? ) rule__StringProperty__Group__5 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2073:1: ( ( rule__StringProperty__Group_4__0 )? ) rule__StringProperty__Group__5
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2073:1: ( ( rule__StringProperty__Group_4__0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2074:1: ( rule__StringProperty__Group_4__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_4()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2075:1: ( rule__StringProperty__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2075:2: rule__StringProperty__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__Group_4__0_in_rule__StringProperty__Group__44131);
                    rule__StringProperty__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringPropertyAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__5_in_rule__StringProperty__Group__44141);
            rule__StringProperty__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group__4


    // $ANTLR start rule__StringProperty__Group__5
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2086:1: rule__StringProperty__Group__5 : ( ( rule__StringProperty__Group_5__0 )? ) rule__StringProperty__Group__6 ;
    public final void rule__StringProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2090:1: ( ( ( rule__StringProperty__Group_5__0 )? ) rule__StringProperty__Group__6 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2091:1: ( ( rule__StringProperty__Group_5__0 )? ) rule__StringProperty__Group__6
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2091:1: ( ( rule__StringProperty__Group_5__0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2092:1: ( rule__StringProperty__Group_5__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_5()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2093:1: ( rule__StringProperty__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2093:2: rule__StringProperty__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__Group_5__0_in_rule__StringProperty__Group__54169);
                    rule__StringProperty__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringPropertyAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__6_in_rule__StringProperty__Group__54179);
            rule__StringProperty__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group__5


    // $ANTLR start rule__StringProperty__Group__6
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2104:1: rule__StringProperty__Group__6 : ( ( rule__StringProperty__Group_6__0 )? ) ;
    public final void rule__StringProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2108:1: ( ( ( rule__StringProperty__Group_6__0 )? ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2109:1: ( ( rule__StringProperty__Group_6__0 )? )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2109:1: ( ( rule__StringProperty__Group_6__0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2110:1: ( rule__StringProperty__Group_6__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_6()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2111:1: ( rule__StringProperty__Group_6__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2111:2: rule__StringProperty__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__Group_6__0_in_rule__StringProperty__Group__64207);
                    rule__StringProperty__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringPropertyAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group__6


    // $ANTLR start rule__StringProperty__Group_3__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2135:1: rule__StringProperty__Group_3__0 : ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) ) rule__StringProperty__Group_3__1 ;
    public final void rule__StringProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2139:1: ( ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) ) rule__StringProperty__Group_3__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2140:1: ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) ) rule__StringProperty__Group_3__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2140:1: ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2141:1: ( rule__StringProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getStringPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2142:1: ( rule__StringProperty__HasDefaultAssignment_3_0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2142:2: rule__StringProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__StringProperty__HasDefaultAssignment_3_0_in_rule__StringProperty__Group_3__04256);
            rule__StringProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group_3__1_in_rule__StringProperty__Group_3__04265);
            rule__StringProperty__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group_3__0


    // $ANTLR start rule__StringProperty__Group_3__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2153:1: rule__StringProperty__Group_3__1 : ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__StringProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2157:1: ( ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2158:1: ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2158:1: ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2159:1: ( rule__StringProperty__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getDefaultValueAssignment_3_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2160:1: ( rule__StringProperty__DefaultValueAssignment_3_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2160:2: rule__StringProperty__DefaultValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__StringProperty__DefaultValueAssignment_3_1_in_rule__StringProperty__Group_3__14293);
            rule__StringProperty__DefaultValueAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getDefaultValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group_3__1


    // $ANTLR start rule__StringProperty__Group_4__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2174:1: rule__StringProperty__Group_4__0 : ( 'minlength' ) rule__StringProperty__Group_4__1 ;
    public final void rule__StringProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2178:1: ( ( 'minlength' ) rule__StringProperty__Group_4__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2179:1: ( 'minlength' ) rule__StringProperty__Group_4__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2179:1: ( 'minlength' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2180:1: 'minlength'
            {
             before(grammarAccess.getStringPropertyAccess().getMinlengthKeyword_4_0()); 
            match(input,27,FOLLOW_27_in_rule__StringProperty__Group_4__04332); 
             after(grammarAccess.getStringPropertyAccess().getMinlengthKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group_4__1_in_rule__StringProperty__Group_4__04342);
            rule__StringProperty__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group_4__0


    // $ANTLR start rule__StringProperty__Group_4__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2194:1: rule__StringProperty__Group_4__1 : ( ( rule__StringProperty__MinLengthAssignment_4_1 ) ) ;
    public final void rule__StringProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2198:1: ( ( ( rule__StringProperty__MinLengthAssignment_4_1 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2199:1: ( ( rule__StringProperty__MinLengthAssignment_4_1 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2199:1: ( ( rule__StringProperty__MinLengthAssignment_4_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2200:1: ( rule__StringProperty__MinLengthAssignment_4_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getMinLengthAssignment_4_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2201:1: ( rule__StringProperty__MinLengthAssignment_4_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2201:2: rule__StringProperty__MinLengthAssignment_4_1
            {
            pushFollow(FOLLOW_rule__StringProperty__MinLengthAssignment_4_1_in_rule__StringProperty__Group_4__14370);
            rule__StringProperty__MinLengthAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getMinLengthAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group_4__1


    // $ANTLR start rule__StringProperty__Group_5__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2215:1: rule__StringProperty__Group_5__0 : ( 'maxlength' ) rule__StringProperty__Group_5__1 ;
    public final void rule__StringProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2219:1: ( ( 'maxlength' ) rule__StringProperty__Group_5__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2220:1: ( 'maxlength' ) rule__StringProperty__Group_5__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2220:1: ( 'maxlength' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2221:1: 'maxlength'
            {
             before(grammarAccess.getStringPropertyAccess().getMaxlengthKeyword_5_0()); 
            match(input,28,FOLLOW_28_in_rule__StringProperty__Group_5__04409); 
             after(grammarAccess.getStringPropertyAccess().getMaxlengthKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group_5__1_in_rule__StringProperty__Group_5__04419);
            rule__StringProperty__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group_5__0


    // $ANTLR start rule__StringProperty__Group_5__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2235:1: rule__StringProperty__Group_5__1 : ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) ) ;
    public final void rule__StringProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2239:1: ( ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2240:1: ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2240:1: ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2241:1: ( rule__StringProperty__MaxLengthAssignment_5_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getMaxLengthAssignment_5_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2242:1: ( rule__StringProperty__MaxLengthAssignment_5_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2242:2: rule__StringProperty__MaxLengthAssignment_5_1
            {
            pushFollow(FOLLOW_rule__StringProperty__MaxLengthAssignment_5_1_in_rule__StringProperty__Group_5__14447);
            rule__StringProperty__MaxLengthAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getMaxLengthAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group_5__1


    // $ANTLR start rule__StringProperty__Group_6__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2256:1: rule__StringProperty__Group_6__0 : ( 'regexp' ) rule__StringProperty__Group_6__1 ;
    public final void rule__StringProperty__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2260:1: ( ( 'regexp' ) rule__StringProperty__Group_6__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2261:1: ( 'regexp' ) rule__StringProperty__Group_6__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2261:1: ( 'regexp' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2262:1: 'regexp'
            {
             before(grammarAccess.getStringPropertyAccess().getRegexpKeyword_6_0()); 
            match(input,29,FOLLOW_29_in_rule__StringProperty__Group_6__04486); 
             after(grammarAccess.getStringPropertyAccess().getRegexpKeyword_6_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group_6__1_in_rule__StringProperty__Group_6__04496);
            rule__StringProperty__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group_6__0


    // $ANTLR start rule__StringProperty__Group_6__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2276:1: rule__StringProperty__Group_6__1 : ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) ) ;
    public final void rule__StringProperty__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2280:1: ( ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2281:1: ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2281:1: ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2282:1: ( rule__StringProperty__RegularExpressionAssignment_6_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getRegularExpressionAssignment_6_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2283:1: ( rule__StringProperty__RegularExpressionAssignment_6_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2283:2: rule__StringProperty__RegularExpressionAssignment_6_1
            {
            pushFollow(FOLLOW_rule__StringProperty__RegularExpressionAssignment_6_1_in_rule__StringProperty__Group_6__14524);
            rule__StringProperty__RegularExpressionAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getRegularExpressionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group_6__1


    // $ANTLR start rule__DateTimeProperty__Group__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2297:1: rule__DateTimeProperty__Group__0 : ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? ) rule__DateTimeProperty__Group__1 ;
    public final void rule__DateTimeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2301:1: ( ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? ) rule__DateTimeProperty__Group__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2302:1: ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? ) rule__DateTimeProperty__Group__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2302:1: ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2303:1: ( rule__DateTimeProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDateTimePropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2304:1: ( rule__DateTimeProperty__DescriptionAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2304:2: rule__DateTimeProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DateTimeProperty__DescriptionAssignment_0_in_rule__DateTimeProperty__Group__04562);
                    rule__DateTimeProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateTimePropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DateTimeProperty__Group__1_in_rule__DateTimeProperty__Group__04572);
            rule__DateTimeProperty__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__Group__0


    // $ANTLR start rule__DateTimeProperty__Group__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2315:1: rule__DateTimeProperty__Group__1 : ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) ) rule__DateTimeProperty__Group__2 ;
    public final void rule__DateTimeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2319:1: ( ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) ) rule__DateTimeProperty__Group__2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2320:1: ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) ) rule__DateTimeProperty__Group__2
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2320:1: ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2321:1: ( rule__DateTimeProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2322:1: ( rule__DateTimeProperty__DataTypeAssignment_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2322:2: rule__DateTimeProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DateTimeProperty__DataTypeAssignment_1_in_rule__DateTimeProperty__Group__14600);
            rule__DateTimeProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDateTimePropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DateTimeProperty__Group__2_in_rule__DateTimeProperty__Group__14609);
            rule__DateTimeProperty__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__Group__1


    // $ANTLR start rule__DateTimeProperty__Group__2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2333:1: rule__DateTimeProperty__Group__2 : ( ( rule__DateTimeProperty__NameAssignment_2 ) ) rule__DateTimeProperty__Group__3 ;
    public final void rule__DateTimeProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2337:1: ( ( ( rule__DateTimeProperty__NameAssignment_2 ) ) rule__DateTimeProperty__Group__3 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2338:1: ( ( rule__DateTimeProperty__NameAssignment_2 ) ) rule__DateTimeProperty__Group__3
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2338:1: ( ( rule__DateTimeProperty__NameAssignment_2 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2339:1: ( rule__DateTimeProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2340:1: ( rule__DateTimeProperty__NameAssignment_2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2340:2: rule__DateTimeProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DateTimeProperty__NameAssignment_2_in_rule__DateTimeProperty__Group__24637);
            rule__DateTimeProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDateTimePropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__DateTimeProperty__Group__3_in_rule__DateTimeProperty__Group__24646);
            rule__DateTimeProperty__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__Group__2


    // $ANTLR start rule__DateTimeProperty__Group__3
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2351:1: rule__DateTimeProperty__Group__3 : ( ( rule__DateTimeProperty__Group_3__0 )? ) ;
    public final void rule__DateTimeProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2355:1: ( ( ( rule__DateTimeProperty__Group_3__0 )? ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2356:1: ( ( rule__DateTimeProperty__Group_3__0 )? )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2356:1: ( ( rule__DateTimeProperty__Group_3__0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2357:1: ( rule__DateTimeProperty__Group_3__0 )?
            {
             before(grammarAccess.getDateTimePropertyAccess().getGroup_3()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2358:1: ( rule__DateTimeProperty__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2358:2: rule__DateTimeProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DateTimeProperty__Group_3__0_in_rule__DateTimeProperty__Group__34674);
                    rule__DateTimeProperty__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateTimePropertyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__Group__3


    // $ANTLR start rule__DateTimeProperty__Group_3__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2376:1: rule__DateTimeProperty__Group_3__0 : ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) ) rule__DateTimeProperty__Group_3__1 ;
    public final void rule__DateTimeProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2380:1: ( ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) ) rule__DateTimeProperty__Group_3__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2381:1: ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) ) rule__DateTimeProperty__Group_3__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2381:1: ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2382:1: ( rule__DateTimeProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2383:1: ( rule__DateTimeProperty__HasDefaultAssignment_3_0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2383:2: rule__DateTimeProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__DateTimeProperty__HasDefaultAssignment_3_0_in_rule__DateTimeProperty__Group_3__04717);
            rule__DateTimeProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getDateTimePropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__DateTimeProperty__Group_3__1_in_rule__DateTimeProperty__Group_3__04726);
            rule__DateTimeProperty__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__Group_3__0


    // $ANTLR start rule__DateTimeProperty__Group_3__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2394:1: rule__DateTimeProperty__Group_3__1 : ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__DateTimeProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2398:1: ( ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2399:1: ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2399:1: ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2400:1: ( rule__DateTimeProperty__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getDefaultValueAssignment_3_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2401:1: ( rule__DateTimeProperty__DefaultValueAssignment_3_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2401:2: rule__DateTimeProperty__DefaultValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DateTimeProperty__DefaultValueAssignment_3_1_in_rule__DateTimeProperty__Group_3__14754);
            rule__DateTimeProperty__DefaultValueAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getDateTimePropertyAccess().getDefaultValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__Group_3__1


    // $ANTLR start rule__IntegerProperty__Group__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2415:1: rule__IntegerProperty__Group__0 : ( ( rule__IntegerProperty__DescriptionAssignment_0 )? ) rule__IntegerProperty__Group__1 ;
    public final void rule__IntegerProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2419:1: ( ( ( rule__IntegerProperty__DescriptionAssignment_0 )? ) rule__IntegerProperty__Group__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2420:1: ( ( rule__IntegerProperty__DescriptionAssignment_0 )? ) rule__IntegerProperty__Group__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2420:1: ( ( rule__IntegerProperty__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2421:1: ( rule__IntegerProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2422:1: ( rule__IntegerProperty__DescriptionAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2422:2: rule__IntegerProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__IntegerProperty__DescriptionAssignment_0_in_rule__IntegerProperty__Group__04792);
                    rule__IntegerProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__1_in_rule__IntegerProperty__Group__04802);
            rule__IntegerProperty__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group__0


    // $ANTLR start rule__IntegerProperty__Group__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2433:1: rule__IntegerProperty__Group__1 : ( ( rule__IntegerProperty__DataTypeAssignment_1 ) ) rule__IntegerProperty__Group__2 ;
    public final void rule__IntegerProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2437:1: ( ( ( rule__IntegerProperty__DataTypeAssignment_1 ) ) rule__IntegerProperty__Group__2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2438:1: ( ( rule__IntegerProperty__DataTypeAssignment_1 ) ) rule__IntegerProperty__Group__2
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2438:1: ( ( rule__IntegerProperty__DataTypeAssignment_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2439:1: ( rule__IntegerProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2440:1: ( rule__IntegerProperty__DataTypeAssignment_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2440:2: rule__IntegerProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__IntegerProperty__DataTypeAssignment_1_in_rule__IntegerProperty__Group__14830);
            rule__IntegerProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__2_in_rule__IntegerProperty__Group__14839);
            rule__IntegerProperty__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group__1


    // $ANTLR start rule__IntegerProperty__Group__2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2451:1: rule__IntegerProperty__Group__2 : ( ( rule__IntegerProperty__NameAssignment_2 ) ) rule__IntegerProperty__Group__3 ;
    public final void rule__IntegerProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2455:1: ( ( ( rule__IntegerProperty__NameAssignment_2 ) ) rule__IntegerProperty__Group__3 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2456:1: ( ( rule__IntegerProperty__NameAssignment_2 ) ) rule__IntegerProperty__Group__3
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2456:1: ( ( rule__IntegerProperty__NameAssignment_2 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2457:1: ( rule__IntegerProperty__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2458:1: ( rule__IntegerProperty__NameAssignment_2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2458:2: rule__IntegerProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__IntegerProperty__NameAssignment_2_in_rule__IntegerProperty__Group__24867);
            rule__IntegerProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__3_in_rule__IntegerProperty__Group__24876);
            rule__IntegerProperty__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group__2


    // $ANTLR start rule__IntegerProperty__Group__3
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2469:1: rule__IntegerProperty__Group__3 : ( ( rule__IntegerProperty__Group_3__0 )? ) rule__IntegerProperty__Group__4 ;
    public final void rule__IntegerProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2473:1: ( ( ( rule__IntegerProperty__Group_3__0 )? ) rule__IntegerProperty__Group__4 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2474:1: ( ( rule__IntegerProperty__Group_3__0 )? ) rule__IntegerProperty__Group__4
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2474:1: ( ( rule__IntegerProperty__Group_3__0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2475:1: ( rule__IntegerProperty__Group_3__0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup_3()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2476:1: ( rule__IntegerProperty__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2476:2: rule__IntegerProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__IntegerProperty__Group_3__0_in_rule__IntegerProperty__Group__34904);
                    rule__IntegerProperty__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerPropertyAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__4_in_rule__IntegerProperty__Group__34914);
            rule__IntegerProperty__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group__3


    // $ANTLR start rule__IntegerProperty__Group__4
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2487:1: rule__IntegerProperty__Group__4 : ( ( rule__IntegerProperty__Group_4__0 )? ) rule__IntegerProperty__Group__5 ;
    public final void rule__IntegerProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2491:1: ( ( ( rule__IntegerProperty__Group_4__0 )? ) rule__IntegerProperty__Group__5 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2492:1: ( ( rule__IntegerProperty__Group_4__0 )? ) rule__IntegerProperty__Group__5
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2492:1: ( ( rule__IntegerProperty__Group_4__0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2493:1: ( rule__IntegerProperty__Group_4__0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup_4()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2494:1: ( rule__IntegerProperty__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==30) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2494:2: rule__IntegerProperty__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__IntegerProperty__Group_4__0_in_rule__IntegerProperty__Group__44942);
                    rule__IntegerProperty__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerPropertyAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__5_in_rule__IntegerProperty__Group__44952);
            rule__IntegerProperty__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group__4


    // $ANTLR start rule__IntegerProperty__Group__5
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2505:1: rule__IntegerProperty__Group__5 : ( ( rule__IntegerProperty__Group_5__0 )? ) ;
    public final void rule__IntegerProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2509:1: ( ( ( rule__IntegerProperty__Group_5__0 )? ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2510:1: ( ( rule__IntegerProperty__Group_5__0 )? )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2510:1: ( ( rule__IntegerProperty__Group_5__0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2511:1: ( rule__IntegerProperty__Group_5__0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup_5()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2512:1: ( rule__IntegerProperty__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==31) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2512:2: rule__IntegerProperty__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__IntegerProperty__Group_5__0_in_rule__IntegerProperty__Group__54980);
                    rule__IntegerProperty__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerPropertyAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group__5


    // $ANTLR start rule__IntegerProperty__Group_3__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2534:1: rule__IntegerProperty__Group_3__0 : ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) ) rule__IntegerProperty__Group_3__1 ;
    public final void rule__IntegerProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2538:1: ( ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) ) rule__IntegerProperty__Group_3__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2539:1: ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) ) rule__IntegerProperty__Group_3__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2539:1: ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2540:1: ( rule__IntegerProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2541:1: ( rule__IntegerProperty__HasDefaultAssignment_3_0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2541:2: rule__IntegerProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__IntegerProperty__HasDefaultAssignment_3_0_in_rule__IntegerProperty__Group_3__05027);
            rule__IntegerProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group_3__1_in_rule__IntegerProperty__Group_3__05036);
            rule__IntegerProperty__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group_3__0


    // $ANTLR start rule__IntegerProperty__Group_3__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2552:1: rule__IntegerProperty__Group_3__1 : ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__IntegerProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2556:1: ( ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2557:1: ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2557:1: ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2558:1: ( rule__IntegerProperty__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getDefaultValueAssignment_3_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2559:1: ( rule__IntegerProperty__DefaultValueAssignment_3_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2559:2: rule__IntegerProperty__DefaultValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__IntegerProperty__DefaultValueAssignment_3_1_in_rule__IntegerProperty__Group_3__15064);
            rule__IntegerProperty__DefaultValueAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getDefaultValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group_3__1


    // $ANTLR start rule__IntegerProperty__Group_4__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2573:1: rule__IntegerProperty__Group_4__0 : ( 'min' ) rule__IntegerProperty__Group_4__1 ;
    public final void rule__IntegerProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2577:1: ( ( 'min' ) rule__IntegerProperty__Group_4__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2578:1: ( 'min' ) rule__IntegerProperty__Group_4__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2578:1: ( 'min' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2579:1: 'min'
            {
             before(grammarAccess.getIntegerPropertyAccess().getMinKeyword_4_0()); 
            match(input,30,FOLLOW_30_in_rule__IntegerProperty__Group_4__05103); 
             after(grammarAccess.getIntegerPropertyAccess().getMinKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group_4__1_in_rule__IntegerProperty__Group_4__05113);
            rule__IntegerProperty__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group_4__0


    // $ANTLR start rule__IntegerProperty__Group_4__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2593:1: rule__IntegerProperty__Group_4__1 : ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) ) ;
    public final void rule__IntegerProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2597:1: ( ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2598:1: ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2598:1: ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2599:1: ( rule__IntegerProperty__MinValueAssignment_4_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getMinValueAssignment_4_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2600:1: ( rule__IntegerProperty__MinValueAssignment_4_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2600:2: rule__IntegerProperty__MinValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__IntegerProperty__MinValueAssignment_4_1_in_rule__IntegerProperty__Group_4__15141);
            rule__IntegerProperty__MinValueAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getMinValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group_4__1


    // $ANTLR start rule__IntegerProperty__Group_5__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2614:1: rule__IntegerProperty__Group_5__0 : ( 'max' ) rule__IntegerProperty__Group_5__1 ;
    public final void rule__IntegerProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2618:1: ( ( 'max' ) rule__IntegerProperty__Group_5__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2619:1: ( 'max' ) rule__IntegerProperty__Group_5__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2619:1: ( 'max' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2620:1: 'max'
            {
             before(grammarAccess.getIntegerPropertyAccess().getMaxKeyword_5_0()); 
            match(input,31,FOLLOW_31_in_rule__IntegerProperty__Group_5__05180); 
             after(grammarAccess.getIntegerPropertyAccess().getMaxKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group_5__1_in_rule__IntegerProperty__Group_5__05190);
            rule__IntegerProperty__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group_5__0


    // $ANTLR start rule__IntegerProperty__Group_5__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2634:1: rule__IntegerProperty__Group_5__1 : ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) ) ;
    public final void rule__IntegerProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2638:1: ( ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2639:1: ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2639:1: ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2640:1: ( rule__IntegerProperty__MaxValueAssignment_5_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getMaxValueAssignment_5_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2641:1: ( rule__IntegerProperty__MaxValueAssignment_5_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2641:2: rule__IntegerProperty__MaxValueAssignment_5_1
            {
            pushFollow(FOLLOW_rule__IntegerProperty__MaxValueAssignment_5_1_in_rule__IntegerProperty__Group_5__15218);
            rule__IntegerProperty__MaxValueAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getMaxValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group_5__1


    // $ANTLR start rule__DecimalProperty__Group__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2655:1: rule__DecimalProperty__Group__0 : ( ( rule__DecimalProperty__DescriptionAssignment_0 )? ) rule__DecimalProperty__Group__1 ;
    public final void rule__DecimalProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2659:1: ( ( ( rule__DecimalProperty__DescriptionAssignment_0 )? ) rule__DecimalProperty__Group__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2660:1: ( ( rule__DecimalProperty__DescriptionAssignment_0 )? ) rule__DecimalProperty__Group__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2660:1: ( ( rule__DecimalProperty__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2661:1: ( rule__DecimalProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDecimalPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2662:1: ( rule__DecimalProperty__DescriptionAssignment_0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2662:2: rule__DecimalProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DecimalProperty__DescriptionAssignment_0_in_rule__DecimalProperty__Group__05256);
                    rule__DecimalProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DecimalProperty__Group__1_in_rule__DecimalProperty__Group__05266);
            rule__DecimalProperty__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalProperty__Group__0


    // $ANTLR start rule__DecimalProperty__Group__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2673:1: rule__DecimalProperty__Group__1 : ( ( rule__DecimalProperty__DataTypeAssignment_1 ) ) rule__DecimalProperty__Group__2 ;
    public final void rule__DecimalProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2677:1: ( ( ( rule__DecimalProperty__DataTypeAssignment_1 ) ) rule__DecimalProperty__Group__2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2678:1: ( ( rule__DecimalProperty__DataTypeAssignment_1 ) ) rule__DecimalProperty__Group__2
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2678:1: ( ( rule__DecimalProperty__DataTypeAssignment_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2679:1: ( rule__DecimalProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDecimalPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2680:1: ( rule__DecimalProperty__DataTypeAssignment_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2680:2: rule__DecimalProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DecimalProperty__DataTypeAssignment_1_in_rule__DecimalProperty__Group__15294);
            rule__DecimalProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDecimalPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DecimalProperty__Group__2_in_rule__DecimalProperty__Group__15303);
            rule__DecimalProperty__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalProperty__Group__1


    // $ANTLR start rule__DecimalProperty__Group__2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2691:1: rule__DecimalProperty__Group__2 : ( ( rule__DecimalProperty__NameAssignment_2 ) ) ;
    public final void rule__DecimalProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2695:1: ( ( ( rule__DecimalProperty__NameAssignment_2 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2696:1: ( ( rule__DecimalProperty__NameAssignment_2 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2696:1: ( ( rule__DecimalProperty__NameAssignment_2 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2697:1: ( rule__DecimalProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDecimalPropertyAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2698:1: ( rule__DecimalProperty__NameAssignment_2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2698:2: rule__DecimalProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DecimalProperty__NameAssignment_2_in_rule__DecimalProperty__Group__25331);
            rule__DecimalProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDecimalPropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalProperty__Group__2


    // $ANTLR start rule__EnumerationProperty__Group__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2714:1: rule__EnumerationProperty__Group__0 : ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? ) rule__EnumerationProperty__Group__1 ;
    public final void rule__EnumerationProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2718:1: ( ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? ) rule__EnumerationProperty__Group__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2719:1: ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? ) rule__EnumerationProperty__Group__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2719:1: ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2720:1: ( rule__EnumerationProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumerationPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2721:1: ( rule__EnumerationProperty__DescriptionAssignment_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2721:2: rule__EnumerationProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EnumerationProperty__DescriptionAssignment_0_in_rule__EnumerationProperty__Group__05371);
                    rule__EnumerationProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationProperty__Group__1_in_rule__EnumerationProperty__Group__05381);
            rule__EnumerationProperty__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__Group__0


    // $ANTLR start rule__EnumerationProperty__Group__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2732:1: rule__EnumerationProperty__Group__1 : ( ( rule__EnumerationProperty__TypeAssignment_1 ) ) rule__EnumerationProperty__Group__2 ;
    public final void rule__EnumerationProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2736:1: ( ( ( rule__EnumerationProperty__TypeAssignment_1 ) ) rule__EnumerationProperty__Group__2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2737:1: ( ( rule__EnumerationProperty__TypeAssignment_1 ) ) rule__EnumerationProperty__Group__2
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2737:1: ( ( rule__EnumerationProperty__TypeAssignment_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2738:1: ( rule__EnumerationProperty__TypeAssignment_1 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getTypeAssignment_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2739:1: ( rule__EnumerationProperty__TypeAssignment_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2739:2: rule__EnumerationProperty__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumerationProperty__TypeAssignment_1_in_rule__EnumerationProperty__Group__15409);
            rule__EnumerationProperty__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEnumerationPropertyAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__EnumerationProperty__Group__2_in_rule__EnumerationProperty__Group__15418);
            rule__EnumerationProperty__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__Group__1


    // $ANTLR start rule__EnumerationProperty__Group__2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2750:1: rule__EnumerationProperty__Group__2 : ( ( rule__EnumerationProperty__NameAssignment_2 ) ) rule__EnumerationProperty__Group__3 ;
    public final void rule__EnumerationProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2754:1: ( ( ( rule__EnumerationProperty__NameAssignment_2 ) ) rule__EnumerationProperty__Group__3 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2755:1: ( ( rule__EnumerationProperty__NameAssignment_2 ) ) rule__EnumerationProperty__Group__3
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2755:1: ( ( rule__EnumerationProperty__NameAssignment_2 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2756:1: ( rule__EnumerationProperty__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2757:1: ( rule__EnumerationProperty__NameAssignment_2 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2757:2: rule__EnumerationProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumerationProperty__NameAssignment_2_in_rule__EnumerationProperty__Group__25446);
            rule__EnumerationProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEnumerationPropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__EnumerationProperty__Group__3_in_rule__EnumerationProperty__Group__25455);
            rule__EnumerationProperty__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__Group__2


    // $ANTLR start rule__EnumerationProperty__Group__3
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2768:1: rule__EnumerationProperty__Group__3 : ( ( rule__EnumerationProperty__Group_3__0 )? ) ;
    public final void rule__EnumerationProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2772:1: ( ( ( rule__EnumerationProperty__Group_3__0 )? ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2773:1: ( ( rule__EnumerationProperty__Group_3__0 )? )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2773:1: ( ( rule__EnumerationProperty__Group_3__0 )? )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2774:1: ( rule__EnumerationProperty__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationPropertyAccess().getGroup_3()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2775:1: ( rule__EnumerationProperty__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2775:2: rule__EnumerationProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EnumerationProperty__Group_3__0_in_rule__EnumerationProperty__Group__35483);
                    rule__EnumerationProperty__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationPropertyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__Group__3


    // $ANTLR start rule__EnumerationProperty__Group_3__0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2793:1: rule__EnumerationProperty__Group_3__0 : ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) ) rule__EnumerationProperty__Group_3__1 ;
    public final void rule__EnumerationProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2797:1: ( ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) ) rule__EnumerationProperty__Group_3__1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2798:1: ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) ) rule__EnumerationProperty__Group_3__1
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2798:1: ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2799:1: ( rule__EnumerationProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2800:1: ( rule__EnumerationProperty__HasDefaultAssignment_3_0 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2800:2: rule__EnumerationProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__EnumerationProperty__HasDefaultAssignment_3_0_in_rule__EnumerationProperty__Group_3__05526);
            rule__EnumerationProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationPropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationProperty__Group_3__1_in_rule__EnumerationProperty__Group_3__05535);
            rule__EnumerationProperty__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__Group_3__0


    // $ANTLR start rule__EnumerationProperty__Group_3__1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2811:1: rule__EnumerationProperty__Group_3__1 : ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) ) ;
    public final void rule__EnumerationProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2815:1: ( ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2816:1: ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2816:1: ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2817:1: ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getDefaultValueAsStringAssignment_3_1()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2818:1: ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2818:2: rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1_in_rule__EnumerationProperty__Group_3__15563);
            rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getEnumerationPropertyAccess().getDefaultValueAsStringAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__Group_3__1


    // $ANTLR start rule__BusinessDomainModel__DescriptionAssignment_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2832:1: rule__BusinessDomainModel__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessDomainModel__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2836:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2837:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2837:1: ( RULE_STRING )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2838:1: RULE_STRING
            {
             before(grammarAccess.getBusinessDomainModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BusinessDomainModel__DescriptionAssignment_05601); 
             after(grammarAccess.getBusinessDomainModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__DescriptionAssignment_0


    // $ANTLR start rule__BusinessDomainModel__NameAssignment_2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2847:1: rule__BusinessDomainModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessDomainModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2851:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2852:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2852:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2853:1: RULE_ID
            {
             before(grammarAccess.getBusinessDomainModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessDomainModel__NameAssignment_25632); 
             after(grammarAccess.getBusinessDomainModelAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__NameAssignment_2


    // $ANTLR start rule__BusinessDomainModel__TypesAssignment_4_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2862:1: rule__BusinessDomainModel__TypesAssignment_4_0 : ( ruleBusinessClass ) ;
    public final void rule__BusinessDomainModel__TypesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2866:1: ( ( ruleBusinessClass ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2867:1: ( ruleBusinessClass )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2867:1: ( ruleBusinessClass )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2868:1: ruleBusinessClass
            {
             before(grammarAccess.getBusinessDomainModelAccess().getTypesBusinessClassParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleBusinessClass_in_rule__BusinessDomainModel__TypesAssignment_4_05663);
            ruleBusinessClass();
            _fsp--;

             after(grammarAccess.getBusinessDomainModelAccess().getTypesBusinessClassParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__TypesAssignment_4_0


    // $ANTLR start rule__BusinessDomainModel__EnumerationsAssignment_4_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2877:1: rule__BusinessDomainModel__EnumerationsAssignment_4_1 : ( ruleEnumeration ) ;
    public final void rule__BusinessDomainModel__EnumerationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2881:1: ( ( ruleEnumeration ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2882:1: ( ruleEnumeration )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2882:1: ( ruleEnumeration )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2883:1: ruleEnumeration
            {
             before(grammarAccess.getBusinessDomainModelAccess().getEnumerationsEnumerationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleEnumeration_in_rule__BusinessDomainModel__EnumerationsAssignment_4_15694);
            ruleEnumeration();
            _fsp--;

             after(grammarAccess.getBusinessDomainModelAccess().getEnumerationsEnumerationParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__EnumerationsAssignment_4_1


    // $ANTLR start rule__BusinessDomainModel__AssociationsAssignment_4_2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2892:1: rule__BusinessDomainModel__AssociationsAssignment_4_2 : ( ruleAssociation ) ;
    public final void rule__BusinessDomainModel__AssociationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2896:1: ( ( ruleAssociation ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2897:1: ( ruleAssociation )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2897:1: ( ruleAssociation )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2898:1: ruleAssociation
            {
             before(grammarAccess.getBusinessDomainModelAccess().getAssociationsAssociationParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleAssociation_in_rule__BusinessDomainModel__AssociationsAssignment_4_25725);
            ruleAssociation();
            _fsp--;

             after(grammarAccess.getBusinessDomainModelAccess().getAssociationsAssociationParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__AssociationsAssignment_4_2


    // $ANTLR start rule__Association__DescriptionAssignment_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2907:1: rule__Association__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Association__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2911:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2912:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2912:1: ( RULE_STRING )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2913:1: RULE_STRING
            {
             before(grammarAccess.getAssociationAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Association__DescriptionAssignment_05756); 
             after(grammarAccess.getAssociationAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__DescriptionAssignment_0


    // $ANTLR start rule__Association__SourceAssignment_2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2922:1: rule__Association__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Association__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2926:1: ( ( ( RULE_ID ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2927:1: ( ( RULE_ID ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2927:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2928:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getSourceBusinessClassCrossReference_2_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2929:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2930:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceBusinessClassIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_25791); 
             after(grammarAccess.getAssociationAccess().getSourceBusinessClassIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getSourceBusinessClassCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__SourceAssignment_2


    // $ANTLR start rule__Association__SourceRoleNameAssignment_3
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2941:1: rule__Association__SourceRoleNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Association__SourceRoleNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2945:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2946:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2946:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2947:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceRoleNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__SourceRoleNameAssignment_35826); 
             after(grammarAccess.getAssociationAccess().getSourceRoleNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__SourceRoleNameAssignment_3


    // $ANTLR start rule__Association__SourceMultiplicityAssignment_4
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2956:1: rule__Association__SourceMultiplicityAssignment_4 : ( ruleMultiplicity ) ;
    public final void rule__Association__SourceMultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2960:1: ( ( ruleMultiplicity ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2961:1: ( ruleMultiplicity )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2961:1: ( ruleMultiplicity )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2962:1: ruleMultiplicity
            {
             before(grammarAccess.getAssociationAccess().getSourceMultiplicityMultiplicityEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMultiplicity_in_rule__Association__SourceMultiplicityAssignment_45857);
            ruleMultiplicity();
            _fsp--;

             after(grammarAccess.getAssociationAccess().getSourceMultiplicityMultiplicityEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__SourceMultiplicityAssignment_4


    // $ANTLR start rule__Association__BidirectionalAssignment_5_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2971:1: rule__Association__BidirectionalAssignment_5_0 : ( ( '<->' ) ) ;
    public final void rule__Association__BidirectionalAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2975:1: ( ( ( '<->' ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2976:1: ( ( '<->' ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2976:1: ( ( '<->' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2977:1: ( '<->' )
            {
             before(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_5_0_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2978:1: ( '<->' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2979:1: '<->'
            {
             before(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_5_0_0()); 
            match(input,32,FOLLOW_32_in_rule__Association__BidirectionalAssignment_5_05893); 
             after(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_5_0_0()); 

            }

             after(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__BidirectionalAssignment_5_0


    // $ANTLR start rule__Association__TargetMultiplicityAssignment_6
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2994:1: rule__Association__TargetMultiplicityAssignment_6 : ( ruleMultiplicity ) ;
    public final void rule__Association__TargetMultiplicityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2998:1: ( ( ruleMultiplicity ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2999:1: ( ruleMultiplicity )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2999:1: ( ruleMultiplicity )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3000:1: ruleMultiplicity
            {
             before(grammarAccess.getAssociationAccess().getTargetMultiplicityMultiplicityEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleMultiplicity_in_rule__Association__TargetMultiplicityAssignment_65932);
            ruleMultiplicity();
            _fsp--;

             after(grammarAccess.getAssociationAccess().getTargetMultiplicityMultiplicityEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__TargetMultiplicityAssignment_6


    // $ANTLR start rule__Association__TargetAssignment_7
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3009:1: rule__Association__TargetAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Association__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3013:1: ( ( ( RULE_ID ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3014:1: ( ( RULE_ID ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3014:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3015:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassCrossReference_7_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3016:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3017:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_75967); 
             after(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__TargetAssignment_7


    // $ANTLR start rule__Association__TargetRoleNameAssignment_8
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3028:1: rule__Association__TargetRoleNameAssignment_8 : ( RULE_ID ) ;
    public final void rule__Association__TargetRoleNameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3032:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3033:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3033:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3034:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetRoleNameIDTerminalRuleCall_8_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__TargetRoleNameAssignment_86002); 
             after(grammarAccess.getAssociationAccess().getTargetRoleNameIDTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__TargetRoleNameAssignment_8


    // $ANTLR start rule__Association__OrderedAssignment_9
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3043:1: rule__Association__OrderedAssignment_9 : ( ( 'ordered' ) ) ;
    public final void rule__Association__OrderedAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3047:1: ( ( ( 'ordered' ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3048:1: ( ( 'ordered' ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3048:1: ( ( 'ordered' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3049:1: ( 'ordered' )
            {
             before(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_9_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3050:1: ( 'ordered' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3051:1: 'ordered'
            {
             before(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_9_0()); 
            match(input,33,FOLLOW_33_in_rule__Association__OrderedAssignment_96038); 
             after(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_9_0()); 

            }

             after(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__OrderedAssignment_9


    // $ANTLR start rule__BusinessClass__DescriptionAssignment_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3066:1: rule__BusinessClass__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessClass__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3070:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3071:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3071:1: ( RULE_STRING )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3072:1: RULE_STRING
            {
             before(grammarAccess.getBusinessClassAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BusinessClass__DescriptionAssignment_06077); 
             after(grammarAccess.getBusinessClassAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__DescriptionAssignment_0


    // $ANTLR start rule__BusinessClass__NameAssignment_2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3081:1: rule__BusinessClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3085:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3086:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3086:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3087:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClass__NameAssignment_26108); 
             after(grammarAccess.getBusinessClassAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__NameAssignment_2


    // $ANTLR start rule__BusinessClass__SuperclassAssignment_3_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3096:1: rule__BusinessClass__SuperclassAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__BusinessClass__SuperclassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3100:1: ( ( ( RULE_ID ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3101:1: ( ( RULE_ID ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3101:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3102:1: ( RULE_ID )
            {
             before(grammarAccess.getBusinessClassAccess().getSuperclassBusinessClassCrossReference_3_1_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3103:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3104:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassAccess().getSuperclassBusinessClassIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClass__SuperclassAssignment_3_16143); 
             after(grammarAccess.getBusinessClassAccess().getSuperclassBusinessClassIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getBusinessClassAccess().getSuperclassBusinessClassCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__SuperclassAssignment_3_1


    // $ANTLR start rule__BusinessClass__PropertiesAssignment_5
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3115:1: rule__BusinessClass__PropertiesAssignment_5 : ( ruleProperty ) ;
    public final void rule__BusinessClass__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3119:1: ( ( ruleProperty ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3120:1: ( ruleProperty )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3120:1: ( ruleProperty )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3121:1: ruleProperty
            {
             before(grammarAccess.getBusinessClassAccess().getPropertiesPropertyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__BusinessClass__PropertiesAssignment_56178);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getBusinessClassAccess().getPropertiesPropertyParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__PropertiesAssignment_5


    // $ANTLR start rule__BusinessClass__BusinessRulesAssignment_6_2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3130:1: rule__BusinessClass__BusinessRulesAssignment_6_2 : ( ruleAbstractBusinessRule ) ;
    public final void rule__BusinessClass__BusinessRulesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3134:1: ( ( ruleAbstractBusinessRule ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3135:1: ( ruleAbstractBusinessRule )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3135:1: ( ruleAbstractBusinessRule )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3136:1: ruleAbstractBusinessRule
            {
             before(grammarAccess.getBusinessClassAccess().getBusinessRulesAbstractBusinessRuleParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_ruleAbstractBusinessRule_in_rule__BusinessClass__BusinessRulesAssignment_6_26209);
            ruleAbstractBusinessRule();
            _fsp--;

             after(grammarAccess.getBusinessClassAccess().getBusinessRulesAbstractBusinessRuleParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__BusinessRulesAssignment_6_2


    // $ANTLR start rule__Enumeration__DescriptionAssignment_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3145:1: rule__Enumeration__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Enumeration__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3149:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3150:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3150:1: ( RULE_STRING )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3151:1: RULE_STRING
            {
             before(grammarAccess.getEnumerationAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Enumeration__DescriptionAssignment_06240); 
             after(grammarAccess.getEnumerationAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__DescriptionAssignment_0


    // $ANTLR start rule__Enumeration__NameAssignment_2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3160:1: rule__Enumeration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3164:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3165:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3165:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3166:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_26271); 
             after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__NameAssignment_2


    // $ANTLR start rule__Enumeration__EnumerationLiteralsAssignment_4
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3175:1: rule__Enumeration__EnumerationLiteralsAssignment_4 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__EnumerationLiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3179:1: ( ( ruleEnumerationLiteral ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3180:1: ( ruleEnumerationLiteral )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3180:1: ( ruleEnumerationLiteral )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3181:1: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__EnumerationLiteralsAssignment_46302);
            ruleEnumerationLiteral();
            _fsp--;

             after(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__EnumerationLiteralsAssignment_4


    // $ANTLR start rule__EnumerationLiteral__NameAssignment_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3190:1: rule__EnumerationLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3194:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3195:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3195:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3196:1: RULE_ID
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_06333); 
             after(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationLiteral__NameAssignment_0


    // $ANTLR start rule__EnumerationLiteral__PersistedValueAssignment_1_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3205:1: rule__EnumerationLiteral__PersistedValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EnumerationLiteral__PersistedValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3209:1: ( ( RULE_INT ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3210:1: ( RULE_INT )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3210:1: ( RULE_INT )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3211:1: RULE_INT
            {
             before(grammarAccess.getEnumerationLiteralAccess().getPersistedValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumerationLiteral__PersistedValueAssignment_1_16364); 
             after(grammarAccess.getEnumerationLiteralAccess().getPersistedValueINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationLiteral__PersistedValueAssignment_1_1


    // $ANTLR start rule__BusinessRule__DescriptionAssignment_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3220:1: rule__BusinessRule__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessRule__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3224:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3225:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3225:1: ( RULE_STRING )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3226:1: RULE_STRING
            {
             before(grammarAccess.getBusinessRuleAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BusinessRule__DescriptionAssignment_06395); 
             after(grammarAccess.getBusinessRuleAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessRule__DescriptionAssignment_0


    // $ANTLR start rule__BusinessRule__NameAssignment_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3235:1: rule__BusinessRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BusinessRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3239:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3240:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3240:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3241:1: RULE_ID
            {
             before(grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessRule__NameAssignment_16426); 
             after(grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessRule__NameAssignment_1


    // $ANTLR start rule__UniqueRule__DescriptionAssignment_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3250:1: rule__UniqueRule__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__UniqueRule__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3254:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3255:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3255:1: ( RULE_STRING )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3256:1: RULE_STRING
            {
             before(grammarAccess.getUniqueRuleAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UniqueRule__DescriptionAssignment_06457); 
             after(grammarAccess.getUniqueRuleAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__DescriptionAssignment_0


    // $ANTLR start rule__UniqueRule__NameAssignment_2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3265:1: rule__UniqueRule__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__UniqueRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3269:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3270:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3270:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3271:1: RULE_ID
            {
             before(grammarAccess.getUniqueRuleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UniqueRule__NameAssignment_26488); 
             after(grammarAccess.getUniqueRuleAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__NameAssignment_2


    // $ANTLR start rule__UniqueRule__PropertiesAssignment_4
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3280:1: rule__UniqueRule__PropertiesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__UniqueRule__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3284:1: ( ( ( RULE_ID ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3285:1: ( ( RULE_ID ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3285:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3286:1: ( RULE_ID )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_4_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3287:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3288:1: RULE_ID
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UniqueRule__PropertiesAssignment_46523); 
             after(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__PropertiesAssignment_4


    // $ANTLR start rule__UniqueRule__PropertiesAssignment_5_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3299:1: rule__UniqueRule__PropertiesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__UniqueRule__PropertiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3303:1: ( ( ( RULE_ID ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3304:1: ( ( RULE_ID ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3304:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3305:1: ( RULE_ID )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_5_1_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3306:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3307:1: RULE_ID
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UniqueRule__PropertiesAssignment_5_16562); 
             after(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__PropertiesAssignment_5_1


    // $ANTLR start rule__Property__NullableAssignment_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3318:1: rule__Property__NullableAssignment_1 : ( ( 'nullable' ) ) ;
    public final void rule__Property__NullableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3322:1: ( ( ( 'nullable' ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3323:1: ( ( 'nullable' ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3323:1: ( ( 'nullable' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3324:1: ( 'nullable' )
            {
             before(grammarAccess.getPropertyAccess().getNullableNullableKeyword_1_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3325:1: ( 'nullable' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3326:1: 'nullable'
            {
             before(grammarAccess.getPropertyAccess().getNullableNullableKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__Property__NullableAssignment_16602); 
             after(grammarAccess.getPropertyAccess().getNullableNullableKeyword_1_0()); 

            }

             after(grammarAccess.getPropertyAccess().getNullableNullableKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__NullableAssignment_1


    // $ANTLR start rule__Property__DerivedAssignment_2_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3341:1: rule__Property__DerivedAssignment_2_0 : ( ( 'derived' ) ) ;
    public final void rule__Property__DerivedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3345:1: ( ( ( 'derived' ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3346:1: ( ( 'derived' ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3346:1: ( ( 'derived' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3347:1: ( 'derived' )
            {
             before(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_2_0_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3348:1: ( 'derived' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3349:1: 'derived'
            {
             before(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_2_0_0()); 
            match(input,35,FOLLOW_35_in_rule__Property__DerivedAssignment_2_06646); 
             after(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_2_0_0()); 

            }

             after(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__DerivedAssignment_2_0


    // $ANTLR start rule__Property__WritableAssignment_2_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3364:1: rule__Property__WritableAssignment_2_1 : ( ( 'writable' ) ) ;
    public final void rule__Property__WritableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3368:1: ( ( ( 'writable' ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3369:1: ( ( 'writable' ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3369:1: ( ( 'writable' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3370:1: ( 'writable' )
            {
             before(grammarAccess.getPropertyAccess().getWritableWritableKeyword_2_1_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3371:1: ( 'writable' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3372:1: 'writable'
            {
             before(grammarAccess.getPropertyAccess().getWritableWritableKeyword_2_1_0()); 
            match(input,36,FOLLOW_36_in_rule__Property__WritableAssignment_2_16690); 
             after(grammarAccess.getPropertyAccess().getWritableWritableKeyword_2_1_0()); 

            }

             after(grammarAccess.getPropertyAccess().getWritableWritableKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__WritableAssignment_2_1


    // $ANTLR start rule__BoolProperty__DescriptionAssignment_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3387:1: rule__BoolProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BoolProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3391:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3392:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3392:1: ( RULE_STRING )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3393:1: RULE_STRING
            {
             before(grammarAccess.getBoolPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BoolProperty__DescriptionAssignment_06729); 
             after(grammarAccess.getBoolPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__DescriptionAssignment_0


    // $ANTLR start rule__BoolProperty__DataTypeAssignment_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3402:1: rule__BoolProperty__DataTypeAssignment_1 : ( ( 'boolean' ) ) ;
    public final void rule__BoolProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3406:1: ( ( ( 'boolean' ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3407:1: ( ( 'boolean' ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3407:1: ( ( 'boolean' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3408:1: ( 'boolean' )
            {
             before(grammarAccess.getBoolPropertyAccess().getDataTypeBooleanKeyword_1_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3409:1: ( 'boolean' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3410:1: 'boolean'
            {
             before(grammarAccess.getBoolPropertyAccess().getDataTypeBooleanKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__BoolProperty__DataTypeAssignment_16765); 
             after(grammarAccess.getBoolPropertyAccess().getDataTypeBooleanKeyword_1_0()); 

            }

             after(grammarAccess.getBoolPropertyAccess().getDataTypeBooleanKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__DataTypeAssignment_1


    // $ANTLR start rule__BoolProperty__NameAssignment_2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3425:1: rule__BoolProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BoolProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3429:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3430:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3430:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3431:1: RULE_ID
            {
             before(grammarAccess.getBoolPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BoolProperty__NameAssignment_26804); 
             after(grammarAccess.getBoolPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__NameAssignment_2


    // $ANTLR start rule__BoolProperty__HasDefaultAssignment_3_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3440:1: rule__BoolProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__BoolProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3444:1: ( ( ( 'default' ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3445:1: ( ( 'default' ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3445:1: ( ( 'default' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3446:1: ( 'default' )
            {
             before(grammarAccess.getBoolPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3447:1: ( 'default' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3448:1: 'default'
            {
             before(grammarAccess.getBoolPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,38,FOLLOW_38_in_rule__BoolProperty__HasDefaultAssignment_3_06840); 
             after(grammarAccess.getBoolPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }

             after(grammarAccess.getBoolPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__HasDefaultAssignment_3_0


    // $ANTLR start rule__BoolProperty__DefaultValueAssignment_3_1_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3463:1: rule__BoolProperty__DefaultValueAssignment_3_1_0 : ( ( 'true' ) ) ;
    public final void rule__BoolProperty__DefaultValueAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3467:1: ( ( ( 'true' ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3468:1: ( ( 'true' ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3468:1: ( ( 'true' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3469:1: ( 'true' )
            {
             before(grammarAccess.getBoolPropertyAccess().getDefaultValueTrueKeyword_3_1_0_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3470:1: ( 'true' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3471:1: 'true'
            {
             before(grammarAccess.getBoolPropertyAccess().getDefaultValueTrueKeyword_3_1_0_0()); 
            match(input,39,FOLLOW_39_in_rule__BoolProperty__DefaultValueAssignment_3_1_06884); 
             after(grammarAccess.getBoolPropertyAccess().getDefaultValueTrueKeyword_3_1_0_0()); 

            }

             after(grammarAccess.getBoolPropertyAccess().getDefaultValueTrueKeyword_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__DefaultValueAssignment_3_1_0


    // $ANTLR start rule__StringProperty__DescriptionAssignment_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3486:1: rule__StringProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__StringProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3490:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3491:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3491:1: ( RULE_STRING )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3492:1: RULE_STRING
            {
             before(grammarAccess.getStringPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringProperty__DescriptionAssignment_06923); 
             after(grammarAccess.getStringPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__DescriptionAssignment_0


    // $ANTLR start rule__StringProperty__DataTypeAssignment_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3501:1: rule__StringProperty__DataTypeAssignment_1 : ( ( 'string' ) ) ;
    public final void rule__StringProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3505:1: ( ( ( 'string' ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3506:1: ( ( 'string' ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3506:1: ( ( 'string' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3507:1: ( 'string' )
            {
             before(grammarAccess.getStringPropertyAccess().getDataTypeStringKeyword_1_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3508:1: ( 'string' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3509:1: 'string'
            {
             before(grammarAccess.getStringPropertyAccess().getDataTypeStringKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__StringProperty__DataTypeAssignment_16959); 
             after(grammarAccess.getStringPropertyAccess().getDataTypeStringKeyword_1_0()); 

            }

             after(grammarAccess.getStringPropertyAccess().getDataTypeStringKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__DataTypeAssignment_1


    // $ANTLR start rule__StringProperty__NameAssignment_2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3524:1: rule__StringProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__StringProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3528:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3529:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3529:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3530:1: RULE_ID
            {
             before(grammarAccess.getStringPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringProperty__NameAssignment_26998); 
             after(grammarAccess.getStringPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__NameAssignment_2


    // $ANTLR start rule__StringProperty__HasDefaultAssignment_3_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3539:1: rule__StringProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__StringProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3543:1: ( ( ( 'default' ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3544:1: ( ( 'default' ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3544:1: ( ( 'default' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3545:1: ( 'default' )
            {
             before(grammarAccess.getStringPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3546:1: ( 'default' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3547:1: 'default'
            {
             before(grammarAccess.getStringPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,38,FOLLOW_38_in_rule__StringProperty__HasDefaultAssignment_3_07034); 
             after(grammarAccess.getStringPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }

             after(grammarAccess.getStringPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__HasDefaultAssignment_3_0


    // $ANTLR start rule__StringProperty__DefaultValueAssignment_3_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3562:1: rule__StringProperty__DefaultValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__StringProperty__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3566:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3567:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3567:1: ( RULE_STRING )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3568:1: RULE_STRING
            {
             before(grammarAccess.getStringPropertyAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringProperty__DefaultValueAssignment_3_17073); 
             after(grammarAccess.getStringPropertyAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__DefaultValueAssignment_3_1


    // $ANTLR start rule__StringProperty__MinLengthAssignment_4_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3577:1: rule__StringProperty__MinLengthAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__StringProperty__MinLengthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3581:1: ( ( RULE_INT ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3582:1: ( RULE_INT )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3582:1: ( RULE_INT )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3583:1: RULE_INT
            {
             before(grammarAccess.getStringPropertyAccess().getMinLengthINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringProperty__MinLengthAssignment_4_17104); 
             after(grammarAccess.getStringPropertyAccess().getMinLengthINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__MinLengthAssignment_4_1


    // $ANTLR start rule__StringProperty__MaxLengthAssignment_5_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3592:1: rule__StringProperty__MaxLengthAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__StringProperty__MaxLengthAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3596:1: ( ( RULE_INT ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3597:1: ( RULE_INT )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3597:1: ( RULE_INT )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3598:1: RULE_INT
            {
             before(grammarAccess.getStringPropertyAccess().getMaxLengthINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringProperty__MaxLengthAssignment_5_17135); 
             after(grammarAccess.getStringPropertyAccess().getMaxLengthINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__MaxLengthAssignment_5_1


    // $ANTLR start rule__StringProperty__RegularExpressionAssignment_6_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3607:1: rule__StringProperty__RegularExpressionAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__StringProperty__RegularExpressionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3611:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3612:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3612:1: ( RULE_STRING )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3613:1: RULE_STRING
            {
             before(grammarAccess.getStringPropertyAccess().getRegularExpressionSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringProperty__RegularExpressionAssignment_6_17166); 
             after(grammarAccess.getStringPropertyAccess().getRegularExpressionSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__RegularExpressionAssignment_6_1


    // $ANTLR start rule__DateTimeProperty__DescriptionAssignment_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3622:1: rule__DateTimeProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DateTimeProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3626:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3627:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3627:1: ( RULE_STRING )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3628:1: RULE_STRING
            {
             before(grammarAccess.getDateTimePropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DateTimeProperty__DescriptionAssignment_07197); 
             after(grammarAccess.getDateTimePropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__DescriptionAssignment_0


    // $ANTLR start rule__DateTimeProperty__DataTypeAssignment_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3637:1: rule__DateTimeProperty__DataTypeAssignment_1 : ( ( 'datetime' ) ) ;
    public final void rule__DateTimeProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3641:1: ( ( ( 'datetime' ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3642:1: ( ( 'datetime' ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3642:1: ( ( 'datetime' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3643:1: ( 'datetime' )
            {
             before(grammarAccess.getDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3644:1: ( 'datetime' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3645:1: 'datetime'
            {
             before(grammarAccess.getDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 
            match(input,41,FOLLOW_41_in_rule__DateTimeProperty__DataTypeAssignment_17233); 
             after(grammarAccess.getDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 

            }

             after(grammarAccess.getDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__DataTypeAssignment_1


    // $ANTLR start rule__DateTimeProperty__NameAssignment_2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3660:1: rule__DateTimeProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DateTimeProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3664:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3665:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3665:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3666:1: RULE_ID
            {
             before(grammarAccess.getDateTimePropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DateTimeProperty__NameAssignment_27272); 
             after(grammarAccess.getDateTimePropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__NameAssignment_2


    // $ANTLR start rule__DateTimeProperty__HasDefaultAssignment_3_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3675:1: rule__DateTimeProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__DateTimeProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3679:1: ( ( ( 'default' ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3680:1: ( ( 'default' ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3680:1: ( ( 'default' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3681:1: ( 'default' )
            {
             before(grammarAccess.getDateTimePropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3682:1: ( 'default' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3683:1: 'default'
            {
             before(grammarAccess.getDateTimePropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,38,FOLLOW_38_in_rule__DateTimeProperty__HasDefaultAssignment_3_07308); 
             after(grammarAccess.getDateTimePropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }

             after(grammarAccess.getDateTimePropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__HasDefaultAssignment_3_0


    // $ANTLR start rule__DateTimeProperty__DefaultValueAssignment_3_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3698:1: rule__DateTimeProperty__DefaultValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__DateTimeProperty__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3702:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3703:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3703:1: ( RULE_STRING )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3704:1: RULE_STRING
            {
             before(grammarAccess.getDateTimePropertyAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DateTimeProperty__DefaultValueAssignment_3_17347); 
             after(grammarAccess.getDateTimePropertyAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__DefaultValueAssignment_3_1


    // $ANTLR start rule__IntegerProperty__DescriptionAssignment_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3713:1: rule__IntegerProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__IntegerProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3717:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3718:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3718:1: ( RULE_STRING )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3719:1: RULE_STRING
            {
             before(grammarAccess.getIntegerPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IntegerProperty__DescriptionAssignment_07378); 
             after(grammarAccess.getIntegerPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__DescriptionAssignment_0


    // $ANTLR start rule__IntegerProperty__DataTypeAssignment_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3728:1: rule__IntegerProperty__DataTypeAssignment_1 : ( ( 'integer' ) ) ;
    public final void rule__IntegerProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3732:1: ( ( ( 'integer' ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3733:1: ( ( 'integer' ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3733:1: ( ( 'integer' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3734:1: ( 'integer' )
            {
             before(grammarAccess.getIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3735:1: ( 'integer' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3736:1: 'integer'
            {
             before(grammarAccess.getIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 
            match(input,42,FOLLOW_42_in_rule__IntegerProperty__DataTypeAssignment_17414); 
             after(grammarAccess.getIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 

            }

             after(grammarAccess.getIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__DataTypeAssignment_1


    // $ANTLR start rule__IntegerProperty__NameAssignment_2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3751:1: rule__IntegerProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__IntegerProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3755:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3756:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3756:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3757:1: RULE_ID
            {
             before(grammarAccess.getIntegerPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntegerProperty__NameAssignment_27453); 
             after(grammarAccess.getIntegerPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__NameAssignment_2


    // $ANTLR start rule__IntegerProperty__HasDefaultAssignment_3_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3766:1: rule__IntegerProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__IntegerProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3770:1: ( ( ( 'default' ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3771:1: ( ( 'default' ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3771:1: ( ( 'default' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3772:1: ( 'default' )
            {
             before(grammarAccess.getIntegerPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3773:1: ( 'default' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3774:1: 'default'
            {
             before(grammarAccess.getIntegerPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,38,FOLLOW_38_in_rule__IntegerProperty__HasDefaultAssignment_3_07489); 
             after(grammarAccess.getIntegerPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }

             after(grammarAccess.getIntegerPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__HasDefaultAssignment_3_0


    // $ANTLR start rule__IntegerProperty__DefaultValueAssignment_3_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3789:1: rule__IntegerProperty__DefaultValueAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__IntegerProperty__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3793:1: ( ( RULE_INT ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3794:1: ( RULE_INT )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3794:1: ( RULE_INT )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3795:1: RULE_INT
            {
             before(grammarAccess.getIntegerPropertyAccess().getDefaultValueINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerProperty__DefaultValueAssignment_3_17528); 
             after(grammarAccess.getIntegerPropertyAccess().getDefaultValueINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__DefaultValueAssignment_3_1


    // $ANTLR start rule__IntegerProperty__MinValueAssignment_4_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3804:1: rule__IntegerProperty__MinValueAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__IntegerProperty__MinValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3808:1: ( ( RULE_INT ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3809:1: ( RULE_INT )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3809:1: ( RULE_INT )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3810:1: RULE_INT
            {
             before(grammarAccess.getIntegerPropertyAccess().getMinValueINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerProperty__MinValueAssignment_4_17559); 
             after(grammarAccess.getIntegerPropertyAccess().getMinValueINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__MinValueAssignment_4_1


    // $ANTLR start rule__IntegerProperty__MaxValueAssignment_5_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3819:1: rule__IntegerProperty__MaxValueAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__IntegerProperty__MaxValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3823:1: ( ( RULE_INT ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3824:1: ( RULE_INT )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3824:1: ( RULE_INT )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3825:1: RULE_INT
            {
             before(grammarAccess.getIntegerPropertyAccess().getMaxValueINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerProperty__MaxValueAssignment_5_17590); 
             after(grammarAccess.getIntegerPropertyAccess().getMaxValueINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__MaxValueAssignment_5_1


    // $ANTLR start rule__DecimalProperty__DescriptionAssignment_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3834:1: rule__DecimalProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DecimalProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3838:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3839:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3839:1: ( RULE_STRING )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3840:1: RULE_STRING
            {
             before(grammarAccess.getDecimalPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DecimalProperty__DescriptionAssignment_07621); 
             after(grammarAccess.getDecimalPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalProperty__DescriptionAssignment_0


    // $ANTLR start rule__DecimalProperty__DataTypeAssignment_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3849:1: rule__DecimalProperty__DataTypeAssignment_1 : ( ( 'decimal' ) ) ;
    public final void rule__DecimalProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3853:1: ( ( ( 'decimal' ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3854:1: ( ( 'decimal' ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3854:1: ( ( 'decimal' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3855:1: ( 'decimal' )
            {
             before(grammarAccess.getDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3856:1: ( 'decimal' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3857:1: 'decimal'
            {
             before(grammarAccess.getDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__DecimalProperty__DataTypeAssignment_17657); 
             after(grammarAccess.getDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 

            }

             after(grammarAccess.getDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalProperty__DataTypeAssignment_1


    // $ANTLR start rule__DecimalProperty__NameAssignment_2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3872:1: rule__DecimalProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DecimalProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3876:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3877:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3877:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3878:1: RULE_ID
            {
             before(grammarAccess.getDecimalPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DecimalProperty__NameAssignment_27696); 
             after(grammarAccess.getDecimalPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalProperty__NameAssignment_2


    // $ANTLR start rule__EnumerationProperty__DescriptionAssignment_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3887:1: rule__EnumerationProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__EnumerationProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3891:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3892:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3892:1: ( RULE_STRING )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3893:1: RULE_STRING
            {
             before(grammarAccess.getEnumerationPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnumerationProperty__DescriptionAssignment_07727); 
             after(grammarAccess.getEnumerationPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__DescriptionAssignment_0


    // $ANTLR start rule__EnumerationProperty__TypeAssignment_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3902:1: rule__EnumerationProperty__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EnumerationProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3906:1: ( ( ( RULE_ID ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3907:1: ( ( RULE_ID ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3907:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3908:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getTypeEnumerationCrossReference_1_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3909:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3910:1: RULE_ID
            {
             before(grammarAccess.getEnumerationPropertyAccess().getTypeEnumerationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationProperty__TypeAssignment_17762); 
             after(grammarAccess.getEnumerationPropertyAccess().getTypeEnumerationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEnumerationPropertyAccess().getTypeEnumerationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__TypeAssignment_1


    // $ANTLR start rule__EnumerationProperty__NameAssignment_2
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3921:1: rule__EnumerationProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumerationProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3925:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3926:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3926:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3927:1: RULE_ID
            {
             before(grammarAccess.getEnumerationPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationProperty__NameAssignment_27797); 
             after(grammarAccess.getEnumerationPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__NameAssignment_2


    // $ANTLR start rule__EnumerationProperty__HasDefaultAssignment_3_0
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3936:1: rule__EnumerationProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__EnumerationProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3940:1: ( ( ( 'default' ) ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3941:1: ( ( 'default' ) )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3941:1: ( ( 'default' ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3942:1: ( 'default' )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3943:1: ( 'default' )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3944:1: 'default'
            {
             before(grammarAccess.getEnumerationPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,38,FOLLOW_38_in_rule__EnumerationProperty__HasDefaultAssignment_3_07833); 
             after(grammarAccess.getEnumerationPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }

             after(grammarAccess.getEnumerationPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__HasDefaultAssignment_3_0


    // $ANTLR start rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1
    // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3959:1: rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3963:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3964:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3964:1: ( RULE_ID )
            // ../org.mendix.dsl.businessdomain.xtext.ui/src-gen/org/mendix/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3965:1: RULE_ID
            {
             before(grammarAccess.getEnumerationPropertyAccess().getDefaultValueAsStringIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationProperty__DefaultValueAsStringAssignment_3_17872); 
             after(grammarAccess.getEnumerationPropertyAccess().getDefaultValueAsStringIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1


 

    public static final BitSet FOLLOW_ruleBusinessDomainModel_in_entryRuleBusinessDomainModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessDomainModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Group__0_in_ruleBusinessDomainModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0_in_ruleAssociation154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClass_in_entryRuleBusinessClass180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClass187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__0_in_ruleBusinessClass214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractBusinessRule_in_entryRuleAbstractBusinessRule360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractBusinessRule367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractBusinessRule__Alternatives_in_ruleAbstractBusinessRule394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessRule427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__0_in_ruleBusinessRule454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueRule_in_entryRuleUniqueRule480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueRule487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__0_in_ruleUniqueRule514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolProperty_in_entryRuleBoolProperty600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolProperty607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group__0_in_ruleBoolProperty634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringProperty_in_entryRuleStringProperty660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringProperty667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__0_in_ruleStringProperty694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeProperty_in_entryRuleDateTimeProperty720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeProperty727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group__0_in_ruleDateTimeProperty754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerProperty_in_entryRuleIntegerProperty780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerProperty787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__0_in_ruleIntegerProperty814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalProperty_in_entryRuleDecimalProperty840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalProperty847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalProperty__Group__0_in_ruleDecimalProperty874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationProperty_in_entryRuleEnumerationProperty900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationProperty907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group__0_in_ruleEnumerationProperty934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Alternatives_in_ruleMultiplicity971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__TypesAssignment_4_0_in_rule__BusinessDomainModel__Alternatives_41010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__EnumerationsAssignment_4_1_in_rule__BusinessDomainModel__Alternatives_41028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__AssociationsAssignment_4_2_in_rule__BusinessDomainModel__Alternatives_41046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__BidirectionalAssignment_5_0_in_rule__Association__Alternatives_51079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Association__Alternatives_51098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_rule__AbstractBusinessRule__Alternatives1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueRule_in_rule__AbstractBusinessRule__Alternatives1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolProperty_in_rule__Property__Alternatives_01181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringProperty_in_rule__Property__Alternatives_01198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeProperty_in_rule__Property__Alternatives_01215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerProperty_in_rule__Property__Alternatives_01232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalProperty_in_rule__Property__Alternatives_01249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationProperty_in_rule__Property__Alternatives_01266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__DefaultValueAssignment_3_1_0_in_rule__BoolProperty__Alternatives_3_11298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BoolProperty__Alternatives_3_11317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Multiplicity__Alternatives1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Multiplicity__Alternatives1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__DescriptionAssignment_0_in_rule__BusinessDomainModel__Group__01412 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Group__1_in_rule__BusinessDomainModel__Group__01422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BusinessDomainModel__Group__11451 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Group__2_in_rule__BusinessDomainModel__Group__11461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__NameAssignment_2_in_rule__BusinessDomainModel__Group__21489 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Group__3_in_rule__BusinessDomainModel__Group__21498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BusinessDomainModel__Group__31527 = new BitSet(new long[]{0x0000000000860012L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Group__4_in_rule__BusinessDomainModel__Group__31537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Alternatives_4_in_rule__BusinessDomainModel__Group__41565 = new BitSet(new long[]{0x0000000000860012L});
    public static final BitSet FOLLOW_rule__Association__DescriptionAssignment_0_in_rule__Association__Group__01610 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__01620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Association__Group__11649 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__11659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceAssignment_2_in_rule__Association__Group__21687 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__3_in_rule__Association__Group__21696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceRoleNameAssignment_3_in_rule__Association__Group__31724 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Association__Group__4_in_rule__Association__Group__31733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceMultiplicityAssignment_4_in_rule__Association__Group__41761 = new BitSet(new long[]{0x0000000100000800L});
    public static final BitSet FOLLOW_rule__Association__Group__5_in_rule__Association__Group__41770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Alternatives_5_in_rule__Association__Group__51798 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Association__Group__6_in_rule__Association__Group__51807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetMultiplicityAssignment_6_in_rule__Association__Group__61835 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__7_in_rule__Association__Group__61844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetAssignment_7_in_rule__Association__Group__71872 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__8_in_rule__Association__Group__71881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetRoleNameAssignment_8_in_rule__Association__Group__81909 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_rule__Association__Group__9_in_rule__Association__Group__81918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__OrderedAssignment_9_in_rule__Association__Group__91946 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Association__Group__10_in_rule__Association__Group__91956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Association__Group__101985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__DescriptionAssignment_0_in_rule__BusinessClass__Group__02042 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__1_in_rule__BusinessClass__Group__02052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BusinessClass__Group__12081 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__2_in_rule__BusinessClass__Group__12091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__NameAssignment_2_in_rule__BusinessClass__Group__22119 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__3_in_rule__BusinessClass__Group__22128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_3__0_in_rule__BusinessClass__Group__32156 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__4_in_rule__BusinessClass__Group__32166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BusinessClass__Group__42195 = new BitSet(new long[]{0x00000F2000500030L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__5_in_rule__BusinessClass__Group__42205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__PropertiesAssignment_5_in_rule__BusinessClass__Group__52233 = new BitSet(new long[]{0x00000F2000500030L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__6_in_rule__BusinessClass__Group__52243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_6__0_in_rule__BusinessClass__Group__62271 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__7_in_rule__BusinessClass__Group__62281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BusinessClass__Group__72310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BusinessClass__Group_3__02362 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_3__1_in_rule__BusinessClass__Group_3__02372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__SuperclassAssignment_3_1_in_rule__BusinessClass__Group_3__12400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BusinessClass__Group_6__02439 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_6__1_in_rule__BusinessClass__Group_6__02449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BusinessClass__Group_6__12478 = new BitSet(new long[]{0x0000000002100030L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_6__2_in_rule__BusinessClass__Group_6__12488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__BusinessRulesAssignment_6_2_in_rule__BusinessClass__Group_6__22516 = new BitSet(new long[]{0x0000000002100030L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_6__3_in_rule__BusinessClass__Group_6__22526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BusinessClass__Group_6__32555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__DescriptionAssignment_0_in_rule__Enumeration__Group__02598 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Enumeration__Group__12637 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_2_in_rule__Enumeration__Group__22675 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Enumeration__Group__32713 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_4_in_rule__Enumeration__Group__42753 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_4_in_rule__Enumeration__Group__42765 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__42777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Enumeration__Group__52806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__02853 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__02862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__0_in_rule__EnumerationLiteral__Group__12890 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__12899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EnumerationLiteral__Group__22928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EnumerationLiteral__Group_1__02970 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__1_in_rule__EnumerationLiteral__Group_1__02980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__PersistedValueAssignment_1_1_in_rule__EnumerationLiteral__Group_1__13008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__DescriptionAssignment_0_in_rule__BusinessRule__Group__03046 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__1_in_rule__BusinessRule__Group__03056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__NameAssignment_1_in_rule__BusinessRule__Group__13084 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__2_in_rule__BusinessRule__Group__13093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BusinessRule__Group__23122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__DescriptionAssignment_0_in_rule__UniqueRule__Group__03163 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__1_in_rule__UniqueRule__Group__03173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__UniqueRule__Group__13202 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__2_in_rule__UniqueRule__Group__13212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__NameAssignment_2_in_rule__UniqueRule__Group__23240 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__3_in_rule__UniqueRule__Group__23249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UniqueRule__Group__33278 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__4_in_rule__UniqueRule__Group__33288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__PropertiesAssignment_4_in_rule__UniqueRule__Group__43316 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__5_in_rule__UniqueRule__Group__43325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group_5__0_in_rule__UniqueRule__Group__53353 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__6_in_rule__UniqueRule__Group__53363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__UniqueRule__Group__63392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UniqueRule__Group_5__03442 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group_5__1_in_rule__UniqueRule__Group_5__03452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__PropertiesAssignment_5_1_in_rule__UniqueRule__Group_5__13480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_0_in_rule__Property__Group__03518 = new BitSet(new long[]{0x0000000C00010000L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NullableAssignment_1_in_rule__Property__Group__13555 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2__0_in_rule__Property__Group__23593 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__23603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Property__Group__33632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DerivedAssignment_2_0_in_rule__Property__Group_2__03675 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2__1_in_rule__Property__Group_2__03684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__WritableAssignment_2_1_in_rule__Property__Group_2__13712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__DescriptionAssignment_0_in_rule__BoolProperty__Group__03751 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group__1_in_rule__BoolProperty__Group__03761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__DataTypeAssignment_1_in_rule__BoolProperty__Group__13789 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group__2_in_rule__BoolProperty__Group__13798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__NameAssignment_2_in_rule__BoolProperty__Group__23826 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group__3_in_rule__BoolProperty__Group__23835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group_3__0_in_rule__BoolProperty__Group__33863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__HasDefaultAssignment_3_0_in_rule__BoolProperty__Group_3__03906 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group_3__1_in_rule__BoolProperty__Group_3__03915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__Alternatives_3_1_in_rule__BoolProperty__Group_3__13943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__DescriptionAssignment_0_in_rule__StringProperty__Group__03981 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__1_in_rule__StringProperty__Group__03991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__DataTypeAssignment_1_in_rule__StringProperty__Group__14019 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__2_in_rule__StringProperty__Group__14028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__NameAssignment_2_in_rule__StringProperty__Group__24056 = new BitSet(new long[]{0x0000004038000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__3_in_rule__StringProperty__Group__24065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_3__0_in_rule__StringProperty__Group__34093 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__4_in_rule__StringProperty__Group__34103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_4__0_in_rule__StringProperty__Group__44131 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__5_in_rule__StringProperty__Group__44141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_5__0_in_rule__StringProperty__Group__54169 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__6_in_rule__StringProperty__Group__54179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_6__0_in_rule__StringProperty__Group__64207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__HasDefaultAssignment_3_0_in_rule__StringProperty__Group_3__04256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_3__1_in_rule__StringProperty__Group_3__04265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__DefaultValueAssignment_3_1_in_rule__StringProperty__Group_3__14293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__StringProperty__Group_4__04332 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_4__1_in_rule__StringProperty__Group_4__04342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__MinLengthAssignment_4_1_in_rule__StringProperty__Group_4__14370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__StringProperty__Group_5__04409 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_5__1_in_rule__StringProperty__Group_5__04419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__MaxLengthAssignment_5_1_in_rule__StringProperty__Group_5__14447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__StringProperty__Group_6__04486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_6__1_in_rule__StringProperty__Group_6__04496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__RegularExpressionAssignment_6_1_in_rule__StringProperty__Group_6__14524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__DescriptionAssignment_0_in_rule__DateTimeProperty__Group__04562 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group__1_in_rule__DateTimeProperty__Group__04572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__DataTypeAssignment_1_in_rule__DateTimeProperty__Group__14600 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group__2_in_rule__DateTimeProperty__Group__14609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__NameAssignment_2_in_rule__DateTimeProperty__Group__24637 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group__3_in_rule__DateTimeProperty__Group__24646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group_3__0_in_rule__DateTimeProperty__Group__34674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__HasDefaultAssignment_3_0_in_rule__DateTimeProperty__Group_3__04717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group_3__1_in_rule__DateTimeProperty__Group_3__04726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__DefaultValueAssignment_3_1_in_rule__DateTimeProperty__Group_3__14754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__DescriptionAssignment_0_in_rule__IntegerProperty__Group__04792 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__1_in_rule__IntegerProperty__Group__04802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__DataTypeAssignment_1_in_rule__IntegerProperty__Group__14830 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__2_in_rule__IntegerProperty__Group__14839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__NameAssignment_2_in_rule__IntegerProperty__Group__24867 = new BitSet(new long[]{0x00000040C0000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__3_in_rule__IntegerProperty__Group__24876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_3__0_in_rule__IntegerProperty__Group__34904 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__4_in_rule__IntegerProperty__Group__34914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_4__0_in_rule__IntegerProperty__Group__44942 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__5_in_rule__IntegerProperty__Group__44952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_5__0_in_rule__IntegerProperty__Group__54980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__HasDefaultAssignment_3_0_in_rule__IntegerProperty__Group_3__05027 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_3__1_in_rule__IntegerProperty__Group_3__05036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__DefaultValueAssignment_3_1_in_rule__IntegerProperty__Group_3__15064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__IntegerProperty__Group_4__05103 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_4__1_in_rule__IntegerProperty__Group_4__05113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__MinValueAssignment_4_1_in_rule__IntegerProperty__Group_4__15141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__IntegerProperty__Group_5__05180 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_5__1_in_rule__IntegerProperty__Group_5__05190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__MaxValueAssignment_5_1_in_rule__IntegerProperty__Group_5__15218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalProperty__DescriptionAssignment_0_in_rule__DecimalProperty__Group__05256 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__DecimalProperty__Group__1_in_rule__DecimalProperty__Group__05266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalProperty__DataTypeAssignment_1_in_rule__DecimalProperty__Group__15294 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DecimalProperty__Group__2_in_rule__DecimalProperty__Group__15303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalProperty__NameAssignment_2_in_rule__DecimalProperty__Group__25331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__DescriptionAssignment_0_in_rule__EnumerationProperty__Group__05371 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group__1_in_rule__EnumerationProperty__Group__05381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__TypeAssignment_1_in_rule__EnumerationProperty__Group__15409 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group__2_in_rule__EnumerationProperty__Group__15418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__NameAssignment_2_in_rule__EnumerationProperty__Group__25446 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group__3_in_rule__EnumerationProperty__Group__25455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group_3__0_in_rule__EnumerationProperty__Group__35483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__HasDefaultAssignment_3_0_in_rule__EnumerationProperty__Group_3__05526 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group_3__1_in_rule__EnumerationProperty__Group_3__05535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1_in_rule__EnumerationProperty__Group_3__15563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BusinessDomainModel__DescriptionAssignment_05601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessDomainModel__NameAssignment_25632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClass_in_rule__BusinessDomainModel__TypesAssignment_4_05663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__BusinessDomainModel__EnumerationsAssignment_4_15694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_rule__BusinessDomainModel__AssociationsAssignment_4_25725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Association__DescriptionAssignment_05756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_25791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__SourceRoleNameAssignment_35826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_rule__Association__SourceMultiplicityAssignment_45857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Association__BidirectionalAssignment_5_05893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_rule__Association__TargetMultiplicityAssignment_65932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_75967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TargetRoleNameAssignment_86002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Association__OrderedAssignment_96038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BusinessClass__DescriptionAssignment_06077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClass__NameAssignment_26108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClass__SuperclassAssignment_3_16143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__BusinessClass__PropertiesAssignment_56178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractBusinessRule_in_rule__BusinessClass__BusinessRulesAssignment_6_26209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Enumeration__DescriptionAssignment_06240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_26271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__EnumerationLiteralsAssignment_46302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_06333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumerationLiteral__PersistedValueAssignment_1_16364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BusinessRule__DescriptionAssignment_06395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessRule__NameAssignment_16426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UniqueRule__DescriptionAssignment_06457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UniqueRule__NameAssignment_26488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UniqueRule__PropertiesAssignment_46523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UniqueRule__PropertiesAssignment_5_16562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Property__NullableAssignment_16602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Property__DerivedAssignment_2_06646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Property__WritableAssignment_2_16690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BoolProperty__DescriptionAssignment_06729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__BoolProperty__DataTypeAssignment_16765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BoolProperty__NameAssignment_26804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__BoolProperty__HasDefaultAssignment_3_06840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__BoolProperty__DefaultValueAssignment_3_1_06884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringProperty__DescriptionAssignment_06923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__StringProperty__DataTypeAssignment_16959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringProperty__NameAssignment_26998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__StringProperty__HasDefaultAssignment_3_07034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringProperty__DefaultValueAssignment_3_17073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringProperty__MinLengthAssignment_4_17104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringProperty__MaxLengthAssignment_5_17135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringProperty__RegularExpressionAssignment_6_17166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DateTimeProperty__DescriptionAssignment_07197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__DateTimeProperty__DataTypeAssignment_17233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DateTimeProperty__NameAssignment_27272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__DateTimeProperty__HasDefaultAssignment_3_07308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DateTimeProperty__DefaultValueAssignment_3_17347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IntegerProperty__DescriptionAssignment_07378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__IntegerProperty__DataTypeAssignment_17414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntegerProperty__NameAssignment_27453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__IntegerProperty__HasDefaultAssignment_3_07489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerProperty__DefaultValueAssignment_3_17528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerProperty__MinValueAssignment_4_17559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerProperty__MaxValueAssignment_5_17590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DecimalProperty__DescriptionAssignment_07621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__DecimalProperty__DataTypeAssignment_17657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DecimalProperty__NameAssignment_27696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnumerationProperty__DescriptionAssignment_07727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationProperty__TypeAssignment_17762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationProperty__NameAssignment_27797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EnumerationProperty__HasDefaultAssignment_3_07833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationProperty__DefaultValueAsStringAssignment_3_17872 = new BitSet(new long[]{0x0000000000000002L});

}