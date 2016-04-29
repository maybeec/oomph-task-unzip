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

import setup.Index;
import setup.Product;
import setup.ProductCatalog;
import setup.SetupPackage;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link setup.impl.ProductCatalogImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link setup.impl.ProductCatalogImpl#getProducts <em>Products</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductCatalogImpl extends ScopeImpl implements ProductCatalog
{
  /**
   * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProducts()
   * @generated
   * @ordered
   */
  protected EList<Product> products;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProductCatalogImpl()
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
    return SetupPackage.Literals.PRODUCT_CATALOG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Index getIndex()
  {
    if (eContainerFeatureID() != SetupPackage.PRODUCT_CATALOG__INDEX)
    {
      return null;
    }
    return (Index)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndex(Index newIndex, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newIndex, SetupPackage.PRODUCT_CATALOG__INDEX, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(Index newIndex)
  {
    if (newIndex != eInternalContainer() || eContainerFeatureID() != SetupPackage.PRODUCT_CATALOG__INDEX && newIndex != null)
    {
      if (EcoreUtil.isAncestor(this, newIndex))
      {
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      }
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
      {
        msgs = eBasicRemoveFromContainer(msgs);
      }
      if (newIndex != null)
      {
        msgs = ((InternalEObject)newIndex).eInverseAdd(this, SetupPackage.INDEX__PRODUCT_CATALOGS, Index.class, msgs);
      }
      msgs = basicSetIndex(newIndex, msgs);
      if (msgs != null)
      {
        msgs.dispatch();
      }
    }
    else if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.PRODUCT_CATALOG__INDEX, newIndex, newIndex));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Product> getProducts()
  {
    if (products == null)
    {
      products = new EObjectContainmentWithInverseEList<Product>(Product.class, this, SetupPackage.PRODUCT_CATALOG__PRODUCTS,
          SetupPackage.PRODUCT__PRODUCT_CATALOG);
    }
    return products;
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
    case SetupPackage.PRODUCT_CATALOG__INDEX:
      if (eInternalContainer() != null)
      {
        msgs = eBasicRemoveFromContainer(msgs);
      }
      return basicSetIndex((Index)otherEnd, msgs);
    case SetupPackage.PRODUCT_CATALOG__PRODUCTS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducts()).basicAdd(otherEnd, msgs);
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
    case SetupPackage.PRODUCT_CATALOG__INDEX:
      return basicSetIndex(null, msgs);
    case SetupPackage.PRODUCT_CATALOG__PRODUCTS:
      return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
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
    case SetupPackage.PRODUCT_CATALOG__INDEX:
      return eInternalContainer().eInverseRemove(this, SetupPackage.INDEX__PRODUCT_CATALOGS, Index.class, msgs);
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
    case SetupPackage.PRODUCT_CATALOG__INDEX:
      return getIndex();
    case SetupPackage.PRODUCT_CATALOG__PRODUCTS:
      return getProducts();
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
    case SetupPackage.PRODUCT_CATALOG__INDEX:
      setIndex((Index)newValue);
      return;
    case SetupPackage.PRODUCT_CATALOG__PRODUCTS:
      getProducts().clear();
      getProducts().addAll((Collection<? extends Product>)newValue);
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
    case SetupPackage.PRODUCT_CATALOG__INDEX:
      setIndex((Index)null);
      return;
    case SetupPackage.PRODUCT_CATALOG__PRODUCTS:
      getProducts().clear();
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
    case SetupPackage.PRODUCT_CATALOG__INDEX:
      return getIndex() != null;
    case SetupPackage.PRODUCT_CATALOG__PRODUCTS:
      return products != null && !products.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // ProductCatalogImpl
