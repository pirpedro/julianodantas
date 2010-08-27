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
 * A representation of the model object '<em><b>Container Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.ContainerDefinition#getArtifactContainer_Relationship <em>Artifact Container Relationship</em>}</li>
 *   <li>{@link spemarti.ContainerDefinition#getContainerDefinition_Relationship <em>Container Definition Relationship</em>}</li>
 *   <li>{@link spemarti.ContainerDefinition#getContainerDefinition_Relationship2 <em>Container Definition Relationship2</em>}</li>
 *   <li>{@link spemarti.ContainerDefinition#getContainerFragment_Relationship <em>Container Fragment Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getContainerDefinition()
 * @model
 * @generated
 */
public interface ContainerDefinition extends WorkProductDefinition {
	/**
	 * Returns the value of the '<em><b>Artifact Container Relationship</b></em>' reference list.
	 * The list contents are of type {@link spemarti.ArtifactContainer_Relationship}.
	 * It is bidirectional and its opposite is '{@link spemarti.ArtifactContainer_Relationship#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Container Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Container Relationship</em>' reference list.
	 * @see spemarti.SpemartiPackage#getContainerDefinition_ArtifactContainer_Relationship()
	 * @see spemarti.ArtifactContainer_Relationship#getContainers
	 * @model opposite="containers" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ArtifactContainer_Relationship> getArtifactContainer_Relationship();

	/**
	 * Returns the value of the '<em><b>Container Definition Relationship</b></em>' reference list.
	 * The list contents are of type {@link spemarti.ContainerDefinition_Relationship}.
	 * It is bidirectional and its opposite is '{@link spemarti.ContainerDefinition_Relationship#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Definition Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Definition Relationship</em>' reference list.
	 * @see spemarti.SpemartiPackage#getContainerDefinition_ContainerDefinition_Relationship()
	 * @see spemarti.ContainerDefinition_Relationship#getParent
	 * @model opposite="parent" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ContainerDefinition_Relationship> getContainerDefinition_Relationship();

	/**
	 * Returns the value of the '<em><b>Container Definition Relationship2</b></em>' reference list.
	 * The list contents are of type {@link spemarti.ContainerDefinition_Relationship}.
	 * It is bidirectional and its opposite is '{@link spemarti.ContainerDefinition_Relationship#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Definition Relationship2</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Definition Relationship2</em>' reference list.
	 * @see spemarti.SpemartiPackage#getContainerDefinition_ContainerDefinition_Relationship2()
	 * @see spemarti.ContainerDefinition_Relationship#getChildren
	 * @model opposite="children" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ContainerDefinition_Relationship> getContainerDefinition_Relationship2();

	/**
	 * Returns the value of the '<em><b>Container Fragment Relationship</b></em>' reference list.
	 * The list contents are of type {@link spemarti.ContainerFragment_Relationship}.
	 * It is bidirectional and its opposite is '{@link spemarti.ContainerFragment_Relationship#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Fragment Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Fragment Relationship</em>' reference list.
	 * @see spemarti.SpemartiPackage#getContainerDefinition_ContainerFragment_Relationship()
	 * @see spemarti.ContainerFragment_Relationship#getContainer
	 * @model opposite="container" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ContainerFragment_Relationship> getContainerFragment_Relationship();

} // ContainerDefinition
