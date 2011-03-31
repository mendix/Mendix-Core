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
package org.mod4j.common.generator.admin;

import java.util.ArrayList;
import java.util.List;

public class FileTrack {

    private List<GeneratedFile> generatedFiles;

    private List<GeneratedFile> extensionFiles;

    private String resource;

    private ProjectTrack project;

    public ProjectTrack getProject() {
        return project;
    }

    public void setProject(ProjectTrack project) {
        this.project = project;
    }

    public String getResource() {
        return resource;
    }

    public GeneratedFile getExtensionFile(String name){
    	String projectDir = project.getApplicationPath();
    	for (GeneratedFile gen : extensionFiles) {
			if( name.equals(projectDir + "/" + gen.getSourcePath())) {
				return gen;
			}
		}
    	return null;
    }

    /**
     * Notify the ExtensionPointtracker that 'resource'is started
     * 
     * @param resource
     */
    public FileTrack(String resource) {
        this.resource = resource;
        generatedFiles = new ArrayList<GeneratedFile>();
        extensionFiles = new ArrayList<GeneratedFile>();
    }

    public GeneratedFile generatedFile(String filename) {
    	
    	// Check whether the resource already exists
    	for(GeneratedFile ext : generatedFiles){
    		if( ext.getSourcePath().equals(filename)){
    			return ext;
    		}
    	}
    	// if not creat a new one
        GeneratedFile gen = new GeneratedFile(filename, FileType.UNKNOWN, this, false);
        generatedFiles.add(gen);
        return gen;
    }

    public GeneratedFile extensionFile(String filename) {
    	
    	// Check whether the resource already exists
    	for(GeneratedFile ext : extensionFiles){
    		if( ext.getSourcePath().equals(filename)){
    			return ext;
    		}
    	}
    	// if not creat a new one
        GeneratedFile gen = new GeneratedFile(filename, FileType.UNKNOWN, this, true);
        extensionFiles.add(gen);
        return gen;
    }

    public List<GeneratedFile> getGeneratedFiles() {
        return generatedFiles;
    }

    public List<GeneratedFile> getExtensionFiles() {
        return extensionFiles;
    }

    public void clear() {
        generatedFiles.clear();
        extensionFiles.clear();
    }
}