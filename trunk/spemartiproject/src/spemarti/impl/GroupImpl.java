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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spemarti.Group;
import spemarti.SimpleInformationElement;
import spemarti.SpemartiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spemarti.impl.GroupImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link spemarti.impl.GroupImpl#getGroup2 <em>Group2</em>}</li>
 *   <li>{@link spemarti.impl.GroupImpl#getChilds <em>Childs</em>}</li>
 *   <li>{@link spemarti.impl.GroupImpl#getInternalContents <em>Internal Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupImpl extends ListImpl implements Group {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected Group group;

	/**
	 * The cached value of the '{@link #getGroup2() <em>Group2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup2()
	 * @generated
	 * @ordered
	 */
	protected Group group2;

	/**
	 * The cached value of the '{@link #getChilds() <em>Childs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChilds()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> childs;

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
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemartiPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getGroup() {
		if (group != null && group.eIsProxy()) {
			InternalEObject oldGroup = (InternalEObject)group;
			group = (Group)eResolveProxy(oldGroup);
			if (group != oldGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemartiPackage.GROUP__GROUP, oldGroup, group));
			}
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group basicGetGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
		Group oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpemartiPackage.GROUP__GROUP, oldGroup, newGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, SpemartiPackage.GROUP__GROUP2, Group.class, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, SpemartiPackage.GROUP__GROUP2, Group.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemartiPackage.GROUP__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getGroup2() {
		if (group2 != null && group2.eIsProxy()) {
			InternalEObject oldGroup2 = (InternalEObject)group2;
			group2 = (Group)eResolveProxy(oldGroup2);
			if (group2 != oldGroup2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemartiPackage.GROUP__GROUP2, oldGroup2, group2));
			}
		}
		return group2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group basicGetGroup2() {
		return group2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup2(Group newGroup2, NotificationChain msgs) {
		Group oldGroup2 = group2;
		group2 = newGroup2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpemartiPackage.GROUP__GROUP2, oldGroup2, newGroup2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup2(Group newGroup2) {
		if (newGroup2 != group2) {
			NotificationChain msgs = null;
			if (group2 != null)
				msgs = ((InternalEObject)group2).eInverseRemove(this, SpemartiPackage.GROUP__GROUP, Group.class, msgs);
			if (newGroup2 != null)
				msgs = ((InternalEObject)newGroup2).eInverseAdd(this, SpemartiPackage.GROUP__GROUP, Group.class, msgs);
			msgs = basicSetGroup2(newGroup2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemartiPackage.GROUP__GROUP2, newGroup2, newGroup2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getChilds() {
		if (childs == null) {
			childs = new EObjectResolvingEList<Group>(Group.class, this, SpemartiPackage.GROUP__CHILDS);
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
			internalContents = new EObjectContainmentEList<SimpleInformationElement>(SimpleInformationElement.class, this, SpemartiPackage.GROUP__INTERNAL_CONTENTS);
		}
		return internalContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemartiPackage.GROUP__GROUP:
				if (group != null)
					msgs = ((InternalEObject)group).eInverseRemove(this, SpemartiPackage.GROUP__GROUP2, Group.class, msgs);
				return basicSetGroup((Group)otherEnd, msgs);
			case SpemartiPackage.GROUP__GROUP2:
				if (group2 != null)
					msgs = ((InternalEObject)group2).eInverseRemove(this, SpemartiPackage.GROUP__GROUP, Group.class, msgs);
				return basicSetGroup2((Group)otherEnd, msgs);
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
			case SpemartiPackage.GROUP__GROUP:
				return basicSetGroup(null, msgs);
			case SpemartiPackage.GROUP__GROUP2:
				return basicSetGroup2(null, msgs);
			case SpemartiPackage.GROUP__INTERNAL_CONTENTS:
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
			case SpemartiPackage.GROUP__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case SpemartiPackage.GROUP__GROUP2:
				if (resolve) return getGroup2();
				return basicGetGroup2();
			case SpemartiPackage.GROUP__CHILDS:
				return getChilds();
			case SpemartiPackage.GROUP__INTERNAL_CONTENTS:
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
			case SpemartiPackage.GROUP__GROUP:
				setGroup((Group)newValue);
				return;
			case SpemartiPackage.GROUP__GROUP2:
				setGroup2((Group)newValue);
				return;
			case SpemartiPackage.GROUP__CHILDS:
				getChilds().clear();
				getChilds().addAll((Collection<? extends Group>)newValue);
				return;
			case SpemartiPackage.GROUP__INTERNAL_CONTENTS:
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
			case SpemartiPackage.GROUP__GROUP:
				setGroup((Group)null);
				return;
			case SpemartiPackage.GROUP__GROUP2:
				setGroup2((Group)null);
				return;
			case SpemartiPackage.GROUP__CHILDS:
				getChilds().clear();
				return;
			case SpemartiPackage.GROUP__INTERNAL_CONTENTS:
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
			case SpemartiPackage.GROUP__GROUP:
				return group != null;
			case SpemartiPackage.GROUP__GROUP2:
				return group2 != null;
			case SpemartiPackage.GROUP__CHILDS:
				return childs != null && !childs.isEmpty();
			case SpemartiPackage.GROUP__INTERNAL_CONTENTS:
				return internalContents != null && !internalContents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupImpl
