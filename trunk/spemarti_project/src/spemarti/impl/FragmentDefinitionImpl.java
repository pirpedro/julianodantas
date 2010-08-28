/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import spemarti.FragmentDefinition;
import spemarti.Fragment_Relationship;
import spemarti.SpemartiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragment Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spemarti.impl.FragmentDefinitionImpl#getFragment_Relationship <em>Fragment Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FragmentDefinitionImpl extends WorkProductDefinitionImpl implements FragmentDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FragmentDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemartiPackage.Literals.FRAGMENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment_Relationship getFragment_Relationship() {
		Fragment_Relationship fragment_Relationship = basicGetFragment_Relationship();
		return fragment_Relationship != null && fragment_Relationship.eIsProxy() ? (Fragment_Relationship)eResolveProxy((InternalEObject)fragment_Relationship) : fragment_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment_Relationship basicGetFragment_Relationship() {
		// TODO: implement this method to return the 'Fragment Relationship' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFragment_Relationship(Fragment_Relationship newFragment_Relationship) {
		// TODO: implement this method to set the 'Fragment Relationship' reference
		// Ensure that you remove @generated or mark it @generated NOT
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
			case SpemartiPackage.FRAGMENT_DEFINITION__FRAGMENT_RELATIONSHIP:
				if (resolve) return getFragment_Relationship();
				return basicGetFragment_Relationship();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpemartiPackage.FRAGMENT_DEFINITION__FRAGMENT_RELATIONSHIP:
				setFragment_Relationship((Fragment_Relationship)newValue);
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
			case SpemartiPackage.FRAGMENT_DEFINITION__FRAGMENT_RELATIONSHIP:
				setFragment_Relationship((Fragment_Relationship)null);
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
			case SpemartiPackage.FRAGMENT_DEFINITION__FRAGMENT_RELATIONSHIP:
				return basicGetFragment_Relationship() != null;
		}
		return super.eIsSet(featureID);
	}

} //FragmentDefinitionImpl
