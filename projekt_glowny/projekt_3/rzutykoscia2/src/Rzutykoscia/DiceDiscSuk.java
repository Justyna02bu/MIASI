/**
 */
package Rzutykoscia;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dice Disc Suk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * odrzucanie sukcesów
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.DiceDiscSuk#getDiscard <em>Discard</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getDiceDiscSuk()
 * @model
 * @generated
 */
public interface DiceDiscSuk extends SuccessRule {
	/**
	 * Returns the value of the '<em><b>Discard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discard</em>' containment reference.
	 * @see #setDiscard(Discard)
	 * @see Rzutykoscia.RzutykosciaPackage#getDiceDiscSuk_Discard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Discard getDiscard();

	/**
	 * Sets the value of the '{@link Rzutykoscia.DiceDiscSuk#getDiscard <em>Discard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discard</em>' containment reference.
	 * @see #getDiscard()
	 * @generated
	 */
	void setDiscard(Discard value);

} // DiceDiscSuk
