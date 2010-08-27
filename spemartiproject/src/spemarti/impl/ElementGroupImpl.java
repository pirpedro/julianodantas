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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spemarti.ElementGroup;
import spemarti.SimpleInformationElement;
import spemarti.SpemartiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spemarti.impl.ElementGroupImpl#getChilds <em>Childs</em>}</li>
 *   <li>{@link spemarti.impl.ElementGroupImpl#getInternalContents <em>Internal Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementGroupImpl extends ListImpl implements ElementGroup {
	/**
	 * The cached value of the '{@link #getChilds() <em>Childs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChilds()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementGroup> childs;

	/**
	 * The cached value of the '{@link #getInternalContents() <em>Internal Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalContents()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleInformationElement> internalContents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemartiPackage.Literals.ELEMENT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementGroup> getChilds() {
		if (childs == null) {
			childs = new EObjectResolvingEList<ElementGroup>(ElementGroup.class, this, SpemartiPackage.ELEMENT_GROUP__CHILDS);
		}
		return childs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleInformationElement> getInternalContents() {
		if (internalContents == null) {
			internalContents = new EObjectContainmentEList<SimpleInformationElement>(SimpleInformationElement.class, this, SpemartiPackage.ELEMENT_GROUP__INTERNAL_CONTENTS);
		}
		return internalContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemartiPackage.ELEMENT_GROUP__INTERNAL_CONTENTS:
				return ((InternalEList<?>)getInternalContents()).basicRemove(otherEnd, msgs);
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
			case SpemartiPackage.ELEMENT_GROUP__CHILDS:
				return getChilds();
			case SpemartiPackage.ELEMENT_GROUP__INTERNAL_CONTENTS:
				return getInternalContents();
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
			case SpemartiPackage.ELEMENT_GROUP__CHILDS:
				getChilds().clear();
				getChilds().addAll((Collection<? extends ElementGroup>)newValue);
				return;
			case SpemartiPackage.ELEMENT_GROUP__INTERNAL_CONTENTS:
				getInternalContents().clear();
				getInternalContents().addAll((Collection<? extends SimpleInformationElement>)newValue);
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
			case SpemartiPackage.ELEMENT_GROUP__CHILDS:
				getChilds().clear();
				return;
			case SpemartiPackage.ELEMENT_GROUP__INTERNAL_CONTENTS:
				getInternalContents().clear();
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
			case SpemartiPackage.ELEMENT_GROUP__CHILDS:
				return childs != null && !childs.isEmpty();
			case SpemartiPackage.ELEMENT_GROUP__INTERNAL_CONTENTS:
				return internalContents != null && !internalContents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementGroupImpl
