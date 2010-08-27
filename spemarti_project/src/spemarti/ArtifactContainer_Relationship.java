/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Container Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.ArtifactContainer_Relationship#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link spemarti.ArtifactContainer_Relationship#getContainers <em>Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getArtifactContainer_Relationship()
 * @model
 * @generated
 */
public interface ArtifactContainer_Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link spemarti.ArtifactDefinition#getArtifactContainer_Relationship <em>Artifact Container Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' reference.
	 * @see #setArtifact(ArtifactDefinition)
	 * @see spemarti.SpemartiPackage#getArtifactContainer_Relationship_Artifact()
	 * @see spemarti.ArtifactDefinition#getArtifactContainer_Relationship
	 * @model opposite="artifactContainer_Relationship" required="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ArtifactDefinition getArtifact();

	/**
	 * Sets the value of the '{@link spemarti.ArtifactContainer_Relationship#getArtifact <em>Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact</em>' reference.
	 * @see #getArtifact()
	 * @generated
	 */
	void setArtifact(ArtifactDefinition value);

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' reference list.
	 * The list contents are of type {@link spemarti.ContainerDefinition}.
	 * It is bidirectional and its opposite is '{@link spemarti.ContainerDefinition#getArtifactContainer_Relationship <em>Artifact Container Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' reference list.
	 * @see spemarti.SpemartiPackage#getArtifactContainer_Relationship_Containers()
	 * @see spemarti.ContainerDefinition#getArtifactContainer_Relationship
	 * @model opposite="artifactContainer_Relationship" required="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ContainerDefinition> getContainers();

} // ArtifactContainer_Relationship
