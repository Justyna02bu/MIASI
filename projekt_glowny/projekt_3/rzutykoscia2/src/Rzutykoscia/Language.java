/**
 */
package Rzutykoscia;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.Language#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getLanguage()
 * @model
 * @generated
 */
public interface Language extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Główna kompozycja metamodlu
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(Stat)
	 * @see Rzutykoscia.RzutykosciaPackage#getLanguage_Statement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Stat getStatement();

	/**
	 * Sets the value of the '{@link Rzutykoscia.Language#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Stat value);

} // Language
