/**
 */
package setup;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Modify Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link setup.TextModifyTask#getURL <em>URL</em>}</li>
 *   <li>{@link setup.TextModifyTask#getModifications <em>Modifications</em>}</li>
 *   <li>{@link setup.TextModifyTask#getEncoding <em>Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @see setup.SetupPackage#getTextModifyTask()
 * @model
 * @generated
 */
public interface TextModifyTask extends SetupTask
{
  /**
   * Returns the value of the '<em><b>URL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>URL</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>URL</em>' attribute.
   * @see #setURL(String)
   * @see setup.SetupPackage#getTextModifyTask_URL()
   * @model required="true"
   *        extendedMetaData="kind='attribute' name='url'"
   * @generated
   */
  String getURL();

  /**
   * Sets the value of the '{@link setup.TextModifyTask#getURL <em>URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>URL</em>' attribute.
   * @see #getURL()
   * @generated
   */
  void setURL(String value);

  /**
   * Returns the value of the '<em><b>Modifications</b></em>' containment reference list.
   * The list contents are of type {@link setup.TextModification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifications</em>' containment reference list.
   * @see setup.SetupPackage#getTextModifyTask_Modifications()
   * @model containment="true"
   *        extendedMetaData="name='modification'"
   * @generated
   */
  EList<TextModification> getModifications();

  /**
   * Returns the value of the '<em><b>Encoding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Encoding</em>' attribute.
   * @see #setEncoding(String)
   * @see setup.SetupPackage#getTextModifyTask_Encoding()
   * @model
   * @generated
   */
  String getEncoding();

  /**
   * Sets the value of the '{@link setup.TextModifyTask#getEncoding <em>Encoding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Encoding</em>' attribute.
   * @see #getEncoding()
   * @generated
   */
  void setEncoding(String value);

} // TextModifyTask
