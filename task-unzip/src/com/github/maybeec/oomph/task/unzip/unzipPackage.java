/**
 */
package com.github.maybeec.oomph.task.unzip;

import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.github.maybeec.oomph.task.unzip.unzipFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore schemaLocation='https://raw.githubusercontent.com/may-bee/oomph-task-download/master/task-download-updatesite/model/Task-unzip-1.0.ecore'"
 * @generated
 */
public interface unzipPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "unzip";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.example.org/task-unzip/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "com.github.maybeec.oomph.task";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  unzipPackage eINSTANCE = com.github.maybeec.oomph.task.unzip.impl.unzipPackageImpl.init();

  /**
   * The meta object id for the '{@link com.github.maybeec.oomph.task.unzip.impl.unzipTaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.maybeec.oomph.task.unzip.impl.unzipTaskImpl
   * @see com.github.maybeec.oomph.task.unzip.impl.unzipPackageImpl#getunzipTask()
   * @generated
   */
  int UNZIP_TASK = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__ID = SetupPackage.SETUP_TASK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__FILTER = SetupPackage.SETUP_TASK__FILTER;

  /**
   * The feature id for the '<em><b>Zip File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__ZIP_FILE = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Destination Dir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__DESTINATION_DIR = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK__PRIORITY = SetupPackage.SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNZIP_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 3;

  /**
   * Returns the meta object for class '{@link com.github.maybeec.oomph.task.unzip.unzipTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see com.github.maybeec.oomph.task.unzip.unzipTask
   * @generated
   */
  EClass getunzipTask();

  /**
   * Returns the meta object for the attribute '{@link com.github.maybeec.oomph.task.unzip.unzipTask#getZipFile <em>Zip File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Zip File</em>'.
   * @see com.github.maybeec.oomph.task.unzip.unzipTask#getZipFile()
   * @see #getunzipTask()
   * @generated
   */
  EAttribute getunzipTask_ZipFile();

  /**
   * Returns the meta object for the attribute '{@link com.github.maybeec.oomph.task.unzip.unzipTask#getDestinationDir <em>Destination Dir</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Destination Dir</em>'.
   * @see com.github.maybeec.oomph.task.unzip.unzipTask#getDestinationDir()
   * @see #getunzipTask()
   * @generated
   */
  EAttribute getunzipTask_DestinationDir();

  /**
   * Returns the meta object for the attribute '{@link com.github.maybeec.oomph.task.unzip.unzipTask#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see com.github.maybeec.oomph.task.unzip.unzipTask#getPriority()
   * @see #getunzipTask()
   * @generated
   */
  EAttribute getunzipTask_Priority();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  unzipFactory getunzipFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.github.maybeec.oomph.task.unzip.impl.unzipTaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.maybeec.oomph.task.unzip.impl.unzipTaskImpl
     * @see com.github.maybeec.oomph.task.unzip.impl.unzipPackageImpl#getunzipTask()
     * @generated
     */
    EClass UNZIP_TASK = eINSTANCE.getunzipTask();

    /**
     * The meta object literal for the '<em><b>Zip File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNZIP_TASK__ZIP_FILE = eINSTANCE.getunzipTask_ZipFile();

    /**
     * The meta object literal for the '<em><b>Destination Dir</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNZIP_TASK__DESTINATION_DIR = eINSTANCE.getunzipTask_DestinationDir();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNZIP_TASK__PRIORITY = eINSTANCE.getunzipTask_Priority();

  }

} // unzipPackage
