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
package org.mendix.dsl.service.generator.helpers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.mendix.crossx.broker.CrossxBroker;
import org.mendix.crossx.mm.crossx.ReferenceSymbolProperty;
import org.mendix.crossx.mm.crossx.Symbol;


public class ServiceUtil {

//    static public String javaClassName(String className){
//        return className;
//    }
//
//    static public String javaBaseClassName(String className){
//        return javaClassName(className) + ProjectProperties.IMPLBASE_SUFFIX;
//    }

    /**
     * Get the BusinessClassDto that are is referenced by roleRerference
     * @param roleReference
     * @return
     */
    static public String getReferredDtoName(Symbol roleReference) {
        ReferenceSymbolProperty referredDto = CrossxBroker.getReferenceProperty(roleReference, "ReferencedDto") ; 
        Symbol referredDtoSymbol = CrossxBroker.lookupSymbol(referredDto.getModelname(),
                                                             referredDto.getSymbolname(), "Dto") ;

        if( CrossxBroker.getPropertyValue(referredDtoSymbol, "dtoType").equals("ListDto") ) {
            return CrossxBroker.getPropertyValue(referredDtoSymbol, "baseDto");
        } else {
            // dtoType must be BusinessClassDto
            return referredDtoSymbol.getName();
        }
    }

    /**
     * Get the BusinessClassDto that are is referenced by roleRerference
     * @param roleReference
     * @return
     */
    static public String getReferredBusinessClassName(Symbol roleReference) {
        ReferenceSymbolProperty referredDto = CrossxBroker.getReferenceProperty(roleReference, "ReferencedDto") ; 
        Symbol referredDtoSymbol = CrossxBroker.lookupSymbol(referredDto.getModelname(),
                                                             referredDto.getSymbolname(), "Dto") ;

//        if( CrossxBroker.getPropertyValue(referredDtoSymbol, "dtoType").equals("ListDto") ) {
//            
//            ReferenceSymbolProperty ref = CrossxBroker.getReferenceProperty(referredDtoSymbol, "BaseDto");
//            Symbol dto = CrossxBroker.lookupReference(ref);
//            return CrossxBroker.getPropertyValue(dto, "businessClass");
//        } else {
            // dtoType must be BusinessClassDto
            return CrossxBroker.getPropertyValue(referredDtoSymbol, "businessClass");
//        }
    }

    static public Collection<Symbol> makeUnique(Collection<Symbol> symbols) {
        List<Symbol> result = new ArrayList<Symbol>();
        
        List<String> names = new ArrayList<String>();
        for (Symbol symbol : symbols) {
            if( !names.contains(symbol.getName() )){
                names.add(symbol.getName() );
                result.add(symbol);
            }
        }
        return result;
    }

 }
