/**
 */
package com.github.maybee.oomph.task.unzip.impl;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.github.maybee.oomph.task.unzip.unzipPackage;
import com.github.maybee.oomph.task.unzip.unzipTask;
import com.github.maybee.oomph.task.unzip.core.SetupTaskLogger;
import com.github.maybee.oomph.task.unzip.core.UnzipUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.maybee.oomph.task.unzip.impl.unzipTaskImpl#getZipFile <em>Zip File</em>}</li>
 *   <li>{@link com.github.maybee.oomph.task.unzip.impl.unzipTaskImpl#getDestinationDir <em>Destination Dir</em>}</li>
 *   <li>{@link com.github.maybee.oomph.task.unzip.impl.unzipTaskImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class unzipTaskImpl extends SetupTaskImpl implements unzipTask
{
  /**
   * The default value of the '{@link #getZipFile() <em>Zip File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZipFile()
   * @generated
   * @ordered
   */
  protected static final String ZIP_FILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getZipFile() <em>Zip File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZipFile()
   * @generated
   * @ordered
   */
  protected String zipFile = ZIP_FILE_EDEFAULT;

  /**
   * The default value of the '{@link #getDestinationDir() <em>Destination Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinationDir()
   * @generated
   * @ordered
   */
  protected static final String DESTINATION_DIR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDestinationDir() <em>Destination Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinationDir()
   * @generated
   * @ordered
   */
  protected String destinationDir = DESTINATION_DIR_EDEFAULT;

  /**
   * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected static final int PRIORITY_EDEFAULT = 500;

  /**
   * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected int priority = PRIORITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected unzipTaskImpl()
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
    return unzipPackage.Literals.UNZIP_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getZipFile()
  {
    return zipFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setZipFile(String newZipFile)
  {
    String oldZipFile = zipFile;
    zipFile = newZipFile;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, unzipPackage.UNZIP_TASK__ZIP_FILE, oldZipFile, zipFile));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDestinationDir()
  {
    return destinationDir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestinationDir(String newDestinationDir)
  {
    String oldDestinationDir = destinationDir;
    destinationDir = newDestinationDir;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, unzipPackage.UNZIP_TASK__DESTINATION_DIR, oldDestinationDir, destinationDir));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getPriority()
  {
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPriority(int newPriority)
  {
    int oldPriority = priority;
    priority = newPriority;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, unzipPackage.UNZIP_TASK__PRIORITY, oldPriority, priority));
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
    case unzipPackage.UNZIP_TASK__ZIP_FILE:
      return getZipFile();
    case unzipPackage.UNZIP_TASK__DESTINATION_DIR:
      return getDestinationDir();
    case unzipPackage.UNZIP_TASK__PRIORITY:
      return getPriority();
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
    case unzipPackage.UNZIP_TASK__ZIP_FILE:
      setZipFile((String)newValue);
      return;
    case unzipPackage.UNZIP_TASK__DESTINATION_DIR:
      setDestinationDir((String)newValue);
      return;
    case unzipPackage.UNZIP_TASK__PRIORITY:
      setPriority((Integer)newValue);
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
    case unzipPackage.UNZIP_TASK__ZIP_FILE:
      setZipFile(ZIP_FILE_EDEFAULT);
      return;
    case unzipPackage.UNZIP_TASK__DESTINATION_DIR:
      setDestinationDir(DESTINATION_DIR_EDEFAULT);
      return;
    case unzipPackage.UNZIP_TASK__PRIORITY:
      setPriority(PRIORITY_EDEFAULT);
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
    case unzipPackage.UNZIP_TASK__ZIP_FILE:
      return ZIP_FILE_EDEFAULT == null ? zipFile != null : !ZIP_FILE_EDEFAULT.equals(zipFile);
    case unzipPackage.UNZIP_TASK__DESTINATION_DIR:
      return DESTINATION_DIR_EDEFAULT == null ? destinationDir != null : !DESTINATION_DIR_EDEFAULT.equals(destinationDir);
    case unzipPackage.UNZIP_TASK__PRIORITY:
      return priority != PRIORITY_EDEFAULT;
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
    result.append(" (zipFile: ");
    result.append(zipFile);
    result.append(", destinationDir: ");
    result.append(destinationDir);
    result.append(", priority: ");
    result.append(priority);
    result.append(')');
    return result.toString();
  }

  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    return true;
  }

  public void perform(SetupTaskContext context) throws Exception
  {
    SetupTaskLogger.getLogger().setContext(context);
    UnzipUtil unzipUtil = UnzipUtil.getInstance();
    unzipUtil.unzip(zipFile, destinationDir);
  }

  @Override
  public void dispose()
  {
  }
} // unzipTaskImpl
