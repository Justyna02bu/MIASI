/**
 */
package Rzutykoscia.tests;

import Rzutykoscia.DiscardKol;
import Rzutykoscia.RzutykosciaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Discard Kol</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscardKolTest extends DiscardTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DiscardKolTest.class);
	}

	/**
	 * Constructs a new Discard Kol test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscardKolTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Discard Kol test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DiscardKol getFixture() {
		return (DiscardKol)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RzutykosciaFactory.eINSTANCE.createDiscardKol());
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

} //DiscardKolTest
