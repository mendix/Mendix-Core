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

public class GeneratedFile {

    // public GeneratedFile(String moduleName, String sourcePath, String packagePathname, FileType type, boolean
    // extension){
    // this.sourcePath = sourcePath;
    // this.moduleName = moduleName;
    // this.packagePathname = packagePathname;
    // this.fileType = type;
    // this.extensionPoint = extension;
    // }

    public GeneratedFile(String sourcePath, FileType type, FileTrack owner, boolean extension) {
        this.owner = owner;
        this.sourcePath = sourcePath;
        this.fileType = type;
        this.extensionPoint = extension;
    }

    protected FileTrack owner;

    public FileTrack getOwner() {
        return owner;
    }

    //protected boolean changed = false; 
	protected boolean retained = false;

//	/**
//	 * @return the changed
//	 */
//	public boolean isChanged() {
//		return changed;
//	}

//	/**
//	 * @param changed the changed to set
//	 */
//	public void setChanged(boolean changed) {
//		this.changed = changed;
//	}

	/**
	 * @return the retained
	 */
	public boolean isRetained() {
		return retained;
	}

	/**
	 * @param retained the retained to set
	 */
	public void setRetained(boolean retained) {
		this.retained = retained;
	}

    
    protected String moduleName;

    protected String sourcePath;

    protected long modifiedDate ;
    
    /**
	 * @return the modifiedDate
	 */
	public long getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(long modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	// private String packagePathname;
    private boolean extensionPoint;

    protected FileType fileType = FileType.UNKNOWN;

    public FileType getFileType() {
        return fileType;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getSourcePath() {
        return sourcePath;
    }

    // public String getPackagePathname() {
    // return packagePathname;
    // }

    public boolean isExtensionPoint() {
        return extensionPoint;
    }

}
