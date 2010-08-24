/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti.impl;

import org.eclipse.emf.ecore.EClass;
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
			case SpemartiPackage.LABEL: return createLabel();
			case SpemartiPackage.DIAGRAM: return createDiagram();
			case SpemartiPackage.QUESTION: return createQuestion();
			case SpemartiPackage.TEXT: return createText();
			case SpemartiPackage.LIST: return createList();
			case SpemartiPackage.MATRIX: return createMatrix();
			case SpemartiPackage.TABLE: return createTable();
			case SpemartiPackage.GROUP: return createGroup();
			case SpemartiPackage.WORKSPACE: return createWorkspace();
			case SpemartiPackage.SESSION: return createSession();
			case SpemartiPackage.CONTAINER_DEFINITION: return createContainerDefinition();
			case SpemartiPackage.ARTIFACT_DEFINITION: return createArtifactDefinition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
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
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
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
	public ArtifactDefinition createArtifactDefinition() {
		ArtifactDefinitionImpl artifactDefinition = new ArtifactDefinitionImpl();
		return artifactDefinition;
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
