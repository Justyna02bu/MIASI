/**
 */
package Rzutykoscia.impl;

import Rzutykoscia.DiceRerollSuk;
import Rzutykoscia.Reroll;
import Rzutykoscia.RzutykosciaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dice Reroll Suk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.impl.DiceRerollSukImpl#getReroll <em>Reroll</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiceRerollSukImpl extends SuccessRuleImpl implements DiceRerollSuk {
	/**
	 * The cached value of the '{@link #getReroll() <em>Reroll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReroll()
	 * @generated
	 * @ordered
	 */
	protected Reroll reroll;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiceRerollSukImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RzutykosciaPackage.Literals.DICE_REROLL_SUK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reroll getReroll() {
		return reroll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReroll(Reroll newReroll, NotificationChain msgs) {
		Reroll oldReroll = reroll;
		reroll = newReroll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.DICE_REROLL_SUK__REROLL, oldReroll, newReroll);
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
	public void setReroll(Reroll newReroll) {
		if (newReroll != reroll) {
			NotificationChain msgs = null;
			if (reroll != null)
				msgs = ((InternalEObject)reroll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.DICE_REROLL_SUK__REROLL, null, msgs);
			if (newReroll != null)
				msgs = ((InternalEObject)newReroll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.DICE_REROLL_SUK__REROLL, null, msgs);
			msgs = basicSetReroll(newReroll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.DICE_REROLL_SUK__REROLL, newReroll, newReroll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RzutykosciaPackage.DICE_REROLL_SUK__REROLL:
				return basicSetReroll(null, msgs);
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
			case RzutykosciaPackage.DICE_REROLL_SUK__REROLL:
				return getReroll();
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
			case RzutykosciaPackage.DICE_REROLL_SUK__REROLL:
				setReroll((Reroll)newValue);
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
			case RzutykosciaPackage.DICE_REROLL_SUK__REROLL:
				setReroll((Reroll)null);
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
			case RzutykosciaPackage.DICE_REROLL_SUK__REROLL:
				return reroll != null;
		}
		return super.eIsSet(featureID);
	}

} //DiceRerollSukImpl
