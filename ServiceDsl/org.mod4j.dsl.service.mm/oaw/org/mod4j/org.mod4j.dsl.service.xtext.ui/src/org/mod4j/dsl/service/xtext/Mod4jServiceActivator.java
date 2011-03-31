package org.mendix.dsl.service.xtext;

import org.eclipse.xtext.ui.common.service.UIPluginModule;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.mendix.eclipse.builder.Mod4jBuilder;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.Map;
import java.util.HashMap;

/**
 * Replaces the generated ServiceActivator in the src-gen folder
 * Added an initialization call to crossx.
 * 
 * Note that the MANIFEST.MF has been changed to use this class as the BundleActivator
 */
public class Mod4jServiceActivator extends AbstractUIPlugin {

	private Map<String,Injector> injectors = new HashMap<String,Injector>();
	private static Mod4jServiceActivator INSTANCE;

	public Injector getInjector(String languageName) {
		return injectors.get(languageName);
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		
		injectors.put("org.mendix.dsl.service.xtext.Service", Guice.createInjector(
			new org.mendix.dsl.service.xtext.ServiceUiModule(),
			createUIPluginModule()
		));
		crossx();
		
	}
	
	public static Mod4jServiceActivator getInstance() {
		return INSTANCE;
	}
	
	protected UIPluginModule createUIPluginModule() {
		return new UIPluginModule(this);
	}
    protected void crossx() {
        System.err.println("ServiceDslEditor.refreshPluginActions");
        Mod4jBuilder.initCrossx("ServiceDslEditorPlugin"); 
    }

}
