/**
 */
package implementation.impl;

import implementation.Computer;
import implementation.ImplementationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import requirements.Consumer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementation.impl.ComputerImpl#getConsumer <em>Consumer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputerImpl extends DeviceImpl implements Computer {
	/**
	 * The cached value of the '{@link #getConsumer() <em>Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumer()
	 * @generated
	 * @ordered
	 */
	protected Consumer consumer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.COMPUTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consumer getConsumer() {
		if (consumer != null && consumer.eIsProxy()) {
			InternalEObject oldConsumer = (InternalEObject)consumer;
			consumer = (Consumer)eResolveProxy(oldConsumer);
			if (consumer != oldConsumer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.COMPUTER__CONSUMER, oldConsumer, consumer));
			}
		}
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consumer basicGetConsumer() {
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumer(Consumer newConsumer) {
		Consumer oldConsumer = consumer;
		consumer = newConsumer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.COMPUTER__CONSUMER, oldConsumer, consumer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.COMPUTER__CONSUMER:
				if (resolve) return getConsumer();
				return basicGetConsumer();
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
			case ImplementationPackage.COMPUTER__CONSUMER:
				setConsumer((Consumer)newValue);
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
			case ImplementationPackage.COMPUTER__CONSUMER:
				setConsumer((Consumer)null);
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
			case ImplementationPackage.COMPUTER__CONSUMER:
				return consumer != null;
		}
		return super.eIsSet(featureID);
	}

} //ComputerImpl
