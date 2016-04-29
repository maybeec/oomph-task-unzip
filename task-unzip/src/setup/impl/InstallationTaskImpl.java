/**
 */
package setup.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import setup.InstallationTask;
import setup.SetupPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Installation Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link setup.impl.InstallationTaskImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link setup.impl.InstallationTaskImpl#getRelativeProductFolder <em>Relative Product Folder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstallationTaskImpl extends SetupTaskImpl implements InstallationTask
{
  /**
   * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected static final String LOCATION_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected String location = LOCATION_EDEFAULT;

  /**
   * The default value of the '{@link #getRelativeProductFolder() <em>Relative Product Folder</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelativeProductFolder()
   * @generated
   * @ordered
   */
  protected static final String RELATIVE_PRODUCT_FOLDER_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getRelativeProductFolder() <em>Relative Product Folder</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelativeProductFolder()
   * @generated
   * @ordered
   */
  protected String relativeProductFolder = RELATIVE_PRODUCT_FOLDER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstallationTaskImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SetupPackage.Literals.INSTALLATION_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation(String newLocation)
  {
    String oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.INSTALLATION_TASK__LOCATION, oldLocation, location));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRelativeProductFolder()
  {
    return relativeProductFolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelativeProductFolder(String newRelativeProductFolder)
  {
    String oldRelativeProductFolder = relativeProductFolder;
    relativeProductFolder = newRelativeProductFolder;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.INSTALLATION_TASK__RELATIVE_PRODUCT_FOLDER, oldRelativeProductFolder,
          relativeProductFolder));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case SetupPackage.INSTALLATION_TASK__LOCATION:
      return getLocation();
    case SetupPackage.INSTALLATION_TASK__RELATIVE_PRODUCT_FOLDER:
      return getRelativeProductFolder();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case SetupPackage.INSTALLATION_TASK__LOCATION:
      setLocation((String)newValue);
      return;
    case SetupPackage.INSTALLATION_TASK__RELATIVE_PRODUCT_FOLDER:
      setRelativeProductFolder((String)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case SetupPackage.INSTALLATION_TASK__LOCATION:
      setLocation(LOCATION_EDEFAULT);
      return;
    case SetupPackage.INSTALLATION_TASK__RELATIVE_PRODUCT_FOLDER:
      setRelativeProductFolder(RELATIVE_PRODUCT_FOLDER_EDEFAULT);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case SetupPackage.INSTALLATION_TASK__LOCATION:
      return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
    case SetupPackage.INSTALLATION_TASK__RELATIVE_PRODUCT_FOLDER:
      return RELATIVE_PRODUCT_FOLDER_EDEFAULT == null ? relativeProductFolder != null : !RELATIVE_PRODUCT_FOLDER_EDEFAULT.equals(relativeProductFolder);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy())
    {
      return super.toString();
    }

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (location: ");
    result.append(location);
    result.append(", relativeProductFolder: ");
    result.append(relativeProductFolder);
    result.append(')');
    return result.toString();
  }

} // InstallationTaskImpl
