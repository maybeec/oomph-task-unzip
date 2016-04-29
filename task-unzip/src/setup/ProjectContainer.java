/**
 */
package setup;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link setup.ProjectContainer#getProjects <em>Projects</em>}</li>
 * </ul>
 * </p>
 *
 * @see setup.SetupPackage#getProjectContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ProjectContainer extends Scope
{
  /**
   * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
   * The list contents are of type {@link setup.Project}.
   * It is bidirectional and its opposite is '{@link setup.Project#getProjectContainer <em>Project Container</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Projects</em>' containment reference list.
   * @see setup.SetupPackage#getProjectContainer_Projects()
   * @see setup.Project#getProjectContainer
   * @model opposite="projectContainer" containment="true" keys="name"
   *        extendedMetaData="name='project'"
   * @generated
   */
  EList<Project> getProjects();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  ProjectContainer getProjectContainer();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  ProjectCatalog getProjectCatalog();

} // ProjectContainer
