/**
 */
package Rzutykoscia;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dice Mark Sum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * oznaczanie kosci przy sumownaiu
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.DiceMarkSum#getMark <em>Mark</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getDiceMarkSum()
 * @model
 * @generated
 */
public interface DiceMarkSum extends SumRule {
	/**
	 * Returns the value of the '<em><b>Mark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mark</em>' containment reference.
	 * @see #setMark(Mark)
	 * @see Rzutykoscia.RzutykosciaPackage#getDiceMarkSum_Mark()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Mark getMark();

	/**
	 * Sets the value of the '{@link Rzutykoscia.DiceMarkSum#getMark <em>Mark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark</em>' containment reference.
	 * @see #getMark()
	 * @generated
	 */
	void setMark(Mark value);

} // DiceMarkSum
