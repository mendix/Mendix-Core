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
package org.mendix.eclipse.builder;

public class Mod4jEclipseWorkflowException extends Exception {

    /**
     * Serializable need
     */
    private static final long serialVersionUID = 1286074961964414319L;

    private String message;

    public Mod4jEclipseWorkflowException(String string) {
        setMessage(string);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
