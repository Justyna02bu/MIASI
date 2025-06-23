/**
 */
package Rzutykoscia.impl;

import Rzutykoscia.DiceDiscSum;
import Rzutykoscia.Discard;
import Rzutykoscia.RzutykosciaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dice Disc Sum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.impl.DiceDiscSumImpl#getDiscard <em>Discard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiceDiscSumImpl extends SumRuleImpl implements DiceDiscSum {
	/**
	 * The cached value of the '{@link #getDiscard() <em>Discard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscard()
	 * @generated
	 * @ordered
	 */
	protected Discard discard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiceDiscSumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RzutykosciaPackage.Literals.DICE_DISC_SUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Discard getDiscard() {
		return discard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscard(Discard newDiscard, NotificationChain msgs) {
		Discard oldDiscard = discard;
		discard = newDiscard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.DICE_DISC_SUM__DISCARD, oldDiscard, newDiscard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscard(Discard newDiscard) {
		if (newDiscard != discard) {
			NotificationChain msgs = null;
			if (discard != null)
				msgs = ((InternalEObject)discard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.DICE_DISC_SUM__DISCARD, null, msgs);
			if (newDiscard != null)
				msgs = ((InternalEObject)newDiscard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.DICE_DISC_SUM__DISCARD, null, msgs);
			msgs = basicSetDiscard(newDiscard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.DICE_DISC_SUM__DISCARD, newDiscard, newDiscard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RzutykosciaPackage.DICE_DISC_SUM__DISCARD:
				return basicSetDiscard(null, msgs);
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
			case RzutykosciaPackage.DICE_DISC_SUM__DISCARD:
				return getDiscard();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RzutykosciaPackage.DICE_DISC_SUM__DISCARD:
				setDiscard((Discard)newValue);
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
			case RzutykosciaPackage.DICE_DISC_SUM__DISCARD:
				setDiscard((Discard)null);
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
			case RzutykosciaPackage.DICE_DISC_SUM__DISCARD:
				return discard != null;
		}
		return super.eIsSet(featureID);
	}

} //DiceDiscSumImpl
