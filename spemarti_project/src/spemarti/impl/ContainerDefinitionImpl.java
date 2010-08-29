/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import spemarti.ArtifactContainer_Relationship;
import spemarti.ContainerDefinition;
import spemarti.ContainerDefinition_Relationship;
import spemarti.ContainerFragment_Relationship;
import spemarti.SpemartiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spemarti.impl.ContainerDefinitionImpl#getArtifactContainer_Relationship <em>Artifact Container Relationship</em>}</li>
 *   <li>{@link spemarti.impl.ContainerDefinitionImpl#getContainerDefinition_Relationship <em>Container Definition Relationship</em>}</li>
 *   <li>{@link spemarti.impl.ContainerDefinitionImpl#getContainerDefinition_Relationship2 <em>Container Definition Relationship2</em>}</li>
 *   <li>{@link spemarti.impl.ContainerDefinitionImpl#getContainerFragment_Relationship <em>Container Fragment Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerDefinitionImpl extends WorkProductDefinitionImpl implements ContainerDefinition {
	protected EList<ArtifactContainer_Relationship> artifactContainer_Relationship;
	protected EList<ContainerDefinition_Relationship> containerDefinition_Relationship;
	protected EList<ContainerDefinition_Relationship> containerDefinition_Relationship2;
	protected EList<ContainerFragment_Relationship> containerFragment_Relationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemartiPackage.Literals.CONTAINER_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<ArtifactContainer_Relationship> getArtifactContainer_Relationship() {
		return artifactContainer_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<ContainerDefinition_Relationship> getContainerDefinition_Relationship() {
		return containerDefinition_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<ContainerDefinition_Relationship> getContainerDefinition_Relationship2() {
		return containerDefinition_Relationship2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<ContainerFragment_Relationship> getContainerFragment_Relationship() {
		return containerFragment_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemartiPackage.CONTAINER_DEFINITION__ARTIFACT_CONTAINER_RELATIONSHIP:
				return getArtifactContainer_Relationship();
			case SpemartiPackage.CONTAINER_DEFINITION__CONTAINER_DEFINITION_RELATIONSHIP:
				return getContainerDefinition_Relationship();
			case SpemartiPackage.CONTAINER_DEFINITION__CONTAINER_DEFINITION_RELATIONSHIP2:
				return getContainerDefinition_Relationship2();
			case SpemartiPackage.CONTAINER_DEFINITION__CONTAINER_FRAGMENT_RELATIONSHIP:
				return getContainerFragment_Relationship();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpemartiPackage.CONTAINER_DEFINITION__ARTIFACT_CONTAINER_RELATIONSHIP:
				getArtifactContainer_Relationship().clear();
				getArtifactContainer_Relationship().addAll((Collection<? extends ArtifactContainer_Relationship>)newValue);
				return;
			case SpemartiPackage.CONTAINER_DEFINITION__CONTAINER_DEFINITION_RELATIONSHIP:
				getContainerDefinition_Relationship().clear();
				getContainerDefinition_Relationship().addAll((Collection<? extends ContainerDefinition_Relationship>)newValue);
				return;
			case SpemartiPackage.CONTAINER_DEFINITION__CONTAINER_DEFINITION_RELATIONSHIP2:
				getContainerDefinition_Relationship2().clear();
				getContainerDefinition_Relationship2().addAll((Collection<? extends ContainerDefinition_Relationship>)newValue);
				return;
			case SpemartiPackage.CONTAINER_DEFINITION__CONTAINER_FRAGMENT_RELATIONSHIP:
				getContainerFragment_Relationship().clear();
				getContainerFragment_Relationship().addAll((Collection<? extends ContainerFragment_Relationship>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpemartiPackage.CONTAINER_DEFINITION__ARTIFACT_CONTAINER_RELATIONSHIP:
				getArtifactContainer_Relationship().clear();
				return;
			case SpemartiPackage.CONTAINER_DEFINITION__CONTAINER_DEFINITION_RELATIONSHIP:
				getContainerDefinition_Relationship().clear();
				return;
			case SpemartiPackage.CONTAINER_DEFINITION__CONTAINER_DEFINITION_RELATIONSHIP2:
				getContainerDefinition_Relationship2().clear();
				return;
			case SpemartiPackage.CONTAINER_DEFINITION__CONTAINER_FRAGMENT_RELATIONSHIP:
				getContainerFragment_Relationship().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpemartiPackage.CONTAINER_DEFINITION__ARTIFACT_CONTAINER_RELATIONSHIP:
				return !getArtifactContainer_Relationship().isEmpty();
			case SpemartiPackage.CONTAINER_DEFINITION__CONTAINER_DEFINITION_RELATIONSHIP:
				return !getContainerDefinition_Relationship().isEmpty();
			case SpemartiPackage.CONTAINER_DEFINITION__CONTAINER_DEFINITION_RELATIONSHIP2:
				return !getContainerDefinition_Relationship2().isEmpty();
			case SpemartiPackage.CONTAINER_DEFINITION__CONTAINER_FRAGMENT_RELATIONSHIP:
				return !getContainerFragment_Relationship().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerDefinitionImpl
