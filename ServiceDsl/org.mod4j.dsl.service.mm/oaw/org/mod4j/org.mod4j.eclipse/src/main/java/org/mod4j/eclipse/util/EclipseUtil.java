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

import java.io.File;
import java.net.URL;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.internal.filesystem.local.LocalFile;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.eclipse.ui.ide.IDE;
import org.osgi.framework.Bundle;

public class EclipseUtil {

    /**
     * Return a java.io.File correcponsing to a resource
     * 
     * @param resource
     *            The resource
     * @return
     */
    static public File toFile(IResource resource) {
        if ((resource == null) || (!(resource instanceof IFile))) {
            return null;
        }
        IFile file = (IFile) resource;
        IPath p = file.getRawLocation();
        File f = p.toFile();
        return f;
    }

    /**
     * Get the full local pathname corresponding to a resource.
     * 
     * @param resource
     * @return
     */
    static public String resource2UriString(IResource resource) {
//        System.err.println(resource.getLocationURI().toString());
        return resource.getLocationURI().toString();
    }

    /**
     * Get the full local pathname corresponding to a resource.
     * 
     * @param resource
     * @return
     */
    static public String resource2FullPathnameString(IResource resource) {
        return resource.getLocation().toString();
    }

    static public void printResource(IFile file) {
        System.err.println("resource getFullPath() [" + file.getFullPath() + "]");
        System.err.println("resource getLocation().toString [" + file.getLocation().toString() + "]");
        System.err.println("resource getLocationPortable() [" + file.getLocation().toPortableString() + "]");
        System.err.println("resource getLocationURI() [" + file.getLocationURI() + "]");
        System.err.println("resource getRawLocation() [" + file.getRawLocation() + "]");
        System.err.println("resource getRawLocationURI()[" + file.getRawLocationURI() + "]");
        System.err.println("resource getWorkspace()[" + file.getWorkspace() + "]");
        System.err.println("resource getProjectRelativePath()  [" + file.getProjectRelativePath() + "]");
        System.err.println("resource getProject() [" + file.getProject() + "]");
    }

    /**
     * return the Ipath for a resource named 'pathname'in bundle 'bundlename'.
     * 
     * @param bundlename
     * @param pathname
     *            path, relative to the bundle root.
     * @return
     */
    static public IPath getPath(String bundlename, String pathname) {
        String myPathname = null;
        if (Platform.inDevelopmentMode() && (!bundlename.equals("org.mendix.eclipse"))) {
            myPathname = "src/main/oaw/" + pathname;
        } else {
            myPathname = pathname;
        }
//        System.err.println("EclipseUtil.getPath(" + bundlename + ", " + myPathname + ")");
        IPath result = null;
        try {
//            System.err.println("dev mode : " + Platform.inDevelopmentMode());

            URL installURL = Platform.getBundle(bundlename).getEntry("/" + myPathname);
//            System.err.println("installURL [" + installURL.toString() + "]");

            URL fromLocation = FileLocator.toFileURL(installURL);
//            System.err.println("fromLocation [" + fromLocation.toString() + "]");

            result = new Path(fromLocation.getPath());
        } catch (Exception e) {
            System.err.println("EclipseUtils.getPath [" + e.getMessage() + "]");
            e.printStackTrace(System.err);
            return null;
        }
        return result;
    }

    static public URL getURL(String bundlename, String pathname) {
        String myPathname = null;
        if (Platform.inDevelopmentMode() && (!bundlename.equals("org.mendix.eclipse"))) {
            myPathname = "src/main/oaw/" + pathname;
        } else {
            myPathname = pathname;
        }
//        System.err.println("EclipseUtil.getURL(" + bundlename + ", " + myPathname + ")");
        IPath result = null;
        URL installURL = null;
        try {
//            System.err.println("dev mode : " + Platform.inDevelopmentMode());

            installURL = Platform.getBundle(bundlename).getEntry("/" + myPathname);
//            System.err.println("installURL [" + installURL.toString() + "]");

            URL fromLocation = FileLocator.toFileURL(installURL);
//            System.err.println("fromLocation [" + fromLocation.toString() + "]");

            result = new Path(fromLocation.getPath());
        } catch (Exception e) {
            System.err.println("EclipseUtils.getPath [" + e.getMessage() + "]");
            e.printStackTrace(System.err);
            return null;
        }
        return installURL;
    }

    /**
     * Log an error to the Log connected with the plugin 'bundleName'
     * 
     * @param className
     * @param exception
     */
    static public void logError(String bundlename, String className, Exception exception) {
        Bundle bundle = Platform.getBundle(bundlename);
        Platform.getLog(bundle).log(
                new Status(IStatus.ERROR, bundle.getSymbolicName(), IStatus.ERROR, "Error detected in class: "
                        + className, exception));
        showError("Fatal error occurred (" + exception.getMessage() + "), see Error Log.");
    }

