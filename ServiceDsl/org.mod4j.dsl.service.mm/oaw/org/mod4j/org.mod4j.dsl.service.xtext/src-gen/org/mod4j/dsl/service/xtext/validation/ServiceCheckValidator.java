
package org.mendix.dsl.service.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.CheckType;

public class ServiceCheckValidator extends org.eclipse.xtext.check.AbstractCheckValidator {

	public ServiceCheckValidator() {
		configure();
	}
	
	protected void configure() {
		addCheckFile("org::mendix::dsl::service::xtext::validation::ServiceFastChecks", CheckType.FAST);
		addCheckFile("org::mendix::dsl::service::xtext::validation::ServiceChecks", CheckType.NORMAL);
		addCheckFile("org::mendix::dsl::service::xtext::validation::ServiceExpensiveChecks", CheckType.EXPENSIVE);
	}
	
	@Override
	protected List<? extends EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
		return result;
	}
	
}
