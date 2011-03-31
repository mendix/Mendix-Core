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
package org.mendix.eclipse.crossx.views;

import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.jdom.Element;
import org.mendix.crossx.broker.CrossxLocation;
import org.mendix.crossx.mm.crossx.LiteralSymbolProperty;
import org.mendix.crossx.mm.crossx.ModelInfo;
import org.mendix.crossx.mm.crossx.ReferenceSymbolProperty;
import org.mendix.crossx.mm.crossx.Symbol;
import org.mendix.crossx.mm.crossx.SymbolProperty;

/**
 * JDomContentProvider :
 */
public class CrossxContentProvider implements ITreeContentProvider {

    public Object[] getChildren(Object element) {
        if (element instanceof Map) {
            Map<String, CrossxLocation> env = (Map<String, CrossxLocation>) element;
            if (env.isEmpty()) {
                return new Object[0];
            } else {
                return env.values().toArray(); // Set<CossxLocation>
            }
        } else if (element instanceof CrossxLocation) {
            CrossxLocation loc = (CrossxLocation) element;
            List<ModelInfo> info = loc.getAll();
            if (info.isEmpty()) {
                return new Object[0];
            } else {
                return info.toArray(); // Set<ModelInfo>
            }
        } else if (element instanceof ModelInfo) {
            ModelInfo info = (ModelInfo) element;
            if (info.getSymbols().isEmpty()) {
                return new Object[0];
            } else {
                return info.getSymbols().toArray(); // Set<Symbol>
            }
        } else if (element instanceof Symbol) {
            Symbol sym = (Symbol) element;
            List<SymbolProperty> properties = sym.getProperties();
            List<Symbol> subsymbols = sym.getSubSymbols();

            if (subsymbols.isEmpty()) {
                if (properties.isEmpty()) {
                    return new Object[0];
                } else {
                    return properties.toArray(); // Set<CossxLocation>
                }
            } else {
                return subsymbols.toArray(); // Set<CossxLocation>
            }

        } else if (element instanceof LiteralSymbolProperty) {
            return new Object[0];
        } else if (element instanceof ReferenceSymbolProperty) {
            return new Object[0];
        }
        return new Object[0];
    }

    public Object[] getElements(Object element) {
        return getChildren(element);
    }

    public boolean hasChildren(Object element) {
        return getChildren(element).length > 0;
    }

    public Object getParent(Object element) {
        return null;
    }

    public void dispose() {
    }

    public void inputChanged(Viewer viewer, Object old_input, Object new_input) {
        viewer.refresh();
    }
}
