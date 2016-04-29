/**
 */
package unzip.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import unzip.unzipFactory;
import unzip.unzipPackage;
import unzip.unzipTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class unzipFactoryImpl extends EFactoryImpl implements unzipFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static unzipFactory init()
  {
    try
    {
      unzipFactory theunzipFactory = (unzipFactory)EPackage.Registry.INSTANCE.getEFactory(unzipPackage.eNS_URI);
      if (theunzipFactory != null)
      {
        return theunzipFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new unzipFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unzipFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    case unzipPackage.UNZIP_TASK:
      return createunzipTask();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unzipTask createunzipTask()
  {
    unzipTaskImpl unzipTask = new unzipTaskImpl();
    return unzipTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unzipPackage getunzipPackage()
  {
    return (unzipPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static unzipPackage getPackage()
  {
    return unzipPackage.eINSTANCE;
  }

} // unzipFactoryImpl
