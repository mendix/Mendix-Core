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
package org.mendix.crossx.broker;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.mendix.crossx.mm.crossx.LiteralSymbolProperty;
import org.mendix.crossx.mm.crossx.ModelInfo;
import org.mendix.crossx.mm.crossx.ReferenceSymbolProperty;
import org.mendix.crossx.mm.crossx.Symbol;
import org.mendix.crossx.mm.crossx.SymbolProperty;

/**
 * This class contains all operations that are needed in the oAW xTend, xPand and Checks files.
 * Therefore all methods need to be static.
 * 
 * @author jwa11799
 * 
 */
public class CrossxBroker {

    private static final Logger logger = Logger.getLogger(CrossxBroker.class.getName());
    
    /**
     * Private constructor, this class contains static members only.
     */
    private CrossxBroker() {
    }
    
    public static Symbol lookupReference(ReferenceSymbolProperty ref){
        if( ref == null ) return null;
        return lookupSymbol(ref.getModelname(), ref.getSymbolname(), ref.getType());
    }

    /**
     * Lookup a symbol in a model of a certain type
     * 
     * @param model
     *            The model in which to look for the symbol
     * @param symbolname
     *            The name of the symbol to find
     * @param symbolType
     *            The type of the symbol to find
     * @return the symbol found, or null if no such symbol could be found
     */
    public static Symbol lookupSymbol(String model, String symbolname, String symbolType) {
        return CrossxEnvironment.lookupSymbol(model, symbolname, symbolType);
    }

    /**
     * Find all symbol names with type 'symbolType' within models named 'modelname'
     * 
     * @param modelname
     * @param symbolType
     * @return
     */
    public static List<Symbol> findAllFromModel(String modelname, String symbolType) {
        return CrossxEnvironment.findAllFromModel(modelname, symbolType);
    }

    /**
     * Find all symbol names with type in 'symbolTypes' within models named 'modelname'
     * 
     * @param modelname
     * @param symbolTypes
     * @return
     */
    public static List<Symbol> findAllFromModel(String modelname, List<String> symbolTypes) {
    	List<Symbol> result = new ArrayList<Symbol>();
    	for (String symbolType : symbolTypes) {
    		result.addAll(CrossxEnvironment.findAllFromModel(modelname, symbolType));
    	}
        return result;
    }

    /**
     * Find all symbols with type in 'symbolTypes' within models named 'modelname' with name 'symbolName'
     * 
     * @param modelname
     * @param symbolName
     * @param symbolTypes
     * @return
     */
    public static List<Symbol> findAllFromModel(String modelname, String symbolName, List<String> symbolTypes) {
        List<Symbol> result = new ArrayList<Symbol>();
        for (String symbolType : symbolTypes) {
            Symbol symbol = CrossxEnvironment.lookupSymbol(modelname, symbolName, symbolType);
            if (symbol != null) {
                result.add(symbol);
            }
        }
        return result;
    }
    
    /**
     * Find all symbol names with type 'symbolType' within models named 'modelname' and within the project named 'project'
     * 
     * @param project
     * @param modelname
     * @param symbolType
     * @return
     */
    public static List<Symbol> findAllSymbolsFromModel(String project, String modelname, String symbolType) {
        return CrossxEnvironment.findAllSymbolsFromModelInProject(project, modelname, symbolType);
    }

    /**
     * Find all models within the workspace
     * 
     * @return
     */

    public static List<ModelInfo> findAllModels() {
        return CrossxEnvironment.findAllModels();
    }

    public static List<ModelInfo> findAllModels(List<String> types) {
        List<ModelInfo> all = CrossxEnvironment.findAllModels();
        List<ModelInfo> filtered = new ArrayList<ModelInfo>();
        for (ModelInfo modelInfo : all) {
            if (types.contains(modelInfo.getDslname())) {
                filtered.add(modelInfo);
            }
        }
        return filtered;
    }
    
    /**
     * Find all models within project with name 'project'
     * 
     * @param project
     * @return
     */
    public static List<ModelInfo> findAllModelsInProject(String project) {
        return CrossxEnvironment.findAllModelsInProject(project);
    }

    /**
     * Find all models within project with name 'project'
     * 
     * @param project
     * @return
     */
    public static List<ModelInfo> findAllModelsInProject(String project, List<String> types) {
        System.out.println("findAllModelsInProject[" + project + "]");
        List<ModelInfo> all = CrossxEnvironment.findAllModelsInProject(project);
        List<ModelInfo> result = new ArrayList<ModelInfo>();
        for (ModelInfo modelInfo : all) {
            if( types.contains( modelInfo.getDslname()) ) {
                System.out.println("add [" + modelInfo.getModelname()+ "]");
                result.add(modelInfo);
            } else {
                System.out.println("NOT add [" + modelInfo.getModelname()+ "]");
            }
        }
        return result;
    }

    /**
      */
    public static Symbol lookupSymbolWithProperty(String model, String symbolname, String type, String propertyName,
            String propertyValue) {
        Symbol symbol = CrossxEnvironment.lookupSymbol(model, symbolname, type);
        if (hasProperty(symbol, propertyName, propertyValue)) {
            return symbol;
        }
        return null;
    }

