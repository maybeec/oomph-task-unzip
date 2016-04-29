/**
 */
package setup;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import base.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link setup.CatalogSelection#getProductCatalogs <em>Product Catalogs</em>}</li>
 *   <li>{@link setup.CatalogSelection#getProjectCatalogs <em>Project Catalogs</em>}</li>
 *   <li>{@link setup.CatalogSelection#getDefaultProductVersions <em>Default Product Versions</em>}</li>
 *   <li>{@link setup.CatalogSelection#getDefaultStreams <em>Default Streams</em>}</li>
 *   <li>{@link setup.CatalogSelection#getSelectedStreams <em>Selected Streams</em>}</li>
 * </ul>
 * </p>
 *
 * @see setup.SetupPackage#getCatalogSelection()
 * @model
 * @generated
 */
public interface CatalogSelection extends ModelElement
{
  /**
   * Returns the value of the '<em><b>Product Catalogs</b></em>' reference list.
   * The list contents are of type {@link setup.ProductCatalog}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Product Catalogs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product Catalogs</em>' reference list.
   * @see setup.SetupPackage#getCatalogSelection_ProductCatalogs()
   * @model keys="name"
   *        extendedMetaData="name='productCatalog'"
   * @generated
   */
  EList<ProductCatalog> getProductCatalogs();

  /**
   * Returns the value of the '<em><b>Project Catalogs</b></em>' reference list.
   * The list contents are of type {@link setup.ProjectCatalog}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project Catalogs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project Catalogs</em>' reference list.
   * @see setup.SetupPackage#getCatalogSelection_ProjectCatalogs()
   * @model keys="name"
   *        extendedMetaData="name='projectCatalog'"
   * @generated
   */
  EList<ProjectCatalog> getProjectCatalogs();

  /**
   * Returns the value of the '<em><b>Default Product Versions</b></em>' map.
   * The key is of type {@link setup.Product},
   * and the value is of type {@link setup.ProductVersion},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Product Versions</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Product Versions</em>' map.
   * @see setup.SetupPackage#getCatalogSelection_DefaultProductVersions()
   * @model mapType="setup.ProductToProductVersionMapEntry<setup.Product, setup.ProductVersion>"
   *        extendedMetaData="name='defaultProductVersion'"
   * @generated
   */
  EMap<Product, ProductVersion> getDefaultProductVersions();

  /**
   * Returns the value of the '<em><b>Default Streams</b></em>' map.
   * The key is of type {@link setup.Project},
   * and the value is of type {@link setup.Stream},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Streams</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Streams</em>' map.
   * @see setup.SetupPackage#getCatalogSelection_DefaultStreams()
   * @model mapType="setup.ProjectToStreamMapEntry<setup.Project, setup.Stream>"
   *        extendedMetaData="name='defaultStream'"
   * @generated
   */
  EMap<Project, Stream> getDefaultStreams();

  /**
   * Returns the value of the '<em><b>Selected Streams</b></em>' reference list.
   * The list contents are of type {@link setup.Stream}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selected Streams</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selected Streams</em>' reference list.
   * @see setup.SetupPackage#getCatalogSelection_SelectedStreams()
   * @model transient="true" volatile="true" derived="true"
   * @generated
   */
  EList<Stream> getSelectedStreams();

} // CatalogSelection
