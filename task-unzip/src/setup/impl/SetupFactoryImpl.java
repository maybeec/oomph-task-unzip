/**
 */
package setup.impl;

import org.eclipse.oomph.setup.LicenseInfo;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import setup.RedirectionTask;
import setup.ResourceCopyTask;
import setup.ResourceCreationTask;
import setup.ScopeType;
import setup.SetupFactory;
import setup.SetupPackage;
import setup.Stream;
import setup.StringSubstitutionTask;
import setup.TextModification;
import setup.TextModifyTask;
import setup.Trigger;
import setup.UnsignedPolicy;
import setup.User;
import setup.VariableChoice;
import setup.VariableTask;
import setup.VariableType;
import setup.Workspace;
import setup.WorkspaceTask;

import java.util.Map;
import java.util.Set;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SetupFactoryImpl extends EFactoryImpl implements SetupFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SetupFactory init()
  {
    try
    {
      SetupFactory theSetupFactory = (SetupFactory)EPackage.Registry.INSTANCE.getEFactory(SetupPackage.eNS_URI);
      if (theSetupFactory != null)
      {
        return theSetupFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SetupFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetupFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    case SetupPackage.INDEX:
      return createIndex();
    case SetupPackage.CATALOG_SELECTION:
      return createCatalogSelection();
    case SetupPackage.PRODUCT_CATALOG:
      return createProductCatalog();
    case SetupPackage.PRODUCT:
      return createProduct();
    case SetupPackage.PRODUCT_VERSION:
      return createProductVersion();
    case SetupPackage.PROJECT_CATALOG:
      return createProjectCatalog();
    case SetupPackage.PROJECT:
      return createProject();
    case SetupPackage.STREAM:
      return createStream();
    case SetupPackage.USER:
      return createUser();
    case SetupPackage.ATTRIBUTE_RULE:
      return createAttributeRule();
    case SetupPackage.LOCATION_CATALOG:
      return createLocationCatalog();
    case SetupPackage.INSTALLATION:
      return createInstallation();
    case SetupPackage.INSTALLATION_TASK:
      return createInstallationTask();
    case SetupPackage.WORKSPACE:
      return createWorkspace();
    case SetupPackage.WORKSPACE_TASK:
      return createWorkspaceTask();
    case SetupPackage.COMPOUND_TASK:
      return createCompoundTask();
    case SetupPackage.VARIABLE_TASK:
      return createVariableTask();
    case SetupPackage.VARIABLE_CHOICE:
      return createVariableChoice();
    case SetupPackage.STRING_SUBSTITUTION_TASK:
      return createStringSubstitutionTask();
    case SetupPackage.REDIRECTION_TASK:
      return createRedirectionTask();
    case SetupPackage.ECLIPSE_INI_TASK:
      return createEclipseIniTask();
    case SetupPackage.LINK_LOCATION_TASK:
      return createLinkLocationTask();
    case SetupPackage.PREFERENCE_TASK:
      return createPreferenceTask();
    case SetupPackage.RESOURCE_COPY_TASK:
      return createResourceCopyTask();
    case SetupPackage.RESOURCE_CREATION_TASK:
      return createResourceCreationTask();
    case SetupPackage.TEXT_MODIFY_TASK:
      return createTextModifyTask();
    case SetupPackage.TEXT_MODIFICATION:
      return createTextModification();
    case SetupPackage.PRODUCT_TO_PRODUCT_VERSION_MAP_ENTRY:
      return (EObject)createProductToProductVersionMapEntry();
    case SetupPackage.PROJECT_TO_STREAM_MAP_ENTRY:
      return (EObject)createProjectToStreamMapEntry();
    case SetupPackage.INSTALLATION_TO_WORKSPACES_MAP_ENTRY:
      return (EObject)createInstallationToWorkspacesMapEntry();
    case SetupPackage.WORKSPACE_TO_INSTALLATIONS_MAP_ENTRY:
      return (EObject)createWorkspaceToInstallationsMapEntry();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
    case SetupPackage.SCOPE_TYPE:
      return createScopeTypeFromString(eDataType, initialValue);
    case SetupPackage.TRIGGER:
      return createTriggerFromString(eDataType, initialValue);
    case SetupPackage.VARIABLE_TYPE:
      return createVariableTypeFromString(eDataType, initialValue);
    case SetupPackage.UNSIGNED_POLICY:
      return createUnsignedPolicyFromString(eDataType, initialValue);
    case SetupPackage.TRIGGER_SET:
      return createTriggerSetFromString(eDataType, initialValue);
    case SetupPackage.LICENSE_INFO:
      return createLicenseInfoFromString(eDataType, initialValue);
    case SetupPackage.FILTER:
      return createFilterFromString(eDataType, initialValue);
    default:
      throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
    case SetupPackage.SCOPE_TYPE:
      return convertScopeTypeToString(eDataType, instanceValue);
    case SetupPackage.TRIGGER:
      return convertTriggerToString(eDataType, instanceValue);
    case SetupPackage.VARIABLE_TYPE:
      return convertVariableTypeToString(eDataType, instanceValue);
    case SetupPackage.UNSIGNED_POLICY:
      return convertUnsignedPolicyToString(eDataType, instanceValue);
    case SetupPackage.TRIGGER_SET:
      return convertTriggerSetToString(eDataType, instanceValue);
    case SetupPackage.LICENSE_INFO:
      return convertLicenseInfoToString(eDataType, instanceValue);
    case SetupPackage.FILTER:
      return convertFilterToString(eDataType, instanceValue);
    default:
      throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Index createIndex()
  {
    IndexImpl index = new IndexImpl();
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatalogSelection createCatalogSelection()
  {
    CatalogSelectionImpl catalogSelection = new CatalogSelectionImpl();
    return catalogSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductCatalog createProductCatalog()
  {
    ProductCatalogImpl productCatalog = new ProductCatalogImpl();
    return productCatalog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Product createProduct()
  {
    ProductImpl product = new ProductImpl();
    return product;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductVersion createProductVersion()
  {
    ProductVersionImpl productVersion = new ProductVersionImpl();
    return productVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectCatalog createProjectCatalog()
  {
    ProjectCatalogImpl projectCatalog = new ProjectCatalogImpl();
    return projectCatalog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Project createProject()
  {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stream createStream()
  {
    StreamImpl stream = new StreamImpl();
    return stream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User createUser()
  {
    UserImpl user = new UserImpl();
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeRule createAttributeRule()
  {
    AttributeRuleImpl attributeRule = new AttributeRuleImpl();
    return attributeRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationCatalog createLocationCatalog()
  {
    LocationCatalogImpl locationCatalog = new LocationCatalogImpl();
    return locationCatalog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Installation createInstallation()
  {
    InstallationImpl installation = new InstallationImpl();
    return installation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstallationTask createInstallationTask()
  {
    InstallationTaskImpl installationTask = new InstallationTaskImpl();
    return installationTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Workspace createWorkspace()
  {
    WorkspaceImpl workspace = new WorkspaceImpl();
    return workspace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkspaceTask createWorkspaceTask()
  {
    WorkspaceTaskImpl workspaceTask = new WorkspaceTaskImpl();
    return workspaceTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompoundTask createCompoundTask()
  {
    CompoundTaskImpl compoundTask = new CompoundTaskImpl();
    return compoundTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableTask createVariableTask()
  {
    VariableTaskImpl variableTask = new VariableTaskImpl();
    return variableTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableChoice createVariableChoice()
  {
    VariableChoiceImpl variableChoice = new VariableChoiceImpl();
    return variableChoice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringSubstitutionTask createStringSubstitutionTask()
  {
    StringSubstitutionTaskImpl stringSubstitutionTask = new StringSubstitutionTaskImpl();
    return stringSubstitutionTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RedirectionTask createRedirectionTask()
  {
    RedirectionTaskImpl redirectionTask = new RedirectionTaskImpl();
    return redirectionTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EclipseIniTask createEclipseIniTask()
  {
    EclipseIniTaskImpl eclipseIniTask = new EclipseIniTaskImpl();
    return eclipseIniTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkLocationTask createLinkLocationTask()
  {
    LinkLocationTaskImpl linkLocationTask = new LinkLocationTaskImpl();
    return linkLocationTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreferenceTask createPreferenceTask()
  {
    PreferenceTaskImpl preferenceTask = new PreferenceTaskImpl();
    return preferenceTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceCopyTask createResourceCopyTask()
  {
    ResourceCopyTaskImpl resourceCopyTask = new ResourceCopyTaskImpl();
    return resourceCopyTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceCreationTask createResourceCreationTask()
  {
    ResourceCreationTaskImpl resourceCreationTask = new ResourceCreationTaskImpl();
    return resourceCreationTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextModifyTask createTextModifyTask()
  {
    TextModifyTaskImpl textModifyTask = new TextModifyTaskImpl();
    return textModifyTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextModification createTextModification()
  {
    TextModificationImpl textModification = new TextModificationImpl();
    return textModification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map.Entry<Product, ProductVersion> createProductToProductVersionMapEntry()
  {
    ProductToProductVersionMapEntryImpl productToProductVersionMapEntry = new ProductToProductVersionMapEntryImpl();
    return productToProductVersionMapEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map.Entry<Project, Stream> createProjectToStreamMapEntry()
  {
    ProjectToStreamMapEntryImpl projectToStreamMapEntry = new ProjectToStreamMapEntryImpl();
    return projectToStreamMapEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map.Entry<Installation, EList<Workspace>> createInstallationToWorkspacesMapEntry()
  {
    InstallationToWorkspacesMapEntryImpl installationToWorkspacesMapEntry = new InstallationToWorkspacesMapEntryImpl();
    return installationToWorkspacesMapEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map.Entry<Workspace, EList<Installation>> createWorkspaceToInstallationsMapEntry()
  {
    WorkspaceToInstallationsMapEntryImpl workspaceToInstallationsMapEntry = new WorkspaceToInstallationsMapEntryImpl();
    return workspaceToInstallationsMapEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopeType createScopeTypeFromString(EDataType eDataType, String initialValue)
  {
    ScopeType result = ScopeType.get(initialValue);
    if (result == null)
    {
      throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertScopeTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trigger createTriggerFromString(EDataType eDataType, String initialValue)
  {
    Trigger result = Trigger.get(initialValue);
    if (result == null)
    {
      throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTriggerToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableType createVariableTypeFromString(EDataType eDataType, String initialValue)
  {
    VariableType result = VariableType.get(initialValue);
    if (result == null)
    {
      throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVariableTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnsignedPolicy createUnsignedPolicyFromString(EDataType eDataType, String initialValue)
  {
    UnsignedPolicy result = UnsignedPolicy.get(initialValue);
    if (result == null)
    {
      throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnsignedPolicyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public Set<org.eclipse.oomph.setup.Trigger> createTriggerSetFromString(EDataType eDataType, String initialValue)
  {
    return (Set<org.eclipse.oomph.setup.Trigger>)super.createFromString(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTriggerSetToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LicenseInfo createLicenseInfoFromString(EDataType eDataType, String initialValue)
  {
    return (LicenseInfo)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLicenseInfoToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createFilterFromString(EDataType eDataType, String initialValue)
  {
    return (String)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFilterToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetupPackage getSetupPackage()
  {
    return (SetupPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SetupPackage getPackage()
  {
    return SetupPackage.eINSTANCE;
  }

} // SetupFactoryImpl
