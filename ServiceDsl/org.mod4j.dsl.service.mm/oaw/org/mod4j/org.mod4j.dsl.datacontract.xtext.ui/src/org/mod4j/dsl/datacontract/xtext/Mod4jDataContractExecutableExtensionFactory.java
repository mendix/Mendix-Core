package org.mendix.dsl.datacontract.xtext;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IExecutableExtensionFactory;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * Originally generated by Xtext in the src-gen directory.
 * This is a copy of the generated DataContractExecutableExtensionFactory.
 * This copy is changed to use the Mod4jDataContractDomainActivator instead of
 * the default DataContractActivator in the src-gen folder
 * 
 * Note that the plugin.xml has to be changed at multiple places to refer to this class instead of the original.
 */
public class Mod4jDataContractExecutableExtensionFactory implements IExecutableExtensionFactory, IExecutableExtension {

	private Logger log = Logger.getLogger(Mod4jDataContractExecutableExtensionFactory.class);
	private String clazzName;
	private IConfigurationElement config;

	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
		throws CoreException {
		if (data instanceof String) {
			clazzName = (String) data;
			this.config = config;
		}
		else {
			throw new IllegalArgumentException("couldn't handle passed data : "+data);
		}
	}
	
	public Object create() throws CoreException {
		org.mendix.dsl.datacontract.xtext.Mod4jDataContractActivator instance = org.mendix.dsl.datacontract.xtext.Mod4jDataContractActivator.getInstance();
		if (instance == null)
			throw new IllegalStateException("The bundle has not yet been activated. Make sure the Manifest.MF contains 'Bundle-ActivationPolicy: lazy'.");
		Bundle bundle = instance.getBundle();
		try {
			final Class<?> clazz = bundle.loadClass(clazzName);
			final Injector injector = org.mendix.dsl.datacontract.xtext.Mod4jDataContractActivator.getInstance().getInjector("org.mendix.dsl.datacontract.xtext.DataContract");
			final Object result = injector.getInstance(clazz);
			if (result instanceof IExecutableExtension)
				((IExecutableExtension) result).setInitializationData(config, null, null);
			return result;
		}
		catch (Exception e) {
			log.error(e);
			throw new CoreException(new Status(Status.ERROR, bundle.getSymbolicName(), e.getMessage(),e));
		}
	}
}
