/**
 */
package Rzutykoscia.tests;

import Rzutykoscia.RzutykosciaFactory;
import Rzutykoscia.SuccessMultiplier;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Success Multiplier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuccessMultiplierTest extends SuccessRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SuccessMultiplierTest.class);
	}

	/**
	 * Constructs a new Success Multiplier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccessMultiplierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Success Multiplier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SuccessMultiplier getFixture() {
		return (SuccessMultiplier)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RzutykosciaFactory.eINSTANCE.createSuccessMultiplier());
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

} //SuccessMultiplierTest
