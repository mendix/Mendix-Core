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

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;


public class Mod4jProjectCreator  {
		private static Log log = LogFactory.getLog(Mod4jProjectCreator.class);
		
		public static void create(IProject project, String[] requeredBundles,
				IProgressMonitor progressMonitor) throws CoreException {
			addNatures(project, new String[] { JavaCore.NATURE_ID,
					"org.eclipse.pde.PluginNature",
					"org.mendix.eclipse.Mod4jNature" }, progressMonitor);
			addBuilders(project, new String[] { JavaCore.BUILDER_ID,
					"org.eclipse.pde.ManifestBuilder",
					"org.eclipse.pde.SchemaBuilder",
					"org.mendix.eclipse.Mod4jBuilder"}, progressMonitor);
			String[] srcFolders = new String[] { "src/model" };
			addSourceFolders(project, srcFolders, progressMonitor);
			createManifest(project, requeredBundles,
					null, progressMonitor);
			createBuildProps(project, srcFolders, progressMonitor);

		}

		public static IFile createFile(String name, IContainer container,
				String content, IProgressMonitor progressMonitor) {
			IFile file = container.getFile(new Path(name));
			assertExist(file.getParent());
			try {
				InputStream stream = new ByteArrayInputStream(content.getBytes(file
						.getCharset()));
				if (file.exists()) {
					file.setContents(stream, true, true, progressMonitor);
				} else {
					file.create(stream, true, progressMonitor);
				}
				stream.close();
			} catch (Exception e) {
				log.error(e);
			}
			progressMonitor.worked(1);

			return file;
		}

		public static void addNatures(IProject project, String[] natures,
				IProgressMonitor progressMonitor) throws CoreException {
			IProjectDescription projectDescription = project.getDescription();
			projectDescription.setNatureIds(natures);
			project.setDescription(projectDescription, progressMonitor);

		}

		public static void addBuilders(IProject project, String[] strings,
				IProgressMonitor progressMonitor) throws CoreException {
			IProjectDescription projectDescription = project.getDescription();

			ICommand java = createBuilderCommand(projectDescription,
					JavaCore.BUILDER_ID);

			ICommand manifest = createBuilderCommand(projectDescription,
					"org.eclipse.pde.ManifestBuilder");

            ICommand schema = createBuilderCommand(projectDescription,
            "org.eclipse.pde.SchemaBuilder");

            ICommand mendix = createBuilderCommand(projectDescription,
            "org.mendix.eclipse.Mod4jBuilder");
			projectDescription
					.setBuildSpec(new ICommand[] { java, manifest, schema, mendix });
			project.setDescription(projectDescription, progressMonitor);

		}

		public static void addSourceFolders(IProject project, String[] names,
				IProgressMonitor progressMonitor) throws CoreException {

		    try {
                IJavaProject javaProject = JavaCore.create(project);
                javaProject.getProject().getDescription().hasNature(JavaCore.NATURE_ID);
                List<IClasspathEntry> classpathEntries = new ArrayList<IClasspathEntry>();
                for (String src : names) {
                    // TODO Jos: creating subfolders is not done right, this is currently a non generic fix
                    IFolder tmp = project.getFolder("src");
                    if (!tmp.exists()) {
                        tmp.create(false, true, new SubProgressMonitor(
                                progressMonitor, 1));
                    }

                	IFolder srcContainer = project.getFolder(src);
                	if (!srcContainer.exists()) {
                		srcContainer.create(false, true, new SubProgressMonitor(
                				progressMonitor, 1));
                	}
                	IClasspathEntry srcClasspathEntry = JavaCore
                			.newSourceEntry(srcContainer.getFullPath());
                	classpathEntries.add(srcClasspathEntry);
                }
                classpathEntries.add(JavaCore.newContainerEntry(new Path(
                		"org.eclipse.jdt.launching.JRE_CONTAINER")));
                classpathEntries.add(JavaCore.newContainerEntry(new Path(
                		"org.eclipse.pde.core.requiredPlugins")));

                javaProject.setRawClasspath(classpathEntries
                		.toArray(new IClasspathEntry[] {}), new SubProgressMonitor(
                		progressMonitor, 1));
               

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
		}

		/**
		 * @param projectDescription
		 * @param builderName
		 * @param project
		 * @return
		 * @throws CoreException
		 */
		private static ICommand createBuilderCommand(
				IProjectDescription projectDescription, String builderName)
				throws CoreException {
			ICommand manifest = projectDescription.newCommand();
			manifest.setBuilderName(builderName);
			return manifest;
		}

		private static void createBuildProps(IProject project, String[] srcFolders,
				final IProgressMonitor progressMonitor) {
			StringBuilder bpContent = new StringBuilder("source.. = ");
			for (String string : srcFolders) {
				bpContent.append(string).append("/,");
			}
			bpContent.append("\n");
			bpContent.append("bin.includes = META-INF/,\\n");
			bpContent.append("               .\n");
			createFile("build.properties", project, bpContent.toString(),
					progressMonitor);
		}

		private static void createManifest(IProject project,
				final String[] requiredBundles,
				final List<String> exportedPackages,
				final IProgressMonitor progressMonitor) throws CoreException {
			StringBuilder maniContent = new StringBuilder("Manifest-Version: 1.0\n");
			maniContent.append("Bundle-ManifestVersion: 2\n");
			maniContent.append("Bundle-Name: " + project.getName().replace("-", ".") + "\n");
			maniContent.append("Bundle-SymbolicName: " + project.getName().replace("-", ".") +  "; singleton:=true\n");
			maniContent.append("Bundle-Version: 1.0.0\n");
			// maniContent.append("Bundle-Localization: plugin\n");
			maniContent.append("Require-Bundle: ");
			// bundles
			if (requiredBundles != null && requiredBundles.length > 0) {
			    for (int i = 0; i < requiredBundles.length; i++) {
                    String entry = requiredBundles[i];
                    if( i == requiredBundles.length - 1) {
                        maniContent.append(" " + entry + "\n");
                    } else {
                        maniContent.append(" " + entry + ",\n");
                    }
                }
			}
			// packages
			if (exportedPackages != null && !exportedPackages.isEmpty()) {
				maniContent.append("Require-Bundle: " + exportedPackages.get(0));
				for (int i = 1, x = exportedPackages.size(); i < x; i++) {
					maniContent.append(",\n " + exportedPackages.get(i));
				}
				maniContent.append("\n");
			}

			IFolder metaInf = project.getFolder("META-INF");
			metaInf.create(false, true, new SubProgressMonitor(progressMonitor, 1));
			createFile("MANIFEST.MF", metaInf, maniContent.toString(),
					progressMonitor);
		}

		private static void assertExist(IContainer c) {
			if (!c.exists()) {
				if (!c.getParent().exists()) {
					assertExist(c.getParent());
				}
				if (c instanceof IFolder) {
					try {
						((IFolder) c)
								.create(false, true, new NullProgressMonitor());
					} catch (CoreException e) {
						log.error(e);
					}
				}

			}

		}

	}
