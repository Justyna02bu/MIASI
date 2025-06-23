/**
 */
package Rzutykoscia.tests;

import Rzutykoscia.RzutykosciaFactory;
import Rzutykoscia.SuccessCompositeRule;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Success Composite Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuccessCompositeRuleTest extends SuccessRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SuccessCompositeRuleTest.class);
	}

	/**
	 * Constructs a new Success Composite Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccessCompositeRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Success Composite Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SuccessCompositeRule getFixture() {
		return (SuccessCompositeRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RzutykosciaFactory.eINSTANCE.createSuccessCompositeRule());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SuccessCompositeRuleTest
