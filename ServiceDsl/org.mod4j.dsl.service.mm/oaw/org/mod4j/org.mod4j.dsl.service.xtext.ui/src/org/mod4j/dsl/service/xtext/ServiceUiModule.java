/*
 * generated by Xtext
 */
package org.mendix.dsl.service.xtext;

import org.eclipse.xtext.ui.common.editor.syntaxcoloring.ILexicalHighlightingConfiguration;
import org.mendix.dsl.service.xtext.highlighting.ServiceLexicalHighlightingConfiguration;

/**
 * Use this class to register components to be used within the IDE.
 */
public class ServiceUiModule extends org.mendix.dsl.service.xtext.AbstractServiceUiModule {

    public Class<? extends ILexicalHighlightingConfiguration> bindILexicalHighlightingConfiguration() {
        return ServiceLexicalHighlightingConfiguration.class;
    }


}
