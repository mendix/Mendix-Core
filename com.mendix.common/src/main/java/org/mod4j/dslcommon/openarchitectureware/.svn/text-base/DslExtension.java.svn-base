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

import java.util.ArrayList;
import java.util.List;

/**
 * Keeps all information regarding extension points from other plugins
 * 
 * @author jwa11799
 * 
 */
public class DslExtension {

    private String dslContributor = null;

    private String dslName = null;

    private String dslMetamodelPackage = null;

    private String dslFileExtension = null;

    private String dsl2crossxWorkflow = null;

    private String dslXtendModule = null;

    private String dslCodegenWorkflow = null;

    private String dslCodegenProperties = null;

    /**
     * @param contributor
     * @param name
     * @param metamodelPackage
     * @param fileExtension
     * @param crossxWorkflow
     * @param codegenWorkflow
     * @param codegenProperties
     */
    public DslExtension(String contributor, String name, String metamodelPackage, String fileExtension,
            String crossxWorkflow, String codegenWorkflow, String codegenProperties) {
        dslContributor = contributor;
        dslName = name;
        dslMetamodelPackage = metamodelPackage;
        dslFileExtension = fileExtension;
        dsl2crossxWorkflow = crossxWorkflow;
        dslCodegenWorkflow = codegenWorkflow;
        dslCodegenProperties = codegenProperties;
    }

    /**
     * The name of the plugin / bundle that contributes to this extension
     */
    public String getDslContributor() {
        return dslContributor;
    }

    public String getDslName() {
        return dslName;
    }

    public String getDslMetamodelPackage() {
        return dslMetamodelPackage;
    }

    public String getDslFileExtension() {
        return dslFileExtension;
    }

    public String getDsl2crossxWorkflow() {
        return dsl2crossxWorkflow;
    }

    public String getDslCodegenWorkflow() {
        return dslCodegenWorkflow;
    }

    public String getDslCodegenProperties() {
        return dslCodegenProperties;
    }

    public static List<DslExtension> getExtensions() {
        List<DslExtension> result = new ArrayList<DslExtension>();

        return result;
    }

    public boolean validate() {
        if (getDslName() == null)
            return false;
        if (getDslName().length() == 0)
            return false;
        // if (!getDsl2crossxWorkflow().endsWith(".oaw"))
        // return false;
        if (getDslContributor() == null)
            return false;
        if (getDslFileExtension() == null)
            return false;
        if (getDslMetamodelPackage() == null)
            return false;

        return true;
    }

}
