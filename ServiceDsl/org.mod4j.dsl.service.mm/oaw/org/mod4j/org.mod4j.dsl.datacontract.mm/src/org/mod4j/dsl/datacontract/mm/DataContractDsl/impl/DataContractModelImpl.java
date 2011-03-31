/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.datacontract.mm.DataContractDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel;
import org.mendix.dsl.datacontract.mm.DataContractDsl.Dto;
import org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto;
import org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Contract Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractModelImpl#getDtos <em>Dtos</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractModelImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractModelImpl#getExternalReferences <em>External References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataContractModelImpl extends ModelElementImpl implements DataContractModel {
	/**
     * The cached value of the '{@link #getDtos() <em>Dtos</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDtos()
     * @generated
     * @ordered
     */
	protected EList<Dto> dtos;

	/**
     * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEnumerations()
     * @generated
     * @ordered
     */
	protected EList<EnumerationDto> enumerations;

	/**
     * The cached value of the '{@link #getExternalReferences() <em>External References</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExternalReferences()
     * @generated
     * @ordered
     */
	protected EList<ExternalReference> externalReferences;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected DataContractModelImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return DataContractDslPackage.Literals.DATA_CONTRACT_MODEL;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Dto> getDtos() {
        if (dtos == null) {
            dtos = new EObjectContainmentWithInverseEList<Dto>(Dto.class, this, DataContractDslPackage.DATA_CONTRACT_MODEL__DTOS, DataContractDslPackage.DTO__DATACONTRACT_MODEL);
        }
        return dtos;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<EnumerationDto> getEnumerations() {
        if (enumerations == null) {
            enumerations = new EObjectContainmentWithInverseEList<EnumerationDto>(EnumerationDto.class, this, DataContractDslPackage.DATA_CONTRACT_MODEL__ENUMERATIONS, DataContractDslPackage.ENUMERATION_DTO__DATACONTRACT_MODEL);
        }
        return enumerations;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ExternalReference> getExternalReferences() {
        if (externalReferences == null) {
            externalReferences = new EObjectContainmentWithInverseEList<ExternalReference>(ExternalReference.class, this, DataContractDslPackage.DATA_CONTRACT_MODEL__EXTERNAL_REFERENCES, DataContractDslPackage.EXTERNAL_REFERENCE__DATACONTRACT_MODEL);
        }
        return externalReferences;
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
            case DataContractDslPackage.DATA_CONTRACT_MODEL__DTOS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getDtos()).basicAdd(otherEnd, msgs);
            case DataContractDslPackage.DATA_CONTRACT_MODEL__ENUMERATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnumerations()).basicAdd(otherEnd, msgs);
            case DataContractDslPackage.DATA_CONTRACT_MODEL__EXTERNAL_REFERENCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getExternalReferences()).basicAdd(otherEnd, msgs);
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
            case DataContractDslPackage.DATA_CONTRACT_MODEL__DTOS:
                return ((InternalEList<?>)getDtos()).basicRemove(otherEnd, msgs);
            case DataContractDslPackage.DATA_CONTRACT_MODEL__ENUMERATIONS:
                return ((InternalEList<?>)getEnumerations()).basicRemove(otherEnd, msgs);
            case DataContractDslPackage.DATA_CONTRACT_MODEL__EXTERNAL_REFERENCES:
                return ((InternalEList<?>)getExternalReferences()).basicRemove(otherEnd, msgs);
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
            case DataContractDslPackage.DATA_CONTRACT_MODEL__DTOS:
                return getDtos();
            case DataContractDslPackage.DATA_CONTRACT_MODEL__ENUMERATIONS:
                return getEnumerations();
            case DataContractDslPackage.DATA_CONTRACT_MODEL__EXTERNAL_REFERENCES:
                return getExternalReferences();
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
            case DataContractDslPackage.DATA_CONTRACT_MODEL__DTOS:
                getDtos().clear();
                getDtos().addAll((Collection<? extends Dto>)newValue);
                return;
            case DataContractDslPackage.DATA_CONTRACT_MODEL__ENUMERATIONS:
                getEnumerations().clear();
                getEnumerations().addAll((Collection<? extends EnumerationDto>)newValue);
                return;
            case DataContractDslPackage.DATA_CONTRACT_MODEL__EXTERNAL_REFERENCES:
                getExternalReferences().clear();
                getExternalReferences().addAll((Collection<? extends ExternalReference>)newValue);
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
            case DataContractDslPackage.DATA_CONTRACT_MODEL__DTOS:
                getDtos().clear();
                return;
            case DataContractDslPackage.DATA_CONTRACT_MODEL__ENUMERATIONS:
                getEnumerations().clear();
                return;
            case DataContractDslPackage.DATA_CONTRACT_MODEL__EXTERNAL_REFERENCES:
                getExternalReferences().clear();
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
            case DataContractDslPackage.DATA_CONTRACT_MODEL__DTOS:
                return dtos != null && !dtos.isEmpty();
            case DataContractDslPackage.DATA_CONTRACT_MODEL__ENUMERATIONS:
                return enumerations != null && !enumerations.isEmpty();
            case DataContractDslPackage.DATA_CONTRACT_MODEL__EXTERNAL_REFERENCES:
                return externalReferences != null && !externalReferences.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //DataContractModelImpl
