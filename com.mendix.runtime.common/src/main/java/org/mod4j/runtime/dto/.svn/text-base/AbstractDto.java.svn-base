/**
 * Copyright (c) 2009 Ordina and committers to Mod4j
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Ordina - initial implementation
 */
package org.mod4j.runtime.dto;

import java.io.Serializable;

/**
 * Abstract base class for all Data Transfer Objects (DTO's), containing features that all DTO's have, like id and
 * version properties.
 * 
 * @author Eric Jan Malotaux
 */
@SuppressWarnings("serial")
public class AbstractDto implements Serializable {

    /**
     * id: The identifier of this object.
     */
    private final Long id;

    /**
     * version: The version of this object.
     */
    private final Integer version;

    /**
     * The default no-argument constructor.
     */
    public AbstractDto() {
        this.id = null;
        this.version = null;
    }

    /**
     * Constructor for use by the DTO Translator.
     * 
     * @param id
     *            The ID of the referenced business object.
     * @param version
     *            The version of the referenced business object.
     */
    public AbstractDto(final Long id, final Integer version) {
        this.id = id;
        this.version = version;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the version
     */
    public Integer getVersion() {
        return version;
    }

}
