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
package org.mendix.eclipse.util;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE.SharedImages;

/**
 * UiHelper : a class that contains a number of static methods that are of use to the other classes that implement the
 * user interface.
 */
public class UiHelper {
    public static Image javaFileImg = PlatformUI.getWorkbench().getSharedImages().getImage(
            org.eclipse.jdt.ui.ISharedImages.IMG_OBJS_CFILE);

    public static Image folderImg = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);

    public static Image fileImg = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FILE);

    public static Image projectImg = PlatformUI.getWorkbench().getSharedImages().getImage(SharedImages.IMG_OBJ_PROJECT);

    public static Image xmlFileImage = UiHelper.getImageFromString("XMLFile.gif");

    public static Image xmlFileGenImage = UiHelper.getImageFromString("XMLFile_gen.gif");

    public static Image javaFileImage = UiHelper.getImageFromString("jcu_obj.gif");

    public static Image javaFileGenImage = UiHelper.getImageFromString("jcu_obj_gen.gif");

    public static Image mendixImage = UiHelper.getImageFromString("mendix.ico");

    public static Image mendixLogoImage = UiHelper.getImageFromString("mendix-logo.png");

    public static Image mendixBusinessImage = UiHelper.getImageFromString("mendix-business.ico");

    public static Image mendixServiceImage = UiHelper.getImageFromString("mendix-service.ico");

    public static Image mendixDataContractImage = UiHelper.getImageFromString("mendix-datacontract.ico");

    public static Image mendixPresentationImage = UiHelper.getImageFromString("mendix-presentation.ico");

    /**
     * Constructor: is not needed because all methods are static
     */
    private UiHelper() {
        super();
    }

    /**
     * Returns the internal model that is created from the files in <code>project</code>. If the project has not yet
     * been build, the model is not yet created. In that case a full build is triggered.
     * 
     * @param project
     * @return the internal model in the form of an IPackage object
     */
    // static public IPackage getModelFrom(IProject project, IProgressMonitor monitor) {
    // if (monitor == null) {
    // monitor = new NullProgressMonitor();
    // monitor.beginTask("Retrieving model from project", 1);
    // }
    // IPackage model = null;
    // try {
    // model = (IPackage) project.getSessionProperty(OctopusPluginConstants.OCTOPUS_MODEL);
    // if (monitor.isCanceled()) return null;
    // if (model == null || model.getSubpackages().isEmpty()) { // model has not yet been build
    // monitor.subTask(": reading model from file");
    // // to avoid a full build 'touch' the model folder
    // String modelLocation = project.getPersistentProperty(OctopusPluginConstants.OCTOPUS_MODEL_LOCATION);
    // IFolder modelFolder = project.getFolder(modelLocation);
    // modelFolder.touch(monitor);
    // // do an incremental build
    // project.build(IncrementalProjectBuilder.INCREMENTAL_BUILD, monitor);
    // model = (IPackage) project.getSessionProperty(OctopusPluginConstants.OCTOPUS_MODEL);
    // monitor.worked(1);
    // }
    // } catch (CoreException e) {
    // showMessage("Could not obtain model from project " + project.getName());
    // }
    // return model;
    // }
    /**
     * @param name
     *            the name of the icon file
     * @return an Image
     */
    static public Image getImageFromString(String name) {
        String iconPath = "icons/";
        IPath path = EclipseUtil.getPath("org.mendix.eclipse", iconPath + name);
        URL url = EclipseUtil.getURL("org.mendix.eclipse", iconPath + name);

        ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL(url);
        Image image = imageDescriptor.createImage();
        return image;
    }

    static public void setColors(Composite parent, TreeViewer viewer) {
        Color back = parent.getDisplay().getSystemColor(SWT.COLOR_INFO_BACKGROUND);
        Color front = parent.getDisplay().getSystemColor(SWT.COLOR_DARK_BLUE);
        viewer.getTree().setBackground(back);
        viewer.getTree().setForeground(front);
    }

    /**
     * @return the current instance of the model view as known to the Eclipse workbench.
     */
    // static public ModelViewer getModelView() {
    // ModelViewer modelView = null;
    // IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
    // if (window != null) {
    // IWorkbenchPage page = window.getActivePage();
    // if (page != null) {
    // modelView = (ModelViewer) page.findView(OctopusPluginConstants.OCTOPUS_MODELVIEWER_ID);
    // }
    // }
    // return modelView;
    // }
    /**
     * This method not only returns the AST view, but opens it as well.
     * 
     * @return the current instance of the AST view as known to the Eclipse workbench.
     */
    // static public ASTViewer showASTView() {
    // ASTViewer astView = null;
    // IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
    // if (window != null) {
    // IWorkbenchPage page = window.getActivePage();
    // if (page != null) {
    // try {
    // astView = (ASTViewer) page.showView(OctopusPluginConstants.OCTOPUS_ASTVIEWER_ID);
    // } catch (PartInitException e) {
    // OctopusPlugin.getDefault().logError("UiHelper", e);
    // }
    // }
    // }
    // return astView;
    // }
    public static Shell getShell() {
        Shell shell = null;
        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        if (window != null) {
            shell = window.getShell();
        }
        return shell;
    }

    static public IProject findSelectedProject(IStructuredSelection currentSelection) {
        IResource selResource = null;
        IProject selProject = null;
        if (currentSelection == null) {
            EclipseUtil.showWarning("No project selected.");
            return null;
        }
        if (currentSelection.getFirstElement() instanceof IFile) {
            selResource = (IResource) currentSelection.getFirstElement();
            selProject = selResource.getProject();
        } else if (currentSelection.getFirstElement() instanceof IFolder) {
            selResource = (IResource) currentSelection.getFirstElement();
            selProject = selResource.getProject();
        } else if (currentSelection.getFirstElement() instanceof IProject) {
            selProject = (IProject) currentSelection.getFirstElement();
            // now try the Java variants
        } else if (currentSelection.getFirstElement() instanceof ICompilationUnit) {
            selProject = ((ICompilationUnit) currentSelection.getFirstElement()).getJavaProject().getProject();
        } else if (currentSelection.getFirstElement() instanceof IPackageFragment) {
            selProject = ((IPackageFragment) currentSelection.getFirstElement()).getJavaProject().getProject();
        } else if (currentSelection.getFirstElement() instanceof IJavaProject) {
            selProject = ((IJavaProject) currentSelection.getFirstElement()).getProject();
        } else {
            EclipseUtil.showWarning("Cannot find selected project.");
            return null;
        }
        // try {
        if (selProject != null && !selProject.isOpen()) {
            EclipseUtil.showWarning("Project '" + selProject.getName() + "' is not open.");
            selProject = null;
        }
        // if (selProject != null && !selProject.hasNature(OctopusPluginConstants.OCTOPUS_NATURE_ID)){
        // EclipseUtil.showWarning("Project '" + selProject.getName() + "' does not have an Octopus Nature.");
        // selProject = null;
        // }
        // } catch (CoreException e) {
        // EclipseUtil.showError("UiHelper" + e);
        // }
        return selProject;
    }

    /**
     * @param project
     * @param path
     * @param includeProj
     *            If true then the name of the project is the first segment in the resulting IPath, if false the name of
     *            the project is not included in the result.
     * @return
     */
    static public IPath getprojectRelativePath(IProject project, IPath path, boolean includeProj) {
        IPath result = (IPath) path.clone();
        if (project.getLocation().isPrefixOf(result)) {
            int count = project.getLocation().segmentCount();
            if (includeProj)
                count = count - 1;
            result = result.removeFirstSegments(count);
            result = result.setDevice(null);
            result = result.makeAbsolute();
        }
        return result;
    }

    /**
     * Creates all folders in 'newLoc' that do not already exist within 'project'.
     * 
     * @param project
     * @param newLoc
     * @param monitor
     * @throws CoreException
     */
    static public void createParentDir(IProject project, IPath newLoc, IProgressMonitor monitor) throws CoreException {
        IPath parent = newLoc.removeLastSegments(1);
        IFolder folder = project.getFolder(parent.removeFirstSegments(1));
        if (!folder.exists()) {
            createParentDir(project, parent, monitor);
            folder.create(true, true, monitor);
        }
    }

}
