
package org.mendix.dsl.datacontract.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend.typesystem.emf.check.CheckEValidatorAdapter;
import org.eclipse.xtend.typesystem.emf.check.CheckFileWithContext;
import org.eclipse.xtext.validation.CheckType;
import org.mendix.crossx.mm.crossx.CrossxPackage;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage;

public class MyDataContractCheckValidator extends DataContractCheckValidator {

	public MyDataContractCheckValidator() {
		configure();
	}
	
	protected void configure() {
//        addCheckFile("org::mendix::dsl::datacontract::xtext::validation::CrossxChecks1", CheckType.FAST);
        addCheckFile("org::mendix::dsl::datacontract::validation::checks::CrossxChecks", CheckType.FAST);
		addCheckFile("org::mendix::dsl::datacontract::validation::checks::DatacontractChecks", CheckType.FAST);
	}
	
	protected void registerCrossx() {
		// Create a resource set to hold the resources.
		//
		EPackage.Registry.INSTANCE.put(CrossxPackage.eNS_URI, CrossxPackage.eINSTANCE);
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// Register the appropriate resource factory to handle all file extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
			 new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put
			(CrossxPackage.eNS_URI, 
			 CrossxPackage.eINSTANCE);

	}

	@Override
	protected List<? extends EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage.eINSTANCE);
//	    result.add(org.mendix.crossx.mm.crossx.CrossxPackage.eINSTANCE);
		return result;
	}

}
