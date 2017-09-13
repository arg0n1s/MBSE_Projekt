/**
 */
package implementation.impl;

import implementation.ImplementationPackage;
import implementation.Server;

import java.math.BigInteger;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import requirements.Provider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementation.impl.ServerImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link implementation.impl.ServerImpl#getMaxSlots <em>Max Slots</em>}</li>
 *   <li>{@link implementation.impl.ServerImpl#getMTBF <em>MTBF</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerImpl extends DeviceImpl implements Server {
	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Provider provider;

	/**
	 * The default value of the '{@link #getMaxSlots() <em>Max Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSlots()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_SLOTS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMaxSlots() <em>Max Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSlots()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxSlots = MAX_SLOTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMTBF() <em>MTBF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTBF()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MTBF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMTBF() <em>MTBF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTBF()
	 * @generated
	 * @ordered
	 */
	protected BigInteger mtbf = MTBF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider getProvider() {
		if (provider != null && provider.eIsProxy()) {
			InternalEObject oldProvider = (InternalEObject)provider;
			provider = (Provider)eResolveProxy(oldProvider);
			if (provider != oldProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.SERVER__PROVIDER, oldProvider, provider));
			}
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider basicGetProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Provider newProvider) {
		Provider oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.SERVER__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxSlots() {
		return maxSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSlots(BigInteger newMaxSlots) {
		BigInteger oldMaxSlots = maxSlots;
		maxSlots = newMaxSlots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.SERVER__MAX_SLOTS, oldMaxSlots, maxSlots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMTBF() {
		return mtbf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMTBF(BigInteger newMTBF) {
		BigInteger oldMTBF = mtbf;
		mtbf = newMTBF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.SERVER__MTBF, oldMTBF, mtbf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.SERVER__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case ImplementationPackage.SERVER__MAX_SLOTS:
				return getMaxSlots();
			case ImplementationPackage.SERVER__MTBF:
				return getMTBF();
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
			case ImplementationPackage.SERVER__PROVIDER:
				setProvider((Provider)newValue);
				return;
			case ImplementationPackage.SERVER__MAX_SLOTS:
				setMaxSlots((BigInteger)newValue);
				return;
			case ImplementationPackage.SERVER__MTBF:
				setMTBF((BigInteger)newValue);
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
			case ImplementationPackage.SERVER__PROVIDER:
				setProvider((Provider)null);
				return;
			case ImplementationPackage.SERVER__MAX_SLOTS:
				setMaxSlots(MAX_SLOTS_EDEFAULT);
				return;
			case ImplementationPackage.SERVER__MTBF:
				setMTBF(MTBF_EDEFAULT);
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
			case ImplementationPackage.SERVER__PROVIDER:
				return provider != null;
			case ImplementationPackage.SERVER__MAX_SLOTS:
				return MAX_SLOTS_EDEFAULT == null ? maxSlots != null : !MAX_SLOTS_EDEFAULT.equals(maxSlots);
			case ImplementationPackage.SERVER__MTBF:
				return MTBF_EDEFAULT == null ? mtbf != null : !MTBF_EDEFAULT.equals(mtbf);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maxSlots: ");
		result.append(maxSlots);
		result.append(", MTBF: ");
		result.append(mtbf);
		result.append(')');
		return result.toString();
	}

} //ServerImpl
