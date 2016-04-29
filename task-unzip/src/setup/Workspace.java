/**
 */
package setup;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link setup.Workspace#getStreams <em>Streams</em>}</li>
 * </ul>
 * </p>
 *
 * @see setup.SetupPackage#getWorkspace()
 * @model
 * @generated
 */
public interface Workspace extends Scope
{
  /**
   * Returns the value of the '<em><b>Streams</b></em>' reference list.
   * The list contents are of type {@link setup.Stream}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Streams</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Streams</em>' reference list.
   * @see setup.SetupPackage#getWorkspace_Streams()
   * @model extendedMetaData="name='stream'"
   * @generated
   */
  EList<Stream> getStreams();

} // Workspace
