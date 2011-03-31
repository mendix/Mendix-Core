/*******************************************************************************
 * Copyright (c) 2008 Ordina and committers to Mod4j
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ordina - initial implementation
 *******************************************************************************/
package org.mendix.eclipse.builder;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.console.MessageConsoleStream;
import org.mendix.crossx.broker.CrossxEnvironment;
import org.mendix.crossx.mm.crossx.ModelInfo;
import org.mendix.dslcommon.openarchitectureware.DslExtension;
import org.mendix.eclipse.crossx.views.CrossxView;
import org.mendix.eclipse.util.EclipseUtil;

/**
 * This class contains two builders, one to build the crossx symbols from a DSL model, one to generate the code from a
 * model
 * 
 * @author jwa11799
 * 
 */
public class CrossxBuilderOLD extends IncrementalProjectBuilder {

    private MessageConsoleStream console = null;

    protected static List<DslExtension> dslExtensions = null;

    public static final String BUILDER_ID = "org.mendix.eclipse.Mod4jBuilder";

    public static final String bundleName = "org.mendix.eclipse";

    public static final String CROSSX_EXTENSION = ".crossx";

    public static final String MODEL_DIR = "src/model";

    public static final String DSL_EXTENSION_ID = CrossxBuilderOLD.bundleName + ".dsl";

//    public static void initCrossx() {
//        if (!CrossxEnvironment.isStarted()) {
//            CrossxBuilder b = new CrossxBuilder();
//            b.startX();
//            CrossxEnvironment.setStarted(true);
//        }
//    }

    /**
     * Visitor that reads all .crossx files to get already defined symbols
     * 
     * @author Jos Warmer
     * 
     */
    class CrossxFindSymbolsResourceVisitor implements IResourceVisitor {
        public boolean visit(IResource resource) {
            checkSymbols(resource);
            // return true to continue visiting children.
            return true;
        }
    }

    /**
     * If this is a .crossx resource, adds the contents to the CrossxBroker
     * 
     * @param resource
     *            The resource to check
     */
    private void checkSymbols(IResource resource) {
        if (resource instanceof IFile && resource.getName().endsWith(CROSSX_EXTENSION)) {
            if (!inModelDir(resource)) {
                return;
            }
            ModelInfo crossxInfo = readCrossx(resource);
            CrossxEnvironment.addModelInfo(resource.getProject().getName(), crossxInfo);

        }
    }

    public ModelInfo readCrossx(IResource resource) {
        // Create a resource set.
        ResourceSet resourceSet = new ResourceSetImpl();

        // Register the default resource factory -- only needed for stand-alone!
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

        // Register the package -- only needed for stand-alone!
        // CrossxPackage crossxPackage = CrossxPackage.eINSTANCE;

        // Get the URI of the model file.
        URI fileURI = URI.createFileURI(resource.getLocation().toPortableString());

        // Demand load the resource for this file.
        Resource emfResource = resourceSet.getResource(fileURI, true);
        EList<EObject> tmp = emfResource.getContents();
        if (!tmp.isEmpty()) {
            EObject first = tmp.get(0);
            return (ModelInfo) first;
        }
        return null;

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.core.internal.events.InternalBuilder#build(int, java.util.Map,
     * org.eclipse.core.runtime.IProgressMonitor)
     */
    protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {
        return null;
    }

//    public void startX() {
//        console = EclipseUtil.findConsole("crossx.projectbuilder.startX");
//        CrossxEnvironment.setPrintStream(EclipseUtil.findConsole("crossx.repository.startX"));
//        System.setErr(new PrintStream(console));
//        dslExtensions = CrossxBuilder.getExtensions();
//        IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
//        for (int i = 0; i < projects.length; i++) {
//            IProject project = projects[i];
//            myProject = project;
//            myloadCrossxInfo(project);
//        }
//        CrossxView.myrefresh();
//    }

    public IProject getMyProject() {
        return myProject;
    }

    IProject myProject = null;

    /**
     * Load the Crossx symbols from all crossx files in the project.
     * 
     */
    private void myloadCrossxInfo(IProject project) {
        // Make sure the project is open and has the Mod4j nature.
        try {
            if ((!project.isAccessible()) || (!project.hasNature(Mod4jNature.NATURE_ID)) || (!project.isOpen())) {
                return;
            }
        } catch (CoreException e1) {
            System.err.println("CrossxBuilder ERROR requesting nature [" + e1.getMessage() + "]");
            e1.printStackTrace();
        }
        // Run the visitor over the project to collect all Crossx information
        CrossxFindSymbolsResourceVisitor visitor = new CrossxFindSymbolsResourceVisitor();
        try {
            project.accept(visitor);
        } catch (Exception e) {
            System.err.println("CrossxBuilder ERROR loadCrossxInfo [" + e.getMessage() + "]");
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    /**
     * Check whether a resource is inside a model directory
     * 
     * @param resource
     *            The resource to check
     * @return True if resource is inside a model directory, false otherwise.
     */
    protected boolean inModelDir(IResource resource) {
        IPath resourcePath = resource.getProjectRelativePath();
        IProject project = getMyProject();
        if (project == null) {
            return false;
        }
        IResource projectResource = project.findMember(MODEL_DIR);
        if (projectResource == null) {
            return false;
        }
        IPath modelPath = projectResource.getProjectRelativePath();
        if (modelPath == null) {
            return false;
        }
        return modelPath.isPrefixOf(resourcePath);
    }

    public static List<DslExtension> getExtensions() {
        List<DslExtension> result = new ArrayList<DslExtension>();

        IExtensionRegistry reg = Platform.getExtensionRegistry();
        IConfigurationElement[] extensions = reg.getConfigurationElementsFor(DSL_EXTENSION_ID);
        for (int i = 0; i < extensions.length; i++) {
            IConfigurationElement element = extensions[i];
            String name = element.getAttribute("dslName");
            String metamodelPackage = element.getAttribute("dslMetamodelPackage");
            String fileExtension = element.getAttribute("dslFileExtension");
            String crossxWorkflow = element.getAttribute("dsl2crossxWorkflow");
            String contributor = element.getContributor().getName();

            String codegenWorkflow = element.getAttribute("dslCodegenWorkflow");
            String codegenProperties = element.getAttribute("dslCodegenProperties");

            System.err.println("DSL [" + name + "] CONTRIBUTED BY [" + contributor + "]");

            DslExtension dsl = new DslExtension(contributor, name, metamodelPackage, fileExtension, crossxWorkflow,
                    codegenWorkflow, codegenProperties);
            if (dsl.validate()) {
                result.add(dsl);
            } else {
                EclipseUtil.showError("Crossx: crossx extension point [is invalid");
            }
        }
        return result;
    }

}
