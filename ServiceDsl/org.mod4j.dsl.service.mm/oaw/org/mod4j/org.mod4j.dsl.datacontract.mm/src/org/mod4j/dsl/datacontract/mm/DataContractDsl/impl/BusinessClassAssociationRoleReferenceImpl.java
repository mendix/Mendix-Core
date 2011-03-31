/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.datacontract.mm.DataContractDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference;
import org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage;
import org.mendix.dsl.datacontract.mm.DataContractDsl.Dto;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Class Association Role Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassAssociationRoleReferenceImpl#getDto <em>Dto</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassAssociationRoleReferenceImpl#getDtoType <em>Dto Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessClassAssociationRoleReferenceImpl extends ModelElementImpl implements BusinessClassAssociationRoleReference {
	/**
     * The cached value of the '{@link #getDtoType() <em>Dto Type</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDtoType()
     * @generated
     * @ordered
     */
	protected Dto dtoType;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected BusinessClassAssociationRoleReferenceImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return DataContractDslPackage.Literals.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BusinessClassDto getDto() {
        if (eContainerFeatureID() != DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO) return null;
        return (BusinessClassDto)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetDto(BusinessClassDto newDto, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newDto, DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDto(BusinessClassDto newDto) {
        if (newDto != eInternalContainer() || (eContainerFeatureID() != DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO && newDto != null)) {
            if (EcoreUtil.isAncestor(this, newDto))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDto != null)
                msgs = ((InternalEObject)newDto).eInverseAdd(this, DataContractDslPackage.BUSINESS_CLASS_DTO__ASSOCIATION_REFERENCES, BusinessClassDto.class, msgs);
            msgs = basicSetDto(newDto, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO, newDto, newDto));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Dto getDtoType() {
        if (dtoType != null && dtoType.eIsProxy()) {
            InternalEObject oldDtoType = (InternalEObject)dtoType;
            dtoType = (Dto)eResolveProxy(oldDtoType);
            if (dtoType != oldDtoType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO_TYPE, oldDtoType, dtoType));
            }
        }
        return dtoType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Dto basicGetDtoType() {
        return dtoType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDtoType(Dto newDtoType) {
        Dto oldDtoType = dtoType;
        dtoType = newDtoType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO_TYPE, oldDtoType, dtoType));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetDto((BusinessClassDto)otherEnd, msgs);
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
            case DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO:
                return basicSetDto(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO:
                return eInternalContainer().eInverseRemove(this, DataContractDslPackage.BUSINESS_CLASS_DTO__ASSOCIATION_REFERENCES, BusinessClassDto.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO:
                return getDto();
            case DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO_TYPE:
                if (resolve) return getDtoType();
                return basicGetDtoType();
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
            case DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO:
                setDto((BusinessClassDto)newValue);
                return;
            case DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO_TYPE:
                setDtoType((Dto)newValue);
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
            case DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO:
                setDto((BusinessClassDto)null);
                return;
            case DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO_TYPE:
                setDtoType((Dto)null);
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
            case DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO:
                return getDto() != null;
            case DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO_TYPE:
                return dtoType != null;
        }
        return super.eIsSet(featureID);
    }

} //BusinessClassAssociationRoleReferenceImpl
