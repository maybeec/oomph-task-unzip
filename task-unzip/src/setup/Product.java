/**
 */
package setup;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link setup.Product#getProductCatalog <em>Product Catalog</em>}</li>
 *   <li>{@link setup.Product#getVersions <em>Versions</em>}</li>
 * </ul>
 * </p>
 *
 * @see setup.SetupPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends Scope
{
  /**
   * Returns the value of the '<em><b>Product Catalog</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link setup.ProductCatalog#getProducts <em>Products</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Product Catalog</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product Catalog</em>' container reference.
   * @see #setProductCatalog(ProductCatalog)
   * @see setup.SetupPackage#getProduct_ProductCatalog()
   * @see setup.ProductCatalog#getProducts
   * @model opposite="products" keys="name"
   * @generated
   */
  ProductCatalog getProductCatalog();

  /**
   * Sets the value of the '{@link setup.Product#getProductCatalog <em>Product Catalog</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Product Catalog</em>' container reference.
   * @see #getProductCatalog()
   * @generated
   */
  void setProductCatalog(ProductCatalog value);

  /**
   * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
   * The list contents are of type {@link setup.ProductVersion}.
   * It is bidirectional and its opposite is '{@link setup.ProductVersion#getProduct <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Versions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Versions</em>' containment reference list.
   * @see setup.SetupPackage#getProduct_Versions()
   * @see setup.ProductVersion#getProduct
   * @model opposite="product" containment="true" keys="name" required="true"
   *        extendedMetaData="name='version'"
   * @generated
   */
  EList<ProductVersion> getVersions();

} // Product
