/**
 */
package setup;

import org.eclipse.emf.common.util.EList;

import base.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link setup.SetupTaskContainer#getSetupTasks <em>Setup Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see setup.SetupPackage#getSetupTaskContainer()
 * @model abstract="true"
 * @generated
 */
public interface SetupTaskContainer extends ModelElement
{
  /**
   * Returns the value of the '<em><b>Setup Tasks</b></em>' containment reference list.
   * The list contents are of type {@link setup.SetupTask}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Setup Tasks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Setup Tasks</em>' containment reference list.
   * @see setup.SetupPackage#getSetupTaskContainer_SetupTasks()
   * @model containment="true"
   *        extendedMetaData="name='setupTask'"
   * @generated
   */
  EList<SetupTask> getSetupTasks();

} // SetupTaskContainer
