/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import spemarti.ArtifactContainer_Relationship;
import spemarti.ArtifactDefinition;
import spemarti.ArtifactFragment_Relationship;
import spemarti.ArtifactKinds;
import spemarti.Baseline;
import spemarti.BaselineHistory;
import spemarti.ComplexInformationElement;
import spemarti.Configuration;
import spemarti.ContainerDefinition;
import spemarti.ContainerDefinition_Relationship;
import spemarti.ContainerFragment_Relationship;
import spemarti.Diagram;
import spemarti.ElementGroup;
import spemarti.FragmentDefinition;
import spemarti.Fragment_Relationship;
import spemarti.Image;
import spemarti.LabeledText;
import spemarti.List;
import spemarti.Matrix;
import spemarti.Question;
import spemarti.Session;
import spemarti.SimpleInformationElement;
import spemarti.SpemartiFactory;
import spemarti.SpemartiPackage;
import spemarti.Table;
import spemarti.Text;
import spemarti.Version;
import spemarti.VersionHistory;
import spemarti.VersionedExtent;
import spemarti.WorkProductDefinition;
import spemarti.Workspace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpemartiPackageImpl extends EPackageImpl implements SpemartiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleInformationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedExtentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baselineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baselineHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fragmentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fragment_RelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexInformationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workspaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactContainer_RelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactFragment_RelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerDefinition_RelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerFragment_RelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum artifactKindsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see spemarti.SpemartiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpemartiPackageImpl() {
		super(eNS_URI, SpemartiFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SpemartiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpemartiPackage init() {
		if (isInited) return (SpemartiPackage)EPackage.Registry.INSTANCE.getEPackage(SpemartiPackage.eNS_URI);

		// Obtain or create and register package
		SpemartiPackageImpl theSpemartiPackage = (SpemartiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpemartiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpemartiPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSpemartiPackage.createPackageContents();

		// Initialize created meta-data
		theSpemartiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpemartiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpemartiPackage.eNS_URI, theSpemartiPackage);
		return theSpemartiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleInformationElement() {
		return simpleInformationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionedExtent() {
		return versionedExtentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionedExtent_IsCheckedOut() {
		return (EAttribute)versionedExtentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionedExtent_Annotation() {
		return (EAttribute)versionedExtentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedExtent_Versionhistory() {
		return (EReference)versionedExtentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedExtent_Configuration() {
		return (EReference)versionedExtentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedExtent_Conflict() {
		return (EReference)versionedExtentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedExtent_PreviousVersion() {
		return (EReference)versionedExtentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedExtent_BaseVersion() {
		return (EReference)versionedExtentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionHistory() {
		return versionHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionHistory_Versions() {
		return (EReference)versionHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionHistory_RootVersion() {
		return (EReference)versionHistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Label() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Id() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_CreationDate() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Annotation() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_PreviousVersion() {
		return (EReference)versionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_NextVersion() {
		return (EReference)versionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_Baseline() {
		return (EReference)versionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseline() {
		return baselineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseline_Memberof() {
		return (EReference)baselineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseline_Member() {
		return (EReference)baselineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseline_Configuration() {
		return (EReference)baselineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseline_Version() {
		return (EReference)baselineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Id() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Memberof() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Member() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_VersionedExtent() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_PreviousBaseline() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Annotation() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Baseline() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaselineHistory() {
		return baselineHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFragmentDefinition() {
		return fragmentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFragmentDefinition_Fragment_Relationship() {
		return (EReference)fragmentDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkProductDefinition() {
		return workProductDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkProductDefinition_PresentationName() {
		return (EAttribute)workProductDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkProductDefinition_Description() {
		return (EAttribute)workProductDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFragment_Relationship() {
		return fragment_RelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFragment_Relationship_Containers() {
		return (EReference)fragment_RelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagram() {
		return diagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_Image() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexInformationElement() {
		return complexInformationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_Asks() {
		return (EReference)questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_Answers() {
		return (EReference)questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Value() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getList() {
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_IsLabeled() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_IsOrdered() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_IsEnumerated() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Contents() {
		return (EReference)listEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatrix() {
		return matrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatrix_Header() {
		return (EReference)matrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatrix_Lines() {
		return (EReference)matrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Matrixes() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementGroup() {
		return elementGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementGroup_Childs() {
		return (EReference)elementGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementGroup_InternalContents() {
		return (EReference)elementGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkspace() {
		return workspaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkspace_Id() {
		return (EAttribute)workspaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkspace_Annotation() {
		return (EAttribute)workspaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkspace_VersionedExtent() {
		return (EReference)workspaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkspace_Configuration() {
		return (EReference)workspaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSession() {
		return sessionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSession_Workspace() {
		return (EReference)sessionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerDefinition() {
		return containerDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerDefinition_ArtifactContainer_Relationship() {
		return (EReference)containerDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerDefinition_ContainerDefinition_Relationship() {
		return (EReference)containerDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerDefinition_ContainerDefinition_Relationship2() {
		return (EReference)containerDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerDefinition_ContainerFragment_Relationship() {
		return (EReference)containerDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactContainer_Relationship() {
		return artifactContainer_RelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactContainer_Relationship_Artifact() {
		return (EReference)artifactContainer_RelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactContainer_Relationship_Containers() {
		return (EReference)artifactContainer_RelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactDefinition() {
		return artifactDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactDefinition_IsExternal() {
		return (EAttribute)artifactDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactDefinition_AKind() {
		return (EAttribute)artifactDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactDefinition_ArtifactFragment_Relationship() {
		return (EReference)artifactDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactDefinition_ArtifactContainer_Relationship() {
		return (EReference)artifactDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactFragment_Relationship() {
		return artifactFragment_RelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactFragment_Relationship_Artifact() {
		return (EReference)artifactFragment_RelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerDefinition_Relationship() {
		return containerDefinition_RelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerDefinition_Relationship_Children() {
		return (EReference)containerDefinition_RelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerDefinition_Relationship_Parent() {
		return (EReference)containerDefinition_RelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerFragment_Relationship() {
		return containerFragment_RelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerFragment_Relationship_Container() {
		return (EReference)containerFragment_RelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabeledText() {
		return labeledTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledText_Label() {
		return (EAttribute)labeledTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArtifactKinds() {
		return artifactKindsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpemartiFactory getSpemartiFactory() {
		return (SpemartiFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		imageEClass = createEClass(IMAGE);

		simpleInformationElementEClass = createEClass(SIMPLE_INFORMATION_ELEMENT);

		versionedExtentEClass = createEClass(VERSIONED_EXTENT);
		createEAttribute(versionedExtentEClass, VERSIONED_EXTENT__IS_CHECKED_OUT);
		createEAttribute(versionedExtentEClass, VERSIONED_EXTENT__ANNOTATION);
		createEReference(versionedExtentEClass, VERSIONED_EXTENT__VERSIONHISTORY);
		createEReference(versionedExtentEClass, VERSIONED_EXTENT__CONFIGURATION);
		createEReference(versionedExtentEClass, VERSIONED_EXTENT__CONFLICT);
		createEReference(versionedExtentEClass, VERSIONED_EXTENT__PREVIOUS_VERSION);
		createEReference(versionedExtentEClass, VERSIONED_EXTENT__BASE_VERSION);

		versionHistoryEClass = createEClass(VERSION_HISTORY);
		createEReference(versionHistoryEClass, VERSION_HISTORY__VERSIONS);
		createEReference(versionHistoryEClass, VERSION_HISTORY__ROOT_VERSION);

		versionEClass = createEClass(VERSION);
		createEAttribute(versionEClass, VERSION__LABEL);
		createEAttribute(versionEClass, VERSION__ID);
		createEAttribute(versionEClass, VERSION__CREATION_DATE);
		createEAttribute(versionEClass, VERSION__ANNOTATION);
		createEReference(versionEClass, VERSION__PREVIOUS_VERSION);
		createEReference(versionEClass, VERSION__NEXT_VERSION);
		createEReference(versionEClass, VERSION__BASELINE);

		baselineEClass = createEClass(BASELINE);
		createEReference(baselineEClass, BASELINE__MEMBEROF);
		createEReference(baselineEClass, BASELINE__MEMBER);
		createEReference(baselineEClass, BASELINE__CONFIGURATION);
		createEReference(baselineEClass, BASELINE__VERSION);

		configurationEClass = createEClass(CONFIGURATION);
		createEAttribute(configurationEClass, CONFIGURATION__ID);
		createEReference(configurationEClass, CONFIGURATION__MEMBEROF);
		createEReference(configurationEClass, CONFIGURATION__MEMBER);
		createEReference(configurationEClass, CONFIGURATION__VERSIONED_EXTENT);
		createEReference(configurationEClass, CONFIGURATION__PREVIOUS_BASELINE);
		createEAttribute(configurationEClass, CONFIGURATION__ANNOTATION);
		createEReference(configurationEClass, CONFIGURATION__BASELINE);

		baselineHistoryEClass = createEClass(BASELINE_HISTORY);

		fragmentDefinitionEClass = createEClass(FRAGMENT_DEFINITION);
		createEReference(fragmentDefinitionEClass, FRAGMENT_DEFINITION__FRAGMENT_RELATIONSHIP);

		workProductDefinitionEClass = createEClass(WORK_PRODUCT_DEFINITION);
		createEAttribute(workProductDefinitionEClass, WORK_PRODUCT_DEFINITION__PRESENTATION_NAME);
		createEAttribute(workProductDefinitionEClass, WORK_PRODUCT_DEFINITION__DESCRIPTION);

		fragment_RelationshipEClass = createEClass(FRAGMENT_RELATIONSHIP);
		createEReference(fragment_RelationshipEClass, FRAGMENT_RELATIONSHIP__CONTAINERS);

		diagramEClass = createEClass(DIAGRAM);
		createEReference(diagramEClass, DIAGRAM__IMAGE);

		complexInformationElementEClass = createEClass(COMPLEX_INFORMATION_ELEMENT);

		questionEClass = createEClass(QUESTION);
		createEReference(questionEClass, QUESTION__ASKS);
		createEReference(questionEClass, QUESTION__ANSWERS);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__VALUE);

		listEClass = createEClass(LIST);
		createEAttribute(listEClass, LIST__IS_LABELED);
		createEAttribute(listEClass, LIST__IS_ORDERED);
		createEAttribute(listEClass, LIST__IS_ENUMERATED);
		createEReference(listEClass, LIST__CONTENTS);

		matrixEClass = createEClass(MATRIX);
		createEReference(matrixEClass, MATRIX__HEADER);
		createEReference(matrixEClass, MATRIX__LINES);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__MATRIXES);

		elementGroupEClass = createEClass(ELEMENT_GROUP);
		createEReference(elementGroupEClass, ELEMENT_GROUP__CHILDS);
		createEReference(elementGroupEClass, ELEMENT_GROUP__INTERNAL_CONTENTS);

		workspaceEClass = createEClass(WORKSPACE);
		createEAttribute(workspaceEClass, WORKSPACE__ID);
		createEAttribute(workspaceEClass, WORKSPACE__ANNOTATION);
		createEReference(workspaceEClass, WORKSPACE__VERSIONED_EXTENT);
		createEReference(workspaceEClass, WORKSPACE__CONFIGURATION);

		sessionEClass = createEClass(SESSION);
		createEReference(sessionEClass, SESSION__WORKSPACE);

		containerDefinitionEClass = createEClass(CONTAINER_DEFINITION);
		createEReference(containerDefinitionEClass, CONTAINER_DEFINITION__ARTIFACT_CONTAINER_RELATIONSHIP);
		createEReference(containerDefinitionEClass, CONTAINER_DEFINITION__CONTAINER_DEFINITION_RELATIONSHIP);
		createEReference(containerDefinitionEClass, CONTAINER_DEFINITION__CONTAINER_DEFINITION_RELATIONSHIP2);
		createEReference(containerDefinitionEClass, CONTAINER_DEFINITION__CONTAINER_FRAGMENT_RELATIONSHIP);

		artifactContainer_RelationshipEClass = createEClass(ARTIFACT_CONTAINER_RELATIONSHIP);
		createEReference(artifactContainer_RelationshipEClass, ARTIFACT_CONTAINER_RELATIONSHIP__ARTIFACT);
		createEReference(artifactContainer_RelationshipEClass, ARTIFACT_CONTAINER_RELATIONSHIP__CONTAINERS);

		artifactDefinitionEClass = createEClass(ARTIFACT_DEFINITION);
		createEAttribute(artifactDefinitionEClass, ARTIFACT_DEFINITION__IS_EXTERNAL);
		createEAttribute(artifactDefinitionEClass, ARTIFACT_DEFINITION__AKIND);
		createEReference(artifactDefinitionEClass, ARTIFACT_DEFINITION__ARTIFACT_FRAGMENT_RELATIONSHIP);
		createEReference(artifactDefinitionEClass, ARTIFACT_DEFINITION__ARTIFACT_CONTAINER_RELATIONSHIP);

		artifactFragment_RelationshipEClass = createEClass(ARTIFACT_FRAGMENT_RELATIONSHIP);
		createEReference(artifactFragment_RelationshipEClass, ARTIFACT_FRAGMENT_RELATIONSHIP__ARTIFACT);

		containerDefinition_RelationshipEClass = createEClass(CONTAINER_DEFINITION_RELATIONSHIP);
		createEReference(containerDefinition_RelationshipEClass, CONTAINER_DEFINITION_RELATIONSHIP__CHILDREN);
		createEReference(containerDefinition_RelationshipEClass, CONTAINER_DEFINITION_RELATIONSHIP__PARENT);

		containerFragment_RelationshipEClass = createEClass(CONTAINER_FRAGMENT_RELATIONSHIP);
		createEReference(containerFragment_RelationshipEClass, CONTAINER_FRAGMENT_RELATIONSHIP__CONTAINER);

		labeledTextEClass = createEClass(LABELED_TEXT);
		createEAttribute(labeledTextEClass, LABELED_TEXT__LABEL);

		// Create enums
		artifactKindsEEnum = createEEnum(ARTIFACT_KINDS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		imageEClass.getESuperTypes().add(this.getSimpleInformationElement());
		simpleInformationElementEClass.getESuperTypes().add(this.getVersionedExtent());
		simpleInformationElementEClass.getESuperTypes().add(this.getFragmentDefinition());
		baselineEClass.getESuperTypes().add(this.getVersion());
		baselineHistoryEClass.getESuperTypes().add(this.getVersionHistory());
		fragmentDefinitionEClass.getESuperTypes().add(this.getWorkProductDefinition());
		diagramEClass.getESuperTypes().add(this.getComplexInformationElement());
		complexInformationElementEClass.getESuperTypes().add(this.getSimpleInformationElement());
		questionEClass.getESuperTypes().add(this.getComplexInformationElement());
		textEClass.getESuperTypes().add(this.getSimpleInformationElement());
		listEClass.getESuperTypes().add(this.getComplexInformationElement());
		matrixEClass.getESuperTypes().add(this.getComplexInformationElement());
		tableEClass.getESuperTypes().add(this.getMatrix());
		elementGroupEClass.getESuperTypes().add(this.getList());
		containerDefinitionEClass.getESuperTypes().add(this.getWorkProductDefinition());
		artifactDefinitionEClass.getESuperTypes().add(this.getWorkProductDefinition());
		artifactFragment_RelationshipEClass.getESuperTypes().add(this.getFragment_Relationship());
		containerFragment_RelationshipEClass.getESuperTypes().add(this.getFragment_Relationship());
		labeledTextEClass.getESuperTypes().add(this.getText());

		// Initialize classes and features; add operations and parameters
		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleInformationElementEClass, SimpleInformationElement.class, "SimpleInformationElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(versionedExtentEClass, VersionedExtent.class, "VersionedExtent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionedExtent_IsCheckedOut(), ecorePackage.getEBoolean(), "isCheckedOut", null, 1, 1, VersionedExtent.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVersionedExtent_Annotation(), ecorePackage.getEString(), "annotation", null, 0, 1, VersionedExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVersionedExtent_Versionhistory(), this.getVersionHistory(), null, "versionhistory", null, 1, 1, VersionedExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVersionedExtent_Configuration(), this.getConfiguration(), this.getConfiguration_VersionedExtent(), "configuration", null, 1, 1, VersionedExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVersionedExtent_Conflict(), this.getVersion(), null, "conflict", null, 0, -1, VersionedExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVersionedExtent_PreviousVersion(), this.getVersion(), null, "previousVersion", null, 0, -1, VersionedExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVersionedExtent_BaseVersion(), this.getVersion(), null, "baseVersion", null, 1, 1, VersionedExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(versionedExtentEClass, null, "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(versionedExtentEClass, this.getVersion(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(versionedExtentEClass, null, "unCheckOut", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = addEOperation(versionedExtentEClass, this.getVersion(), "lookupByVersionId", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(versionedExtentEClass, this.getVersion(), "lookupByLabel", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "label", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(versionedExtentEClass, null, "delete", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(versionedExtentEClass, this.getVersionedExtent(), "createExtent", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(versionHistoryEClass, VersionHistory.class, "VersionHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVersionHistory_Versions(), this.getVersion(), null, "versions", null, 1, -1, VersionHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVersionHistory_RootVersion(), this.getVersion(), null, "rootVersion", null, 1, 1, VersionHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(versionHistoryEClass, null, "delete", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(versionHistoryEClass, this.getVersion(), "lookupByLabel", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "label", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(versionHistoryEClass, this.getVersion(), "lookupByVersionId", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersion_Label(), ecorePackage.getEString(), "label", null, 0, -1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVersion_Id(), ecorePackage.getEString(), "id", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVersion_CreationDate(), ecorePackage.getEString(), "creationDate", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVersion_Annotation(), ecorePackage.getEString(), "annotation", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVersion_PreviousVersion(), this.getVersion(), this.getVersion_NextVersion(), "previousVersion", null, 0, -1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersion_NextVersion(), this.getVersion(), this.getVersion_PreviousVersion(), "nextVersion", null, 0, -1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVersion_Baseline(), this.getBaseline(), this.getBaseline_Version(), "baseline", null, 0, -1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(versionEClass, null, "addLabel", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "label", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(versionEClass, null, "removeLabel", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "label", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(versionEClass, null, "delete", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(baselineEClass, Baseline.class, "Baseline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseline_Memberof(), this.getBaseline(), this.getBaseline_Member(), "memberof", null, 1, -1, Baseline.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBaseline_Member(), this.getBaseline(), this.getBaseline_Memberof(), "member", null, 0, -1, Baseline.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBaseline_Configuration(), this.getConfiguration(), this.getConfiguration_Baseline(), "configuration", null, 0, -1, Baseline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBaseline_Version(), this.getVersion(), this.getVersion_Baseline(), "version", null, 0, -1, Baseline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguration_Id(), ecorePackage.getEString(), "id", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfiguration_Memberof(), this.getConfiguration(), this.getConfiguration_Member(), "memberof", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfiguration_Member(), this.getConfiguration(), this.getConfiguration_Memberof(), "member", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfiguration_VersionedExtent(), this.getVersionedExtent(), this.getVersionedExtent_Configuration(), "versionedExtent", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfiguration_PreviousBaseline(), this.getBaseline(), null, "previousBaseline", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfiguration_Annotation(), ecorePackage.getEString(), "annotation", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfiguration_Baseline(), this.getBaseline(), this.getBaseline_Configuration(), "baseline", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(configurationEClass, null, "makeBaseline", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(configurationEClass, this.getBaselineHistory(), "getBaselineHistory", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(baselineHistoryEClass, BaselineHistory.class, "BaselineHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fragmentDefinitionEClass, FragmentDefinition.class, "FragmentDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFragmentDefinition_Fragment_Relationship(), this.getFragment_Relationship(), this.getFragment_Relationship_Containers(), "fragment_Relationship", null, 1, 1, FragmentDefinition.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(workProductDefinitionEClass, WorkProductDefinition.class, "WorkProductDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkProductDefinition_PresentationName(), ecorePackage.getEString(), "presentationName", null, 1, 1, WorkProductDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWorkProductDefinition_Description(), ecorePackage.getEString(), "description", null, 1, 1, WorkProductDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fragment_RelationshipEClass, Fragment_Relationship.class, "Fragment_Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFragment_Relationship_Containers(), this.getFragmentDefinition(), this.getFragmentDefinition_Fragment_Relationship(), "containers", null, 1, -1, Fragment_Relationship.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(diagramEClass, Diagram.class, "Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagram_Image(), this.getImage(), null, "image", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(complexInformationElementEClass, ComplexInformationElement.class, "ComplexInformationElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestion_Asks(), this.getText(), null, "asks", null, 0, -1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQuestion_Answers(), this.getText(), null, "answers", null, 1, -1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Value(), ecorePackage.getEString(), "value", null, 1, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getList_IsLabeled(), ecorePackage.getEBoolean(), "isLabeled", null, 1, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getList_IsOrdered(), ecorePackage.getEBoolean(), "isOrdered", null, 1, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getList_IsEnumerated(), ecorePackage.getEBoolean(), "isEnumerated", null, 1, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getList_Contents(), this.getSimpleInformationElement(), null, "contents", null, 0, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(listEClass, null, "orderByAZ", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(listEClass, null, "orderByZA", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(matrixEClass, Matrix.class, "Matrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatrix_Header(), this.getList(), null, "header", null, 1, 1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMatrix_Lines(), this.getList(), null, "lines", null, 0, -1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Matrixes(), this.getMatrix(), null, "matrixes", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(elementGroupEClass, ElementGroup.class, "ElementGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementGroup_Childs(), this.getElementGroup(), null, "childs", null, 0, -1, ElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElementGroup_InternalContents(), this.getSimpleInformationElement(), null, "internalContents", null, 0, -1, ElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(workspaceEClass, Workspace.class, "Workspace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkspace_Id(), ecorePackage.getEString(), "id", null, 1, 1, Workspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWorkspace_Annotation(), ecorePackage.getEString(), "annotation", null, 0, 1, Workspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkspace_VersionedExtent(), this.getVersionedExtent(), null, "versionedExtent", null, 0, -1, Workspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkspace_Configuration(), this.getConfiguration(), null, "configuration", null, 0, -1, Workspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(workspaceEClass, this.getWorkspace(), "copy", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getWorkspace(), "workspace", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(workspaceEClass, this.getVersionedExtent(), "restore", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVersion(), "version", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(workspaceEClass, this.getVersion(), "update", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVersion(), "version", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(workspaceEClass, null, "merge", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVersion(), "version", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(workspaceEClass, this.getVersionedExtent(), "lookupByVersionHistory", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVersionHistory(), "versionHistory", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(workspaceEClass, this.getVersionedExtent(), "getVersionSet", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(workspaceEClass, this.getVersionedExtent(), "getCheckedOutVersionSet", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(sessionEClass, Session.class, "Session", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSession_Workspace(), this.getWorkspace(), null, "workspace", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(containerDefinitionEClass, ContainerDefinition.class, "ContainerDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerDefinition_ArtifactContainer_Relationship(), this.getArtifactContainer_Relationship(), this.getArtifactContainer_Relationship_Containers(), "artifactContainer_Relationship", null, 0, -1, ContainerDefinition.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getContainerDefinition_ContainerDefinition_Relationship(), this.getContainerDefinition_Relationship(), this.getContainerDefinition_Relationship_Parent(), "containerDefinition_Relationship", null, 0, -1, ContainerDefinition.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getContainerDefinition_ContainerDefinition_Relationship2(), this.getContainerDefinition_Relationship(), this.getContainerDefinition_Relationship_Children(), "containerDefinition_Relationship2", null, 0, -1, ContainerDefinition.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getContainerDefinition_ContainerFragment_Relationship(), this.getContainerFragment_Relationship(), this.getContainerFragment_Relationship_Container(), "containerFragment_Relationship", null, 0, -1, ContainerDefinition.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(artifactContainer_RelationshipEClass, ArtifactContainer_Relationship.class, "ArtifactContainer_Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifactContainer_Relationship_Artifact(), this.getArtifactDefinition(), this.getArtifactDefinition_ArtifactContainer_Relationship(), "artifact", null, 1, 1, ArtifactContainer_Relationship.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getArtifactContainer_Relationship_Containers(), this.getContainerDefinition(), this.getContainerDefinition_ArtifactContainer_Relationship(), "containers", null, 1, -1, ArtifactContainer_Relationship.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(artifactDefinitionEClass, ArtifactDefinition.class, "ArtifactDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifactDefinition_IsExternal(), ecorePackage.getEBoolean(), "isExternal", null, 1, 1, ArtifactDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArtifactDefinition_AKind(), this.getArtifactKinds(), "aKind", null, 1, 1, ArtifactDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArtifactDefinition_ArtifactFragment_Relationship(), this.getArtifactFragment_Relationship(), this.getArtifactFragment_Relationship_Artifact(), "artifactFragment_Relationship", null, 0, -1, ArtifactDefinition.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getArtifactDefinition_ArtifactContainer_Relationship(), this.getArtifactContainer_Relationship(), this.getArtifactContainer_Relationship_Artifact(), "artifactContainer_Relationship", null, 0, -1, ArtifactDefinition.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(artifactFragment_RelationshipEClass, ArtifactFragment_Relationship.class, "ArtifactFragment_Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifactFragment_Relationship_Artifact(), this.getArtifactDefinition(), this.getArtifactDefinition_ArtifactFragment_Relationship(), "artifact", null, 1, 1, ArtifactFragment_Relationship.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(containerDefinition_RelationshipEClass, ContainerDefinition_Relationship.class, "ContainerDefinition_Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerDefinition_Relationship_Children(), this.getContainerDefinition(), this.getContainerDefinition_ContainerDefinition_Relationship2(), "children", null, 0, -1, ContainerDefinition_Relationship.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getContainerDefinition_Relationship_Parent(), this.getContainerDefinition(), this.getContainerDefinition_ContainerDefinition_Relationship(), "parent", null, 1, 1, ContainerDefinition_Relationship.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(containerFragment_RelationshipEClass, ContainerFragment_Relationship.class, "ContainerFragment_Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerFragment_Relationship_Container(), this.getContainerDefinition(), this.getContainerDefinition_ContainerFragment_Relationship(), "container", null, 1, -1, ContainerFragment_Relationship.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(labeledTextEClass, LabeledText.class, "LabeledText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabeledText_Label(), ecorePackage.getEString(), "label", null, 1, 1, LabeledText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(artifactKindsEEnum, ArtifactKinds.class, "ArtifactKinds");
		addEEnumLiteral(artifactKindsEEnum, ArtifactKinds.DOCUMENT);
		addEEnumLiteral(artifactKindsEEnum, ArtifactKinds.SPREAD_SHEET);
		addEEnumLiteral(artifactKindsEEnum, ArtifactKinds.DIAGRAM);
		addEEnumLiteral(artifactKindsEEnum, ArtifactKinds.GRAPHIC);
		addEEnumLiteral(artifactKindsEEnum, ArtifactKinds.UML_MODEL);
		addEEnumLiteral(artifactKindsEEnum, ArtifactKinds.SOURCE_CODE);
		addEEnumLiteral(artifactKindsEEnum, ArtifactKinds.BINARY);
		addEEnumLiteral(artifactKindsEEnum, ArtifactKinds.OTHER);

		// Create resource
		createResource(eNS_URI);
	}

} //SpemartiPackageImpl
