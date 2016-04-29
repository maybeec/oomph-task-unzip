/**
 */
package setup.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import base.BaseFactory;
import base.BasePackage;
import setup.SetupPackage;
import setup.VariableChoice;
import setup.VariableTask;
import setup.VariableType;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link setup.impl.VariableTaskImpl#getType <em>Type</em>}</li>
 *   <li>{@link setup.impl.VariableTaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link setup.impl.VariableTaskImpl#getValue <em>Value</em>}</li>
 *   <li>{@link setup.impl.VariableTaskImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link setup.impl.VariableTaskImpl#isStorePromptedValue <em>Store Prompted Value</em>}</li>
 *   <li>{@link setup.impl.VariableTaskImpl#getStorageURI <em>Storage URI</em>}</li>
 *   <li>{@link setup.impl.VariableTaskImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link setup.impl.VariableTaskImpl#getChoices <em>Choices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableTaskImpl extends SetupTaskImpl implements VariableTask
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final VariableType TYPE_EDEFAULT = VariableType.STRING;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected VariableType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isStorePromptedValue() <em>Store Prompted Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStorePromptedValue()
   * @generated
   * @ordered
   */
  protected static final boolean STORE_PROMPTED_VALUE_EDEFAULT = true;

  /**
   * The default value of the '{@link #getStorageURI() <em>Storage URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStorageURI()
   * @generated
   * @ordered
   */
  protected static final URI STORAGE_URI_EDEFAULT = (URI)BaseFactory.eINSTANCE.createFromString(BasePackage.eINSTANCE.getURI(), "scope://");

  /**
   * The cached value of the '{@link #getStorageURI() <em>Storage URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStorageURI()
   * @generated
   * @ordered
   */
  protected URI storageURI = STORAGE_URI_EDEFAULT;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getChoices() <em>Choices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChoices()
   * @generated
   * @ordered
   */
  protected EList<VariableChoice> choices;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableTaskImpl()
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
    return SetupPackage.Literals.VARIABLE_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(VariableType newType)
  {
    VariableType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.VARIABLE_TASK__TYPE, oldType, type));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.VARIABLE_TASK__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.VARIABLE_TASK__VALUE, oldValue, value));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValue(String newDefaultValue)
  {
    String oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.VARIABLE_TASK__DEFAULT_VALUE, oldDefaultValue, defaultValue));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStorePromptedValue()
  {
    // TODO: implement this method to return the 'Store Prompted Value' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStorePromptedValue(boolean newStorePromptedValue)
  {
    // TODO: implement this method to set the 'Store Prompted Value' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URI getStorageURI()
  {
    return storageURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStorageURI(URI newStorageURI)
  {
    URI oldStorageURI = storageURI;
    storageURI = newStorageURI;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.VARIABLE_TASK__STORAGE_URI, oldStorageURI, storageURI));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.VARIABLE_TASK__LABEL, oldLabel, label));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableChoice> getChoices()
  {
    if (choices == null)
    {
      choices = new EObjectContainmentEList<VariableChoice>(VariableChoice.class, this, SetupPackage.VARIABLE_TASK__CHOICES);
    }
    return choices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case SetupPackage.VARIABLE_TASK__CHOICES:
      return ((InternalEList<?>)getChoices()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
    case SetupPackage.VARIABLE_TASK__TYPE:
      return getType();
    case SetupPackage.VARIABLE_TASK__NAME:
      return getName();
    case SetupPackage.VARIABLE_TASK__VALUE:
      return getValue();
    case SetupPackage.VARIABLE_TASK__DEFAULT_VALUE:
      return getDefaultValue();
    case SetupPackage.VARIABLE_TASK__STORE_PROMPTED_VALUE:
      return isStorePromptedValue();
    case SetupPackage.VARIABLE_TASK__STORAGE_URI:
      return getStorageURI();
    case SetupPackage.VARIABLE_TASK__LABEL:
      return getLabel();
    case SetupPackage.VARIABLE_TASK__CHOICES:
      return getChoices();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case SetupPackage.VARIABLE_TASK__TYPE:
      setType((VariableType)newValue);
      return;
    case SetupPackage.VARIABLE_TASK__NAME:
      setName((String)newValue);
      return;
    case SetupPackage.VARIABLE_TASK__VALUE:
      setValue((String)newValue);
      return;
    case SetupPackage.VARIABLE_TASK__DEFAULT_VALUE:
      setDefaultValue((String)newValue);
      return;
    case SetupPackage.VARIABLE_TASK__STORE_PROMPTED_VALUE:
      setStorePromptedValue((Boolean)newValue);
      return;
    case SetupPackage.VARIABLE_TASK__STORAGE_URI:
      setStorageURI((URI)newValue);
      return;
    case SetupPackage.VARIABLE_TASK__LABEL:
      setLabel((String)newValue);
      return;
    case SetupPackage.VARIABLE_TASK__CHOICES:
      getChoices().clear();
      getChoices().addAll((Collection<? extends VariableChoice>)newValue);
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
    case SetupPackage.VARIABLE_TASK__TYPE:
      setType(TYPE_EDEFAULT);
      return;
    case SetupPackage.VARIABLE_TASK__NAME:
      setName(NAME_EDEFAULT);
      return;
    case SetupPackage.VARIABLE_TASK__VALUE:
      setValue(VALUE_EDEFAULT);
      return;
    case SetupPackage.VARIABLE_TASK__DEFAULT_VALUE:
      setDefaultValue(DEFAULT_VALUE_EDEFAULT);
      return;
    case SetupPackage.VARIABLE_TASK__STORE_PROMPTED_VALUE:
      setStorePromptedValue(STORE_PROMPTED_VALUE_EDEFAULT);
      return;
    case SetupPackage.VARIABLE_TASK__STORAGE_URI:
      setStorageURI(STORAGE_URI_EDEFAULT);
      return;
    case SetupPackage.VARIABLE_TASK__LABEL:
      setLabel(LABEL_EDEFAULT);
      return;
    case SetupPackage.VARIABLE_TASK__CHOICES:
      getChoices().clear();
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
    case SetupPackage.VARIABLE_TASK__TYPE:
      return type != TYPE_EDEFAULT;
    case SetupPackage.VARIABLE_TASK__NAME:
      return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    case SetupPackage.VARIABLE_TASK__VALUE:
      return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
    case SetupPackage.VARIABLE_TASK__DEFAULT_VALUE:
      return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
    case SetupPackage.VARIABLE_TASK__STORE_PROMPTED_VALUE:
      return isStorePromptedValue() != STORE_PROMPTED_VALUE_EDEFAULT;
    case SetupPackage.VARIABLE_TASK__STORAGE_URI:
      return STORAGE_URI_EDEFAULT == null ? storageURI != null : !STORAGE_URI_EDEFAULT.equals(storageURI);
    case SetupPackage.VARIABLE_TASK__LABEL:
      return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
    case SetupPackage.VARIABLE_TASK__CHOICES:
      return choices != null && !choices.isEmpty();
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
    result.append(" (type: ");
    result.append(type);
    result.append(", name: ");
    result.append(name);
    result.append(", value: ");
    result.append(value);
    result.append(", defaultValue: ");
    result.append(defaultValue);
    result.append(", storageURI: ");
    result.append(storageURI);
    result.append(", label: ");
    result.append(label);
    result.append(')');
    return result.toString();
  }

} // VariableTaskImpl
