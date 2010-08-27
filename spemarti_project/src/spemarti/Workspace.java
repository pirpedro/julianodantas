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
 * A representation of the model object '<em><b>Workspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This selects a set of versions that are accessed together for a Session or Sessions. Unlike Session this is a persistent
 * object.
 * A Workspace selects versions via VersionedExtent objects.
 * 
 * An important constraint is that a Workspace may contain at most one VersionedExtent for a given VersionHistory and at
 * most one Configuration for a given BaselineHistory.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.Workspace#getId <em>Id</em>}</li>
 *   <li>{@link spemarti.Workspace#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link spemarti.Workspace#getVersionedExtent <em>Versioned Extent</em>}</li>
 *   <li>{@link spemarti.Workspace#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getWorkspace()
 * @model
 * @generated
 */
public interface Workspace extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see spemarti.SpemartiPackage#getWorkspace_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link spemarti.Workspace#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' attribute.
	 * @see #setAnnotation(String)
	 * @see spemarti.SpemartiPackage#getWorkspace_Annotation()
	 * @model ordered="false"
	 * @generated
	 */
	String getAnnotation();

	/**
	 * Sets the value of the '{@link spemarti.Workspace#getAnnotation <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' attribute.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(String value);

	/**
	 * Returns the value of the '<em><b>Versioned Extent</b></em>' containment reference list.
	 * The list contents are of type {@link spemarti.VersionedExtent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * versionedExtent, type = VersionedExtent, [0..*], isReadOnly = true
	 * • This refers to all VersionedExtents in this Workspace (inclusive of checked out extents).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versioned Extent</em>' containment reference list.
	 * @see spemarti.SpemartiPackage#getWorkspace_VersionedExtent()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VersionedExtent> getVersionedExtent();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link spemarti.Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * configuration, type = Configuration, [0..*], isReadOnly = true
	 * • This refers to all Configurations in this Workspace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see spemarti.SpemartiPackage#getWorkspace_Configuration()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Configuration> getConfiguration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * copy (workspace : Workspace), return type = Workspace, isQuery = false
	 * • Returns a new workspace that selects the same configuration of Versions and Baselines as the specified workspace.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" workspaceRequired="true" workspaceOrdered="false"
	 * @generated
	 */
	Workspace copy(Workspace workspace);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * restore (version: Version), return type = VersionedExtent, isQuery = false
	 * • Create a new VersionedExtent in this Workspace for the specified Version, or if the Version is a Baseline, a new
	 * Configuration in this Workspace for the specified Baseline. This Workspace must not already select a Version for
	 * the VersionHistory of the specified Version.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" versionRequired="true" versionOrdered="false"
	 * @generated
	 */
	VersionedExtent restore(Version version);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * update (version : Version), return type = null, isQuery = false
	 * • Updates the VersionedExtent in this Workspace for the VersionHistory of this Version to select the specified
	 * Version, or if the Version is a Baseline, updates the Configuration in this Workspace for the BaselineHistory of
	 * this Baseline to select the specified Baseline (which then updates the Workspace with each of the versions in that
	 * Baseline).
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" versionRequired="true" versionOrdered="false"
	 * @generated
	 */
	Version update(Version version);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * merge (version : Version), return type = null, isQuery = false
	 * • If the Version is not a Baseline, this merges the specified Version into the VersionedExtent in this Workspace for
	 * the VersionHistory of this Version. If the version is a predecessor or equal to the baseVersion of the
	 * VersionedExtent, the VersionedExtent is left unmodified. If the version is a successor of the baseVersion of the
	 * VersionedExtent, the VersionedExtent is updated to select the version. If the version is not a predecessor of, equal
	 * to, or a successor of the baseVersion of the VersionedExtent, the specified version is added to the conflict attribute
	 * of the VersionedExtent.
	 * • If the Version is a Baseline, this merges the specified Baseline into the Configuration in this Workspace for the
	 * BaselineHistory of this Baseline. If the Baseline is a predecessor or equal to the +baseline of the Configuration, the
	 * Configuration is left unmodified. If the Baseline is a successor of the +baseline of the Configuration, the
	 * Configuration is updated to select the Baseline. If the Baseline is not a predecessor of, equal to, or a successor of
	 * the +baseline of the Configuration, the specified Baseline is added to the previousBaseline property of the
	 * Configuration, and each of the versions of the specified Baseline are merged into the Workspace.
	 * <!-- end-model-doc -->
	 * @model versionRequired="true" versionOrdered="false"
	 * @generated
	 */
	void merge(Version version);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * lookupByVersionHistory (versionHistory : VersionHistory), return type = VersionedExtent, [0..1] isQuery = true
	 * • Returns the VersionedExtent, if any, in this Workspace for the specified versionHistory.
	 * <!-- end-model-doc -->
	 * @model ordered="false" versionHistoryRequired="true" versionHistoryOrdered="false"
	 * @generated
	 */
	VersionedExtent lookupByVersionHistory(VersionHistory versionHistory);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * getVersionSet (), return type = VersionedExtent, [0..*] isQuery = true
	 * • Returns the VersionedExtents, inclusive of those that are checked out, that are being referenced by this Workspace.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<VersionedExtent> getVersionSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * getCheckedOutVersionSet (), return type = VersionedExtent, [0..1] isQuery = true
	 * • Returns only the VersionExtents referenced by this Workspace that have a status of checked out.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<VersionedExtent> getCheckedOutVersionSet();

} // Workspace
