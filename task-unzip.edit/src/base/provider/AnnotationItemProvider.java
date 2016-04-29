/**
 */
package base.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import base.Annotation;
import base.BaseFactory;
import base.BasePackage;
import setup.SetupFactory;
import setup.SetupPackage;
import unzip.unzipFactory;

import java.util.Collection;
import java.util.List;

/**
 * This is the item provider adapter for a {@link base.Annotation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationItemProvider extends ModelElementItemProvider
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addSourcePropertyDescriptor(object);
      addReferencesPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Source feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSourcePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_Annotation_source_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Annotation_source_feature", "_UI_Annotation_type"),
        BasePackage.Literals.ANNOTATION__SOURCE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the References feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addReferencesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_Annotation_references_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_Annotation_references_feature", "_UI_Annotation_type"),
        BasePackage.Literals.ANNOTATION__REFERENCES, true, false, true, null, null, null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(BasePackage.Literals.ANNOTATION__DETAILS);
      childrenFeatures.add(BasePackage.Literals.ANNOTATION__CONTENTS);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns Annotation.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Annotation"));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean shouldComposeCreationImage()
  {
    return true;
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((Annotation)object).getSource();
    return label == null || label.length() == 0 ? getString("_UI_Annotation_type") : getString("_UI_Annotation_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(Annotation.class))
    {
    case BasePackage.ANNOTATION__SOURCE:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
      return;
    case BasePackage.ANNOTATION__DETAILS:
    case BasePackage.ANNOTATION__CONTENTS:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
      return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__DETAILS,
        BaseFactory.eINSTANCE.create(BasePackage.Literals.STRING_TO_STRING_MAP_ENTRY)));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, BaseFactory.eINSTANCE.createAnnotation()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS,
        BaseFactory.eINSTANCE.create(BasePackage.Literals.STRING_TO_STRING_MAP_ENTRY)));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, unzipFactory.eINSTANCE.createunzipTask()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createIndex()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createCatalogSelection()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createProductCatalog()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createProduct()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createProductVersion()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createProjectCatalog()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createProject()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createStream()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createUser()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createAttributeRule()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createLocationCatalog()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createInstallation()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createInstallationTask()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createWorkspace()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createWorkspaceTask()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createCompoundTask()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createVariableTask()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createVariableChoice()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createStringSubstitutionTask()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createRedirectionTask()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createEclipseIniTask()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createLinkLocationTask()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createPreferenceTask()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createResourceCopyTask()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createResourceCreationTask()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createTextModifyTask()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, SetupFactory.eINSTANCE.createTextModification()));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS,
        SetupFactory.eINSTANCE.create(SetupPackage.Literals.PRODUCT_TO_PRODUCT_VERSION_MAP_ENTRY)));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS,
        SetupFactory.eINSTANCE.create(SetupPackage.Literals.PROJECT_TO_STREAM_MAP_ENTRY)));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS,
        SetupFactory.eINSTANCE.create(SetupPackage.Literals.INSTALLATION_TO_WORKSPACES_MAP_ENTRY)));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS,
        SetupFactory.eINSTANCE.create(SetupPackage.Literals.WORKSPACE_TO_INSTALLATIONS_MAP_ENTRY)));

    newChildDescriptors.add(createChildParameter(BasePackage.Literals.ANNOTATION__CONTENTS, XMLTypeFactory.eINSTANCE.createAnyType()));
  }

  /**
   * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
  {
    Object childFeature = feature;
    Object childObject = child;

    boolean qualify = childFeature == BasePackage.Literals.MODEL_ELEMENT__ANNOTATIONS || childFeature == BasePackage.Literals.ANNOTATION__CONTENTS
        || childFeature == BasePackage.Literals.ANNOTATION__DETAILS;

    if (qualify)
    {
      return getString("_UI_CreateChild_text2", new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
    }
    return super.getCreateChildText(owner, feature, child, selection);
  }

}
