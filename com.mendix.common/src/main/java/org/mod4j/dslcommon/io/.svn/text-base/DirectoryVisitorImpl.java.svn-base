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
package org.mod4j.dslcommon.io;

import java.io.File;

/**
 * @author anneke
 * 
 */
public class DirectoryVisitorImpl implements IDirectoryVisitor {

    /*
     * (non-Javadoc)
     * 
     * @see org.mod4j.dslcommon.io.IDirectoryVisitor#visitDirectoryBefore(java.io.File)
     */
    public Object visitDirectoryBefore(File directory) {
        // assert directory.exists() : "visitDirectoryBefore: directory does not exists.";
        // assert directory.isDirectory() : "visitDirectoryBefore: parameter is not a directory.";
        System.out.println("visited " + directory.getPath());
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.mod4j.dslcommon.io.IDirectoryVisitor#visitDirectoryAfter(java.io.File)
     */
    public Object visitDirectoryAfter(File directory) {
        // assert directory.exists() : "visitDirectoryAfter: directory does not exists.";
        // assert directory.isDirectory() : "visitDirectoryAfter: parameter is not a directory.";
        System.out.println("visited " + directory.getPath());
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.mod4j.dslcommon.io.IDirectoryVisitor#visitFile(java.io.File)
     */
    public Object visitFile(File file) {
        // assert file.exists() : "visitFile: file does not exists.";
        // assert file.isFile() : "visitFile: parameter is not a file.";
        System.out.println("visited " + file.getPath());
        return null;
    }

}
