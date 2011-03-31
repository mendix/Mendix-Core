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
package org.mod4j.dslcommon.generator.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

import org.mod4j.common.generator.admin.FileTrack;
import org.mod4j.common.generator.admin.Mod4jTracker;
import org.mod4j.common.generator.admin.GeneratedFile;

public class ModelHelpers {

    private static Properties appProps = new Properties();

    public static boolean equalsIgnoreCase(String one, String two) {
        return one.equalsIgnoreCase(two);
    }

    /**
     * Read the properties file 'propFilePath' and return the result as a Map<String, String>
     * 
     * @param propFilePath
     *            absolute pathname of the properties files
     * @return
     */
    public static Map<String, String> getProperties(String propFilePath) {
        Map<String, String> result = new HashMap<String, String>();
        try {
            Properties props = new Properties();
            props.load(new FileInputStream(propFilePath));

            for (Entry<Object, Object> property : props.entrySet()) {
                result.put((String) property.getKey(), (String) property.getValue());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    public static String getProperty(String key, String propFilePath) {

        try {
            appProps.load(new FileInputStream(propFilePath));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return appProps.getProperty(key);
    }

    public static String timestamp() {
        Date now = new Date(System.currentTimeMillis());
        return now.toString();
    }

    public static boolean fileExist(String path) {
        File f = new File(path);
        return f.exists();
    }

    /**
     * Determines if the extension file, given by the <code>absoluteFilePath</code>, should be generated. 
     * Initially extension Files will be (re)generated if the file takes part in the Generation Gap pattern. 
     * Extension files will not be regenerated if the file already exist in the source folder for 
     * manually maintained (re)sources. So the user changes will not get lost.
     * 
     * @param absoluteFilePath
     *            The complete path from the root of the file-system including the file name.
     * @return true if the file can be safely regenerated. Otherwise returns false.
     */
    public static boolean shouldRegenerate(String absoluteFilePath) {

        if (fileExist(absoluteFilePath)) {
            return false;
        }

        // Do not regenerate existing pom.xml files
        if (absoluteFilePath.endsWith("pom.xml")) {
            return false;
        }

        long modified = new File(absoluteFilePath).lastModified();
        FileTrack current = Mod4jTracker.getFileTracker().getCurrentTrack();
        if (current == null) {
            // System.err.println("["+ path + "] REGENERATE: current == null " + path + " ==> false");
            return false;
        }
        GeneratedFile extension = current.getExtensionFile(absoluteFilePath);
        if (extension != null) {
            // System.err.println("REGENERATE: extension != null " + path);
            long generated = extension.getModifiedDate();
            System.err.println("[" + absoluteFilePath + "] modified : [" + DateFormat.getInstance().format(modified)
                    + "] generated [" + DateFormat.getInstance().format(generated) + "]" + " ==> "
                    + (modified == generated));
            return (modified == generated);
        }

        // System.err.println("["+ path + "] REGENERATE: no track " + path + " ==> false");
        return false;
    }

    /**
     * @param cls
     * @return The name of the Java class for name cls
     */
    public static String javaClassName(String cls) {
        return StringHelpers.firstCharToUpper(cls);
    }

    public static void print(String m) {
        System.err.println(m);
    }
}
