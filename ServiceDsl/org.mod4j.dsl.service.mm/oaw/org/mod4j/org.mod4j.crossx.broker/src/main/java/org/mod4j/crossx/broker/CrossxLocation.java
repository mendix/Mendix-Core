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

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.mendix.crossx.mm.crossx.Symbol;
import org.mendix.crossx.mm.crossx.ModelInfo;

// import crossx.util.EclipseUtil;

/**
 * This class is a singleton with static members only.
 * It keeps all cross reference information for DSL models for one location
 * The location is identified with the 'name'
 * @author Jos Warmer
 * 
 */
public class CrossxLocation {

    /**
     * The list of all ModelInfo objects in this location.
     */
    private List<ModelInfo> information = new ArrayList<ModelInfo>();

    private String name;

    /**
     *  Create a new CrossxLocation for location named 'theName'
     * @param theName
     */
    public CrossxLocation(String theName) {
        this.name = theName;
    }

    /**
     * Get the name of this location
     * @return
     */
    public String getName() {
        return name;
    }

    public List<ModelInfo> getAll() {
        return Collections.unmodifiableList(information);
    }

    /**
     * Add modelinfo to this location, remove previous modelinfo is this exists from the same resource
     * 
     * @param modelinfo
     */
    public void addModelInfo(ModelInfo modelinfo) {
        ModelInfo existing = findModelInfo(modelinfo, information);
        if (existing != null) {
            information.remove(existing);
        }
        information.add(modelinfo);
    }

    public void removeModelInfo(String resource) {
        ModelInfo existing = findModelInfo(resource, information);
        if (existing != null) {
            information.remove(existing);
        }
    }

    /**
     * Find the existing ModelInfo that has the same resource as modelinfo
     * 
     * @param modelinfo
     * @param modelInfoList
     * @return
     */
    private ModelInfo findModelInfo(ModelInfo modelinfo, List<ModelInfo> modelInfoList) {
        for (ModelInfo existing : modelInfoList) {
            if (modelinfo.getResource().equals(existing.getResource())) {
                return existing;
            }
        }
        return null;
    }
    private ModelInfo findModelInfo(String resource, List<ModelInfo> modelInfoList) {
        for (ModelInfo existing : modelInfoList) {
            if (resource.equals(existing.getResource())) {
                return existing;
            }
        }
        return null;
    }

    /**
     * Find the symbol with name 'name' and type 'type'.
     * 
     * @param name
     * @param symbolType
     * @return The name of the resource if the element is found, null if it isn't found
     */
    public Symbol lookup(String model, String name, String symbolType) {
        if (information == null) {
            System.err.println("CrossxLocation::lookup information = null");
        }
        for (ModelInfo modelinfo : information) {
            if (modelinfo.getModelname().equals(model)) {
                for (Symbol symbol : modelinfo.getSymbols()) {
                    if (symbol.getName().equals(name) && symbol.getType().equals(symbolType)) {
                        return symbol;
                    }
                }
            }
        }
        return null;
    }

    /**
     * Find all names of symbols of type 'elemType'.
     * 
     * @param symbolType
     * @return The list of names (String) of all found symbols. If there is no such symbol, an empty list.
     */
    public List<Symbol> findAll(String symbolType) {
        List<Symbol> result = new ArrayList<Symbol>();
        for (ModelInfo modelinfo : information) {
            for (Symbol symbol : modelinfo.getSymbols()) {
                String value = symbol.getType();
                if ((value != null) && value.equals(symbolType)) {
                    result.add(symbol);
                }
            }
        }
        return result;
    }

    /**
     * Find all symbols of type 'symbolType'.
     * 
     * @param elemType
     * @return The list of names (String) of all found symbols. If there is no such symbol, an empty list.
     */
    public List<Symbol> findAllSymbols(String symbolType) {
        List<Symbol> result = new ArrayList<Symbol>();
        for (ModelInfo modelinfo : information) {
            for (Symbol symbol : modelinfo.getSymbols()) {
                String value = symbol.getType();
                if ((value != null) && value.equals(symbolType)) {
                    result.add(symbol);
                }
            }
        }
        return result;
    }

    /**
     * Find all symbols of type 'elemType'.
     * 
     * @param elemType
     * @return The list of names (String) of all found symbols. If there is no such symbol, an empty list.
     */
    public List<Symbol> findAllFromModel(String modelname, String elemType) {
        List<Symbol> result = new ArrayList<Symbol>();
        for (ModelInfo modelinfo : information) {
            if (modelinfo.getModelname().equals(modelname)) {
                for (Symbol symbol : modelinfo.getSymbols()) {
                    String value = symbol.getType();
                    if ((value != null) && value.equals(elemType)) {
                        result.add(symbol);
                    }
                }
            }
        }
        return result;
    }

    public List<Symbol> findAllSymbolsFromModel(String modelname, String elemType) {
        List<Symbol> result = new ArrayList<Symbol>();
        for (ModelInfo modelinfo : information) {
            if (modelinfo.getModelname().equals(modelname)) {
                for (Symbol symbol : modelinfo.getSymbols()) {
                    String value = symbol.getType();
                    if ((value != null) && value.equals(elemType)) {
                        result.add(symbol);
                    }
                }
            }
        }
        return result;
    }

    private PrintWriter pr = null;

    /**
     * Sets 'pw' as the output writer for this object.
     * Should use proper logging for this ...
     * @param pw
     */
    public void setPrintWriter(PrintWriter pw) {
        pr = pw;
    }

    /**
     * Print to the error output or the given printwriter
     * 
     * @param text
     */
    private void print(String text) {
        if (pr == null) {
            System.err.println(text);
        } else {
            pr.println(text);
            pr.flush();
        }
    }
}
