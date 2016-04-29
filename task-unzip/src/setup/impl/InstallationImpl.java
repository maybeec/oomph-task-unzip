/**
 */
package setup.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import setup.Installation;
import setup.ProductVersion;
import setup.SetupPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Installation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link setup.impl.InstallationImpl#getProductVersion <em>Product Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstallationImpl extends ScopeImpl implements Installation
{
  /**
   * The cached value of the '{@link #getProductVersion() <em>Product Version</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductVersion()
   * @generated
   * @ordered
   */
  protected ProductVersion productVersion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstallationImpl()
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
    return SetupPackage.Literals.INSTALLATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductVersion getProductVersion()
  {
    if (productVersion != null && productVersion.eIsProxy())
    {
      InternalEObject oldProductVersion = (InternalEObject)productVersion;
      productVersion = (ProductVersion)eResolveProxy(oldProductVersion);
      if (productVersion != oldProductVersion)
      {
        if (eNotificationRequired())
        {
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SetupPackage.INSTALLATION__PRODUCT_VERSION, oldProductVersion, productVersion));
        }
      }
    }
    return productVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductVersion basicGetProductVersion()
  {
    return productVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProductVersion(ProductVersion newProductVersion)
  {
    ProductVersion oldProductVersion = productVersion;
    productVersion = newProductVersion;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.INSTALLATION__PRODUCT_VERSION, oldProductVersion, productVersion));
    }
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
    case SetupPackage.INSTALLATION__PRODUCT_VERSION:
      if (resolve)
      {
        return getProductVersion();
      }
      return basicGetProductVersion();
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
    case SetupPackage.INSTALLATION__PRODUCT_VERSION:
      setProductVersion((ProductVersion)newValue);
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
    case SetupPackage.INSTALLATION__PRODUCT_VERSION:
      setProductVersion((ProductVersion)null);
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
    case SetupPackage.INSTALLATION__PRODUCT_VERSION:
      return productVersion != null;
    }
    return super.eIsSet(featureID);
  }

} // InstallationImpl
