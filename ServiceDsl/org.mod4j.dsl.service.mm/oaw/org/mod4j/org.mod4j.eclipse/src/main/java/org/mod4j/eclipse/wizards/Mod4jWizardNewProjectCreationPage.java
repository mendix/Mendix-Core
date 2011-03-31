package org.mendix.eclipse.wizards;
/*******************************************************************************
 * Copyright (c) 2000, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Jakub Jurkiewicz <jakub.jurkiewicz@gmail.com> - Fix for Bug 174737
 *     [IDE] New Plug-in Project wizard status handling is inconsistent
 *     Ordina: adapted this xText generated file for Mod4j.
 *******************************************************************************/

import java.net.URI;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.eclipse.ui.internal.ide.IIDEHelpContextIds;
import org.eclipse.ui.internal.ide.dialogs.ProjectContentsLocationArea;
import org.eclipse.ui.internal.ide.dialogs.ProjectContentsLocationArea.IErrorMessageReporter;


import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class Mod4jWizardNewProjectCreationPage extends WizardPage { //WizardNewProjectCreationPage {

	/** Duplicated !
	 * 
	 */
	protected String getModelProjectName() {
		return getApplicationNameFieldValue() + "-dslModels" ;
	}

    /**
     * Creates a new project creation wizard page.
     *
     * @param pageName the name of this page
     */
    public Mod4jWizardNewProjectCreationPage(String pageName) {
        super(pageName);
        setPageComplete(false);
    }
	

	/**
	 * Standard main page for a wizard that is creates a project resource.
	 * <p>
	 * This page may be used by clients as-is; it may be also be subclassed to suit.
	 * </p>
	 * <p>
	 * Example usage:
	 * <pre>
	 * mainPage = new WizardNewProjectCreationPage("basicNewProjectPage");
	 * mainPage.setTitle("Project");
	 * mainPage.setDescription("Create a new project resource.");
	 * </pre>
	 * </p>
	 */
	       // initial value stores
//	    private String initialProjectFieldValue;
	    private String initialApplicationNameFieldValue;
	    private String initialPackageNameFieldValue;

	    // widgets
//	    Text projectNameField;
	    Text applicationNameField;
	    Text packageNameField;

	    private Listener nameModifyListener = new Listener() {
	        public void handleEvent(Event e) {
	        	setLocationForSelection();
	            boolean valid = validatePage();
	            setPageComplete(valid);
	                
	        }
	    };

		private ProjectContentsLocationArea locationArea;

	    // constants
	    private static final int SIZING_TEXT_FIELD_WIDTH = 350;


	    /** (non-Javadoc)
	     * Method declared on IDialogPage.
	     */
	    public void createControl(Composite parent) {
	        Composite composite = new Composite(parent, SWT.NULL);
	        composite.setFont(parent.getFont());

	        initializeDialogUnits(parent);

	        PlatformUI.getWorkbench().getHelpSystem().setHelp(composite,
	                IIDEHelpContextIds.NEW_PROJECT_WIZARD_PAGE);

	        composite.setLayout(new GridLayout());
	        composite.setLayoutData(new GridData(GridData.FILL_BOTH));

	        createProjectNameGroup(composite);
	        
	        locationArea = new ProjectContentsLocationArea(getErrorReporter(), composite);
	        if(initialApplicationNameFieldValue != null) {
				locationArea.updateProjectName(getModelProjectName());
			}
	        
            createSampleButton(composite);
	        

			// Scale the button based on the rest of the dialog
			setButtonLayoutData(locationArea.getBrowseButton());
			
	        setPageComplete(validatePage());
	        // Show description on opening
	        setErrorMessage(null);
	        setMessage(null);
	        setControl(composite);
	    }
	    
	    /**
		 * Get an error reporter for the receiver.
		 * @return IErrorMessageReporter
		 */
		private IErrorMessageReporter getErrorReporter() {
			return new IErrorMessageReporter(){
				/* (non-Javadoc)
				 * @see org.eclipse.ui.internal.ide.dialogs.ProjectContentsLocationArea.IErrorMessageReporter#reportError(java.lang.String)
				 */
				public void reportError(String errorMessage) {
					setErrorMessage(errorMessage);
					boolean valid = errorMessage == null;
					if(valid) {
						valid = validatePage();
					}
					
					setPageComplete(valid);
				}

				public void reportError(String errorMessage, boolean infoOnly) {
					// TODO Auto-generated method stub
					
				}
			};
		}

	    /**
	     * Creates the project name specification controls.
	     *
	     * @param parent the parent composite
	     */
	    private final void createProjectNameGroup(Composite parent) {
	        // project specification group
	        Composite projectGroup = new Composite(parent, SWT.NONE);
	        GridLayout layout = new GridLayout();
	        layout.numColumns = 2;
	        projectGroup.setLayout(layout);
	        projectGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	        // new project label
//	        Label projectLabel = new Label(projectGroup, SWT.NONE);
//	        projectLabel.setText(IDEWorkbenchMessages.WizardNewProjectCreationPage_nameLabel);
//	        projectLabel.setFont(parent.getFont());

	        // new project name entry field
//	        projectNameField = new Text(projectGroup, SWT.BORDER);
//	        GridData data = new GridData(GridData.FILL_HORIZONTAL);
//	        data.widthHint = SIZING_TEXT_FIELD_WIDTH;
//	        projectNameField.setLayoutData(data);
//	        projectNameField.setFont(parent.getFont());

	        // Set the initial value first before listener
	        // to avoid handling an event during the creation.
//	        if (initialProjectFieldValue != null) {
//				projectNameField.setText(initialProjectFieldValue);
//			}
//	        projectNameField.addListener(SWT.Modify, nameModifyListener);
	        
	        /* New application name label */
            Label applicationNameLabel = new Label(projectGroup, SWT.NONE);
            applicationNameLabel.setText("Application name");
            applicationNameLabel.setFont(parent.getFont());

            /* New application name entry field */
            applicationNameField = new Text(projectGroup, SWT.BORDER);
            GridData appNamedata = new GridData(GridData.FILL_HORIZONTAL);
            appNamedata.widthHint = SIZING_TEXT_FIELD_WIDTH;
            applicationNameField.setLayoutData(appNamedata);
            applicationNameField.setFont(parent.getFont());
            
            // Set the initial value first before listener
            // to avoid handling an event during the creation.
            if (initialApplicationNameFieldValue != null) {
                applicationNameField.setText(initialApplicationNameFieldValue);
            }

            applicationNameField.addListener(SWT.Modify, nameModifyListener);
	                
            // new package label
            Label packageNameLabel = new Label(projectGroup, SWT.NONE);
            packageNameLabel.setText("Root package");
            packageNameLabel.setFont(parent.getFont());

	        // new package name entry field
	        packageNameField = new Text(projectGroup, SWT.BORDER);
	        GridData packagedata = new GridData(GridData.FILL_HORIZONTAL);
	        packagedata.widthHint = SIZING_TEXT_FIELD_WIDTH;
	        packageNameField.setLayoutData(packagedata);
	        packageNameField.setFont(parent.getFont());

             
            // Set the initial value first before listener
	        // to avoid handling an event during the creation.
	        if (initialPackageNameFieldValue != null) {
				packageNameField.setText(initialPackageNameFieldValue);
			}
	        packageNameField.addListener(SWT.Modify, nameModifyListener);

	    }
	    
	    Button createSamplesButton;
	    /**
	     * Creates the "Other" group. This is typically a child of the "Control"
	     * group.
	     */
	    void createSampleButton(Composite parent) {

	      /* Create the controls */
	      createSamplesButton = new Button(parent, SWT.CHECK);
	      createSamplesButton.setText("Create sample model files");

	      /* Add the listeners */
//	      enabledButton.addSelectionListener(new SelectionAdapter() {
//	          
//	        boolean current = true;
//	        public void widgetSelected(SelectionEvent event) {
//	            setExampleWidgetEnabled();
//	            if( current ) {
//	                enabledButton.setSelection(false);
//	            } else {
//                    enabledButton.setSelection(false);
//	            }
//	        }
//	      });

	      /* Set the default state */
	      createSamplesButton.setSelection(true);
	    }

	    public boolean shouldCreateSamples() {
	        return createSamplesButton.getSelection();
	    }
	    /**
	     * Returns the current project location path as entered by 
	     * the user, or its anticipated initial value.
	     * Note that if the default has been returned the path
	     * in a project description used to create a project
	     * should not be set.
	     *
	     * @return the project location path or its anticipated initial value.
	     */
	    public IPath getLocationPath() {
	        return new Path(locationArea.getProjectLocation());
	    }
	    
	    /**
	    /**
	     * Returns the current project location URI as entered by 
	     * the user, or <code>null</code> if a valid project location
	     * has not been entered.
	     *
	     * @return the project location URI, or <code>null</code>
	     * @since 3.2
	     */
	    public URI getLocationURI() {
	    	return locationArea.getProjectLocationURI();
	    }

	    /**
		 * Creates a project resource handle for the current project name field
		 * value. The project handle is created relative to the workspace root.
		 * <p>
		 * This method does not create the project resource; this is the
		 * responsibility of <code>IProject::create</code> invoked by the new
		 * project resource wizard.
		 * </p>
		 * 
		 * @return the new project resource handle
		 */
	    public IProject getProjectHandle() {
//	        return ResourcesPlugin.getWorkspace().getRoot().getProject(
//	                getProjectName());
	        return ResourcesPlugin.getWorkspace().getRoot().getProject(
	                getModelProjectName());
	    }

	    /**
	     * Returns the current project name as entered by the user, or its anticipated
	     * initial value.
	     *
	     * @return the project name, its anticipated initial value, or <code>null</code>
	     *   if no project name is known
	     */
	    public String getProjectName() {
//	        if (projectNameField == null) {
//				return initialProjectFieldValue;
//			}
//
//	        return getProjectNameFieldValue();
//	        if (projectNameField == null) {
//				return initialProjectFieldValue;
//			}

	        return getModelProjectName();
	    }

	    /**
	     * Returns the value of the project name field
	     * with leading and trailing spaces removed.
	     * 
	     * @return the project name in the field
	     */
//	    private String getProjectNameFieldValue() {
//	        if (projectNameField == null) {
//				return ""; //$NON-NLS-1$
//			}
//	        return projectNameField.getText().trim();
//	    }
	    
	    public String getApplicationNameFieldValue() {
            if (applicationNameField == null) {
                return ""; //$NON-NLS-1$
            }
            return applicationNameField.getText().trim();
        }
	    
	    public String getPackageNameFieldValue() {
	        if (packageNameField == null) {
				return ""; //$NON-NLS-1$
			}
	        return packageNameField.getText().trim();
	    }

	    /**
	     * Sets the initial project name that this page will use when
	     * created. The name is ignored if the createControl(Composite)
	     * method has already been called. Leading and trailing spaces
	     * in the name are ignored.
	     * Providing the name of an existing project will not necessarily 
	     * cause the wizard to warn the user.  Callers of this method 
	     * should first check if the project name passed already exists 
	     * in the workspace.
	     * 
	     * @param name initial project name for this page
	     * 
	     * @see IWorkspace#validateName(String, int)
	     * 
	     */
//	    public void setInitialProjectName(String name) {
//	        if (name == null) {
//				initialProjectFieldValue = null;
//			} else {
//	            initialProjectFieldValue = name.trim();
//	            if(locationArea != null) {
//					locationArea.updateProjectName(name.trim());
//				}
//	        }
//	    }
	    
	    public void setInitialApplicationName(String name) {
            if (name == null) {
                initialApplicationNameFieldValue = null;
            } else {
                initialApplicationNameFieldValue = name.trim();
            }
        }
	    
	    public void setInitialRootPackage(String name) {
            if (name == null) {
                initialPackageNameFieldValue = null;
            } else {
                initialPackageNameFieldValue = name.trim();
                if(locationArea != null) {
                }
            }
        }

	    /**
	     * Set the location to the default location if we are set to useDefaults.
	     */
	    void setLocationForSelection() {
//	    	locationArea.updateProjectName(getProjectNameFieldValue());
	    	locationArea.updateProjectName(getModelProjectName());
	    }

	  
	    /**
	     * Returns whether this page's controls currently all contain valid 
	     * values.
	     *
	     * @return <code>true</code> if all controls are valid, and
	     *   <code>false</code> if at least one is invalid
	     */
	    protected boolean validatePage() {
	        IWorkspace workspace = IDEWorkbenchPlugin.getPluginWorkspace();

	        String packageFieldContents = getPackageNameFieldValue();
	        if (packageFieldContents.equals("")) { //$NON-NLS-1$
	            setErrorMessage(null);
	            setMessage("default package name must have a value");
	            return false;
	        }

	        String projectFieldContents = getModelProjectName();
	        if (projectFieldContents.equals("")) { //$NON-NLS-1$
	            setErrorMessage(null);
	            setMessage(IDEWorkbenchMessages.WizardNewProjectCreationPage_projectNameEmpty);
	            return false;
	        }

	        IStatus nameStatus = workspace.validateName(projectFieldContents,
	                IResource.PROJECT);
	        if (!nameStatus.isOK()) {
	            setErrorMessage(nameStatus.getMessage());
	            return false;
	        }

	        IProject handle = getProjectHandle();
	        if (handle.exists()) {
	            setErrorMessage(IDEWorkbenchMessages.WizardNewProjectCreationPage_projectExistsMessage);
	            return false;
	        }
	        
	        /*
	         * If not using the default value validate the location.
	         */
	        if (!locationArea.isDefault()) {
	        	String validLocationMessage = locationArea.checkValidLocation();
	        	if (validLocationMessage != null) { //there is no destination location given
	        		setErrorMessage(validLocationMessage);
	        		return false;
	        	}
	        }

	        setErrorMessage(null);
	        setMessage(null);
	        return true;
	    }

	    /*
	     * see @DialogPage.setVisible(boolean)
	     */
	    public void setVisible(boolean visible) {
	        super.setVisible(visible);
	        if (visible) {
				applicationNameField.setFocus();
			}
	    }

	    /**
	     * Returns the useDefaults.
	     * @return boolean
	     */
	    public boolean useDefaults() {
	        return locationArea.isDefault();
	    }

	}