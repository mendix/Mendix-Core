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
 *******************************************************************************/


import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class Mod4jGenericNewProjectWizardPage extends Mod4jWizardNewProjectCreationPage {

		public Mod4jGenericNewProjectWizardPage (String name) {
			super("newProjectWizardPage");
			setTitle("Mod4j " + name + " Project");
			setDescription("Mod4j " + name + " Project");
//			setInitialProjectName("MyApplication-dslModels");
			setInitialApplicationName("MyApplication");
			setInitialRootPackage("org.mycompany.myapplication");
		}

		@Override
		public IWizardPage getPreviousPage() {
			validatePage();
			return super.getPreviousPage();
		}

	}
