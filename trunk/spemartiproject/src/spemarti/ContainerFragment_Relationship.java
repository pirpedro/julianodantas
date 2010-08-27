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
 * A representation of the model object '<em><b>Container Fragment Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.ContainerFragment_Relationship#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getContainerFragment_Relationship()
 * @model
 * @generated
 */
public interface ContainerFragment_Relationship extends Fragment_Relationship {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference list.
	 * The list contents are of type {@link spemarti.ContainerDefinition}.
	 * It is bidirectional and its opposite is '{@link spemarti.ContainerDefinition#getContainerFragment_Relationship <em>Container Fragment Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference list.
	 * @see spemarti.SpemartiPackage#getContainerFragment_Relationship_Container()
	 * @see spemarti.ContainerDefinition#getContainerFragment_Relationship
	 * @model opposite="containerFragment_Relationship" required="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ContainerDefinition> getContainer();

} // ContainerFragment_Relationship
