/**
 */
package setup;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link setup.LocationCatalog#getInstallations <em>Installations</em>}</li>
 *   <li>{@link setup.LocationCatalog#getWorkspaces <em>Workspaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see setup.SetupPackage#getLocationCatalog()
 * @model
 * @generated
 */
public interface LocationCatalog extends EObject
{
  /**
   * Returns the value of the '<em><b>Installations</b></em>' map.
   * The key is of type {@link setup.Installation},
   * and the value is of type list of {@link setup.Workspace},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Installations</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Installations</em>' map.
   * @see setup.SetupPackage#getLocationCatalog_Installations()
   * @model mapType="setup.InstallationToWorkspacesMapEntry<setup.Installation, setup.Workspace>"
   *        extendedMetaData="name='installation'"
   * @generated
   */
  EMap<Installation, EList<Workspace>> getInstallations();

  /**
   * Returns the value of the '<em><b>Workspaces</b></em>' map.
   * The key is of type {@link setup.Workspace},
   * and the value is of type list of {@link setup.Installation},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workspaces</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workspaces</em>' map.
   * @see setup.SetupPackage#getLocationCatalog_Workspaces()
   * @model mapType="setup.WorkspaceToInstallationsMapEntry<setup.Workspace, setup.Installation>"
   *        extendedMetaData="name='workspace'"
   * @generated
   */
  EMap<Workspace, EList<Installation>> getWorkspaces();

} // LocationCatalog
