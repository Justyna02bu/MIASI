/**
 */
package Rzutykoscia.impl;

import Rzutykoscia.Dice;
import Rzutykoscia.Num;
import Rzutykoscia.RzutykosciaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.impl.DiceImpl#getSides <em>Sides</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiceImpl extends MinimalEObjectImpl.Container implements Dice {
	/**
	 * The cached value of the '{@link #getSides() <em>Sides</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSides()
	 * @generated
	 * @ordered
	 */
	protected Num sides;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RzutykosciaPackage.Literals.DICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Num getSides() {
		return sides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSides(Num newSides, NotificationChain msgs) {
		Num oldSides = sides;
		sides = newSides;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.DICE__SIDES, oldSides, newSides);
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
	public void setSides(Num newSides) {
		if (newSides != sides) {
			NotificationChain msgs = null;
			if (sides != null)
				msgs = ((InternalEObject)sides).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.DICE__SIDES, null, msgs);
			if (newSides != null)
				msgs = ((InternalEObject)newSides).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.DICE__SIDES, null, msgs);
			msgs = basicSetSides(newSides, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.DICE__SIDES, newSides, newSides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RzutykosciaPackage.DICE__SIDES:
				return basicSetSides(null, msgs);
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
			case RzutykosciaPackage.DICE__SIDES:
				return getSides();
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
			case RzutykosciaPackage.DICE__SIDES:
				setSides((Num)newValue);
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
			case RzutykosciaPackage.DICE__SIDES:
				setSides((Num)null);
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
			case RzutykosciaPackage.DICE__SIDES:
				return sides != null;
		}
		return super.eIsSet(featureID);
	}

} //DiceImpl
