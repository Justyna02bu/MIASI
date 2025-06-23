/**
 */
package Rzutykoscia;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * fragment odpowiadajacy za operacje doatkowe na wyniku (mnożenie, dodawanie, odejmowanie, dzielnie)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.FormExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link Rzutykoscia.FormExpr#getRight <em>Right</em>}</li>
 *   <li>{@link Rzutykoscia.FormExpr#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getFormExpr()
 * @model
 * @generated
 */
public interface FormExpr extends EObject {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rzut kością
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Dice)
	 * @see Rzutykoscia.RzutykosciaPackage#getFormExpr_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dice getLeft();

	/**
	 * Sets the value of the '{@link Rzutykoscia.FormExpr#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Dice value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 	Drugi operand (jeśli występuje)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Num)
	 * @see Rzutykoscia.RzutykosciaPackage#getFormExpr_Right()
	 * @model containment="true"
	 * @generated
	 */
	Num getRight();

	/**
	 * Sets the value of the '{@link Rzutykoscia.FormExpr#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Num value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link Rzutykoscia.Operator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see Rzutykoscia.Operator
	 * @see #setOperator(Operator)
	 * @see Rzutykoscia.RzutykosciaPackage#getFormExpr_Operator()
	 * @model
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link Rzutykoscia.FormExpr#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see Rzutykoscia.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

} // FormExpr
