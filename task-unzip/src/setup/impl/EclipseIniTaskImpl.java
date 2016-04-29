/**
 */
package setup.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import setup.EclipseIniTask;
import setup.SetupPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eclipse Ini Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link setup.impl.EclipseIniTaskImpl#getOption <em>Option</em>}</li>
 *   <li>{@link setup.impl.EclipseIniTaskImpl#getValue <em>Value</em>}</li>
 *   <li>{@link setup.impl.EclipseIniTaskImpl#isVm <em>Vm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EclipseIniTaskImpl extends SetupTaskImpl implements EclipseIniTask
{
  /**
   * The default value of the '{@link #getOption() <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOption()
   * @generated
   * @ordered
   */
  protected static final String OPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOption() <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOption()
   * @generated
   * @ordered
   */
  protected String option = OPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isVm() <em>Vm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVm()
   * @generated
   * @ordered
   */
  protected static final boolean VM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isVm() <em>Vm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVm()
   * @generated
   * @ordered
   */
  protected boolean vm = VM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EclipseIniTaskImpl()
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
    return SetupPackage.Literals.ECLIPSE_INI_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOption()
  {
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOption(String newOption)
  {
    String oldOption = option;
    option = newOption;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.ECLIPSE_INI_TASK__OPTION, oldOption, option));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.ECLIPSE_INI_TASK__VALUE, oldValue, value));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isVm()
  {
    return vm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVm(boolean newVm)
  {
    boolean oldVm = vm;
    vm = newVm;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.ECLIPSE_INI_TASK__VM, oldVm, vm));
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
    case SetupPackage.ECLIPSE_INI_TASK__OPTION:
      return getOption();
    case SetupPackage.ECLIPSE_INI_TASK__VALUE:
      return getValue();
    case SetupPackage.ECLIPSE_INI_TASK__VM:
      return isVm();
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
    case SetupPackage.ECLIPSE_INI_TASK__OPTION:
      setOption((String)newValue);
      return;
    case SetupPackage.ECLIPSE_INI_TASK__VALUE:
      setValue((String)newValue);
      return;
    case SetupPackage.ECLIPSE_INI_TASK__VM:
      setVm((Boolean)newValue);
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
    case SetupPackage.ECLIPSE_INI_TASK__OPTION:
      setOption(OPTION_EDEFAULT);
      return;
    case SetupPackage.ECLIPSE_INI_TASK__VALUE:
      setValue(VALUE_EDEFAULT);
      return;
    case SetupPackage.ECLIPSE_INI_TASK__VM:
      setVm(VM_EDEFAULT);
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
    case SetupPackage.ECLIPSE_INI_TASK__OPTION:
      return OPTION_EDEFAULT == null ? option != null : !OPTION_EDEFAULT.equals(option);
    case SetupPackage.ECLIPSE_INI_TASK__VALUE:
      return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
    case SetupPackage.ECLIPSE_INI_TASK__VM:
      return vm != VM_EDEFAULT;
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
    result.append(" (option: ");
    result.append(option);
    result.append(", value: ");
    result.append(value);
    result.append(", vm: ");
    result.append(vm);
    result.append(')');
    return result.toString();
  }

} // EclipseIniTaskImpl
