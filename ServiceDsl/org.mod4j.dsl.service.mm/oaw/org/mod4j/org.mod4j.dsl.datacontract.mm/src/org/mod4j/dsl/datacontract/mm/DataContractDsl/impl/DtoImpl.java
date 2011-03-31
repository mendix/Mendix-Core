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

import org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel;
import org.mendix.dsl.datacontract.mm.DataContractDsl.Dto;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoImpl#getDatacontractModel <em>Datacontract Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DtoImpl extends ModelElementImpl implements Dto {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected DtoImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return DataContractDslPackage.Literals.DTO;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DataContractModel getDatacontractModel() {
        if (eContainerFeatureID() != DataContractDslPackage.DTO__DATACONTRACT_MODEL) return null;
        return (DataContractModel)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetDatacontractModel(DataContractModel newDatacontractModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newDatacontractModel, DataContractDslPackage.DTO__DATACONTRACT_MODEL, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDatacontractModel(DataContractModel newDatacontractModel) {
        if (newDatacontractModel != eInternalContainer() || (eContainerFeatureID() != DataContractDslPackage.DTO__DATACONTRACT_MODEL && newDatacontractModel != null)) {
            if (EcoreUtil.isAncestor(this, newDatacontractModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDatacontractModel != null)
                msgs = ((InternalEObject)newDatacontractModel).eInverseAdd(this, DataContractDslPackage.DATA_CONTRACT_MODEL__DTOS, DataContractModel.class, msgs);
            msgs = basicSetDatacontractModel(newDatacontractModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataContractDslPackage.DTO__DATACONTRACT_MODEL, newDatacontractModel, newDatacontractModel));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DataContractDslPackage.DTO__DATACONTRACT_MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetDatacontractModel((DataContractModel)otherEnd, msgs);
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
            case DataContractDslPackage.DTO__DATACONTRACT_MODEL:
                return basicSetDatacontractModel(null, msgs);
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
            case DataContractDslPackage.DTO__DATACONTRACT_MODEL:
                return eInternalContainer().eInverseRemove(this, DataContractDslPackage.DATA_CONTRACT_MODEL__DTOS, DataContractModel.class, msgs);
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
            case DataContractDslPackage.DTO__DATACONTRACT_MODEL:
                return getDatacontractModel();
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
            case DataContractDslPackage.DTO__DATACONTRACT_MODEL:
                setDatacontractModel((DataContractModel)newValue);
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
            case DataContractDslPackage.DTO__DATACONTRACT_MODEL:
                setDatacontractModel((DataContractModel)null);
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
            case DataContractDslPackage.DTO__DATACONTRACT_MODEL:
                return getDatacontractModel() != null;
        }
        return super.eIsSet(featureID);
    }

} //DtoImpl