    public static Symbol lookupSymbolWithSubsymbol(String model, String symbolname, String symboltype,
            String subsymbolType, String subsymbolName) {
        Symbol symbol = CrossxEnvironment.lookupSymbol(model, symbolname, symboltype);
        if (symbol == null) {
            return null;
        }
        for (Symbol subsym : symbol.getSubSymbols()) {
            if (subsym.getType().equals(subsymbolType) && subsym.getName().equals(subsymbolName)) {
                return symbol;
            }
        }
        return null;
    }

    /**
     * @param classname
     * @return Returns true of a BusinessClass with the name path exists in any model in the workspace
     */
    public static boolean hasProperty(Symbol symbol, String propertyName, String propertyValue) {
        for (SymbolProperty property : symbol.getProperties()) {
            if (property instanceof LiteralSymbolProperty) {
                LiteralSymbolProperty l = (LiteralSymbolProperty) property;
                if (l.getName().equals(propertyName) && l.getValue().equals(propertyValue))
                    return true;
            }
        }
        return false;
    }

    /**
     *  Get the value of the property name 'propertyname' or null if no such property exists.
     *  Only returns values of literal symbol properties, not of regference properties.
     * @param symbol        The symbolf for which the property is looked up
     * @param propertyName  The name of the property too find
     * @return
     */
    static public String getPropertyValue(Symbol symbol, String propertyName) {
        if( ( symbol == null) || (propertyName == null) ) { return null; }

        for (SymbolProperty prop : symbol.getProperties()) {
            if (prop.getName().equals(propertyName)) {
                if (prop instanceof LiteralSymbolProperty) {
                    return ((LiteralSymbolProperty) prop).getValue();
                }
            }
        }
        return null;
    }

    /**
     *  Get the property named 'propertyname' or null if no such property exists
     * @param symbol        The symbol for which the property is looked up
     * @param propertyName  The name of the property too find
     * @return
     */
    static public SymbolProperty getProperty(Symbol symbol, String propertyName) {
        if( ( symbol == null) || (propertyName == null) ) { return null; }
        
        for (SymbolProperty prop : symbol.getProperties()) {
            if (prop.getName().equals(propertyName)) {
                return prop;
            }
        }
        return null;
    }

    /**
     *  Get the property named 'propertyname' or null if no such property exists
     * @param symbol        The symbol for which the property is looked up
     * @param propertyName  The name of the property too find
     * @return
     */
    static public ReferenceSymbolProperty getReferenceProperty(Symbol symbol, String propertyName) {
        SymbolProperty prop = getProperty(symbol, propertyName);
        if( prop !=  null ){
            if (prop instanceof ReferenceSymbolProperty) {
                return ((ReferenceSymbolProperty) prop);
            }
        }
        return null;
    }

    /**
     *  Get the property named 'propertyname' or null if no such property exists
     * @param symbol        The symbol for which the property is looked up
     * @param propertyName  The name of the property too find
     * @return
     */
    static public LiteralSymbolProperty getLiteralProperty(Symbol symbol, String propertyName) {
        SymbolProperty prop = getProperty(symbol, propertyName);
        if( prop !=  null ){
            if (prop instanceof LiteralSymbolProperty) {
                return ((LiteralSymbolProperty) prop);
            }
        }
        return null;
    }

    static public Symbol getSubSymbol(Symbol mainSymbol, String symbolName) {
       if( ( mainSymbol == null) || (symbolName == null) ) { return null; }
        
        for (Symbol sub : mainSymbol.getSubSymbols() ) {
            if (sub.getName().equals(symbolName)) {
                return sub;
            }
        }
        return null;
    }

    /**
     * Find all subsymbols of 'symbol' that have the type 'symbolType'
     * @param symbol
     * @param symbolType
     * @return
     */
    static public List<Symbol> findAllSubSymbols(Symbol symbol, String symbolType) {
        List<Symbol> result = new ArrayList<Symbol>();
        if( (symbol == null)  || (symbolType == null)){ return result; }
        
        for (Symbol sub : symbol.getSubSymbols()) {
            if (sub.getType().equals(symbolType)) {
                result.add(sub);
            }
        }
        return result;
    }

    
    /**
     * Find all symbols of type 'symboltype' in project 'project'
     * 
     * @param project
     * @param symboltype
     * @return
     */
    public static List<Symbol>  findAllSymbols(String project, String symboltype) {
        List<Symbol> result = new ArrayList<Symbol>(); 
        List<Symbol> tmp = CrossxEnvironment.findAllSymbols(project, symboltype);
        if (tmp != null) {
            logger.info("CrossxCheck ["+ project + "] findAllSymbols " + symboltype + " [" + tmp.toString() + "]");
            result.addAll(tmp);
        } else {
            logger.info("CrossxCheck ["+ project + "] findAllSymbols " + symboltype + " returns null");
        }
        return result;
    }
}