/**
 */
package setup;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link setup.VariableTask#getType <em>Type</em>}</li>
 *   <li>{@link setup.VariableTask#getName <em>Name</em>}</li>
 *   <li>{@link setup.VariableTask#getValue <em>Value</em>}</li>
 *   <li>{@link setup.VariableTask#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link setup.VariableTask#getStorageURI <em>Storage URI</em>}</li>
 *   <li>{@link setup.VariableTask#getLabel <em>Label</em>}</li>
 *   <li>{@link setup.VariableTask#getChoices <em>Choices</em>}</li>
 * </ul>
 * </p>
 *
 * @see setup.SetupPackage#getVariableTask()
 * @model features="storePromptedValue"
 *        storePromptedValueDefault="true" storePromptedValueDataType="org.eclipse.emf.ecore.EBoolean" storePromptedValueTransient="true" storePromptedValueVolatile="true" storePromptedValueDerived="true" storePromptedValueSuppressedGetVisibility="true" storePromptedValueSuppressedSetVisibility="true"
 * @generated
 */
public interface VariableTask extends SetupTask
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The default value is <code>"STRING"</code>.
   * The literals are from the enumeration {@link setup.VariableType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see setup.VariableType
   * @see #setType(VariableType)
   * @see setup.SetupPackage#getVariableTask_Type()
   * @model default="STRING" required="true"
   * @generated
   */
  VariableType getType();

  /**
   * Sets the value of the '{@link setup.VariableTask#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see setup.VariableType
   * @see #getType()
   * @generated
   */
  void setType(VariableType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see setup.SetupPackage#getVariableTask_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link setup.VariableTask#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see setup.SetupPackage#getVariableTask_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link setup.VariableTask#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' attribute.
   * @see #setDefaultValue(String)
   * @see setup.SetupPackage#getVariableTask_DefaultValue()
   * @model
   * @generated
   */
  String getDefaultValue();

  /**
   * Sets the value of the '{@link setup.VariableTask#getDefaultValue <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' attribute.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(String value);

  /**
   * Returns the value of the '<em><b>Storage URI</b></em>' attribute.
   * The default value is <code>"scope://"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Storage URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Storage URI</em>' attribute.
   * @see #setStorageURI(URI)
   * @see setup.SetupPackage#getVariableTask_StorageURI()
   * @model default="scope://" dataType="base.URI"
   * @generated
   */
  URI getStorageURI();

  /**
   * Sets the value of the '{@link setup.VariableTask#getStorageURI <em>Storage URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Storage URI</em>' attribute.
   * @see #getStorageURI()
   * @generated
   */
  void setStorageURI(URI value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see setup.SetupPackage#getVariableTask_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link setup.VariableTask#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Choices</b></em>' containment reference list.
   * The list contents are of type {@link setup.VariableChoice}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Choices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choices</em>' containment reference list.
   * @see setup.SetupPackage#getVariableTask_Choices()
   * @model containment="true"
   *        extendedMetaData="name='choice'"
   * @generated
   */
  EList<VariableChoice> getChoices();

} // VariableTask
