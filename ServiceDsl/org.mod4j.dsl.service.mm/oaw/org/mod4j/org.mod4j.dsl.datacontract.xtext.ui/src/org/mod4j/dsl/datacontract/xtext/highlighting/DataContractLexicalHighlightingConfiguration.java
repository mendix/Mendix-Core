package org.mendix.dsl.datacontract.xtext.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.DefaultLexicalHighlightingConfiguration;
import org.eclipse.xtext.ui.core.editor.utils.TextStyle;

public class DataContractLexicalHighlightingConfiguration extends DefaultLexicalHighlightingConfiguration {
	
	@Override
	public TextStyle keywordTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(151, 0, 184));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	@Override
	public TextStyle stringTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(100, 100, 150));
		return textStyle;
	}
}
