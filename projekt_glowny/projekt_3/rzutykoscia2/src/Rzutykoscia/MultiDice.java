/**
 */
package Rzutykoscia;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Dice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * dla kości wielokrotnycch
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.MultiDice#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getMultiDice()
 * @model
 * @generated
 */
public interface MultiDice extends Dice {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(Num)
	 * @see Rzutykoscia.RzutykosciaPackage#getMultiDice_Count()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Num getCount();

	/**
	 * Sets the value of the '{@link Rzutykoscia.MultiDice#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(Num value);

} // MultiDice
