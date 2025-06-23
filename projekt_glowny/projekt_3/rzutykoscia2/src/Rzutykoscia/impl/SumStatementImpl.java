/**
 */
package Rzutykoscia.impl;

import Rzutykoscia.DiceExprSum;
import Rzutykoscia.RzutykosciaPackage;
import Rzutykoscia.SumStatement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sum Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.impl.SumStatementImpl#getDiceexprsum <em>Diceexprsum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SumStatementImpl extends StatImpl implements SumStatement {
	/**
	 * The cached value of the '{@link #getDiceexprsum() <em>Diceexprsum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiceexprsum()
	 * @generated
	 * @ordered
	 */
	protected EList<DiceExprSum> diceexprsum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SumStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RzutykosciaPackage.Literals.SUM_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiceExprSum> getDiceexprsum() {
		if (diceexprsum == null) {
			diceexprsum = new EObjectContainmentEList<DiceExprSum>(DiceExprSum.class, this, RzutykosciaPackage.SUM_STATEMENT__DICEEXPRSUM);
		}
		return diceexprsum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RzutykosciaPackage.SUM_STATEMENT__DICEEXPRSUM:
				return ((InternalEList<?>)getDiceexprsum()).basicRemove(otherEnd, msgs);
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
			case RzutykosciaPackage.SUM_STATEMENT__DICEEXPRSUM:
				return getDiceexprsum();
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
			case RzutykosciaPackage.SUM_STATEMENT__DICEEXPRSUM:
				getDiceexprsum().clear();
				getDiceexprsum().addAll((Collection<? extends DiceExprSum>)newValue);
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
			case RzutykosciaPackage.SUM_STATEMENT__DICEEXPRSUM:
				getDiceexprsum().clear();
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
			case RzutykosciaPackage.SUM_STATEMENT__DICEEXPRSUM:
				return diceexprsum != null && !diceexprsum.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SumStatementImpl
