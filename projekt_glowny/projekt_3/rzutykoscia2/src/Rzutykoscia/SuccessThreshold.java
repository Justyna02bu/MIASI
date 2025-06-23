/**
 */
package Rzutykoscia;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Success Threshold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Liczenie sukcesów gdy więcej niż/mniejsze niż
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.SuccessThreshold#getHightlow <em>Hightlow</em>}</li>
 *   <li>{@link Rzutykoscia.SuccessThreshold#getNum <em>Num</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getSuccessThreshold()
 * @model
 * @generated
 */
public interface SuccessThreshold extends SuccessRule {
	/**
	 * Returns the value of the '<em><b>Hightlow</b></em>' attribute.
	 * The literals are from the enumeration {@link Rzutykoscia.HighLow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hightlow</em>' attribute.
	 * @see Rzutykoscia.HighLow
	 * @see #setHightlow(HighLow)
	 * @see Rzutykoscia.RzutykosciaPackage#getSuccessThreshold_Hightlow()
	 * @model required="true"
	 * @generated
	 */
	HighLow getHightlow();

	/**
	 * Sets the value of the '{@link Rzutykoscia.SuccessThreshold#getHightlow <em>Hightlow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hightlow</em>' attribute.
	 * @see Rzutykoscia.HighLow
	 * @see #getHightlow()
	 * @generated
	 */
	void setHightlow(HighLow value);

	/**
	 * Returns the value of the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num</em>' containment reference.
	 * @see #setNum(Num)
	 * @see Rzutykoscia.RzutykosciaPackage#getSuccessThreshold_Num()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Num getNum();

	/**
	 * Sets the value of the '{@link Rzutykoscia.SuccessThreshold#getNum <em>Num</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num</em>' containment reference.
	 * @see #getNum()
	 * @generated
	 */
	void setNum(Num value);

} // SuccessThreshold