    /**
     * Displays a message dialog with message <code>mess</code>. It synchronizes the execution of the message dialog
     * with the current display, in order to prevent thread errors.
     * 
     * @param mess
     */
    static public void showError(String mess) {
        final String myMessage = mess;
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                MessageDialog.openError(null, "Mod4j message", myMessage);
            }
        });
    }

    /**
     * Displays a message dialog with message <code>mess</code>. It synchronizes the execution of the message dialog
     * with the current display, in order to prevent thread errors.
     * 
     * @param mess
     */
    static public void showInformation(String mess) {
        final String myMessage = mess;
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                MessageDialog.openInformation(null, "Mod4j message", myMessage);
            }
        });
    }

    /**
     * Displays a message dialog with message <code>mess</code>. It synchronizes the execution of the message dialog
     * with the current display, in order to prevent thread errors.
     * 
     * @param mess
     */
    static public void showWarning(String mess) {
        final String myMessage = mess;
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                MessageDialog.openWarning(null, "Mod4j message", myMessage);
            }
        });
    }

    /**
     * Show a question in a modal dialog box and return the user's answer.
     * 
     * @param title
     *            Text for the title bar of the dialog window
     * @param message
     *            The text of the message
     * @return true if users selects ok, false if he selected Cancel
     */
    static public boolean showQuestion(String title, String message) {
        boolean goThrough;
        // accept the default window icon
        // TODO error in SWT cannot find WARNING icon
        final MessageDialog dialog = new MessageDialog(null, title, null, message, MessageDialog.NONE, new String[] {
                IDialogConstants.OK_LABEL, IDialogConstants.CANCEL_LABEL }, 0);
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                dialog.open();
            }
        });
        if (dialog.getReturnCode() == Window.OK) {
            goThrough = true;
        } else {
            goThrough = false;
        }
        return goThrough;
    }

    /**
     * Find the OutputStream connected with the Eclipse Console View. If no console is found a new one will be created.
     * 
     * @param name
     * @return
     */
    static public MessageConsoleStream findConsole(String name) {
        ConsolePlugin plugin = ConsolePlugin.getDefault();
        IConsoleManager conMan = plugin.getConsoleManager();
        IConsole[] existing = conMan.getConsoles();
        MessageConsole myConsole = null;
        for (int i = 0; i < existing.length; i++) {
            if (name.equals(existing[i].getName())) {
                myConsole = (MessageConsole) existing[i];
            }
        }
        if (myConsole == null) {
            myConsole = new MessageConsole(name, null);
        }
        conMan.addConsoles(new IConsole[] { myConsole });

        MessageConsoleStream out = myConsole.newMessageStream();
        out.println("Opening console " + name + " ...");

        return out;
    }

    static public String getProjectName(EObject eObject) {
        IResource resource = toEclipseResource(eObject);
        return resource.getProject().getName();
    }

    static public IResource toEclipseResource(EObject eObject) {
        IResource result = null;
        Resource eResource = eObject.eResource();
        URI eUri = eResource.getURI();
        if (eUri.isPlatformResource()) {
            String platformString = eUri.toPlatformString(true);
            result = ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
        }
        return result;
    }

    /**
     * Open the default EWcliopse editor on the file named 'filename' Code from Eclipse Wiki:
     * http://wiki.eclipse.org/FAQ_How_do_I_open_an_editor_programmatically%3F
     * 
     * @param filename
     */
    public static void openFile(String filename) {

    	// take care of precdeing  stuff
    	if( filename.startsWith("file:/") ){
    		filename = filename.substring(6);
    	}
        File fileToOpen = new File(filename);

        IPath path = new Path(filename);
        // IFile f = ResourcesPlugin.getWorkspace().getRoot().getFile(path);

        // Check whether the file is insiode the workspace
        IFile ifile = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(path);
        if (ifile == null) {
            EclipseUtil.showWarning("Can only open files inside the Eclipse workspace\n" + "File [" + filename
                    + "] is not in the workspace");
            return;
        }

        if (fileToOpen.exists() && fileToOpen.isFile()) {
            // IFileStore fileStore = EFS.getLocalFileSystem().getStore(fileToOpen.toURI());
            IFileStore fileStore = EFS.getLocalFileSystem().fromLocalFile(fileToOpen);
            IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

            try {
                // TODO: the following lines open a file outside Eclipse.
                // But I have no way of finding out whether a files i insoide an eclipse project
                // FileStoreEditorInput input = new FileStoreEditorInput(fileStore);
                // IEditorDescriptor desc = IDE.getEditorDescriptor(f);
                // IDE.openEditor(page, input, desc.getId());
                IDE.openEditorOnFileStore(page, fileStore);
            } catch (PartInitException e) {
                EclipseUtil.showWarning("openFile exception [" + e.getMessage() + "]");
            } catch (Exception e) {
                EclipseUtil.showWarning("openFile exception [" + e.getMessage() + "] [" + e.toString() + "]");
            }
        } else {
            EclipseUtil.showWarning("Cannot find file [" + filename + "]");
        }
    }

}
