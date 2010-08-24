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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import spemarti.Matrix;
import spemarti.SpemartiPackage;
import spemarti.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spemarti.impl.TableImpl#getMatrixes <em>Matrixes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends MatrixImpl implements Table {
	/**
	 * The cached value of the '{@link #getMatrixes() <em>Matrixes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrixes()
	 * @generated
	 * @ordered
	 */
	protected EList<Matrix> matrixes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemartiPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Matrix> getMatrixes() {
		if (matrixes == null) {
			matrixes = new EObjectResolvingEList<Matrix>(Matrix.class, this, SpemartiPackage.TABLE__MATRIXES);
		}
		return matrixes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemartiPackage.TABLE__MATRIXES:
				return getMatrixes();
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
			case SpemartiPackage.TABLE__MATRIXES:
				getMatrixes().clear();
				getMatrixes().addAll((Collection<? extends Matrix>)newValue);
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
			case SpemartiPackage.TABLE__MATRIXES:
				getMatrixes().clear();
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
			case SpemartiPackage.TABLE__MATRIXES:
				return matrixes != null && !matrixes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
