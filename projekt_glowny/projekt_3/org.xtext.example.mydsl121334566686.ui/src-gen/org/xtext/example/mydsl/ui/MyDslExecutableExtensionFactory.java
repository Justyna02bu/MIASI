/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.mydsl121334566686.ui.internal.Mydsl121334566686Activator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(Mydsl121334566686Activator.class);
	}
	
	@Override
	protected Injector getInjector() {
		Mydsl121334566686Activator activator = Mydsl121334566686Activator.getInstance();
		return activator != null ? activator.getInjector(Mydsl121334566686Activator.ORG_XTEXT_EXAMPLE_MYDSL_MYDSL) : null;
	}

}
