/*
 * <copyright>
 *
 * Copyright (c) 2005-2007 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.mod4j.common.generator.admin;

//import java.io.BufferedInputStream;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.Properties;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//
//import org.openarchitectureware.workflow.util.ResourceLoaderFactory;
//import org.openarchitectureware.xpand2.output.FileHandle;
//import org.openarchitectureware.xpand2.output.PostProcessor;

/**
 * Formats generated Java code using the Eclipse code formatter.
 * 
 * @author Sven Efftinge (http://www.efftinge.de) (initial)
 * @author Bernd Kolb
 * @author Peter Friese
 * @author Markus V�lter
 * @author Michael Leopoldseder
 * @author Karsten Thoms
 * @since 4.0
 */
public class PostGenerator { // implements PostProcessor {

    /** Logger instance. */
    // private final Log log = LogFactory.getLog(getClass());
    // /**
    // * Formats the file using Eclipse code formatter. The file must have the
    // * extension '.java'.
    // */
    // public void beforeWriteAndClose(final FileHandle info) {
    // if (info.getTargetFile() != null && info.getTargetFile().getAbsolutePath().endsWith(".java")) {
    //
    // info.getBuffer().toString();
    //
    // info.setBuffer(new StringBuffer());
    // log.warn("File " + info.getTargetFile()
    // + " could not be formatted. Make sure your template produces legal Java code!");
    // }
    // }
    //
    // /**
    // * Return a Java Properties file representing the options that are in the
    // * specified config file.
    // */
    // private Properties readConfig(String filename) {
    // BufferedInputStream stream = null;
    // BufferedReader reader = null;
    //            
    // try {
    // InputStream is = openStream(filename);
    // final Properties formatterOptions = new Properties();
    // if ( filename.endsWith(".xml")) {
    // Pattern pattern = Pattern.compile("<setting id=\"([^\"]*)\" value=\"([^\"]*)\"\\/>");
    // reader = new BufferedReader(new InputStreamReader(is));
    // for (String line = reader.readLine(); line != null; line = reader.readLine()) {
    // Matcher matcher = pattern.matcher(line);
    // if ( matcher.matches() ) {
    // formatterOptions.put(matcher.group(1), matcher.group(2));
    // }
    // }
    // }
    // else {
    // stream = new BufferedInputStream(is);
    // formatterOptions.load(stream);
    // }
    // // add some settings for the compiler options
    // // which are not included in the Eclipse code style settings
    // // to make the code formatter working
    // // see https://bugs.eclipse.org/bugs/show_bug.cgi?id=222736
    // if( formatterOptions.get("org.eclipse.jdt.core.compiler.compliance") == null ) {
    // formatterOptions.put("org.eclipse.jdt.core.compiler.compliance", "1.5");
    // }
    // if( formatterOptions.get("org.eclipse.jdt.core.compiler.codegen.targetPlatform") == null ) {
    // formatterOptions.put("org.eclipse.jdt.core.compiler.codegen.targetPlatform", "1.5");
    // }
    // if( formatterOptions.get("org.eclipse.jdt.core.compiler.source") == null ) {
    // formatterOptions.put("org.eclipse.jdt.core.compiler.source", "1.5");
    // }
    // return formatterOptions;
    // } catch (IOException e) {
    // log.warn("Problem reading code formatter config file (" + e.getMessage() + ").");
    // } finally {
    // if (stream != null) {
    // try {
    // stream.close();
    // } catch (IOException e) {
    // /* ignore */
    // }
    // }
    // if ( reader != null ) {
    // try {
    // reader.close();
    // } catch (IOException e) {
    // /* ignore */
    // }
    // }
    // }
    // return null;
    // }
    //
    // /**
    // * Searches for the given filename as a ressource and returns a stream on it. Throws an IOException, if the file
    // * cannot be found.
    // *
    // * @param filename
    // * The name of the file to be searched in the ressources.
    // * @return InputStream for subsequent reading
    // * @throws IOException
    // */
    // protected InputStream openStream(String filename) throws IOException {
    // InputStream is = ResourceLoaderFactory.createResourceLoader().getResourceAsStream(filename);
    // if (is == null) {
    // throw new IOException("Config file [" + filename + "] does not exist.");
    // }
    // return is;
    // }
    //        
    // /**
    // * @return the configuration file for the formatter
    // */
    // public String getConfigFile() {
    // return "configfile";
    // }
    //
    // /**
    // * @param configFile
    // * configuration file for the formatter
    // */
    // public void setConfigFile(String configFile) {
    // }
    //
    // /**
    // * {@inheritDoc}
    // */
    // public void afterClose(final FileHandle impl) {
    // // do nothing here
    // }
}
