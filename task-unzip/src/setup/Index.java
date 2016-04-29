/**
 */
package setup;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;

import base.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link setup.Index#getDiscoverablePackages <em>Discoverable Packages</em>}</li>
 *   <li>{@link setup.Index#getProductCatalogs <em>Product Catalogs</em>}</li>
 *   <li>{@link setup.Index#getProjectCatalogs <em>Project Catalogs</em>}</li>
 * </ul>
 * </p>
 *
 * @see setup.SetupPackage#getIndex()
 * @model
 * @generated
 */
public interface Index extends ModelElement
{
  /**
   * Returns the value of the '<em><b>Discoverable Packages</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discoverable Packages</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discoverable Packages</em>' reference list.
   * @see setup.SetupPackage#getIndex_DiscoverablePackages()
   * @model extendedMetaData="name='discoverablePackage'"
   * @generated
   */
  EList<EPackage> getDiscoverablePackages();

  /**
   * Returns the value of the '<em><b>Product Catalogs</b></em>' containment reference list.
   * The list contents are of type {@link setup.ProductCatalog}.
   * It is bidirectional and its opposite is '{@link setup.ProductCatalog#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Product Catalogs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product Catalogs</em>' containment reference list.
   * @see setup.SetupPackage#getIndex_ProductCatalogs()
   * @see setup.ProductCatalog#getIndex
   * @model opposite="index" containment="true" keys="name"
   *        extendedMetaData="name='productCatalog'"
   * @generated
   */
  EList<ProductCatalog> getProductCatalogs();

  /**
   * Returns the value of the '<em><b>Project Catalogs</b></em>' containment reference list.
   * The list contents are of type {@link setup.ProjectCatalog}.
   * It is bidirectional and its opposite is '{@link setup.ProjectCatalog#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project Catalogs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project Catalogs</em>' containment reference list.
   * @see setup.SetupPackage#getIndex_ProjectCatalogs()
   * @see setup.ProjectCatalog#getIndex
   * @model opposite="index" containment="true" keys="name"
   *        extendedMetaData="name='projectCatalog'"
   * @generated
   */
  EList<ProjectCatalog> getProjectCatalogs();

} // Index
