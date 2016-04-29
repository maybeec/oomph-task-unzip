/**
 */
package setup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link setup.Stream#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see setup.SetupPackage#getStream()
 * @model
 * @generated
 */
public interface Stream extends Scope
{
  /**
   * Returns the value of the '<em><b>Project</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link setup.Project#getStreams <em>Streams</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project</em>' container reference.
   * @see #setProject(Project)
   * @see setup.SetupPackage#getStream_Project()
   * @see setup.Project#getStreams
   * @model opposite="streams"
   * @generated
   */
  Project getProject();

  /**
   * Sets the value of the '{@link setup.Stream#getProject <em>Project</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project</em>' container reference.
   * @see #getProject()
   * @generated
   */
  void setProject(Project value);

} // Stream
