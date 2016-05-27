/**
 */
package com.github.maybee.oomph.task.unzip;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.github.maybee.oomph.task.unzip.unzipPackage
 * @generated
 */
public interface unzipFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  unzipFactory eINSTANCE = com.github.maybee.oomph.task.unzip.impl.unzipFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task</em>'.
   * @generated
   */
  unzipTask createunzipTask();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  unzipPackage getunzipPackage();

} // unzipFactory
