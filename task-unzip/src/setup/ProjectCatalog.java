/**
 */
package setup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link setup.ProjectCatalog#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see setup.SetupPackage#getProjectCatalog()
 * @model
 * @generated
 */
public interface ProjectCatalog extends ProjectContainer
{
  /**
   * Returns the value of the '<em><b>Index</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link setup.Index#getProjectCatalogs <em>Project Catalogs</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' container reference.
   * @see #setIndex(Index)
   * @see setup.SetupPackage#getProjectCatalog_Index()
   * @see setup.Index#getProjectCatalogs
   * @model opposite="projectCatalogs"
   * @generated
   */
  Index getIndex();

  /**
   * Sets the value of the '{@link setup.ProjectCatalog#getIndex <em>Index</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' container reference.
   * @see #getIndex()
   * @generated
   */
  void setIndex(Index value);

} // ProjectCatalog
