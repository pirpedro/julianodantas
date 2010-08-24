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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spemarti.Baseline;
import spemarti.Label;
import spemarti.SpemartiPackage;
import spemarti.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spemarti.impl.VersionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link spemarti.impl.VersionImpl#getId <em>Id</em>}</li>
 *   <li>{@link spemarti.impl.VersionImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link spemarti.impl.VersionImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link spemarti.impl.VersionImpl#getPreviousVersion <em>Previous Version</em>}</li>
 *   <li>{@link spemarti.impl.VersionImpl#getNextVersion <em>Next Version</em>}</li>
 *   <li>{@link spemarti.impl.VersionImpl#getBaseline <em>Baseline</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionImpl extends EObjectImpl implements Version {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<String> label;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected String creationDate = CREATION_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getPreviousVersion() <em>Previous Version</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<Version> previousVersion;

	/**
	 * The cached value of the '{@link #getNextVersion() <em>Next Version</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<Version> nextVersion;

	/**
	 * The cached value of the '{@link #getBaseline() <em>Baseline</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseline()
	 * @generated
	 * @ordered
	 */
	protected EList<Baseline> baseline;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemartiPackage.Literals.VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLabel() {
		if (label == null) {
			label = new EDataTypeUniqueEList<String>(String.class, this, SpemartiPackage.VERSION__LABEL);
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(String newCreationDate) {
		String oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemartiPackage.VERSION__CREATION_DATE, oldCreationDate, creationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemartiPackage.VERSION__ANNOTATION, oldAnnotation, annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Version> getPreviousVersion() {
		if (previousVersion == null) {
			previousVersion = new EObjectWithInverseResolvingEList.ManyInverse<Version>(Version.class, this, SpemartiPackage.VERSION__PREVIOUS_VERSION, SpemartiPackage.VERSION__NEXT_VERSION);
		}
		return previousVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Version> getNextVersion() {
		if (nextVersion == null) {
			nextVersion = new EObjectWithInverseResolvingEList.ManyInverse<Version>(Version.class, this, SpemartiPackage.VERSION__NEXT_VERSION, SpemartiPackage.VERSION__PREVIOUS_VERSION);
		}
		return nextVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Baseline> getBaseline() {
		if (baseline == null) {
			baseline = new EObjectWithInverseResolvingEList.ManyInverse<Baseline>(Baseline.class, this, SpemartiPackage.VERSION__BASELINE, SpemartiPackage.BASELINE__VERSION);
		}
		return baseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addLabel(String label) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeLabel(Label label) {
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemartiPackage.VERSION__PREVIOUS_VERSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPreviousVersion()).basicAdd(otherEnd, msgs);
			case SpemartiPackage.VERSION__NEXT_VERSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNextVersion()).basicAdd(otherEnd, msgs);
			case SpemartiPackage.VERSION__BASELINE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBaseline()).basicAdd(otherEnd, msgs);
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
			case SpemartiPackage.VERSION__PREVIOUS_VERSION:
				return ((InternalEList<?>)getPreviousVersion()).basicRemove(otherEnd, msgs);
			case SpemartiPackage.VERSION__NEXT_VERSION:
				return ((InternalEList<?>)getNextVersion()).basicRemove(otherEnd, msgs);
			case SpemartiPackage.VERSION__BASELINE:
				return ((InternalEList<?>)getBaseline()).basicRemove(otherEnd, msgs);
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
			case SpemartiPackage.VERSION__LABEL:
				return getLabel();
			case SpemartiPackage.VERSION__ID:
				return getId();
			case SpemartiPackage.VERSION__CREATION_DATE:
				return getCreationDate();
			case SpemartiPackage.VERSION__ANNOTATION:
				return getAnnotation();
			case SpemartiPackage.VERSION__PREVIOUS_VERSION:
				return getPreviousVersion();
			case SpemartiPackage.VERSION__NEXT_VERSION:
				return getNextVersion();
			case SpemartiPackage.VERSION__BASELINE:
				return getBaseline();
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
			case SpemartiPackage.VERSION__CREATION_DATE:
				setCreationDate((String)newValue);
				return;
			case SpemartiPackage.VERSION__ANNOTATION:
				setAnnotation((String)newValue);
				return;
			case SpemartiPackage.VERSION__PREVIOUS_VERSION:
				getPreviousVersion().clear();
				getPreviousVersion().addAll((Collection<? extends Version>)newValue);
				return;
			case SpemartiPackage.VERSION__NEXT_VERSION:
				getNextVersion().clear();
				getNextVersion().addAll((Collection<? extends Version>)newValue);
				return;
			case SpemartiPackage.VERSION__BASELINE:
				getBaseline().clear();
				getBaseline().addAll((Collection<? extends Baseline>)newValue);
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
			case SpemartiPackage.VERSION__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case SpemartiPackage.VERSION__ANNOTATION:
				setAnnotation(ANNOTATION_EDEFAULT);
				return;
			case SpemartiPackage.VERSION__PREVIOUS_VERSION:
				getPreviousVersion().clear();
				return;
			case SpemartiPackage.VERSION__NEXT_VERSION:
				getNextVersion().clear();
				return;
			case SpemartiPackage.VERSION__BASELINE:
				getBaseline().clear();
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
			case SpemartiPackage.VERSION__LABEL:
				return label != null && !label.isEmpty();
			case SpemartiPackage.VERSION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SpemartiPackage.VERSION__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case SpemartiPackage.VERSION__ANNOTATION:
				return ANNOTATION_EDEFAULT == null ? annotation != null : !ANNOTATION_EDEFAULT.equals(annotation);
			case SpemartiPackage.VERSION__PREVIOUS_VERSION:
				return previousVersion != null && !previousVersion.isEmpty();
			case SpemartiPackage.VERSION__NEXT_VERSION:
				return nextVersion != null && !nextVersion.isEmpty();
			case SpemartiPackage.VERSION__BASELINE:
				return baseline != null && !baseline.isEmpty();
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
		result.append(" (label: ");
		result.append(label);
		result.append(", id: ");
		result.append(id);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", annotation: ");
		result.append(annotation);
		result.append(')');
		return result.toString();
	}

} //VersionImpl
