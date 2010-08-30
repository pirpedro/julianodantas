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
 * A representation of the model object '<em><b>Versioned Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a MOF Extent for which versioning has been enabled.
 * Superclasses MOF:Extent
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.VersionedExtent#isIsCheckedOut <em>Is Checked Out</em>}</li>
 *   <li>{@link spemarti.VersionedExtent#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link spemarti.VersionedExtent#getVersionhistory <em>Versionhistory</em>}</li>
 *   <li>{@link spemarti.VersionedExtent#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link spemarti.VersionedExtent#getPreviousVersion <em>Previous Version</em>}</li>
 *   <li>{@link spemarti.VersionedExtent#getBaseVersion <em>Base Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getVersionedExtent()
 * @model
 * @generated
 */
public interface VersionedExtent extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isCheckedOut, type = Boolean, isReadOnly = true
	 * • A VersionedExtent is modifiable only if isCheckedOut is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Checked Out</em>' attribute.
	 * @see spemarti.SpemartiPackage#getVersionedExtent_IsCheckedOut()
	 * @model required="true" changeable="false" ordered="false"
	 * @generated
	 */
	boolean isIsCheckedOut();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * annotation, type = String, [0..1]
	 * • When isCheckedOut is true, this attribute contains the annotation attribute for the version that will be created when
	 * this VersionedExtent is checked in. If the isCheckedOut is false that attribute does not exist and cannot be written
	 * to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation</em>' attribute.
	 * @see #setAnnotation(String)
	 * @see spemarti.SpemartiPackage#getVersionedExtent_Annotation()
	 * @model ordered="false"
	 * @generated
	 */
	String getAnnotation();

	/**
	 * Sets the value of the '{@link spemarti.VersionedExtent#getAnnotation <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' attribute.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(String value);

	/**
	 * Returns the value of the '<em><b>Versionhistory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * versionHistory, type = VersionHistory, isReadOnly = true
	 * • The VersionHistory that contains the versions for this VersionedExtent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versionhistory</em>' reference.
	 * @see #setVersionhistory(VersionHistory)
	 * @see spemarti.SpemartiPackage#getVersionedExtent_Versionhistory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VersionHistory getVersionhistory();

	/**
	 * Sets the value of the '{@link spemarti.VersionedExtent#getVersionhistory <em>Versionhistory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versionhistory</em>' reference.
	 * @see #getVersionhistory()
	 * @generated
	 */
	void setVersionhistory(VersionHistory value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link spemarti.Configuration#getVersionedExtent <em>Versioned Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * configuration, type = Configuration, isReadOnly = true
	 * • The Configuration to which this VersionedExtent belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(Configuration)
	 * @see spemarti.SpemartiPackage#getVersionedExtent_Configuration()
	 * @see spemarti.Configuration#getVersionedExtent
	 * @model opposite="versionedExtent" required="true" ordered="false"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link spemarti.VersionedExtent#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Previous Version</b></em>' reference list.
	 * The list contents are of type {@link spemarti.Version}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * previousVersion, type = Version, [1..*], isReadOnly = false
	 * • When isCheckedOut is true, this reference identifies the versions that will be the previousVersion for the version
	 * that will be created when this VersionedExtent is checked in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Previous Version</em>' reference list.
	 * @see spemarti.SpemartiPackage#getVersionedExtent_PreviousVersion()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Version> getPreviousVersion();

	/**
	 * Returns the value of the '<em><b>Base Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * baseVersion, type = Version, isReadOnly = true
	 * • The currently selected version for this VersionedExtent. This is the version that this VersionedExtent is currently
	 * based on, but when checked-out, is not necessarily equal to. In particular, the base version of a checked-out
	 * VersionedExtent is the Version content that was started with (i.e., that the current checked-out content is ‘based
	 * on’).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Version</em>' reference.
	 * @see #setBaseVersion(Version)
	 * @see spemarti.SpemartiPackage#getVersionedExtent_BaseVersion()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Version getBaseVersion();

	/**
	 * Sets the value of the '{@link spemarti.VersionedExtent#getBaseVersion <em>Base Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Version</em>' reference.
	 * @see #getBaseVersion()
	 * @generated
	 */
	void setBaseVersion(Version value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * checkOut () operation, return type = null, isQuery = false
	 * • Allows modifications to be performed on the content of this VersionedExtent.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void checkOut();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * checkIn (), return type = Version, isQuery = false
	 * • Creates a new Version object with the current content of this VersionedExtent, disallows modifications to be made
	 * to the content of this VersionedExtent until it is subsequently checked out. This Version is now available to other
	 * Workspaces.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Version checkIn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unCheckOut();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * lookupByVersionId (id : String), return type = Version, [0..1] isQuery = true
	 * • Returns the version, if any, of this VersionedExtent having the specified id.
	 * <!-- end-model-doc -->
	 * @model ordered="false" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	Version lookupByVersionId(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * lookupByLabel (label : String), return type = Version, [0..1], isQuery = true
	 * • Returns the version, if any, of this VersionedExtent having the specified label.
	 * <!-- end-model-doc -->
	 * @model ordered="false" labelRequired="true" labelOrdered="false"
	 * @generated
	 */
	Version lookupByLabel(String label);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * lookupByLabel (label : String), return type = Version, [0..1], isQuery = true
	 * • Returns the version, if any, of this VersionedExtent having the specified label.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void delete();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VersionedExtent createExtent();

} // VersionedExtent
