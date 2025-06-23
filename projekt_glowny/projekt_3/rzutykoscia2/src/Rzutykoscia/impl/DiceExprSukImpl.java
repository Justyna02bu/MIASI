/**
 */
package Rzutykoscia.impl;

import Rzutykoscia.DiceExprSuk;
import Rzutykoscia.RzutykosciaPackage;
import Rzutykoscia.SuccessRule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dice Expr Suk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.impl.DiceExprSukImpl#getSuccessrule <em>Successrule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiceExprSukImpl extends DiceExprImpl implements DiceExprSuk {
	/**
	 * The cached value of the '{@link #getSuccessrule() <em>Successrule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessrule()
	 * @generated
	 * @ordered
	 */
	protected EList<SuccessRule> successrule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiceExprSukImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RzutykosciaPackage.Literals.DICE_EXPR_SUK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuccessRule> getSuccessrule() {
		if (successrule == null) {
			successrule = new EObjectContainmentEList<SuccessRule>(SuccessRule.class, this, RzutykosciaPackage.DICE_EXPR_SUK__SUCCESSRULE);
		}
		return successrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RzutykosciaPackage.DICE_EXPR_SUK__SUCCESSRULE:
				return ((InternalEList<?>)getSuccessrule()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RzutykosciaPackage.DICE_EXPR_SUK__SUCCESSRULE:
				return getSuccessrule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RzutykosciaPackage.DICE_EXPR_SUK__SUCCESSRULE:
				getSuccessrule().clear();
				getSuccessrule().addAll((Collection<? extends SuccessRule>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RzutykosciaPackage.DICE_EXPR_SUK__SUCCESSRULE:
				getSuccessrule().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RzutykosciaPackage.DICE_EXPR_SUK__SUCCESSRULE:
				return successrule != null && !successrule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiceExprSukImpl
