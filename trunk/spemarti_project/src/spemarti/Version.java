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
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each instance of Version is a snapshot of a VersionedExtent.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.Version#getLabel <em>Label</em>}</li>
 *   <li>{@link spemarti.Version#getId <em>Id</em>}</li>
 *   <li>{@link spemarti.Version#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link spemarti.Version#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link spemarti.Version#getPreviousVersion <em>Previous Version</em>}</li>
 *   <li>{@link spemarti.Version#getNextVersion <em>Next Version</em>}</li>
 *   <li>{@link spemarti.Version#getBaseline <em>Baseline</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * label, type = Label, multivalued [0..*], isReadOnly = true
	 * • A user assigned string that can be used to identify the version. Several can be applied to one version. Also, version
	 * labels must be unique among all the version labels within the VersionHistory of that version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute list.
	 * @see spemarti.SpemartiPackage#getVersion_Label()
	 * @model changeable="false" ordered="false"
	 * @generated
	 */
	EList<String> getLabel();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * id, type = String, isReadOnly = true
	 * • This attribute is an id for the version that is unique within the VersionHistory of that version.
	 * • The format of the string is implementation-defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see spemarti.SpemartiPackage#getVersion_Id()
	 * @model required="true" changeable="false" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * creationDate, type = Long, isReadOnly = true
	 * • Used to record the timestamp when the Version object was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(String)
	 * @see spemarti.SpemartiPackage#getVersion_CreationDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCreationDate();

	/**
	 * Sets the value of the '{@link spemarti.Version#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(String value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * annotation, type = String, [0..1]
	 * • This attribute can contain a description of the version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation</em>' attribute.
	 * @see #setAnnotation(String)
	 * @see spemarti.SpemartiPackage#getVersion_Annotation()
	 * @model ordered="false"
	 * @generated
	 */
	String getAnnotation();

	/**
	 * Sets the value of the '{@link spemarti.Version#getAnnotation <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' attribute.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(String value);

	/**
	 * Returns the value of the '<em><b>Previous Version</b></em>' reference list.
	 * The list contents are of type {@link spemarti.Version}.
	 * It is bidirectional and its opposite is '{@link spemarti.Version#getNextVersion <em>Next Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * previousVersion, type = Version, [0..*], isReadOnly = true, inverse = nextVersion
	 * • This refers to the immediately previous version (or versions, in case this Version resulted from a merge). Every
	 * Version that is not the root version of a VersionHistory has at least one previousVersion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Previous Version</em>' reference list.
	 * @see spemarti.SpemartiPackage#getVersion_PreviousVersion()
	 * @see spemarti.Version#getNextVersion
	 * @model opposite="nextVersion"
	 * @generated
	 */
	EList<Version> getPreviousVersion();

	/**
	 * Returns the value of the '<em><b>Next Version</b></em>' reference list.
	 * The list contents are of type {@link spemarti.Version}.
	 * It is bidirectional and its opposite is '{@link spemarti.Version#getPreviousVersion <em>Previous Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nextVersion, type = Version, [0..*], isReadOnly = true, inverse = previousVersion
	 * • This refers to ordered subsequent versions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next Version</em>' reference list.
	 * @see spemarti.SpemartiPackage#getVersion_NextVersion()
	 * @see spemarti.Version#getPreviousVersion
	 * @model opposite="previousVersion" ordered="false"
	 * @generated
	 */
	EList<Version> getNextVersion();

	/**
	 * Returns the value of the '<em><b>Baseline</b></em>' reference list.
	 * The list contents are of type {@link spemarti.Baseline}.
	 * It is bidirectional and its opposite is '{@link spemarti.Baseline#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * baseline, type = Baseline, [0..*], isReadOnly = true, inverse = version
	 * • This refers to the Baselines that reference this Version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Baseline</em>' reference list.
	 * @see spemarti.SpemartiPackage#getVersion_Baseline()
	 * @see spemarti.Baseline#getVersion
	 * @model opposite="version" ordered="false"
	 * @generated
	 */
	EList<Baseline> getBaseline();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * addLabel (newLabel: Label) operation, return type = void
	 * • Adds a label to the version. If that label currently appears on another version in the version history of this Version,
	 * it is automatically removed from that other version. See the label attribute for further details.
	 * <!-- end-model-doc -->
	 * @model labelRequired="true" labelOrdered="false"
	 * @generated
	 */
	void addLabel(String label);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * removeLabel (oldLabel: Label) operation, return type = void
	 * • Removes the indicated label from the version. See the label attribute for further details.
	 * <!-- end-model-doc -->
	 * @model labelRequired="true" labelOrdered="false"
	 * @generated
	 */
	void removeLabel(String label);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * delete (), return type = void
	 * • Removes the version object. This method also fixes up the links in the version graph so that it is still valid.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void delete();

} // Version
