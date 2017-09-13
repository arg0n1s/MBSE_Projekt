/**
 */
package requirements.impl;

import implementation.Computer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import requirements.Consumer;
import requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirements.impl.ConsumerImpl#getRightcomp <em>Rightcomp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsumerImpl extends AgentImpl implements Consumer {
	/**
	 * The cached value of the '{@link #getRightcomp() <em>Rightcomp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightcomp()
	 * @generated
	 * @ordered
	 */
	protected Computer rightcomp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.CONSUMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computer getRightcomp() {
		if (rightcomp != null && rightcomp.eIsProxy()) {
			InternalEObject oldRightcomp = (InternalEObject)rightcomp;
			rightcomp = (Computer)eResolveProxy(oldRightcomp);
			if (rightcomp != oldRightcomp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.CONSUMER__RIGHTCOMP, oldRightcomp, rightcomp));
			}
		}
		return rightcomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computer basicGetRightcomp() {
		return rightcomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightcomp(Computer newRightcomp) {
		Computer oldRightcomp = rightcomp;
		rightcomp = newRightcomp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.CONSUMER__RIGHTCOMP, oldRightcomp, rightcomp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.CONSUMER__RIGHTCOMP:
				if (resolve) return getRightcomp();
				return basicGetRightcomp();
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
			case RequirementsPackage.CONSUMER__RIGHTCOMP:
				setRightcomp((Computer)newValue);
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
			case RequirementsPackage.CONSUMER__RIGHTCOMP:
				setRightcomp((Computer)null);
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
			case RequirementsPackage.CONSUMER__RIGHTCOMP:
				return rightcomp != null;
		}
		return super.eIsSet(featureID);
	}

} //ConsumerImpl
