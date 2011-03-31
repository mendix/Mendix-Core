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

import org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto;
import org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Class Property Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassPropertyReferenceImpl#getDto <em>Dto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessClassPropertyReferenceImpl extends ModelElementImpl implements BusinessClassPropertyReference {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected BusinessClassPropertyReferenceImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return DataContractDslPackage.Literals.BUSINESS_CLASS_PROPERTY_REFERENCE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BusinessClassDto getDto() {
        if (eContainerFeatureID() != DataContractDslPackage.BUSINESS_CLASS_PROPERTY_REFERENCE__DTO) return null;
        return (BusinessClassDto)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetDto(BusinessClassDto newDto, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newDto, DataContractDslPackage.BUSINESS_CLASS_PROPERTY_REFERENCE__DTO, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDto(BusinessClassDto newDto) {
        if (newDto != eInternalContainer() || (eContainerFeatureID() != DataContractDslPackage.BUSINESS_CLASS_PROPERTY_REFERENCE__DTO && newDto != null)) {
            if (EcoreUtil.isAncestor(this, newDto))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDto != null)
                msgs = ((InternalEObject)newDto).eInverseAdd(this, DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTY_REFERENCES, BusinessClassDto.class, msgs);
            msgs = basicSetDto(newDto, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataContractDslPackage.BUSINESS_CLASS_PROPERTY_REFERENCE__DTO, newDto, newDto));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DataContractDslPackage.BUSINESS_CLASS_PROPERTY_REFERENCE__DTO:
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
            case DataContractDslPackage.BUSINESS_CLASS_PROPERTY_REFERENCE__DTO:
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
            case DataContractDslPackage.BUSINESS_CLASS_PROPERTY_REFERENCE__DTO:
                return eInternalContainer().eInverseRemove(this, DataContractDslPackage.BUSINESS_CLASS_DTO__PROPERTY_REFERENCES, BusinessClassDto.class, msgs);
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
            case DataContractDslPackage.BUSINESS_CLASS_PROPERTY_REFERENCE__DTO:
                return getDto();
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
            case DataContractDslPackage.BUSINESS_CLASS_PROPERTY_REFERENCE__DTO:
                setDto((BusinessClassDto)newValue);
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
            case DataContractDslPackage.BUSINESS_CLASS_PROPERTY_REFERENCE__DTO:
                setDto((BusinessClassDto)null);
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
            case DataContractDslPackage.BUSINESS_CLASS_PROPERTY_REFERENCE__DTO:
                return getDto() != null;
        }
        return super.eIsSet(featureID);
    }

} //BusinessClassPropertyReferenceImpl
