/**
 */
package Rzutykoscia.tests;

import Rzutykoscia.RzutykosciaFactory;
import Rzutykoscia.SuccessBasic;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Success Basic</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuccessBasicTest extends SuccessRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SuccessBasicTest.class);
	}

	/**
	 * Constructs a new Success Basic test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccessBasicTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Success Basic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SuccessBasic getFixture() {
		return (SuccessBasic)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RzutykosciaFactory.eINSTANCE.createSuccessBasic());
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

} //SuccessBasicTest
