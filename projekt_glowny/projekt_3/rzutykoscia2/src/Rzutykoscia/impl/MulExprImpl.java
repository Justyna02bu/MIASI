/**
 */
package Rzutykoscia.impl;

import Rzutykoscia.FormExpr;
import Rzutykoscia.MulExpr;
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
 * An implementation of the model object '<em><b>Mul Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.impl.MulExprImpl#getNum <em>Num</em>}</li>
 *   <li>{@link Rzutykoscia.impl.MulExprImpl#getFormexpr <em>Formexpr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MulExprImpl extends MinimalEObjectImpl.Container implements MulExpr {
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
	 * The cached value of the '{@link #getFormexpr() <em>Formexpr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormexpr()
	 * @generated
	 * @ordered
	 */
	protected FormExpr formexpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MulExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RzutykosciaPackage.Literals.MUL_EXPR;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.MUL_EXPR__NUM, oldNum, newNum);
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
				msgs = ((InternalEObject)num).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.MUL_EXPR__NUM, null, msgs);
			if (newNum != null)
				msgs = ((InternalEObject)newNum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.MUL_EXPR__NUM, null, msgs);
			msgs = basicSetNum(newNum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.MUL_EXPR__NUM, newNum, newNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormExpr getFormexpr() {
		return formexpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormexpr(FormExpr newFormexpr, NotificationChain msgs) {
		FormExpr oldFormexpr = formexpr;
		formexpr = newFormexpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.MUL_EXPR__FORMEXPR, oldFormexpr, newFormexpr);
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
	public void setFormexpr(FormExpr newFormexpr) {
		if (newFormexpr != formexpr) {
			NotificationChain msgs = null;
			if (formexpr != null)
				msgs = ((InternalEObject)formexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.MUL_EXPR__FORMEXPR, null, msgs);
			if (newFormexpr != null)
				msgs = ((InternalEObject)newFormexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.MUL_EXPR__FORMEXPR, null, msgs);
			msgs = basicSetFormexpr(newFormexpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.MUL_EXPR__FORMEXPR, newFormexpr, newFormexpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RzutykosciaPackage.MUL_EXPR__NUM:
				return basicSetNum(null, msgs);
			case RzutykosciaPackage.MUL_EXPR__FORMEXPR:
				return basicSetFormexpr(null, msgs);
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
			case RzutykosciaPackage.MUL_EXPR__NUM:
				return getNum();
			case RzutykosciaPackage.MUL_EXPR__FORMEXPR:
				return getFormexpr();
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
			case RzutykosciaPackage.MUL_EXPR__NUM:
				setNum((Num)newValue);
				return;
			case RzutykosciaPackage.MUL_EXPR__FORMEXPR:
				setFormexpr((FormExpr)newValue);
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
			case RzutykosciaPackage.MUL_EXPR__NUM:
				setNum((Num)null);
				return;
			case RzutykosciaPackage.MUL_EXPR__FORMEXPR:
				setFormexpr((FormExpr)null);
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
			case RzutykosciaPackage.MUL_EXPR__NUM:
				return num != null;
			case RzutykosciaPackage.MUL_EXPR__FORMEXPR:
				return formexpr != null;
		}
		return super.eIsSet(featureID);
	}

} //MulExprImpl
