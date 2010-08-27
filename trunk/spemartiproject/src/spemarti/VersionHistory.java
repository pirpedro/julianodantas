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
 * A representation of the model object '<em><b>Version History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A VersionHistory contains all versions of a given VersionedExtent.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.VersionHistory#getVersions <em>Versions</em>}</li>
 *   <li>{@link spemarti.VersionHistory#getRootVersion <em>Root Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getVersionHistory()
 * @model
 * @generated
 */
public interface VersionHistory extends EObject {
	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link spemarti.Version}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * versions, type = Version, [1..*], isReadOnly = true
	 * • This refers to all versions in this VersionHistory, including the rootVersion. Ordering of the versions is defined by
	 * the previousVersion/nextVersion relations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see spemarti.SpemartiPackage#getVersionHistory_Versions()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Version> getVersions();

	/**
	 * Returns the value of the '<em><b>Root Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * rootVersion, type = Version, isReadOnly = true
	 * • This refers to the initial version of the VersionedExtent. The rootVersion has no previousVersion. All other
	 * versions have at least one previousVersion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Version</em>' reference.
	 * @see #setRootVersion(Version)
	 * @see spemarti.SpemartiPackage#getVersionHistory_RootVersion()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Version getRootVersion();

	/**
	 * Sets the value of the '{@link spemarti.VersionHistory#getRootVersion <em>Root Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Version</em>' reference.
	 * @see #getRootVersion()
	 * @generated
	 */
	void setRootVersion(Version value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * delete (), return type = void
	 * • Removes the VersionHistory object. This method also deletes all Versions in the VersionHistory.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void delete();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * lookupByLabel (label : Label), return type = Version, [0..1], isQuery = true
	 * • Returns the version, if any, in this VersionedHistory having the specified label.
	 * <!-- end-model-doc -->
	 * @model ordered="false" labelRequired="true" labelOrdered="false"
	 * @generated
	 */
	Version lookupByLabel(String label);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * lookupByVersionId (id : String), return type = Version, [0..1], isQuery = true
	 * • Returns the Version, if any, in this VersionHistory having the specified id.
	 * <!-- end-model-doc -->
	 * @model ordered="false" idRequired="true" idOrdered="false"
	 * @generated
	 */
	Version lookupByVersionId(String id);

} // VersionHistory
