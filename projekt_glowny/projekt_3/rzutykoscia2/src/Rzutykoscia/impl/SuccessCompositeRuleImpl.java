/**
 */
package Rzutykoscia.impl;

import Rzutykoscia.RzutykosciaPackage;
import Rzutykoscia.SuccessCompositeRule;
import Rzutykoscia.SuccessRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Success Composite Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Rzutykoscia.impl.SuccessCompositeRuleImpl#getSuccessrule <em>Successrule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuccessCompositeRuleImpl extends SuccessRuleImpl implements SuccessCompositeRule {
	/**
	 * The cached value of the '{@link #getSuccessrule() <em>Successrule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessrule()
	 * @generated
	 * @ordered
	 */
	protected SuccessRule successrule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuccessCompositeRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RzutykosciaPackage.Literals.SUCCESS_COMPOSITE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuccessRule getSuccessrule() {
		return successrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccessrule(SuccessRule newSuccessrule, NotificationChain msgs) {
		SuccessRule oldSuccessrule = successrule;
		successrule = newSuccessrule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.SUCCESS_COMPOSITE_RULE__SUCCESSRULE, oldSuccessrule, newSuccessrule);
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
	public void setSuccessrule(SuccessRule newSuccessrule) {
		if (newSuccessrule != successrule) {
			NotificationChain msgs = null;
			if (successrule != null)
				msgs = ((InternalEObject)successrule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.SUCCESS_COMPOSITE_RULE__SUCCESSRULE, null, msgs);
			if (newSuccessrule != null)
				msgs = ((InternalEObject)newSuccessrule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RzutykosciaPackage.SUCCESS_COMPOSITE_RULE__SUCCESSRULE, null, msgs);
			msgs = basicSetSuccessrule(newSuccessrule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RzutykosciaPackage.SUCCESS_COMPOSITE_RULE__SUCCESSRULE, newSuccessrule, newSuccessrule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RzutykosciaPackage.SUCCESS_COMPOSITE_RULE__SUCCESSRULE:
				return basicSetSuccessrule(null, msgs);
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
			case RzutykosciaPackage.SUCCESS_COMPOSITE_RULE__SUCCESSRULE:
				return getSuccessrule();
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
			case RzutykosciaPackage.SUCCESS_COMPOSITE_RULE__SUCCESSRULE:
				setSuccessrule((SuccessRule)newValue);
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
			case RzutykosciaPackage.SUCCESS_COMPOSITE_RULE__SUCCESSRULE:
				setSuccessrule((SuccessRule)null);
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
			case RzutykosciaPackage.SUCCESS_COMPOSITE_RULE__SUCCESSRULE:
				return successrule != null;
		}
		return super.eIsSet(featureID);
	}

} //SuccessCompositeRuleImpl
