/*
 * generated by Xtext 2.21.0
 */
package org.xtext.htwg.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.htwg.litman.ui.internal.LitmanActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LitManExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(LitmanActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		LitmanActivator activator = LitmanActivator.getInstance();
		return activator != null ? activator.getInjector(LitmanActivator.ORG_XTEXT_HTWG_LITMAN) : null;
	}

}
