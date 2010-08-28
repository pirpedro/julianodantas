/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fragment Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.FragmentDefinition#getFragment_Relationship <em>Fragment Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getFragmentDefinition()
 * @model abstract="true"
 * @generated
 */
public interface FragmentDefinition extends WorkProductDefinition {
	/**
	 * Returns the value of the '<em><b>Fragment Relationship</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link spemarti.Fragment_Relationship#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment Relationship</em>' reference.
	 * @see #setFragment_Relationship(Fragment_Relationship)
	 * @see spemarti.SpemartiPackage#getFragmentDefinition_Fragment_Relationship()
	 * @see spemarti.Fragment_Relationship#getContainers
	 * @model opposite="containers" required="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Fragment_Relationship getFragment_Relationship();

	/**
	 * Sets the value of the '{@link spemarti.FragmentDefinition#getFragment_Relationship <em>Fragment Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragment Relationship</em>' reference.
	 * @see #getFragment_Relationship()
	 * @generated
	 */
	void setFragment_Relationship(Fragment_Relationship value);

} // FragmentDefinition
