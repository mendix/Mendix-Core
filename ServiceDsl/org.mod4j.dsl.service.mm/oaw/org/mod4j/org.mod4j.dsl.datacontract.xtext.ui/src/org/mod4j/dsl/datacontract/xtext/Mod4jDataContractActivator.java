package org.mendix.dsl.datacontract.xtext;

import org.eclipse.xtext.ui.common.service.UIPluginModule;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.mendix.eclipse.builder.Mod4jBuilder;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.Map;
import java.util.HashMap;

/**
 * Replaces the generated DataContractActivator in the src-gen folder
 * Added an initialization call to crossx.
 * 
 * Note that the MANIFEST.MF has been changed to use this class as the BundleActivator
 */
public class Mod4jDataContractActivator extends AbstractUIPlugin {

	private Map<String,Injector> injectors = new HashMap<String,Injector>();
	private static Mod4jDataContractActivator INSTANCE;

	public Injector getInjector(String languageName) {
		return injectors.get(languageName);
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		
		injectors.put("org.mendix.dsl.datacontract.xtext.DataContract", Guice.createInjector(
			new org.mendix.dsl.datacontract.xtext.DataContractUiModule(),
			createUIPluginModule()
		));
		crossx();
	}
	
	public static Mod4jDataContractActivator getInstance() {
		return INSTANCE;
	}
	
	protected UIPluginModule createUIPluginModule() {
		return new UIPluginModule(this);
	}

    protected void crossx() {
        System.err.println("DataContractDslEditor.refreshPluginActions");
        Mod4jBuilder.initCrossx("DataContractDslEditorPlugin"); 
    }

}
