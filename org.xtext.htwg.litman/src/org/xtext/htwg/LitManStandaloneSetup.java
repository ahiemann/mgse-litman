/*
 * generated by Xtext 2.21.0
 */
package org.xtext.htwg;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class LitManStandaloneSetup extends LitManStandaloneSetupGenerated {

	public static void doSetup() {
		new LitManStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
