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
public class DirectoryWalker {

    public DirectoryWalker() {
        super();
    }

    public void walk(String directoryPath, IDirectoryVisitor visitor) throws Exception {
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            walk(directory, visitor);
        }
    }

    public void walk(File directory, IDirectoryVisitor visitor) throws Exception {
        assert directory.exists() : "visitDirectoryBefore: directory does not exists.";
        assert directory.isDirectory() : "visitDirectoryBefore: parameter is not a directory.";
        visitor.visitDirectoryBefore(directory);
        File[] contents = directory.listFiles();
        if (contents != null) {
            for (int i = 0; i < contents.length; i++) {
                if (contents[i].isFile()) {
                    visitor.visitFile(contents[i]);
                } else if (contents[i].isDirectory()) {
                    walk(contents[i], visitor);
                }
            }
        }
        visitor.visitDirectoryAfter(directory);
    }

}
