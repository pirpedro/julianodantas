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
 * A representation of the model object '<em><b>Baseline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Selects a set of Versions, with no two versions from the same VersionHistory.
 * 
 * Superclasses Version
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.Baseline#getMemberof <em>Memberof</em>}</li>
 *   <li>{@link spemarti.Baseline#getMember <em>Member</em>}</li>
 *   <li>{@link spemarti.Baseline#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link spemarti.Baseline#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getBaseline()
 * @model
 * @generated
 */
public interface Baseline extends Version {
	/**
	 * Returns the value of the '<em><b>Memberof</b></em>' reference list.
	 * The list contents are of type {@link spemarti.Baseline}.
	 * It is bidirectional and its opposite is '{@link spemarti.Baseline#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * member-of, type = Configuration, [0..*], isReadOnly = true, inverse = member
	 * • Baselines which logically include this Baseline.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memberof</em>' reference list.
	 * @see spemarti.SpemartiPackage#getBaseline_Memberof()
	 * @see spemarti.Baseline#getMember
	 * @model opposite="member" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	EList<Baseline> getMemberof();

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link spemarti.Baseline}.
	 * It is bidirectional and its opposite is '{@link spemarti.Baseline#getMemberof <em>Memberof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * member, type = Configuration, [0..*], isReadOnly = true, inverse = member-of
	 * • Baselines which are logically included in this Baseline.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see spemarti.SpemartiPackage#getBaseline_Member()
	 * @see spemarti.Baseline#getMemberof
	 * @model opposite="memberof" changeable="false" ordered="false"
	 * @generated
	 */
	EList<Baseline> getMember();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference list.
	 * The list contents are of type {@link spemarti.Configuration}.
	 * It is bidirectional and its opposite is '{@link spemarti.Configuration#getBaseline <em>Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * configuration, type = Configuration, [0..*], isReadOnly = true, inverse = baseline
	 * • Configurations that refer to this Baseline.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration</em>' reference list.
	 * @see spemarti.SpemartiPackage#getBaseline_Configuration()
	 * @see spemarti.Configuration#getBaseline
	 * @model opposite="baseline" ordered="false"
	 * @generated
	 */
	EList<Configuration> getConfiguration();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' reference list.
	 * The list contents are of type {@link spemarti.Version}.
	 * It is bidirectional and its opposite is '{@link spemarti.Version#getBaseline <em>Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' reference list.
	 * @see spemarti.SpemartiPackage#getBaseline_Version()
	 * @see spemarti.Version#getBaseline
	 * @model opposite="baseline" ordered="false"
	 * @generated
	 */
	EList<Version> getVersion();

} // Baseline
