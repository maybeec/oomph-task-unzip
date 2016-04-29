/**
 */
package setup.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import base.ModelElement;
import setup.AttributeRule;
import setup.CatalogSelection;
import setup.CompoundTask;
import setup.EclipseIniTask;
import setup.Index;
import setup.Installation;
import setup.InstallationTask;
import setup.LinkLocationTask;
import setup.LocationCatalog;
import setup.PreferenceTask;
import setup.Product;
import setup.ProductCatalog;
import setup.ProductVersion;
import setup.Project;
import setup.ProjectCatalog;
import setup.ProjectContainer;
import setup.RedirectionTask;
import setup.ResourceCopyTask;
import setup.ResourceCreationTask;
import setup.Scope;
import setup.SetupPackage;
import setup.SetupTask;
import setup.SetupTaskContainer;
import setup.Stream;
import setup.StringSubstitutionTask;
import setup.TextModification;
import setup.TextModifyTask;
import setup.User;
import setup.VariableChoice;
import setup.VariableTask;
import setup.Workspace;
import setup.WorkspaceTask;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see setup.SetupPackage
 * @generated
 */
public class SetupAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SetupPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetupAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SetupPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetupSwitch<Adapter> modelSwitch = new SetupSwitch<Adapter>()
  {
    @Override
    public Adapter caseSetupTask(SetupTask object)
    {
      return createSetupTaskAdapter();
    }

    @Override
    public Adapter caseSetupTaskContainer(SetupTaskContainer object)
    {
      return createSetupTaskContainerAdapter();
    }

    @Override
    public Adapter caseScope(Scope object)
    {
      return createScopeAdapter();
    }

    @Override
    public Adapter caseIndex(Index object)
    {
      return createIndexAdapter();
    }

    @Override
    public Adapter caseCatalogSelection(CatalogSelection object)
    {
      return createCatalogSelectionAdapter();
    }

    @Override
    public Adapter caseProductCatalog(ProductCatalog object)
    {
      return createProductCatalogAdapter();
    }

    @Override
    public Adapter caseProduct(Product object)
    {
      return createProductAdapter();
    }

    @Override
    public Adapter caseProductVersion(ProductVersion object)
    {
      return createProductVersionAdapter();
    }

    @Override
    public Adapter caseProjectContainer(ProjectContainer object)
    {
      return createProjectContainerAdapter();
    }

    @Override
    public Adapter caseProjectCatalog(ProjectCatalog object)
    {
      return createProjectCatalogAdapter();
    }

    @Override
    public Adapter caseProject(Project object)
    {
      return createProjectAdapter();
    }

    @Override
    public Adapter caseStream(Stream object)
    {
      return createStreamAdapter();
    }

    @Override
    public Adapter caseUser(User object)
    {
      return createUserAdapter();
    }

    @Override
    public Adapter caseAttributeRule(AttributeRule object)
    {
      return createAttributeRuleAdapter();
    }

    @Override
    public Adapter caseLocationCatalog(LocationCatalog object)
    {
      return createLocationCatalogAdapter();
    }

    @Override
    public Adapter caseInstallation(Installation object)
    {
      return createInstallationAdapter();
    }

    @Override
    public Adapter caseInstallationTask(InstallationTask object)
    {
      return createInstallationTaskAdapter();
    }

    @Override
    public Adapter caseWorkspace(Workspace object)
    {
      return createWorkspaceAdapter();
    }

    @Override
    public Adapter caseWorkspaceTask(WorkspaceTask object)
    {
      return createWorkspaceTaskAdapter();
    }

    @Override
    public Adapter caseCompoundTask(CompoundTask object)
    {
      return createCompoundTaskAdapter();
    }

    @Override
    public Adapter caseVariableTask(VariableTask object)
    {
      return createVariableTaskAdapter();
    }

    @Override
    public Adapter caseVariableChoice(VariableChoice object)
    {
      return createVariableChoiceAdapter();
    }

    @Override
    public Adapter caseStringSubstitutionTask(StringSubstitutionTask object)
    {
      return createStringSubstitutionTaskAdapter();
    }

    @Override
    public Adapter caseRedirectionTask(RedirectionTask object)
    {
      return createRedirectionTaskAdapter();
    }

    @Override
    public Adapter caseEclipseIniTask(EclipseIniTask object)
    {
      return createEclipseIniTaskAdapter();
    }

    @Override
    public Adapter caseLinkLocationTask(LinkLocationTask object)
    {
      return createLinkLocationTaskAdapter();
    }

    @Override
    public Adapter casePreferenceTask(PreferenceTask object)
    {
      return createPreferenceTaskAdapter();
    }

    @Override
    public Adapter caseResourceCopyTask(ResourceCopyTask object)
    {
      return createResourceCopyTaskAdapter();
    }

    @Override
    public Adapter caseResourceCreationTask(ResourceCreationTask object)
    {
      return createResourceCreationTaskAdapter();
    }

    @Override
    public Adapter caseTextModifyTask(TextModifyTask object)
    {
      return createTextModifyTaskAdapter();
    }

    @Override
    public Adapter caseTextModification(TextModification object)
    {
      return createTextModificationAdapter();
    }

    @Override
    public Adapter caseProductToProductVersionMapEntry(Map.Entry<Product, ProductVersion> object)
    {
      return createProductToProductVersionMapEntryAdapter();
    }

    @Override
    public Adapter caseProjectToStreamMapEntry(Map.Entry<Project, Stream> object)
    {
      return createProjectToStreamMapEntryAdapter();
    }

    @Override
    public Adapter caseInstallationToWorkspacesMapEntry(Map.Entry<Installation, EList<Workspace>> object)
    {
      return createInstallationToWorkspacesMapEntryAdapter();
    }

    @Override
    public Adapter caseWorkspaceToInstallationsMapEntry(Map.Entry<Workspace, EList<Installation>> object)
    {
      return createWorkspaceToInstallationsMapEntryAdapter();
    }

    @Override
    public Adapter caseModelElement(ModelElement object)
    {
      return createModelElementAdapter();
    }

    @Override
    public Adapter defaultCase(EObject object)
    {
      return createEObjectAdapter();
    }
  };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.SetupTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.SetupTask
   * @generated
   */
  public Adapter createSetupTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.SetupTaskContainer <em>Task Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.SetupTaskContainer
   * @generated
   */
  public Adapter createSetupTaskContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.Scope
   * @generated
   */
  public Adapter createScopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.Index <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.Index
   * @generated
   */
  public Adapter createIndexAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.CatalogSelection <em>Catalog Selection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.CatalogSelection
   * @generated
   */
  public Adapter createCatalogSelectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.ProductCatalog <em>Product Catalog</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.ProductCatalog
   * @generated
   */
  public Adapter createProductCatalogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.Product <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.Product
   * @generated
   */
  public Adapter createProductAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.ProductVersion <em>Product Version</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.ProductVersion
   * @generated
   */
  public Adapter createProductVersionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.ProjectContainer <em>Project Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.ProjectContainer
   * @generated
   */
  public Adapter createProjectContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.ProjectCatalog <em>Project Catalog</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.ProjectCatalog
   * @generated
   */
  public Adapter createProjectCatalogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.Project
   * @generated
   */
  public Adapter createProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.Stream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.Stream
   * @generated
   */
  public Adapter createStreamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.User <em>User</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.User
   * @generated
   */
  public Adapter createUserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.AttributeRule <em>Attribute Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.AttributeRule
   * @generated
   */
  public Adapter createAttributeRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.LocationCatalog <em>Location Catalog</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.LocationCatalog
   * @generated
   */
  public Adapter createLocationCatalogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.Installation <em>Installation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.Installation
   * @generated
   */
  public Adapter createInstallationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.InstallationTask <em>Installation Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.InstallationTask
   * @generated
   */
  public Adapter createInstallationTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.Workspace <em>Workspace</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.Workspace
   * @generated
   */
  public Adapter createWorkspaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.WorkspaceTask <em>Workspace Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.WorkspaceTask
   * @generated
   */
  public Adapter createWorkspaceTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.CompoundTask <em>Compound Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.CompoundTask
   * @generated
   */
  public Adapter createCompoundTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.VariableTask <em>Variable Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.VariableTask
   * @generated
   */
  public Adapter createVariableTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.VariableChoice <em>Variable Choice</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.VariableChoice
   * @generated
   */
  public Adapter createVariableChoiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.StringSubstitutionTask <em>String Substitution Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.StringSubstitutionTask
   * @generated
   */
  public Adapter createStringSubstitutionTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.RedirectionTask <em>Redirection Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.RedirectionTask
   * @generated
   */
  public Adapter createRedirectionTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.EclipseIniTask <em>Eclipse Ini Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.EclipseIniTask
   * @generated
   */
  public Adapter createEclipseIniTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.LinkLocationTask <em>Link Location Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.LinkLocationTask
   * @generated
   */
  public Adapter createLinkLocationTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.PreferenceTask <em>Preference Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.PreferenceTask
   * @generated
   */
  public Adapter createPreferenceTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.ResourceCopyTask <em>Resource Copy Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.ResourceCopyTask
   * @generated
   */
  public Adapter createResourceCopyTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.ResourceCreationTask <em>Resource Creation Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.ResourceCreationTask
   * @generated
   */
  public Adapter createResourceCreationTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.TextModifyTask <em>Text Modify Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.TextModifyTask
   * @generated
   */
  public Adapter createTextModifyTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link setup.TextModification <em>Text Modification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see setup.TextModification
   * @generated
   */
  public Adapter createTextModificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Product To Product Version Map Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see java.util.Map.Entry
   * @generated
   */
  public Adapter createProductToProductVersionMapEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Project To Stream Map Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see java.util.Map.Entry
   * @generated
   */
  public Adapter createProjectToStreamMapEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Installation To Workspaces Map Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see java.util.Map.Entry
   * @generated
   */
  public Adapter createInstallationToWorkspacesMapEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Workspace To Installations Map Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see java.util.Map.Entry
   * @generated
   */
  public Adapter createWorkspaceToInstallationsMapEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link base.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see base.ModelElement
   * @generated
   */
  public Adapter createModelElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} // SetupAdapterFactory
