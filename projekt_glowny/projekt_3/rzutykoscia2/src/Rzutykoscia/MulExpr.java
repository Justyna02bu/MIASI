/**
 */
package Rzutykoscia;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mul Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * odpowida za to ile razy ma byc wykonany dany rzut
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.MulExpr#getNum <em>Num</em>}</li>
 *   <li>{@link Rzutykoscia.MulExpr#getFormexpr <em>Formexpr</em>}</li>
 * </ul>
 *
 * @see Rzutykoscia.RzutykosciaPackage#getMulExpr()
 * @model
 * @generated
 */
public interface MulExpr extends EObject {
	/**
	 * Returns the value of the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 	Ile razy powtórzyć rzut (opcjonalne)
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num</em>' containment reference.
	 * @see #setNum(Num)
	 * @see Rzutykoscia.RzutykosciaPackage#getMulExpr_Num()
	 * @model containment="true"
	 * @generated
	 */
	Num getNum();

	/**
	 * Sets the value of the '{@link Rzutykoscia.MulExpr#getNum <em>Num</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num</em>' containment reference.
	 * @see #getNum()
	 * @generated
	 */
	void setNum(Num value);

	/**
	 * Returns the value of the '<em><b>Formexpr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wyrażenie bazowe (kostki)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formexpr</em>' containment reference.
	 * @see #setFormexpr(FormExpr)
	 * @see Rzutykoscia.RzutykosciaPackage#getMulExpr_Formexpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FormExpr getFormexpr();

	/**
	 * Sets the value of the '{@link Rzutykoscia.MulExpr#getFormexpr <em>Formexpr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formexpr</em>' containment reference.
	 * @see #getFormexpr()
	 * @generated
	 */
	void setFormexpr(FormExpr value);

} // MulExpr
