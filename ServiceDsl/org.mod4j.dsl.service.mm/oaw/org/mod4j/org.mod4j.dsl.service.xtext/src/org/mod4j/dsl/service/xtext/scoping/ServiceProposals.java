/*******************************************************************************
 * Copyright (c) 2009 Ordina and committers to Mod4j
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ordina - initial implementation
 *******************************************************************************/
package org.mendix.dsl.service.xtext.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.mendix.crossx.broker.CrossxBroker;
import org.mendix.crossx.mm.crossx.ReferenceSymbolProperty;
import org.mendix.crossx.mm.crossx.Symbol;
import org.mendix.dsl.service.mm.ServiceDsl.AssociationMethod;
import org.mendix.dsl.service.mm.ServiceDsl.DtoReference;
import org.mendix.dsl.service.mm.ServiceDsl.ServiceModel;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.parsetree.NodeUtil;  // .model.NodeUtil;
// import org.eclipse.xtext.parsetree.Node;

public class ServiceProposals {

    /**
     * Get a list of proposals for a BusinessClassReference for context 'ctx'
     * 
     * @param ctx
     *            The conmtext within xText for which the proposals is created
     * @return
     */
    static public List<String> getRolenameProposals(EObject ctx) {
        List<String> result = new ArrayList<String>();
        DtoReference dto = null;
        AssociationMethod method = null;
        
        if (ctx == null) {
            return result;
        }
        // The context may be of different types
        if (ctx instanceof DtoReference) {
            dto = ((DtoReference) ctx);
        }
        if (ctx instanceof AssociationMethod) {
            method = ((AssociationMethod) ctx);
            dto = method.getMain(); 
//            Node node = NodeUtil.getNode(ctx);
//            result.add("method [" + node.getLine() + "]");
//            result.add("method [" + node.getStart() + "]");
//            result.add("method [" + node.getEnd() + "]");
//            result.add("method [" + node.getErrors() + "]");
//            result.add("method [" + node.getToken().getText() + "]");
//            result.add("method [" + node.getGrammarElement().toString() + "]");
//            Node parent = node.getParent();
//            result.add("method [" + parent.getModelElement() + "]");
        } else {
            result.add("ERROR: Not an association method");
            return result;
        }
        if (dto == null) {
//            result.add("ctx [" + ctx.toString() + "]");
//            result.add("ctx [" + ctx.getClass().getName() + "]");
            result.add("ERROR: No code completion available");
            return result;
        }
        
        Symbol dtoSymbol = CrossxBroker.lookupSymbol(dto.getModelname(), dto.getName(), "Dto");
        
        if (dtoSymbol == null ) {
            result.add("dto reference not found");
            return result;
        }

        String dtoType = CrossxBroker.getPropertyValue(dtoSymbol, "dtoType");
        if (! dtoType.equals("BusinessClassDto") ) {
            result.add("ERROR: [" + dtoSymbol.getName() + "] is not a business class dto");
            return result;
        }
        
        ReferenceSymbolProperty busclassProperty = CrossxBroker.getReferenceProperty(dtoSymbol, "BaseClass");
        Symbol busclassSymbol = CrossxBroker.lookupReference(busclassProperty);
        
        for (Symbol sub : CrossxBroker.findAllSubSymbols(busclassSymbol, "Association")) {
            result.add(sub.getName());
        }
        return result;
    }

    static public List<String> getPartProposals(EObject ctx) {
        List<String> result = new ArrayList<String>();
        DtoReference dto = null;
        AssociationMethod method = null;
        if (ctx == null) {
            result.add("No code completion on null context");
            return result;
        }
        if (ctx instanceof AssociationMethod) {
            method = ((AssociationMethod) ctx);
            dto = method.getMain();
        }
        if (dto == null) {
            result.add("No code completion possible because of earlier errors");
             return result;
        }
        
        Symbol dtoSymbol = CrossxBroker.lookupSymbol(dto.getModelname(), dto.getName(), "Dto");
        
        if (dtoSymbol == null ) {
            result.add("dto reference not found");
            return result;
        }

        String dtoType = CrossxBroker.getPropertyValue(dtoSymbol, "dtoType");
        if (! dtoType.equals("BusinessClassDto") ) {
            result.add("ERROR: [" + dtoSymbol.getName() + "] is not a business class dto");
            return result;
        }
        
        ReferenceSymbolProperty busclassProperty = CrossxBroker.getReferenceProperty(dtoSymbol, "BaseClass");
        Symbol busclassSymbol = CrossxBroker.lookupReference(busclassProperty);
        
        Symbol associationSymbol = CrossxBroker.getSubSymbol(busclassSymbol, method.getRolename());
        String requiredBusinessClass = CrossxBroker.getPropertyValue(associationSymbol, "BusinessClass");
        
        List<DtoReference> availableDtos = method.getModel().getDtoReferences();
        
        for (DtoReference ref: availableDtos ) {
            Symbol refSymbol = CrossxBroker.lookupSymbol(ref.getModelname(), ref.getName(), "Dto");
            String refDtoType = CrossxBroker.getPropertyValue(refSymbol, "dtoType");
            if ( refDtoType .equals("BusinessClassDto") ) {
                busclassProperty = CrossxBroker.getReferenceProperty(refSymbol, "BaseClass");
                if( busclassProperty.getSymbolname().equals(requiredBusinessClass)){
                    result.add(ref.getName());
                }
            }
        }
        return result;
    }
    


//    List[Proposal] allBusinessClassDtos(emf::EObject ctx, String prefix) :
//    	ctx.allVisibleElements().typeSelect(ServiceDsl::DtoReference).
//    	select(dtoRef | lookupSymbol(dtoRef.modelname, dtoRef.name, "Dto").getPropertyValue("dtoType") == "BusinessClassDto" ) .
//    	collect(x|newProposal(x.name));
//    
    static public List<String> allBusinessClassDtos(ServiceModel model ){
    	List<String> result = new ArrayList<String>();
    	
    	for (DtoReference dtoRef : model.getDtoReferences()) {
			Symbol sym = CrossxBroker.lookupSymbol(dtoRef.getModelname(), dtoRef.getName(), "Dto");
			if( sym != null ) {
				if( CrossxBroker.getPropertyValue(sym, "dtoType").equals("BusinessClassDto") ){
					result.add(dtoRef.getName());
				}
			}
		}
    	return result;
    }

}
