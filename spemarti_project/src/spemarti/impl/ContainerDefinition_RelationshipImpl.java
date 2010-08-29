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
	protected EList<ContainerDefinition> children;
	protected ContainerDefinition parent;

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
	 */
	public EList<ContainerDefinition> getChildren() {
		return children;
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
	 */
	public ContainerDefinition basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setParent(ContainerDefinition newParent) {
		this.parent = newParent;
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
