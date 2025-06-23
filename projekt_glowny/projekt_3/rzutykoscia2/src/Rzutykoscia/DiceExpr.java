/**
 */
package Rzutykoscia;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dice Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Klasa będąca wzorcem dla rzutów kością zależnie czy ją to sumy czy sukcesy
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.DiceExpr#getMulexpr <em>Mulexpr</em>}</li>
 *   <li>{@link Rzutykoscia.DiceExpr#getSign <em>Sign</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getDiceExpr()
 * @model abstract="true"
 * @generated
 */
public interface DiceExpr extends EObject {
	/**
	 * Returns the value of the '<em><b>Mulexpr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 	Wyrażenie mnożenia lub nie
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mulexpr</em>' containment reference.
	 * @see #setMulexpr(MulExpr)
	 * @see Rzutykoscia.RzutykosciaPackage#getDiceExpr_Mulexpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MulExpr getMulexpr();

	/**
	 * Sets the value of the '{@link Rzutykoscia.DiceExpr#getMulexpr <em>Mulexpr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mulexpr</em>' containment reference.
	 * @see #getMulexpr()
	 * @generated
	 */
	void setMulexpr(MulExpr value);

	/**
	 * Returns the value of the '<em><b>Sign</b></em>' attribute.
	 * The literals are from the enumeration {@link Rzutykoscia.Sign}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign</em>' attribute.
	 * @see Rzutykoscia.Sign
	 * @see #setSign(Sign)
	 * @see Rzutykoscia.RzutykosciaPackage#getDiceExpr_Sign()
	 * @model
	 * @generated
	 */
	Sign getSign();

	/**
	 * Sets the value of the '{@link Rzutykoscia.DiceExpr#getSign <em>Sign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign</em>' attribute.
	 * @see Rzutykoscia.Sign
	 * @see #getSign()
	 * @generated
	 */
	void setSign(Sign value);

} // DiceExpr
