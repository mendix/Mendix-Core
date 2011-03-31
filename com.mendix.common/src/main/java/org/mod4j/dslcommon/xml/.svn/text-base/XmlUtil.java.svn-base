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
package org.mod4j.dslcommon.xml;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;

import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

// import org.jdom.output.Format;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

/**
 * XmlUtil :
 * 
 * @author Jos Warmer
 * @version $Id: XmlUtil.java,v 1.1 2006/03/01 18:16:11 jwarmer Exp $
 */
public class XmlUtil {

    /**
     * Read an Xml Document from <code>file</code>.
     * 
     * @param file
     * @param ignoreWhitespace
     *            If true, whitespace will be ignored
     * @return
     */
    public static Document readXmlDocument(File file, boolean ignoreWhitespace) {
        try {
            SAXBuilder builder = null;
            builder = new SAXBuilder();
            builder.setIgnoringElementContentWhitespace(ignoreWhitespace);

            Document doc = builder.build(file);
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Read an Xml Document from <code>reader</code>.
     * 
     * @param reader
     * @param ignoreWhitespace
     *            If true, whitespace will be ignored
     * @return
     * @throws JDOMException
     */
    public static Document readXmlDocument(Reader reader, boolean ignoreWhitespace) throws JDOMException {
        try {
            SAXBuilder builder = null;
            builder = new SAXBuilder();
            builder.setIgnoringElementContentWhitespace(ignoreWhitespace);

            Document doc = builder.build(reader);
            return doc;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeDocument(Document doc, FileOutputStream stream, boolean newLines, String indent) {
        try {
            XMLOutputter outputter = new XMLOutputter();
            Format format = Format.getPrettyFormat();
            if (indent != null) {
                format.setIndent(indent);
            }
            outputter.setFormat(format);
            outputter.output(doc, stream);
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }

    public static void writeDocument(Document doc, String outfilename, boolean newLines, String indent) {
        try {
            FileOutputStream stream = new FileOutputStream(new File(outfilename));
            writeDocument(doc, stream, newLines, indent);
            stream.close();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }

}
