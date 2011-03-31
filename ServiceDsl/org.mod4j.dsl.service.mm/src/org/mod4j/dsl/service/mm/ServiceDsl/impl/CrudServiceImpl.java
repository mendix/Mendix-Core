/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.service.mm.ServiceDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.mendix.dsl.service.mm.ServiceDsl.CrudService;
import org.mendix.dsl.service.mm.ServiceDsl.DtoReference;
import org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage;
import org.mendix.dsl.service.mm.ServiceDsl.ServiceModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crud Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.impl.CrudServiceImpl#getDto <em>Dto</em>}</li>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.impl.CrudServiceImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CrudServiceImpl extends ModelElementImpl implements CrudService {
    /**
     * The cached value of the '{@link #getDto() <em>Dto</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDto()
     * @generated
     * @ordered
     */
    protected DtoReference dto;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CrudServiceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ServiceDslPackage.Literals.CRUD_SERVICE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtoReference getDto() {
        if (dto != null && dto.eIsProxy()) {
            InternalEObject oldDto = (InternalEObject)dto;
            dto = (DtoReference)eResolveProxy(oldDto);
            if (dto != oldDto) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServiceDslPackage.CRUD_SERVICE__DTO, oldDto, dto));
            }
        }
        return dto;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtoReference basicGetDto() {
        return dto;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDto(DtoReference newDto) {
        DtoReference oldDto = dto;
        dto = newDto;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServiceDslPackage.CRUD_SERVICE__DTO, oldDto, dto));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceModel getModel() {
        if (eContainerFeatureID() != ServiceDslPackage.CRUD_SERVICE__MODEL) return null;
        return (ServiceModel)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(ServiceModel newModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newModel, ServiceDslPackage.CRUD_SERVICE__MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(ServiceModel newModel) {
        if (newModel != eInternalContainer() || (eContainerFeatureID() != ServiceDslPackage.CRUD_SERVICE__MODEL && newModel != null)) {
            if (EcoreUtil.isAncestor(this, newModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, ServiceDslPackage.SERVICE_MODEL__CRUD_SERVICES, ServiceModel.class, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServiceDslPackage.CRUD_SERVICE__MODEL, newModel, newModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ServiceDslPackage.CRUD_SERVICE__MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetModel((ServiceModel)otherEnd, msgs);
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
            case ServiceDslPackage.CRUD_SERVICE__MODEL:
                return basicSetModel(null, msgs);
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
            case ServiceDslPackage.CRUD_SERVICE__MODEL:
                return eInternalContainer().eInverseRemove(this, ServiceDslPackage.SERVICE_MODEL__CRUD_SERVICES, ServiceModel.class, msgs);
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
            case ServiceDslPackage.CRUD_SERVICE__DTO:
                if (resolve) return getDto();
                return basicGetDto();
            case ServiceDslPackage.CRUD_SERVICE__MODEL:
                return getModel();
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
            case ServiceDslPackage.CRUD_SERVICE__DTO:
                setDto((DtoReference)newValue);
                return;
            case ServiceDslPackage.CRUD_SERVICE__MODEL:
                setModel((ServiceModel)newValue);
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
            case ServiceDslPackage.CRUD_SERVICE__DTO:
                setDto((DtoReference)null);
                return;
            case ServiceDslPackage.CRUD_SERVICE__MODEL:
                setModel((ServiceModel)null);
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
            case ServiceDslPackage.CRUD_SERVICE__DTO:
                return dto != null;
            case ServiceDslPackage.CRUD_SERVICE__MODEL:
                return getModel() != null;
        }
        return super.eIsSet(featureID);
    }

} //CrudServiceImpl
