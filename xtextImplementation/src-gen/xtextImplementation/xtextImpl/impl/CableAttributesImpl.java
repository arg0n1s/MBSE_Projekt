/**
 * generated by Xtext 2.11.0
 */
package xtextImplementation.xtextImpl.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xtextImplementation.xtextImpl.CableAttributes;
import xtextImplementation.xtextImpl.XDevice;
import xtextImplementation.xtextImpl.XtextImplPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cable Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtextImplementation.xtextImpl.impl.CableAttributesImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link xtextImplementation.xtextImpl.impl.CableAttributesImpl#getEndPoint1 <em>End Point1</em>}</li>
 *   <li>{@link xtextImplementation.xtextImpl.impl.CableAttributesImpl#getEndPoint2 <em>End Point2</em>}</li>
 *   <li>{@link xtextImplementation.xtextImpl.impl.CableAttributesImpl#isIsDuplex <em>Is Duplex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CableAttributesImpl extends MinimalEObjectImpl.Container implements CableAttributes
{
  /**
   * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpeed()
   * @generated
   * @ordered
   */
  protected static final BigInteger SPEED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpeed()
   * @generated
   * @ordered
   */
  protected BigInteger speed = SPEED_EDEFAULT;

  /**
   * The cached value of the '{@link #getEndPoint1() <em>End Point1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndPoint1()
   * @generated
   * @ordered
   */
  protected XDevice endPoint1;

  /**
   * The cached value of the '{@link #getEndPoint2() <em>End Point2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndPoint2()
   * @generated
   * @ordered
   */
  protected XDevice endPoint2;

  /**
   * The default value of the '{@link #isIsDuplex() <em>Is Duplex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDuplex()
   * @generated
   * @ordered
   */
  protected static final boolean IS_DUPLEX_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsDuplex() <em>Is Duplex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDuplex()
   * @generated
   * @ordered
   */
  protected boolean isDuplex = IS_DUPLEX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CableAttributesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XtextImplPackage.Literals.CABLE_ATTRIBUTES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getSpeed()
  {
    return speed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpeed(BigInteger newSpeed)
  {
    BigInteger oldSpeed = speed;
    speed = newSpeed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XtextImplPackage.CABLE_ATTRIBUTES__SPEED, oldSpeed, speed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDevice getEndPoint1()
  {
    if (endPoint1 != null && endPoint1.eIsProxy())
    {
      InternalEObject oldEndPoint1 = (InternalEObject)endPoint1;
      endPoint1 = (XDevice)eResolveProxy(oldEndPoint1);
      if (endPoint1 != oldEndPoint1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, XtextImplPackage.CABLE_ATTRIBUTES__END_POINT1, oldEndPoint1, endPoint1));
      }
    }
    return endPoint1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDevice basicGetEndPoint1()
  {
    return endPoint1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndPoint1(XDevice newEndPoint1)
  {
    XDevice oldEndPoint1 = endPoint1;
    endPoint1 = newEndPoint1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XtextImplPackage.CABLE_ATTRIBUTES__END_POINT1, oldEndPoint1, endPoint1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDevice getEndPoint2()
  {
    if (endPoint2 != null && endPoint2.eIsProxy())
    {
      InternalEObject oldEndPoint2 = (InternalEObject)endPoint2;
      endPoint2 = (XDevice)eResolveProxy(oldEndPoint2);
      if (endPoint2 != oldEndPoint2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, XtextImplPackage.CABLE_ATTRIBUTES__END_POINT2, oldEndPoint2, endPoint2));
      }
    }
    return endPoint2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDevice basicGetEndPoint2()
  {
    return endPoint2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndPoint2(XDevice newEndPoint2)
  {
    XDevice oldEndPoint2 = endPoint2;
    endPoint2 = newEndPoint2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XtextImplPackage.CABLE_ATTRIBUTES__END_POINT2, oldEndPoint2, endPoint2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsDuplex()
  {
    return isDuplex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsDuplex(boolean newIsDuplex)
  {
    boolean oldIsDuplex = isDuplex;
    isDuplex = newIsDuplex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XtextImplPackage.CABLE_ATTRIBUTES__IS_DUPLEX, oldIsDuplex, isDuplex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XtextImplPackage.CABLE_ATTRIBUTES__SPEED:
        return getSpeed();
      case XtextImplPackage.CABLE_ATTRIBUTES__END_POINT1:
        if (resolve) return getEndPoint1();
        return basicGetEndPoint1();
      case XtextImplPackage.CABLE_ATTRIBUTES__END_POINT2:
        if (resolve) return getEndPoint2();
        return basicGetEndPoint2();
      case XtextImplPackage.CABLE_ATTRIBUTES__IS_DUPLEX:
        return isIsDuplex();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XtextImplPackage.CABLE_ATTRIBUTES__SPEED:
        setSpeed((BigInteger)newValue);
        return;
      case XtextImplPackage.CABLE_ATTRIBUTES__END_POINT1:
        setEndPoint1((XDevice)newValue);
        return;
      case XtextImplPackage.CABLE_ATTRIBUTES__END_POINT2:
        setEndPoint2((XDevice)newValue);
        return;
      case XtextImplPackage.CABLE_ATTRIBUTES__IS_DUPLEX:
        setIsDuplex((Boolean)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XtextImplPackage.CABLE_ATTRIBUTES__SPEED:
        setSpeed(SPEED_EDEFAULT);
        return;
      case XtextImplPackage.CABLE_ATTRIBUTES__END_POINT1:
        setEndPoint1((XDevice)null);
        return;
      case XtextImplPackage.CABLE_ATTRIBUTES__END_POINT2:
        setEndPoint2((XDevice)null);
        return;
      case XtextImplPackage.CABLE_ATTRIBUTES__IS_DUPLEX:
        setIsDuplex(IS_DUPLEX_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XtextImplPackage.CABLE_ATTRIBUTES__SPEED:
        return SPEED_EDEFAULT == null ? speed != null : !SPEED_EDEFAULT.equals(speed);
      case XtextImplPackage.CABLE_ATTRIBUTES__END_POINT1:
        return endPoint1 != null;
      case XtextImplPackage.CABLE_ATTRIBUTES__END_POINT2:
        return endPoint2 != null;
      case XtextImplPackage.CABLE_ATTRIBUTES__IS_DUPLEX:
        return isDuplex != IS_DUPLEX_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (speed: ");
    result.append(speed);
    result.append(", isDuplex: ");
    result.append(isDuplex);
    result.append(')');
    return result.toString();
  }

} //CableAttributesImpl