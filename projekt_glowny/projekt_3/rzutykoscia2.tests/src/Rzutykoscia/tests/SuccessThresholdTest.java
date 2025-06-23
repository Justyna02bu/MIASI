/**
 */
package Rzutykoscia.tests;

import Rzutykoscia.RzutykosciaFactory;
import Rzutykoscia.SuccessThreshold;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Success Threshold</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuccessThresholdTest extends SuccessRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SuccessThresholdTest.class);
	}

	/**
	 * Constructs a new Success Threshold test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccessThresholdTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Success Threshold test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SuccessThreshold getFixture() {
		return (SuccessThreshold)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RzutykosciaFactory.eINSTANCE.createSuccessThreshold());
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

} //SuccessThresholdTest
