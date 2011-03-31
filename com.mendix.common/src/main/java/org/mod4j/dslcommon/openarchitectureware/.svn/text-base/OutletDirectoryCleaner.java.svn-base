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

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mod4j.dslcommon.generator.helpers.ModelHelpers;
import org.mod4j.dslcommon.io.Files;

public class OutletDirectoryCleaner {

	org.eclipse.emf.mwe.utils.DirectoryCleaner s;
    private final Log logger = LogFactory.getLog(getClass());

    private static final String DIRCLEAN_WORKFLOW_FILE = "org/mod4j/dslcommon/workflow/DirectoryClean.oaw";

    /**
     * Clean ouput directories containing generated sources and resources.
     * 
     * @param workDir
     *            The absolute pathname of the workDir
     * @param propertiesFilePath
     *            The absolute pathname of the properties file
     * @throws Mod4jWorkflowException
     */
    public void clean(String workDir, String propertiesFilePath) throws Mod4jWorkflowException {

        Map<String, String> properties = initializeWorkflowProperties(workDir, propertiesFilePath);
        String wfFile = Files.findFile(DIRCLEAN_WORKFLOW_FILE);
        wfFile = DIRCLEAN_WORKFLOW_FILE;

        logger.info("Cleaning outlet directories.");
        new Mod4jWorkflowRunner().runWorkflow(wfFile, properties);
    }

    protected String directories = null;
    
    protected Map<String, String> initializeWorkflowProperties(String workDir, String propertiesFilePath) {

        Map<String, String> result = ModelHelpers.getProperties(propertiesFilePath);

        String applicationPath = result.get("applicationPath");
        String businessdomainModuleName = result.get("businessdomainModuleName");
        String serviceModuleName = result.get("serviceModuleName");
        String presentationModuleName = result.get("presentationModuleName");
        String srcGenPath = result.get("srcGenPath");
        String resourceGenPath = result.get("resourceGenPath");
        String srcManPath = result.get("srcManPath");
        String resourceManPath = result.get("srcManPath");
        String overwriteExtensionpoints = result.get("overwriteExtensionpoints");
        
        // Get the relative applicationPath property and make it absolute
        String absAppPath = workDir + "/" + applicationPath;

        directories = 
            absAppPath + "/" + businessdomainModuleName + "/" + srcGenPath + ", " + 
            absAppPath + "/" + businessdomainModuleName + "/" + resourceGenPath + ", " +
            absAppPath + "/" + serviceModuleName + "/" + srcGenPath + ", " + 
            absAppPath + "/" + serviceModuleName + "/" + resourceGenPath + ", " +
            absAppPath + "/" + presentationModuleName + "/" + srcGenPath + ", " + 
            absAppPath + "/" + presentationModuleName + "/" + resourceGenPath;

        if ((overwriteExtensionpoints != null) && overwriteExtensionpoints.equals("true")) {
            logger.info("cleaning extension points");
            directories = directories + ", " + 
            absAppPath + "/" + businessdomainModuleName + "/" + srcManPath + ", " + 
            absAppPath + "/" + businessdomainModuleName + "/" + resourceManPath + ", " + 
            absAppPath + "/" + serviceModuleName + "/" + srcManPath + ", " + 
            absAppPath + "/" + serviceModuleName + "/" + resourceManPath + ", " +
            absAppPath + "/" + presentationModuleName + "/" + srcManPath + ", " + 
            absAppPath + "/" + presentationModuleName + "/" + resourceManPath;
        }
        result.put("directories", directories);
        return result;
    }

	public String getDirectories() {
		return directories;
	}

	public void setDirectories(String directories) {
		this.directories = directories;
	}

}
