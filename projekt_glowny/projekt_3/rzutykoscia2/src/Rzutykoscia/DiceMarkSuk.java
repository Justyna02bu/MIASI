/**
 */
package Rzutykoscia;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dice Mark Suk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ozanzanie sukcwsów
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.DiceMarkSuk#getMark <em>Mark</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getDiceMarkSuk()
 * @model
 * @generated
 */
public interface DiceMarkSuk extends SuccessRule {
	/**
	 * Returns the value of the '<em><b>Mark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mark</em>' containment reference.
	 * @see #setMark(Mark)
	 * @see Rzutykoscia.RzutykosciaPackage#getDiceMarkSuk_Mark()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Mark getMark();

	/**
	 * Sets the value of the '{@link Rzutykoscia.DiceMarkSuk#getMark <em>Mark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark</em>' containment reference.
	 * @see #getMark()
	 * @generated
	 */
	void setMark(Mark value);

} // DiceMarkSuk
