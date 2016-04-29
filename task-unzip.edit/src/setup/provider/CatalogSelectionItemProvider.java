/**
 */
package setup.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import base.provider.ModelElementItemProvider;
import setup.CatalogSelection;
import setup.SetupFactory;
import setup.SetupPackage;
import unzip.provider.unzipEditPlugin;

import java.util.Collection;
import java.util.List;

/**
 * This is the item provider adapter for a {@link setup.CatalogSelection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogSelectionItemProvider extends ModelElementItemProvider
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatalogSelectionItemProvider(AdapterFactory adapterFactory)
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

      addProductCatalogsPropertyDescriptor(object);
      addProjectCatalogsPropertyDescriptor(object);
      addSelectedStreamsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Product Catalogs feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addProductCatalogsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_CatalogSelection_productCatalogs_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_CatalogSelection_productCatalogs_feature", "_UI_CatalogSelection_type"),
        SetupPackage.Literals.CATALOG_SELECTION__PRODUCT_CATALOGS, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Project Catalogs feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addProjectCatalogsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_CatalogSelection_projectCatalogs_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_CatalogSelection_projectCatalogs_feature", "_UI_CatalogSelection_type"),
        SetupPackage.Literals.CATALOG_SELECTION__PROJECT_CATALOGS, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Selected Streams feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSelectedStreamsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_CatalogSelection_selectedStreams_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_CatalogSelection_selectedStreams_feature", "_UI_CatalogSelection_type"),
        SetupPackage.Literals.CATALOG_SELECTION__SELECTED_STREAMS, true, false, true, null, null, null));
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
      childrenFeatures.add(SetupPackage.Literals.CATALOG_SELECTION__DEFAULT_PRODUCT_VERSIONS);
      childrenFeatures.add(SetupPackage.Literals.CATALOG_SELECTION__DEFAULT_STREAMS);
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
   * This returns CatalogSelection.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/CatalogSelection"));
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
    return getString("_UI_CatalogSelection_type");
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

    switch (notification.getFeatureID(CatalogSelection.class))
    {
    case SetupPackage.CATALOG_SELECTION__DEFAULT_PRODUCT_VERSIONS:
    case SetupPackage.CATALOG_SELECTION__DEFAULT_STREAMS:
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

    newChildDescriptors.add(createChildParameter(SetupPackage.Literals.CATALOG_SELECTION__DEFAULT_PRODUCT_VERSIONS,
        SetupFactory.eINSTANCE.create(SetupPackage.Literals.PRODUCT_TO_PRODUCT_VERSION_MAP_ENTRY)));

    newChildDescriptors.add(createChildParameter(SetupPackage.Literals.CATALOG_SELECTION__DEFAULT_STREAMS,
        SetupFactory.eINSTANCE.create(SetupPackage.Literals.PROJECT_TO_STREAM_MAP_ENTRY)));
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    return unzipEditPlugin.INSTANCE;
  }

}
