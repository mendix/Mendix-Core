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
public class DirectoryWalkerTester {

    static public void main(String[] args) {
        File file = new File("E:\\");
        DirectoryWalker walker = new DirectoryWalker();
        DirectoryVisitorImpl visitor = new DirectoryVisitorImpl();
        try {
            walker.walk(file, visitor);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
