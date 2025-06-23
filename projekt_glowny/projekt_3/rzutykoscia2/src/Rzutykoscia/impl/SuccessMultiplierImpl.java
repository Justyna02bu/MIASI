/**
 */
package Rzutykoscia.impl;

import Rzutykoscia.Num;
import Rzutykoscia.RzutykosciaPackage;
import Rzutykoscia.Sign;
import Rzutykoscia.SuccessMultiplier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Success Multiplier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.impl.SuccessMultiplierImpl#getSign <em>Sign</em>}</li>
 *   <li>{@link Rzutykoscia.impl.SuccessMultiplierImpl#getMult <em>Mult</em>}</li>
 *   <li>{@link Rzutykoscia.impl.SuccessMultiplierImpl#getNum <em>Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuccessMultiplierImpl extends SuccessRuleImpl implements SuccessMultiplier {
	/**
	 * The default value of the '{@link #getSign() <em>Sign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSign()
	 * @generated
	 * @ordered
	 */
	protected static final Sign SIGN_EDEFAULT = Sign.ADD;

	/**
	 * The cached value of the '{@link #getSign() <em>Sign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSign()
	 * @generated
	 * @ordered
	 */
	protected Sign sign = SIGN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMult() <em>Mult</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMult()
	 * @generated
	 * @ordered
	 */
	protected Num mult;

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
	protected SuccessMultiplierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RzutykosciaPackage.Literals.SUCCESS_MULTIPLIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sign getSign() {
		return sign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSign(Sign newSign) {
		Sign oldSign = sign;
		sign = newSign == null ? SIGN_EDEFAULT : newSign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.SUCCESS_MULTIPLIER__SIGN, oldSign, sign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Num getMult() {
		return mult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMult(Num newMult, NotificationChain msgs) {
		Num oldMult = mult;
		mult = newMult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.SUCCESS_MULTIPLIER__MULT, oldMult, newMult);
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
	public void setMult(Num newMult) {
		if (newMult != mult) {
			NotificationChain msgs = null;
			if (mult != null)
				msgs = ((InternalEObject)mult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.SUCCESS_MULTIPLIER__MULT, null, msgs);
			if (newMult != null)
				msgs = ((InternalEObject)newMult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.SUCCESS_MULTIPLIER__MULT, null, msgs);
			msgs = basicSetMult(newMult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.SUCCESS_MULTIPLIER__MULT, newMult, newMult));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.SUCCESS_MULTIPLIER__NUM, oldNum, newNum);
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
				msgs = ((InternalEObject)num).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.SUCCESS_MULTIPLIER__NUM, null, msgs);
			if (newNum != null)
				msgs = ((InternalEObject)newNum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.SUCCESS_MULTIPLIER__NUM, null, msgs);
			msgs = basicSetNum(newNum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.SUCCESS_MULTIPLIER__NUM, newNum, newNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RzutykosciaPackage.SUCCESS_MULTIPLIER__MULT:
				return basicSetMult(null, msgs);
			case RzutykosciaPackage.SUCCESS_MULTIPLIER__NUM:
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
			case RzutykosciaPackage.SUCCESS_MULTIPLIER__SIGN:
				return getSign();
			case RzutykosciaPackage.SUCCESS_MULTIPLIER__MULT:
				return getMult();
			case RzutykosciaPackage.SUCCESS_MULTIPLIER__NUM:
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
			case RzutykosciaPackage.SUCCESS_MULTIPLIER__SIGN:
				setSign((Sign)newValue);
				return;
			case RzutykosciaPackage.SUCCESS_MULTIPLIER__MULT:
				setMult((Num)newValue);
				return;
			case RzutykosciaPackage.SUCCESS_MULTIPLIER__NUM:
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
			case RzutykosciaPackage.SUCCESS_MULTIPLIER__SIGN:
				setSign(SIGN_EDEFAULT);
				return;
			case RzutykosciaPackage.SUCCESS_MULTIPLIER__MULT:
				setMult((Num)null);
				return;
			case RzutykosciaPackage.SUCCESS_MULTIPLIER__NUM:
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
			case RzutykosciaPackage.SUCCESS_MULTIPLIER__SIGN:
				return sign != SIGN_EDEFAULT;
			case RzutykosciaPackage.SUCCESS_MULTIPLIER__MULT:
				return mult != null;
			case RzutykosciaPackage.SUCCESS_MULTIPLIER__NUM:
				return num != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sign: ");
		result.append(sign);
		result.append(')');
		return result.toString();
	}

} //SuccessMultiplierImpl
