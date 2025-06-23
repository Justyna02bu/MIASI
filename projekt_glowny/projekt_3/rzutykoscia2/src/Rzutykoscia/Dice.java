/**
 */
package Rzutykoscia;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * worzec odpowaidajćy na rodzaj kości
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.Dice#getSides <em>Sides</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getDice()
 * @model abstract="true"
 * @generated
 */
public interface Dice extends EObject {
	/**
	 * Returns the value of the '<em><b>Sides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sides</em>' containment reference.
	 * @see #setSides(Num)
	 * @see Rzutykoscia.RzutykosciaPackage#getDice_Sides()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Num getSides();

	/**
	 * Sets the value of the '{@link Rzutykoscia.Dice#getSides <em>Sides</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sides</em>' containment reference.
	 * @see #getSides()
	 * @generated
	 */
	void setSides(Num value);

} // Dice
