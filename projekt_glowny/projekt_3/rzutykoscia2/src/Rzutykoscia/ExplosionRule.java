/**
 */
package Rzutykoscia;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explosion Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * element odpowiedzialny za eksplodujace kości 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.ExplosionRule#getNum <em>Num</em>}</li>
 *   <li>{@link Rzutykoscia.ExplosionRule#getSign <em>Sign</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getExplosionRule()
 * @model
 * @generated
 */
public interface ExplosionRule extends SumRule {
	/**
	 * Returns the value of the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num</em>' containment reference.
	 * @see #setNum(Num)
	 * @see Rzutykoscia.RzutykosciaPackage#getExplosionRule_Num()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Num getNum();

	/**
	 * Sets the value of the '{@link Rzutykoscia.ExplosionRule#getNum <em>Num</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num</em>' containment reference.
	 * @see #getNum()
	 * @generated
	 */
	void setNum(Num value);

	/**
	 * Returns the value of the '<em><b>Sign</b></em>' attribute.
	 * The literals are from the enumeration {@link Rzutykoscia.Sign}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign</em>' attribute.
	 * @see Rzutykoscia.Sign
	 * @see #setSign(Sign)
	 * @see Rzutykoscia.RzutykosciaPackage#getExplosionRule_Sign()
	 * @model required="true"
	 * @generated
	 */
	Sign getSign();

	/**
	 * Sets the value of the '{@link Rzutykoscia.ExplosionRule#getSign <em>Sign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign</em>' attribute.
	 * @see Rzutykoscia.Sign
	 * @see #getSign()
	 * @generated
	 */
	void setSign(Sign value);

} // ExplosionRule
