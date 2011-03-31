/*
* generated by Xtext
*/

package org.mendix.dsl.service.xtext.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;

import org.eclipse.xtext.service.GrammarProvider;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class ServiceGrammarAccess implements IGrammarAccess {
	
	
	public class ServiceModelElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ServiceModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDescriptionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_0_0 = (RuleCall)cDescriptionAssignment_0.eContents().get(0);
		private final Keyword cServiceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDtoReferencesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDtoReferencesDtoReferenceParserRuleCall_4_0 = (RuleCall)cDtoReferencesAssignment_4.eContents().get(0);
		private final Alternatives cAlternatives_5 = (Alternatives)cGroup.eContents().get(5);
		private final Assignment cCrudServicesAssignment_5_0 = (Assignment)cAlternatives_5.eContents().get(0);
		private final RuleCall cCrudServicesCrudServiceParserRuleCall_5_0_0 = (RuleCall)cCrudServicesAssignment_5_0.eContents().get(0);
		private final Assignment cMethodsAssignment_5_1 = (Assignment)cAlternatives_5.eContents().get(1);
		private final RuleCall cMethodsServiceMethodParserRuleCall_5_1_0 = (RuleCall)cMethodsAssignment_5_1.eContents().get(0);
		
		//ServiceModel:
		//  description=STRING? "service" name=ID ";" dtoReferences+=DtoReference* (crudServices
		//  +=CrudService|methods+=ServiceMethod)*; 
		//
		/// *******************************************************************************
		//
		// * Copyright (c) 2009 Ordina and committers to Mod4j
		//
		// * All rights reserved. This program and the accompanying materials
		//
		// * are made available under the terms of the Eclipse Public License v1.0
		//
		// * which accompanies this distribution, and is available at
		//
		// * http://www.eclipse.org/legal/epl-v10.html
		//
		// *
		//
		// * Contributors:
		//
		// *     Ordina - initial implementation
		//
		// ******************************************************************************* /
		public ParserRule getRule() { return rule; }

		//description=STRING? "service" name=ID ";" dtoReferences+=DtoReference* (crudServices
		//+=CrudService|methods+=ServiceMethod)*
		public Group getGroup() { return cGroup; }

		//description=STRING?
		public Assignment getDescriptionAssignment_0() { return cDescriptionAssignment_0; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_0_0() { return cDescriptionSTRINGTerminalRuleCall_0_0; }

		//"service"
		public Keyword getServiceKeyword_1() { return cServiceKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }

		//dtoReferences+=DtoReference*
		public Assignment getDtoReferencesAssignment_4() { return cDtoReferencesAssignment_4; }

		//DtoReference
		public RuleCall getDtoReferencesDtoReferenceParserRuleCall_4_0() { return cDtoReferencesDtoReferenceParserRuleCall_4_0; }

		//(crudServices+=CrudService|methods+=ServiceMethod)*
		public Alternatives getAlternatives_5() { return cAlternatives_5; }

		//crudServices+=CrudService
		public Assignment getCrudServicesAssignment_5_0() { return cCrudServicesAssignment_5_0; }

		//CrudService
		public RuleCall getCrudServicesCrudServiceParserRuleCall_5_0_0() { return cCrudServicesCrudServiceParserRuleCall_5_0_0; }

		//methods+=ServiceMethod
		public Assignment getMethodsAssignment_5_1() { return cMethodsAssignment_5_1; }

		//ServiceMethod
		public RuleCall getMethodsServiceMethodParserRuleCall_5_1_0() { return cMethodsServiceMethodParserRuleCall_5_1_0; }
	}

	public class AssociationMethodElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AssociationMethod");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDescriptionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_0_0 = (RuleCall)cDescriptionAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cNameForKeyword_1_0 = (Keyword)cNameAssignment_1.eContents().get(0);
		private final Assignment cMainAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cMainDtoReferenceCrossReference_2_0 = (CrossReference)cMainAssignment_2.eContents().get(0);
		private final RuleCall cMainDtoReferenceIDTerminalRuleCall_2_0_1 = (RuleCall)cMainDtoReferenceCrossReference_2_0.eContents().get(1);
		private final Keyword cReferenceKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRolenameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRolenameIDTerminalRuleCall_4_0 = (RuleCall)cRolenameAssignment_4.eContents().get(0);
		private final Assignment cTypeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTypeAssociationMethodTypeEnumRuleCall_5_0 = (RuleCall)cTypeAssignment_5.eContents().get(0);
		private final Assignment cPartAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cPartDtoReferenceCrossReference_6_0 = (CrossReference)cPartAssignment_6.eContents().get(0);
		private final RuleCall cPartDtoReferenceIDTerminalRuleCall_6_0_1 = (RuleCall)cPartDtoReferenceCrossReference_6_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//AssociationMethod:
		//  description=STRING? name="for" main=[DtoReference] "reference" rolename=ID type=
		//  AssociationMethodType part=[DtoReference] ";";
		public ParserRule getRule() { return rule; }

		//description=STRING? name="for" main=[DtoReference] "reference" rolename=ID type=
		//AssociationMethodType part=[DtoReference] ";"
		public Group getGroup() { return cGroup; }

		//description=STRING?
		public Assignment getDescriptionAssignment_0() { return cDescriptionAssignment_0; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_0_0() { return cDescriptionSTRINGTerminalRuleCall_0_0; }

		//name="for"
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//"for"
		public Keyword getNameForKeyword_1_0() { return cNameForKeyword_1_0; }

		//main=[DtoReference]
		public Assignment getMainAssignment_2() { return cMainAssignment_2; }

		//[DtoReference]
		public CrossReference getMainDtoReferenceCrossReference_2_0() { return cMainDtoReferenceCrossReference_2_0; }

		//ID
		public RuleCall getMainDtoReferenceIDTerminalRuleCall_2_0_1() { return cMainDtoReferenceIDTerminalRuleCall_2_0_1; }

		//"reference"
		public Keyword getReferenceKeyword_3() { return cReferenceKeyword_3; }

		//rolename=ID
		public Assignment getRolenameAssignment_4() { return cRolenameAssignment_4; }

		//ID
		public RuleCall getRolenameIDTerminalRuleCall_4_0() { return cRolenameIDTerminalRuleCall_4_0; }

		//type=AssociationMethodType
		public Assignment getTypeAssignment_5() { return cTypeAssignment_5; }

		//AssociationMethodType
		public RuleCall getTypeAssociationMethodTypeEnumRuleCall_5_0() { return cTypeAssociationMethodTypeEnumRuleCall_5_0; }

		//part=[DtoReference]
		public Assignment getPartAssignment_6() { return cPartAssignment_6; }

		//[DtoReference]
		public CrossReference getPartDtoReferenceCrossReference_6_0() { return cPartDtoReferenceCrossReference_6_0; }

		//ID
		public RuleCall getPartDtoReferenceIDTerminalRuleCall_6_0_1() { return cPartDtoReferenceIDTerminalRuleCall_6_0_1; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class DtoReferenceElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DtoReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFromKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cModelnameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cModelnameIDTerminalRuleCall_1_0 = (RuleCall)cModelnameAssignment_1.eContents().get(0);
		private final Keyword cImportKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DtoReference:
		//  "from" modelname=ID "import" name=ID ";";
		public ParserRule getRule() { return rule; }

		//"from" modelname=ID "import" name=ID ";"
		public Group getGroup() { return cGroup; }

		//"from"
		public Keyword getFromKeyword_0() { return cFromKeyword_0; }

		//modelname=ID
		public Assignment getModelnameAssignment_1() { return cModelnameAssignment_1; }

		//ID
		public RuleCall getModelnameIDTerminalRuleCall_1_0() { return cModelnameIDTerminalRuleCall_1_0; }

		//"import"
		public Keyword getImportKeyword_2() { return cImportKeyword_2; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class ServiceMethodElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ServiceMethod");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCustomMethodParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSpecialMethodParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cAssociationMethodParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//ServiceMethod:
		//  CustomMethod|SpecialMethod|AssociationMethod; 
		//
		//
		//
		//  
		//
		////	(description=STRING )?
		public ParserRule getRule() { return rule; }

		//CustomMethod|SpecialMethod|AssociationMethod 
		//
		////	(description=STRING )?
		public Alternatives getAlternatives() { return cAlternatives; }

		//CustomMethod
		public RuleCall getCustomMethodParserRuleCall_0() { return cCustomMethodParserRuleCall_0; }

		//SpecialMethod
		public RuleCall getSpecialMethodParserRuleCall_1() { return cSpecialMethodParserRuleCall_1; }

		//AssociationMethod
		public RuleCall getAssociationMethodParserRuleCall_2() { return cAssociationMethodParserRuleCall_2; }
	}

	public class CustomMethodElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CustomMethod");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDescriptionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_0_0 = (RuleCall)cDescriptionAssignment_0.eContents().get(0);
		private final Keyword cMethodKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cInKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cInParametersAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cInParametersParameterParserRuleCall_3_2_0 = (RuleCall)cInParametersAssignment_3_2.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cGroup_3.eContents().get(3);
		private final Keyword cCommaKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Assignment cInParametersAssignment_3_3_1 = (Assignment)cGroup_3_3.eContents().get(1);
		private final RuleCall cInParametersParameterParserRuleCall_3_3_1_0 = (RuleCall)cInParametersAssignment_3_3_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_4 = (Keyword)cGroup_3.eContents().get(4);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cOutKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cOutParameterAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cOutParameterOutParameterParserRuleCall_4_1_0 = (RuleCall)cOutParameterAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//CustomMethod:
		//  description=STRING? "method" name=ID ("in" "(" inParameters+=Parameter (","
		//  inParameters+=Parameter)* ")")? ("out" outParameter=OutParameter)? ";";
		public ParserRule getRule() { return rule; }

		//description=STRING? "method" name=ID ("in" "(" inParameters+=Parameter (","
		//inParameters+=Parameter)* ")")? ("out" outParameter=OutParameter)? ";"
		public Group getGroup() { return cGroup; }

		//description=STRING?
		public Assignment getDescriptionAssignment_0() { return cDescriptionAssignment_0; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_0_0() { return cDescriptionSTRINGTerminalRuleCall_0_0; }

		//"method"
		public Keyword getMethodKeyword_1() { return cMethodKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//("in" "(" inParameters+=Parameter ("," inParameters+=Parameter)* ")")?
		public Group getGroup_3() { return cGroup_3; }

		//"in"
		public Keyword getInKeyword_3_0() { return cInKeyword_3_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_3_1() { return cLeftParenthesisKeyword_3_1; }

		//inParameters+=Parameter
		public Assignment getInParametersAssignment_3_2() { return cInParametersAssignment_3_2; }

		//Parameter
		public RuleCall getInParametersParameterParserRuleCall_3_2_0() { return cInParametersParameterParserRuleCall_3_2_0; }

		//("," inParameters+=Parameter)*
		public Group getGroup_3_3() { return cGroup_3_3; }

		//","
		public Keyword getCommaKeyword_3_3_0() { return cCommaKeyword_3_3_0; }

		//inParameters+=Parameter
		public Assignment getInParametersAssignment_3_3_1() { return cInParametersAssignment_3_3_1; }

		//Parameter
		public RuleCall getInParametersParameterParserRuleCall_3_3_1_0() { return cInParametersParameterParserRuleCall_3_3_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3_4() { return cRightParenthesisKeyword_3_4; }

		//("out" outParameter=OutParameter)?
		public Group getGroup_4() { return cGroup_4; }

		//"out"
		public Keyword getOutKeyword_4_0() { return cOutKeyword_4_0; }

		//outParameter=OutParameter
		public Assignment getOutParameterAssignment_4_1() { return cOutParameterAssignment_4_1; }

		//OutParameter
		public RuleCall getOutParameterOutParameterParserRuleCall_4_1_0() { return cOutParameterOutParameterParserRuleCall_4_1_0; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class OutParameterElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OutParameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDescriptionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_0_0 = (RuleCall)cDescriptionAssignment_0.eContents().get(0);
		private final Assignment cCollectionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCollectionCollectionTypeEnumRuleCall_1_0 = (RuleCall)cCollectionAssignment_1.eContents().get(0);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeDtoReferenceCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeDtoReferenceIDTerminalRuleCall_2_0_1 = (RuleCall)cTypeDtoReferenceCrossReference_2_0.eContents().get(1);
		
		//OutParameter returns Parameter:
		//  description=STRING? collection=CollectionType? type=[DtoReference]; 
		//
		//     
		//
		//    
		//
		//	  
		//
		//	    
		//
		//    
		//
		////    name=ID
		public ParserRule getRule() { return rule; }

		//description=STRING? collection=CollectionType? type=[DtoReference] 
		//
		//	  
		//
		//	    
		//
		//    
		//
		////    name=ID
		public Group getGroup() { return cGroup; }

		//description=STRING?
		public Assignment getDescriptionAssignment_0() { return cDescriptionAssignment_0; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_0_0() { return cDescriptionSTRINGTerminalRuleCall_0_0; }

		//collection=CollectionType?
		public Assignment getCollectionAssignment_1() { return cCollectionAssignment_1; }

		//CollectionType
		public RuleCall getCollectionCollectionTypeEnumRuleCall_1_0() { return cCollectionCollectionTypeEnumRuleCall_1_0; }

		//type=[DtoReference] 
		//
		//    
		//
		////    name=ID
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//[DtoReference] 
		//
		////    name=ID
		public CrossReference getTypeDtoReferenceCrossReference_2_0() { return cTypeDtoReferenceCrossReference_2_0; }

		//ID
		public RuleCall getTypeDtoReferenceIDTerminalRuleCall_2_0_1() { return cTypeDtoReferenceIDTerminalRuleCall_2_0_1; }
	}

	public class ParameterElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Parameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDescriptionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_0_0 = (RuleCall)cDescriptionAssignment_0.eContents().get(0);
		private final Assignment cCollectionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCollectionCollectionTypeEnumRuleCall_1_0 = (RuleCall)cCollectionAssignment_1.eContents().get(0);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeDtoReferenceCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeDtoReferenceIDTerminalRuleCall_2_0_1 = (RuleCall)cTypeDtoReferenceCrossReference_2_0.eContents().get(1);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		
		//Parameter:
		//  description=STRING? collection=CollectionType? type=[DtoReference] name=ID;
		public ParserRule getRule() { return rule; }

		//description=STRING? collection=CollectionType? type=[DtoReference] name=ID
		public Group getGroup() { return cGroup; }

		//description=STRING?
		public Assignment getDescriptionAssignment_0() { return cDescriptionAssignment_0; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_0_0() { return cDescriptionSTRINGTerminalRuleCall_0_0; }

		//collection=CollectionType?
		public Assignment getCollectionAssignment_1() { return cCollectionAssignment_1; }

		//CollectionType
		public RuleCall getCollectionCollectionTypeEnumRuleCall_1_0() { return cCollectionCollectionTypeEnumRuleCall_1_0; }

		//type=[DtoReference]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//[DtoReference]
		public CrossReference getTypeDtoReferenceCrossReference_2_0() { return cTypeDtoReferenceCrossReference_2_0; }

		//ID
		public RuleCall getTypeDtoReferenceIDTerminalRuleCall_2_0_1() { return cTypeDtoReferenceIDTerminalRuleCall_2_0_1; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
	}

	public class SpecialMethodElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SpecialMethod");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDescriptionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_0_0 = (RuleCall)cDescriptionAssignment_0.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeSpecialMethodTypeEnumRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cForKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDtoAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cDtoDtoReferenceCrossReference_4_0 = (CrossReference)cDtoAssignment_4.eContents().get(0);
		private final RuleCall cDtoDtoReferenceIDTerminalRuleCall_4_0_1 = (RuleCall)cDtoDtoReferenceCrossReference_4_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//SpecialMethod:
		//  description=STRING? type=SpecialMethodType name=ID "for" dto=[DtoReference] ";";
		public ParserRule getRule() { return rule; }

		//description=STRING? type=SpecialMethodType name=ID "for" dto=[DtoReference] ";"
		public Group getGroup() { return cGroup; }

		//description=STRING?
		public Assignment getDescriptionAssignment_0() { return cDescriptionAssignment_0; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_0_0() { return cDescriptionSTRINGTerminalRuleCall_0_0; }

		//type=SpecialMethodType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//SpecialMethodType
		public RuleCall getTypeSpecialMethodTypeEnumRuleCall_1_0() { return cTypeSpecialMethodTypeEnumRuleCall_1_0; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"for"
		public Keyword getForKeyword_3() { return cForKeyword_3; }

		//dto=[DtoReference]
		public Assignment getDtoAssignment_4() { return cDtoAssignment_4; }

		//[DtoReference]
		public CrossReference getDtoDtoReferenceCrossReference_4_0() { return cDtoDtoReferenceCrossReference_4_0; }

		//ID
		public RuleCall getDtoDtoReferenceIDTerminalRuleCall_4_0_1() { return cDtoDtoReferenceIDTerminalRuleCall_4_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class CrudServiceElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CrudService");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDescriptionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_0_0 = (RuleCall)cDescriptionAssignment_0.eContents().get(0);
		private final Keyword cCrudKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDtoAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cDtoDtoReferenceCrossReference_2_0 = (CrossReference)cDtoAssignment_2.eContents().get(0);
		private final RuleCall cDtoDtoReferenceIDTerminalRuleCall_2_0_1 = (RuleCall)cDtoDtoReferenceCrossReference_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//CrudService:
		//  description=STRING? "crud" dto=[DtoReference] ";";
		public ParserRule getRule() { return rule; }

		//description=STRING? "crud" dto=[DtoReference] ";"
		public Group getGroup() { return cGroup; }

		//description=STRING?
		public Assignment getDescriptionAssignment_0() { return cDescriptionAssignment_0; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_0_0() { return cDescriptionSTRINGTerminalRuleCall_0_0; }

		//"crud"
		public Keyword getCrudKeyword_1() { return cCrudKeyword_1; }

		//dto=[DtoReference]
		public Assignment getDtoAssignment_2() { return cDtoAssignment_2; }

		//[DtoReference]
		public CrossReference getDtoDtoReferenceCrossReference_2_0() { return cDtoDtoReferenceCrossReference_2_0; }

		//ID
		public RuleCall getDtoDtoReferenceIDTerminalRuleCall_2_0_1() { return cDtoDtoReferenceIDTerminalRuleCall_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	
	
	public class SpecialMethodTypeElements implements IEnumRuleAccess {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "SpecialMethodType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCREATEEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCREATECreateKeyword_0_0 = (Keyword)cCREATEEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cREADEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cREADReadKeyword_1_0 = (Keyword)cREADEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cUPDATEEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cUPDATEUpdateKeyword_2_0 = (Keyword)cUPDATEEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cDELETEEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cDELETEDeleteKeyword_3_0 = (Keyword)cDELETEEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cLISTALLEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cLISTALLListallKeyword_4_0 = (Keyword)cLISTALLEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cFINDEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cFINDFindKeyword_5_0 = (Keyword)cFINDEnumLiteralDeclaration_5.eContents().get(0);
		
		//enum SpecialMethodType returns MethodType:
		//  CREATE="create" | READ="read" | UPDATE="update" | DELETE="delete" | LISTALL="listall" |
		//  FIND="find";
		public EnumRule getRule() { return rule; }

		//CREATE="create" | READ="read" | UPDATE="update" | DELETE="delete" | LISTALL="listall" |
		//FIND="find"
		public Alternatives getAlternatives() { return cAlternatives; }

		//CREATE="create"
		public EnumLiteralDeclaration getCREATEEnumLiteralDeclaration_0() { return cCREATEEnumLiteralDeclaration_0; }

		//"create"
		public Keyword getCREATECreateKeyword_0_0() { return cCREATECreateKeyword_0_0; }

		//READ="read"
		public EnumLiteralDeclaration getREADEnumLiteralDeclaration_1() { return cREADEnumLiteralDeclaration_1; }

		//"read"
		public Keyword getREADReadKeyword_1_0() { return cREADReadKeyword_1_0; }

		//UPDATE="update"
		public EnumLiteralDeclaration getUPDATEEnumLiteralDeclaration_2() { return cUPDATEEnumLiteralDeclaration_2; }

		//"update"
		public Keyword getUPDATEUpdateKeyword_2_0() { return cUPDATEUpdateKeyword_2_0; }

		//DELETE="delete"
		public EnumLiteralDeclaration getDELETEEnumLiteralDeclaration_3() { return cDELETEEnumLiteralDeclaration_3; }

		//"delete"
		public Keyword getDELETEDeleteKeyword_3_0() { return cDELETEDeleteKeyword_3_0; }

		//LISTALL="listall"
		public EnumLiteralDeclaration getLISTALLEnumLiteralDeclaration_4() { return cLISTALLEnumLiteralDeclaration_4; }

		//"listall"
		public Keyword getLISTALLListallKeyword_4_0() { return cLISTALLListallKeyword_4_0; }

		//FIND="find"
		public EnumLiteralDeclaration getFINDEnumLiteralDeclaration_5() { return cFINDEnumLiteralDeclaration_5; }

		//"find"
		public Keyword getFINDFindKeyword_5_0() { return cFINDFindKeyword_5_0; }
	}

	public class AssociationMethodTypeElements implements IEnumRuleAccess {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "AssociationMethodType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cADDTOEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cADDTOAddKeyword_0_0 = (Keyword)cADDTOEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cREMOVEFROMEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cREMOVEFROMRemoveKeyword_1_0 = (Keyword)cREMOVEFROMEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cGETFROMEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cGETFROMGetKeyword_2_0 = (Keyword)cGETFROMEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum AssociationMethodType returns MethodType:
		//  ADDTO="add" | REMOVEFROM="remove" | GETFROM="get";
		public EnumRule getRule() { return rule; }

		//ADDTO="add" | REMOVEFROM="remove" | GETFROM="get"
		public Alternatives getAlternatives() { return cAlternatives; }

		//ADDTO="add"
		public EnumLiteralDeclaration getADDTOEnumLiteralDeclaration_0() { return cADDTOEnumLiteralDeclaration_0; }

		//"add"
		public Keyword getADDTOAddKeyword_0_0() { return cADDTOAddKeyword_0_0; }

		//REMOVEFROM="remove"
		public EnumLiteralDeclaration getREMOVEFROMEnumLiteralDeclaration_1() { return cREMOVEFROMEnumLiteralDeclaration_1; }

		//"remove"
		public Keyword getREMOVEFROMRemoveKeyword_1_0() { return cREMOVEFROMRemoveKeyword_1_0; }

		//GETFROM="get"
		public EnumLiteralDeclaration getGETFROMEnumLiteralDeclaration_2() { return cGETFROMEnumLiteralDeclaration_2; }

		//"get"
		public Keyword getGETFROMGetKeyword_2_0() { return cGETFROMGetKeyword_2_0; }
	}

	public class CollectionTypeElements implements IEnumRuleAccess {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "CollectionType");
		private final EnumLiteralDeclaration cLISTEnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cLISTListKeyword_0 = (Keyword)cLISTEnumLiteralDeclaration.eContents().get(0);
		
		//enum CollectionType:
		//  LIST="list";
		public EnumRule getRule() { return rule; }

		//LIST="list"
		public EnumLiteralDeclaration getLISTEnumLiteralDeclaration() { return cLISTEnumLiteralDeclaration; }

		//"list"
		public Keyword getLISTListKeyword_0() { return cLISTListKeyword_0; }
	}
	
	private ServiceModelElements pServiceModel;
	private AssociationMethodElements pAssociationMethod;
	private SpecialMethodTypeElements unknownRuleSpecialMethodType;
	private AssociationMethodTypeElements unknownRuleAssociationMethodType;
	private DtoReferenceElements pDtoReference;
	private ServiceMethodElements pServiceMethod;
	private CustomMethodElements pCustomMethod;
	private OutParameterElements pOutParameter;
	private ParameterElements pParameter;
	private CollectionTypeElements unknownRuleCollectionType;
	private SpecialMethodElements pSpecialMethod;
	private CrudServiceElements pCrudService;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public ServiceGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ServiceModel:
	//  description=STRING? "service" name=ID ";" dtoReferences+=DtoReference* (crudServices
	//  +=CrudService|methods+=ServiceMethod)*; 
	//
	/// *******************************************************************************
	//
	// * Copyright (c) 2009 Ordina and committers to Mod4j
	//
	// * All rights reserved. This program and the accompanying materials
	//
	// * are made available under the terms of the Eclipse Public License v1.0
	//
	// * which accompanies this distribution, and is available at
	//
	// * http://www.eclipse.org/legal/epl-v10.html
	//
	// *
	//
	// * Contributors:
	//
	// *     Ordina - initial implementation
	//
	// ******************************************************************************* /
	public ServiceModelElements getServiceModelAccess() {
		return (pServiceModel != null) ? pServiceModel : (pServiceModel = new ServiceModelElements());
	}
	
	public ParserRule getServiceModelRule() {
		return getServiceModelAccess().getRule();
	}

	//AssociationMethod:
	//  description=STRING? name="for" main=[DtoReference] "reference" rolename=ID type=
	//  AssociationMethodType part=[DtoReference] ";";
	public AssociationMethodElements getAssociationMethodAccess() {
		return (pAssociationMethod != null) ? pAssociationMethod : (pAssociationMethod = new AssociationMethodElements());
	}
	
	public ParserRule getAssociationMethodRule() {
		return getAssociationMethodAccess().getRule();
	}

	//enum SpecialMethodType returns MethodType:
	//  CREATE="create" | READ="read" | UPDATE="update" | DELETE="delete" | LISTALL="listall" |
	//  FIND="find";
	public SpecialMethodTypeElements getSpecialMethodTypeAccess() {
		return (unknownRuleSpecialMethodType != null) ? unknownRuleSpecialMethodType : (unknownRuleSpecialMethodType = new SpecialMethodTypeElements());
	}
	
	public EnumRule getSpecialMethodTypeRule() {
		return getSpecialMethodTypeAccess().getRule();
	}

	//enum AssociationMethodType returns MethodType:
	//  ADDTO="add" | REMOVEFROM="remove" | GETFROM="get";
	public AssociationMethodTypeElements getAssociationMethodTypeAccess() {
		return (unknownRuleAssociationMethodType != null) ? unknownRuleAssociationMethodType : (unknownRuleAssociationMethodType = new AssociationMethodTypeElements());
	}
	
	public EnumRule getAssociationMethodTypeRule() {
		return getAssociationMethodTypeAccess().getRule();
	}

	//DtoReference:
	//  "from" modelname=ID "import" name=ID ";";
	public DtoReferenceElements getDtoReferenceAccess() {
		return (pDtoReference != null) ? pDtoReference : (pDtoReference = new DtoReferenceElements());
	}
	
	public ParserRule getDtoReferenceRule() {
		return getDtoReferenceAccess().getRule();
	}

	//ServiceMethod:
	//  CustomMethod|SpecialMethod|AssociationMethod; 
	//
	//
	//
	//  
	//
	////	(description=STRING )?
	public ServiceMethodElements getServiceMethodAccess() {
		return (pServiceMethod != null) ? pServiceMethod : (pServiceMethod = new ServiceMethodElements());
	}
	
	public ParserRule getServiceMethodRule() {
		return getServiceMethodAccess().getRule();
	}

	//CustomMethod:
	//  description=STRING? "method" name=ID ("in" "(" inParameters+=Parameter (","
	//  inParameters+=Parameter)* ")")? ("out" outParameter=OutParameter)? ";";
	public CustomMethodElements getCustomMethodAccess() {
		return (pCustomMethod != null) ? pCustomMethod : (pCustomMethod = new CustomMethodElements());
	}
	
	public ParserRule getCustomMethodRule() {
		return getCustomMethodAccess().getRule();
	}

	//OutParameter returns Parameter:
	//  description=STRING? collection=CollectionType? type=[DtoReference]; 
	//
	//     
	//
	//    
	//
	//	  
	//
	//	    
	//
	//    
	//
	////    name=ID
	public OutParameterElements getOutParameterAccess() {
		return (pOutParameter != null) ? pOutParameter : (pOutParameter = new OutParameterElements());
	}
	
	public ParserRule getOutParameterRule() {
		return getOutParameterAccess().getRule();
	}

	//Parameter:
	//  description=STRING? collection=CollectionType? type=[DtoReference] name=ID;
	public ParameterElements getParameterAccess() {
		return (pParameter != null) ? pParameter : (pParameter = new ParameterElements());
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}

	//enum CollectionType:
	//  LIST="list";
	public CollectionTypeElements getCollectionTypeAccess() {
		return (unknownRuleCollectionType != null) ? unknownRuleCollectionType : (unknownRuleCollectionType = new CollectionTypeElements());
	}
	
	public EnumRule getCollectionTypeRule() {
		return getCollectionTypeAccess().getRule();
	}

	//SpecialMethod:
	//  description=STRING? type=SpecialMethodType name=ID "for" dto=[DtoReference] ";";
	public SpecialMethodElements getSpecialMethodAccess() {
		return (pSpecialMethod != null) ? pSpecialMethod : (pSpecialMethod = new SpecialMethodElements());
	}
	
	public ParserRule getSpecialMethodRule() {
		return getSpecialMethodAccess().getRule();
	}

	//CrudService:
	//  description=STRING? "crud" dto=[DtoReference] ";";
	public CrudServiceElements getCrudServiceAccess() {
		return (pCrudService != null) ? pCrudService : (pCrudService = new CrudServiceElements());
	}
	
	public ParserRule getCrudServiceRule() {
		return getCrudServiceAccess().getRule();
	}

	//terminal ID:
	//  "^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//  "0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//  "\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" |
	//  "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//  "/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//  "//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//  (" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//  .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
