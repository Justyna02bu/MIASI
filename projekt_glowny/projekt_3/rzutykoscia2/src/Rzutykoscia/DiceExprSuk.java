/**
 */
package Rzutykoscia;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dice Expr Suk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * rzytu kością z sukcesami, konkretnie kontener na zasady
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.DiceExprSuk#getSuccessrule <em>Successrule</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getDiceExprSuk()
 * @model
 * @generated
 */
public interface DiceExprSuk extends DiceExpr {
	/**
	 * Returns the value of the '<em><b>Successrule</b></em>' containment reference list.
	 * The list contents are of type {@link Rzutykoscia.SuccessRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 	Reguły sukcesów
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Successrule</em>' containment reference list.
	 * @see Rzutykoscia.RzutykosciaPackage#getDiceExprSuk_Successrule()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuccessRule> getSuccessrule();

} // DiceExprSuk
