package org.mendix.dsl.datacontract.xtext.contentassist.antlr.internal; 

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
import org.mendix.dsl.datacontract.xtext.services.DataContractGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalDataContractParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'businessclass'", "'enumeration'", "';'", "'datacontract'", "'from'", "'class'", "'represents'", "'['", "']'", "'references'", "'as'", "'custom'", "'boolean'", "'string'", "'datetime'", "'integer'", "'decimal'"
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
    public String getGrammarFileName() { return "../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g"; }


     
     	private DataContractGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DataContractGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleDataContractModel
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:60:1: entryRuleDataContractModel : ruleDataContractModel EOF ;
    public final void entryRuleDataContractModel() throws RecognitionException {
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:60:28: ( ruleDataContractModel EOF )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:61:1: ruleDataContractModel EOF
            {
             before(grammarAccess.getDataContractModelRule()); 
            pushFollow(FOLLOW_ruleDataContractModel_in_entryRuleDataContractModel60);
            ruleDataContractModel();
            _fsp--;

             after(grammarAccess.getDataContractModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataContractModel67); 

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
    // $ANTLR end entryRuleDataContractModel


    // $ANTLR start ruleDataContractModel
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:68:1: ruleDataContractModel : ( ( rule__DataContractModel__Group__0 ) ) ;
    public final void ruleDataContractModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:72:2: ( ( ( rule__DataContractModel__Group__0 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:73:1: ( ( rule__DataContractModel__Group__0 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:73:1: ( ( rule__DataContractModel__Group__0 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:74:1: ( rule__DataContractModel__Group__0 )
            {
             before(grammarAccess.getDataContractModelAccess().getGroup()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:75:1: ( rule__DataContractModel__Group__0 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:75:2: rule__DataContractModel__Group__0
            {
            pushFollow(FOLLOW_rule__DataContractModel__Group__0_in_ruleDataContractModel94);
            rule__DataContractModel__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDataContractModelAccess().getGroup()); 

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
    // $ANTLR end ruleDataContractModel


    // $ANTLR start entryRuleDto
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:87:1: entryRuleDto : ruleDto EOF ;
    public final void entryRuleDto() throws RecognitionException {
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:87:14: ( ruleDto EOF )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:88:1: ruleDto EOF
            {
             before(grammarAccess.getDtoRule()); 
            pushFollow(FOLLOW_ruleDto_in_entryRuleDto120);
            ruleDto();
            _fsp--;

             after(grammarAccess.getDtoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDto127); 

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
    // $ANTLR end entryRuleDto


    // $ANTLR start ruleDto
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:95:1: ruleDto : ( ( rule__Dto__Alternatives ) ) ;
    public final void ruleDto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:99:2: ( ( ( rule__Dto__Alternatives ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:100:1: ( ( rule__Dto__Alternatives ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:100:1: ( ( rule__Dto__Alternatives ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:101:1: ( rule__Dto__Alternatives )
            {
             before(grammarAccess.getDtoAccess().getAlternatives()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:102:1: ( rule__Dto__Alternatives )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:102:2: rule__Dto__Alternatives
            {
            pushFollow(FOLLOW_rule__Dto__Alternatives_in_ruleDto154);
            rule__Dto__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDtoAccess().getAlternatives()); 

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
    // $ANTLR end ruleDto


    // $ANTLR start entryRuleExternalReference
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:114:1: entryRuleExternalReference : ruleExternalReference EOF ;
    public final void entryRuleExternalReference() throws RecognitionException {
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:114:28: ( ruleExternalReference EOF )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:115:1: ruleExternalReference EOF
            {
             before(grammarAccess.getExternalReferenceRule()); 
            pushFollow(FOLLOW_ruleExternalReference_in_entryRuleExternalReference180);
            ruleExternalReference();
            _fsp--;

             after(grammarAccess.getExternalReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalReference187); 

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
    // $ANTLR end entryRuleExternalReference


    // $ANTLR start ruleExternalReference
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:122:1: ruleExternalReference : ( ( rule__ExternalReference__Group__0 ) ) ;
    public final void ruleExternalReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:126:2: ( ( ( rule__ExternalReference__Group__0 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:127:1: ( ( rule__ExternalReference__Group__0 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:127:1: ( ( rule__ExternalReference__Group__0 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:128:1: ( rule__ExternalReference__Group__0 )
            {
             before(grammarAccess.getExternalReferenceAccess().getGroup()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:129:1: ( rule__ExternalReference__Group__0 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:129:2: rule__ExternalReference__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalReference__Group__0_in_ruleExternalReference214);
            rule__ExternalReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getGroup()); 

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
    // $ANTLR end ruleExternalReference


    // $ANTLR start entryRuleBusinessClassDto
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:141:1: entryRuleBusinessClassDto : ruleBusinessClassDto EOF ;
    public final void entryRuleBusinessClassDto() throws RecognitionException {
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:141:27: ( ruleBusinessClassDto EOF )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:142:1: ruleBusinessClassDto EOF
            {
             before(grammarAccess.getBusinessClassDtoRule()); 
            pushFollow(FOLLOW_ruleBusinessClassDto_in_entryRuleBusinessClassDto240);
            ruleBusinessClassDto();
            _fsp--;

             after(grammarAccess.getBusinessClassDtoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClassDto247); 

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
    // $ANTLR end entryRuleBusinessClassDto


    // $ANTLR start ruleBusinessClassDto
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:149:1: ruleBusinessClassDto : ( ( rule__BusinessClassDto__Group__0 ) ) ;
    public final void ruleBusinessClassDto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:153:2: ( ( ( rule__BusinessClassDto__Group__0 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:154:1: ( ( rule__BusinessClassDto__Group__0 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:154:1: ( ( rule__BusinessClassDto__Group__0 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:155:1: ( rule__BusinessClassDto__Group__0 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getGroup()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:156:1: ( rule__BusinessClassDto__Group__0 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:156:2: rule__BusinessClassDto__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__Group__0_in_ruleBusinessClassDto274);
            rule__BusinessClassDto__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getGroup()); 

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
    // $ANTLR end ruleBusinessClassDto


    // $ANTLR start entryRuleEnumerationDto
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:168:1: entryRuleEnumerationDto : ruleEnumerationDto EOF ;
    public final void entryRuleEnumerationDto() throws RecognitionException {
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:168:25: ( ruleEnumerationDto EOF )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:169:1: ruleEnumerationDto EOF
            {
             before(grammarAccess.getEnumerationDtoRule()); 
            pushFollow(FOLLOW_ruleEnumerationDto_in_entryRuleEnumerationDto300);
            ruleEnumerationDto();
            _fsp--;

             after(grammarAccess.getEnumerationDtoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationDto307); 

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
    // $ANTLR end entryRuleEnumerationDto


    // $ANTLR start ruleEnumerationDto
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:176:1: ruleEnumerationDto : ( ( rule__EnumerationDto__Group__0 ) ) ;
    public final void ruleEnumerationDto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:180:2: ( ( ( rule__EnumerationDto__Group__0 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:181:1: ( ( rule__EnumerationDto__Group__0 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:181:1: ( ( rule__EnumerationDto__Group__0 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:182:1: ( rule__EnumerationDto__Group__0 )
            {
             before(grammarAccess.getEnumerationDtoAccess().getGroup()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:183:1: ( rule__EnumerationDto__Group__0 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:183:2: rule__EnumerationDto__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationDto__Group__0_in_ruleEnumerationDto334);
            rule__EnumerationDto__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationDtoAccess().getGroup()); 

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
    // $ANTLR end ruleEnumerationDto


    // $ANTLR start entryRuleBusinessClassPropertyReference
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:195:1: entryRuleBusinessClassPropertyReference : ruleBusinessClassPropertyReference EOF ;
    public final void entryRuleBusinessClassPropertyReference() throws RecognitionException {
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:195:41: ( ruleBusinessClassPropertyReference EOF )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:196:1: ruleBusinessClassPropertyReference EOF
            {
             before(grammarAccess.getBusinessClassPropertyReferenceRule()); 
            pushFollow(FOLLOW_ruleBusinessClassPropertyReference_in_entryRuleBusinessClassPropertyReference360);
            ruleBusinessClassPropertyReference();
            _fsp--;

             after(grammarAccess.getBusinessClassPropertyReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClassPropertyReference367); 

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
    // $ANTLR end entryRuleBusinessClassPropertyReference


    // $ANTLR start ruleBusinessClassPropertyReference
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:203:1: ruleBusinessClassPropertyReference : ( ( rule__BusinessClassPropertyReference__Group__0 ) ) ;
    public final void ruleBusinessClassPropertyReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:207:2: ( ( ( rule__BusinessClassPropertyReference__Group__0 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:208:1: ( ( rule__BusinessClassPropertyReference__Group__0 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:208:1: ( ( rule__BusinessClassPropertyReference__Group__0 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:209:1: ( rule__BusinessClassPropertyReference__Group__0 )
            {
             before(grammarAccess.getBusinessClassPropertyReferenceAccess().getGroup()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:210:1: ( rule__BusinessClassPropertyReference__Group__0 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:210:2: rule__BusinessClassPropertyReference__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessClassPropertyReference__Group__0_in_ruleBusinessClassPropertyReference394);
            rule__BusinessClassPropertyReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassPropertyReferenceAccess().getGroup()); 

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
    // $ANTLR end ruleBusinessClassPropertyReference


    // $ANTLR start entryRuleBusinessClassAssociationRoleReference
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:222:1: entryRuleBusinessClassAssociationRoleReference : ruleBusinessClassAssociationRoleReference EOF ;
    public final void entryRuleBusinessClassAssociationRoleReference() throws RecognitionException {
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:222:48: ( ruleBusinessClassAssociationRoleReference EOF )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:223:1: ruleBusinessClassAssociationRoleReference EOF
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceRule()); 
            pushFollow(FOLLOW_ruleBusinessClassAssociationRoleReference_in_entryRuleBusinessClassAssociationRoleReference420);
            ruleBusinessClassAssociationRoleReference();
            _fsp--;

             after(grammarAccess.getBusinessClassAssociationRoleReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClassAssociationRoleReference427); 

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
    // $ANTLR end entryRuleBusinessClassAssociationRoleReference


    // $ANTLR start ruleBusinessClassAssociationRoleReference
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:230:1: ruleBusinessClassAssociationRoleReference : ( ( rule__BusinessClassAssociationRoleReference__Group__0 ) ) ;
    public final void ruleBusinessClassAssociationRoleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:234:2: ( ( ( rule__BusinessClassAssociationRoleReference__Group__0 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:235:1: ( ( rule__BusinessClassAssociationRoleReference__Group__0 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:235:1: ( ( rule__BusinessClassAssociationRoleReference__Group__0 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:236:1: ( rule__BusinessClassAssociationRoleReference__Group__0 )
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getGroup()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:237:1: ( rule__BusinessClassAssociationRoleReference__Group__0 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:237:2: rule__BusinessClassAssociationRoleReference__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__Group__0_in_ruleBusinessClassAssociationRoleReference454);
            rule__BusinessClassAssociationRoleReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getGroup()); 

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
    // $ANTLR end ruleBusinessClassAssociationRoleReference


    // $ANTLR start entryRuleCustomDto
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:249:1: entryRuleCustomDto : ruleCustomDto EOF ;
    public final void entryRuleCustomDto() throws RecognitionException {
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:249:20: ( ruleCustomDto EOF )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:250:1: ruleCustomDto EOF
            {
             before(grammarAccess.getCustomDtoRule()); 
            pushFollow(FOLLOW_ruleCustomDto_in_entryRuleCustomDto480);
            ruleCustomDto();
            _fsp--;

             after(grammarAccess.getCustomDtoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomDto487); 

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
    // $ANTLR end entryRuleCustomDto


    // $ANTLR start ruleCustomDto
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:257:1: ruleCustomDto : ( ( rule__CustomDto__Group__0 ) ) ;
    public final void ruleCustomDto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:261:2: ( ( ( rule__CustomDto__Group__0 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:262:1: ( ( rule__CustomDto__Group__0 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:262:1: ( ( rule__CustomDto__Group__0 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:263:1: ( rule__CustomDto__Group__0 )
            {
             before(grammarAccess.getCustomDtoAccess().getGroup()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:264:1: ( rule__CustomDto__Group__0 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:264:2: rule__CustomDto__Group__0
            {
            pushFollow(FOLLOW_rule__CustomDto__Group__0_in_ruleCustomDto514);
            rule__CustomDto__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCustomDtoAccess().getGroup()); 

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
    // $ANTLR end ruleCustomDto


    // $ANTLR start entryRuleDtoProperty
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:276:1: entryRuleDtoProperty : ruleDtoProperty EOF ;
    public final void entryRuleDtoProperty() throws RecognitionException {
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:276:22: ( ruleDtoProperty EOF )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:277:1: ruleDtoProperty EOF
            {
             before(grammarAccess.getDtoPropertyRule()); 
            pushFollow(FOLLOW_ruleDtoProperty_in_entryRuleDtoProperty540);
            ruleDtoProperty();
            _fsp--;

             after(grammarAccess.getDtoPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoProperty547); 

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
    // $ANTLR end entryRuleDtoProperty


    // $ANTLR start ruleDtoProperty
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:284:1: ruleDtoProperty : ( ( rule__DtoProperty__Group__0 ) ) ;
    public final void ruleDtoProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:288:2: ( ( ( rule__DtoProperty__Group__0 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:289:1: ( ( rule__DtoProperty__Group__0 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:289:1: ( ( rule__DtoProperty__Group__0 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:290:1: ( rule__DtoProperty__Group__0 )
            {
             before(grammarAccess.getDtoPropertyAccess().getGroup()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:291:1: ( rule__DtoProperty__Group__0 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:291:2: rule__DtoProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoProperty__Group__0_in_ruleDtoProperty574);
            rule__DtoProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDtoPropertyAccess().getGroup()); 

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
    // $ANTLR end ruleDtoProperty


    // $ANTLR start entryRuleDtoBooleanProperty
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:303:1: entryRuleDtoBooleanProperty : ruleDtoBooleanProperty EOF ;
    public final void entryRuleDtoBooleanProperty() throws RecognitionException {
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:303:29: ( ruleDtoBooleanProperty EOF )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:304:1: ruleDtoBooleanProperty EOF
            {
             before(grammarAccess.getDtoBooleanPropertyRule()); 
            pushFollow(FOLLOW_ruleDtoBooleanProperty_in_entryRuleDtoBooleanProperty600);
            ruleDtoBooleanProperty();
            _fsp--;

             after(grammarAccess.getDtoBooleanPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoBooleanProperty607); 

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
    // $ANTLR end entryRuleDtoBooleanProperty


    // $ANTLR start ruleDtoBooleanProperty
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:311:1: ruleDtoBooleanProperty : ( ( rule__DtoBooleanProperty__Group__0 ) ) ;
    public final void ruleDtoBooleanProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:315:2: ( ( ( rule__DtoBooleanProperty__Group__0 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:316:1: ( ( rule__DtoBooleanProperty__Group__0 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:316:1: ( ( rule__DtoBooleanProperty__Group__0 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:317:1: ( rule__DtoBooleanProperty__Group__0 )
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getGroup()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:318:1: ( rule__DtoBooleanProperty__Group__0 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:318:2: rule__DtoBooleanProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoBooleanProperty__Group__0_in_ruleDtoBooleanProperty634);
            rule__DtoBooleanProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDtoBooleanPropertyAccess().getGroup()); 

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
    // $ANTLR end ruleDtoBooleanProperty


    // $ANTLR start entryRuleDtoStringProperty
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:330:1: entryRuleDtoStringProperty : ruleDtoStringProperty EOF ;
    public final void entryRuleDtoStringProperty() throws RecognitionException {
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:330:28: ( ruleDtoStringProperty EOF )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:331:1: ruleDtoStringProperty EOF
            {
             before(grammarAccess.getDtoStringPropertyRule()); 
            pushFollow(FOLLOW_ruleDtoStringProperty_in_entryRuleDtoStringProperty660);
            ruleDtoStringProperty();
            _fsp--;

             after(grammarAccess.getDtoStringPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoStringProperty667); 

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
    // $ANTLR end entryRuleDtoStringProperty


    // $ANTLR start ruleDtoStringProperty
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:338:1: ruleDtoStringProperty : ( ( rule__DtoStringProperty__Group__0 ) ) ;
    public final void ruleDtoStringProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:342:2: ( ( ( rule__DtoStringProperty__Group__0 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:343:1: ( ( rule__DtoStringProperty__Group__0 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:343:1: ( ( rule__DtoStringProperty__Group__0 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:344:1: ( rule__DtoStringProperty__Group__0 )
            {
             before(grammarAccess.getDtoStringPropertyAccess().getGroup()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:345:1: ( rule__DtoStringProperty__Group__0 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:345:2: rule__DtoStringProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoStringProperty__Group__0_in_ruleDtoStringProperty694);
            rule__DtoStringProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDtoStringPropertyAccess().getGroup()); 

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
    // $ANTLR end ruleDtoStringProperty


    // $ANTLR start entryRuleDtoDateTimeProperty
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:357:1: entryRuleDtoDateTimeProperty : ruleDtoDateTimeProperty EOF ;
    public final void entryRuleDtoDateTimeProperty() throws RecognitionException {
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:357:30: ( ruleDtoDateTimeProperty EOF )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:358:1: ruleDtoDateTimeProperty EOF
            {
             before(grammarAccess.getDtoDateTimePropertyRule()); 
            pushFollow(FOLLOW_ruleDtoDateTimeProperty_in_entryRuleDtoDateTimeProperty720);
            ruleDtoDateTimeProperty();
            _fsp--;

             after(grammarAccess.getDtoDateTimePropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoDateTimeProperty727); 

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
    // $ANTLR end entryRuleDtoDateTimeProperty


    // $ANTLR start ruleDtoDateTimeProperty
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:365:1: ruleDtoDateTimeProperty : ( ( rule__DtoDateTimeProperty__Group__0 ) ) ;
    public final void ruleDtoDateTimeProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:369:2: ( ( ( rule__DtoDateTimeProperty__Group__0 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:370:1: ( ( rule__DtoDateTimeProperty__Group__0 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:370:1: ( ( rule__DtoDateTimeProperty__Group__0 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:371:1: ( rule__DtoDateTimeProperty__Group__0 )
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getGroup()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:372:1: ( rule__DtoDateTimeProperty__Group__0 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:372:2: rule__DtoDateTimeProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoDateTimeProperty__Group__0_in_ruleDtoDateTimeProperty754);
            rule__DtoDateTimeProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDtoDateTimePropertyAccess().getGroup()); 

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
    // $ANTLR end ruleDtoDateTimeProperty


    // $ANTLR start entryRuleDtoIntegerProperty
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:384:1: entryRuleDtoIntegerProperty : ruleDtoIntegerProperty EOF ;
    public final void entryRuleDtoIntegerProperty() throws RecognitionException {
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:384:29: ( ruleDtoIntegerProperty EOF )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:385:1: ruleDtoIntegerProperty EOF
            {
             before(grammarAccess.getDtoIntegerPropertyRule()); 
            pushFollow(FOLLOW_ruleDtoIntegerProperty_in_entryRuleDtoIntegerProperty780);
            ruleDtoIntegerProperty();
            _fsp--;

             after(grammarAccess.getDtoIntegerPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoIntegerProperty787); 

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
    // $ANTLR end entryRuleDtoIntegerProperty


    // $ANTLR start ruleDtoIntegerProperty
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:392:1: ruleDtoIntegerProperty : ( ( rule__DtoIntegerProperty__Group__0 ) ) ;
    public final void ruleDtoIntegerProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:396:2: ( ( ( rule__DtoIntegerProperty__Group__0 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:397:1: ( ( rule__DtoIntegerProperty__Group__0 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:397:1: ( ( rule__DtoIntegerProperty__Group__0 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:398:1: ( rule__DtoIntegerProperty__Group__0 )
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getGroup()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:399:1: ( rule__DtoIntegerProperty__Group__0 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:399:2: rule__DtoIntegerProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoIntegerProperty__Group__0_in_ruleDtoIntegerProperty814);
            rule__DtoIntegerProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDtoIntegerPropertyAccess().getGroup()); 

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
    // $ANTLR end ruleDtoIntegerProperty


    // $ANTLR start entryRuleDtoDecimalProperty
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:411:1: entryRuleDtoDecimalProperty : ruleDtoDecimalProperty EOF ;
    public final void entryRuleDtoDecimalProperty() throws RecognitionException {
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:411:29: ( ruleDtoDecimalProperty EOF )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:412:1: ruleDtoDecimalProperty EOF
            {
             before(grammarAccess.getDtoDecimalPropertyRule()); 
            pushFollow(FOLLOW_ruleDtoDecimalProperty_in_entryRuleDtoDecimalProperty840);
            ruleDtoDecimalProperty();
            _fsp--;

             after(grammarAccess.getDtoDecimalPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoDecimalProperty847); 

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
    // $ANTLR end entryRuleDtoDecimalProperty


    // $ANTLR start ruleDtoDecimalProperty
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:419:1: ruleDtoDecimalProperty : ( ( rule__DtoDecimalProperty__Group__0 ) ) ;
    public final void ruleDtoDecimalProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:423:2: ( ( ( rule__DtoDecimalProperty__Group__0 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:424:1: ( ( rule__DtoDecimalProperty__Group__0 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:424:1: ( ( rule__DtoDecimalProperty__Group__0 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:425:1: ( rule__DtoDecimalProperty__Group__0 )
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getGroup()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:426:1: ( rule__DtoDecimalProperty__Group__0 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:426:2: rule__DtoDecimalProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoDecimalProperty__Group__0_in_ruleDtoDecimalProperty874);
            rule__DtoDecimalProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDtoDecimalPropertyAccess().getGroup()); 

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
    // $ANTLR end ruleDtoDecimalProperty


    // $ANTLR start entryRuleDtoEnumerationProperty
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:438:1: entryRuleDtoEnumerationProperty : ruleDtoEnumerationProperty EOF ;
    public final void entryRuleDtoEnumerationProperty() throws RecognitionException {
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:438:33: ( ruleDtoEnumerationProperty EOF )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:439:1: ruleDtoEnumerationProperty EOF
            {
             before(grammarAccess.getDtoEnumerationPropertyRule()); 
            pushFollow(FOLLOW_ruleDtoEnumerationProperty_in_entryRuleDtoEnumerationProperty900);
            ruleDtoEnumerationProperty();
            _fsp--;

             after(grammarAccess.getDtoEnumerationPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoEnumerationProperty907); 

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
    // $ANTLR end entryRuleDtoEnumerationProperty


    // $ANTLR start ruleDtoEnumerationProperty
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:446:1: ruleDtoEnumerationProperty : ( ( rule__DtoEnumerationProperty__Group__0 ) ) ;
    public final void ruleDtoEnumerationProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:450:2: ( ( ( rule__DtoEnumerationProperty__Group__0 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:451:1: ( ( rule__DtoEnumerationProperty__Group__0 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:451:1: ( ( rule__DtoEnumerationProperty__Group__0 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:452:1: ( rule__DtoEnumerationProperty__Group__0 )
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getGroup()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:453:1: ( rule__DtoEnumerationProperty__Group__0 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:453:2: rule__DtoEnumerationProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DtoEnumerationProperty__Group__0_in_ruleDtoEnumerationProperty934);
            rule__DtoEnumerationProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDtoEnumerationPropertyAccess().getGroup()); 

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
    // $ANTLR end ruleDtoEnumerationProperty


    // $ANTLR start rule__DataContractModel__Alternatives_5
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:465:1: rule__DataContractModel__Alternatives_5 : ( ( ( rule__DataContractModel__DtosAssignment_5_0 ) ) | ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) ) );
    public final void rule__DataContractModel__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:469:1: ( ( ( rule__DataContractModel__DtosAssignment_5_0 ) ) | ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==17||LA1_1==23) ) {
                    alt1=1;
                }
                else if ( (LA1_1==13) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("465:1: rule__DataContractModel__Alternatives_5 : ( ( ( rule__DataContractModel__DtosAssignment_5_0 ) ) | ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) ) );", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 17:
            case 23:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("465:1: rule__DataContractModel__Alternatives_5 : ( ( ( rule__DataContractModel__DtosAssignment_5_0 ) ) | ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:470:1: ( ( rule__DataContractModel__DtosAssignment_5_0 ) )
                    {
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:470:1: ( ( rule__DataContractModel__DtosAssignment_5_0 ) )
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:471:1: ( rule__DataContractModel__DtosAssignment_5_0 )
                    {
                     before(grammarAccess.getDataContractModelAccess().getDtosAssignment_5_0()); 
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:472:1: ( rule__DataContractModel__DtosAssignment_5_0 )
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:472:2: rule__DataContractModel__DtosAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__DataContractModel__DtosAssignment_5_0_in_rule__DataContractModel__Alternatives_5970);
                    rule__DataContractModel__DtosAssignment_5_0();
                    _fsp--;


                    }

                     after(grammarAccess.getDataContractModelAccess().getDtosAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:476:6: ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) )
                    {
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:476:6: ( ( rule__DataContractModel__EnumerationsAssignment_5_1 ) )
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:477:1: ( rule__DataContractModel__EnumerationsAssignment_5_1 )
                    {
                     before(grammarAccess.getDataContractModelAccess().getEnumerationsAssignment_5_1()); 
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:478:1: ( rule__DataContractModel__EnumerationsAssignment_5_1 )
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:478:2: rule__DataContractModel__EnumerationsAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__DataContractModel__EnumerationsAssignment_5_1_in_rule__DataContractModel__Alternatives_5988);
                    rule__DataContractModel__EnumerationsAssignment_5_1();
                    _fsp--;


                    }

                     after(grammarAccess.getDataContractModelAccess().getEnumerationsAssignment_5_1()); 

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
    // $ANTLR end rule__DataContractModel__Alternatives_5


    // $ANTLR start rule__Dto__Alternatives
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:487:1: rule__Dto__Alternatives : ( ( ruleBusinessClassDto ) | ( ruleCustomDto ) );
    public final void rule__Dto__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:491:1: ( ( ruleBusinessClassDto ) | ( ruleCustomDto ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==17) ) {
                    alt2=1;
                }
                else if ( (LA2_1==23) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("487:1: rule__Dto__Alternatives : ( ( ruleBusinessClassDto ) | ( ruleCustomDto ) );", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("487:1: rule__Dto__Alternatives : ( ( ruleBusinessClassDto ) | ( ruleCustomDto ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:492:1: ( ruleBusinessClassDto )
                    {
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:492:1: ( ruleBusinessClassDto )
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:493:1: ruleBusinessClassDto
                    {
                     before(grammarAccess.getDtoAccess().getBusinessClassDtoParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBusinessClassDto_in_rule__Dto__Alternatives1021);
                    ruleBusinessClassDto();
                    _fsp--;

                     after(grammarAccess.getDtoAccess().getBusinessClassDtoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:498:6: ( ruleCustomDto )
                    {
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:498:6: ( ruleCustomDto )
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:499:1: ruleCustomDto
                    {
                     before(grammarAccess.getDtoAccess().getCustomDtoParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCustomDto_in_rule__Dto__Alternatives1038);
                    ruleCustomDto();
                    _fsp--;

                     after(grammarAccess.getDtoAccess().getCustomDtoParserRuleCall_1()); 

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
    // $ANTLR end rule__Dto__Alternatives


    // $ANTLR start rule__ExternalReference__KeywordAlternatives_3_0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:509:1: rule__ExternalReference__KeywordAlternatives_3_0 : ( ( 'import' ) | ( 'businessclass' ) | ( 'enumeration' ) );
    public final void rule__ExternalReference__KeywordAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:513:1: ( ( 'import' ) | ( 'businessclass' ) | ( 'enumeration' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("509:1: rule__ExternalReference__KeywordAlternatives_3_0 : ( ( 'import' ) | ( 'businessclass' ) | ( 'enumeration' ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:514:1: ( 'import' )
                    {
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:514:1: ( 'import' )
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:515:1: 'import'
                    {
                     before(grammarAccess.getExternalReferenceAccess().getKeywordImportKeyword_3_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__ExternalReference__KeywordAlternatives_3_01071); 
                     after(grammarAccess.getExternalReferenceAccess().getKeywordImportKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:522:6: ( 'businessclass' )
                    {
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:522:6: ( 'businessclass' )
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:523:1: 'businessclass'
                    {
                     before(grammarAccess.getExternalReferenceAccess().getKeywordBusinessclassKeyword_3_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__ExternalReference__KeywordAlternatives_3_01091); 
                     after(grammarAccess.getExternalReferenceAccess().getKeywordBusinessclassKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:530:6: ( 'enumeration' )
                    {
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:530:6: ( 'enumeration' )
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:531:1: 'enumeration'
                    {
                     before(grammarAccess.getExternalReferenceAccess().getKeywordEnumerationKeyword_3_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__ExternalReference__KeywordAlternatives_3_01111); 
                     after(grammarAccess.getExternalReferenceAccess().getKeywordEnumerationKeyword_3_0_2()); 

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
    // $ANTLR end rule__ExternalReference__KeywordAlternatives_3_0


    // $ANTLR start rule__BusinessClassDto__Alternatives_5
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:543:1: rule__BusinessClassDto__Alternatives_5 : ( ( ';' ) | ( ( rule__BusinessClassDto__Group_5_1__0 ) ) );
    public final void rule__BusinessClassDto__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:547:1: ( ( ';' ) | ( ( rule__BusinessClassDto__Group_5_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("543:1: rule__BusinessClassDto__Alternatives_5 : ( ( ';' ) | ( ( rule__BusinessClassDto__Group_5_1__0 ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:548:1: ( ';' )
                    {
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:548:1: ( ';' )
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:549:1: ';'
                    {
                     before(grammarAccess.getBusinessClassDtoAccess().getSemicolonKeyword_5_0()); 
                    match(input,14,FOLLOW_14_in_rule__BusinessClassDto__Alternatives_51146); 
                     after(grammarAccess.getBusinessClassDtoAccess().getSemicolonKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:556:6: ( ( rule__BusinessClassDto__Group_5_1__0 ) )
                    {
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:556:6: ( ( rule__BusinessClassDto__Group_5_1__0 ) )
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:557:1: ( rule__BusinessClassDto__Group_5_1__0 )
                    {
                     before(grammarAccess.getBusinessClassDtoAccess().getGroup_5_1()); 
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:558:1: ( rule__BusinessClassDto__Group_5_1__0 )
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:558:2: rule__BusinessClassDto__Group_5_1__0
                    {
                    pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1__0_in_rule__BusinessClassDto__Alternatives_51165);
                    rule__BusinessClassDto__Group_5_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBusinessClassDtoAccess().getGroup_5_1()); 

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
    // $ANTLR end rule__BusinessClassDto__Alternatives_5


    // $ANTLR start rule__DtoProperty__Alternatives_0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:567:1: rule__DtoProperty__Alternatives_0 : ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) );
    public final void rule__DtoProperty__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:571:1: ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt5=1;
                    }
                    break;
                case 27:
                    {
                    alt5=4;
                    }
                    break;
                case 25:
                    {
                    alt5=2;
                    }
                    break;
                case 26:
                    {
                    alt5=3;
                    }
                    break;
                case 28:
                    {
                    alt5=5;
                    }
                    break;
                case RULE_ID:
                    {
                    alt5=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("567:1: rule__DtoProperty__Alternatives_0 : ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) );", 5, 1, input);

                    throw nvae;
                }

                }
                break;
            case 24:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            case 27:
                {
                alt5=4;
                }
                break;
            case 28:
                {
                alt5=5;
                }
                break;
            case RULE_ID:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("567:1: rule__DtoProperty__Alternatives_0 : ( ( ruleDtoBooleanProperty ) | ( ruleDtoStringProperty ) | ( ruleDtoDateTimeProperty ) | ( ruleDtoIntegerProperty ) | ( ruleDtoDecimalProperty ) | ( ruleDtoEnumerationProperty ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:572:1: ( ruleDtoBooleanProperty )
                    {
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:572:1: ( ruleDtoBooleanProperty )
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:573:1: ruleDtoBooleanProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoBooleanPropertyParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleDtoBooleanProperty_in_rule__DtoProperty__Alternatives_01198);
                    ruleDtoBooleanProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoBooleanPropertyParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:578:6: ( ruleDtoStringProperty )
                    {
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:578:6: ( ruleDtoStringProperty )
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:579:1: ruleDtoStringProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoStringPropertyParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleDtoStringProperty_in_rule__DtoProperty__Alternatives_01215);
                    ruleDtoStringProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoStringPropertyParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:584:6: ( ruleDtoDateTimeProperty )
                    {
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:584:6: ( ruleDtoDateTimeProperty )
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:585:1: ruleDtoDateTimeProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoDateTimePropertyParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleDtoDateTimeProperty_in_rule__DtoProperty__Alternatives_01232);
                    ruleDtoDateTimeProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoDateTimePropertyParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:590:6: ( ruleDtoIntegerProperty )
                    {
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:590:6: ( ruleDtoIntegerProperty )
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:591:1: ruleDtoIntegerProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoIntegerPropertyParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleDtoIntegerProperty_in_rule__DtoProperty__Alternatives_01249);
                    ruleDtoIntegerProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoIntegerPropertyParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:596:6: ( ruleDtoDecimalProperty )
                    {
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:596:6: ( ruleDtoDecimalProperty )
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:597:1: ruleDtoDecimalProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoDecimalPropertyParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleDtoDecimalProperty_in_rule__DtoProperty__Alternatives_01266);
                    ruleDtoDecimalProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoDecimalPropertyParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:602:6: ( ruleDtoEnumerationProperty )
                    {
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:602:6: ( ruleDtoEnumerationProperty )
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:603:1: ruleDtoEnumerationProperty
                    {
                     before(grammarAccess.getDtoPropertyAccess().getDtoEnumerationPropertyParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_ruleDtoEnumerationProperty_in_rule__DtoProperty__Alternatives_01283);
                    ruleDtoEnumerationProperty();
                    _fsp--;

                     after(grammarAccess.getDtoPropertyAccess().getDtoEnumerationPropertyParserRuleCall_0_5()); 

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
    // $ANTLR end rule__DtoProperty__Alternatives_0


    // $ANTLR start rule__DataContractModel__Group__0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:615:1: rule__DataContractModel__Group__0 : ( ( rule__DataContractModel__DescriptionAssignment_0 )? ) rule__DataContractModel__Group__1 ;
    public final void rule__DataContractModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:619:1: ( ( ( rule__DataContractModel__DescriptionAssignment_0 )? ) rule__DataContractModel__Group__1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:620:1: ( ( rule__DataContractModel__DescriptionAssignment_0 )? ) rule__DataContractModel__Group__1
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:620:1: ( ( rule__DataContractModel__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:621:1: ( rule__DataContractModel__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDataContractModelAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:622:1: ( rule__DataContractModel__DescriptionAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:622:2: rule__DataContractModel__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DataContractModel__DescriptionAssignment_0_in_rule__DataContractModel__Group__01317);
                    rule__DataContractModel__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataContractModelAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DataContractModel__Group__1_in_rule__DataContractModel__Group__01327);
            rule__DataContractModel__Group__1();
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
    // $ANTLR end rule__DataContractModel__Group__0


    // $ANTLR start rule__DataContractModel__Group__1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:633:1: rule__DataContractModel__Group__1 : ( 'datacontract' ) rule__DataContractModel__Group__2 ;
    public final void rule__DataContractModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:637:1: ( ( 'datacontract' ) rule__DataContractModel__Group__2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:638:1: ( 'datacontract' ) rule__DataContractModel__Group__2
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:638:1: ( 'datacontract' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:639:1: 'datacontract'
            {
             before(grammarAccess.getDataContractModelAccess().getDatacontractKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__DataContractModel__Group__11356); 
             after(grammarAccess.getDataContractModelAccess().getDatacontractKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__DataContractModel__Group__2_in_rule__DataContractModel__Group__11366);
            rule__DataContractModel__Group__2();
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
    // $ANTLR end rule__DataContractModel__Group__1


    // $ANTLR start rule__DataContractModel__Group__2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:653:1: rule__DataContractModel__Group__2 : ( ( rule__DataContractModel__NameAssignment_2 ) ) rule__DataContractModel__Group__3 ;
    public final void rule__DataContractModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:657:1: ( ( ( rule__DataContractModel__NameAssignment_2 ) ) rule__DataContractModel__Group__3 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:658:1: ( ( rule__DataContractModel__NameAssignment_2 ) ) rule__DataContractModel__Group__3
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:658:1: ( ( rule__DataContractModel__NameAssignment_2 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:659:1: ( rule__DataContractModel__NameAssignment_2 )
            {
             before(grammarAccess.getDataContractModelAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:660:1: ( rule__DataContractModel__NameAssignment_2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:660:2: rule__DataContractModel__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DataContractModel__NameAssignment_2_in_rule__DataContractModel__Group__21394);
            rule__DataContractModel__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDataContractModelAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__DataContractModel__Group__3_in_rule__DataContractModel__Group__21403);
            rule__DataContractModel__Group__3();
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
    // $ANTLR end rule__DataContractModel__Group__2


    // $ANTLR start rule__DataContractModel__Group__3
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:671:1: rule__DataContractModel__Group__3 : ( ';' ) rule__DataContractModel__Group__4 ;
    public final void rule__DataContractModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:675:1: ( ( ';' ) rule__DataContractModel__Group__4 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:676:1: ( ';' ) rule__DataContractModel__Group__4
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:676:1: ( ';' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:677:1: ';'
            {
             before(grammarAccess.getDataContractModelAccess().getSemicolonKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__DataContractModel__Group__31432); 
             after(grammarAccess.getDataContractModelAccess().getSemicolonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__DataContractModel__Group__4_in_rule__DataContractModel__Group__31442);
            rule__DataContractModel__Group__4();
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
    // $ANTLR end rule__DataContractModel__Group__3


    // $ANTLR start rule__DataContractModel__Group__4
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:691:1: rule__DataContractModel__Group__4 : ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* ) rule__DataContractModel__Group__5 ;
    public final void rule__DataContractModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:695:1: ( ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* ) rule__DataContractModel__Group__5 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:696:1: ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* ) rule__DataContractModel__Group__5
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:696:1: ( ( rule__DataContractModel__ExternalReferencesAssignment_4 )* )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:697:1: ( rule__DataContractModel__ExternalReferencesAssignment_4 )*
            {
             before(grammarAccess.getDataContractModelAccess().getExternalReferencesAssignment_4()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:698:1: ( rule__DataContractModel__ExternalReferencesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==16) ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:698:2: rule__DataContractModel__ExternalReferencesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__DataContractModel__ExternalReferencesAssignment_4_in_rule__DataContractModel__Group__41470);
            	    rule__DataContractModel__ExternalReferencesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDataContractModelAccess().getExternalReferencesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__DataContractModel__Group__5_in_rule__DataContractModel__Group__41480);
            rule__DataContractModel__Group__5();
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
    // $ANTLR end rule__DataContractModel__Group__4


    // $ANTLR start rule__DataContractModel__Group__5
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:709:1: rule__DataContractModel__Group__5 : ( ( rule__DataContractModel__Alternatives_5 )* ) ;
    public final void rule__DataContractModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:713:1: ( ( ( rule__DataContractModel__Alternatives_5 )* ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:714:1: ( ( rule__DataContractModel__Alternatives_5 )* )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:714:1: ( ( rule__DataContractModel__Alternatives_5 )* )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:715:1: ( rule__DataContractModel__Alternatives_5 )*
            {
             before(grammarAccess.getDataContractModelAccess().getAlternatives_5()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:716:1: ( rule__DataContractModel__Alternatives_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING||LA8_0==13||LA8_0==17||LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:716:2: rule__DataContractModel__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__DataContractModel__Alternatives_5_in_rule__DataContractModel__Group__51508);
            	    rule__DataContractModel__Alternatives_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDataContractModelAccess().getAlternatives_5()); 

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
    // $ANTLR end rule__DataContractModel__Group__5


    // $ANTLR start rule__ExternalReference__Group__0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:738:1: rule__ExternalReference__Group__0 : ( ( rule__ExternalReference__DescriptionAssignment_0 )? ) rule__ExternalReference__Group__1 ;
    public final void rule__ExternalReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:742:1: ( ( ( rule__ExternalReference__DescriptionAssignment_0 )? ) rule__ExternalReference__Group__1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:743:1: ( ( rule__ExternalReference__DescriptionAssignment_0 )? ) rule__ExternalReference__Group__1
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:743:1: ( ( rule__ExternalReference__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:744:1: ( rule__ExternalReference__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getExternalReferenceAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:745:1: ( rule__ExternalReference__DescriptionAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:745:2: rule__ExternalReference__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ExternalReference__DescriptionAssignment_0_in_rule__ExternalReference__Group__01555);
                    rule__ExternalReference__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalReferenceAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__1_in_rule__ExternalReference__Group__01565);
            rule__ExternalReference__Group__1();
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
    // $ANTLR end rule__ExternalReference__Group__0


    // $ANTLR start rule__ExternalReference__Group__1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:756:1: rule__ExternalReference__Group__1 : ( 'from' ) rule__ExternalReference__Group__2 ;
    public final void rule__ExternalReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:760:1: ( ( 'from' ) rule__ExternalReference__Group__2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:761:1: ( 'from' ) rule__ExternalReference__Group__2
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:761:1: ( 'from' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:762:1: 'from'
            {
             before(grammarAccess.getExternalReferenceAccess().getFromKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__ExternalReference__Group__11594); 
             after(grammarAccess.getExternalReferenceAccess().getFromKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__2_in_rule__ExternalReference__Group__11604);
            rule__ExternalReference__Group__2();
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
    // $ANTLR end rule__ExternalReference__Group__1


    // $ANTLR start rule__ExternalReference__Group__2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:776:1: rule__ExternalReference__Group__2 : ( ( rule__ExternalReference__ModelnameAssignment_2 ) ) rule__ExternalReference__Group__3 ;
    public final void rule__ExternalReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:780:1: ( ( ( rule__ExternalReference__ModelnameAssignment_2 ) ) rule__ExternalReference__Group__3 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:781:1: ( ( rule__ExternalReference__ModelnameAssignment_2 ) ) rule__ExternalReference__Group__3
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:781:1: ( ( rule__ExternalReference__ModelnameAssignment_2 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:782:1: ( rule__ExternalReference__ModelnameAssignment_2 )
            {
             before(grammarAccess.getExternalReferenceAccess().getModelnameAssignment_2()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:783:1: ( rule__ExternalReference__ModelnameAssignment_2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:783:2: rule__ExternalReference__ModelnameAssignment_2
            {
            pushFollow(FOLLOW_rule__ExternalReference__ModelnameAssignment_2_in_rule__ExternalReference__Group__21632);
            rule__ExternalReference__ModelnameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getModelnameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__3_in_rule__ExternalReference__Group__21641);
            rule__ExternalReference__Group__3();
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
    // $ANTLR end rule__ExternalReference__Group__2


    // $ANTLR start rule__ExternalReference__Group__3
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:794:1: rule__ExternalReference__Group__3 : ( ( rule__ExternalReference__KeywordAssignment_3 ) ) rule__ExternalReference__Group__4 ;
    public final void rule__ExternalReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:798:1: ( ( ( rule__ExternalReference__KeywordAssignment_3 ) ) rule__ExternalReference__Group__4 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:799:1: ( ( rule__ExternalReference__KeywordAssignment_3 ) ) rule__ExternalReference__Group__4
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:799:1: ( ( rule__ExternalReference__KeywordAssignment_3 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:800:1: ( rule__ExternalReference__KeywordAssignment_3 )
            {
             before(grammarAccess.getExternalReferenceAccess().getKeywordAssignment_3()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:801:1: ( rule__ExternalReference__KeywordAssignment_3 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:801:2: rule__ExternalReference__KeywordAssignment_3
            {
            pushFollow(FOLLOW_rule__ExternalReference__KeywordAssignment_3_in_rule__ExternalReference__Group__31669);
            rule__ExternalReference__KeywordAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getKeywordAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__4_in_rule__ExternalReference__Group__31678);
            rule__ExternalReference__Group__4();
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
    // $ANTLR end rule__ExternalReference__Group__3


    // $ANTLR start rule__ExternalReference__Group__4
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:812:1: rule__ExternalReference__Group__4 : ( ( rule__ExternalReference__NameAssignment_4 ) ) rule__ExternalReference__Group__5 ;
    public final void rule__ExternalReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:816:1: ( ( ( rule__ExternalReference__NameAssignment_4 ) ) rule__ExternalReference__Group__5 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:817:1: ( ( rule__ExternalReference__NameAssignment_4 ) ) rule__ExternalReference__Group__5
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:817:1: ( ( rule__ExternalReference__NameAssignment_4 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:818:1: ( rule__ExternalReference__NameAssignment_4 )
            {
             before(grammarAccess.getExternalReferenceAccess().getNameAssignment_4()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:819:1: ( rule__ExternalReference__NameAssignment_4 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:819:2: rule__ExternalReference__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__ExternalReference__NameAssignment_4_in_rule__ExternalReference__Group__41706);
            rule__ExternalReference__NameAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getNameAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__5_in_rule__ExternalReference__Group__41715);
            rule__ExternalReference__Group__5();
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
    // $ANTLR end rule__ExternalReference__Group__4


    // $ANTLR start rule__ExternalReference__Group__5
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:830:1: rule__ExternalReference__Group__5 : ( ';' ) ;
    public final void rule__ExternalReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:834:1: ( ( ';' ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:835:1: ( ';' )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:835:1: ( ';' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:836:1: ';'
            {
             before(grammarAccess.getExternalReferenceAccess().getSemicolonKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__ExternalReference__Group__51744); 
             after(grammarAccess.getExternalReferenceAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end rule__ExternalReference__Group__5


    // $ANTLR start rule__BusinessClassDto__Group__0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:861:1: rule__BusinessClassDto__Group__0 : ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? ) rule__BusinessClassDto__Group__1 ;
    public final void rule__BusinessClassDto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:865:1: ( ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? ) rule__BusinessClassDto__Group__1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:866:1: ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? ) rule__BusinessClassDto__Group__1
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:866:1: ( ( rule__BusinessClassDto__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:867:1: ( rule__BusinessClassDto__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBusinessClassDtoAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:868:1: ( rule__BusinessClassDto__DescriptionAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:868:2: rule__BusinessClassDto__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BusinessClassDto__DescriptionAssignment_0_in_rule__BusinessClassDto__Group__01791);
                    rule__BusinessClassDto__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassDtoAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__1_in_rule__BusinessClassDto__Group__01801);
            rule__BusinessClassDto__Group__1();
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
    // $ANTLR end rule__BusinessClassDto__Group__0


    // $ANTLR start rule__BusinessClassDto__Group__1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:879:1: rule__BusinessClassDto__Group__1 : ( 'class' ) rule__BusinessClassDto__Group__2 ;
    public final void rule__BusinessClassDto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:883:1: ( ( 'class' ) rule__BusinessClassDto__Group__2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:884:1: ( 'class' ) rule__BusinessClassDto__Group__2
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:884:1: ( 'class' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:885:1: 'class'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getClassKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__BusinessClassDto__Group__11830); 
             after(grammarAccess.getBusinessClassDtoAccess().getClassKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__2_in_rule__BusinessClassDto__Group__11840);
            rule__BusinessClassDto__Group__2();
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
    // $ANTLR end rule__BusinessClassDto__Group__1


    // $ANTLR start rule__BusinessClassDto__Group__2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:899:1: rule__BusinessClassDto__Group__2 : ( ( rule__BusinessClassDto__NameAssignment_2 ) ) rule__BusinessClassDto__Group__3 ;
    public final void rule__BusinessClassDto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:903:1: ( ( ( rule__BusinessClassDto__NameAssignment_2 ) ) rule__BusinessClassDto__Group__3 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:904:1: ( ( rule__BusinessClassDto__NameAssignment_2 ) ) rule__BusinessClassDto__Group__3
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:904:1: ( ( rule__BusinessClassDto__NameAssignment_2 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:905:1: ( rule__BusinessClassDto__NameAssignment_2 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:906:1: ( rule__BusinessClassDto__NameAssignment_2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:906:2: rule__BusinessClassDto__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__NameAssignment_2_in_rule__BusinessClassDto__Group__21868);
            rule__BusinessClassDto__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__3_in_rule__BusinessClassDto__Group__21877);
            rule__BusinessClassDto__Group__3();
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
    // $ANTLR end rule__BusinessClassDto__Group__2


    // $ANTLR start rule__BusinessClassDto__Group__3
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:917:1: rule__BusinessClassDto__Group__3 : ( 'represents' ) rule__BusinessClassDto__Group__4 ;
    public final void rule__BusinessClassDto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:921:1: ( ( 'represents' ) rule__BusinessClassDto__Group__4 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:922:1: ( 'represents' ) rule__BusinessClassDto__Group__4
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:922:1: ( 'represents' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:923:1: 'represents'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getRepresentsKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__BusinessClassDto__Group__31906); 
             after(grammarAccess.getBusinessClassDtoAccess().getRepresentsKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__4_in_rule__BusinessClassDto__Group__31916);
            rule__BusinessClassDto__Group__4();
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
    // $ANTLR end rule__BusinessClassDto__Group__3


    // $ANTLR start rule__BusinessClassDto__Group__4
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:937:1: rule__BusinessClassDto__Group__4 : ( ( rule__BusinessClassDto__BaseAssignment_4 ) ) rule__BusinessClassDto__Group__5 ;
    public final void rule__BusinessClassDto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:941:1: ( ( ( rule__BusinessClassDto__BaseAssignment_4 ) ) rule__BusinessClassDto__Group__5 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:942:1: ( ( rule__BusinessClassDto__BaseAssignment_4 ) ) rule__BusinessClassDto__Group__5
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:942:1: ( ( rule__BusinessClassDto__BaseAssignment_4 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:943:1: ( rule__BusinessClassDto__BaseAssignment_4 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getBaseAssignment_4()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:944:1: ( rule__BusinessClassDto__BaseAssignment_4 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:944:2: rule__BusinessClassDto__BaseAssignment_4
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__BaseAssignment_4_in_rule__BusinessClassDto__Group__41944);
            rule__BusinessClassDto__BaseAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getBaseAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group__5_in_rule__BusinessClassDto__Group__41953);
            rule__BusinessClassDto__Group__5();
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
    // $ANTLR end rule__BusinessClassDto__Group__4


    // $ANTLR start rule__BusinessClassDto__Group__5
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:955:1: rule__BusinessClassDto__Group__5 : ( ( rule__BusinessClassDto__Alternatives_5 ) ) ;
    public final void rule__BusinessClassDto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:959:1: ( ( ( rule__BusinessClassDto__Alternatives_5 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:960:1: ( ( rule__BusinessClassDto__Alternatives_5 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:960:1: ( ( rule__BusinessClassDto__Alternatives_5 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:961:1: ( rule__BusinessClassDto__Alternatives_5 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getAlternatives_5()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:962:1: ( rule__BusinessClassDto__Alternatives_5 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:962:2: rule__BusinessClassDto__Alternatives_5
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__Alternatives_5_in_rule__BusinessClassDto__Group__51981);
            rule__BusinessClassDto__Alternatives_5();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getAlternatives_5()); 

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
    // $ANTLR end rule__BusinessClassDto__Group__5


    // $ANTLR start rule__BusinessClassDto__Group_5_1__0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:984:1: rule__BusinessClassDto__Group_5_1__0 : ( '[' ) rule__BusinessClassDto__Group_5_1__1 ;
    public final void rule__BusinessClassDto__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:988:1: ( ( '[' ) rule__BusinessClassDto__Group_5_1__1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:989:1: ( '[' ) rule__BusinessClassDto__Group_5_1__1
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:989:1: ( '[' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:990:1: '['
            {
             before(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_1_0()); 
            match(input,19,FOLLOW_19_in_rule__BusinessClassDto__Group_5_1__02028); 
             after(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_1_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1__1_in_rule__BusinessClassDto__Group_5_1__02038);
            rule__BusinessClassDto__Group_5_1__1();
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
    // $ANTLR end rule__BusinessClassDto__Group_5_1__0


    // $ANTLR start rule__BusinessClassDto__Group_5_1__1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1004:1: rule__BusinessClassDto__Group_5_1__1 : ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )* ) ) rule__BusinessClassDto__Group_5_1__2 ;
    public final void rule__BusinessClassDto__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1008:1: ( ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )* ) ) rule__BusinessClassDto__Group_5_1__2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1009:1: ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )* ) ) rule__BusinessClassDto__Group_5_1__2
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1009:1: ( ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )* ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1010:1: ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 ) ) ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )* )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1010:1: ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1011:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesAssignment_5_1_1()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1012:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1012:2: rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1_in_rule__BusinessClassDto__Group_5_1__12068);
            rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesAssignment_5_1_1()); 

            }

            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1015:1: ( ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )* )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1016:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )*
            {
             before(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesAssignment_5_1_1()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1017:1: ( rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1017:2: rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1
            	    {
            	    pushFollow(FOLLOW_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1_in_rule__BusinessClassDto__Group_5_1__12080);
            	    rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesAssignment_5_1_1()); 

            }


            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1__2_in_rule__BusinessClassDto__Group_5_1__12092);
            rule__BusinessClassDto__Group_5_1__2();
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
    // $ANTLR end rule__BusinessClassDto__Group_5_1__1


    // $ANTLR start rule__BusinessClassDto__Group_5_1__2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1029:1: rule__BusinessClassDto__Group_5_1__2 : ( ( rule__BusinessClassDto__Group_5_1_2__0 )? ) rule__BusinessClassDto__Group_5_1__3 ;
    public final void rule__BusinessClassDto__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1033:1: ( ( ( rule__BusinessClassDto__Group_5_1_2__0 )? ) rule__BusinessClassDto__Group_5_1__3 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1034:1: ( ( rule__BusinessClassDto__Group_5_1_2__0 )? ) rule__BusinessClassDto__Group_5_1__3
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1034:1: ( ( rule__BusinessClassDto__Group_5_1_2__0 )? )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1035:1: ( rule__BusinessClassDto__Group_5_1_2__0 )?
            {
             before(grammarAccess.getBusinessClassDtoAccess().getGroup_5_1_2()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1036:1: ( rule__BusinessClassDto__Group_5_1_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1036:2: rule__BusinessClassDto__Group_5_1_2__0
                    {
                    pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1_2__0_in_rule__BusinessClassDto__Group_5_1__22120);
                    rule__BusinessClassDto__Group_5_1_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassDtoAccess().getGroup_5_1_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1__3_in_rule__BusinessClassDto__Group_5_1__22130);
            rule__BusinessClassDto__Group_5_1__3();
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
    // $ANTLR end rule__BusinessClassDto__Group_5_1__2


    // $ANTLR start rule__BusinessClassDto__Group_5_1__3
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1047:1: rule__BusinessClassDto__Group_5_1__3 : ( ']' ) ;
    public final void rule__BusinessClassDto__Group_5_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1051:1: ( ( ']' ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1052:1: ( ']' )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1052:1: ( ']' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1053:1: ']'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getRightSquareBracketKeyword_5_1_3()); 
            match(input,20,FOLLOW_20_in_rule__BusinessClassDto__Group_5_1__32159); 
             after(grammarAccess.getBusinessClassDtoAccess().getRightSquareBracketKeyword_5_1_3()); 

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
    // $ANTLR end rule__BusinessClassDto__Group_5_1__3


    // $ANTLR start rule__BusinessClassDto__Group_5_1_2__0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1074:1: rule__BusinessClassDto__Group_5_1_2__0 : ( 'references' ) rule__BusinessClassDto__Group_5_1_2__1 ;
    public final void rule__BusinessClassDto__Group_5_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1078:1: ( ( 'references' ) rule__BusinessClassDto__Group_5_1_2__1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1079:1: ( 'references' ) rule__BusinessClassDto__Group_5_1_2__1
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1079:1: ( 'references' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1080:1: 'references'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getReferencesKeyword_5_1_2_0()); 
            match(input,21,FOLLOW_21_in_rule__BusinessClassDto__Group_5_1_2__02203); 
             after(grammarAccess.getBusinessClassDtoAccess().getReferencesKeyword_5_1_2_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1_2__1_in_rule__BusinessClassDto__Group_5_1_2__02213);
            rule__BusinessClassDto__Group_5_1_2__1();
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
    // $ANTLR end rule__BusinessClassDto__Group_5_1_2__0


    // $ANTLR start rule__BusinessClassDto__Group_5_1_2__1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1094:1: rule__BusinessClassDto__Group_5_1_2__1 : ( '[' ) rule__BusinessClassDto__Group_5_1_2__2 ;
    public final void rule__BusinessClassDto__Group_5_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1098:1: ( ( '[' ) rule__BusinessClassDto__Group_5_1_2__2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1099:1: ( '[' ) rule__BusinessClassDto__Group_5_1_2__2
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1099:1: ( '[' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1100:1: '['
            {
             before(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_1_2_1()); 
            match(input,19,FOLLOW_19_in_rule__BusinessClassDto__Group_5_1_2__12242); 
             after(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_1_2_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1_2__2_in_rule__BusinessClassDto__Group_5_1_2__12252);
            rule__BusinessClassDto__Group_5_1_2__2();
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
    // $ANTLR end rule__BusinessClassDto__Group_5_1_2__1


    // $ANTLR start rule__BusinessClassDto__Group_5_1_2__2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1114:1: rule__BusinessClassDto__Group_5_1_2__2 : ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )* ) ) rule__BusinessClassDto__Group_5_1_2__3 ;
    public final void rule__BusinessClassDto__Group_5_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1118:1: ( ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )* ) ) rule__BusinessClassDto__Group_5_1_2__3 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1119:1: ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )* ) ) rule__BusinessClassDto__Group_5_1_2__3
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1119:1: ( ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )* ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1120:1: ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 ) ) ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )* )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1120:1: ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1121:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesAssignment_5_1_2_2()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1122:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1122:2: rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2
            {
            pushFollow(FOLLOW_rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2_in_rule__BusinessClassDto__Group_5_1_2__22282);
            rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesAssignment_5_1_2_2()); 

            }

            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1125:1: ( ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )* )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1126:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )*
            {
             before(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesAssignment_5_1_2_2()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1127:1: ( rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1127:2: rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2
            	    {
            	    pushFollow(FOLLOW_rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2_in_rule__BusinessClassDto__Group_5_1_2__22294);
            	    rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesAssignment_5_1_2_2()); 

            }


            }

            pushFollow(FOLLOW_rule__BusinessClassDto__Group_5_1_2__3_in_rule__BusinessClassDto__Group_5_1_2__22306);
            rule__BusinessClassDto__Group_5_1_2__3();
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
    // $ANTLR end rule__BusinessClassDto__Group_5_1_2__2


    // $ANTLR start rule__BusinessClassDto__Group_5_1_2__3
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1139:1: rule__BusinessClassDto__Group_5_1_2__3 : ( ']' ) ;
    public final void rule__BusinessClassDto__Group_5_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1143:1: ( ( ']' ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1144:1: ( ']' )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1144:1: ( ']' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1145:1: ']'
            {
             before(grammarAccess.getBusinessClassDtoAccess().getRightSquareBracketKeyword_5_1_2_3()); 
            match(input,20,FOLLOW_20_in_rule__BusinessClassDto__Group_5_1_2__32335); 
             after(grammarAccess.getBusinessClassDtoAccess().getRightSquareBracketKeyword_5_1_2_3()); 

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
    // $ANTLR end rule__BusinessClassDto__Group_5_1_2__3


    // $ANTLR start rule__EnumerationDto__Group__0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1166:1: rule__EnumerationDto__Group__0 : ( ( rule__EnumerationDto__DescriptionAssignment_0 )? ) rule__EnumerationDto__Group__1 ;
    public final void rule__EnumerationDto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1170:1: ( ( ( rule__EnumerationDto__DescriptionAssignment_0 )? ) rule__EnumerationDto__Group__1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1171:1: ( ( rule__EnumerationDto__DescriptionAssignment_0 )? ) rule__EnumerationDto__Group__1
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1171:1: ( ( rule__EnumerationDto__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1172:1: ( rule__EnumerationDto__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumerationDtoAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1173:1: ( rule__EnumerationDto__DescriptionAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1173:2: rule__EnumerationDto__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EnumerationDto__DescriptionAssignment_0_in_rule__EnumerationDto__Group__02378);
                    rule__EnumerationDto__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationDtoAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationDto__Group__1_in_rule__EnumerationDto__Group__02388);
            rule__EnumerationDto__Group__1();
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
    // $ANTLR end rule__EnumerationDto__Group__0


    // $ANTLR start rule__EnumerationDto__Group__1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1184:1: rule__EnumerationDto__Group__1 : ( 'enumeration' ) rule__EnumerationDto__Group__2 ;
    public final void rule__EnumerationDto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1188:1: ( ( 'enumeration' ) rule__EnumerationDto__Group__2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1189:1: ( 'enumeration' ) rule__EnumerationDto__Group__2
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1189:1: ( 'enumeration' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1190:1: 'enumeration'
            {
             before(grammarAccess.getEnumerationDtoAccess().getEnumerationKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__EnumerationDto__Group__12417); 
             after(grammarAccess.getEnumerationDtoAccess().getEnumerationKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__EnumerationDto__Group__2_in_rule__EnumerationDto__Group__12427);
            rule__EnumerationDto__Group__2();
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
    // $ANTLR end rule__EnumerationDto__Group__1


    // $ANTLR start rule__EnumerationDto__Group__2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1204:1: rule__EnumerationDto__Group__2 : ( ( rule__EnumerationDto__NameAssignment_2 ) ) rule__EnumerationDto__Group__3 ;
    public final void rule__EnumerationDto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1208:1: ( ( ( rule__EnumerationDto__NameAssignment_2 ) ) rule__EnumerationDto__Group__3 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1209:1: ( ( rule__EnumerationDto__NameAssignment_2 ) ) rule__EnumerationDto__Group__3
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1209:1: ( ( rule__EnumerationDto__NameAssignment_2 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1210:1: ( rule__EnumerationDto__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationDtoAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1211:1: ( rule__EnumerationDto__NameAssignment_2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1211:2: rule__EnumerationDto__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumerationDto__NameAssignment_2_in_rule__EnumerationDto__Group__22455);
            rule__EnumerationDto__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEnumerationDtoAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__EnumerationDto__Group__3_in_rule__EnumerationDto__Group__22464);
            rule__EnumerationDto__Group__3();
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
    // $ANTLR end rule__EnumerationDto__Group__2


    // $ANTLR start rule__EnumerationDto__Group__3
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1222:1: rule__EnumerationDto__Group__3 : ( 'represents' ) rule__EnumerationDto__Group__4 ;
    public final void rule__EnumerationDto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1226:1: ( ( 'represents' ) rule__EnumerationDto__Group__4 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1227:1: ( 'represents' ) rule__EnumerationDto__Group__4
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1227:1: ( 'represents' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1228:1: 'represents'
            {
             before(grammarAccess.getEnumerationDtoAccess().getRepresentsKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__EnumerationDto__Group__32493); 
             after(grammarAccess.getEnumerationDtoAccess().getRepresentsKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__EnumerationDto__Group__4_in_rule__EnumerationDto__Group__32503);
            rule__EnumerationDto__Group__4();
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
    // $ANTLR end rule__EnumerationDto__Group__3


    // $ANTLR start rule__EnumerationDto__Group__4
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1242:1: rule__EnumerationDto__Group__4 : ( ( rule__EnumerationDto__BaseAssignment_4 ) ) rule__EnumerationDto__Group__5 ;
    public final void rule__EnumerationDto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1246:1: ( ( ( rule__EnumerationDto__BaseAssignment_4 ) ) rule__EnumerationDto__Group__5 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1247:1: ( ( rule__EnumerationDto__BaseAssignment_4 ) ) rule__EnumerationDto__Group__5
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1247:1: ( ( rule__EnumerationDto__BaseAssignment_4 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1248:1: ( rule__EnumerationDto__BaseAssignment_4 )
            {
             before(grammarAccess.getEnumerationDtoAccess().getBaseAssignment_4()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1249:1: ( rule__EnumerationDto__BaseAssignment_4 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1249:2: rule__EnumerationDto__BaseAssignment_4
            {
            pushFollow(FOLLOW_rule__EnumerationDto__BaseAssignment_4_in_rule__EnumerationDto__Group__42531);
            rule__EnumerationDto__BaseAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getEnumerationDtoAccess().getBaseAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__EnumerationDto__Group__5_in_rule__EnumerationDto__Group__42540);
            rule__EnumerationDto__Group__5();
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
    // $ANTLR end rule__EnumerationDto__Group__4


    // $ANTLR start rule__EnumerationDto__Group__5
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1260:1: rule__EnumerationDto__Group__5 : ( ';' ) ;
    public final void rule__EnumerationDto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1264:1: ( ( ';' ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1265:1: ( ';' )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1265:1: ( ';' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1266:1: ';'
            {
             before(grammarAccess.getEnumerationDtoAccess().getSemicolonKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__EnumerationDto__Group__52569); 
             after(grammarAccess.getEnumerationDtoAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end rule__EnumerationDto__Group__5


    // $ANTLR start rule__BusinessClassPropertyReference__Group__0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1291:1: rule__BusinessClassPropertyReference__Group__0 : ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) ) rule__BusinessClassPropertyReference__Group__1 ;
    public final void rule__BusinessClassPropertyReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1295:1: ( ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) ) rule__BusinessClassPropertyReference__Group__1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1296:1: ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) ) rule__BusinessClassPropertyReference__Group__1
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1296:1: ( ( rule__BusinessClassPropertyReference__NameAssignment_0 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1297:1: ( rule__BusinessClassPropertyReference__NameAssignment_0 )
            {
             before(grammarAccess.getBusinessClassPropertyReferenceAccess().getNameAssignment_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1298:1: ( rule__BusinessClassPropertyReference__NameAssignment_0 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1298:2: rule__BusinessClassPropertyReference__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BusinessClassPropertyReference__NameAssignment_0_in_rule__BusinessClassPropertyReference__Group__02616);
            rule__BusinessClassPropertyReference__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassPropertyReferenceAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassPropertyReference__Group__1_in_rule__BusinessClassPropertyReference__Group__02625);
            rule__BusinessClassPropertyReference__Group__1();
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
    // $ANTLR end rule__BusinessClassPropertyReference__Group__0


    // $ANTLR start rule__BusinessClassPropertyReference__Group__1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1309:1: rule__BusinessClassPropertyReference__Group__1 : ( ';' ) ;
    public final void rule__BusinessClassPropertyReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1313:1: ( ( ';' ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1314:1: ( ';' )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1314:1: ( ';' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1315:1: ';'
            {
             before(grammarAccess.getBusinessClassPropertyReferenceAccess().getSemicolonKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__BusinessClassPropertyReference__Group__12654); 
             after(grammarAccess.getBusinessClassPropertyReferenceAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end rule__BusinessClassPropertyReference__Group__1


    // $ANTLR start rule__BusinessClassAssociationRoleReference__Group__0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1332:1: rule__BusinessClassAssociationRoleReference__Group__0 : ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) ) rule__BusinessClassAssociationRoleReference__Group__1 ;
    public final void rule__BusinessClassAssociationRoleReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1336:1: ( ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) ) rule__BusinessClassAssociationRoleReference__Group__1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1337:1: ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) ) rule__BusinessClassAssociationRoleReference__Group__1
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1337:1: ( ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1338:1: ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 )
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getNameAssignment_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1339:1: ( rule__BusinessClassAssociationRoleReference__NameAssignment_0 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1339:2: rule__BusinessClassAssociationRoleReference__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__NameAssignment_0_in_rule__BusinessClassAssociationRoleReference__Group__02693);
            rule__BusinessClassAssociationRoleReference__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__Group__1_in_rule__BusinessClassAssociationRoleReference__Group__02702);
            rule__BusinessClassAssociationRoleReference__Group__1();
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
    // $ANTLR end rule__BusinessClassAssociationRoleReference__Group__0


    // $ANTLR start rule__BusinessClassAssociationRoleReference__Group__1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1350:1: rule__BusinessClassAssociationRoleReference__Group__1 : ( 'as' ) rule__BusinessClassAssociationRoleReference__Group__2 ;
    public final void rule__BusinessClassAssociationRoleReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1354:1: ( ( 'as' ) rule__BusinessClassAssociationRoleReference__Group__2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1355:1: ( 'as' ) rule__BusinessClassAssociationRoleReference__Group__2
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1355:1: ( 'as' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1356:1: 'as'
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getAsKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__BusinessClassAssociationRoleReference__Group__12731); 
             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getAsKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__Group__2_in_rule__BusinessClassAssociationRoleReference__Group__12741);
            rule__BusinessClassAssociationRoleReference__Group__2();
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
    // $ANTLR end rule__BusinessClassAssociationRoleReference__Group__1


    // $ANTLR start rule__BusinessClassAssociationRoleReference__Group__2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1370:1: rule__BusinessClassAssociationRoleReference__Group__2 : ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) ) rule__BusinessClassAssociationRoleReference__Group__3 ;
    public final void rule__BusinessClassAssociationRoleReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1374:1: ( ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) ) rule__BusinessClassAssociationRoleReference__Group__3 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1375:1: ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) ) rule__BusinessClassAssociationRoleReference__Group__3
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1375:1: ( ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1376:1: ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 )
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeAssignment_2()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1377:1: ( rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1377:2: rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2_in_rule__BusinessClassAssociationRoleReference__Group__22769);
            rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassAssociationRoleReference__Group__3_in_rule__BusinessClassAssociationRoleReference__Group__22778);
            rule__BusinessClassAssociationRoleReference__Group__3();
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
    // $ANTLR end rule__BusinessClassAssociationRoleReference__Group__2


    // $ANTLR start rule__BusinessClassAssociationRoleReference__Group__3
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1388:1: rule__BusinessClassAssociationRoleReference__Group__3 : ( ';' ) ;
    public final void rule__BusinessClassAssociationRoleReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1392:1: ( ( ';' ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1393:1: ( ';' )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1393:1: ( ';' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1394:1: ';'
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getSemicolonKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__BusinessClassAssociationRoleReference__Group__32807); 
             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end rule__BusinessClassAssociationRoleReference__Group__3


    // $ANTLR start rule__CustomDto__Group__0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1415:1: rule__CustomDto__Group__0 : ( ( rule__CustomDto__DescriptionAssignment_0 )? ) rule__CustomDto__Group__1 ;
    public final void rule__CustomDto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1419:1: ( ( ( rule__CustomDto__DescriptionAssignment_0 )? ) rule__CustomDto__Group__1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1420:1: ( ( rule__CustomDto__DescriptionAssignment_0 )? ) rule__CustomDto__Group__1
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1420:1: ( ( rule__CustomDto__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1421:1: ( rule__CustomDto__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getCustomDtoAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1422:1: ( rule__CustomDto__DescriptionAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1422:2: rule__CustomDto__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CustomDto__DescriptionAssignment_0_in_rule__CustomDto__Group__02850);
                    rule__CustomDto__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomDtoAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__CustomDto__Group__1_in_rule__CustomDto__Group__02860);
            rule__CustomDto__Group__1();
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
    // $ANTLR end rule__CustomDto__Group__0


    // $ANTLR start rule__CustomDto__Group__1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1433:1: rule__CustomDto__Group__1 : ( 'custom' ) rule__CustomDto__Group__2 ;
    public final void rule__CustomDto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1437:1: ( ( 'custom' ) rule__CustomDto__Group__2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1438:1: ( 'custom' ) rule__CustomDto__Group__2
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1438:1: ( 'custom' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1439:1: 'custom'
            {
             before(grammarAccess.getCustomDtoAccess().getCustomKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__CustomDto__Group__12889); 
             after(grammarAccess.getCustomDtoAccess().getCustomKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__CustomDto__Group__2_in_rule__CustomDto__Group__12899);
            rule__CustomDto__Group__2();
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
    // $ANTLR end rule__CustomDto__Group__1


    // $ANTLR start rule__CustomDto__Group__2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1453:1: rule__CustomDto__Group__2 : ( ( rule__CustomDto__NameAssignment_2 ) ) rule__CustomDto__Group__3 ;
    public final void rule__CustomDto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1457:1: ( ( ( rule__CustomDto__NameAssignment_2 ) ) rule__CustomDto__Group__3 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1458:1: ( ( rule__CustomDto__NameAssignment_2 ) ) rule__CustomDto__Group__3
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1458:1: ( ( rule__CustomDto__NameAssignment_2 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1459:1: ( rule__CustomDto__NameAssignment_2 )
            {
             before(grammarAccess.getCustomDtoAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1460:1: ( rule__CustomDto__NameAssignment_2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1460:2: rule__CustomDto__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CustomDto__NameAssignment_2_in_rule__CustomDto__Group__22927);
            rule__CustomDto__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCustomDtoAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__CustomDto__Group__3_in_rule__CustomDto__Group__22936);
            rule__CustomDto__Group__3();
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
    // $ANTLR end rule__CustomDto__Group__2


    // $ANTLR start rule__CustomDto__Group__3
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1471:1: rule__CustomDto__Group__3 : ( '[' ) rule__CustomDto__Group__4 ;
    public final void rule__CustomDto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1475:1: ( ( '[' ) rule__CustomDto__Group__4 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1476:1: ( '[' ) rule__CustomDto__Group__4
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1476:1: ( '[' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1477:1: '['
            {
             before(grammarAccess.getCustomDtoAccess().getLeftSquareBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__CustomDto__Group__32965); 
             after(grammarAccess.getCustomDtoAccess().getLeftSquareBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__CustomDto__Group__4_in_rule__CustomDto__Group__32975);
            rule__CustomDto__Group__4();
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
    // $ANTLR end rule__CustomDto__Group__3


    // $ANTLR start rule__CustomDto__Group__4
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1491:1: rule__CustomDto__Group__4 : ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) ) rule__CustomDto__Group__5 ;
    public final void rule__CustomDto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1495:1: ( ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) ) rule__CustomDto__Group__5 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1496:1: ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) ) rule__CustomDto__Group__5
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1496:1: ( ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1497:1: ( ( rule__CustomDto__PropertiesAssignment_4 ) ) ( ( rule__CustomDto__PropertiesAssignment_4 )* )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1497:1: ( ( rule__CustomDto__PropertiesAssignment_4 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1498:1: ( rule__CustomDto__PropertiesAssignment_4 )
            {
             before(grammarAccess.getCustomDtoAccess().getPropertiesAssignment_4()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1499:1: ( rule__CustomDto__PropertiesAssignment_4 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1499:2: rule__CustomDto__PropertiesAssignment_4
            {
            pushFollow(FOLLOW_rule__CustomDto__PropertiesAssignment_4_in_rule__CustomDto__Group__43005);
            rule__CustomDto__PropertiesAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getCustomDtoAccess().getPropertiesAssignment_4()); 

            }

            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1502:1: ( ( rule__CustomDto__PropertiesAssignment_4 )* )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1503:1: ( rule__CustomDto__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getCustomDtoAccess().getPropertiesAssignment_4()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1504:1: ( rule__CustomDto__PropertiesAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||(LA16_0>=24 && LA16_0<=28)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1504:2: rule__CustomDto__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__CustomDto__PropertiesAssignment_4_in_rule__CustomDto__Group__43017);
            	    rule__CustomDto__PropertiesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getCustomDtoAccess().getPropertiesAssignment_4()); 

            }


            }

            pushFollow(FOLLOW_rule__CustomDto__Group__5_in_rule__CustomDto__Group__43029);
            rule__CustomDto__Group__5();
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
    // $ANTLR end rule__CustomDto__Group__4


    // $ANTLR start rule__CustomDto__Group__5
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1516:1: rule__CustomDto__Group__5 : ( ']' ) ;
    public final void rule__CustomDto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1520:1: ( ( ']' ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1521:1: ( ']' )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1521:1: ( ']' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1522:1: ']'
            {
             before(grammarAccess.getCustomDtoAccess().getRightSquareBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__CustomDto__Group__53058); 
             after(grammarAccess.getCustomDtoAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end rule__CustomDto__Group__5


    // $ANTLR start rule__DtoProperty__Group__0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1547:1: rule__DtoProperty__Group__0 : ( ( rule__DtoProperty__Alternatives_0 ) ) rule__DtoProperty__Group__1 ;
    public final void rule__DtoProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1551:1: ( ( ( rule__DtoProperty__Alternatives_0 ) ) rule__DtoProperty__Group__1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1552:1: ( ( rule__DtoProperty__Alternatives_0 ) ) rule__DtoProperty__Group__1
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1552:1: ( ( rule__DtoProperty__Alternatives_0 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1553:1: ( rule__DtoProperty__Alternatives_0 )
            {
             before(grammarAccess.getDtoPropertyAccess().getAlternatives_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1554:1: ( rule__DtoProperty__Alternatives_0 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1554:2: rule__DtoProperty__Alternatives_0
            {
            pushFollow(FOLLOW_rule__DtoProperty__Alternatives_0_in_rule__DtoProperty__Group__03105);
            rule__DtoProperty__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getDtoPropertyAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__DtoProperty__Group__1_in_rule__DtoProperty__Group__03114);
            rule__DtoProperty__Group__1();
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
    // $ANTLR end rule__DtoProperty__Group__0


    // $ANTLR start rule__DtoProperty__Group__1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1565:1: rule__DtoProperty__Group__1 : ( ';' ) ;
    public final void rule__DtoProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1569:1: ( ( ';' ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1570:1: ( ';' )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1570:1: ( ';' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1571:1: ';'
            {
             before(grammarAccess.getDtoPropertyAccess().getSemicolonKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__DtoProperty__Group__13143); 
             after(grammarAccess.getDtoPropertyAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end rule__DtoProperty__Group__1


    // $ANTLR start rule__DtoBooleanProperty__Group__0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1588:1: rule__DtoBooleanProperty__Group__0 : ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? ) rule__DtoBooleanProperty__Group__1 ;
    public final void rule__DtoBooleanProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1592:1: ( ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? ) rule__DtoBooleanProperty__Group__1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1593:1: ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? ) rule__DtoBooleanProperty__Group__1
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1593:1: ( ( rule__DtoBooleanProperty__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1594:1: ( rule__DtoBooleanProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1595:1: ( rule__DtoBooleanProperty__DescriptionAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1595:2: rule__DtoBooleanProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoBooleanProperty__DescriptionAssignment_0_in_rule__DtoBooleanProperty__Group__03182);
                    rule__DtoBooleanProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoBooleanPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoBooleanProperty__Group__1_in_rule__DtoBooleanProperty__Group__03192);
            rule__DtoBooleanProperty__Group__1();
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
    // $ANTLR end rule__DtoBooleanProperty__Group__0


    // $ANTLR start rule__DtoBooleanProperty__Group__1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1606:1: rule__DtoBooleanProperty__Group__1 : ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) ) rule__DtoBooleanProperty__Group__2 ;
    public final void rule__DtoBooleanProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1610:1: ( ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) ) rule__DtoBooleanProperty__Group__2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1611:1: ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) ) rule__DtoBooleanProperty__Group__2
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1611:1: ( ( rule__DtoBooleanProperty__DataTypeAssignment_1 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1612:1: ( rule__DtoBooleanProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1613:1: ( rule__DtoBooleanProperty__DataTypeAssignment_1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1613:2: rule__DtoBooleanProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoBooleanProperty__DataTypeAssignment_1_in_rule__DtoBooleanProperty__Group__13220);
            rule__DtoBooleanProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoBooleanProperty__Group__2_in_rule__DtoBooleanProperty__Group__13229);
            rule__DtoBooleanProperty__Group__2();
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
    // $ANTLR end rule__DtoBooleanProperty__Group__1


    // $ANTLR start rule__DtoBooleanProperty__Group__2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1624:1: rule__DtoBooleanProperty__Group__2 : ( ( rule__DtoBooleanProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoBooleanProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1628:1: ( ( ( rule__DtoBooleanProperty__NameAssignment_2 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1629:1: ( ( rule__DtoBooleanProperty__NameAssignment_2 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1629:1: ( ( rule__DtoBooleanProperty__NameAssignment_2 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1630:1: ( rule__DtoBooleanProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1631:1: ( rule__DtoBooleanProperty__NameAssignment_2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1631:2: rule__DtoBooleanProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoBooleanProperty__NameAssignment_2_in_rule__DtoBooleanProperty__Group__23257);
            rule__DtoBooleanProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDtoBooleanPropertyAccess().getNameAssignment_2()); 

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
    // $ANTLR end rule__DtoBooleanProperty__Group__2


    // $ANTLR start rule__DtoStringProperty__Group__0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1647:1: rule__DtoStringProperty__Group__0 : ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? ) rule__DtoStringProperty__Group__1 ;
    public final void rule__DtoStringProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1651:1: ( ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? ) rule__DtoStringProperty__Group__1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1652:1: ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? ) rule__DtoStringProperty__Group__1
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1652:1: ( ( rule__DtoStringProperty__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1653:1: ( rule__DtoStringProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1654:1: ( rule__DtoStringProperty__DescriptionAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1654:2: rule__DtoStringProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoStringProperty__DescriptionAssignment_0_in_rule__DtoStringProperty__Group__03297);
                    rule__DtoStringProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoStringPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoStringProperty__Group__1_in_rule__DtoStringProperty__Group__03307);
            rule__DtoStringProperty__Group__1();
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
    // $ANTLR end rule__DtoStringProperty__Group__0


    // $ANTLR start rule__DtoStringProperty__Group__1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1665:1: rule__DtoStringProperty__Group__1 : ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) ) rule__DtoStringProperty__Group__2 ;
    public final void rule__DtoStringProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1669:1: ( ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) ) rule__DtoStringProperty__Group__2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1670:1: ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) ) rule__DtoStringProperty__Group__2
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1670:1: ( ( rule__DtoStringProperty__DataTypeAssignment_1 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1671:1: ( rule__DtoStringProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1672:1: ( rule__DtoStringProperty__DataTypeAssignment_1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1672:2: rule__DtoStringProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoStringProperty__DataTypeAssignment_1_in_rule__DtoStringProperty__Group__13335);
            rule__DtoStringProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoStringPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoStringProperty__Group__2_in_rule__DtoStringProperty__Group__13344);
            rule__DtoStringProperty__Group__2();
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
    // $ANTLR end rule__DtoStringProperty__Group__1


    // $ANTLR start rule__DtoStringProperty__Group__2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1683:1: rule__DtoStringProperty__Group__2 : ( ( rule__DtoStringProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoStringProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1687:1: ( ( ( rule__DtoStringProperty__NameAssignment_2 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1688:1: ( ( rule__DtoStringProperty__NameAssignment_2 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1688:1: ( ( rule__DtoStringProperty__NameAssignment_2 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1689:1: ( rule__DtoStringProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoStringPropertyAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1690:1: ( rule__DtoStringProperty__NameAssignment_2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1690:2: rule__DtoStringProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoStringProperty__NameAssignment_2_in_rule__DtoStringProperty__Group__23372);
            rule__DtoStringProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDtoStringPropertyAccess().getNameAssignment_2()); 

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
    // $ANTLR end rule__DtoStringProperty__Group__2


    // $ANTLR start rule__DtoDateTimeProperty__Group__0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1706:1: rule__DtoDateTimeProperty__Group__0 : ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? ) rule__DtoDateTimeProperty__Group__1 ;
    public final void rule__DtoDateTimeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1710:1: ( ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? ) rule__DtoDateTimeProperty__Group__1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1711:1: ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? ) rule__DtoDateTimeProperty__Group__1
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1711:1: ( ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1712:1: ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1713:1: ( rule__DtoDateTimeProperty__DescriptionAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1713:2: rule__DtoDateTimeProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoDateTimeProperty__DescriptionAssignment_0_in_rule__DtoDateTimeProperty__Group__03412);
                    rule__DtoDateTimeProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoDateTimePropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoDateTimeProperty__Group__1_in_rule__DtoDateTimeProperty__Group__03422);
            rule__DtoDateTimeProperty__Group__1();
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
    // $ANTLR end rule__DtoDateTimeProperty__Group__0


    // $ANTLR start rule__DtoDateTimeProperty__Group__1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1724:1: rule__DtoDateTimeProperty__Group__1 : ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) ) rule__DtoDateTimeProperty__Group__2 ;
    public final void rule__DtoDateTimeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1728:1: ( ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) ) rule__DtoDateTimeProperty__Group__2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1729:1: ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) ) rule__DtoDateTimeProperty__Group__2
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1729:1: ( ( rule__DtoDateTimeProperty__DataTypeAssignment_1 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1730:1: ( rule__DtoDateTimeProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1731:1: ( rule__DtoDateTimeProperty__DataTypeAssignment_1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1731:2: rule__DtoDateTimeProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoDateTimeProperty__DataTypeAssignment_1_in_rule__DtoDateTimeProperty__Group__13450);
            rule__DtoDateTimeProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoDateTimeProperty__Group__2_in_rule__DtoDateTimeProperty__Group__13459);
            rule__DtoDateTimeProperty__Group__2();
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
    // $ANTLR end rule__DtoDateTimeProperty__Group__1


    // $ANTLR start rule__DtoDateTimeProperty__Group__2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1742:1: rule__DtoDateTimeProperty__Group__2 : ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoDateTimeProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1746:1: ( ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1747:1: ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1747:1: ( ( rule__DtoDateTimeProperty__NameAssignment_2 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1748:1: ( rule__DtoDateTimeProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1749:1: ( rule__DtoDateTimeProperty__NameAssignment_2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1749:2: rule__DtoDateTimeProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoDateTimeProperty__NameAssignment_2_in_rule__DtoDateTimeProperty__Group__23487);
            rule__DtoDateTimeProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDtoDateTimePropertyAccess().getNameAssignment_2()); 

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
    // $ANTLR end rule__DtoDateTimeProperty__Group__2


    // $ANTLR start rule__DtoIntegerProperty__Group__0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1765:1: rule__DtoIntegerProperty__Group__0 : ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? ) rule__DtoIntegerProperty__Group__1 ;
    public final void rule__DtoIntegerProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1769:1: ( ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? ) rule__DtoIntegerProperty__Group__1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1770:1: ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? ) rule__DtoIntegerProperty__Group__1
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1770:1: ( ( rule__DtoIntegerProperty__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1771:1: ( rule__DtoIntegerProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1772:1: ( rule__DtoIntegerProperty__DescriptionAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1772:2: rule__DtoIntegerProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoIntegerProperty__DescriptionAssignment_0_in_rule__DtoIntegerProperty__Group__03527);
                    rule__DtoIntegerProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoIntegerPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoIntegerProperty__Group__1_in_rule__DtoIntegerProperty__Group__03537);
            rule__DtoIntegerProperty__Group__1();
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
    // $ANTLR end rule__DtoIntegerProperty__Group__0


    // $ANTLR start rule__DtoIntegerProperty__Group__1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1783:1: rule__DtoIntegerProperty__Group__1 : ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) ) rule__DtoIntegerProperty__Group__2 ;
    public final void rule__DtoIntegerProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1787:1: ( ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) ) rule__DtoIntegerProperty__Group__2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1788:1: ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) ) rule__DtoIntegerProperty__Group__2
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1788:1: ( ( rule__DtoIntegerProperty__DataTypeAssignment_1 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1789:1: ( rule__DtoIntegerProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1790:1: ( rule__DtoIntegerProperty__DataTypeAssignment_1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1790:2: rule__DtoIntegerProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoIntegerProperty__DataTypeAssignment_1_in_rule__DtoIntegerProperty__Group__13565);
            rule__DtoIntegerProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoIntegerProperty__Group__2_in_rule__DtoIntegerProperty__Group__13574);
            rule__DtoIntegerProperty__Group__2();
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
    // $ANTLR end rule__DtoIntegerProperty__Group__1


    // $ANTLR start rule__DtoIntegerProperty__Group__2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1801:1: rule__DtoIntegerProperty__Group__2 : ( ( rule__DtoIntegerProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoIntegerProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1805:1: ( ( ( rule__DtoIntegerProperty__NameAssignment_2 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1806:1: ( ( rule__DtoIntegerProperty__NameAssignment_2 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1806:1: ( ( rule__DtoIntegerProperty__NameAssignment_2 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1807:1: ( rule__DtoIntegerProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1808:1: ( rule__DtoIntegerProperty__NameAssignment_2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1808:2: rule__DtoIntegerProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoIntegerProperty__NameAssignment_2_in_rule__DtoIntegerProperty__Group__23602);
            rule__DtoIntegerProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDtoIntegerPropertyAccess().getNameAssignment_2()); 

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
    // $ANTLR end rule__DtoIntegerProperty__Group__2


    // $ANTLR start rule__DtoDecimalProperty__Group__0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1824:1: rule__DtoDecimalProperty__Group__0 : ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? ) rule__DtoDecimalProperty__Group__1 ;
    public final void rule__DtoDecimalProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1828:1: ( ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? ) rule__DtoDecimalProperty__Group__1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1829:1: ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? ) rule__DtoDecimalProperty__Group__1
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1829:1: ( ( rule__DtoDecimalProperty__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1830:1: ( rule__DtoDecimalProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1831:1: ( rule__DtoDecimalProperty__DescriptionAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1831:2: rule__DtoDecimalProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoDecimalProperty__DescriptionAssignment_0_in_rule__DtoDecimalProperty__Group__03642);
                    rule__DtoDecimalProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoDecimalPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoDecimalProperty__Group__1_in_rule__DtoDecimalProperty__Group__03652);
            rule__DtoDecimalProperty__Group__1();
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
    // $ANTLR end rule__DtoDecimalProperty__Group__0


    // $ANTLR start rule__DtoDecimalProperty__Group__1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1842:1: rule__DtoDecimalProperty__Group__1 : ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) ) rule__DtoDecimalProperty__Group__2 ;
    public final void rule__DtoDecimalProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1846:1: ( ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) ) rule__DtoDecimalProperty__Group__2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1847:1: ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) ) rule__DtoDecimalProperty__Group__2
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1847:1: ( ( rule__DtoDecimalProperty__DataTypeAssignment_1 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1848:1: ( rule__DtoDecimalProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1849:1: ( rule__DtoDecimalProperty__DataTypeAssignment_1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1849:2: rule__DtoDecimalProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoDecimalProperty__DataTypeAssignment_1_in_rule__DtoDecimalProperty__Group__13680);
            rule__DtoDecimalProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoDecimalProperty__Group__2_in_rule__DtoDecimalProperty__Group__13689);
            rule__DtoDecimalProperty__Group__2();
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
    // $ANTLR end rule__DtoDecimalProperty__Group__1


    // $ANTLR start rule__DtoDecimalProperty__Group__2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1860:1: rule__DtoDecimalProperty__Group__2 : ( ( rule__DtoDecimalProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoDecimalProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1864:1: ( ( ( rule__DtoDecimalProperty__NameAssignment_2 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1865:1: ( ( rule__DtoDecimalProperty__NameAssignment_2 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1865:1: ( ( rule__DtoDecimalProperty__NameAssignment_2 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1866:1: ( rule__DtoDecimalProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1867:1: ( rule__DtoDecimalProperty__NameAssignment_2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1867:2: rule__DtoDecimalProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoDecimalProperty__NameAssignment_2_in_rule__DtoDecimalProperty__Group__23717);
            rule__DtoDecimalProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDtoDecimalPropertyAccess().getNameAssignment_2()); 

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
    // $ANTLR end rule__DtoDecimalProperty__Group__2


    // $ANTLR start rule__DtoEnumerationProperty__Group__0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1883:1: rule__DtoEnumerationProperty__Group__0 : ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? ) rule__DtoEnumerationProperty__Group__1 ;
    public final void rule__DtoEnumerationProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1887:1: ( ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? ) rule__DtoEnumerationProperty__Group__1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1888:1: ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? ) rule__DtoEnumerationProperty__Group__1
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1888:1: ( ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )? )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1889:1: ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1890:1: ( rule__DtoEnumerationProperty__DescriptionAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1890:2: rule__DtoEnumerationProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DtoEnumerationProperty__DescriptionAssignment_0_in_rule__DtoEnumerationProperty__Group__03757);
                    rule__DtoEnumerationProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtoEnumerationPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DtoEnumerationProperty__Group__1_in_rule__DtoEnumerationProperty__Group__03767);
            rule__DtoEnumerationProperty__Group__1();
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
    // $ANTLR end rule__DtoEnumerationProperty__Group__0


    // $ANTLR start rule__DtoEnumerationProperty__Group__1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1901:1: rule__DtoEnumerationProperty__Group__1 : ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) ) rule__DtoEnumerationProperty__Group__2 ;
    public final void rule__DtoEnumerationProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1905:1: ( ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) ) rule__DtoEnumerationProperty__Group__2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1906:1: ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) ) rule__DtoEnumerationProperty__Group__2
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1906:1: ( ( rule__DtoEnumerationProperty__TypeAssignment_1 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1907:1: ( rule__DtoEnumerationProperty__TypeAssignment_1 )
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getTypeAssignment_1()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1908:1: ( rule__DtoEnumerationProperty__TypeAssignment_1 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1908:2: rule__DtoEnumerationProperty__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoEnumerationProperty__TypeAssignment_1_in_rule__DtoEnumerationProperty__Group__13795);
            rule__DtoEnumerationProperty__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoEnumerationPropertyAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoEnumerationProperty__Group__2_in_rule__DtoEnumerationProperty__Group__13804);
            rule__DtoEnumerationProperty__Group__2();
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
    // $ANTLR end rule__DtoEnumerationProperty__Group__1


    // $ANTLR start rule__DtoEnumerationProperty__Group__2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1919:1: rule__DtoEnumerationProperty__Group__2 : ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) ) ;
    public final void rule__DtoEnumerationProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1923:1: ( ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1924:1: ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1924:1: ( ( rule__DtoEnumerationProperty__NameAssignment_2 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1925:1: ( rule__DtoEnumerationProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getNameAssignment_2()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1926:1: ( rule__DtoEnumerationProperty__NameAssignment_2 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1926:2: rule__DtoEnumerationProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DtoEnumerationProperty__NameAssignment_2_in_rule__DtoEnumerationProperty__Group__23832);
            rule__DtoEnumerationProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDtoEnumerationPropertyAccess().getNameAssignment_2()); 

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
    // $ANTLR end rule__DtoEnumerationProperty__Group__2


    // $ANTLR start rule__DataContractModel__DescriptionAssignment_0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1942:1: rule__DataContractModel__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DataContractModel__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1946:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1947:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1947:1: ( RULE_STRING )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1948:1: RULE_STRING
            {
             before(grammarAccess.getDataContractModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DataContractModel__DescriptionAssignment_03872); 
             after(grammarAccess.getDataContractModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__DataContractModel__DescriptionAssignment_0


    // $ANTLR start rule__DataContractModel__NameAssignment_2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1957:1: rule__DataContractModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataContractModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1961:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1962:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1962:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1963:1: RULE_ID
            {
             before(grammarAccess.getDataContractModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataContractModel__NameAssignment_23903); 
             after(grammarAccess.getDataContractModelAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__DataContractModel__NameAssignment_2


    // $ANTLR start rule__DataContractModel__ExternalReferencesAssignment_4
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1972:1: rule__DataContractModel__ExternalReferencesAssignment_4 : ( ruleExternalReference ) ;
    public final void rule__DataContractModel__ExternalReferencesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1976:1: ( ( ruleExternalReference ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1977:1: ( ruleExternalReference )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1977:1: ( ruleExternalReference )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1978:1: ruleExternalReference
            {
             before(grammarAccess.getDataContractModelAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExternalReference_in_rule__DataContractModel__ExternalReferencesAssignment_43934);
            ruleExternalReference();
            _fsp--;

             after(grammarAccess.getDataContractModelAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0()); 

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
    // $ANTLR end rule__DataContractModel__ExternalReferencesAssignment_4


    // $ANTLR start rule__DataContractModel__DtosAssignment_5_0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1987:1: rule__DataContractModel__DtosAssignment_5_0 : ( ruleDto ) ;
    public final void rule__DataContractModel__DtosAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1991:1: ( ( ruleDto ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1992:1: ( ruleDto )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1992:1: ( ruleDto )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:1993:1: ruleDto
            {
             before(grammarAccess.getDataContractModelAccess().getDtosDtoParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleDto_in_rule__DataContractModel__DtosAssignment_5_03965);
            ruleDto();
            _fsp--;

             after(grammarAccess.getDataContractModelAccess().getDtosDtoParserRuleCall_5_0_0()); 

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
    // $ANTLR end rule__DataContractModel__DtosAssignment_5_0


    // $ANTLR start rule__DataContractModel__EnumerationsAssignment_5_1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2002:1: rule__DataContractModel__EnumerationsAssignment_5_1 : ( ruleEnumerationDto ) ;
    public final void rule__DataContractModel__EnumerationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2006:1: ( ( ruleEnumerationDto ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2007:1: ( ruleEnumerationDto )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2007:1: ( ruleEnumerationDto )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2008:1: ruleEnumerationDto
            {
             before(grammarAccess.getDataContractModelAccess().getEnumerationsEnumerationDtoParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleEnumerationDto_in_rule__DataContractModel__EnumerationsAssignment_5_13996);
            ruleEnumerationDto();
            _fsp--;

             after(grammarAccess.getDataContractModelAccess().getEnumerationsEnumerationDtoParserRuleCall_5_1_0()); 

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
    // $ANTLR end rule__DataContractModel__EnumerationsAssignment_5_1


    // $ANTLR start rule__ExternalReference__DescriptionAssignment_0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2017:1: rule__ExternalReference__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ExternalReference__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2021:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2022:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2022:1: ( RULE_STRING )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2023:1: RULE_STRING
            {
             before(grammarAccess.getExternalReferenceAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ExternalReference__DescriptionAssignment_04027); 
             after(grammarAccess.getExternalReferenceAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__ExternalReference__DescriptionAssignment_0


    // $ANTLR start rule__ExternalReference__ModelnameAssignment_2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2032:1: rule__ExternalReference__ModelnameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ExternalReference__ModelnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2036:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2037:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2037:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2038:1: RULE_ID
            {
             before(grammarAccess.getExternalReferenceAccess().getModelnameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalReference__ModelnameAssignment_24058); 
             after(grammarAccess.getExternalReferenceAccess().getModelnameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__ExternalReference__ModelnameAssignment_2


    // $ANTLR start rule__ExternalReference__KeywordAssignment_3
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2047:1: rule__ExternalReference__KeywordAssignment_3 : ( ( rule__ExternalReference__KeywordAlternatives_3_0 ) ) ;
    public final void rule__ExternalReference__KeywordAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2051:1: ( ( ( rule__ExternalReference__KeywordAlternatives_3_0 ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2052:1: ( ( rule__ExternalReference__KeywordAlternatives_3_0 ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2052:1: ( ( rule__ExternalReference__KeywordAlternatives_3_0 ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2053:1: ( rule__ExternalReference__KeywordAlternatives_3_0 )
            {
             before(grammarAccess.getExternalReferenceAccess().getKeywordAlternatives_3_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2054:1: ( rule__ExternalReference__KeywordAlternatives_3_0 )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2054:2: rule__ExternalReference__KeywordAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__ExternalReference__KeywordAlternatives_3_0_in_rule__ExternalReference__KeywordAssignment_34089);
            rule__ExternalReference__KeywordAlternatives_3_0();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getKeywordAlternatives_3_0()); 

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
    // $ANTLR end rule__ExternalReference__KeywordAssignment_3


    // $ANTLR start rule__ExternalReference__NameAssignment_4
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2063:1: rule__ExternalReference__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__ExternalReference__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2067:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2068:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2068:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2069:1: RULE_ID
            {
             before(grammarAccess.getExternalReferenceAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalReference__NameAssignment_44122); 
             after(grammarAccess.getExternalReferenceAccess().getNameIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end rule__ExternalReference__NameAssignment_4


    // $ANTLR start rule__BusinessClassDto__DescriptionAssignment_0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2078:1: rule__BusinessClassDto__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessClassDto__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2082:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2083:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2083:1: ( RULE_STRING )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2084:1: RULE_STRING
            {
             before(grammarAccess.getBusinessClassDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BusinessClassDto__DescriptionAssignment_04153); 
             after(grammarAccess.getBusinessClassDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__BusinessClassDto__DescriptionAssignment_0


    // $ANTLR start rule__BusinessClassDto__NameAssignment_2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2093:1: rule__BusinessClassDto__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessClassDto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2097:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2098:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2098:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2099:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassDtoAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassDto__NameAssignment_24184); 
             after(grammarAccess.getBusinessClassDtoAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__BusinessClassDto__NameAssignment_2


    // $ANTLR start rule__BusinessClassDto__BaseAssignment_4
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2108:1: rule__BusinessClassDto__BaseAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__BusinessClassDto__BaseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2112:1: ( ( ( RULE_ID ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2113:1: ( ( RULE_ID ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2113:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2114:1: ( RULE_ID )
            {
             before(grammarAccess.getBusinessClassDtoAccess().getBaseExternalReferenceCrossReference_4_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2115:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2116:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassDtoAccess().getBaseExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassDto__BaseAssignment_44219); 
             after(grammarAccess.getBusinessClassDtoAccess().getBaseExternalReferenceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getBusinessClassDtoAccess().getBaseExternalReferenceCrossReference_4_0()); 

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
    // $ANTLR end rule__BusinessClassDto__BaseAssignment_4


    // $ANTLR start rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2127:1: rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1 : ( ruleBusinessClassPropertyReference ) ;
    public final void rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2131:1: ( ( ruleBusinessClassPropertyReference ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2132:1: ( ruleBusinessClassPropertyReference )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2132:1: ( ruleBusinessClassPropertyReference )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2133:1: ruleBusinessClassPropertyReference
            {
             before(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesBusinessClassPropertyReferenceParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_ruleBusinessClassPropertyReference_in_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_14254);
            ruleBusinessClassPropertyReference();
            _fsp--;

             after(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesBusinessClassPropertyReferenceParserRuleCall_5_1_1_0()); 

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
    // $ANTLR end rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1


    // $ANTLR start rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2142:1: rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2 : ( ruleBusinessClassAssociationRoleReference ) ;
    public final void rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2146:1: ( ( ruleBusinessClassAssociationRoleReference ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2147:1: ( ruleBusinessClassAssociationRoleReference )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2147:1: ( ruleBusinessClassAssociationRoleReference )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2148:1: ruleBusinessClassAssociationRoleReference
            {
             before(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesBusinessClassAssociationRoleReferenceParserRuleCall_5_1_2_2_0()); 
            pushFollow(FOLLOW_ruleBusinessClassAssociationRoleReference_in_rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_24285);
            ruleBusinessClassAssociationRoleReference();
            _fsp--;

             after(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesBusinessClassAssociationRoleReferenceParserRuleCall_5_1_2_2_0()); 

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
    // $ANTLR end rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2


    // $ANTLR start rule__EnumerationDto__DescriptionAssignment_0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2157:1: rule__EnumerationDto__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__EnumerationDto__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2161:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2162:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2162:1: ( RULE_STRING )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2163:1: RULE_STRING
            {
             before(grammarAccess.getEnumerationDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnumerationDto__DescriptionAssignment_04316); 
             after(grammarAccess.getEnumerationDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__EnumerationDto__DescriptionAssignment_0


    // $ANTLR start rule__EnumerationDto__NameAssignment_2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2172:1: rule__EnumerationDto__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumerationDto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2176:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2177:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2177:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2178:1: RULE_ID
            {
             before(grammarAccess.getEnumerationDtoAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationDto__NameAssignment_24347); 
             after(grammarAccess.getEnumerationDtoAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__EnumerationDto__NameAssignment_2


    // $ANTLR start rule__EnumerationDto__BaseAssignment_4
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2187:1: rule__EnumerationDto__BaseAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__EnumerationDto__BaseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2191:1: ( ( ( RULE_ID ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2192:1: ( ( RULE_ID ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2192:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2193:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumerationDtoAccess().getBaseExternalReferenceCrossReference_4_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2194:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2195:1: RULE_ID
            {
             before(grammarAccess.getEnumerationDtoAccess().getBaseExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationDto__BaseAssignment_44382); 
             after(grammarAccess.getEnumerationDtoAccess().getBaseExternalReferenceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getEnumerationDtoAccess().getBaseExternalReferenceCrossReference_4_0()); 

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
    // $ANTLR end rule__EnumerationDto__BaseAssignment_4


    // $ANTLR start rule__BusinessClassPropertyReference__NameAssignment_0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2206:1: rule__BusinessClassPropertyReference__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BusinessClassPropertyReference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2210:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2211:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2211:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2212:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassPropertyReferenceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassPropertyReference__NameAssignment_04417); 
             after(grammarAccess.getBusinessClassPropertyReferenceAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__BusinessClassPropertyReference__NameAssignment_0


    // $ANTLR start rule__BusinessClassAssociationRoleReference__NameAssignment_0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2221:1: rule__BusinessClassAssociationRoleReference__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BusinessClassAssociationRoleReference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2225:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2226:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2226:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2227:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassAssociationRoleReference__NameAssignment_04448); 
             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__BusinessClassAssociationRoleReference__NameAssignment_0


    // $ANTLR start rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2236:1: rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2240:1: ( ( ( RULE_ID ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2241:1: ( ( RULE_ID ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2241:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2242:1: ( RULE_ID )
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeDtoCrossReference_2_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2243:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2244:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeDtoIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_24483); 
             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeDtoIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeDtoCrossReference_2_0()); 

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
    // $ANTLR end rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2


    // $ANTLR start rule__CustomDto__DescriptionAssignment_0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2255:1: rule__CustomDto__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__CustomDto__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2259:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2260:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2260:1: ( RULE_STRING )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2261:1: RULE_STRING
            {
             before(grammarAccess.getCustomDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CustomDto__DescriptionAssignment_04518); 
             after(grammarAccess.getCustomDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__CustomDto__DescriptionAssignment_0


    // $ANTLR start rule__CustomDto__NameAssignment_2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2270:1: rule__CustomDto__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CustomDto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2274:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2275:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2275:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2276:1: RULE_ID
            {
             before(grammarAccess.getCustomDtoAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomDto__NameAssignment_24549); 
             after(grammarAccess.getCustomDtoAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__CustomDto__NameAssignment_2


    // $ANTLR start rule__CustomDto__PropertiesAssignment_4
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2285:1: rule__CustomDto__PropertiesAssignment_4 : ( ruleDtoProperty ) ;
    public final void rule__CustomDto__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2289:1: ( ( ruleDtoProperty ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2290:1: ( ruleDtoProperty )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2290:1: ( ruleDtoProperty )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2291:1: ruleDtoProperty
            {
             before(grammarAccess.getCustomDtoAccess().getPropertiesDtoPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDtoProperty_in_rule__CustomDto__PropertiesAssignment_44580);
            ruleDtoProperty();
            _fsp--;

             after(grammarAccess.getCustomDtoAccess().getPropertiesDtoPropertyParserRuleCall_4_0()); 

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
    // $ANTLR end rule__CustomDto__PropertiesAssignment_4


    // $ANTLR start rule__DtoBooleanProperty__DescriptionAssignment_0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2300:1: rule__DtoBooleanProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoBooleanProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2304:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2305:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2305:1: ( RULE_STRING )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2306:1: RULE_STRING
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoBooleanProperty__DescriptionAssignment_04611); 
             after(grammarAccess.getDtoBooleanPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__DtoBooleanProperty__DescriptionAssignment_0


    // $ANTLR start rule__DtoBooleanProperty__DataTypeAssignment_1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2315:1: rule__DtoBooleanProperty__DataTypeAssignment_1 : ( ( 'boolean' ) ) ;
    public final void rule__DtoBooleanProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2319:1: ( ( ( 'boolean' ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2320:1: ( ( 'boolean' ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2320:1: ( ( 'boolean' ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2321:1: ( 'boolean' )
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeBooleanKeyword_1_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2322:1: ( 'boolean' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2323:1: 'boolean'
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeBooleanKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__DtoBooleanProperty__DataTypeAssignment_14647); 
             after(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeBooleanKeyword_1_0()); 

            }

             after(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeBooleanKeyword_1_0()); 

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
    // $ANTLR end rule__DtoBooleanProperty__DataTypeAssignment_1


    // $ANTLR start rule__DtoBooleanProperty__NameAssignment_2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2338:1: rule__DtoBooleanProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoBooleanProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2342:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2343:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2343:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2344:1: RULE_ID
            {
             before(grammarAccess.getDtoBooleanPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoBooleanProperty__NameAssignment_24686); 
             after(grammarAccess.getDtoBooleanPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__DtoBooleanProperty__NameAssignment_2


    // $ANTLR start rule__DtoStringProperty__DescriptionAssignment_0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2353:1: rule__DtoStringProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoStringProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2357:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2358:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2358:1: ( RULE_STRING )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2359:1: RULE_STRING
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoStringProperty__DescriptionAssignment_04717); 
             after(grammarAccess.getDtoStringPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__DtoStringProperty__DescriptionAssignment_0


    // $ANTLR start rule__DtoStringProperty__DataTypeAssignment_1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2368:1: rule__DtoStringProperty__DataTypeAssignment_1 : ( ( 'string' ) ) ;
    public final void rule__DtoStringProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2372:1: ( ( ( 'string' ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2373:1: ( ( 'string' ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2373:1: ( ( 'string' ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2374:1: ( 'string' )
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDataTypeStringKeyword_1_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2375:1: ( 'string' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2376:1: 'string'
            {
             before(grammarAccess.getDtoStringPropertyAccess().getDataTypeStringKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__DtoStringProperty__DataTypeAssignment_14753); 
             after(grammarAccess.getDtoStringPropertyAccess().getDataTypeStringKeyword_1_0()); 

            }

             after(grammarAccess.getDtoStringPropertyAccess().getDataTypeStringKeyword_1_0()); 

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
    // $ANTLR end rule__DtoStringProperty__DataTypeAssignment_1


    // $ANTLR start rule__DtoStringProperty__NameAssignment_2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2391:1: rule__DtoStringProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoStringProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2395:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2396:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2396:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2397:1: RULE_ID
            {
             before(grammarAccess.getDtoStringPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoStringProperty__NameAssignment_24792); 
             after(grammarAccess.getDtoStringPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__DtoStringProperty__NameAssignment_2


    // $ANTLR start rule__DtoDateTimeProperty__DescriptionAssignment_0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2406:1: rule__DtoDateTimeProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoDateTimeProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2410:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2411:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2411:1: ( RULE_STRING )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2412:1: RULE_STRING
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoDateTimeProperty__DescriptionAssignment_04823); 
             after(grammarAccess.getDtoDateTimePropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__DtoDateTimeProperty__DescriptionAssignment_0


    // $ANTLR start rule__DtoDateTimeProperty__DataTypeAssignment_1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2421:1: rule__DtoDateTimeProperty__DataTypeAssignment_1 : ( ( 'datetime' ) ) ;
    public final void rule__DtoDateTimeProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2425:1: ( ( ( 'datetime' ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2426:1: ( ( 'datetime' ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2426:1: ( ( 'datetime' ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2427:1: ( 'datetime' )
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2428:1: ( 'datetime' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2429:1: 'datetime'
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__DtoDateTimeProperty__DataTypeAssignment_14859); 
             after(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 

            }

             after(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 

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
    // $ANTLR end rule__DtoDateTimeProperty__DataTypeAssignment_1


    // $ANTLR start rule__DtoDateTimeProperty__NameAssignment_2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2444:1: rule__DtoDateTimeProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoDateTimeProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2448:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2449:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2449:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2450:1: RULE_ID
            {
             before(grammarAccess.getDtoDateTimePropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoDateTimeProperty__NameAssignment_24898); 
             after(grammarAccess.getDtoDateTimePropertyAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__DtoDateTimeProperty__NameAssignment_2


    // $ANTLR start rule__DtoIntegerProperty__DescriptionAssignment_0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2459:1: rule__DtoIntegerProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoIntegerProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2463:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2464:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2464:1: ( RULE_STRING )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2465:1: RULE_STRING
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoIntegerProperty__DescriptionAssignment_04929); 
             after(grammarAccess.getDtoIntegerPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__DtoIntegerProperty__DescriptionAssignment_0


    // $ANTLR start rule__DtoIntegerProperty__DataTypeAssignment_1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2474:1: rule__DtoIntegerProperty__DataTypeAssignment_1 : ( ( 'integer' ) ) ;
    public final void rule__DtoIntegerProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2478:1: ( ( ( 'integer' ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2479:1: ( ( 'integer' ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2479:1: ( ( 'integer' ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2480:1: ( 'integer' )
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2481:1: ( 'integer' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2482:1: 'integer'
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__DtoIntegerProperty__DataTypeAssignment_14965); 
             after(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 

            }

             after(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 

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
    // $ANTLR end rule__DtoIntegerProperty__DataTypeAssignment_1


    // $ANTLR start rule__DtoIntegerProperty__NameAssignment_2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2497:1: rule__DtoIntegerProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoIntegerProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2501:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2502:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2502:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2503:1: RULE_ID
            {
             before(grammarAccess.getDtoIntegerPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoIntegerProperty__NameAssignment_25004); 
             after(grammarAccess.getDtoIntegerPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__DtoIntegerProperty__NameAssignment_2


    // $ANTLR start rule__DtoDecimalProperty__DescriptionAssignment_0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2512:1: rule__DtoDecimalProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoDecimalProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2516:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2517:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2517:1: ( RULE_STRING )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2518:1: RULE_STRING
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoDecimalProperty__DescriptionAssignment_05035); 
             after(grammarAccess.getDtoDecimalPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__DtoDecimalProperty__DescriptionAssignment_0


    // $ANTLR start rule__DtoDecimalProperty__DataTypeAssignment_1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2527:1: rule__DtoDecimalProperty__DataTypeAssignment_1 : ( ( 'decimal' ) ) ;
    public final void rule__DtoDecimalProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2531:1: ( ( ( 'decimal' ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2532:1: ( ( 'decimal' ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2532:1: ( ( 'decimal' ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2533:1: ( 'decimal' )
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2534:1: ( 'decimal' )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2535:1: 'decimal'
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__DtoDecimalProperty__DataTypeAssignment_15071); 
             after(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 

            }

             after(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 

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
    // $ANTLR end rule__DtoDecimalProperty__DataTypeAssignment_1


    // $ANTLR start rule__DtoDecimalProperty__NameAssignment_2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2550:1: rule__DtoDecimalProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoDecimalProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2554:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2555:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2555:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2556:1: RULE_ID
            {
             before(grammarAccess.getDtoDecimalPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoDecimalProperty__NameAssignment_25110); 
             after(grammarAccess.getDtoDecimalPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__DtoDecimalProperty__NameAssignment_2


    // $ANTLR start rule__DtoEnumerationProperty__DescriptionAssignment_0
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2565:1: rule__DtoEnumerationProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DtoEnumerationProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2569:1: ( ( RULE_STRING ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2570:1: ( RULE_STRING )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2570:1: ( RULE_STRING )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2571:1: RULE_STRING
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DtoEnumerationProperty__DescriptionAssignment_05141); 
             after(grammarAccess.getDtoEnumerationPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__DtoEnumerationProperty__DescriptionAssignment_0


    // $ANTLR start rule__DtoEnumerationProperty__TypeAssignment_1
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2580:1: rule__DtoEnumerationProperty__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DtoEnumerationProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2584:1: ( ( ( RULE_ID ) ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2585:1: ( ( RULE_ID ) )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2585:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2586:1: ( RULE_ID )
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getTypeEnumerationDtoCrossReference_1_0()); 
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2587:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2588:1: RULE_ID
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getTypeEnumerationDtoIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoEnumerationProperty__TypeAssignment_15176); 
             after(grammarAccess.getDtoEnumerationPropertyAccess().getTypeEnumerationDtoIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDtoEnumerationPropertyAccess().getTypeEnumerationDtoCrossReference_1_0()); 

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
    // $ANTLR end rule__DtoEnumerationProperty__TypeAssignment_1


    // $ANTLR start rule__DtoEnumerationProperty__NameAssignment_2
    // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2599:1: rule__DtoEnumerationProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DtoEnumerationProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2603:1: ( ( RULE_ID ) )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2604:1: ( RULE_ID )
            {
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2604:1: ( RULE_ID )
            // ../org.mendix.dsl.datacontract.xtext.ui/src-gen/org/mendix/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g:2605:1: RULE_ID
            {
             before(grammarAccess.getDtoEnumerationPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoEnumerationProperty__NameAssignment_25211); 
             after(grammarAccess.getDtoEnumerationPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__DtoEnumerationProperty__NameAssignment_2


 

    public static final BitSet FOLLOW_ruleDataContractModel_in_entryRuleDataContractModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataContractModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__0_in_ruleDataContractModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDto_in_entryRuleDto120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDto127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dto__Alternatives_in_ruleDto154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_entryRuleExternalReference180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalReference187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__0_in_ruleExternalReference214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassDto_in_entryRuleBusinessClassDto240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClassDto247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__0_in_ruleBusinessClassDto274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDto_in_entryRuleEnumerationDto300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationDto307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__0_in_ruleEnumerationDto334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassPropertyReference_in_entryRuleBusinessClassPropertyReference360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClassPropertyReference367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassPropertyReference__Group__0_in_ruleBusinessClassPropertyReference394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassAssociationRoleReference_in_entryRuleBusinessClassAssociationRoleReference420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClassAssociationRoleReference427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__Group__0_in_ruleBusinessClassAssociationRoleReference454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomDto_in_entryRuleCustomDto480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomDto487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__0_in_ruleCustomDto514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoProperty_in_entryRuleDtoProperty540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoProperty547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoProperty__Group__0_in_ruleDtoProperty574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoBooleanProperty_in_entryRuleDtoBooleanProperty600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoBooleanProperty607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__Group__0_in_ruleDtoBooleanProperty634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoStringProperty_in_entryRuleDtoStringProperty660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoStringProperty667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__Group__0_in_ruleDtoStringProperty694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoDateTimeProperty_in_entryRuleDtoDateTimeProperty720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoDateTimeProperty727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__Group__0_in_ruleDtoDateTimeProperty754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoIntegerProperty_in_entryRuleDtoIntegerProperty780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoIntegerProperty787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__Group__0_in_ruleDtoIntegerProperty814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoDecimalProperty_in_entryRuleDtoDecimalProperty840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoDecimalProperty847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__Group__0_in_ruleDtoDecimalProperty874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoEnumerationProperty_in_entryRuleDtoEnumerationProperty900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoEnumerationProperty907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__Group__0_in_ruleDtoEnumerationProperty934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__DtosAssignment_5_0_in_rule__DataContractModel__Alternatives_5970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__EnumerationsAssignment_5_1_in_rule__DataContractModel__Alternatives_5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassDto_in_rule__Dto__Alternatives1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomDto_in_rule__Dto__Alternatives1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ExternalReference__KeywordAlternatives_3_01071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ExternalReference__KeywordAlternatives_3_01091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ExternalReference__KeywordAlternatives_3_01111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BusinessClassDto__Alternatives_51146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1__0_in_rule__BusinessClassDto__Alternatives_51165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoBooleanProperty_in_rule__DtoProperty__Alternatives_01198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoStringProperty_in_rule__DtoProperty__Alternatives_01215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoDateTimeProperty_in_rule__DtoProperty__Alternatives_01232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoIntegerProperty_in_rule__DtoProperty__Alternatives_01249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoDecimalProperty_in_rule__DtoProperty__Alternatives_01266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoEnumerationProperty_in_rule__DtoProperty__Alternatives_01283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__DescriptionAssignment_0_in_rule__DataContractModel__Group__01317 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__1_in_rule__DataContractModel__Group__01327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DataContractModel__Group__11356 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__2_in_rule__DataContractModel__Group__11366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__NameAssignment_2_in_rule__DataContractModel__Group__21394 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__3_in_rule__DataContractModel__Group__21403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DataContractModel__Group__31432 = new BitSet(new long[]{0x0000000000832012L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__4_in_rule__DataContractModel__Group__31442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__ExternalReferencesAssignment_4_in_rule__DataContractModel__Group__41470 = new BitSet(new long[]{0x0000000000832012L});
    public static final BitSet FOLLOW_rule__DataContractModel__Group__5_in_rule__DataContractModel__Group__41480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataContractModel__Alternatives_5_in_rule__DataContractModel__Group__51508 = new BitSet(new long[]{0x0000000000822012L});
    public static final BitSet FOLLOW_rule__ExternalReference__DescriptionAssignment_0_in_rule__ExternalReference__Group__01555 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__1_in_rule__ExternalReference__Group__01565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ExternalReference__Group__11594 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__2_in_rule__ExternalReference__Group__11604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__ModelnameAssignment_2_in_rule__ExternalReference__Group__21632 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__3_in_rule__ExternalReference__Group__21641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__KeywordAssignment_3_in_rule__ExternalReference__Group__31669 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__4_in_rule__ExternalReference__Group__31678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__NameAssignment_4_in_rule__ExternalReference__Group__41706 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__5_in_rule__ExternalReference__Group__41715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ExternalReference__Group__51744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__DescriptionAssignment_0_in_rule__BusinessClassDto__Group__01791 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__1_in_rule__BusinessClassDto__Group__01801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BusinessClassDto__Group__11830 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__2_in_rule__BusinessClassDto__Group__11840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__NameAssignment_2_in_rule__BusinessClassDto__Group__21868 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__3_in_rule__BusinessClassDto__Group__21877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BusinessClassDto__Group__31906 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__4_in_rule__BusinessClassDto__Group__31916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__BaseAssignment_4_in_rule__BusinessClassDto__Group__41944 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group__5_in_rule__BusinessClassDto__Group__41953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Alternatives_5_in_rule__BusinessClassDto__Group__51981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BusinessClassDto__Group_5_1__02028 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1__1_in_rule__BusinessClassDto__Group_5_1__02038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1_in_rule__BusinessClassDto__Group_5_1__12068 = new BitSet(new long[]{0x0000000000300020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_1_in_rule__BusinessClassDto__Group_5_1__12080 = new BitSet(new long[]{0x0000000000300020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1__2_in_rule__BusinessClassDto__Group_5_1__12092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1_2__0_in_rule__BusinessClassDto__Group_5_1__22120 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1__3_in_rule__BusinessClassDto__Group_5_1__22130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BusinessClassDto__Group_5_1__32159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BusinessClassDto__Group_5_1_2__02203 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1_2__1_in_rule__BusinessClassDto__Group_5_1_2__02213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BusinessClassDto__Group_5_1_2__12242 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1_2__2_in_rule__BusinessClassDto__Group_5_1_2__12252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2_in_rule__BusinessClassDto__Group_5_1_2__22282 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_2_in_rule__BusinessClassDto__Group_5_1_2__22294 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__BusinessClassDto__Group_5_1_2__3_in_rule__BusinessClassDto__Group_5_1_2__22306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BusinessClassDto__Group_5_1_2__32335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDto__DescriptionAssignment_0_in_rule__EnumerationDto__Group__02378 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__1_in_rule__EnumerationDto__Group__02388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EnumerationDto__Group__12417 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__2_in_rule__EnumerationDto__Group__12427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDto__NameAssignment_2_in_rule__EnumerationDto__Group__22455 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__3_in_rule__EnumerationDto__Group__22464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EnumerationDto__Group__32493 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__4_in_rule__EnumerationDto__Group__32503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDto__BaseAssignment_4_in_rule__EnumerationDto__Group__42531 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__EnumerationDto__Group__5_in_rule__EnumerationDto__Group__42540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EnumerationDto__Group__52569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassPropertyReference__NameAssignment_0_in_rule__BusinessClassPropertyReference__Group__02616 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__BusinessClassPropertyReference__Group__1_in_rule__BusinessClassPropertyReference__Group__02625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BusinessClassPropertyReference__Group__12654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__NameAssignment_0_in_rule__BusinessClassAssociationRoleReference__Group__02693 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__Group__1_in_rule__BusinessClassAssociationRoleReference__Group__02702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BusinessClassAssociationRoleReference__Group__12731 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__Group__2_in_rule__BusinessClassAssociationRoleReference__Group__12741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_2_in_rule__BusinessClassAssociationRoleReference__Group__22769 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__BusinessClassAssociationRoleReference__Group__3_in_rule__BusinessClassAssociationRoleReference__Group__22778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BusinessClassAssociationRoleReference__Group__32807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomDto__DescriptionAssignment_0_in_rule__CustomDto__Group__02850 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__1_in_rule__CustomDto__Group__02860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CustomDto__Group__12889 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__2_in_rule__CustomDto__Group__12899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomDto__NameAssignment_2_in_rule__CustomDto__Group__22927 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__3_in_rule__CustomDto__Group__22936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CustomDto__Group__32965 = new BitSet(new long[]{0x000000001F000030L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__4_in_rule__CustomDto__Group__32975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomDto__PropertiesAssignment_4_in_rule__CustomDto__Group__43005 = new BitSet(new long[]{0x000000001F100030L});
    public static final BitSet FOLLOW_rule__CustomDto__PropertiesAssignment_4_in_rule__CustomDto__Group__43017 = new BitSet(new long[]{0x000000001F100030L});
    public static final BitSet FOLLOW_rule__CustomDto__Group__5_in_rule__CustomDto__Group__43029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CustomDto__Group__53058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoProperty__Alternatives_0_in_rule__DtoProperty__Group__03105 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__DtoProperty__Group__1_in_rule__DtoProperty__Group__03114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DtoProperty__Group__13143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__DescriptionAssignment_0_in_rule__DtoBooleanProperty__Group__03182 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__Group__1_in_rule__DtoBooleanProperty__Group__03192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__DataTypeAssignment_1_in_rule__DtoBooleanProperty__Group__13220 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__Group__2_in_rule__DtoBooleanProperty__Group__13229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoBooleanProperty__NameAssignment_2_in_rule__DtoBooleanProperty__Group__23257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__DescriptionAssignment_0_in_rule__DtoStringProperty__Group__03297 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__Group__1_in_rule__DtoStringProperty__Group__03307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__DataTypeAssignment_1_in_rule__DtoStringProperty__Group__13335 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__Group__2_in_rule__DtoStringProperty__Group__13344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoStringProperty__NameAssignment_2_in_rule__DtoStringProperty__Group__23372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__DescriptionAssignment_0_in_rule__DtoDateTimeProperty__Group__03412 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__Group__1_in_rule__DtoDateTimeProperty__Group__03422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__DataTypeAssignment_1_in_rule__DtoDateTimeProperty__Group__13450 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__Group__2_in_rule__DtoDateTimeProperty__Group__13459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDateTimeProperty__NameAssignment_2_in_rule__DtoDateTimeProperty__Group__23487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__DescriptionAssignment_0_in_rule__DtoIntegerProperty__Group__03527 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__Group__1_in_rule__DtoIntegerProperty__Group__03537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__DataTypeAssignment_1_in_rule__DtoIntegerProperty__Group__13565 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__Group__2_in_rule__DtoIntegerProperty__Group__13574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoIntegerProperty__NameAssignment_2_in_rule__DtoIntegerProperty__Group__23602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__DescriptionAssignment_0_in_rule__DtoDecimalProperty__Group__03642 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__Group__1_in_rule__DtoDecimalProperty__Group__03652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__DataTypeAssignment_1_in_rule__DtoDecimalProperty__Group__13680 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__Group__2_in_rule__DtoDecimalProperty__Group__13689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoDecimalProperty__NameAssignment_2_in_rule__DtoDecimalProperty__Group__23717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__DescriptionAssignment_0_in_rule__DtoEnumerationProperty__Group__03757 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__Group__1_in_rule__DtoEnumerationProperty__Group__03767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__TypeAssignment_1_in_rule__DtoEnumerationProperty__Group__13795 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__Group__2_in_rule__DtoEnumerationProperty__Group__13804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoEnumerationProperty__NameAssignment_2_in_rule__DtoEnumerationProperty__Group__23832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DataContractModel__DescriptionAssignment_03872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataContractModel__NameAssignment_23903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_rule__DataContractModel__ExternalReferencesAssignment_43934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDto_in_rule__DataContractModel__DtosAssignment_5_03965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDto_in_rule__DataContractModel__EnumerationsAssignment_5_13996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ExternalReference__DescriptionAssignment_04027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalReference__ModelnameAssignment_24058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__KeywordAlternatives_3_0_in_rule__ExternalReference__KeywordAssignment_34089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalReference__NameAssignment_44122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BusinessClassDto__DescriptionAssignment_04153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassDto__NameAssignment_24184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassDto__BaseAssignment_44219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassPropertyReference_in_rule__BusinessClassDto__PropertyReferencesAssignment_5_1_14254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassAssociationRoleReference_in_rule__BusinessClassDto__AssociationReferencesAssignment_5_1_2_24285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnumerationDto__DescriptionAssignment_04316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationDto__NameAssignment_24347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationDto__BaseAssignment_44382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassPropertyReference__NameAssignment_04417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassAssociationRoleReference__NameAssignment_04448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassAssociationRoleReference__DtoTypeAssignment_24483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomDto__DescriptionAssignment_04518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomDto__NameAssignment_24549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoProperty_in_rule__CustomDto__PropertiesAssignment_44580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoBooleanProperty__DescriptionAssignment_04611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DtoBooleanProperty__DataTypeAssignment_14647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoBooleanProperty__NameAssignment_24686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoStringProperty__DescriptionAssignment_04717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DtoStringProperty__DataTypeAssignment_14753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoStringProperty__NameAssignment_24792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoDateTimeProperty__DescriptionAssignment_04823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DtoDateTimeProperty__DataTypeAssignment_14859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoDateTimeProperty__NameAssignment_24898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoIntegerProperty__DescriptionAssignment_04929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DtoIntegerProperty__DataTypeAssignment_14965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoIntegerProperty__NameAssignment_25004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoDecimalProperty__DescriptionAssignment_05035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DtoDecimalProperty__DataTypeAssignment_15071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoDecimalProperty__NameAssignment_25110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DtoEnumerationProperty__DescriptionAssignment_05141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoEnumerationProperty__TypeAssignment_15176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoEnumerationProperty__NameAssignment_25211 = new BitSet(new long[]{0x0000000000000002L});

}