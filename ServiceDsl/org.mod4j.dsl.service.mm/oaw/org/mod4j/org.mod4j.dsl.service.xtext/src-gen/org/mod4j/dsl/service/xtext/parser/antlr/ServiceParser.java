/*
* generated by Xtext
*/
package org.mendix.dsl.service.xtext.parser.antlr;

import org.antlr.runtime.ANTLRInputStream;
import org.eclipse.xtext.parser.antlr.ITokenDefProvider;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.ParseException;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

import com.google.inject.Inject;

import org.mendix.dsl.service.xtext.services.ServiceGrammarAccess;

public class ServiceParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject 
    protected ITokenDefProvider antlrTokenDefProvider;
	
	@Inject
	private ServiceGrammarAccess grammarAccess;
	
	@Override
	protected IParseResult parse(String ruleName, ANTLRInputStream in) {
		org.mendix.dsl.service.xtext.parser.antlr.internal.InternalServiceLexer lexer = new org.mendix.dsl.service.xtext.parser.antlr.internal.InternalServiceLexer(in);
		XtextTokenStream stream = new XtextTokenStream(lexer, antlrTokenDefProvider);
		stream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
		org.mendix.dsl.service.xtext.parser.antlr.internal.InternalServiceParser parser = new org.mendix.dsl.service.xtext.parser.antlr.internal.InternalServiceParser(
				stream, getElementFactory(), grammarAccess);
		parser.setTokenTypeMap(antlrTokenDefProvider.getTokenDefMap());
		try {
			if(ruleName != null)
				return parser.parse(ruleName);
			return parser.parse();
		} catch (Exception re) {
			throw new ParseException(re.getMessage(),re);
		}
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "ServiceModel";
	}
	
	public ServiceGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ServiceGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}