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
 * A representation of the model object '<em><b>Container Definition Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.ContainerDefinition_Relationship#getChildren <em>Children</em>}</li>
 *   <li>{@link spemarti.ContainerDefinition_Relationship#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getContainerDefinition_Relationship()
 * @model
 * @generated
 */
public interface ContainerDefinition_Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link spemarti.ContainerDefinition}.
	 * It is bidirectional and its opposite is '{@link spemarti.ContainerDefinition#getContainerDefinition_Relationship2 <em>Container Definition Relationship2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see spemarti.SpemartiPackage#getContainerDefinition_Relationship_Children()
	 * @see spemarti.ContainerDefinition#getContainerDefinition_Relationship2
	 * @model opposite="containerDefinition_Relationship2" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ContainerDefinition> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link spemarti.ContainerDefinition#getContainerDefinition_Relationship <em>Container Definition Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(ContainerDefinition)
	 * @see spemarti.SpemartiPackage#getContainerDefinition_Relationship_Parent()
	 * @see spemarti.ContainerDefinition#getContainerDefinition_Relationship
	 * @model opposite="containerDefinition_Relationship" required="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ContainerDefinition getParent();

	/**
	 * Sets the value of the '{@link spemarti.ContainerDefinition_Relationship#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ContainerDefinition value);

} // ContainerDefinition_Relationship
