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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import spemarti.ArtifactContainer_Relationship;
import spemarti.ArtifactDefinition;
import spemarti.ContainerDefinition;
import spemarti.SpemartiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Container Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spemarti.impl.ArtifactContainer_RelationshipImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link spemarti.impl.ArtifactContainer_RelationshipImpl#getContainers <em>Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactContainer_RelationshipImpl extends EObjectImpl implements ArtifactContainer_Relationship {
	protected ArtifactDefinition artifactDefinition;
	protected EList<ContainerDefinition> containers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactContainer_RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemartiPackage.Literals.ARTIFACT_CONTAINER_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactDefinition getArtifact() {
		ArtifactDefinition artifact = basicGetArtifact();
		return artifact != null && artifact.eIsProxy() ? (ArtifactDefinition)eResolveProxy((InternalEObject)artifact) : artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ArtifactDefinition basicGetArtifact() {
		return artifactDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setArtifact(ArtifactDefinition newArtifact) {
		this.artifactDefinition = newArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<ContainerDefinition> getContainers() {
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemartiPackage.ARTIFACT_CONTAINER_RELATIONSHIP__ARTIFACT:
				if (resolve) return getArtifact();
				return basicGetArtifact();
			case SpemartiPackage.ARTIFACT_CONTAINER_RELATIONSHIP__CONTAINERS:
				return getContainers();
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
			case SpemartiPackage.ARTIFACT_CONTAINER_RELATIONSHIP__ARTIFACT:
				setArtifact((ArtifactDefinition)newValue);
				return;
			case SpemartiPackage.ARTIFACT_CONTAINER_RELATIONSHIP__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((Collection<? extends ContainerDefinition>)newValue);
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
			case SpemartiPackage.ARTIFACT_CONTAINER_RELATIONSHIP__ARTIFACT:
				setArtifact((ArtifactDefinition)null);
				return;
			case SpemartiPackage.ARTIFACT_CONTAINER_RELATIONSHIP__CONTAINERS:
				getContainers().clear();
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
			case SpemartiPackage.ARTIFACT_CONTAINER_RELATIONSHIP__ARTIFACT:
				return basicGetArtifact() != null;
			case SpemartiPackage.ARTIFACT_CONTAINER_RELATIONSHIP__CONTAINERS:
				return !getContainers().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtifactContainer_RelationshipImpl
