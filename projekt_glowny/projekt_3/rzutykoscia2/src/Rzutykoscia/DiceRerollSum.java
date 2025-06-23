/**
 */
package Rzutykoscia;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dice Reroll Sum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * przerzucanie kosci przy sumownaiu
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.DiceRerollSum#getReroll <em>Reroll</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getDiceRerollSum()
 * @model
 * @generated
 */
public interface DiceRerollSum extends SumRule {
	/**
	 * Returns the value of the '<em><b>Reroll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reroll</em>' containment reference.
	 * @see #setReroll(Reroll)
	 * @see Rzutykoscia.RzutykosciaPackage#getDiceRerollSum_Reroll()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reroll getReroll();

	/**
	 * Sets the value of the '{@link Rzutykoscia.DiceRerollSum#getReroll <em>Reroll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reroll</em>' containment reference.
	 * @see #getReroll()
	 * @generated
	 */
	void setReroll(Reroll value);

} // DiceRerollSum
