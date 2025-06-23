/**
 */
package Rzutykoscia;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Success Composite Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * rekurencyjne liczenie seukcesów
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.SuccessCompositeRule#getSuccessrule <em>Successrule</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getSuccessCompositeRule()
 * @model
 * @generated
 */
public interface SuccessCompositeRule extends SuccessRule {
	/**
	 * Returns the value of the '<em><b>Successrule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successrule</em>' containment reference.
	 * @see #setSuccessrule(SuccessRule)
	 * @see Rzutykoscia.RzutykosciaPackage#getSuccessCompositeRule_Successrule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SuccessRule getSuccessrule();

	/**
	 * Sets the value of the '{@link Rzutykoscia.SuccessCompositeRule#getSuccessrule <em>Successrule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successrule</em>' containment reference.
	 * @see #getSuccessrule()
	 * @generated
	 */
	void setSuccessrule(SuccessRule value);

} // SuccessCompositeRule
