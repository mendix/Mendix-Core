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
package org.mod4j.dslcommon.generator.helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public class ProjectProperties {

    public static void setPropertiesFile(String filename) {
        System.err.println("PROPERTIES [" + filename + "]");
        propertyFile = filename;
        readAllProperties();
    }

    private static void readAllProperties() {
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(propertyFile));
        } catch (FileNotFoundException e) {
            System.err.println("PropjectProperties: cannot find properties file [" + propertyFile + "]");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("PropjectProperties: cannot read properties file [" + propertyFile + "]");
            e.printStackTrace();
        }

        applicationName = properties.getProperty("applicationName");
        applicationVersion = properties.getProperty("applicationVersion");
        applicationPath = properties.getProperty("applicationPath");
        dslModelsModuleName = properties.getProperty("dslModelsModuleName");
        businessDomainModuleName = properties.getProperty("businessdomainModuleName");
        serviceModuleName = properties.getProperty("serviceModuleName");
        presentationModuleName = properties.getProperty("presentationModuleName");
        rootPackage = properties.getProperty("rootPackage");
        businessdomainRootPackage = properties.getProperty("businessdomainRootPackage");
        serviceRootPackage = properties.getProperty("serviceRootPackage");
        domainRootPackage = properties.getProperty("domainRootPackage");
        dataRootPackage = properties.getProperty("dataRootPackage");
        presentationRootPackage = properties.getProperty("presentationRootPackage");
        srcGenPath = properties.getProperty("srcGenPath");
        resourceGenPath = properties.getProperty("resourceGenPath");
        srcManPath = properties.getProperty("srcManPath");
        resourceManPath = properties.getProperty("resourceManPath");
        webAppPath = properties.getProperty("webAppPath");
        fileEncoding = properties.getProperty("fileEncoding");
        hibernate_hbm2ddl_auto = properties.getProperty("hibernate.hbm2ddl.auto");
        hibernate_mapping_class_id_generator_class = properties
                .getProperty("hibernate-mapping.class.id.generator.class");
        hibernate_mapping_inheritance_strategy = properties.getProperty("hibernate-mapping.inheritance.strategy");

    }

    private static String propertyFile = "DEFAULT";

    private static String applicationVersion = "DEFAULT";

    private static String applicationName = "DEFAULT";

    private static String applicationPath = "DEFAULT";

    private static String dslModelsModuleName = "dslModels";

    private static final String SRC_MODEL_PATH = "src/model";

    private static String serviceModuleName = "DEFAULT";

    private static String businessDomainModuleName = "DEFAULT";
    
    private static String businessdomainRootPackage = "DEFAULT";
    
    private static String presentationModuleName = "DEFAULT";

    private static String rootPackage = "DEFAULT";

    private static String serviceRootPackage = "DEFAULT";
    
    private static String presentationRootPackage = "DEFAULT";

    private static String domainRootPackage = "DEFAULT";

    private static String dataRootPackage = "DEFAULT";

    private static String srcGenPath = "DEFAULT";

    private static String resourceGenPath = "DEFAULT";

    private static String srcManPath = "DEFAULT";
    
    private static String webAppPath = "src/main/webapp";

    private static String resourceManPath = "DEFAULT";
    
    private static final String environmentPropertiesFileName = "environment.properties";

    private static String fileEncoding = "UTF-8";

    public static final String IMPLBASE_SUFFIX = "ImplBase";

    public static final String DAO_PACKAGE = "";

    public static final String DAO_IMPL_PACKAGE = ".hibernate.spring";
    
    public static final String LOCALSERVICES_PACKAGE = ".local";

    public static final String DTO_PACKAGE = ".dto";

    public static final String TRANSLATORS_PACKAGE = ".translators";

    private static String workDir = "/";

    private static String hibernate_hbm2ddl_auto = "update";

    private static String hibernate_mapping_class_id_generator_class = "native";

    private static String hibernate_mapping_inheritance_strategy = "table.per.concrete.class";
    

    public static void setWorkDir(String dir) {
        workDir = dir;
    }

    public static String getApplicationName() {
        return applicationName;
    }

    public static String getApplicationVersion() {
        return applicationVersion;
    }

    public static String getApplicationPath() {
    	if( applicationPath != null ){
	    	if( applicationPath.startsWith("..")){
	    		if( applicationPath.equals("..")) {
             		int last = workDir.lastIndexOf("/");
             		if( last == -1 ){
                 		last = workDir.lastIndexOf("\\");
             		}
	            	if( last > -1){
	            		return workDir.substring(0, last)  ;
	            	}
	    		} else {
	        		int last = workDir.lastIndexOf("/");
	        		return workDir.substring(0, last) + applicationPath.substring(2) ;
	    		}
	    	}
    	}
        return workDir + "/" + applicationPath;
    }

    public static String getDslModelsModulePath() {
        return getApplicationPath() + "/" + getDslModelsModuleName();
    }

    public static String getDslModelsModuleName() {
        return dslModelsModuleName;
    }

    public static String getBusinessDomainModulePath() {
        return getApplicationPath() + "/" + getBusinessDomainModuleName();
    }

    public static String getBusinessDomainModuleName() {
        return businessDomainModuleName;
    }
    
    public static String getPresentationModuleName(String targetPlatform) {
        return presentationModuleName ; //+ (targetPlatform != null ? "-" + targetPlatform : "");
    }

    public static String getServiceModuleName() {
        return serviceModuleName;
    }

    public static String getPresentationModulePath(String targetPlatform) {
        return getApplicationPath() + "/" + getPresentationModuleName(targetPlatform);
    }

    public static String getServiceModulePath() {
        return getApplicationPath() + "/" + getServiceModuleName();
    }

    public static String getRootPackage() {
        return rootPackage;
    }
    
    public static String getServiceRootPackage() {
        return serviceRootPackage;
    }

    public static String getServiceRootPackageAsPath() {
        return getServiceRootPackage().replaceAll("\\.", "/");
    }
    
    public static String getLocalServicePackage() {
        return serviceRootPackage + LOCALSERVICES_PACKAGE;
    }
    
    public static String getPresentationRootPackage() {
        return presentationRootPackage;
    }

    public static String getPresentationCommonPackage() {
        return "org.mod4j.common.wicket";
    }

    public static String getPresentationCommonPackageAsPath() {
        return getPresentationCommonPackage().replaceAll("\\.", "/");
    }

    public static String getPresentationRootPackageAsPath() {
        return getPresentationRootPackage().replaceAll("\\.", "/");
    }
    
    public static String getBusinessdomainRootPackageAsPath() {
        return getBusinessdomainRootPackage().replaceAll("\\.", "/");
    }
    
    public static String getBusinessdomainRootPackage() {
        return businessdomainRootPackage;
    }

    public static String getDomainRootPackage() {
        return domainRootPackage;
    }

    public static String getDomainRootPackageAsPath() {
        return getDomainRootPackage().replaceAll("\\.", "/");
    }

    public static String getDataRootPackage() {
        return dataRootPackage;
    }

    public static String getDataRootPackageAsPath() {
        return getDataRootPackage().replaceAll("\\.", "/");
    }

    public static String getDaoPackage() {
        return getDataRootPackage() + DAO_PACKAGE;
    }

    public static String getDaoPackageAsPath() {
        return getDaoPackage().replaceAll("\\.", "/");
    }

    public static String getDaoImplPackage() {
        return getDataRootPackage() + DAO_IMPL_PACKAGE;
    }

    public static String getDaoImplPackageAsPath() {
        return getDaoPackage().replaceAll("\\.", "/");
    }

    public static String getDtoPackage() {
        return getServiceRootPackage() + DTO_PACKAGE;
    }

    public static String getTranslatorsPackage() {
        return getDtoPackage() + TRANSLATORS_PACKAGE;
    }

    public static String getSrcModelPath() {
        return SRC_MODEL_PATH;
    }

    public static String getSrcGenPath() {
        return srcGenPath;
    }

    public static String getResourceGenPath() {
        return resourceGenPath;
    }

    public static String getSrcManPath() {
        return srcManPath;
    }

    public static String getResourceManPath() {
        return resourceManPath;
    }
    
    public static String getWebAppPath() {
        return webAppPath;
    }
    
    public static String getEnvPropFileName() {
        return environmentPropertiesFileName;
    }

    public static String getFileEncoding() {
        return fileEncoding;
    }

    public static String getHibernate_hbm2ddl_auto() {
        return hibernate_hbm2ddl_auto;
    }

    public static String getHibernate_mapping_class_id_generator_class() {
        return hibernate_mapping_class_id_generator_class;
    }

    public static String getHibernate_InheritanceMappingStrategy() {
        return hibernate_mapping_inheritance_strategy;
    }

    private static String project = "/";

    public static String getProject() {
        return project;
    }

    public static String getProjectForEObject(EObject object) {
        if( project.equals("/") ){ 
            URI uri = object.eResource().getURI();
            return uri.segment(1);
        } else {
            return project;
        }
    }
    
    public static void setProject(String project) {
        ProjectProperties.project = project;
    }
}
