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

import org.mod4j.dslcommon.io.DirectoryWalker;

public class Codegen {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DslExtension dsl = new DslExtension("BusinessDomainDsl", "BusinessDomainDsl",
                "BusinessDomainDsl.BusinessDomainDslPackage", ".busmod", "crossx/busmod2crossx2.oaw",
                "codegen/BusinessDomainDsl.oaw", "businessDomain/BusinessDomainDsl.properties");

        String dir = "D:/mod4j/repository/modules/RecordShop-ExampleProject/RecordShop-dslModels";

        execute(dir, dsl);
    }

    private static String MODEL_DIR = "src/model";

    public static void execute(String projectDir, DslExtension dsl) {
        DirectoryWalker walker = new DirectoryWalker();
        CrossxDirectoryVisitor vis = new CrossxDirectoryVisitor(dsl, projectDir, false);
        try {
            walker.walk(projectDir + "/" + MODEL_DIR, vis);
            CodegenDirectoryVisitor codegen = new CodegenDirectoryVisitor(dsl, projectDir, false);
            walker.walk(projectDir + "/" + MODEL_DIR, codegen);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
