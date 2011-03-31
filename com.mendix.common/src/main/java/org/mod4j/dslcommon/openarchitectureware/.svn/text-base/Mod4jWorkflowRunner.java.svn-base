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
package org.mod4j.dslcommon.openarchitectureware;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
//import org.eclipse.emf.mwe.core.resources.CachingResourceLoaderImpl;
//import org.eclipse.emf.mwe.core.resources.OsgiResourceLoader;
//import org.eclipse.emf.mwe.core.resources.ResourceLoader;
//import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
//import org.mod4j.common.generator.admin.FileTrack;
/**
 * @author johan
 * 
 */
public class Mod4jWorkflowRunner {

    private final Log logger = LogFactory.getLog(getClass());

    /**
     * General Mod4j workflow runner. 
     * 
     * @param wfFile
     *            absolute path string of the workflow file to execute
     * @param properties
     *            Map containing the properties for <code>wfFile</code>.
     * @throws Mod4jWorkflowException
     */
    public void runWorkflow(final String wfFile, final Map<String, String> properties) throws Mod4jWorkflowException {


        Map<String, Object> slotContents = new HashMap<String, Object>();
        WorkflowRunner runner = new WorkflowRunner();

        String propertiesListing = "";
        for (Map.Entry<String, String> prop: properties.entrySet()) {
            propertiesListing += "\t\t" + prop.toString() + "\n";
        } 

        logger.info("Running workflow [" + wfFile + "] with properties : \n" + propertiesListing); 

        Date date = new Date(System.currentTimeMillis());
//        System.err.println("03 ================== " + date.toString() + ": workflow [" + wfFile + "]");
//        ResourceLoader loader = ResourceLoaderFactory.getCurrentThreadResourceLoader();
//        
//        System.err.println("Classloader: " + (loader == null ? "NULL" : loader.toString() ) ) ;
//        if( loader == null ){
//              CachingResourceLoaderImpl crl = new CachingResourceLoaderImpl(
//                      new OsgiResourceLoader("org.mod4j.common", FileTrack.class.getClassLoader() )
//              ); 
//    
//              ResourceLoaderFactory.setCurrentThreadResourceLoader(crl);
//        }
//
//        date = new Date(System.currentTimeMillis());
        System.err.println("04 ================== " + date.toString() + ": workflow [" + wfFile + "]");
        if (!runner.run(wfFile, new NullProgressMonitor(), properties, slotContents)) {
            logger.error("--------------------------------------------------------------------------------------");
            logger.error("------- ERROR(S) detected while running workflow : [" + wfFile + "] ");
            logger.error("------- See logging above for more details.");
            logger.error("--------------------------------------------------------------------------------------");
            throw new Mod4jWorkflowException("ERROR(S) detected while running workflow :" + wfFile);
        }
        date = new Date(System.currentTimeMillis());
        System.err.println("05 ================== " + date.toString() + ": workflow [" + wfFile + "]");
        logger.info("--------------------------------------------------------------------------");
        logger.info("-------- Workflow SUCCESSFUL! ");
        logger.info("--------------------------------------------------------------------------");
    }
}
