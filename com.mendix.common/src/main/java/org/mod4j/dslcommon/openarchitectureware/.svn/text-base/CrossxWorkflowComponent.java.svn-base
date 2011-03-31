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

import org.mod4j.crossx.broker.CrossxEnvironment;
import org.mod4j.crossx.mm.crossx.ModelInfo;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;

import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

/* 
 * Workflow component to write a Crossx model to an XML file.
 * Referenced from workflow (*.oaw) files.
 */
public class CrossxWorkflowComponent extends WorkflowComponentWithModelSlot {

    /**
     * Converts a ModelInfo into an XML structure and writes this to file.
     * 
     * Then calling MyWorkflowComponent the invoke method is called. We use it, to instance the model and apply it to a
     * modelslot, so it can be used later by the generator component.
     * 
     * @see org.openarchitectureware.workflow.WorkflowComponent#invoke(org.openarchitectureware.workflow.WorkflowContext,
     *      org.openarchitectureware.workflow.monitor.ProgressMonitor, org.openarchitectureware.workflow.issues.Issues)
     */
	@Override
    public void invokeInternal(WorkflowContext wfCxt, ProgressMonitor arg1, Issues arg2) {

        Object model = wfCxt.get(getModelSlot());

        ModelInfo modelInfo = (ModelInfo) model;

        CrossxEnvironment.addModelInfo(getProject(), modelInfo);
    }

    // Capture the value of the <outputFile> slot in the workflow
    public String outputFile;

    protected String getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(final String outlet) {
        this.outputFile = outlet;
    }

    // capture the value of the <outputFile> slot in the workflow
    public String project;

    protected String getProject() {
        return project;
    }

    public void setProject(final String theProject) {
        this.project = theProject;
    }

}
