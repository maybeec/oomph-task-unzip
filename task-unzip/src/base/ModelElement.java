/**
 */
package base;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link base.ModelElement#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see base.BasePackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link base.Annotation}.
   * It is bidirectional and its opposite is '{@link base.Annotation#getModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see base.BasePackage#getModelElement_Annotations()
   * @see base.Annotation#getModelElement
   * @model opposite="modelElement" containment="true"
   *        extendedMetaData="name='annotation'"
   * @generated
   */
  EList<Annotation> getAnnotations();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  Annotation getAnnotation(String source);

} // ModelElement
