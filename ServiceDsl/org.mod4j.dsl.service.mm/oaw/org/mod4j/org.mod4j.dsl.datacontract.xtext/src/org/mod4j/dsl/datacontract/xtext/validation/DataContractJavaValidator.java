package org.mendix.dsl.datacontract.xtext.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
 

public class DataContractJavaValidator extends AbstractDataContractJavaValidator {

//	@Check
//	public void checkTypeNameStartsWithCapital(Type type) {
//		if (!Character.isUpperCase(type.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.TYPE__NAME);
//		}
//	}

	@Override
	protected List<? extends EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage.eINSTANCE);
	    result.add(org.mendix.crossx.mm.crossx.CrossxPackage.eINSTANCE);
		return result;
	}

}
