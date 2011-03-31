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

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.mendix.crossx.mm.crossx.ModelInfo;
import org.mendix.crossx.mm.crossx.Symbol;

/**
 * This class is a singleton with static members only.
 * It keeps all CrossX information for DSL models
 * 
 * @author Jos Warmer
 * 
 */
public class CrossxEnvironment {

    private static final Logger logger = Logger.getLogger(CrossxEnvironment.class.getName());

    static private boolean started = false;

    /**
     * Private constructor, this class has static nethods only.
     */
    private CrossxEnvironment() {

    }

    /**
     * Has the environment been started yet?
     * 
     * @return
     */
    public static boolean isStarted() {
        return started;
    }

    public static void setStarted(boolean started) {
        CrossxEnvironment.started = started;
    }

    /**
     * A CrossxEnvoironment consists of a number of CrossxLocations, kept in the variable.
     */
    static private Map<String, CrossxLocation> environment = new HashMap<String, CrossxLocation>();

    /**
     * A collection of all locations in this environment.
     * This is intended to be used for e.g. displaying a tree of all CrossX information.
     * @return
     */
    public static Map<String, CrossxLocation> getAll() {
        return Collections.unmodifiableMap(environment);
    }

    /**
     * Add 'modelinfo' to the location named 'location' in the current environment
     * 
     * @param location
     *            the name of the location to add to
     * @param modelinfo
     *            the ModelInfo to add
     */
    public static void addModelInfo(String location, ModelInfo modelinfo) {
//        print("CrossxEnvironment::AddModelInfo [" + location + "] [" + modelinfo.getModelname() + "]");
        CrossxLocation atLocation = findLocation(location);
        atLocation.addModelInfo(modelinfo);
    }

    /**
     * Remove'modelinfo' to the location named 'location' in the current environment
     * 
     * @param location
     *            the name of the location to add to
     * @param modelinfo
     *            the ModelInfo to add
     */
    public static void removeModelInfo(String location, String resource) {
        print("CrossxEnvironment::RemoveModelInfo [" + location + "] [" + resource + "]");
        CrossxLocation atLocation = findLocation(location);
        atLocation.removeModelInfo(resource);
    }

    /**
     * Find the CrossxLocation named 'location' or create a new one if it does not exist.
     * 
     * @param location
     * @return
     */
    private static CrossxLocation findLocation(String location) {
        CrossxLocation result = environment.get(location);
        if (result == null) {
            result = new CrossxLocation(location);
            if (pr != null) {
                result.setPrintWriter(pr);
            }
            environment.put(location, result);
        }
        return result;
    }

    /**
     * Lookup a symbol in a model of a certain type
     * 
     * @param model
     *            The model in which to look for the symbol
     * @param symbolname
     *            The name of the symbol to find
     * @param elemType
     *            The type of the symbol to find
     * @return the symbol found, or null if no such symbol could be found
     */
    static public Symbol lookupSymbol(String model, String symbolname, String elemType) {
        if (environment == null) {
            System.err.println("CrossxEnvironment::find environment = null");
        }
        if (environment.isEmpty() ) {
            System.err.println("CrossxEnvironment::find environment isEmpty()");
        }
        for (CrossxLocation location : environment.values()) {
            Symbol result = location.lookup(model, symbolname, elemType);
            if (result != null) {
                return result;
            }
        }
        return null;
    }

    /**
     * Find all symbols of type 'elemType'.
     * 
     * @param elemType
     * @return The list of names (String) of all found symbols. If there is no such symbol, an empty list.
     */
    static public List<Symbol> findAllSymbols(String projectLocation, String elemType) {
        CrossxLocation loc = environment.get(projectLocation);
        if (loc != null) {
            return loc.findAllSymbols(elemType);
        } else {
            return new ArrayList<Symbol>();
        }
    }

    /**
     * Find all symbols of type 'elemType' in model named 'modelname' in all locations.
     * 
     * @param elemType
     * @return The list of names (String) of all found symbols. If there is no such symbol, an empty list.
     */
    static public List<Symbol> findAllFromModel(String modelname, String elemType) {
        logger.info("CrossxEnvironment::findAllFromModel [" + modelname + "::" + elemType + "]");
        List<Symbol> result = new ArrayList<Symbol>();
        for (CrossxLocation location : environment.values()) {
            result.addAll(location.findAllFromModel(modelname, elemType));
        }
        logger.info("CrossxEnvironment::findAllFromModel result [" + result + "]");
        return result;
    }

    /**
     * Find all symbols of type 'elemType' in model named 'modelname' in project named 'project'.
     * 
     * @param project
     * @param modelname
     * @param elemType
     * @return
     */
    static public List<Symbol> findAllSymbolsFromModelInProject(String project, String modelname, String elemType) {
        logger.info("CrossxEnvironment::findAllSymbolsFromModelInProject [" + modelname + "]");
        List<Symbol> result = new ArrayList<Symbol>();
        for (CrossxLocation location : environment.values()) {
            if (location.getName().equals(project)) {
                result.addAll(location.findAllSymbolsFromModel(modelname, elemType));
            }
        }
        return result;
    }

    /**
     * Find all models in the current environment.
     * 
     * @return a list of names of all of the models
     */
    public static List<ModelInfo> findAllModels() {
        List<ModelInfo> result = new ArrayList<ModelInfo>();
        for (CrossxLocation location : environment.values()) {
            for (ModelInfo info : location.getAll()) {
                logger.info("FindAll Models model [" + info.getModelname() + "]");
                result.add(info);
            }
        }
        return result;
    }

    /**
     * Find all models in project named 'project'
     * 
     * @param project
     * @return a list of names of the models
     */
    public static List<ModelInfo> findAllModelsInProject(String project) {
        List<ModelInfo> result = new ArrayList<ModelInfo>();
        for (CrossxLocation location : environment.values()) {
            if (location.getName().equals(project)) {
                for (ModelInfo info : location.getAll()) {
                    logger.info("FindAll Models model [" + info.getModelname() + "]");
                    result.add(info);
                }
            }
        }
        return result;
    }

    /**
     * Find all symbols of type 'elemType' in all models in the environment
     * 
     * @param symbolType
     * @return a list of names of all symbols found
     */
    static public List<Symbol> findAllEverywhere(String symbolType) {
        List<Symbol> result = new ArrayList<Symbol>();
        for (CrossxLocation location : environment.values()) {
            result.addAll(location.findAll(symbolType));
        }
        return result;
    }

    static private PrintWriter pr = null;

    /**
     * sets the error stream to 's;'
     * 
     * @param s
     */
    static public void setPrintStream(OutputStream s) {
        pr = new PrintWriter(s);
        for (CrossxLocation loc : environment.values()) {
            loc.setPrintWriter(pr);
        }
    }

    /**
     * Print to the error output or the given printstream
     * 
     * @param text
     */
    private static void print(String text) {
        if (pr == null) {
            System.err.println(text);
        } else {
            pr.println(text);
            pr.flush();
        }
    }
}
