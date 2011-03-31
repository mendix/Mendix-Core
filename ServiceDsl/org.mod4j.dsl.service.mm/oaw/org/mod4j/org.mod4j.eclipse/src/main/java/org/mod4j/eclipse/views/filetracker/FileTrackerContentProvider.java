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
package org.mendix.eclipse.views.filetracker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.mendix.common.generator.admin.FileTrack;
import org.mendix.common.generator.admin.Mod4jTracker;
import org.mendix.common.generator.admin.GeneratedFile;
import org.mendix.common.generator.admin.ProjectTrack;
import org.mendix.eclipse.builder.Mod4jBuilder;

/**
 * JDomContentProvider :
 */
public class FileTrackerContentProvider implements ITreeContentProvider {

    public Object[] getChildren(Object element) {
        if (element instanceof ProjectTrack) {
            ProjectTrack ft = (ProjectTrack) element;
            return ft.getTracks().toArray();
        } else if (element instanceof Mod4jTracker) {
            Mod4jTracker ft = (Mod4jTracker) element;
            return ft.getProjects().toArray();
        } else if (element instanceof FileTrack) {
            FileTrack f = (FileTrack) element;
            List<GeneratedFile> children = new ArrayList<GeneratedFile>();
            for (GeneratedFile file : f.getGeneratedFiles()) {
                children.add(file);
            }
            for (GeneratedFile file : f.getExtensionFiles()) {
                children.add(file);
            }
            return children.toArray();
        }
        return new Object[0];
    }

    public Object[] getElements(Object element) {
    	return getChildren(element);
//    	List<ProjectTrack> result = new ArrayList<ProjectTrack>();
//    	
//        IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
//        for (int i = 0; i < projects.length; i++) {
//            IProject project = projects[i];
//            System.err.println("FileTrackViewer project [" + project.getName() + "]");
//            ProjectTrack p = null;
//			try {
//				p = (ProjectTrack)project.getSessionProperty(Mod4jBuilder.FILETRACKER);
//			} catch (CoreException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//            result.add(p);
//        }
//    	
//        return result.toArray();
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
//        viewer.refresh();
    }
}
