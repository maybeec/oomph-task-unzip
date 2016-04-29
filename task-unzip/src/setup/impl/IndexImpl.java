/**
 */
package setup.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import base.impl.ModelElementImpl;
import setup.Index;
import setup.ProductCatalog;
import setup.ProjectCatalog;
import setup.SetupPackage;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link setup.impl.IndexImpl#getDiscoverablePackages <em>Discoverable Packages</em>}</li>
 *   <li>{@link setup.impl.IndexImpl#getProductCatalogs <em>Product Catalogs</em>}</li>
 *   <li>{@link setup.impl.IndexImpl#getProjectCatalogs <em>Project Catalogs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexImpl extends ModelElementImpl implements Index
{
  /**
   * The cached value of the '{@link #getDiscoverablePackages() <em>Discoverable Packages</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscoverablePackages()
   * @generated
   * @ordered
   */
  protected EList<EPackage> discoverablePackages;

  /**
   * The cached value of the '{@link #getProductCatalogs() <em>Product Catalogs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductCatalogs()
   * @generated
   * @ordered
   */
  protected EList<ProductCatalog> productCatalogs;

  /**
   * The cached value of the '{@link #getProjectCatalogs() <em>Project Catalogs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectCatalogs()
   * @generated
   * @ordered
   */
  protected EList<ProjectCatalog> projectCatalogs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IndexImpl()
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
    return SetupPackage.Literals.INDEX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EPackage> getDiscoverablePackages()
  {
    if (discoverablePackages == null)
    {
      discoverablePackages = new EObjectResolvingEList<EPackage>(EPackage.class, this, SetupPackage.INDEX__DISCOVERABLE_PACKAGES);
    }
    return discoverablePackages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProductCatalog> getProductCatalogs()
  {
    if (productCatalogs == null)
    {
      productCatalogs = new EObjectContainmentWithInverseEList<ProductCatalog>(ProductCatalog.class, this, SetupPackage.INDEX__PRODUCT_CATALOGS,
          SetupPackage.PRODUCT_CATALOG__INDEX);
    }
    return productCatalogs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProjectCatalog> getProjectCatalogs()
  {
    if (projectCatalogs == null)
    {
      projectCatalogs = new EObjectContainmentWithInverseEList<ProjectCatalog>(ProjectCatalog.class, this, SetupPackage.INDEX__PROJECT_CATALOGS,
          SetupPackage.PROJECT_CATALOG__INDEX);
    }
    return projectCatalogs;
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
    case SetupPackage.INDEX__PRODUCT_CATALOGS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getProductCatalogs()).basicAdd(otherEnd, msgs);
    case SetupPackage.INDEX__PROJECT_CATALOGS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getProjectCatalogs()).basicAdd(otherEnd, msgs);
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
    case SetupPackage.INDEX__PRODUCT_CATALOGS:
      return ((InternalEList<?>)getProductCatalogs()).basicRemove(otherEnd, msgs);
    case SetupPackage.INDEX__PROJECT_CATALOGS:
      return ((InternalEList<?>)getProjectCatalogs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
    case SetupPackage.INDEX__DISCOVERABLE_PACKAGES:
      return getDiscoverablePackages();
    case SetupPackage.INDEX__PRODUCT_CATALOGS:
      return getProductCatalogs();
    case SetupPackage.INDEX__PROJECT_CATALOGS:
      return getProjectCatalogs();
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
    case SetupPackage.INDEX__DISCOVERABLE_PACKAGES:
      getDiscoverablePackages().clear();
      getDiscoverablePackages().addAll((Collection<? extends EPackage>)newValue);
      return;
    case SetupPackage.INDEX__PRODUCT_CATALOGS:
      getProductCatalogs().clear();
      getProductCatalogs().addAll((Collection<? extends ProductCatalog>)newValue);
      return;
    case SetupPackage.INDEX__PROJECT_CATALOGS:
      getProjectCatalogs().clear();
      getProjectCatalogs().addAll((Collection<? extends ProjectCatalog>)newValue);
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
    case SetupPackage.INDEX__DISCOVERABLE_PACKAGES:
      getDiscoverablePackages().clear();
      return;
    case SetupPackage.INDEX__PRODUCT_CATALOGS:
      getProductCatalogs().clear();
      return;
    case SetupPackage.INDEX__PROJECT_CATALOGS:
      getProjectCatalogs().clear();
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
    case SetupPackage.INDEX__DISCOVERABLE_PACKAGES:
      return discoverablePackages != null && !discoverablePackages.isEmpty();
    case SetupPackage.INDEX__PRODUCT_CATALOGS:
      return productCatalogs != null && !productCatalogs.isEmpty();
    case SetupPackage.INDEX__PROJECT_CATALOGS:
      return projectCatalogs != null && !projectCatalogs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // IndexImpl
