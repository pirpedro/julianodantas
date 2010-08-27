/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.ArtifactDefinition#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link spemarti.ArtifactDefinition#getAKind <em>AKind</em>}</li>
 *   <li>{@link spemarti.ArtifactDefinition#getArtifactFragment_Relationship <em>Artifact Fragment Relationship</em>}</li>
 *   <li>{@link spemarti.ArtifactDefinition#getArtifactContainer_Relationship <em>Artifact Container Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getArtifactDefinition()
 * @model
 * @generated
 */
public interface ArtifactDefinition extends WorkProductDefinition {
	/**
	 * Returns the value of the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is External</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is External</em>' attribute.
	 * @see #setIsExternal(boolean)
	 * @see spemarti.SpemartiPackage#getArtifactDefinition_IsExternal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsExternal();

	/**
	 * Sets the value of the '{@link spemarti.ArtifactDefinition#isIsExternal <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is External</em>' attribute.
	 * @see #isIsExternal()
	 * @generated
	 */
	void setIsExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>AKind</b></em>' attribute.
	 * The literals are from the enumeration {@link spemarti.ArtifactKinds}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AKind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AKind</em>' attribute.
	 * @see spemarti.ArtifactKinds
	 * @see #setAKind(ArtifactKinds)
	 * @see spemarti.SpemartiPackage#getArtifactDefinition_AKind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ArtifactKinds getAKind();

	/**
	 * Sets the value of the '{@link spemarti.ArtifactDefinition#getAKind <em>AKind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AKind</em>' attribute.
	 * @see spemarti.ArtifactKinds
	 * @see #getAKind()
	 * @generated
	 */
	void setAKind(ArtifactKinds value);

	/**
	 * Returns the value of the '<em><b>Artifact Fragment Relationship</b></em>' reference list.
	 * The list contents are of type {@link spemarti.ArtifactFragment_Relationship}.
	 * It is bidirectional and its opposite is '{@link spemarti.ArtifactFragment_Relationship#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Fragment Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Fragment Relationship</em>' reference list.
	 * @see spemarti.SpemartiPackage#getArtifactDefinition_ArtifactFragment_Relationship()
	 * @see spemarti.ArtifactFragment_Relationship#getArtifact
	 * @model opposite="artifact" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ArtifactFragment_Relationship> getArtifactFragment_Relationship();

	/**
	 * Returns the value of the '<em><b>Artifact Container Relationship</b></em>' reference list.
	 * The list contents are of type {@link spemarti.ArtifactContainer_Relationship}.
	 * It is bidirectional and its opposite is '{@link spemarti.ArtifactContainer_Relationship#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Container Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Container Relationship</em>' reference list.
	 * @see spemarti.SpemartiPackage#getArtifactDefinition_ArtifactContainer_Relationship()
	 * @see spemarti.ArtifactContainer_Relationship#getArtifact
	 * @model opposite="artifact" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ArtifactContainer_Relationship> getArtifactContainer_Relationship();

} // ArtifactDefinition
