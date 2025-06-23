/**
 */
package Rzutykoscia;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mark High</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.MarkHigh#getHightlow <em>Hightlow</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getMarkHigh()
 * @model
 * @generated
 */
public interface MarkHigh extends Mark {
	/**
	 * Returns the value of the '<em><b>Hightlow</b></em>' attribute.
	 * The literals are from the enumeration {@link Rzutykoscia.HighLow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hightlow</em>' attribute.
	 * @see Rzutykoscia.HighLow
	 * @see #setHightlow(HighLow)
	 * @see Rzutykoscia.RzutykosciaPackage#getMarkHigh_Hightlow()
	 * @model required="true"
	 * @generated
	 */
	HighLow getHightlow();

	/**
	 * Sets the value of the '{@link Rzutykoscia.MarkHigh#getHightlow <em>Hightlow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hightlow</em>' attribute.
	 * @see Rzutykoscia.HighLow
	 * @see #getHightlow()
	 * @generated
	 */
	void setHightlow(HighLow value);

} // MarkHigh
