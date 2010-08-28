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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spemarti.Baseline;
import spemarti.BaselineHistory;
import spemarti.Configuration;
import spemarti.SpemartiPackage;
import spemarti.VersionedExtent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spemarti.impl.ConfigurationImpl#getId <em>Id</em>}</li>
 *   <li>{@link spemarti.impl.ConfigurationImpl#getMemberof <em>Memberof</em>}</li>
 *   <li>{@link spemarti.impl.ConfigurationImpl#getMember <em>Member</em>}</li>
 *   <li>{@link spemarti.impl.ConfigurationImpl#getVersionedExtent <em>Versioned Extent</em>}</li>
 *   <li>{@link spemarti.impl.ConfigurationImpl#getPreviousBaseline <em>Previous Baseline</em>}</li>
 *   <li>{@link spemarti.impl.ConfigurationImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link spemarti.impl.ConfigurationImpl#getBaseline <em>Baseline</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationImpl extends EObjectImpl implements Configuration {
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
	 * The cached value of the '{@link #getMemberof() <em>Memberof</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberof()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> memberof;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> member;

	/**
	 * The cached value of the '{@link #getVersionedExtent() <em>Versioned Extent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionedExtent()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionedExtent> versionedExtent;

	/**
	 * The cached value of the '{@link #getPreviousBaseline() <em>Previous Baseline</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousBaseline()
	 * @generated
	 * @ordered
	 */
	protected EList<Baseline> previousBaseline;

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
	 * The cached value of the '{@link #getBaseline() <em>Baseline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseline()
	 * @generated
	 * @ordered
	 */
	protected Baseline baseline;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemartiPackage.Literals.CONFIGURATION;
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
	public EList<Configuration> getMemberof() {
		if (memberof == null) {
			memberof = new EObjectWithInverseResolvingEList.ManyInverse<Configuration>(Configuration.class, this, SpemartiPackage.CONFIGURATION__MEMBEROF, SpemartiPackage.CONFIGURATION__MEMBER);
		}
		return memberof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configuration> getMember() {
		if (member == null) {
			member = new EObjectWithInverseResolvingEList.ManyInverse<Configuration>(Configuration.class, this, SpemartiPackage.CONFIGURATION__MEMBER, SpemartiPackage.CONFIGURATION__MEMBEROF);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VersionedExtent> getVersionedExtent() {
		if (versionedExtent == null) {
			versionedExtent = new EObjectWithInverseResolvingEList<VersionedExtent>(VersionedExtent.class, this, SpemartiPackage.CONFIGURATION__VERSIONED_EXTENT, SpemartiPackage.VERSIONED_EXTENT__CONFIGURATION);
		}
		return versionedExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Baseline> getPreviousBaseline() {
		if (previousBaseline == null) {
			previousBaseline = new EObjectResolvingEList<Baseline>(Baseline.class, this, SpemartiPackage.CONFIGURATION__PREVIOUS_BASELINE);
		}
		return previousBaseline;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemartiPackage.CONFIGURATION__ANNOTATION, oldAnnotation, annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Baseline getBaseline() {
		if (baseline != null && baseline.eIsProxy()) {
			InternalEObject oldBaseline = (InternalEObject)baseline;
			baseline = (Baseline)eResolveProxy(oldBaseline);
			if (baseline != oldBaseline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemartiPackage.CONFIGURATION__BASELINE, oldBaseline, baseline));
			}
		}
		return baseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Baseline basicGetBaseline() {
		return baseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseline(Baseline newBaseline, NotificationChain msgs) {
		Baseline oldBaseline = baseline;
		baseline = newBaseline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpemartiPackage.CONFIGURATION__BASELINE, oldBaseline, newBaseline);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseline(Baseline newBaseline) {
		if (newBaseline != baseline) {
			NotificationChain msgs = null;
			if (baseline != null)
				msgs = ((InternalEObject)baseline).eInverseRemove(this, SpemartiPackage.BASELINE__CONFIGURATION, Baseline.class, msgs);
			if (newBaseline != null)
				msgs = ((InternalEObject)newBaseline).eInverseAdd(this, SpemartiPackage.BASELINE__CONFIGURATION, Baseline.class, msgs);
			msgs = basicSetBaseline(newBaseline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemartiPackage.CONFIGURATION__BASELINE, newBaseline, newBaseline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makeBaseline() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaselineHistory getBaselineHistory() {
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
			case SpemartiPackage.CONFIGURATION__MEMBEROF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemberof()).basicAdd(otherEnd, msgs);
			case SpemartiPackage.CONFIGURATION__MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMember()).basicAdd(otherEnd, msgs);
			case SpemartiPackage.CONFIGURATION__VERSIONED_EXTENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVersionedExtent()).basicAdd(otherEnd, msgs);
			case SpemartiPackage.CONFIGURATION__BASELINE:
				if (baseline != null)
					msgs = ((InternalEObject)baseline).eInverseRemove(this, SpemartiPackage.BASELINE__CONFIGURATION, Baseline.class, msgs);
				return basicSetBaseline((Baseline)otherEnd, msgs);
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
			case SpemartiPackage.CONFIGURATION__MEMBEROF:
				return ((InternalEList<?>)getMemberof()).basicRemove(otherEnd, msgs);
			case SpemartiPackage.CONFIGURATION__MEMBER:
				return ((InternalEList<?>)getMember()).basicRemove(otherEnd, msgs);
			case SpemartiPackage.CONFIGURATION__VERSIONED_EXTENT:
				return ((InternalEList<?>)getVersionedExtent()).basicRemove(otherEnd, msgs);
			case SpemartiPackage.CONFIGURATION__BASELINE:
				return basicSetBaseline(null, msgs);
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
			case SpemartiPackage.CONFIGURATION__ID:
				return getId();
			case SpemartiPackage.CONFIGURATION__MEMBEROF:
				return getMemberof();
			case SpemartiPackage.CONFIGURATION__MEMBER:
				return getMember();
			case SpemartiPackage.CONFIGURATION__VERSIONED_EXTENT:
				return getVersionedExtent();
			case SpemartiPackage.CONFIGURATION__PREVIOUS_BASELINE:
				return getPreviousBaseline();
			case SpemartiPackage.CONFIGURATION__ANNOTATION:
				return getAnnotation();
			case SpemartiPackage.CONFIGURATION__BASELINE:
				if (resolve) return getBaseline();
				return basicGetBaseline();
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
			case SpemartiPackage.CONFIGURATION__MEMBEROF:
				getMemberof().clear();
				getMemberof().addAll((Collection<? extends Configuration>)newValue);
				return;
			case SpemartiPackage.CONFIGURATION__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends Configuration>)newValue);
				return;
			case SpemartiPackage.CONFIGURATION__VERSIONED_EXTENT:
				getVersionedExtent().clear();
				getVersionedExtent().addAll((Collection<? extends VersionedExtent>)newValue);
				return;
			case SpemartiPackage.CONFIGURATION__PREVIOUS_BASELINE:
				getPreviousBaseline().clear();
				getPreviousBaseline().addAll((Collection<? extends Baseline>)newValue);
				return;
			case SpemartiPackage.CONFIGURATION__ANNOTATION:
				setAnnotation((String)newValue);
				return;
			case SpemartiPackage.CONFIGURATION__BASELINE:
				setBaseline((Baseline)newValue);
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
			case SpemartiPackage.CONFIGURATION__MEMBEROF:
				getMemberof().clear();
				return;
			case SpemartiPackage.CONFIGURATION__MEMBER:
				getMember().clear();
				return;
			case SpemartiPackage.CONFIGURATION__VERSIONED_EXTENT:
				getVersionedExtent().clear();
				return;
			case SpemartiPackage.CONFIGURATION__PREVIOUS_BASELINE:
				getPreviousBaseline().clear();
				return;
			case SpemartiPackage.CONFIGURATION__ANNOTATION:
				setAnnotation(ANNOTATION_EDEFAULT);
				return;
			case SpemartiPackage.CONFIGURATION__BASELINE:
				setBaseline((Baseline)null);
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
			case SpemartiPackage.CONFIGURATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SpemartiPackage.CONFIGURATION__MEMBEROF:
				return memberof != null && !memberof.isEmpty();
			case SpemartiPackage.CONFIGURATION__MEMBER:
				return member != null && !member.isEmpty();
			case SpemartiPackage.CONFIGURATION__VERSIONED_EXTENT:
				return versionedExtent != null && !versionedExtent.isEmpty();
			case SpemartiPackage.CONFIGURATION__PREVIOUS_BASELINE:
				return previousBaseline != null && !previousBaseline.isEmpty();
			case SpemartiPackage.CONFIGURATION__ANNOTATION:
				return ANNOTATION_EDEFAULT == null ? annotation != null : !ANNOTATION_EDEFAULT.equals(annotation);
			case SpemartiPackage.CONFIGURATION__BASELINE:
				return baseline != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", annotation: ");
		result.append(annotation);
		result.append(')');
		return result.toString();
	}

} //ConfigurationImpl
