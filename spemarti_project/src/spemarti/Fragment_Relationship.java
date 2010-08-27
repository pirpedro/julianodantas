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
 * A representation of the model object '<em><b>Fragment Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.Fragment_Relationship#getContainers <em>Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getFragment_Relationship()
 * @model
 * @generated
 */
public interface Fragment_Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' reference list.
	 * The list contents are of type {@link spemarti.FragmentDefinition}.
	 * It is bidirectional and its opposite is '{@link spemarti.FragmentDefinition#getFragment_Relationship <em>Fragment Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' reference list.
	 * @see spemarti.SpemartiPackage#getFragment_Relationship_Containers()
	 * @see spemarti.FragmentDefinition#getFragment_Relationship
	 * @model opposite="fragment_Relationship" required="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<FragmentDefinition> getContainers();

} // Fragment_Relationship
