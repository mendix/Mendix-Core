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

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

/**
 * @author johan
 * 
 */
public class Mod4WorklowRunnerTest {

    private String wfFile;

    private Map<String, String> properties = new HashMap<String, String>();

    private static final String TESTDIR = "target/mod4j-tests";

    @Before
    public void createTestDir() {
        new File(TESTDIR).mkdirs();
    }

    /**
     * Test method for
     * {@link org.mod4j.dslcommon.openarchitectureware.Mod4jWorkflowRunner#runWorkflow(java.lang.String, java.util.Map)}
     * .
     */
    @Test
    public final void testRunWorkflowCleanerSuccessful() {

        Mod4jWorkflowRunner workflowRunner = new Mod4jWorkflowRunner();
        File testFile = new File(TESTDIR + "/dummyFile.txt");
        properties.put("directories", TESTDIR);
        wfFile = "org/mod4j/dslcommon/workflow/DirectoryClean.oaw";

        try {
            if (testFile.exists() || testFile.createNewFile()) {
                workflowRunner.runWorkflow(wfFile, properties);
            }
            assertFalse("dummyFile expected to be cleaned [" + testFile.getAbsolutePath() + "]", testFile.exists());

        } catch (Mod4jWorkflowException e) {
            e.printStackTrace();
            fail("A Mod4jWorkflowException was thrown. Expected to run successful.");
        } catch (IOException e) {
            e.printStackTrace();
            fail("Cannot ceate test file in the system temporal directory");
        }
    }

    /**
     * Test method for
     * {@link org.mod4j.dslcommon.openarchitectureware.Mod4jWorkflowRunner#runWorkflow(java.lang.String, java.util.Map)}
     * . When the workflow fails it should throw a exception.
     */
    @Test
    public final void testRunWorkflowCleanerFail() {

        Mod4jWorkflowRunner workflowRunner = new Mod4jWorkflowRunner();
        wfFile = "src/test/resources/TestWorkflowCleaner.oaw";

        try {
            workflowRunner.runWorkflow(wfFile, properties);
            fail("A Mod4jWorkflowException was expected to be thrown.");
        } catch (Mod4jWorkflowException e) {
            // Ok this is what we expected to happen.
            assertTrue("Caught a Mod4jWorkflowException", e.getMessage().startsWith(
                    "ERROR(S) detected while running workflow"));
        }
    }
}