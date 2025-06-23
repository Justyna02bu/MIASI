/**
 */
package Rzutykoscia.impl;

import Rzutykoscia.DiceExprSuk;
import Rzutykoscia.RzutykosciaPackage;
import Rzutykoscia.SuccessStatement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Success Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.impl.SuccessStatementImpl#getDiceexprsuk <em>Diceexprsuk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuccessStatementImpl extends StatImpl implements SuccessStatement {
	/**
	 * The cached value of the '{@link #getDiceexprsuk() <em>Diceexprsuk</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiceexprsuk()
	 * @generated
	 * @ordered
	 */
	protected EList<DiceExprSuk> diceexprsuk;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuccessStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RzutykosciaPackage.Literals.SUCCESS_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiceExprSuk> getDiceexprsuk() {
		if (diceexprsuk == null) {
			diceexprsuk = new EObjectContainmentEList<DiceExprSuk>(DiceExprSuk.class, this, RzutykosciaPackage.SUCCESS_STATEMENT__DICEEXPRSUK);
		}
		return diceexprsuk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RzutykosciaPackage.SUCCESS_STATEMENT__DICEEXPRSUK:
				return ((InternalEList<?>)getDiceexprsuk()).basicRemove(otherEnd, msgs);
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
			case RzutykosciaPackage.SUCCESS_STATEMENT__DICEEXPRSUK:
				return getDiceexprsuk();
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
			case RzutykosciaPackage.SUCCESS_STATEMENT__DICEEXPRSUK:
				getDiceexprsuk().clear();
				getDiceexprsuk().addAll((Collection<? extends DiceExprSuk>)newValue);
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
			case RzutykosciaPackage.SUCCESS_STATEMENT__DICEEXPRSUK:
				getDiceexprsuk().clear();
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
			case RzutykosciaPackage.SUCCESS_STATEMENT__DICEEXPRSUK:
				return diceexprsuk != null && !diceexprsuk.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SuccessStatementImpl
