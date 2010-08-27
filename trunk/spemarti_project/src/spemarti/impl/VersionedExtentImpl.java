/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import spemarti.Configuration;
import spemarti.SpemartiPackage;
import spemarti.Version;
import spemarti.VersionHistory;
import spemarti.VersionedExtent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Versioned Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spemarti.impl.VersionedExtentImpl#isIsCheckedOut <em>Is Checked Out</em>}</li>
 *   <li>{@link spemarti.impl.VersionedExtentImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link spemarti.impl.VersionedExtentImpl#getVersionhistory <em>Versionhistory</em>}</li>
 *   <li>{@link spemarti.impl.VersionedExtentImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link spemarti.impl.VersionedExtentImpl#getConflict <em>Conflict</em>}</li>
 *   <li>{@link spemarti.impl.VersionedExtentImpl#getPreviousVersion <em>Previous Version</em>}</li>
 *   <li>{@link spemarti.impl.VersionedExtentImpl#getBaseVersion <em>Base Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionedExtentImpl extends EObjectImpl implements VersionedExtent {
	/**
	 * The default value of the '{@link #isIsCheckedOut() <em>Is Checked Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCheckedOut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CHECKED_OUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCheckedOut() <em>Is Checked Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCheckedOut()
	 * @generated
	 * @ordered
	 */
	protected boolean isCheckedOut = IS_CHECKED_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnnotation() <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected String annotation = ANNOTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVersionhistory() <em>Versionhistory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionhistory()
	 * @generated
	 * @ordered
	 */
	protected VersionHistory versionhistory;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Configuration configuration;

	/**
	 * The cached value of the '{@link #getConflict() <em>Conflict</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflict()
	 * @generated
	 * @ordered
	 */
	protected EList<Version> conflict;

	/**
	 * The cached value of the '{@link #getPreviousVersion() <em>Previous Version</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<Version> previousVersion;

	/**
	 * The cached value of the '{@link #getBaseVersion() <em>Base Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseVersion()
	 * @generated
	 * @ordered
	 */
	protected Version baseVersion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionedExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemartiPackage.Literals.VERSIONED_EXTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCheckedOut() {
		return isCheckedOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(String newAnnotation) {
		String oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemartiPackage.VERSIONED_EXTENT__ANNOTATION, oldAnnotation, annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionHistory getVersionhistory() {
		if (versionhistory != null && versionhistory.eIsProxy()) {
			InternalEObject oldVersionhistory = (InternalEObject)versionhistory;
			versionhistory = (VersionHistory)eResolveProxy(oldVersionhistory);
			if (versionhistory != oldVersionhistory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemartiPackage.VERSIONED_EXTENT__VERSIONHISTORY, oldVersionhistory, versionhistory));
			}
		}
		return versionhistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionHistory basicGetVersionhistory() {
		return versionhistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionhistory(VersionHistory newVersionhistory) {
		VersionHistory oldVersionhistory = versionhistory;
		versionhistory = newVersionhistory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemartiPackage.VERSIONED_EXTENT__VERSIONHISTORY, oldVersionhistory, versionhistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfiguration() {
		if (configuration != null && configuration.eIsProxy()) {
			InternalEObject oldConfiguration = (InternalEObject)configuration;
			configuration = (Configuration)eResolveProxy(oldConfiguration);
			if (configuration != oldConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemartiPackage.VERSIONED_EXTENT__CONFIGURATION, oldConfiguration, configuration));
			}
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(Configuration newConfiguration, NotificationChain msgs) {
		Configuration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpemartiPackage.VERSIONED_EXTENT__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(Configuration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, SpemartiPackage.CONFIGURATION__VERSIONED_EXTENT, Configuration.class, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, SpemartiPackage.CONFIGURATION__VERSIONED_EXTENT, Configuration.class, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemartiPackage.VERSIONED_EXTENT__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Version> getConflict() {
		if (conflict == null) {
			conflict = new EObjectResolvingEList<Version>(Version.class, this, SpemartiPackage.VERSIONED_EXTENT__CONFLICT);
		}
		return conflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Version> getPreviousVersion() {
		if (previousVersion == null) {
			previousVersion = new EObjectResolvingEList<Version>(Version.class, this, SpemartiPackage.VERSIONED_EXTENT__PREVIOUS_VERSION);
		}
		return previousVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getBaseVersion() {
		if (baseVersion != null && baseVersion.eIsProxy()) {
			InternalEObject oldBaseVersion = (InternalEObject)baseVersion;
			baseVersion = (Version)eResolveProxy(oldBaseVersion);
			if (baseVersion != oldBaseVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemartiPackage.VERSIONED_EXTENT__BASE_VERSION, oldBaseVersion, baseVersion));
			}
		}
		return baseVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetBaseVersion() {
		return baseVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseVersion(Version newBaseVersion) {
		Version oldBaseVersion = baseVersion;
		baseVersion = newBaseVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemartiPackage.VERSIONED_EXTENT__BASE_VERSION, oldBaseVersion, baseVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkOut() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version checkIn() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unCheckOut() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version lookupByVersionId(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version lookupByLabel(String label) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedExtent createExtent() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemartiPackage.VERSIONED_EXTENT__CONFIGURATION:
				if (configuration != null)
					msgs = ((InternalEObject)configuration).eInverseRemove(this, SpemartiPackage.CONFIGURATION__VERSIONED_EXTENT, Configuration.class, msgs);
				return basicSetConfiguration((Configuration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemartiPackage.VERSIONED_EXTENT__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemartiPackage.VERSIONED_EXTENT__IS_CHECKED_OUT:
				return isIsCheckedOut();
			case SpemartiPackage.VERSIONED_EXTENT__ANNOTATION:
				return getAnnotation();
			case SpemartiPackage.VERSIONED_EXTENT__VERSIONHISTORY:
				if (resolve) return getVersionhistory();
				return basicGetVersionhistory();
			case SpemartiPackage.VERSIONED_EXTENT__CONFIGURATION:
				if (resolve) return getConfiguration();
				return basicGetConfiguration();
			case SpemartiPackage.VERSIONED_EXTENT__CONFLICT:
				return getConflict();
			case SpemartiPackage.VERSIONED_EXTENT__PREVIOUS_VERSION:
				return getPreviousVersion();
			case SpemartiPackage.VERSIONED_EXTENT__BASE_VERSION:
				if (resolve) return getBaseVersion();
				return basicGetBaseVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpemartiPackage.VERSIONED_EXTENT__ANNOTATION:
				setAnnotation((String)newValue);
				return;
			case SpemartiPackage.VERSIONED_EXTENT__VERSIONHISTORY:
				setVersionhistory((VersionHistory)newValue);
				return;
			case SpemartiPackage.VERSIONED_EXTENT__CONFIGURATION:
				setConfiguration((Configuration)newValue);
				return;
			case SpemartiPackage.VERSIONED_EXTENT__CONFLICT:
				getConflict().clear();
				getConflict().addAll((Collection<? extends Version>)newValue);
				return;
			case SpemartiPackage.VERSIONED_EXTENT__PREVIOUS_VERSION:
				getPreviousVersion().clear();
				getPreviousVersion().addAll((Collection<? extends Version>)newValue);
				return;
			case SpemartiPackage.VERSIONED_EXTENT__BASE_VERSION:
				setBaseVersion((Version)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpemartiPackage.VERSIONED_EXTENT__ANNOTATION:
				setAnnotation(ANNOTATION_EDEFAULT);
				return;
			case SpemartiPackage.VERSIONED_EXTENT__VERSIONHISTORY:
				setVersionhistory((VersionHistory)null);
				return;
			case SpemartiPackage.VERSIONED_EXTENT__CONFIGURATION:
				setConfiguration((Configuration)null);
				return;
			case SpemartiPackage.VERSIONED_EXTENT__CONFLICT:
				getConflict().clear();
				return;
			case SpemartiPackage.VERSIONED_EXTENT__PREVIOUS_VERSION:
				getPreviousVersion().clear();
				return;
			case SpemartiPackage.VERSIONED_EXTENT__BASE_VERSION:
				setBaseVersion((Version)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpemartiPackage.VERSIONED_EXTENT__IS_CHECKED_OUT:
				return isCheckedOut != IS_CHECKED_OUT_EDEFAULT;
			case SpemartiPackage.VERSIONED_EXTENT__ANNOTATION:
				return ANNOTATION_EDEFAULT == null ? annotation != null : !ANNOTATION_EDEFAULT.equals(annotation);
			case SpemartiPackage.VERSIONED_EXTENT__VERSIONHISTORY:
				return versionhistory != null;
			case SpemartiPackage.VERSIONED_EXTENT__CONFIGURATION:
				return configuration != null;
			case SpemartiPackage.VERSIONED_EXTENT__CONFLICT:
				return conflict != null && !conflict.isEmpty();
			case SpemartiPackage.VERSIONED_EXTENT__PREVIOUS_VERSION:
				return previousVersion != null && !previousVersion.isEmpty();
			case SpemartiPackage.VERSIONED_EXTENT__BASE_VERSION:
				return baseVersion != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isCheckedOut: ");
		result.append(isCheckedOut);
		result.append(", annotation: ");
		result.append(annotation);
		result.append(')');
		return result.toString();
	}

} //VersionedExtentImpl
