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
package org.mendix.dsl.datacontract.xtext.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.mendix.crossx.broker.CrossxBroker;
import org.mendix.crossx.mm.crossx.Symbol;
import org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference;
import org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto;
import org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference;
import org.mendix.dsl.datacontract.mm.DataContractDsl.Dto;
import org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto;
import org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference;

public class Proposals {

    /**
     * Get a list of proposals for a BusinessClassReference for context 'ctx'
     * 
     * @param ctx
     *            The conmtext within xText for which the proposals is created
     * @return
     */
    static public List<String> getBusinessClassReferenceProposals(EObject ctx) {
        List<String> result = new ArrayList<String>();
        BusinessClassDto dto = null;
        if (ctx == null) {
            return result;
        }
        // The context may be of different types
        if (ctx instanceof BusinessClassPropertyReference) {
            dto = ((BusinessClassPropertyReference) ctx).getDto();
        }
        if ((ctx instanceof BusinessClassDto)) {
            dto = (BusinessClassDto) ctx;
        }
        if (dto == null) {
            result.add("no dto found");
            return result;
        }

        ExternalReference base = dto.getBase();

        if (base == null) {
            result.add("base is null");
            return result;
        }

        Symbol sym = CrossxBroker.lookupSymbol(base.getModelname(), base.getName(), "BusinessClass");
        for (Symbol sub : CrossxBroker.findAllSubSymbols(sym, "Property")) {
            if (!containsPropertyNamed(dto.getPropertyReferences(), sub.getName())) {
                result.add(sub.getName());
            }
        }
        return result;
    }

    static public List<String> getBusinessClassAssociationRoleReferenceProposals(EObject ctx) {
        List<String> result = new ArrayList<String>();
        BusinessClassDto dto = null;
        if (ctx == null) {
            return result;
        }
        // The context may be of different types
        if (ctx instanceof BusinessClassAssociationRoleReference) {
            dto = ((BusinessClassAssociationRoleReference) ctx).getDto();
        }
        if ((ctx instanceof BusinessClassDto)) {
            dto = (BusinessClassDto) ctx;
        }
        if (dto == null) {
            result.add("no dto found");
            return result;
        }

        ExternalReference base = dto.getBase();

        if (base == null) {
            result.add("base is null");
            return result;
        }

        Symbol sym = CrossxBroker.lookupSymbol(base.getModelname(), base.getName(), "BusinessClass");
        for (Symbol sub : CrossxBroker.findAllSubSymbols(sym, "Association")) {
            if (!containsAssociationRoleNamed(dto.getAssociationReferences(), sub.getName())) {
                result.add(sub.getName());
            }
        }
        return result;
    }

    static public List<String> getBusinessClassAssociationReferenceDtoProposals(EObject ctx) {
        List<String> result = new ArrayList<String>();
        BusinessClassDto dto = null;
        BusinessClassAssociationRoleReference assocRef = null;
        if (ctx == null) {
            result.add("ERROR: null context");
            return result;
        }
        // The context may be of different types
        if (ctx instanceof BusinessClassAssociationRoleReference) {
            assocRef = (BusinessClassAssociationRoleReference)ctx;
            dto = assocRef.getDto();
        }
        if ((ctx instanceof BusinessClassDto)) {
            dto = (BusinessClassDto) ctx;
        }
        if (dto == null) {
            result.add("no dto found");
            return result;
        }

        ExternalReference base = dto.getBase();

        if (base == null) {
            result.add("base is null");
            return result;
        }

        Symbol busclassSymbol = CrossxBroker.lookupSymbol(base.getModelname(), base.getName(), "BusinessClass");
        Symbol assocSymbol = CrossxBroker.getSubSymbol(busclassSymbol, assocRef.getName());
        String requiredName = CrossxBroker.getPropertyValue(assocSymbol, "BusinessClass");

        String multiplicity = CrossxBroker.getPropertyValue(assocSymbol, "Multiplicity");
        for (Dto availableDto : dto.getDatacontractModel().getDtos() ) {
            if ( availableDto instanceof BusinessClassDto ) {
                if( multiplicity.equals("ONE")) {
                    BusinessClassDto busDto = (BusinessClassDto)availableDto;
                    if( busDto.getBase().getName().equals(requiredName)){
                        result.add(busDto.getName());
                    }
                }
            }
        }
        return result;
    }

    /**
     * Checks whether the list 'properties' contains an element with name 'name'
     * @param properties
     * @param name
     * @return
     */
    static private boolean containsPropertyNamed(List<BusinessClassPropertyReference> properties, String name) {
        for (BusinessClassPropertyReference propertyRef : properties) {
            if (propertyRef.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    static private boolean containsAssociationRoleNamed(List<BusinessClassAssociationRoleReference> properties, String name) {
        for (BusinessClassAssociationRoleReference assRef : properties) {
            if (assRef.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    /** Get a list of proposals for the base property of a BusinessClassDto
     * 
     * @param ctx The context for the proposals
     * @return The list of names that are proposed
     */
    static public List<ExternalReference> getBusinessClassBaseProposals(EObject ctx) {
        List<ExternalReference> result = new ArrayList<ExternalReference>();
        BusinessClassDto dto = null;
        if (ctx == null) {
            return result;
        }
        if ((ctx instanceof BusinessClassDto)) {
            dto = (BusinessClassDto) ctx;
        }
        if (dto == null) {
//            result.add("no dto found");
            return result;
        }

        List<ExternalReference> refs = dto.getDatacontractModel().getExternalReferences();
        for (ExternalReference ext : refs) {
            Symbol sym = CrossxBroker.lookupSymbol(ext.getModelname(), ext.getName(), "BusinessClass");
            if (sym != null) {
                result.add(ext);
            }
        }
        return result;
    }

    /** Get a list of Proposals for the base property for an EnumerationDto
     * 
     * @param ctx The context for the proposals
     * @return The list of names that are proposed
     */
    static public List<ExternalReference> getEnumerationBaseProposals(EObject ctx) {
        List<ExternalReference> result = new ArrayList<ExternalReference>();
        EnumerationDto enumeration = null;
        if (ctx == null) {
            return result;
        }
        if ((ctx instanceof EnumerationDto)) {
            enumeration = (EnumerationDto) ctx;
        }
        if (enumeration == null) {
            return result;
        }

        List<ExternalReference> refs = enumeration.getDatacontractModel().getExternalReferences();
        for (ExternalReference ext : refs) {
            Symbol sym = CrossxBroker.lookupSymbol(ext.getModelname(), ext.getName(), "Enumeration");
            if (sym != null) {
                result.add(ext);
            }
        }
        return result;
    }
}
