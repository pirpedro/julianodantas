/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spemarti.Baseline;
import spemarti.Configuration;
import spemarti.SpemartiPackage;
import spemarti.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Baseline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spemarti.impl.BaselineImpl#getMemberof <em>Memberof</em>}</li>
 *   <li>{@link spemarti.impl.BaselineImpl#getMember <em>Member</em>}</li>
 *   <li>{@link spemarti.impl.BaselineImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link spemarti.impl.BaselineImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaselineImpl extends VersionImpl implements Baseline {
	/**
	 * The cached value of the '{@link #getMemberof() <em>Memberof</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberof()
	 * @generated
	 * @ordered
	 */
	protected EList<Baseline> memberof;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Baseline> member;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> configuration;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<Version> version;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaselineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemartiPackage.Literals.BASELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Baseline> getMemberof() {
		if (memberof == null) {
			memberof = new EObjectWithInverseResolvingEList.ManyInverse<Baseline>(Baseline.class, this, SpemartiPackage.BASELINE__MEMBEROF, SpemartiPackage.BASELINE__MEMBER);
		}
		return memberof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Baseline> getMember() {
		if (member == null) {
			member = new EObjectWithInverseResolvingEList.ManyInverse<Baseline>(Baseline.class, this, SpemartiPackage.BASELINE__MEMBER, SpemartiPackage.BASELINE__MEMBEROF);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configuration> getConfiguration() {
		if (configuration == null) {
			configuration = new EObjectWithInverseResolvingEList<Configuration>(Configuration.class, this, SpemartiPackage.BASELINE__CONFIGURATION, SpemartiPackage.CONFIGURATION__BASELINE);
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Version> getVersion() {
		if (version == null) {
			version = new EObjectWithInverseResolvingEList.ManyInverse<Version>(Version.class, this, SpemartiPackage.BASELINE__VERSION, SpemartiPackage.VERSION__BASELINE);
		}
		return version;
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
			case SpemartiPackage.BASELINE__MEMBEROF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemberof()).basicAdd(otherEnd, msgs);
			case SpemartiPackage.BASELINE__MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMember()).basicAdd(otherEnd, msgs);
			case SpemartiPackage.BASELINE__CONFIGURATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConfiguration()).basicAdd(otherEnd, msgs);
			case SpemartiPackage.BASELINE__VERSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVersion()).basicAdd(otherEnd, msgs);
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
			case SpemartiPackage.BASELINE__MEMBEROF:
				return ((InternalEList<?>)getMemberof()).basicRemove(otherEnd, msgs);
			case SpemartiPackage.BASELINE__MEMBER:
				return ((InternalEList<?>)getMember()).basicRemove(otherEnd, msgs);
			case SpemartiPackage.BASELINE__CONFIGURATION:
				return ((InternalEList<?>)getConfiguration()).basicRemove(otherEnd, msgs);
			case SpemartiPackage.BASELINE__VERSION:
				return ((InternalEList<?>)getVersion()).basicRemove(otherEnd, msgs);
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
			case SpemartiPackage.BASELINE__MEMBEROF:
				return getMemberof();
			case SpemartiPackage.BASELINE__MEMBER:
				return getMember();
			case SpemartiPackage.BASELINE__CONFIGURATION:
				return getConfiguration();
			case SpemartiPackage.BASELINE__VERSION:
				return getVersion();
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
			case SpemartiPackage.BASELINE__CONFIGURATION:
				getConfiguration().clear();
				getConfiguration().addAll((Collection<? extends Configuration>)newValue);
				return;
			case SpemartiPackage.BASELINE__VERSION:
				getVersion().clear();
				getVersion().addAll((Collection<? extends Version>)newValue);
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
			case SpemartiPackage.BASELINE__CONFIGURATION:
				getConfiguration().clear();
				return;
			case SpemartiPackage.BASELINE__VERSION:
				getVersion().clear();
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
			case SpemartiPackage.BASELINE__MEMBEROF:
				return memberof != null && !memberof.isEmpty();
			case SpemartiPackage.BASELINE__MEMBER:
				return member != null && !member.isEmpty();
			case SpemartiPackage.BASELINE__CONFIGURATION:
				return configuration != null && !configuration.isEmpty();
			case SpemartiPackage.BASELINE__VERSION:
				return version != null && !version.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BaselineImpl
