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
import java.io.File;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;
import org.mod4j.mojo.Mod4jGeneratorMojo;

public class Mod4jGeneratorMojoTest extends AbstractMojoTestCase {
    
    protected void setUp() throws Exception {
        // Required for mojo lookups to work
        super.setUp();
    }

    /**
     * Tests the proper discovery and configuration of the mojo
     * 
     * @throws Exception
     */
    public void testMod4jGeneratorMojo() throws Exception {

        File testPom = new File(getBasedir(), "src/test/resources/testpom.xml");

        Mod4jGeneratorMojo mojo = (Mod4jGeneratorMojo) lookupMojo("generateFromModel", testPom);
        assertNotNull(mojo);
    }
}