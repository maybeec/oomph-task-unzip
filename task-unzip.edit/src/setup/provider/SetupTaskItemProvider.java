/**
 */
package setup.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import base.provider.ModelElementItemProvider;
import setup.SetupPackage;
import setup.SetupTask;
import unzip.provider.unzipEditPlugin;

import java.util.Collection;
import java.util.List;

/**
 * This is the item provider adapter for a {@link setup.SetupTask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SetupTaskItemProvider extends ModelElementItemProvider
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetupTaskItemProvider(AdapterFactory adapterFactory)
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

      addIDPropertyDescriptor(object);
      addDescriptionPropertyDescriptor(object);
      addScopeTypePropertyDescriptor(object);
      addExcludedTriggersPropertyDescriptor(object);
      addDisabledPropertyDescriptor(object);
      addPredecessorsPropertyDescriptor(object);
      addSuccessorsPropertyDescriptor(object);
      addRestrictionsPropertyDescriptor(object);
      addFilterPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the ID feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIDPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_SetupTask_iD_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SetupTask_iD_feature", "_UI_SetupTask_type"),
        SetupPackage.Literals.SETUP_TASK__ID, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Description feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDescriptionPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_SetupTask_description_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_SetupTask_description_feature", "_UI_SetupTask_type"),
        SetupPackage.Literals.SETUP_TASK__DESCRIPTION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Scope Type feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addScopeTypePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_SetupTask_scopeType_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SetupTask_scopeType_feature", "_UI_SetupTask_type"),
        SetupPackage.Literals.SETUP_TASK__SCOPE_TYPE, false, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Excluded Triggers feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addExcludedTriggersPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_SetupTask_excludedTriggers_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_SetupTask_excludedTriggers_feature", "_UI_SetupTask_type"),
        SetupPackage.Literals.SETUP_TASK__EXCLUDED_TRIGGERS, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Disabled feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDisabledPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_SetupTask_disabled_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SetupTask_disabled_feature", "_UI_SetupTask_type"),
        SetupPackage.Literals.SETUP_TASK__DISABLED, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Predecessors feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPredecessorsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_SetupTask_predecessors_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_SetupTask_predecessors_feature", "_UI_SetupTask_type"),
        SetupPackage.Literals.SETUP_TASK__PREDECESSORS, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Successors feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSuccessorsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_SetupTask_successors_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_SetupTask_successors_feature", "_UI_SetupTask_type"),
        SetupPackage.Literals.SETUP_TASK__SUCCESSORS, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Restrictions feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRestrictionsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_SetupTask_restrictions_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_SetupTask_restrictions_feature", "_UI_SetupTask_type"),
        SetupPackage.Literals.SETUP_TASK__RESTRICTIONS, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Filter feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addFilterPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_SetupTask_filter_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SetupTask_filter_feature", "_UI_SetupTask_type"),
        SetupPackage.Literals.SETUP_TASK__FILTER, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
    String label = ((SetupTask)object).getID();
    return label == null || label.length() == 0 ? getString("_UI_SetupTask_type") : getString("_UI_SetupTask_type") + " " + label;
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

    switch (notification.getFeatureID(SetupTask.class))
    {
    case SetupPackage.SETUP_TASK__ID:
    case SetupPackage.SETUP_TASK__DESCRIPTION:
    case SetupPackage.SETUP_TASK__SCOPE_TYPE:
    case SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS:
    case SetupPackage.SETUP_TASK__DISABLED:
    case SetupPackage.SETUP_TASK__FILTER:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
