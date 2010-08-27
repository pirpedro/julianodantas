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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import spemarti.List;
import spemarti.SimpleInformationElement;
import spemarti.SpemartiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spemarti.impl.ListImpl#isIsLabeled <em>Is Labeled</em>}</li>
 *   <li>{@link spemarti.impl.ListImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link spemarti.impl.ListImpl#isIsEnumerated <em>Is Enumerated</em>}</li>
 *   <li>{@link spemarti.impl.ListImpl#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListImpl extends ComplexInformationElementImpl implements List {
	/**
	 * The default value of the '{@link #isIsLabeled() <em>Is Labeled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLabeled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LABELED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLabeled() <em>Is Labeled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLabeled()
	 * @generated
	 * @ordered
	 */
	protected boolean isLabeled = IS_LABELED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEnumerated() <em>Is Enumerated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnumerated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENUMERATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEnumerated() <em>Is Enumerated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnumerated()
	 * @generated
	 * @ordered
	 */
	protected boolean isEnumerated = IS_ENUMERATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleInformationElement> contents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemartiPackage.Literals.LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLabeled() {
		return isLabeled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLabeled(boolean newIsLabeled) {
		boolean oldIsLabeled = isLabeled;
		isLabeled = newIsLabeled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemartiPackage.LIST__IS_LABELED, oldIsLabeled, isLabeled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemartiPackage.LIST__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEnumerated() {
		return isEnumerated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEnumerated(boolean newIsEnumerated) {
		boolean oldIsEnumerated = isEnumerated;
		isEnumerated = newIsEnumerated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemartiPackage.LIST__IS_ENUMERATED, oldIsEnumerated, isEnumerated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleInformationElement> getContents() {
		if (contents == null) {
			contents = new EObjectResolvingEList<SimpleInformationElement>(SimpleInformationElement.class, this, SpemartiPackage.LIST__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void orderByAZ() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void orderByZA() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemartiPackage.LIST__IS_LABELED:
				return isIsLabeled();
			case SpemartiPackage.LIST__IS_ORDERED:
				return isIsOrdered();
			case SpemartiPackage.LIST__IS_ENUMERATED:
				return isIsEnumerated();
			case SpemartiPackage.LIST__CONTENTS:
				return getContents();
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
			case SpemartiPackage.LIST__IS_LABELED:
				setIsLabeled((Boolean)newValue);
				return;
			case SpemartiPackage.LIST__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case SpemartiPackage.LIST__IS_ENUMERATED:
				setIsEnumerated((Boolean)newValue);
				return;
			case SpemartiPackage.LIST__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends SimpleInformationElement>)newValue);
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
			case SpemartiPackage.LIST__IS_LABELED:
				setIsLabeled(IS_LABELED_EDEFAULT);
				return;
			case SpemartiPackage.LIST__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case SpemartiPackage.LIST__IS_ENUMERATED:
				setIsEnumerated(IS_ENUMERATED_EDEFAULT);
				return;
			case SpemartiPackage.LIST__CONTENTS:
				getContents().clear();
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
			case SpemartiPackage.LIST__IS_LABELED:
				return isLabeled != IS_LABELED_EDEFAULT;
			case SpemartiPackage.LIST__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case SpemartiPackage.LIST__IS_ENUMERATED:
				return isEnumerated != IS_ENUMERATED_EDEFAULT;
			case SpemartiPackage.LIST__CONTENTS:
				return contents != null && !contents.isEmpty();
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
		result.append(" (isLabeled: ");
		result.append(isLabeled);
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(", isEnumerated: ");
		result.append(isEnumerated);
		result.append(')');
		return result.toString();
	}

} //ListImpl
