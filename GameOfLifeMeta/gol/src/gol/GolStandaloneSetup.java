/*
 * generated by Xtext 2.32.0
 */
package gol;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class GolStandaloneSetup extends GolStandaloneSetupGenerated {

	public static void doSetup() {
		new GolStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}