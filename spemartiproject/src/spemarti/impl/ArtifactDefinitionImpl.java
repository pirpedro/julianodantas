/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spemarti.ArtifactContainer_Relationship;
import spemarti.ArtifactDefinition;
import spemarti.ArtifactFragment_Relationship;
import spemarti.ArtifactKinds;
import spemarti.SpemartiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spemarti.impl.ArtifactDefinitionImpl#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link spemarti.impl.ArtifactDefinitionImpl#getAKind <em>AKind</em>}</li>
 *   <li>{@link spemarti.impl.ArtifactDefinitionImpl#getArtifactFragment_Relationship <em>Artifact Fragment Relationship</em>}</li>
 *   <li>{@link spemarti.impl.ArtifactDefinitionImpl#getArtifactContainer_Relationship <em>Artifact Container Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactDefinitionImpl extends WorkProductDefinitionImpl implements ArtifactDefinition {
	/**
	 * The default value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean isExternal = IS_EXTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAKind() <em>AKind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAKind()
	 * @generated
	 * @ordered
	 */
	protected static final ArtifactKinds AKIND_EDEFAULT = ArtifactKinds.DOCUMENT;

	/**
	 * The cached value of the '{@link #getAKind() <em>AKind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAKind()
	 * @generated
	 * @ordered
	 */
	protected ArtifactKinds aKind = AKIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemartiPackage.Literals.ARTIFACT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsExternal() {
		return isExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExternal(boolean newIsExternal) {
		boolean oldIsExternal = isExternal;
		isExternal = newIsExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemartiPackage.ARTIFACT_DEFINITION__IS_EXTERNAL, oldIsExternal, isExternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactKinds getAKind() {
		return aKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAKind(ArtifactKinds newAKind) {
		ArtifactKinds oldAKind = aKind;
		aKind = newAKind == null ? AKIND_EDEFAULT : newAKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemartiPackage.ARTIFACT_DEFINITION__AKIND, oldAKind, aKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactFragment_Relationship> getArtifactFragment_Relationship() {
		// TODO: implement this method to return the 'Artifact Fragment Relationship' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactContainer_Relationship> getArtifactContainer_Relationship() {
		// TODO: implement this method to return the 'Artifact Container Relationship' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemartiPackage.ARTIFACT_DEFINITION__IS_EXTERNAL:
				return isIsExternal();
			case SpemartiPackage.ARTIFACT_DEFINITION__AKIND:
				return getAKind();
			case SpemartiPackage.ARTIFACT_DEFINITION__ARTIFACT_FRAGMENT_RELATIONSHIP:
				return getArtifactFragment_Relationship();
			case SpemartiPackage.ARTIFACT_DEFINITION__ARTIFACT_CONTAINER_RELATIONSHIP:
				return getArtifactContainer_Relationship();
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
			case SpemartiPackage.ARTIFACT_DEFINITION__IS_EXTERNAL:
				setIsExternal((Boolean)newValue);
				return;
			case SpemartiPackage.ARTIFACT_DEFINITION__AKIND:
				setAKind((ArtifactKinds)newValue);
				return;
			case SpemartiPackage.ARTIFACT_DEFINITION__ARTIFACT_FRAGMENT_RELATIONSHIP:
				getArtifactFragment_Relationship().clear();
				getArtifactFragment_Relationship().addAll((Collection<? extends ArtifactFragment_Relationship>)newValue);
				return;
			case SpemartiPackage.ARTIFACT_DEFINITION__ARTIFACT_CONTAINER_RELATIONSHIP:
				getArtifactContainer_Relationship().clear();
				getArtifactContainer_Relationship().addAll((Collection<? extends ArtifactContainer_Relationship>)newValue);
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
			case SpemartiPackage.ARTIFACT_DEFINITION__IS_EXTERNAL:
				setIsExternal(IS_EXTERNAL_EDEFAULT);
				return;
			case SpemartiPackage.ARTIFACT_DEFINITION__AKIND:
				setAKind(AKIND_EDEFAULT);
				return;
			case SpemartiPackage.ARTIFACT_DEFINITION__ARTIFACT_FRAGMENT_RELATIONSHIP:
				getArtifactFragment_Relationship().clear();
				return;
			case SpemartiPackage.ARTIFACT_DEFINITION__ARTIFACT_CONTAINER_RELATIONSHIP:
				getArtifactContainer_Relationship().clear();
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
			case SpemartiPackage.ARTIFACT_DEFINITION__IS_EXTERNAL:
				return isExternal != IS_EXTERNAL_EDEFAULT;
			case SpemartiPackage.ARTIFACT_DEFINITION__AKIND:
				return aKind != AKIND_EDEFAULT;
			case SpemartiPackage.ARTIFACT_DEFINITION__ARTIFACT_FRAGMENT_RELATIONSHIP:
				return !getArtifactFragment_Relationship().isEmpty();
			case SpemartiPackage.ARTIFACT_DEFINITION__ARTIFACT_CONTAINER_RELATIONSHIP:
				return !getArtifactContainer_Relationship().isEmpty();
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
		result.append(" (isExternal: ");
		result.append(isExternal);
		result.append(", aKind: ");
		result.append(aKind);
		result.append(')');
		return result.toString();
	}

} //ArtifactDefinitionImpl
