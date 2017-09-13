/**
 */
package requirements.impl;

import implementation.Server;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import requirements.Provider;
import requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirements.impl.ProviderImpl#getRightserv <em>Rightserv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProviderImpl extends AgentImpl implements Provider {
	/**
	 * The cached value of the '{@link #getRightserv() <em>Rightserv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightserv()
	 * @generated
	 * @ordered
	 */
	protected Server rightserv;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getRightserv() {
		if (rightserv != null && rightserv.eIsProxy()) {
			InternalEObject oldRightserv = (InternalEObject)rightserv;
			rightserv = (Server)eResolveProxy(oldRightserv);
			if (rightserv != oldRightserv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.PROVIDER__RIGHTSERV, oldRightserv, rightserv));
			}
		}
		return rightserv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server basicGetRightserv() {
		return rightserv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightserv(Server newRightserv) {
		Server oldRightserv = rightserv;
		rightserv = newRightserv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PROVIDER__RIGHTSERV, oldRightserv, rightserv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.PROVIDER__RIGHTSERV:
				if (resolve) return getRightserv();
				return basicGetRightserv();
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
			case RequirementsPackage.PROVIDER__RIGHTSERV:
				setRightserv((Server)newValue);
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
			case RequirementsPackage.PROVIDER__RIGHTSERV:
				setRightserv((Server)null);
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
			case RequirementsPackage.PROVIDER__RIGHTSERV:
				return rightserv != null;
		}
		return super.eIsSet(featureID);
	}

} //ProviderImpl
