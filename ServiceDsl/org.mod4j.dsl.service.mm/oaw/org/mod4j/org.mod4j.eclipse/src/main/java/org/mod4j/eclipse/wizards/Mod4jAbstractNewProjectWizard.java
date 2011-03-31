package org.mendix.eclipse.wizards;
/*******************************************************************************
 * Copyright (c) 2007 Dennis H�bner and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare
 *     2009: Ordina: adapted for Mod4j
 *******************************************************************************/

import java.lang.reflect.InvocationTargetException;
import java.net.URI;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResourceStatus;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.ide.undo.CreateProjectOperation;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.eclipse.ui.internal.ide.StatusUtil;
import org.eclipse.ui.internal.wizards.newresource.ResourceMessages;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.ui.statushandlers.StatusManager;
import org.mendix.eclipse.util.UiHelper;

public class Mod4jAbstractNewProjectWizard extends Wizard implements
			INewWizard {

    protected static final String BUSDOMAIN_PACKAGE = "businessdomain";

    protected static final String DATACONTRACT_PACKAGE = "datacontract";

    protected static final String SERVICE_PACKAGE = "service";

    private static final String LF = System.getProperty("line.separator");

    private static String MODEL_DIR = "src/model";
    
		protected Mod4jGenericNewProjectWizardPage mainPage;
		private String langName = "";
		private String packageName;

		public String getLangName() {
			return langName;
		}

		public void setLangName(String langName) {
			this.langName = langName;
		}

		public String getPackageName() {
			return packageName;
		}

		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}

		/**
		 * Constructor for AbstractNewProjectWizard.
		 */
		public Mod4jAbstractNewProjectWizard() {
			super();
			setNeedsProgressMonitor(true);
		}

		@Override
		public void addPages() {
			super.addPages();
			mainPage = createMainPage();
			addPage(mainPage);
		}

		private Mod4jGenericNewProjectWizardPage createMainPage() {
			Mod4jGenericNewProjectWizardPage page = new Mod4jGenericNewProjectWizardPage(getLangName());
            page.setImageDescriptor(ImageDescriptor.createFromImage(UiHelper.mendixLogoImage));
			return page;
		}
		
		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.jface.wizard.Wizard#performFinish()
		 */
		@Override
		public boolean performFinish() {

			try {
				new WorkspaceModifyOperation() {

					@Override
					protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException,
							InterruptedException {
						try {
							IProject pr = createNewProject();
							pr.open(monitor);
							
							Mod4jProjectCreator.create(pr, new String[] { 
									"org.mendix.dsl.businessdomain.mm",
									"org.mendix.dsl.businessdomain.validation",
									"org.mendix.dsl.businessdomain.generator",
									"org.mendix.dsl.businessdomain.xtext",
                                    "org.mendix.dsl.datacontract.mm",
	                                "org.mendix.dsl.datacontract.validation",
	                                "org.mendix.dsl.datacontract.generator",
	                                "org.mendix.dsl.datacontract.xtext",
                                    "org.mendix.dsl.service.mm",
                                    "org.mendix.dsl.service.validation",
                                    "org.mendix.dsl.service.generator",
                                    "org.mendix.dsl.service.xtext",
                                    "org.mendix.common",									
									"org.mendix.crossx.mm",
									"org.mendix.crossx.broker",
									"org.mendix.eclipse"
							}, monitor);
							String appname = mainPage.getApplicationNameFieldValue();
							IContainer modelFolder = pr.getFolder(MODEL_DIR);
							Mod4jProjectCreator.createFile("mendix.properties", modelFolder, propertiesContents(), monitor);

							boolean createSamples = mainPage.shouldCreateSamples() ;
							String modelFileName ;
							modelFolder = pr.getFolder(MODEL_DIR + "/" + BUSDOMAIN_PACKAGE);
							if( createSamples ){
    							modelFileName = appname + ".busmod";
    							Mod4jProjectCreator.createFile(modelFileName, modelFolder, busmodSampleModelContents(), monitor);
							}
							modelFolder = pr.getFolder(MODEL_DIR + "/" + DATACONTRACT_PACKAGE);
                            if( createSamples ){
                                modelFileName = appname + ".dtcmod";
                                Mod4jProjectCreator.createFile(modelFileName, modelFolder, dtcmodSampleModelContents(), monitor);
                            }
                            modelFolder = pr.getFolder(MODEL_DIR + "/" + SERVICE_PACKAGE);
                            if( createSamples ){
                                modelFileName = appname + ".sermod";
                                Mod4jProjectCreator.createFile(modelFileName, modelFolder, sermodSampleModelContents(), monitor);
                            }
                            
                    } catch (CoreException e) {
                        mainPage.setErrorMessage(e.getLocalizedMessage());
                    }
                }
            }.run(null);
        } catch (InvocationTargetException e) {
            mainPage.setErrorMessage(e.getLocalizedMessage());
            return false;
        } catch (InterruptedException e) {
            mainPage.setErrorMessage(e.getLocalizedMessage());
            return false;
        }
        return true;
    }
		
		protected String getModelProjectName() {
			return mainPage.getApplicationNameFieldValue() + "-dslModels";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
		 *      org.eclipse.jface.viewers.IStructuredSelection)
		 */
		public void init(IWorkbench workbench, IStructuredSelection selection) {
			// does nothing
		}

		public String propertiesContents () {
			
			return  "####" + LF +
			        "#" + LF +
			        "# Application properties" + LF +
			        "#" + LF +
			        "####" + LF +
			        "fileEncoding=UTF-8" + LF +
			        "applicationName="+ mainPage.getApplicationNameFieldValue() + LF +
					"applicationVersion=1.0.0-SNAPSHOT" + LF +
					"applicationPath=.." + LF +
                    "srcGenPath=generated-sources" + LF +
                    "resourceGenPath=generated-resources" + LF +
                    "srcManPath=src/main/java" + LF +
                    "resourceManPath=src/main/resources" + LF +
                    "rootPackage=" + mainPage.getPackageNameFieldValue() + LF +
                    "" + LF +
                    "####" + LF +
                    "#" + LF +
                    "# DslModel module properties" + LF +
                    "#" + LF +
                    "####" + LF +
                    "dslModelsModuleName=" + getModelProjectName() + LF +
                    "" + LF +
                    "####" + LF +
                    "#" + LF +
                    "# Domain module properties" + LF +
                    "#" + LF +
                    "####" + LF +
                    "domainModuleName=" + mainPage.getApplicationNameFieldValue() + "-domain" + LF +
                    "domainRootPackage=" + mainPage.getPackageNameFieldValue() + ".domain" + LF +
                    "" + LF +
                    "####" + LF +
                    "#" + LF +
                    "# Data module properties" + LF +
                    "#" + LF +
                    "####" + LF +
                    "dataModuleName=" + mainPage.getApplicationNameFieldValue() + "-data" + LF +
                    "dataRootPackage=" + mainPage.getPackageNameFieldValue() + ".data" + LF +
                    "hibernate.hbm2ddl.auto=update" + LF +
                    "#hibernate-mapping.inheritance.strategy=[table.per.concrete.class|table.per.subclass]" + LF +
                    "hibernate-mapping.inheritance.strategy=table.per.concrete.class" + LF +
                    "hibernate-mapping.class.id.generator.class=native" + LF +
                    "" + LF +
                    "####" + LF +
                    "#" + LF +
                    "# Service module properties" + LF +
                    "#" + LF +
                    "####" + LF +
                    "serviceModuleName=" + mainPage.getApplicationNameFieldValue() + "-service" + LF +
                    "serviceRootPackage=" + mainPage.getPackageNameFieldValue() + ".service";
			
        }

		public String busmodSampleModelContents() {
            return 
            "domain " + mainPage.getApplicationNameFieldValue() + "DomainModel" + " ;" + LF +
            LF +
            "/*" + LF +
            " * The Business Domain model." + LF +
            " */" + LF ;
        }
		
		public String dtcmodSampleModelContents() {
		    return   
		    "datacontract " + mainPage.getApplicationNameFieldValue() + "DataContractModel" + " ;" + LF +
		    LF +
            "/*" + LF +
            " * The Datacontract model." + LF +
            " */" + LF ;
		}
		
        public String sermodSampleModelContents() {
            return 
            "service " + mainPage.getApplicationNameFieldValue() + "ServiceModel" + " ;" + LF +
            LF +
            "/*" + LF +
            " * The Service model." + LF +
            " */" + LF ;
        }

        
    /**
     * Creates a new project resource with the selected name.
     * <p>
     * In normal usage, this method is invoked after the user has pressed Finish on the wizard; the enablement of the
     * Finish button implies that all controls on the pages currently contain valid values.
     * </p>
     * <p>
     * Note that this wizard caches the new project once it has been successfully created; subsequent invocations of
     * this method will answer the same project resource without attempting to create it again.
     * </p>
     * 
     * @return the created project resource, or <code>null</code> if the project was not created
     */
    private IProject createNewProject() {
        
        IProject newProject = null;
        
        // get a project handle
        final IProject newProjectHandle = mainPage.getProjectHandle();

        // get a project descriptor
        URI location = null;
        if (!mainPage.useDefaults()) {
            location = mainPage.getLocationURI();
            String tmp = location.toASCIIString();
            tmp = tmp + "/" + getModelProjectName();
            location = URI.create(tmp);

        }

        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        final IProjectDescription description = workspace.newProjectDescription(newProjectHandle.getName());
        description.setLocationURI(location);

        // create the new project operation
        IRunnableWithProgress op = new IRunnableWithProgress() {
            public void run(IProgressMonitor monitor) throws InvocationTargetException {
                CreateProjectOperation op = new CreateProjectOperation(description,
                        ResourceMessages.NewProject_windowTitle);
                try {
                    PlatformUI.getWorkbench().getOperationSupport().getOperationHistory().execute(op, monitor,
                            WorkspaceUndoUtil.getUIInfoAdapter(getShell()));
                } catch (ExecutionException e) {
                    throw new InvocationTargetException(e);
                }
            }
        };

        // run the new project creation operation
        try {
            getContainer().run(false, true, op);
        } catch (InterruptedException e) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable t = e.getTargetException();
            if (t instanceof ExecutionException && t.getCause() instanceof CoreException) {
                CoreException cause = (CoreException) t.getCause();
                StatusAdapter status;
                if (cause.getStatus().getCode() == IResourceStatus.CASE_VARIANT_EXISTS) {
                    status = new StatusAdapter(StatusUtil.newStatus(IStatus.WARNING, NLS.bind(
                            ResourceMessages.NewProject_caseVariantExistsError, newProjectHandle.getName()), cause));
                } else {
                    status = new StatusAdapter(StatusUtil.newStatus(cause.getStatus().getSeverity(),
                            ResourceMessages.NewProject_errorMessage, cause));
                }
                status.setProperty(StatusAdapter.TITLE_PROPERTY, ResourceMessages.NewProject_errorMessage);
                StatusManager.getManager().handle(status, StatusManager.BLOCK);
            } else {
                StatusAdapter status = new StatusAdapter(new Status(IStatus.WARNING, IDEWorkbenchPlugin.IDE_WORKBENCH,
                        0, NLS.bind(ResourceMessages.NewProject_internalError, t.getMessage()), t));
                status.setProperty(StatusAdapter.TITLE_PROPERTY, ResourceMessages.NewProject_errorMessage);
                StatusManager.getManager().handle(status, StatusManager.LOG | StatusManager.BLOCK);
            }
            return null;
        }

        newProject = newProjectHandle;

        return newProject;
    }

}
