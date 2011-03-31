package org.mendix.dsl.service.xtext.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.xtend.typesystem.emf.check.CheckEValidatorAdapter;
import org.eclipse.xtend.typesystem.emf.check.CheckFileWithContext;
import org.eclipse.xtext.validation.CheckType;
import org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage;


public class MyServiceCheckValidator extends ServiceCheckValidator {

	public MyServiceCheckValidator() {
		configure();
	}
	
	protected void configure() {
		addCheckFile("org::mendix::dsl::service::validation::checks::ServiceChecks", CheckType.FAST);
		addCheckFile("org::mendix::dsl::service::validation::checks::CrossxChecks", CheckType.FAST);

	}

	@Override
	protected List<? extends EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(ServiceDslPackage.eINSTANCE);
		return result;
	}

}
