/**
 */
package Rzutykoscia.impl;

import Rzutykoscia.HighLow;
import Rzutykoscia.RerollHigh;
import Rzutykoscia.RzutykosciaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reroll High</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.impl.RerollHighImpl#getHightlow <em>Hightlow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RerollHighImpl extends RerollImpl implements RerollHigh {
	/**
	 * The default value of the '{@link #getHightlow() <em>Hightlow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHightlow()
	 * @generated
	 * @ordered
	 */
	protected static final HighLow HIGHTLOW_EDEFAULT = HighLow.HIGH;

	/**
	 * The cached value of the '{@link #getHightlow() <em>Hightlow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHightlow()
	 * @generated
	 * @ordered
	 */
	protected HighLow hightlow = HIGHTLOW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RerollHighImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RzutykosciaPackage.Literals.REROLL_HIGH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HighLow getHightlow() {
		return hightlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHightlow(HighLow newHightlow) {
		HighLow oldHightlow = hightlow;
		hightlow = newHightlow == null ? HIGHTLOW_EDEFAULT : newHightlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.REROLL_HIGH__HIGHTLOW, oldHightlow, hightlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RzutykosciaPackage.REROLL_HIGH__HIGHTLOW:
				return getHightlow();
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
			case RzutykosciaPackage.REROLL_HIGH__HIGHTLOW:
				setHightlow((HighLow)newValue);
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
			case RzutykosciaPackage.REROLL_HIGH__HIGHTLOW:
				setHightlow(HIGHTLOW_EDEFAULT);
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
			case RzutykosciaPackage.REROLL_HIGH__HIGHTLOW:
				return hightlow != HIGHTLOW_EDEFAULT;
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
		result.append(" (hightlow: ");
		result.append(hightlow);
		result.append(')');
		return result.toString();
	}

} //RerollHighImpl
