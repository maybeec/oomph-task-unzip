/**
 */
package setup;

import org.eclipse.emf.common.util.URI;

import base.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link setup.AttributeRule#getAttributeURI <em>Attribute URI</em>}</li>
 *   <li>{@link setup.AttributeRule#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see setup.SetupPackage#getAttributeRule()
 * @model
 * @generated
 */
public interface AttributeRule extends ModelElement
{
  /**
   * Returns the value of the '<em><b>Attribute URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute URI</em>' attribute.
   * @see #setAttributeURI(URI)
   * @see setup.SetupPackage#getAttributeRule_AttributeURI()
   * @model dataType="base.URI"
   * @generated
   */
  URI getAttributeURI();

  /**
   * Sets the value of the '{@link setup.AttributeRule#getAttributeURI <em>Attribute URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute URI</em>' attribute.
   * @see #getAttributeURI()
   * @generated
   */
  void setAttributeURI(URI value);

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
   * @see setup.SetupPackage#getAttributeRule_Value()
   * @model required="true"
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link setup.AttributeRule#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // AttributeRule
