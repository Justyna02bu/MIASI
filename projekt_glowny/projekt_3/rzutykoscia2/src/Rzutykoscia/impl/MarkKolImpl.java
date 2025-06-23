/**
 */
package Rzutykoscia.impl;

import Rzutykoscia.FirstLast;
import Rzutykoscia.MarkKol;
import Rzutykoscia.Num;
import Rzutykoscia.RzutykosciaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mark Kol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.impl.MarkKolImpl#getNum <em>Num</em>}</li>
 *   <li>{@link Rzutykoscia.impl.MarkKolImpl#getFirstlast <em>Firstlast</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkKolImpl extends MarkImpl implements MarkKol {
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
	 * The default value of the '{@link #getFirstlast() <em>Firstlast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstlast()
	 * @generated
	 * @ordered
	 */
	protected static final FirstLast FIRSTLAST_EDEFAULT = FirstLast.FIRST;

	/**
	 * The cached value of the '{@link #getFirstlast() <em>Firstlast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstlast()
	 * @generated
	 * @ordered
	 */
	protected FirstLast firstlast = FIRSTLAST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkKolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RzutykosciaPackage.Literals.MARK_KOL;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.MARK_KOL__NUM, oldNum, newNum);
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
				msgs = ((InternalEObject)num).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.MARK_KOL__NUM, null, msgs);
			if (newNum != null)
				msgs = ((InternalEObject)newNum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.MARK_KOL__NUM, null, msgs);
			msgs = basicSetNum(newNum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.MARK_KOL__NUM, newNum, newNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FirstLast getFirstlast() {
		return firstlast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstlast(FirstLast newFirstlast) {
		FirstLast oldFirstlast = firstlast;
		firstlast = newFirstlast == null ? FIRSTLAST_EDEFAULT : newFirstlast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.MARK_KOL__FIRSTLAST, oldFirstlast, firstlast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RzutykosciaPackage.MARK_KOL__NUM:
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
			case RzutykosciaPackage.MARK_KOL__NUM:
				return getNum();
			case RzutykosciaPackage.MARK_KOL__FIRSTLAST:
				return getFirstlast();
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
			case RzutykosciaPackage.MARK_KOL__NUM:
				setNum((Num)newValue);
				return;
			case RzutykosciaPackage.MARK_KOL__FIRSTLAST:
				setFirstlast((FirstLast)newValue);
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
			case RzutykosciaPackage.MARK_KOL__NUM:
				setNum((Num)null);
				return;
			case RzutykosciaPackage.MARK_KOL__FIRSTLAST:
				setFirstlast(FIRSTLAST_EDEFAULT);
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
			case RzutykosciaPackage.MARK_KOL__NUM:
				return num != null;
			case RzutykosciaPackage.MARK_KOL__FIRSTLAST:
				return firstlast != FIRSTLAST_EDEFAULT;
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
		result.append(" (firstlast: ");
		result.append(firstlast);
		result.append(')');
		return result.toString();
	}

} //MarkKolImpl
