/**
 */
package setup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Installation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link setup.Installation#getProductVersion <em>Product Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see setup.SetupPackage#getInstallation()
 * @model
 * @generated
 */
public interface Installation extends Scope
{
  /**
   * Returns the value of the '<em><b>Product Version</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Product Version</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product Version</em>' reference.
   * @see #setProductVersion(ProductVersion)
   * @see setup.SetupPackage#getInstallation_ProductVersion()
   * @model required="true"
   * @generated
   */
  ProductVersion getProductVersion();

  /**
   * Sets the value of the '{@link setup.Installation#getProductVersion <em>Product Version</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Product Version</em>' reference.
   * @see #getProductVersion()
   * @generated
   */
  void setProductVersion(ProductVersion value);

} // Installation
