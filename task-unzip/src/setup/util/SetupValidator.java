/**
 */
package setup.util;

import org.eclipse.oomph.setup.LicenseInfo;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

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
import setup.ScopeType;
import setup.SetupPackage;
import setup.SetupTask;
import setup.SetupTaskContainer;
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
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see setup.SetupPackage
 * @generated
 */
public class SetupValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final SetupValidator INSTANCE = new SetupValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "setup";

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetupValidator()
  {
    super();
  }

  /**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EPackage getEPackage()
  {
    return SetupPackage.eINSTANCE;
  }

  /**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  @SuppressWarnings("unchecked")
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    switch (classifierID)
    {
    case SetupPackage.SETUP_TASK:
      return validateSetupTask((SetupTask)value, diagnostics, context);
    case SetupPackage.SETUP_TASK_CONTAINER:
      return validateSetupTaskContainer((SetupTaskContainer)value, diagnostics, context);
    case SetupPackage.SCOPE:
      return validateScope((Scope)value, diagnostics, context);
    case SetupPackage.INDEX:
      return validateIndex((Index)value, diagnostics, context);
    case SetupPackage.CATALOG_SELECTION:
      return validateCatalogSelection((CatalogSelection)value, diagnostics, context);
    case SetupPackage.PRODUCT_CATALOG:
      return validateProductCatalog((ProductCatalog)value, diagnostics, context);
    case SetupPackage.PRODUCT:
      return validateProduct((Product)value, diagnostics, context);
    case SetupPackage.PRODUCT_VERSION:
      return validateProductVersion((ProductVersion)value, diagnostics, context);
    case SetupPackage.PROJECT_CONTAINER:
      return validateProjectContainer((ProjectContainer)value, diagnostics, context);
    case SetupPackage.PROJECT_CATALOG:
      return validateProjectCatalog((ProjectCatalog)value, diagnostics, context);
    case SetupPackage.PROJECT:
      return validateProject((Project)value, diagnostics, context);
    case SetupPackage.STREAM:
      return validateStream((Stream)value, diagnostics, context);
    case SetupPackage.USER:
      return validateUser((User)value, diagnostics, context);
    case SetupPackage.ATTRIBUTE_RULE:
      return validateAttributeRule((AttributeRule)value, diagnostics, context);
    case SetupPackage.LOCATION_CATALOG:
      return validateLocationCatalog((LocationCatalog)value, diagnostics, context);
    case SetupPackage.INSTALLATION:
      return validateInstallation((Installation)value, diagnostics, context);
    case SetupPackage.INSTALLATION_TASK:
      return validateInstallationTask((InstallationTask)value, diagnostics, context);
    case SetupPackage.WORKSPACE:
      return validateWorkspace((Workspace)value, diagnostics, context);
    case SetupPackage.WORKSPACE_TASK:
      return validateWorkspaceTask((WorkspaceTask)value, diagnostics, context);
    case SetupPackage.COMPOUND_TASK:
      return validateCompoundTask((CompoundTask)value, diagnostics, context);
    case SetupPackage.VARIABLE_TASK:
      return validateVariableTask((VariableTask)value, diagnostics, context);
    case SetupPackage.VARIABLE_CHOICE:
      return validateVariableChoice((VariableChoice)value, diagnostics, context);
    case SetupPackage.STRING_SUBSTITUTION_TASK:
      return validateStringSubstitutionTask((StringSubstitutionTask)value, diagnostics, context);
    case SetupPackage.REDIRECTION_TASK:
      return validateRedirectionTask((RedirectionTask)value, diagnostics, context);
    case SetupPackage.ECLIPSE_INI_TASK:
      return validateEclipseIniTask((EclipseIniTask)value, diagnostics, context);
    case SetupPackage.LINK_LOCATION_TASK:
      return validateLinkLocationTask((LinkLocationTask)value, diagnostics, context);
    case SetupPackage.PREFERENCE_TASK:
      return validatePreferenceTask((PreferenceTask)value, diagnostics, context);
    case SetupPackage.RESOURCE_COPY_TASK:
      return validateResourceCopyTask((ResourceCopyTask)value, diagnostics, context);
    case SetupPackage.RESOURCE_CREATION_TASK:
      return validateResourceCreationTask((ResourceCreationTask)value, diagnostics, context);
    case SetupPackage.TEXT_MODIFY_TASK:
      return validateTextModifyTask((TextModifyTask)value, diagnostics, context);
    case SetupPackage.TEXT_MODIFICATION:
      return validateTextModification((TextModification)value, diagnostics, context);
    case SetupPackage.PRODUCT_TO_PRODUCT_VERSION_MAP_ENTRY:
      return validateProductToProductVersionMapEntry((Map.Entry<?, ?>)value, diagnostics, context);
    case SetupPackage.PROJECT_TO_STREAM_MAP_ENTRY:
      return validateProjectToStreamMapEntry((Map.Entry<?, ?>)value, diagnostics, context);
    case SetupPackage.INSTALLATION_TO_WORKSPACES_MAP_ENTRY:
      return validateInstallationToWorkspacesMapEntry((Map.Entry<?, ?>)value, diagnostics, context);
    case SetupPackage.WORKSPACE_TO_INSTALLATIONS_MAP_ENTRY:
      return validateWorkspaceToInstallationsMapEntry((Map.Entry<?, ?>)value, diagnostics, context);
    case SetupPackage.SCOPE_TYPE:
      return validateScopeType((ScopeType)value, diagnostics, context);
    case SetupPackage.TRIGGER:
      return validateTrigger((Trigger)value, diagnostics, context);
    case SetupPackage.VARIABLE_TYPE:
      return validateVariableType((VariableType)value, diagnostics, context);
    case SetupPackage.UNSIGNED_POLICY:
      return validateUnsignedPolicy((UnsignedPolicy)value, diagnostics, context);
    case SetupPackage.TRIGGER_SET:
      return validateTriggerSet((Set<org.eclipse.oomph.setup.Trigger>)value, diagnostics, context);
    case SetupPackage.LICENSE_INFO:
      return validateLicenseInfo((LicenseInfo)value, diagnostics, context);
    case SetupPackage.FILTER:
      return validateFilter((String)value, diagnostics, context);
    default:
      return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSetupTask(SetupTask setupTask, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(setupTask, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSetupTaskContainer(SetupTaskContainer setupTaskContainer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(setupTaskContainer, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateScope(Scope scope, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(scope, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateIndex(Index index, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(index, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCatalogSelection(CatalogSelection catalogSelection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(catalogSelection, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProductCatalog(ProductCatalog productCatalog, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(productCatalog, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(product, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProductVersion(ProductVersion productVersion, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(productVersion, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProjectContainer(ProjectContainer projectContainer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(projectContainer, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProjectCatalog(ProjectCatalog projectCatalog, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(projectCatalog, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProject(Project project, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(project, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStream(Stream stream, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(stream, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(user, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttributeRule(AttributeRule attributeRule, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(attributeRule, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationCatalog(LocationCatalog locationCatalog, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(locationCatalog, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInstallation(Installation installation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(installation, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInstallationTask(InstallationTask installationTask, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(installationTask, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWorkspace(Workspace workspace, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(workspace, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWorkspaceTask(WorkspaceTask workspaceTask, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(workspaceTask, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCompoundTask(CompoundTask compoundTask, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(compoundTask, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVariableTask(VariableTask variableTask, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(variableTask, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVariableChoice(VariableChoice variableChoice, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(variableChoice, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStringSubstitutionTask(StringSubstitutionTask stringSubstitutionTask, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(stringSubstitutionTask, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRedirectionTask(RedirectionTask redirectionTask, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(redirectionTask, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEclipseIniTask(EclipseIniTask eclipseIniTask, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(eclipseIniTask, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLinkLocationTask(LinkLocationTask linkLocationTask, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(linkLocationTask, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreferenceTask(PreferenceTask preferenceTask, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(preferenceTask, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateResourceCopyTask(ResourceCopyTask resourceCopyTask, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(resourceCopyTask, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateResourceCreationTask(ResourceCreationTask resourceCreationTask, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(resourceCreationTask, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTextModifyTask(TextModifyTask textModifyTask, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(textModifyTask, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTextModification(TextModification textModification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(textModification, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProductToProductVersionMapEntry(Map.Entry<?, ?> productToProductVersionMapEntry, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint((EObject)productToProductVersionMapEntry, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProjectToStreamMapEntry(Map.Entry<?, ?> projectToStreamMapEntry, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint((EObject)projectToStreamMapEntry, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInstallationToWorkspacesMapEntry(Map.Entry<?, ?> installationToWorkspacesMapEntry, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint((EObject)installationToWorkspacesMapEntry, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWorkspaceToInstallationsMapEntry(Map.Entry<?, ?> workspaceToInstallationsMapEntry, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint((EObject)workspaceToInstallationsMapEntry, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateScopeType(ScopeType scopeType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTrigger(Trigger trigger, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVariableType(VariableType variableType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateUnsignedPolicy(UnsignedPolicy unsignedPolicy, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTriggerSet(Set<org.eclipse.oomph.setup.Trigger> triggerSet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLicenseInfo(LicenseInfo licenseInfo, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFilter(String filter, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateFilter_WellformedFilterExpression(filter, diagnostics, context);
    return result;
  }

  /**
   * Validates the WellformedFilterExpression constraint of '<em>Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFilter_WellformedFilterExpression(String filter, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    // TODO implement the constraint
    // -> specify the condition that violates the constraint
    // -> verify the diagnostic details, including severity, code, and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic", new Object[] {
            "WellformedFilterExpression", getValueLabel(SetupPackage.Literals.FILTER, filter, context) }, new Object[] { filter }, context));
      }
      return false;
    }
    return true;
  }

  /**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    // TODO
    // Specialize this to return a resource locator for messages specific to this validator.
    // Ensure that you remove @generated or mark it @generated NOT
    return super.getResourceLocator();
  }

} // SetupValidator
