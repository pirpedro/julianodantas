/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import spemarti.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpemartiFactoryImpl extends EFactoryImpl implements SpemartiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpemartiFactory init() {
		try {
			SpemartiFactory theSpemartiFactory = (SpemartiFactory)EPackage.Registry.INSTANCE.getEFactory("http:///spemarti.ecore"); 
			if (theSpemartiFactory != null) {
				return theSpemartiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpemartiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpemartiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SpemartiPackage.IMAGE: return createImage();
			case SpemartiPackage.VERSIONED_EXTENT: return createVersionedExtent();
			case SpemartiPackage.VERSION_HISTORY: return createVersionHistory();
			case SpemartiPackage.VERSION: return createVersion();
			case SpemartiPackage.BASELINE: return createBaseline();
			case SpemartiPackage.CONFIGURATION: return createConfiguration();
			case SpemartiPackage.BASELINE_HISTORY: return createBaselineHistory();
			case SpemartiPackage.DIAGRAM: return createDiagram();
			case SpemartiPackage.QUESTION: return createQuestion();
			case SpemartiPackage.TEXT: return createText();
			case SpemartiPackage.LIST: return createList();
			case SpemartiPackage.MATRIX: return createMatrix();
			case SpemartiPackage.TABLE: return createTable();
			case SpemartiPackage.ELEMENT_GROUP: return createElementGroup();
			case SpemartiPackage.WORKSPACE: return createWorkspace();
			case SpemartiPackage.SESSION: return createSession();
			case SpemartiPackage.CONTAINER_DEFINITION: return createContainerDefinition();
			case SpemartiPackage.ARTIFACT_CONTAINER_RELATIONSHIP: return createArtifactContainer_Relationship();
			case SpemartiPackage.ARTIFACT_DEFINITION: return createArtifactDefinition();
			case SpemartiPackage.ARTIFACT_FRAGMENT_RELATIONSHIP: return createArtifactFragment_Relationship();
			case SpemartiPackage.FRAGMENT_RELATIONSHIP: return createFragment_Relationship();
			case SpemartiPackage.CONTAINER_DEFINITION_RELATIONSHIP: return createContainerDefinition_Relationship();
			case SpemartiPackage.CONTAINER_FRAGMENT_RELATIONSHIP: return createContainerFragment_Relationship();
			case SpemartiPackage.LABELED_TEXT: return createLabeledText();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SpemartiPackage.ARTIFACT_KINDS:
				return createArtifactKindsFromString(eDataType, initialValue);
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SpemartiPackage.ARTIFACT_KINDS:
				return convertArtifactKindsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedExtent createVersionedExtent() {
		VersionedExtentImpl versionedExtent = new VersionedExtentImpl();
		return versionedExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionHistory createVersionHistory() {
		VersionHistoryImpl versionHistory = new VersionHistoryImpl();
		return versionHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Baseline createBaseline() {
		BaselineImpl baseline = new BaselineImpl();
		return baseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaselineHistory createBaselineHistory() {
		BaselineHistoryImpl baselineHistory = new BaselineHistoryImpl();
		return baselineHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment_Relationship createFragment_Relationship() {
		Fragment_RelationshipImpl fragment_Relationship = new Fragment_RelationshipImpl();
		return fragment_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix createMatrix() {
		MatrixImpl matrix = new MatrixImpl();
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementGroup createElementGroup() {
		ElementGroupImpl elementGroup = new ElementGroupImpl();
		return elementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workspace createWorkspace() {
		WorkspaceImpl workspace = new WorkspaceImpl();
		return workspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Session createSession() {
		SessionImpl session = new SessionImpl();
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerDefinition createContainerDefinition() {
		ContainerDefinitionImpl containerDefinition = new ContainerDefinitionImpl();
		return containerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactContainer_Relationship createArtifactContainer_Relationship() {
		ArtifactContainer_RelationshipImpl artifactContainer_Relationship = new ArtifactContainer_RelationshipImpl();
		return artifactContainer_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactDefinition createArtifactDefinition() {
		ArtifactDefinitionImpl artifactDefinition = new ArtifactDefinitionImpl();
		return artifactDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactFragment_Relationship createArtifactFragment_Relationship() {
		ArtifactFragment_RelationshipImpl artifactFragment_Relationship = new ArtifactFragment_RelationshipImpl();
		return artifactFragment_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerDefinition_Relationship createContainerDefinition_Relationship() {
		ContainerDefinition_RelationshipImpl containerDefinition_Relationship = new ContainerDefinition_RelationshipImpl();
		return containerDefinition_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerFragment_Relationship createContainerFragment_Relationship() {
		ContainerFragment_RelationshipImpl containerFragment_Relationship = new ContainerFragment_RelationshipImpl();
		return containerFragment_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabeledText createLabeledText() {
		LabeledTextImpl labeledText = new LabeledTextImpl();
		return labeledText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactKinds createArtifactKindsFromString(EDataType eDataType, String initialValue) {
		ArtifactKinds result = ArtifactKinds.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactKindsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpemartiPackage getSpemartiPackage() {
		return (SpemartiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpemartiPackage getPackage() {
		return SpemartiPackage.eINSTANCE;
	}

} //SpemartiFactoryImpl
