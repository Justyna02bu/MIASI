/**
 */
package Rzutykoscia.tests;

import Rzutykoscia.DiceRerollSuk;
import Rzutykoscia.RzutykosciaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dice Reroll Suk</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiceRerollSukTest extends SuccessRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DiceRerollSukTest.class);
	}

	/**
	 * Constructs a new Dice Reroll Suk test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceRerollSukTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dice Reroll Suk test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DiceRerollSuk getFixture() {
		return (DiceRerollSuk)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RzutykosciaFactory.eINSTANCE.createDiceRerollSuk());
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

} //DiceRerollSukTest
