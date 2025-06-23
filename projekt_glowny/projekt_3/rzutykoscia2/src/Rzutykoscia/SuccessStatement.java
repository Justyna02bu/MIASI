/**
 */
package Rzutykoscia;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Success Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SUKCESY
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.SuccessStatement#getDiceexprsuk <em>Diceexprsuk</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getSuccessStatement()
 * @model
 * @generated
 */
public interface SuccessStatement extends Stat {
	/**
	 * Returns the value of the '<em><b>Diceexprsuk</b></em>' containment reference list.
	 * The list contents are of type {@link Rzutykoscia.DiceExprSuk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lista wyrażeń SUKCESY
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diceexprsuk</em>' containment reference list.
	 * @see Rzutykoscia.RzutykosciaPackage#getSuccessStatement_Diceexprsuk()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DiceExprSuk> getDiceexprsuk();

} // SuccessStatement
