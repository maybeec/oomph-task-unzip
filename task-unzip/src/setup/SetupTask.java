/**
 */
package setup;

import org.eclipse.oomph.setup.Trigger;

import org.eclipse.emf.common.util.EList;

import base.ModelElement;

import java.util.Set;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link setup.SetupTask#getID <em>ID</em>}</li>
 *   <li>{@link setup.SetupTask#getDescription <em>Description</em>}</li>
 *   <li>{@link setup.SetupTask#getScopeType <em>Scope Type</em>}</li>
 *   <li>{@link setup.SetupTask#getExcludedTriggers <em>Excluded Triggers</em>}</li>
 *   <li>{@link setup.SetupTask#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link setup.SetupTask#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link setup.SetupTask#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link setup.SetupTask#getRestrictions <em>Restrictions</em>}</li>
 *   <li>{@link setup.SetupTask#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see setup.SetupPackage#getSetupTask()
 * @model abstract="true"
 * @generated
 */
public interface SetupTask extends ModelElement
{
  /**
   * Returns the value of the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ID</em>' attribute.
   * @see #setID(String)
   * @see setup.SetupPackage#getSetupTask_ID()
   * @model id="true"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
  String getID();

  /**
   * Sets the value of the '{@link setup.SetupTask#getID <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ID</em>' attribute.
   * @see #getID()
   * @generated
   */
  void setID(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see setup.SetupPackage#getSetupTask_Description()
   * @model dataType="base.Text"
   *        extendedMetaData="kind='element'"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link setup.SetupTask#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Scope Type</b></em>' attribute.
   * The literals are from the enumeration {@link setup.ScopeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scope Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scope Type</em>' attribute.
   * @see setup.ScopeType
   * @see setup.SetupPackage#getSetupTask_ScopeType()
   * @model transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  ScopeType getScopeType();

  /**
   * Returns the value of the '<em><b>Excluded Triggers</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Excluded Triggers</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Excluded Triggers</em>' attribute.
   * @see #setExcludedTriggers(Set)
   * @see setup.SetupPackage#getSetupTask_ExcludedTriggers()
   * @model default="" dataType="setup.TriggerSet" required="true"
   * @generated
   */
  Set<Trigger> getExcludedTriggers();

  /**
   * Sets the value of the '{@link setup.SetupTask#getExcludedTriggers <em>Excluded Triggers</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Excluded Triggers</em>' attribute.
   * @see #getExcludedTriggers()
   * @generated
   */
  void setExcludedTriggers(Set<Trigger> value);

  /**
   * Returns the value of the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Disabled</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Disabled</em>' attribute.
   * @see #setDisabled(boolean)
   * @see setup.SetupPackage#getSetupTask_Disabled()
   * @model
   * @generated
   */
  boolean isDisabled();

  /**
   * Sets the value of the '{@link setup.SetupTask#isDisabled <em>Disabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Disabled</em>' attribute.
   * @see #isDisabled()
   * @generated
   */
  void setDisabled(boolean value);

  /**
   * Returns the value of the '<em><b>Predecessors</b></em>' reference list.
   * The list contents are of type {@link setup.SetupTask}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predecessors</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predecessors</em>' reference list.
   * @see setup.SetupPackage#getSetupTask_Predecessors()
   * @model extendedMetaData="name='predecessor'"
   * @generated
   */
  EList<SetupTask> getPredecessors();

  /**
   * Returns the value of the '<em><b>Successors</b></em>' reference list.
   * The list contents are of type {@link setup.SetupTask}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Successors</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Successors</em>' reference list.
   * @see setup.SetupPackage#getSetupTask_Successors()
   * @model extendedMetaData="name='successor'"
   * @generated
   */
  EList<SetupTask> getSuccessors();

  /**
   * Returns the value of the '<em><b>Restrictions</b></em>' reference list.
   * The list contents are of type {@link setup.Scope}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Restrictions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Restrictions</em>' reference list.
   * @see setup.SetupPackage#getSetupTask_Restrictions()
   * @model extendedMetaData="name='restriction'"
   * @generated
   */
  EList<Scope> getRestrictions();

  /**
   * Returns the value of the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' attribute.
   * @see #setFilter(String)
   * @see setup.SetupPackage#getSetupTask_Filter()
   * @model dataType="setup.Filter"
   * @generated
   */
  String getFilter();

  /**
   * Sets the value of the '{@link setup.SetupTask#getFilter <em>Filter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' attribute.
   * @see #getFilter()
   * @generated
   */
  void setFilter(String value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  Scope getScope();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  boolean requires(SetupTask setupTask);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" dataType="setup.TriggerSet" required="true"
   * @generated
   */
  Set<Trigger> getValidTriggers();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" dataType="setup.TriggerSet" required="true"
   * @generated
   */
  Set<Trigger> getTriggers();

} // SetupTask
