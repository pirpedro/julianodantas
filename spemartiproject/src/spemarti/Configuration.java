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
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Selects a Baseline for the Workspace and determines the other Configurations that are the members of this Configuration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.Configuration#getId <em>Id</em>}</li>
 *   <li>{@link spemarti.Configuration#getMemberof <em>Memberof</em>}</li>
 *   <li>{@link spemarti.Configuration#getMember <em>Member</em>}</li>
 *   <li>{@link spemarti.Configuration#getVersionedExtent <em>Versioned Extent</em>}</li>
 *   <li>{@link spemarti.Configuration#getPreviousBaseline <em>Previous Baseline</em>}</li>
 *   <li>{@link spemarti.Configuration#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link spemarti.Configuration#getBaseline <em>Baseline</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see spemarti.SpemartiPackage#getConfiguration_Id()
	 * @model required="true" changeable="false" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Returns the value of the '<em><b>Memberof</b></em>' reference list.
	 * The list contents are of type {@link spemarti.Configuration}.
	 * It is bidirectional and its opposite is '{@link spemarti.Configuration#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * member-of, type = Configuration, [0..*], isReadOnly = false, inverse = member
	 * • Configurations which logically include this Configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memberof</em>' reference list.
	 * @see spemarti.SpemartiPackage#getConfiguration_Memberof()
	 * @see spemarti.Configuration#getMember
	 * @model opposite="member" ordered="false"
	 * @generated
	 */
	EList<Configuration> getMemberof();

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link spemarti.Configuration}.
	 * It is bidirectional and its opposite is '{@link spemarti.Configuration#getMemberof <em>Memberof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * member, type = Configuration, [0..*], isReadOnly = true, inverse = member-of
	 * • Configurations which are logically included in this Configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see spemarti.SpemartiPackage#getConfiguration_Member()
	 * @see spemarti.Configuration#getMemberof
	 * @model opposite="memberof" ordered="false"
	 * @generated
	 */
	EList<Configuration> getMember();

	/**
	 * Returns the value of the '<em><b>Versioned Extent</b></em>' reference list.
	 * The list contents are of type {@link spemarti.VersionedExtent}.
	 * It is bidirectional and its opposite is '{@link spemarti.VersionedExtent#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versioned Extent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versioned Extent</em>' reference list.
	 * @see spemarti.SpemartiPackage#getConfiguration_VersionedExtent()
	 * @see spemarti.VersionedExtent#getConfiguration
	 * @model opposite="configuration" ordered="false"
	 * @generated
	 */
	EList<VersionedExtent> getVersionedExtent();

	/**
	 * Returns the value of the '<em><b>Previous Baseline</b></em>' reference list.
	 * The list contents are of type {@link spemarti.Baseline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * previousBaseline, type = Baseline, [1..*], isReadOnly = true
	 * • This reference identifies the baselines that will be the previousVersion for the baseline that will be created when
	 * makeBaseline is applied to this Configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Previous Baseline</em>' reference list.
	 * @see spemarti.SpemartiPackage#getConfiguration_PreviousBaseline()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Baseline> getPreviousBaseline();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * annotation, type = String
	 * • The annotation of a new Configuration that is used for the annotation of a new Baseline that is created through the
	 * makeBaseline operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation</em>' attribute.
	 * @see #setAnnotation(String)
	 * @see spemarti.SpemartiPackage#getConfiguration_Annotation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getAnnotation();

	/**
	 * Sets the value of the '{@link spemarti.Configuration#getAnnotation <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' attribute.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(String value);

	/**
	 * Returns the value of the '<em><b>Baseline</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link spemarti.Baseline#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * baseline, type = Baseline, [1..1], isReadOnly = true
	 * • The Baseline that is used by this Configuration to select a set of Versions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Baseline</em>' reference.
	 * @see #setBaseline(Baseline)
	 * @see spemarti.SpemartiPackage#getConfiguration_Baseline()
	 * @see spemarti.Baseline#getConfiguration
	 * @model opposite="configuration" required="true" ordered="false"
	 * @generated
	 */
	Baseline getBaseline();

	/**
	 * Sets the value of the '{@link spemarti.Configuration#getBaseline <em>Baseline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baseline</em>' reference.
	 * @see #getBaseline()
	 * @generated
	 */
	void setBaseline(Baseline value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * makeBaseline (), return type = void isQuery = true
	 * • Creates a new Baseline based upon the Versions selected in the Workspace by the versionedExtents of this
	 * Configuration. This also copies the annotation into the new Baseline and removes the annotation from the
	 * Configuration.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void makeBaseline();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * getBaselineHistory (), return type = BaselineHistory isQuery = true
	 * • Returns the BaselineHistory for this Configuration.
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	BaselineHistory getBaselineHistory();

} // Configuration
