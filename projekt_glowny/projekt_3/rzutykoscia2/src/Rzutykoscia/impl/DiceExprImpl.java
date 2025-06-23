/**
 */
package Rzutykoscia.impl;

import Rzutykoscia.DiceExpr;
import Rzutykoscia.MulExpr;
import Rzutykoscia.RzutykosciaPackage;
import Rzutykoscia.Sign;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dice Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.impl.DiceExprImpl#getMulexpr <em>Mulexpr</em>}</li>
 *   <li>{@link Rzutykoscia.impl.DiceExprImpl#getSign <em>Sign</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiceExprImpl extends MinimalEObjectImpl.Container implements DiceExpr {
	/**
	 * The cached value of the '{@link #getMulexpr() <em>Mulexpr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulexpr()
	 * @generated
	 * @ordered
	 */
	protected MulExpr mulexpr;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiceExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RzutykosciaPackage.Literals.DICE_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MulExpr getMulexpr() {
		return mulexpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMulexpr(MulExpr newMulexpr, NotificationChain msgs) {
		MulExpr oldMulexpr = mulexpr;
		mulexpr = newMulexpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.DICE_EXPR__MULEXPR, oldMulexpr, newMulexpr);
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
	public void setMulexpr(MulExpr newMulexpr) {
		if (newMulexpr != mulexpr) {
			NotificationChain msgs = null;
			if (mulexpr != null)
				msgs = ((InternalEObject)mulexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.DICE_EXPR__MULEXPR, null, msgs);
			if (newMulexpr != null)
				msgs = ((InternalEObject)newMulexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.DICE_EXPR__MULEXPR, null, msgs);
			msgs = basicSetMulexpr(newMulexpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.DICE_EXPR__MULEXPR, newMulexpr, newMulexpr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.DICE_EXPR__SIGN, oldSign, sign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RzutykosciaPackage.DICE_EXPR__MULEXPR:
				return basicSetMulexpr(null, msgs);
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
			case RzutykosciaPackage.DICE_EXPR__MULEXPR:
				return getMulexpr();
			case RzutykosciaPackage.DICE_EXPR__SIGN:
				return getSign();
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
			case RzutykosciaPackage.DICE_EXPR__MULEXPR:
				setMulexpr((MulExpr)newValue);
				return;
			case RzutykosciaPackage.DICE_EXPR__SIGN:
				setSign((Sign)newValue);
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
			case RzutykosciaPackage.DICE_EXPR__MULEXPR:
				setMulexpr((MulExpr)null);
				return;
			case RzutykosciaPackage.DICE_EXPR__SIGN:
				setSign(SIGN_EDEFAULT);
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
			case RzutykosciaPackage.DICE_EXPR__MULEXPR:
				return mulexpr != null;
			case RzutykosciaPackage.DICE_EXPR__SIGN:
				return sign != SIGN_EDEFAULT;
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

} //DiceExprImpl
