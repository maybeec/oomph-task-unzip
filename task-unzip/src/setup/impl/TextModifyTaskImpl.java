/**
 */
package setup.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import setup.SetupPackage;
import setup.TextModification;
import setup.TextModifyTask;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Modify Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link setup.impl.TextModifyTaskImpl#getURL <em>URL</em>}</li>
 *   <li>{@link setup.impl.TextModifyTaskImpl#getModifications <em>Modifications</em>}</li>
 *   <li>{@link setup.impl.TextModifyTaskImpl#getEncoding <em>Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextModifyTaskImpl extends SetupTaskImpl implements TextModifyTask
{
  /**
   * The default value of the '{@link #getURL() <em>URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getURL()
   * @generated
   * @ordered
   */
  protected static final String URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getURL() <em>URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getURL()
   * @generated
   * @ordered
   */
  protected String uRL = URL_EDEFAULT;

  /**
   * The cached value of the '{@link #getModifications() <em>Modifications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifications()
   * @generated
   * @ordered
   */
  protected EList<TextModification> modifications;

  /**
   * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEncoding()
   * @generated
   * @ordered
   */
  protected static final String ENCODING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEncoding()
   * @generated
   * @ordered
   */
  protected String encoding = ENCODING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextModifyTaskImpl()
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
    return SetupPackage.Literals.TEXT_MODIFY_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getURL()
  {
    return uRL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setURL(String newURL)
  {
    String oldURL = uRL;
    uRL = newURL;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.TEXT_MODIFY_TASK__URL, oldURL, uRL));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TextModification> getModifications()
  {
    if (modifications == null)
    {
      modifications = new EObjectContainmentEList<TextModification>(TextModification.class, this, SetupPackage.TEXT_MODIFY_TASK__MODIFICATIONS);
    }
    return modifications;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEncoding()
  {
    return encoding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEncoding(String newEncoding)
  {
    String oldEncoding = encoding;
    encoding = newEncoding;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, SetupPackage.TEXT_MODIFY_TASK__ENCODING, oldEncoding, encoding));
    }
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
    case SetupPackage.TEXT_MODIFY_TASK__MODIFICATIONS:
      return ((InternalEList<?>)getModifications()).basicRemove(otherEnd, msgs);
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
    case SetupPackage.TEXT_MODIFY_TASK__URL:
      return getURL();
    case SetupPackage.TEXT_MODIFY_TASK__MODIFICATIONS:
      return getModifications();
    case SetupPackage.TEXT_MODIFY_TASK__ENCODING:
      return getEncoding();
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
    case SetupPackage.TEXT_MODIFY_TASK__URL:
      setURL((String)newValue);
      return;
    case SetupPackage.TEXT_MODIFY_TASK__MODIFICATIONS:
      getModifications().clear();
      getModifications().addAll((Collection<? extends TextModification>)newValue);
      return;
    case SetupPackage.TEXT_MODIFY_TASK__ENCODING:
      setEncoding((String)newValue);
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
    case SetupPackage.TEXT_MODIFY_TASK__URL:
      setURL(URL_EDEFAULT);
      return;
    case SetupPackage.TEXT_MODIFY_TASK__MODIFICATIONS:
      getModifications().clear();
      return;
    case SetupPackage.TEXT_MODIFY_TASK__ENCODING:
      setEncoding(ENCODING_EDEFAULT);
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
    case SetupPackage.TEXT_MODIFY_TASK__URL:
      return URL_EDEFAULT == null ? uRL != null : !URL_EDEFAULT.equals(uRL);
    case SetupPackage.TEXT_MODIFY_TASK__MODIFICATIONS:
      return modifications != null && !modifications.isEmpty();
    case SetupPackage.TEXT_MODIFY_TASK__ENCODING:
      return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
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
    result.append(" (uRL: ");
    result.append(uRL);
    result.append(", encoding: ");
    result.append(encoding);
    result.append(')');
    return result.toString();
  }

} // TextModifyTaskImpl
