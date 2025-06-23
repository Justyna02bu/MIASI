/**
 */
package Rzutykoscia.impl;

import Rzutykoscia.Num;
import Rzutykoscia.RerollNum;
import Rzutykoscia.RzutykosciaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reroll Num</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.impl.RerollNumImpl#getNum <em>Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RerollNumImpl extends RerollImpl implements RerollNum {
	/**
	 * The cached value of the '{@link #getNum() <em>Num</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum()
	 * @generated
	 * @ordered
	 */
	protected Num num;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RerollNumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RzutykosciaPackage.Literals.REROLL_NUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Num getNum() {
		return num;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNum(Num newNum, NotificationChain msgs) {
		Num oldNum = num;
		num = newNum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.REROLL_NUM__NUM, oldNum, newNum);
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
	public void setNum(Num newNum) {
		if (newNum != num) {
			NotificationChain msgs = null;
			if (num != null)
				msgs = ((InternalEObject)num).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.REROLL_NUM__NUM, null, msgs);
			if (newNum != null)
				msgs = ((InternalEObject)newNum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.REROLL_NUM__NUM, null, msgs);
			msgs = basicSetNum(newNum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.REROLL_NUM__NUM, newNum, newNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RzutykosciaPackage.REROLL_NUM__NUM:
				return basicSetNum(null, msgs);
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
			case RzutykosciaPackage.REROLL_NUM__NUM:
				return getNum();
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
			case RzutykosciaPackage.REROLL_NUM__NUM:
				setNum((Num)newValue);
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
			case RzutykosciaPackage.REROLL_NUM__NUM:
				setNum((Num)null);
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
			case RzutykosciaPackage.REROLL_NUM__NUM:
				return num != null;
		}
		return super.eIsSet(featureID);
	}

} //RerollNumImpl
