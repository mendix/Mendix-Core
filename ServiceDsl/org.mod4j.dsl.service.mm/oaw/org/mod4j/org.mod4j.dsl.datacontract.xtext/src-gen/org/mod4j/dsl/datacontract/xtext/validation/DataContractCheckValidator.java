
package org.mendix.dsl.datacontract.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.CheckType;

public class DataContractCheckValidator extends org.eclipse.xtext.check.AbstractCheckValidator {

	public DataContractCheckValidator() {
		configure();
	}
	
	protected void configure() {
		addCheckFile("org::mendix::dsl::datacontract::xtext::validation::DataContractFastChecks", CheckType.FAST);
		addCheckFile("org::mendix::dsl::datacontract::xtext::validation::DataContractChecks", CheckType.NORMAL);
		addCheckFile("org::mendix::dsl::datacontract::xtext::validation::DataContractExpensiveChecks", CheckType.EXPENSIVE);
	}
	
	@Override
	protected List<? extends EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
		return result;
	}
	
}
