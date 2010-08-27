/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Fragment Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.ArtifactFragment_Relationship#getArtifact <em>Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getArtifactFragment_Relationship()
 * @model
 * @generated
 */
public interface ArtifactFragment_Relationship extends Fragment_Relationship {
	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link spemarti.ArtifactDefinition#getArtifactFragment_Relationship <em>Artifact Fragment Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' reference.
	 * @see #setArtifact(ArtifactDefinition)
	 * @see spemarti.SpemartiPackage#getArtifactFragment_Relationship_Artifact()
	 * @see spemarti.ArtifactDefinition#getArtifactFragment_Relationship
	 * @model opposite="artifactFragment_Relationship" required="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ArtifactDefinition getArtifact();

	/**
	 * Sets the value of the '{@link spemarti.ArtifactFragment_Relationship#getArtifact <em>Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact</em>' reference.
	 * @see #getArtifact()
	 * @generated
	 */
	void setArtifact(ArtifactDefinition value);

} // ArtifactFragment_Relationship
