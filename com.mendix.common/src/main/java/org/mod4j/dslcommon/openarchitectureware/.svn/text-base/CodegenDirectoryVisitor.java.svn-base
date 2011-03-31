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

import java.io.File;
import java.net.URL;
import java.util.Map;

import org.mod4j.common.generator.admin.Mod4jTracker;
import org.mod4j.dslcommon.generator.helpers.ModelHelpers;
import org.mod4j.dslcommon.generator.helpers.StringHelpers;
import org.mod4j.dslcommon.io.IDirectoryVisitor;

/**
 * @author jos
 */
public class CodegenDirectoryVisitor implements IDirectoryVisitor {

    private static final String MODEL_DIR = "src/model";

    private DslExtension dsl = null;

    private String workDir = "";

    private String propertiesFile = null;

    private String codegenWorkflow = null;

    private Map<String, String> properties = null;

    private boolean standaloneSetup;

    /**
     * @param dsl
     * @param theWorkDir
     * @param standaloneSetup
     */
    public CodegenDirectoryVisitor(DslExtension dsl, String theWorkDir, boolean standaloneSetup) {
        this.dsl = dsl;
        this.workDir = theWorkDir;
        this.standaloneSetup = standaloneSetup;
        Mod4jTracker.getFileTracker().initResource(theWorkDir);
        setupDsl();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.mod4j.dslcommon.io.IDirectoryVisitor#visitDirectoryBefore(java.io.File)
     */
    public Object visitDirectoryBefore(File directory) {
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.mod4j.dslcommon.io.IDirectoryVisitor#visitDirectoryAfter(java.io.File)
     */
    public Object visitDirectoryAfter(File directory) {
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.mod4j.dslcommon.io.IDirectoryVisitor#visitFile(java.io.File)
     */
    public Object visitFile(File file) throws Mod4jWorkflowException {
        if (file.isFile() && file.getName().endsWith(dsl.getDslFileExtension())) {
            generateCode(file);
        }
        return null;
    }

    /**
     * 
     */
    private void setupDsl() {

        propertiesFile = workDir + "/" + MODEL_DIR + "/" + dsl.getDslCodegenProperties();
        File file = new File(propertiesFile);
        if (!file.exists()) {
            System.err.println("Mod4j: code generation properties file [" + propertiesFile
                    + "] not found, cannot generate code for dsl " + dsl.getDslName() + ".");
            System.exit(1);
        }

        codegenWorkflow = dsl.getDslCodegenWorkflow();
        ClassLoader cls = this.getClass().getClassLoader();
        URL url = cls.getResource(codegenWorkflow);
        if (url == null) {
            System.err.println("Code generation oaW file [" + codegenWorkflow + "] not found");
            System.exit(1);
        }
        codegenWorkflow = url.toString();

        properties = ModelHelpers.getProperties(propertiesFile);

        propertiesFile = StringHelpers.replaceAllSubstrings(propertiesFile, "\\", "/");

        properties.put("appPropFilePath", propertiesFile);

        // Get the relative applicationPath property and make it absolute
        String applicationPath = properties.get("applicationPath");
        String newAppPath = workDir + "/" + applicationPath;
        properties.put("applicationPath", newAppPath);
        properties.put("workDir", workDir);
        properties.put("project", workDir);
    }

    /**
     * @param file
     * @throws Mod4jWorkflowException
     */
    private void generateCode(final File file) throws Mod4jWorkflowException {
        String modelfile = file.getAbsolutePath();
        modelfile = StringHelpers.replaceAllSubstrings(modelfile, "\\", "/");
        modelfile = "file:/" + modelfile;

        properties.put("modelFile", modelfile);
        properties.put("isStandaloneSetup", standaloneSetup ? "true" : "false");
        properties.put("isEclipseSetup", standaloneSetup ? "false" : "true");
        
        Mod4jWorkflowRunner genWf = new Mod4jWorkflowRunner();
        genWf.runWorkflow(codegenWorkflow, properties);
    }

    public DslExtension isDslFile(String filename) {
        // TODO NEed a way to find the DslExtension info outside eclipse
        return null;
    }

}
