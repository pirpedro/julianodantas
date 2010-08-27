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

import spemarti.FragmentDefinition;
import spemarti.Fragment_Relationship;
import spemarti.SimpleInformationElement;
import spemarti.SpemartiPackage;
import spemarti.WorkProductDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Information Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spemarti.impl.SimpleInformationElementImpl#getPresentationName <em>Presentation Name</em>}</li>
 *   <li>{@link spemarti.impl.SimpleInformationElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link spemarti.impl.SimpleInformationElementImpl#getFragment_Relationship <em>Fragment Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SimpleInformationElementImpl extends VersionedExtentImpl implements SimpleInformationElement {
	/**
	 * The default value of the '{@link #getPresentationName() <em>Presentation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESENTATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPresentationName() <em>Presentation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationName()
	 * @generated
	 * @ordered
	 */
	protected String presentationName = PRESENTATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleInformationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemartiPackage.Literals.SIMPLE_INFORMATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPresentationName() {
		return presentationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationName(String newPresentationName) {
		String oldPresentationName = presentationName;
		presentationName = newPresentationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__PRESENTATION_NAME, oldPresentationName, presentationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fragment_Relationship> getFragment_Relationship() {
		// TODO: implement this method to return the 'Fragment Relationship' reference list
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
			case SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__PRESENTATION_NAME:
				return getPresentationName();
			case SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__DESCRIPTION:
				return getDescription();
			case SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__FRAGMENT_RELATIONSHIP:
				return getFragment_Relationship();
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
			case SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__PRESENTATION_NAME:
				setPresentationName((String)newValue);
				return;
			case SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__FRAGMENT_RELATIONSHIP:
				getFragment_Relationship().clear();
				getFragment_Relationship().addAll((Collection<? extends Fragment_Relationship>)newValue);
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
			case SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__PRESENTATION_NAME:
				setPresentationName(PRESENTATION_NAME_EDEFAULT);
				return;
			case SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__FRAGMENT_RELATIONSHIP:
				getFragment_Relationship().clear();
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
			case SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__PRESENTATION_NAME:
				return PRESENTATION_NAME_EDEFAULT == null ? presentationName != null : !PRESENTATION_NAME_EDEFAULT.equals(presentationName);
			case SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__FRAGMENT_RELATIONSHIP:
				return !getFragment_Relationship().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == WorkProductDefinition.class) {
			switch (derivedFeatureID) {
				case SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__PRESENTATION_NAME: return SpemartiPackage.WORK_PRODUCT_DEFINITION__PRESENTATION_NAME;
				case SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__DESCRIPTION: return SpemartiPackage.WORK_PRODUCT_DEFINITION__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == FragmentDefinition.class) {
			switch (derivedFeatureID) {
				case SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__FRAGMENT_RELATIONSHIP: return SpemartiPackage.FRAGMENT_DEFINITION__FRAGMENT_RELATIONSHIP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == WorkProductDefinition.class) {
			switch (baseFeatureID) {
				case SpemartiPackage.WORK_PRODUCT_DEFINITION__PRESENTATION_NAME: return SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__PRESENTATION_NAME;
				case SpemartiPackage.WORK_PRODUCT_DEFINITION__DESCRIPTION: return SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == FragmentDefinition.class) {
			switch (baseFeatureID) {
				case SpemartiPackage.FRAGMENT_DEFINITION__FRAGMENT_RELATIONSHIP: return SpemartiPackage.SIMPLE_INFORMATION_ELEMENT__FRAGMENT_RELATIONSHIP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (presentationName: ");
		result.append(presentationName);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SimpleInformationElementImpl
