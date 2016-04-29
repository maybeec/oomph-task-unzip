/**
 */
package setup.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import setup.Product;
import setup.ProductCatalog;
import setup.ProductVersion;
import setup.SetupPackage;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link setup.impl.ProductImpl#getProductCatalog <em>Product Catalog</em>}</li>
 *   <li>{@link setup.impl.ProductImpl#getVersions <em>Versions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductImpl extends ScopeImpl implements Product
{
  /**
   * The cached value of the '{@link #getVersions() <em>Versions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersions()
   * @generated
   * @ordered
   */
  protected EList<ProductVersion> versions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProductImpl()
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
    return SetupPackage.Literals.PRODUCT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductCatalog getProductCatalog()
  {
    if (eContainerFeatureID() != SetupPackage.PRODUCT__PRODUCT_CATALOG)
    {
      return null;
    }
    return (ProductCatalog)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProductCatalog(ProductCatalog newProductCatalog, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newProductCatalog, SetupPackage.PRODUCT__PRODUCT_CATALOG, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProductCatalog(ProductCatalog newProductCatalog)
  {
    if (newProductCatalog != eInternalContainer() || eContainerFeatureID() != SetupPackage.PRODUCT__PRODUCT_CATALOG && newProductCatalog != null)
    {
      if (EcoreUtil.isAncestor(this, newProductCatalog))
      {
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      }
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
      {
        msgs = eBasicRemoveFromContainer(msgs);
      }
      if (newProductCatalog != null)
      {
        msgs = ((InternalEObject)newProductCatalog).eInverseAdd(this, SetupPackage.PRODUCT_CATALOG__PRODUCTS, ProductCatalog.class, msgs);
      }
      msgs = basicSetProductCatalog(newProductCatalog, msgs);
      if (msgs != null)
      {
        msgs.dispatch();
      }
    }
    else if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.PRODUCT__PRODUCT_CATALOG, newProductCatalog, newProductCatalog));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProductVersion> getVersions()
  {
    if (versions == null)
    {
      versions = new EObjectContainmentWithInverseEList<ProductVersion>(ProductVersion.class, this, SetupPackage.PRODUCT__VERSIONS,
          SetupPackage.PRODUCT_VERSION__PRODUCT);
    }
    return versions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case SetupPackage.PRODUCT__PRODUCT_CATALOG:
      if (eInternalContainer() != null)
      {
        msgs = eBasicRemoveFromContainer(msgs);
      }
      return basicSetProductCatalog((ProductCatalog)otherEnd, msgs);
    case SetupPackage.PRODUCT__VERSIONS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getVersions()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case SetupPackage.PRODUCT__PRODUCT_CATALOG:
      return basicSetProductCatalog(null, msgs);
    case SetupPackage.PRODUCT__VERSIONS:
      return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
    case SetupPackage.PRODUCT__PRODUCT_CATALOG:
      return eInternalContainer().eInverseRemove(this, SetupPackage.PRODUCT_CATALOG__PRODUCTS, ProductCatalog.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
    case SetupPackage.PRODUCT__PRODUCT_CATALOG:
      return getProductCatalog();
    case SetupPackage.PRODUCT__VERSIONS:
      return getVersions();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case SetupPackage.PRODUCT__PRODUCT_CATALOG:
      setProductCatalog((ProductCatalog)newValue);
      return;
    case SetupPackage.PRODUCT__VERSIONS:
      getVersions().clear();
      getVersions().addAll((Collection<? extends ProductVersion>)newValue);
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
    case SetupPackage.PRODUCT__PRODUCT_CATALOG:
      setProductCatalog((ProductCatalog)null);
      return;
    case SetupPackage.PRODUCT__VERSIONS:
      getVersions().clear();
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
    case SetupPackage.PRODUCT__PRODUCT_CATALOG:
      return getProductCatalog() != null;
    case SetupPackage.PRODUCT__VERSIONS:
      return versions != null && !versions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // ProductImpl
