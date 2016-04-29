/**
 */
package setup.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import setup.Installation;
import setup.SetupPackage;
import setup.Workspace;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workspace To Installations Map Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link setup.impl.WorkspaceToInstallationsMapEntryImpl#getTypedKey <em>Key</em>}</li>
 *   <li>{@link setup.impl.WorkspaceToInstallationsMapEntryImpl#getTypedValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkspaceToInstallationsMapEntryImpl extends MinimalEObjectImpl.Container implements BasicEMap.Entry<Workspace, EList<Installation>>
{
  /**
   * The cached value of the '{@link #getTypedKey() <em>Key</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypedKey()
   * @generated
   * @ordered
   */
  protected Workspace key;

  /**
   * The cached value of the '{@link #getTypedValue() <em>Value</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypedValue()
   * @generated
   * @ordered
   */
  protected EList<Installation> value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkspaceToInstallationsMapEntryImpl()
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
    return SetupPackage.Literals.WORKSPACE_TO_INSTALLATIONS_MAP_ENTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Workspace getTypedKey()
  {
    if (key != null && key.eIsProxy())
    {
      InternalEObject oldKey = (InternalEObject)key;
      key = (Workspace)eResolveProxy(oldKey);
      if (key != oldKey)
      {
        if (eNotificationRequired())
        {
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SetupPackage.WORKSPACE_TO_INSTALLATIONS_MAP_ENTRY__KEY, oldKey, key));
        }
      }
    }
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Workspace basicGetTypedKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypedKey(Workspace newKey)
  {
    Workspace oldKey = key;
    key = newKey;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.WORKSPACE_TO_INSTALLATIONS_MAP_ENTRY__KEY, oldKey, key));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Installation> getTypedValue()
  {
    if (value == null)
    {
      value = new EObjectResolvingEList<Installation>(Installation.class, this, SetupPackage.WORKSPACE_TO_INSTALLATIONS_MAP_ENTRY__VALUE);
    }
    return value;
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
    case SetupPackage.WORKSPACE_TO_INSTALLATIONS_MAP_ENTRY__KEY:
      if (resolve)
      {
        return getTypedKey();
      }
      return basicGetTypedKey();
    case SetupPackage.WORKSPACE_TO_INSTALLATIONS_MAP_ENTRY__VALUE:
      return getTypedValue();
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
    case SetupPackage.WORKSPACE_TO_INSTALLATIONS_MAP_ENTRY__KEY:
      setTypedKey((Workspace)newValue);
      return;
    case SetupPackage.WORKSPACE_TO_INSTALLATIONS_MAP_ENTRY__VALUE:
      getTypedValue().clear();
      getTypedValue().addAll((Collection<? extends Installation>)newValue);
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
    case SetupPackage.WORKSPACE_TO_INSTALLATIONS_MAP_ENTRY__KEY:
      setTypedKey((Workspace)null);
      return;
    case SetupPackage.WORKSPACE_TO_INSTALLATIONS_MAP_ENTRY__VALUE:
      getTypedValue().clear();
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
    case SetupPackage.WORKSPACE_TO_INSTALLATIONS_MAP_ENTRY__KEY:
      return key != null;
    case SetupPackage.WORKSPACE_TO_INSTALLATIONS_MAP_ENTRY__VALUE:
      return value != null && !value.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected int hash = -1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHash()
  {
    if (hash == -1)
    {
      Object theKey = getKey();
      hash = theKey == null ? 0 : theKey.hashCode();
    }
    return hash;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHash(int hash)
  {
    this.hash = hash;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Workspace getKey()
  {
    return getTypedKey();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(Workspace key)
  {
    setTypedKey(key);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Installation> getValue()
  {
    return getTypedValue();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Installation> setValue(EList<Installation> value)
  {
    EList<Installation> oldValue = getValue();
    getTypedValue().clear();
    getTypedValue().addAll(value);
    return oldValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EMap<Workspace, EList<Installation>> getEMap()
  {
    EObject container = eContainer();
    return container == null ? null : (EMap<Workspace, EList<Installation>>)container.eGet(eContainmentFeature());
  }

} // WorkspaceToInstallationsMapEntryImpl
