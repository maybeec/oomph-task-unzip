/**
 */
package setup;

import org.eclipse.emf.common.util.EList;

import base.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Modification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link setup.TextModification#getPattern <em>Pattern</em>}</li>
 *   <li>{@link setup.TextModification#getSubstitutions <em>Substitutions</em>}</li>
 * </ul>
 * </p>
 *
 * @see setup.SetupPackage#getTextModification()
 * @model
 * @generated
 */
public interface TextModification extends ModelElement
{
  /**
   * Returns the value of the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' attribute.
   * @see #setPattern(String)
   * @see setup.SetupPackage#getTextModification_Pattern()
   * @model required="true"
   * @generated
   */
  String getPattern();

  /**
   * Sets the value of the '{@link setup.TextModification#getPattern <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' attribute.
   * @see #getPattern()
   * @generated
   */
  void setPattern(String value);

  /**
   * Returns the value of the '<em><b>Substitutions</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Substitutions</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Substitutions</em>' attribute list.
   * @see setup.SetupPackage#getTextModification_Substitutions()
   * @model extendedMetaData="kind='element' name='substitution'"
   * @generated
   */
  EList<String> getSubstitutions();

} // TextModification
