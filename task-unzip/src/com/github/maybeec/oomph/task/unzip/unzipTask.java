/**
 */
package com.github.maybeec.oomph.task.unzip;

import org.eclipse.oomph.setup.SetupTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.maybeec.oomph.task.unzip.unzipTask#getZipFile <em>Zip File</em>}</li>
 *   <li>{@link com.github.maybeec.oomph.task.unzip.unzipTask#getDestinationDir <em>Destination Dir</em>}</li>
 *   <li>{@link com.github.maybeec.oomph.task.unzip.unzipTask#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.maybeec.oomph.task.unzip.unzipPackage#getunzipTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='p2.unzip' repository='https://maybeec.github.io/oomph-task-unzip/update' installableUnits='com.github.maybeec.oomph.task.unzip.feature.feature.group'"
 *        annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='BOOTSTRAP STARTUP MANUAL'"
 * @generated
 */
public interface unzipTask extends SetupTask
{
  /**
   * Returns the value of the '<em><b>Zip File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Zip File</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Zip File</em>' attribute.
   * @see #setZipFile(String)
   * @see com.github.maybeec.oomph.task.unzip.unzipPackage#getunzipTask_ZipFile()
   * @model required="true"
   * @generated
   */
  String getZipFile();

  /**
   * Sets the value of the '{@link com.github.maybeec.oomph.task.unzip.unzipTask#getZipFile <em>Zip File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Zip File</em>' attribute.
   * @see #getZipFile()
   * @generated
   */
  void setZipFile(String value);

  /**
   * Returns the value of the '<em><b>Destination Dir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination Dir</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination Dir</em>' attribute.
   * @see #setDestinationDir(String)
   * @see com.github.maybeec.oomph.task.unzip.unzipPackage#getunzipTask_DestinationDir()
   * @model required="true"
   * @generated
   */
  String getDestinationDir();

  /**
   * Sets the value of the '{@link com.github.maybeec.oomph.task.unzip.unzipTask#getDestinationDir <em>Destination Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination Dir</em>' attribute.
   * @see #getDestinationDir()
   * @generated
   */
  void setDestinationDir(String value);

  /**
   * Returns the value of the '<em><b>Priority</b></em>' attribute.
   * The default value is <code>"500"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' attribute.
   * @see #setPriority(int)
   * @see com.github.maybeec.oomph.task.unzip.unzipPackage#getunzipTask_Priority()
   * @model default="500"
   * @generated
   */
  int getPriority();

  /**
   * Sets the value of the '{@link com.github.maybeec.oomph.task.unzip.unzipTask#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see #getPriority()
   * @generated
   */
  void setPriority(int value);

} // unzipTask
