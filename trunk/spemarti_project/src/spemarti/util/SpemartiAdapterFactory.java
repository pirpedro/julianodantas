/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import spemarti.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see spemarti.SpemartiPackage
 * @generated
 */
public class SpemartiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpemartiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpemartiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpemartiPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
	protected SpemartiSwitch<Adapter> modelSwitch =
		new SpemartiSwitch<Adapter>() {
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseSimpleInformationElement(SimpleInformationElement object) {
				return createSimpleInformationElementAdapter();
			}
			@Override
			public Adapter caseVersionedExtent(VersionedExtent object) {
				return createVersionedExtentAdapter();
			}
			@Override
			public Adapter caseVersionHistory(VersionHistory object) {
				return createVersionHistoryAdapter();
			}
			@Override
			public Adapter caseVersion(Version object) {
				return createVersionAdapter();
			}
			@Override
			public Adapter caseBaseline(Baseline object) {
				return createBaselineAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseBaselineHistory(BaselineHistory object) {
				return createBaselineHistoryAdapter();
			}
			@Override
			public Adapter caseFragmentDefinition(FragmentDefinition object) {
				return createFragmentDefinitionAdapter();
			}
			@Override
			public Adapter caseWorkProductDefinition(WorkProductDefinition object) {
				return createWorkProductDefinitionAdapter();
			}
			@Override
			public Adapter caseDiagram(Diagram object) {
				return createDiagramAdapter();
			}
			@Override
			public Adapter caseComplexInformationElement(ComplexInformationElement object) {
				return createComplexInformationElementAdapter();
			}
			@Override
			public Adapter caseQuestion(Question object) {
				return createQuestionAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseList(List object) {
				return createListAdapter();
			}
			@Override
			public Adapter caseMatrix(Matrix object) {
				return createMatrixAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseElementGroup(ElementGroup object) {
				return createElementGroupAdapter();
			}
			@Override
			public Adapter caseWorkspace(Workspace object) {
				return createWorkspaceAdapter();
			}
			@Override
			public Adapter caseSession(Session object) {
				return createSessionAdapter();
			}
			@Override
			public Adapter caseContainerDefinition(ContainerDefinition object) {
				return createContainerDefinitionAdapter();
			}
			@Override
			public Adapter caseArtifactContainer_Relationship(ArtifactContainer_Relationship object) {
				return createArtifactContainer_RelationshipAdapter();
			}
			@Override
			public Adapter caseArtifactDefinition(ArtifactDefinition object) {
				return createArtifactDefinitionAdapter();
			}
			@Override
			public Adapter caseArtifactFragment_Relationship(ArtifactFragment_Relationship object) {
				return createArtifactFragment_RelationshipAdapter();
			}
			@Override
			public Adapter caseFragment_Relationship(Fragment_Relationship object) {
				return createFragment_RelationshipAdapter();
			}
			@Override
			public Adapter caseContainerDefinition_Relationship(ContainerDefinition_Relationship object) {
				return createContainerDefinition_RelationshipAdapter();
			}
			@Override
			public Adapter caseContainerFragment_Relationship(ContainerFragment_Relationship object) {
				return createContainerFragment_RelationshipAdapter();
			}
			@Override
			public Adapter caseLabeledText(LabeledText object) {
				return createLabeledTextAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link spemarti.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.SimpleInformationElement <em>Simple Information Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.SimpleInformationElement
	 * @generated
	 */
	public Adapter createSimpleInformationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.VersionedExtent <em>Versioned Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.VersionedExtent
	 * @generated
	 */
	public Adapter createVersionedExtentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.VersionHistory <em>Version History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.VersionHistory
	 * @generated
	 */
	public Adapter createVersionHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.Version
	 * @generated
	 */
	public Adapter createVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.Baseline <em>Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.Baseline
	 * @generated
	 */
	public Adapter createBaselineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.BaselineHistory <em>Baseline History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.BaselineHistory
	 * @generated
	 */
	public Adapter createBaselineHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.FragmentDefinition <em>Fragment Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.FragmentDefinition
	 * @generated
	 */
	public Adapter createFragmentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.WorkProductDefinition <em>Work Product Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.WorkProductDefinition
	 * @generated
	 */
	public Adapter createWorkProductDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.Fragment_Relationship <em>Fragment Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.Fragment_Relationship
	 * @generated
	 */
	public Adapter createFragment_RelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.Diagram
	 * @generated
	 */
	public Adapter createDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.ComplexInformationElement <em>Complex Information Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.ComplexInformationElement
	 * @generated
	 */
	public Adapter createComplexInformationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.List
	 * @generated
	 */
	public Adapter createListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.Matrix
	 * @generated
	 */
	public Adapter createMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.ElementGroup <em>Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.ElementGroup
	 * @generated
	 */
	public Adapter createElementGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.Workspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.Workspace
	 * @generated
	 */
	public Adapter createWorkspaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.Session <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.Session
	 * @generated
	 */
	public Adapter createSessionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.ContainerDefinition <em>Container Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.ContainerDefinition
	 * @generated
	 */
	public Adapter createContainerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.ArtifactContainer_Relationship <em>Artifact Container Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.ArtifactContainer_Relationship
	 * @generated
	 */
	public Adapter createArtifactContainer_RelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.ArtifactDefinition <em>Artifact Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.ArtifactDefinition
	 * @generated
	 */
	public Adapter createArtifactDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.ArtifactFragment_Relationship <em>Artifact Fragment Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.ArtifactFragment_Relationship
	 * @generated
	 */
	public Adapter createArtifactFragment_RelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.ContainerDefinition_Relationship <em>Container Definition Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.ContainerDefinition_Relationship
	 * @generated
	 */
	public Adapter createContainerDefinition_RelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.ContainerFragment_Relationship <em>Container Fragment Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.ContainerFragment_Relationship
	 * @generated
	 */
	public Adapter createContainerFragment_RelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spemarti.LabeledText <em>Labeled Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spemarti.LabeledText
	 * @generated
	 */
	public Adapter createLabeledTextAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SpemartiAdapterFactory
