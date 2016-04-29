/**
 */
package setup.impl;

import org.eclipse.oomph.setup.Trigger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import base.impl.ModelElementImpl;
import setup.Scope;
import setup.ScopeType;
import setup.SetupPackage;
import setup.SetupTask;

import java.util.Collection;
import java.util.Set;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link setup.impl.SetupTaskImpl#getID <em>ID</em>}</li>
 *   <li>{@link setup.impl.SetupTaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link setup.impl.SetupTaskImpl#getScopeType <em>Scope Type</em>}</li>
 *   <li>{@link setup.impl.SetupTaskImpl#getExcludedTriggers <em>Excluded Triggers</em>}</li>
 *   <li>{@link setup.impl.SetupTaskImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link setup.impl.SetupTaskImpl#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link setup.impl.SetupTaskImpl#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link setup.impl.SetupTaskImpl#getRestrictions <em>Restrictions</em>}</li>
 *   <li>{@link setup.impl.SetupTaskImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SetupTaskImpl extends ModelElementImpl implements SetupTask
{
  /**
   * The default value of the '{@link #getID() <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getID()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getID()
   * @generated
   * @ordered
   */
  protected String iD = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getScopeType() <em>Scope Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScopeType()
   * @generated
   * @ordered
   */
  protected static final ScopeType SCOPE_TYPE_EDEFAULT = ScopeType.NONE;

  /**
   * The cached value of the '{@link #getExcludedTriggers() <em>Excluded Triggers</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExcludedTriggers()
   * @generated
   * @ordered
   */
  protected Set<Trigger> excludedTriggers;

  /**
   * The default value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDisabled()
   * @generated
   * @ordered
   */
  protected static final boolean DISABLED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDisabled()
   * @generated
   * @ordered
   */
  protected boolean disabled = DISABLED_EDEFAULT;

  /**
   * The cached value of the '{@link #getPredecessors() <em>Predecessors</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredecessors()
   * @generated
   * @ordered
   */
  protected EList<SetupTask> predecessors;

  /**
   * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuccessors()
   * @generated
   * @ordered
   */
  protected EList<SetupTask> successors;

  /**
   * The cached value of the '{@link #getRestrictions() <em>Restrictions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestrictions()
   * @generated
   * @ordered
   */
  protected EList<Scope> restrictions;

  /**
   * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected static final String FILTER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected String filter = FILTER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetupTaskImpl()
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
    return SetupPackage.Literals.SETUP_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getID()
  {
    return iD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setID(String newID)
  {
    String oldID = iD;
    iD = newID;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.SETUP_TASK__ID, oldID, iD));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.SETUP_TASK__DESCRIPTION, oldDescription, description));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopeType getScopeType()
  {
    // TODO: implement this method to return the 'Scope Type' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Set<Trigger> getExcludedTriggers()
  {
    return excludedTriggers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExcludedTriggers(Set<Trigger> newExcludedTriggers)
  {
    Set<Trigger> oldExcludedTriggers = excludedTriggers;
    excludedTriggers = newExcludedTriggers;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS, oldExcludedTriggers, excludedTriggers));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDisabled()
  {
    return disabled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisabled(boolean newDisabled)
  {
    boolean oldDisabled = disabled;
    disabled = newDisabled;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.SETUP_TASK__DISABLED, oldDisabled, disabled));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SetupTask> getPredecessors()
  {
    if (predecessors == null)
    {
      predecessors = new EObjectResolvingEList<SetupTask>(SetupTask.class, this, SetupPackage.SETUP_TASK__PREDECESSORS);
    }
    return predecessors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SetupTask> getSuccessors()
  {
    if (successors == null)
    {
      successors = new EObjectResolvingEList<SetupTask>(SetupTask.class, this, SetupPackage.SETUP_TASK__SUCCESSORS);
    }
    return successors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Scope> getRestrictions()
  {
    if (restrictions == null)
    {
      restrictions = new EObjectResolvingEList<Scope>(Scope.class, this, SetupPackage.SETUP_TASK__RESTRICTIONS);
    }
    return restrictions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilter(String newFilter)
  {
    String oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.SETUP_TASK__FILTER, oldFilter, filter));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scope getScope()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean requires(SetupTask setupTask)
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Set<Trigger> getValidTriggers()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Set<Trigger> getTriggers()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
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
    case SetupPackage.SETUP_TASK__ID:
      return getID();
    case SetupPackage.SETUP_TASK__DESCRIPTION:
      return getDescription();
    case SetupPackage.SETUP_TASK__SCOPE_TYPE:
      return getScopeType();
    case SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS:
      return getExcludedTriggers();
    case SetupPackage.SETUP_TASK__DISABLED:
      return isDisabled();
    case SetupPackage.SETUP_TASK__PREDECESSORS:
      return getPredecessors();
    case SetupPackage.SETUP_TASK__SUCCESSORS:
      return getSuccessors();
    case SetupPackage.SETUP_TASK__RESTRICTIONS:
      return getRestrictions();
    case SetupPackage.SETUP_TASK__FILTER:
      return getFilter();
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
    case SetupPackage.SETUP_TASK__ID:
      setID((String)newValue);
      return;
    case SetupPackage.SETUP_TASK__DESCRIPTION:
      setDescription((String)newValue);
      return;
    case SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS:
      setExcludedTriggers((Set<Trigger>)newValue);
      return;
    case SetupPackage.SETUP_TASK__DISABLED:
      setDisabled((Boolean)newValue);
      return;
    case SetupPackage.SETUP_TASK__PREDECESSORS:
      getPredecessors().clear();
      getPredecessors().addAll((Collection<? extends SetupTask>)newValue);
      return;
    case SetupPackage.SETUP_TASK__SUCCESSORS:
      getSuccessors().clear();
      getSuccessors().addAll((Collection<? extends SetupTask>)newValue);
      return;
    case SetupPackage.SETUP_TASK__RESTRICTIONS:
      getRestrictions().clear();
      getRestrictions().addAll((Collection<? extends Scope>)newValue);
      return;
    case SetupPackage.SETUP_TASK__FILTER:
      setFilter((String)newValue);
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
    case SetupPackage.SETUP_TASK__ID:
      setID(ID_EDEFAULT);
      return;
    case SetupPackage.SETUP_TASK__DESCRIPTION:
      setDescription(DESCRIPTION_EDEFAULT);
      return;
    case SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS:
      setExcludedTriggers((Set<Trigger>)null);
      return;
    case SetupPackage.SETUP_TASK__DISABLED:
      setDisabled(DISABLED_EDEFAULT);
      return;
    case SetupPackage.SETUP_TASK__PREDECESSORS:
      getPredecessors().clear();
      return;
    case SetupPackage.SETUP_TASK__SUCCESSORS:
      getSuccessors().clear();
      return;
    case SetupPackage.SETUP_TASK__RESTRICTIONS:
      getRestrictions().clear();
      return;
    case SetupPackage.SETUP_TASK__FILTER:
      setFilter(FILTER_EDEFAULT);
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
    case SetupPackage.SETUP_TASK__ID:
      return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
    case SetupPackage.SETUP_TASK__DESCRIPTION:
      return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
    case SetupPackage.SETUP_TASK__SCOPE_TYPE:
      return getScopeType() != SCOPE_TYPE_EDEFAULT;
    case SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS:
      return excludedTriggers != null;
    case SetupPackage.SETUP_TASK__DISABLED:
      return disabled != DISABLED_EDEFAULT;
    case SetupPackage.SETUP_TASK__PREDECESSORS:
      return predecessors != null && !predecessors.isEmpty();
    case SetupPackage.SETUP_TASK__SUCCESSORS:
      return successors != null && !successors.isEmpty();
    case SetupPackage.SETUP_TASK__RESTRICTIONS:
      return restrictions != null && !restrictions.isEmpty();
    case SetupPackage.SETUP_TASK__FILTER:
      return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
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
    result.append(" (iD: ");
    result.append(iD);
    result.append(", description: ");
    result.append(description);
    result.append(", excludedTriggers: ");
    result.append(excludedTriggers);
    result.append(", disabled: ");
    result.append(disabled);
    result.append(", filter: ");
    result.append(filter);
    result.append(')');
    return result.toString();
  }

} // SetupTaskImpl
