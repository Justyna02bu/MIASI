/**
 */
package Rzutykoscia.tests;

import Rzutykoscia.DiceMarkSuk;
import Rzutykoscia.RzutykosciaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dice Mark Suk</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiceMarkSukTest extends SuccessRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DiceMarkSukTest.class);
	}

	/**
	 * Constructs a new Dice Mark Suk test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceMarkSukTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dice Mark Suk test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DiceMarkSuk getFixture() {
		return (DiceMarkSuk)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RzutykosciaFactory.eINSTANCE.createDiceMarkSuk());
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

} //DiceMarkSukTest
