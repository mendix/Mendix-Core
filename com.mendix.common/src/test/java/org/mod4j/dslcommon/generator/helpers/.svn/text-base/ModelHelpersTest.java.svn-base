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

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ModelHelpersTest {

    @Test
    public void fileExistTest() {
        assertTrue("Empty path does not exist. ", !ModelHelpers.fileExist(""));
        assertTrue("HereIam.java does exist.", ModelHelpers.fileExist("src/test/resources/HereIam.java"));
    }

}
