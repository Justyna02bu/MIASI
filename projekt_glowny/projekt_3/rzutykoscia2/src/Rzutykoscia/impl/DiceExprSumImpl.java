/**
 */
package Rzutykoscia.impl;

import Rzutykoscia.DiceExprSum;
import Rzutykoscia.RzutykosciaPackage;
import Rzutykoscia.SumRule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dice Expr Sum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.impl.DiceExprSumImpl#getSumrule <em>Sumrule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiceExprSumImpl extends DiceExprImpl implements DiceExprSum {
	/**
	 * The cached value of the '{@link #getSumrule() <em>Sumrule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSumrule()
	 * @generated
	 * @ordered
	 */
	protected EList<SumRule> sumrule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiceExprSumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RzutykosciaPackage.Literals.DICE_EXPR_SUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SumRule> getSumrule() {
		if (sumrule == null) {
			sumrule = new EObjectContainmentEList<SumRule>(SumRule.class, this, RzutykosciaPackage.DICE_EXPR_SUM__SUMRULE);
		}
		return sumrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RzutykosciaPackage.DICE_EXPR_SUM__SUMRULE:
				return ((InternalEList<?>)getSumrule()).basicRemove(otherEnd, msgs);
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
			case RzutykosciaPackage.DICE_EXPR_SUM__SUMRULE:
				return getSumrule();
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
			case RzutykosciaPackage.DICE_EXPR_SUM__SUMRULE:
				getSumrule().clear();
				getSumrule().addAll((Collection<? extends SumRule>)newValue);
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
			case RzutykosciaPackage.DICE_EXPR_SUM__SUMRULE:
				getSumrule().clear();
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
			case RzutykosciaPackage.DICE_EXPR_SUM__SUMRULE:
				return sumrule != null && !sumrule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiceExprSumImpl
