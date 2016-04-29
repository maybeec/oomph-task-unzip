/**
 */
package setup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link setup.ProductVersion#getProduct <em>Product</em>}</li>
 *   <li>{@link setup.ProductVersion#getRequiredJavaVersion <em>Required Java Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see setup.SetupPackage#getProductVersion()
 * @model
 * @generated
 */
public interface ProductVersion extends Scope
{
  /**
   * Returns the value of the '<em><b>Product</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link setup.Product#getVersions <em>Versions</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Product</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product</em>' container reference.
   * @see #setProduct(Product)
   * @see setup.SetupPackage#getProductVersion_Product()
   * @see setup.Product#getVersions
   * @model opposite="versions" required="true"
   * @generated
   */
  Product getProduct();

  /**
   * Sets the value of the '{@link setup.ProductVersion#getProduct <em>Product</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Product</em>' container reference.
   * @see #getProduct()
   * @generated
   */
  void setProduct(Product value);

  /**
   * Returns the value of the '<em><b>Required Java Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Java Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Java Version</em>' attribute.
   * @see #setRequiredJavaVersion(String)
   * @see setup.SetupPackage#getProductVersion_RequiredJavaVersion()
   * @model
   * @generated
   */
  String getRequiredJavaVersion();

  /**
   * Sets the value of the '{@link setup.ProductVersion#getRequiredJavaVersion <em>Required Java Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required Java Version</em>' attribute.
   * @see #getRequiredJavaVersion()
   * @generated
   */
  void setRequiredJavaVersion(String value);

} // ProductVersion
