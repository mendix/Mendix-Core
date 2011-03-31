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

import java.net.URL;

public class Files {

    /**
     * Try to find a file on the CLASSPATH
     * 
     * @param filename
     *            The file to find, relatrive path to the CLASSPATH
     * @return If found, the URL of the file, otherwise null
     */
    public static String findFile(String filename) {
        Files f = new Files();
        return f.getDir(filename);
    }

    /**
     * Try to find a file on the CLASSPATH
     * 
     * @param filename
     *            The file to find
     * @return If found, the URL of the file, otherwise null
     */
    public String getDir(String filename) {
        ClassLoader cls = this.getClass().getClassLoader();
        URL url = cls.getResource(filename);
        if (url == null) {
            System.err.println("File [" + filename + "] not found");
            return null;
        }
        filename = url.toString();
        return filename;
    }
}
