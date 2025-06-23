/**
 */
package Rzutykoscia;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reroll Num</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.RerollNum#getNum <em>Num</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getRerollNum()
 * @model
 * @generated
 */
public interface RerollNum extends Reroll {
	/**
	 * Returns the value of the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num</em>' containment reference.
	 * @see #setNum(Num)
	 * @see Rzutykoscia.RzutykosciaPackage#getRerollNum_Num()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Num getNum();

	/**
	 * Sets the value of the '{@link Rzutykoscia.RerollNum#getNum <em>Num</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num</em>' containment reference.
	 * @see #getNum()
	 * @generated
	 */
	void setNum(Num value);

} // RerollNum
