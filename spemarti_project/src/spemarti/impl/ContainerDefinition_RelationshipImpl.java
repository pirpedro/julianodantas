/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import spemarti.ContainerDefinition;
import spemarti.ContainerDefinition_Relationship;
import spemarti.SpemartiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Definition Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spemarti.impl.ContainerDefinition_RelationshipImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link spemarti.impl.ContainerDefinition_RelationshipImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerDefinition_RelationshipImpl extends EObjectImpl implements ContainerDefinition_Relationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerDefinition_RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemartiPackage.Literals.CONTAINER_DEFINITION_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerDefinition> getChildren() {
		// TODO: implement this method to return the 'Children' reference list
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
	public ContainerDefinition getParent() {
		ContainerDefinition parent = basicGetParent();
		return parent != null && parent.eIsProxy() ? (ContainerDefinition)eResolveProxy((InternalEObject)parent) : parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerDefinition basicGetParent() {
		// TODO: implement this method to return the 'Parent' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ContainerDefinition newParent) {
		// TODO: implement this method to set the 'Parent' reference
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
			case SpemartiPackage.CONTAINER_DEFINITION_RELATIONSHIP__CHILDREN:
				return getChildren();
			case SpemartiPackage.CONTAINER_DEFINITION_RELATIONSHIP__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
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
			case SpemartiPackage.CONTAINER_DEFINITION_RELATIONSHIP__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ContainerDefinition>)newValue);
				return;
			case SpemartiPackage.CONTAINER_DEFINITION_RELATIONSHIP__PARENT:
				setParent((ContainerDefinition)newValue);
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
			case SpemartiPackage.CONTAINER_DEFINITION_RELATIONSHIP__CHILDREN:
				getChildren().clear();
				return;
			case SpemartiPackage.CONTAINER_DEFINITION_RELATIONSHIP__PARENT:
				setParent((ContainerDefinition)null);
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
			case SpemartiPackage.CONTAINER_DEFINITION_RELATIONSHIP__CHILDREN:
				return !getChildren().isEmpty();
			case SpemartiPackage.CONTAINER_DEFINITION_RELATIONSHIP__PARENT:
				return basicGetParent() != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainerDefinition_RelationshipImpl
