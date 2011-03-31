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

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.mendix.common.generator.admin.FileTrack;
import org.mendix.common.generator.admin.GeneratedFile;
import org.mendix.common.generator.admin.ProjectTrack;
import org.mendix.crossx.broker.CrossxEnvironment;
import org.mendix.crossx.mm.crossx.ModelInfo;
import org.mendix.eclipse.builder.Mod4jBuilder;
import org.mendix.eclipse.util.EclipseUtil;

/**
 * This defines the view of the CrosssxRepository.
 * <p>
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be presented in the view.
 * <p>
 */
public class CrossxView extends ViewPart {

    public TreeViewer viewer;

    private Object input;

    private DrillDownAdapter drillDownAdapter;

    private Action doubleClickAction;

    class NameSorter extends ViewerSorter {
    }

    public static CrossxView theView = null;

//    static int i = 1;

    /**
     * The constructor.
     */
    public CrossxView() {
        theView = this;
    }

    /**
     * This is a callback that will allow us to create the viewer and initialize it.
     */
    public void createPartControl(Composite parent) {
        viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
        drillDownAdapter = new DrillDownAdapter(viewer);
        viewer.setContentProvider(new CrossxContentProvider());
        viewer.setLabelProvider(new CrossxLabelProvider());
        viewer.setSorter(new NameSorter());
        Mod4jBuilder.initCrossx("CrossxView.createPartControl");
        input = CrossxEnvironment.getAll();
        viewer.setInput(input);
        // viewer.setInput(getViewSite());
        hookDoubleClickAction();
        viewer.refresh();
    }

    private void hookDoubleClickAction() {
        viewer.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(DoubleClickEvent event) {
                Object elem = event.getSelection();
                if (!(elem instanceof TreeSelection)) {
                    return;
                }
                TreeSelection sel = (TreeSelection) elem;
                Object selection = sel.getFirstElement();
                if (selection instanceof ModelInfo) {
                    ModelInfo ft = (ModelInfo) selection;
                    String name = ft.getResource();
                    EclipseUtil.openFile(name);
                }
            }
        });
    }

    /**
     * Passing the focus request to the viewer's control.
     */
    public void setFocus() {
        viewer.getControl().setFocus();
    }

    /**
     * Refresh the view with the latest CrossxBroker information.
     * 
     */
    public static void myrefresh() {
        if (theView == null) {
            return;
        }
        if (Display.getCurrent() != null) {
//            theView.setPartName("crossx  " + 1);
//            i++;
            theView.viewer.getContentProvider().inputChanged(theView.viewer, theView.input, CrossxEnvironment.getAll());
            theView.viewer.refresh();
        } else {
            Display.getDefault().asyncExec(new Runnable() {
                public void run() {
//                    theView.setPartName("crossx  " + 1);
//                    i++;
                    theView.viewer.getContentProvider().inputChanged(theView.viewer, theView.input,
                            CrossxEnvironment.getAll());
                    theView.viewer.refresh();
                }
            });
        }
    }

}