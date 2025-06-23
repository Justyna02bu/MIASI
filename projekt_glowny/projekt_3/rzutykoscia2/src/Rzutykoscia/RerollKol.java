/**
 */
package Rzutykoscia;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reroll Kol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.RerollKol#getNum <em>Num</em>}</li>
 *   <li>{@link Rzutykoscia.RerollKol#getFirstlast <em>Firstlast</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getRerollKol()
 * @model
 * @generated
 */
public interface RerollKol extends Reroll {
	/**
	 * Returns the value of the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num</em>' containment reference.
	 * @see #setNum(Num)
	 * @see Rzutykoscia.RzutykosciaPackage#getRerollKol_Num()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Num getNum();

	/**
	 * Sets the value of the '{@link Rzutykoscia.RerollKol#getNum <em>Num</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num</em>' containment reference.
	 * @see #getNum()
	 * @generated
	 */
	void setNum(Num value);

	/**
	 * Returns the value of the '<em><b>Firstlast</b></em>' attribute.
	 * The literals are from the enumeration {@link Rzutykoscia.FirstLast}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstlast</em>' attribute.
	 * @see Rzutykoscia.FirstLast
	 * @see #setFirstlast(FirstLast)
	 * @see Rzutykoscia.RzutykosciaPackage#getRerollKol_Firstlast()
	 * @model required="true"
	 * @generated
	 */
	FirstLast getFirstlast();

	/**
	 * Sets the value of the '{@link Rzutykoscia.RerollKol#getFirstlast <em>Firstlast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstlast</em>' attribute.
	 * @see Rzutykoscia.FirstLast
	 * @see #getFirstlast()
	 * @generated
	 */
	void setFirstlast(FirstLast value);

} // RerollKol
