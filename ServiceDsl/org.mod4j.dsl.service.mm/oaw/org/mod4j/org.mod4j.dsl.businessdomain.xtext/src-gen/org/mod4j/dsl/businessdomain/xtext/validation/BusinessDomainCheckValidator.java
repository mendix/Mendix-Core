
package org.mendix.dsl.businessdomain.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.CheckType;

public class BusinessDomainCheckValidator extends org.eclipse.xtext.check.AbstractCheckValidator {

	public BusinessDomainCheckValidator() {
		configure();
	}
	
	protected void configure() {
		addCheckFile("org::mendix::dsl::businessdomain::xtext::validation::BusinessDomainFastChecks", CheckType.FAST);
		addCheckFile("org::mendix::dsl::businessdomain::xtext::validation::BusinessDomainChecks", CheckType.NORMAL);
		addCheckFile("org::mendix::dsl::businessdomain::xtext::validation::BusinessDomainExpensiveChecks", CheckType.EXPENSIVE);
	}
	
	@Override
	protected List<? extends EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
		return result;
	}
	
}
