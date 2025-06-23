/**
 */
package Rzutykoscia;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Success Multiplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * sukcesy wielokrotne
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.SuccessMultiplier#getSign <em>Sign</em>}</li>
 *   <li>{@link Rzutykoscia.SuccessMultiplier#getMult <em>Mult</em>}</li>
 *   <li>{@link Rzutykoscia.SuccessMultiplier#getNum <em>Num</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getSuccessMultiplier()
 * @model
 * @generated
 */
public interface SuccessMultiplier extends SuccessRule {
	/**
	 * Returns the value of the '<em><b>Sign</b></em>' attribute.
	 * The literals are from the enumeration {@link Rzutykoscia.Sign}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign</em>' attribute.
	 * @see Rzutykoscia.Sign
	 * @see #setSign(Sign)
	 * @see Rzutykoscia.RzutykosciaPackage#getSuccessMultiplier_Sign()
	 * @model required="true"
	 * @generated
	 */
	Sign getSign();

	/**
	 * Sets the value of the '{@link Rzutykoscia.SuccessMultiplier#getSign <em>Sign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign</em>' attribute.
	 * @see Rzutykoscia.Sign
	 * @see #getSign()
	 * @generated
	 */
	void setSign(Sign value);

	/**
	 * Returns the value of the '<em><b>Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult</em>' containment reference.
	 * @see #setMult(Num)
	 * @see Rzutykoscia.RzutykosciaPackage#getSuccessMultiplier_Mult()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Num getMult();

	/**
	 * Sets the value of the '{@link Rzutykoscia.SuccessMultiplier#getMult <em>Mult</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult</em>' containment reference.
	 * @see #getMult()
	 * @generated
	 */
	void setMult(Num value);

	/**
	 * Returns the value of the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num</em>' containment reference.
	 * @see #setNum(Num)
	 * @see Rzutykoscia.RzutykosciaPackage#getSuccessMultiplier_Num()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Num getNum();

	/**
	 * Sets the value of the '{@link Rzutykoscia.SuccessMultiplier#getNum <em>Num</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num</em>' containment reference.
	 * @see #getNum()
	 * @generated
	 */
	void setNum(Num value);

} // SuccessMultiplier
