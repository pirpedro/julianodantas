/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import spemarti.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see spemarti.SpemartiPackage
 * @generated
 */
public class SpemartiSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpemartiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpemartiSwitch() {
		if (modelPackage == null) {
			modelPackage = SpemartiPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SpemartiPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseSimpleInformationElement(image);
				if (result == null) result = caseVersionedExtent(image);
				if (result == null) result = caseFragmentDefinition(image);
				if (result == null) result = caseWorkProductDefinition(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.SIMPLE_INFORMATION_ELEMENT: {
				SimpleInformationElement simpleInformationElement = (SimpleInformationElement)theEObject;
				T result = caseSimpleInformationElement(simpleInformationElement);
				if (result == null) result = caseVersionedExtent(simpleInformationElement);
				if (result == null) result = caseFragmentDefinition(simpleInformationElement);
				if (result == null) result = caseWorkProductDefinition(simpleInformationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.VERSIONED_EXTENT: {
				VersionedExtent versionedExtent = (VersionedExtent)theEObject;
				T result = caseVersionedExtent(versionedExtent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.VERSION_HISTORY: {
				VersionHistory versionHistory = (VersionHistory)theEObject;
				T result = caseVersionHistory(versionHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.VERSION: {
				Version version = (Version)theEObject;
				T result = caseVersion(version);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.BASELINE: {
				Baseline baseline = (Baseline)theEObject;
				T result = caseBaseline(baseline);
				if (result == null) result = caseVersion(baseline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.BASELINE_HISTORY: {
				BaselineHistory baselineHistory = (BaselineHistory)theEObject;
				T result = caseBaselineHistory(baselineHistory);
				if (result == null) result = caseVersionHistory(baselineHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.FRAGMENT_DEFINITION: {
				FragmentDefinition fragmentDefinition = (FragmentDefinition)theEObject;
				T result = caseFragmentDefinition(fragmentDefinition);
				if (result == null) result = caseWorkProductDefinition(fragmentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.WORK_PRODUCT_DEFINITION: {
				WorkProductDefinition workProductDefinition = (WorkProductDefinition)theEObject;
				T result = caseWorkProductDefinition(workProductDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.DIAGRAM: {
				Diagram diagram = (Diagram)theEObject;
				T result = caseDiagram(diagram);
				if (result == null) result = caseComplexInformationElement(diagram);
				if (result == null) result = caseSimpleInformationElement(diagram);
				if (result == null) result = caseVersionedExtent(diagram);
				if (result == null) result = caseFragmentDefinition(diagram);
				if (result == null) result = caseWorkProductDefinition(diagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.COMPLEX_INFORMATION_ELEMENT: {
				ComplexInformationElement complexInformationElement = (ComplexInformationElement)theEObject;
				T result = caseComplexInformationElement(complexInformationElement);
				if (result == null) result = caseSimpleInformationElement(complexInformationElement);
				if (result == null) result = caseVersionedExtent(complexInformationElement);
				if (result == null) result = caseFragmentDefinition(complexInformationElement);
				if (result == null) result = caseWorkProductDefinition(complexInformationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.QUESTION: {
				Question question = (Question)theEObject;
				T result = caseQuestion(question);
				if (result == null) result = caseComplexInformationElement(question);
				if (result == null) result = caseSimpleInformationElement(question);
				if (result == null) result = caseVersionedExtent(question);
				if (result == null) result = caseFragmentDefinition(question);
				if (result == null) result = caseWorkProductDefinition(question);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseSimpleInformationElement(text);
				if (result == null) result = caseVersionedExtent(text);
				if (result == null) result = caseFragmentDefinition(text);
				if (result == null) result = caseWorkProductDefinition(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.LIST: {
				spemarti.List list = (spemarti.List)theEObject;
				T result = caseList(list);
				if (result == null) result = caseComplexInformationElement(list);
				if (result == null) result = caseSimpleInformationElement(list);
				if (result == null) result = caseVersionedExtent(list);
				if (result == null) result = caseFragmentDefinition(list);
				if (result == null) result = caseWorkProductDefinition(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.MATRIX: {
				Matrix matrix = (Matrix)theEObject;
				T result = caseMatrix(matrix);
				if (result == null) result = caseComplexInformationElement(matrix);
				if (result == null) result = caseSimpleInformationElement(matrix);
				if (result == null) result = caseVersionedExtent(matrix);
				if (result == null) result = caseFragmentDefinition(matrix);
				if (result == null) result = caseWorkProductDefinition(matrix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseMatrix(table);
				if (result == null) result = caseComplexInformationElement(table);
				if (result == null) result = caseSimpleInformationElement(table);
				if (result == null) result = caseVersionedExtent(table);
				if (result == null) result = caseFragmentDefinition(table);
				if (result == null) result = caseWorkProductDefinition(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = caseList(group);
				if (result == null) result = caseComplexInformationElement(group);
				if (result == null) result = caseSimpleInformationElement(group);
				if (result == null) result = caseVersionedExtent(group);
				if (result == null) result = caseFragmentDefinition(group);
				if (result == null) result = caseWorkProductDefinition(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.WORKSPACE: {
				Workspace workspace = (Workspace)theEObject;
				T result = caseWorkspace(workspace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.SESSION: {
				Session session = (Session)theEObject;
				T result = caseSession(session);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.CONTAINER_DEFINITION: {
				ContainerDefinition containerDefinition = (ContainerDefinition)theEObject;
				T result = caseContainerDefinition(containerDefinition);
				if (result == null) result = caseWorkProductDefinition(containerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpemartiPackage.ARTIFACT_DEFINITION: {
				ArtifactDefinition artifactDefinition = (ArtifactDefinition)theEObject;
				T result = caseArtifactDefinition(artifactDefinition);
				if (result == null) result = caseWorkProductDefinition(artifactDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Information Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Information Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleInformationElement(SimpleInformationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned Extent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned Extent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionedExtent(VersionedExtent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionHistory(VersionHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersion(Version object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Baseline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Baseline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseline(Baseline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Baseline History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Baseline History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaselineHistory(BaselineHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fragment Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fragment Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFragmentDefinition(FragmentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkProductDefinition(WorkProductDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagram(Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Information Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Information Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexInformationElement(ComplexInformationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(spemarti.List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatrix(Matrix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workspace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workspace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkspace(Workspace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSession(Session object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerDefinition(ContainerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactDefinition(ArtifactDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //SpemartiSwitch
