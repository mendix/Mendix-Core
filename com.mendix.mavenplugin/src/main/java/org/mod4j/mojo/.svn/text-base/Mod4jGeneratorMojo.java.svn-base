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
package org.mod4j.mojo;

import java.util.LinkedHashSet;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;
import org.mod4j.dslcommon.io.DirectoryWalker;
import org.mod4j.dslcommon.openarchitectureware.CodegenDirectoryVisitor;
import org.mod4j.dslcommon.openarchitectureware.CrossxDirectoryVisitor;
import org.mod4j.dslcommon.openarchitectureware.DslExtension;
import org.mod4j.dslcommon.openarchitectureware.Mod4jWorkflowException;
import org.mod4j.dslcommon.openarchitectureware.OutletDirectoryCleaner;

/**
 * The Mod4j Maven plug-in is used for generating artifacts out of Mod4j model projects. <br/>
 * 
 * @goal generateFromModel
 * @description Executes the process for generating artifacts out of Mod4j DSL model projects.
 */
public class Mod4jGeneratorMojo extends AbstractMojo {

    /**
     * The current Maven project we are working with.
     * 
     * @parameter expression="${project}"
     * @required
     */
    private MavenProject project;

    /**
     * The model dir to process.
     * 
     * @parameter default-value="src/model"
     */
    private final String modelDir = "src/model";
    
    /**
     * The filename of the generator property file within the modelDir. 
     * 
     * @parameter default-value="mod4j.properties"
     */
    private final String generatorPropertiesFileName = "mod4j.properties";

    /**
     * The list (fifo) with known DSL extensions to process.
     * 
     * @parameter
     */
    private LinkedHashSet<DslExtension> dslExtensions = new LinkedHashSet<DslExtension>();

    /**
     * Indicator for default generation processing.
     * 
     * @parameter default-value=true
     */
    private boolean defaultGeneration;

    /*
     * (non-Javadoc).
     * 
     * @see org.apache.maven.plugin.AbstractMojo#execute()
     */
    public void execute() throws MojoExecutionException, MojoFailureException {

        getLog().info("Executing Mod4J Maven plug-in, goal: genrateFromModel");

        
        if (defaultGeneration) {
            addDefaultDslExtensions();
        }
        
        String dir = project.getBasedir().getAbsolutePath();

        // Run the outlet directory cleaner to clean previously generated sources. 
        OutletDirectoryCleaner directoryCleaner = new OutletDirectoryCleaner();
        try {
            directoryCleaner.clean(dir, dir + "/" + modelDir + "/" + generatorPropertiesFileName);
        } catch (Mod4jWorkflowException mwfe) {
            throw new MojoFailureException("ERROR while cleaning outlet directories :" + mwfe.getMessage());
        }
        
        for (DslExtension dslExt : dslExtensions) {

            try {
                getLog().info("Processing DSL : " + dslExt.getDslName());
                crossxDslModel(dir, dslExt);
            } catch (Mod4jWorkflowException we) {
                throw new MojoFailureException("Workflow ERROR while processing the " + dslExt.getDslName() + " at:"
                        + dir);
            } catch (Exception e) {
                throw new MojoFailureException("ERROR while processing " + dslExt.getDslName() + " :" + e.getMessage());
            }
        }

        for (DslExtension dslExt : dslExtensions) {

            try {
                getLog().info("Processing DSL : " + dslExt.getDslName());
                processDslModel(dir, dslExt);
            } catch (Mod4jWorkflowException we) {
                throw new MojoFailureException("Workflow ERROR while processing the " + dslExt.getDslName() + " at:"
                        + dir);
            } catch (Exception e) {
                throw new MojoFailureException("ERROR while processing " + dslExt.getDslName() + " :" + e.getMessage());
            }
        }
    }

    /**
     * Add all default extensions to the dslExtension list. The default extensions are: <br>
     * 1- BusinesDomainDsl (Mod4j) <br>
     * 2- DataContractDsl (Mod4j) <br>
     * 3- ServiceDsl (Mod4j) <br>
     */
    private void addDefaultDslExtensions() {

        dslExtensions.add(new DslExtension("Mod4j", "BusinessDomainDsl",
                "BusinessDomainDsl.BusinessDomainDslPackage", ".busmod",
                "crossx/busmod2crossx.oaw",
                "codegen/BusinessDomainDsl.oaw", generatorPropertiesFileName));

        dslExtensions.add(new DslExtension("Mod4j", "DataContractDsl",
                "org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage", ".dtcmod",
                "org/mod4j/dsl/datacontract/generator/workflow/dtcmod2crossx.oaw",
                "org/mod4j/dsl/datacontract/generator/workflow/DataContractDsl.oaw", generatorPropertiesFileName));

        dslExtensions.add(new DslExtension("Mod4j", "ServiceDsl",
                "org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslPackage", ".sermod", 
                "org/mod4j/dsl/service/generator/workflow/sermod2crossx.oaw",
                "org/mod4j/dsl/service/generator/workflow/ServiceDsl.oaw", generatorPropertiesFileName));
        }

    /**
     * Method for processing DslExtensions within a project. The following steps will be processed:<br> 1) Walk through
     * all Mod4j model files for the given <b>DslExtension</b> within the model project and extract reference
     * information (Crossx) from them. 
     * 
     * @param projectDir
     * @param DslExtension
     * @throws Exception
     */
    public void crossxDslModel(final String projectDir, final DslExtension dsl) throws Exception {

        DirectoryWalker walker = new DirectoryWalker();
        CrossxDirectoryVisitor vis = new CrossxDirectoryVisitor(dsl, projectDir, true);
        walker.walk(projectDir + "/" + modelDir, vis);
    }

    /**
     * Method for processing DslExtensions within a project. The following steps will be processed:<br> 
     * 2) Run all workflow files in the project, which checks consistency
     * of the models and generate the code. <br>
     * 
     * Note that the crossxDslModel operation should run first to make all the cross reference information available.
     * @param projectDir
     * @param DslExtension
     * @throws Exception
     */
    public void processDslModel(final String projectDir, final DslExtension dsl) throws Exception {

        DirectoryWalker walker = new DirectoryWalker();
        CodegenDirectoryVisitor codegen = new CodegenDirectoryVisitor(dsl, projectDir, true);
        walker.walk(projectDir + "/" + modelDir, codegen);
    }

}