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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel;
import org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto;
import org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDtoLiteral;
import org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Dto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.EnumerationDtoImpl#getLiterals <em>Literals</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.EnumerationDtoImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.EnumerationDtoImpl#getDatacontractModel <em>Datacontract Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationDtoImpl extends ModelElementImpl implements EnumerationDto {
	/**
     * The cached value of the '{@link #getLiterals() <em>Literals</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLiterals()
     * @generated
     * @ordered
     */
	protected EList<EnumerationDtoLiteral> literals;

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
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected EnumerationDtoImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return DataContractDslPackage.Literals.ENUMERATION_DTO;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<EnumerationDtoLiteral> getLiterals() {
        if (literals == null) {
            literals = new EObjectContainmentEList<EnumerationDtoLiteral>(EnumerationDtoLiteral.class, this, DataContractDslPackage.ENUMERATION_DTO__LITERALS);
        }
        return literals;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataContractDslPackage.ENUMERATION_DTO__BASE, oldBase, base));
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
            eNotify(new ENotificationImpl(this, Notification.SET, DataContractDslPackage.ENUMERATION_DTO__BASE, oldBase, base));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DataContractModel getDatacontractModel() {
        if (eContainerFeatureID() != DataContractDslPackage.ENUMERATION_DTO__DATACONTRACT_MODEL) return null;
        return (DataContractModel)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetDatacontractModel(DataContractModel newDatacontractModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newDatacontractModel, DataContractDslPackage.ENUMERATION_DTO__DATACONTRACT_MODEL, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDatacontractModel(DataContractModel newDatacontractModel) {
        if (newDatacontractModel != eInternalContainer() || (eContainerFeatureID() != DataContractDslPackage.ENUMERATION_DTO__DATACONTRACT_MODEL && newDatacontractModel != null)) {
            if (EcoreUtil.isAncestor(this, newDatacontractModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDatacontractModel != null)
                msgs = ((InternalEObject)newDatacontractModel).eInverseAdd(this, DataContractDslPackage.DATA_CONTRACT_MODEL__ENUMERATIONS, DataContractModel.class, msgs);
            msgs = basicSetDatacontractModel(newDatacontractModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataContractDslPackage.ENUMERATION_DTO__DATACONTRACT_MODEL, newDatacontractModel, newDatacontractModel));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DataContractDslPackage.ENUMERATION_DTO__DATACONTRACT_MODEL:
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
            case DataContractDslPackage.ENUMERATION_DTO__LITERALS:
                return ((InternalEList<?>)getLiterals()).basicRemove(otherEnd, msgs);
            case DataContractDslPackage.ENUMERATION_DTO__DATACONTRACT_MODEL:
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
            case DataContractDslPackage.ENUMERATION_DTO__DATACONTRACT_MODEL:
                return eInternalContainer().eInverseRemove(this, DataContractDslPackage.DATA_CONTRACT_MODEL__ENUMERATIONS, DataContractModel.class, msgs);
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
            case DataContractDslPackage.ENUMERATION_DTO__LITERALS:
                return getLiterals();
            case DataContractDslPackage.ENUMERATION_DTO__BASE:
                if (resolve) return getBase();
                return basicGetBase();
            case DataContractDslPackage.ENUMERATION_DTO__DATACONTRACT_MODEL:
                return getDatacontractModel();
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
            case DataContractDslPackage.ENUMERATION_DTO__LITERALS:
                getLiterals().clear();
                getLiterals().addAll((Collection<? extends EnumerationDtoLiteral>)newValue);
                return;
            case DataContractDslPackage.ENUMERATION_DTO__BASE:
                setBase((ExternalReference)newValue);
                return;
            case DataContractDslPackage.ENUMERATION_DTO__DATACONTRACT_MODEL:
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
            case DataContractDslPackage.ENUMERATION_DTO__LITERALS:
                getLiterals().clear();
                return;
            case DataContractDslPackage.ENUMERATION_DTO__BASE:
                setBase((ExternalReference)null);
                return;
            case DataContractDslPackage.ENUMERATION_DTO__DATACONTRACT_MODEL:
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
            case DataContractDslPackage.ENUMERATION_DTO__LITERALS:
                return literals != null && !literals.isEmpty();
            case DataContractDslPackage.ENUMERATION_DTO__BASE:
                return base != null;
            case DataContractDslPackage.ENUMERATION_DTO__DATACONTRACT_MODEL:
                return getDatacontractModel() != null;
        }
        return super.eIsSet(featureID);
    }

} //EnumerationDtoImpl
