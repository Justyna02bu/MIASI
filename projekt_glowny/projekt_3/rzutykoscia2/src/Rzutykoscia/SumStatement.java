/**
 */
package Rzutykoscia;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SUMUJ
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.SumStatement#getDiceexprsum <em>Diceexprsum</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getSumStatement()
 * @model
 * @generated
 */
public interface SumStatement extends Stat {
	/**
	 * Returns the value of the '<em><b>Diceexprsum</b></em>' containment reference list.
	 * The list contents are of type {@link Rzutykoscia.DiceExprSum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lista wyrażeń SUMUJ
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diceexprsum</em>' containment reference list.
	 * @see Rzutykoscia.RzutykosciaPackage#getSumStatement_Diceexprsum()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DiceExprSum> getDiceexprsum();

} // SumStatement
