/**
 */
package Rzutykoscia;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dice Expr Sum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * rzuty kością z sumą, konkretnie kontener na zasady
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.DiceExprSum#getSumrule <em>Sumrule</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getDiceExprSum()
 * @model
 * @generated
 */
public interface DiceExprSum extends DiceExpr {
	/**
	 * Returns the value of the '<em><b>Sumrule</b></em>' containment reference list.
	 * The list contents are of type {@link Rzutykoscia.SumRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reguły sumowania
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sumrule</em>' containment reference list.
	 * @see Rzutykoscia.RzutykosciaPackage#getDiceExprSum_Sumrule()
	 * @model containment="true"
	 * @generated
	 */
	EList<SumRule> getSumrule();

} // DiceExprSum
