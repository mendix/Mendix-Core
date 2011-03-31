/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.datacontract.mm.DataContractDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference;
import org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto;
import org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty;
import org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Class Dto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassDtoImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassDtoImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassDtoImpl#getPropertyReferences <em>Property References</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassDtoImpl#getAssociationReferences <em>Association References</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassDtoImpl#isCreatable <em>Creatable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessClassDtoImpl extends DtoImpl implements BusinessClassDto {
	/**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
	protected EList<DtoProperty> properties;

	/**
     * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBase()
     * @generated
     * @ordered
     */
	protected ExternalReference base;

	/**
     * The cached value of the '{@link #getPropertyReferences() <em>Property References</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPropertyReferences()
     * @generated
     * @ordered
     */
	protected EList<BusinessClassPropertyReference> propertyReferences;

	/**
     * The cached value of the '{@link #getAssociationReferences() <em>Association References</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAssociationReferences()
     * @generated
     * @ordered
     */
	protected EList<BusinessClassAssociationRoleReference> associationReferences;

	/**
     * The default value of the '{@link #isCreatable() <em>Creatable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isCreatable()
     * @generated
     * @ordered
     */
	protected static final boolean CREATABLE_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isCreatable() <em>Creatable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isCreatable()
     * @generated
     * @ordered
     */
	protected boolean creatable = CREATABLE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected BusinessClassDtoImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return DataContractDslPackage.Literals.BUSINESS_CLASS_DTO;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<DtoProperty> getProperties() {
        if (properties == null) {
            properties = new EObjectContainmentWithInverseEList<DtoProperty>(DtoProperty.class, this, DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTIES, DataContractDslPackage.DTO_PROPERTY__BUSINESS_CLASS_DTO);
        }
        return properties;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExternalReference getBase() {
        if (base != null && base.eIsProxy()) {
            InternalEObject oldBase = (InternalEObject)base;
            base = (ExternalReference)eResolveProxy(oldBase);
            if (base != oldBase) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataContractDslPackage.BUSINESS_CLASS_DTO__BASE, oldBase, base));
            }
        }
        return base;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExternalReference basicGetBase() {
        return base;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBase(ExternalReference newBase) {
        ExternalReference oldBase = base;
        base = newBase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataContractDslPackage.BUSINESS_CLASS_DTO__BASE, oldBase, base));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<BusinessClassPropertyReference> getPropertyReferences() {
        if (propertyReferences == null) {
            propertyReferences = new EObjectContainmentWithInverseEList<BusinessClassPropertyReference>(BusinessClassPropertyReference.class, this, DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTY_REFERENCES, DataContractDslPackage.BUSINESS_CLASS_PROPERTY_REFERENCE__DTO);
        }
        return propertyReferences;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<BusinessClassAssociationRoleReference> getAssociationReferences() {
        if (associationReferences == null) {
            associationReferences = new EObjectContainmentWithInverseEList<BusinessClassAssociationRoleReference>(BusinessClassAssociationRoleReference.class, this, DataContractDslPackage.BUSINESS_CLASS_DTO__ASSOCIATION_REFERENCES, DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO);
        }
        return associationReferences;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isCreatable() {
        return creatable;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCreatable(boolean newCreatable) {
        boolean oldCreatable = creatable;
        creatable = newCreatable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataContractDslPackage.BUSINESS_CLASS_DTO__CREATABLE, oldCreatable, creatable));
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
            case DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTIES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getProperties()).basicAdd(otherEnd, msgs);
            case DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTY_REFERENCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPropertyReferences()).basicAdd(otherEnd, msgs);
            case DataContractDslPackage.BUSINESS_CLASS_DTO__ASSOCIATION_REFERENCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociationReferences()).basicAdd(otherEnd, msgs);
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
            case DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTIES:
                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
            case DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTY_REFERENCES:
                return ((InternalEList<?>)getPropertyReferences()).basicRemove(otherEnd, msgs);
            case DataContractDslPackage.BUSINESS_CLASS_DTO__ASSOCIATION_REFERENCES:
                return ((InternalEList<?>)getAssociationReferences()).basicRemove(otherEnd, msgs);
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
            case DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTIES:
                return getProperties();
            case DataContractDslPackage.BUSINESS_CLASS_DTO__BASE:
                if (resolve) return getBase();
                return basicGetBase();
            case DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTY_REFERENCES:
                return getPropertyReferences();
            case DataContractDslPackage.BUSINESS_CLASS_DTO__ASSOCIATION_REFERENCES:
                return getAssociationReferences();
            case DataContractDslPackage.BUSINESS_CLASS_DTO__CREATABLE:
                return isCreatable();
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
            case DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTIES:
                getProperties().clear();
                getProperties().addAll((Collection<? extends DtoProperty>)newValue);
                return;
            case DataContractDslPackage.BUSINESS_CLASS_DTO__BASE:
                setBase((ExternalReference)newValue);
                return;
            case DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTY_REFERENCES:
                getPropertyReferences().clear();
                getPropertyReferences().addAll((Collection<? extends BusinessClassPropertyReference>)newValue);
                return;
            case DataContractDslPackage.BUSINESS_CLASS_DTO__ASSOCIATION_REFERENCES:
                getAssociationReferences().clear();
                getAssociationReferences().addAll((Collection<? extends BusinessClassAssociationRoleReference>)newValue);
                return;
            case DataContractDslPackage.BUSINESS_CLASS_DTO__CREATABLE:
                setCreatable((Boolean)newValue);
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
            case DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTIES:
                getProperties().clear();
                return;
            case DataContractDslPackage.BUSINESS_CLASS_DTO__BASE:
                setBase((ExternalReference)null);
                return;
            case DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTY_REFERENCES:
                getPropertyReferences().clear();
                return;
            case DataContractDslPackage.BUSINESS_CLASS_DTO__ASSOCIATION_REFERENCES:
                getAssociationReferences().clear();
                return;
            case DataContractDslPackage.BUSINESS_CLASS_DTO__CREATABLE:
                setCreatable(CREATABLE_EDEFAULT);
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
            case DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTIES:
                return properties != null && !properties.isEmpty();
            case DataContractDslPackage.BUSINESS_CLASS_DTO__BASE:
                return base != null;
            case DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTY_REFERENCES:
                return propertyReferences != null && !propertyReferences.isEmpty();
            case DataContractDslPackage.BUSINESS_CLASS_DTO__ASSOCIATION_REFERENCES:
                return associationReferences != null && !associationReferences.isEmpty();
            case DataContractDslPackage.BUSINESS_CLASS_DTO__CREATABLE:
                return creatable != CREATABLE_EDEFAULT;
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
        result.append(" (creatable: ");
        result.append(creatable);
        result.append(')');
        return result.toString();
    }

} //BusinessClassDtoImpl
