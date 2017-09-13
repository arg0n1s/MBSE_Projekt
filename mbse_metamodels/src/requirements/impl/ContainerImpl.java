/**
 */
package requirements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import requirements.Agent;
import requirements.NetworkSpan;
import requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirements.impl.ContainerImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link requirements.impl.ContainerImpl#getNetworkSpan <em>Network Span</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends MinimalEObjectImpl.Container implements requirements.Container {
	/**
	 * The cached value of the '{@link #getAgents() <em>Agents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> agents;

	/**
	 * The cached value of the '{@link #getNetworkSpan() <em>Network Span</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkSpan()
	 * @generated
	 * @ordered
	 */
	protected NetworkSpan networkSpan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agent> getAgents() {
		if (agents == null) {
			agents = new EObjectContainmentEList<Agent>(Agent.class, this, RequirementsPackage.CONTAINER__AGENTS);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkSpan getNetworkSpan() {
		return networkSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkSpan(NetworkSpan newNetworkSpan, NotificationChain msgs) {
		NetworkSpan oldNetworkSpan = networkSpan;
		networkSpan = newNetworkSpan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.CONTAINER__NETWORK_SPAN, oldNetworkSpan, newNetworkSpan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkSpan(NetworkSpan newNetworkSpan) {
		if (newNetworkSpan != networkSpan) {
			NotificationChain msgs = null;
			if (networkSpan != null)
				msgs = ((InternalEObject)networkSpan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.CONTAINER__NETWORK_SPAN, null, msgs);
			if (newNetworkSpan != null)
				msgs = ((InternalEObject)newNetworkSpan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.CONTAINER__NETWORK_SPAN, null, msgs);
			msgs = basicSetNetworkSpan(newNetworkSpan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.CONTAINER__NETWORK_SPAN, newNetworkSpan, newNetworkSpan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.CONTAINER__AGENTS:
				return ((InternalEList<?>)getAgents()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.CONTAINER__NETWORK_SPAN:
				return basicSetNetworkSpan(null, msgs);
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
			case RequirementsPackage.CONTAINER__AGENTS:
				return getAgents();
			case RequirementsPackage.CONTAINER__NETWORK_SPAN:
				return getNetworkSpan();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequirementsPackage.CONTAINER__AGENTS:
				getAgents().clear();
				getAgents().addAll((Collection<? extends Agent>)newValue);
				return;
			case RequirementsPackage.CONTAINER__NETWORK_SPAN:
				setNetworkSpan((NetworkSpan)newValue);
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
			case RequirementsPackage.CONTAINER__AGENTS:
				getAgents().clear();
				return;
			case RequirementsPackage.CONTAINER__NETWORK_SPAN:
				setNetworkSpan((NetworkSpan)null);
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
			case RequirementsPackage.CONTAINER__AGENTS:
				return agents != null && !agents.isEmpty();
			case RequirementsPackage.CONTAINER__NETWORK_SPAN:
				return networkSpan != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl
