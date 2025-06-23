/**
 */
package Rzutykoscia.tests;

import Rzutykoscia.DiceRerollSum;
import Rzutykoscia.RzutykosciaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dice Reroll Sum</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiceRerollSumTest extends SumRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DiceRerollSumTest.class);
	}

	/**
	 * Constructs a new Dice Reroll Sum test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceRerollSumTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dice Reroll Sum test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DiceRerollSum getFixture() {
		return (DiceRerollSum)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RzutykosciaFactory.eINSTANCE.createDiceRerollSum());
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

} //DiceRerollSumTest
