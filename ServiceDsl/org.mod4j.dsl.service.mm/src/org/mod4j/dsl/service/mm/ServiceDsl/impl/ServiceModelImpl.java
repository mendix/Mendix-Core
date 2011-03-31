/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.service.mm.ServiceDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mendix.dsl.service.mm.ServiceDsl.CrudService;
import org.mendix.dsl.service.mm.ServiceDsl.DtoReference;
import org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage;
import org.mendix.dsl.service.mm.ServiceDsl.ServiceMethod;
import org.mendix.dsl.service.mm.ServiceDsl.ServiceModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceModelImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceModelImpl#getDtoReferences <em>Dto References</em>}</li>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceModelImpl#getCrudServices <em>Crud Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceModelImpl extends ModelElementImpl implements ServiceModel {
    /**
     * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMethods()
     * @generated
     * @ordered
     */
    protected EList<ServiceMethod> methods;

    /**
     * The cached value of the '{@link #getDtoReferences() <em>Dto References</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtoReferences()
     * @generated
     * @ordered
     */
    protected EList<DtoReference> dtoReferences;

    /**
     * The cached value of the '{@link #getCrudServices() <em>Crud Services</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrudServices()
     * @generated
     * @ordered
     */
    protected EList<CrudService> crudServices;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ServiceDslPackage.Literals.SERVICE_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ServiceMethod> getMethods() {
        if (methods == null) {
            methods = new EObjectContainmentWithInverseEList<ServiceMethod>(ServiceMethod.class, this, ServiceDslPackage.SERVICE_MODEL__METHODS, ServiceDslPackage.SERVICE_METHOD__MODEL);
        }
        return methods;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DtoReference> getDtoReferences() {
        if (dtoReferences == null) {
            dtoReferences = new EObjectContainmentWithInverseEList<DtoReference>(DtoReference.class, this, ServiceDslPackage.SERVICE_MODEL__DTO_REFERENCES, ServiceDslPackage.DTO_REFERENCE__MODEL);
        }
        return dtoReferences;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CrudService> getCrudServices() {
        if (crudServices == null) {
            crudServices = new EObjectContainmentWithInverseEList<CrudService>(CrudService.class, this, ServiceDslPackage.SERVICE_MODEL__CRUD_SERVICES, ServiceDslPackage.CRUD_SERVICE__MODEL);
        }
        return crudServices;
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
            case ServiceDslPackage.SERVICE_MODEL__METHODS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethods()).basicAdd(otherEnd, msgs);
            case ServiceDslPackage.SERVICE_MODEL__DTO_REFERENCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getDtoReferences()).basicAdd(otherEnd, msgs);
            case ServiceDslPackage.SERVICE_MODEL__CRUD_SERVICES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrudServices()).basicAdd(otherEnd, msgs);
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
            case ServiceDslPackage.SERVICE_MODEL__METHODS:
                return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
            case ServiceDslPackage.SERVICE_MODEL__DTO_REFERENCES:
                return ((InternalEList<?>)getDtoReferences()).basicRemove(otherEnd, msgs);
            case ServiceDslPackage.SERVICE_MODEL__CRUD_SERVICES:
                return ((InternalEList<?>)getCrudServices()).basicRemove(otherEnd, msgs);
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
            case ServiceDslPackage.SERVICE_MODEL__METHODS:
                return getMethods();
            case ServiceDslPackage.SERVICE_MODEL__DTO_REFERENCES:
                return getDtoReferences();
            case ServiceDslPackage.SERVICE_MODEL__CRUD_SERVICES:
                return getCrudServices();
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
            case ServiceDslPackage.SERVICE_MODEL__METHODS:
                getMethods().clear();
                getMethods().addAll((Collection<? extends ServiceMethod>)newValue);
                return;
            case ServiceDslPackage.SERVICE_MODEL__DTO_REFERENCES:
                getDtoReferences().clear();
                getDtoReferences().addAll((Collection<? extends DtoReference>)newValue);
                return;
            case ServiceDslPackage.SERVICE_MODEL__CRUD_SERVICES:
                getCrudServices().clear();
                getCrudServices().addAll((Collection<? extends CrudService>)newValue);
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
            case ServiceDslPackage.SERVICE_MODEL__METHODS:
                getMethods().clear();
                return;
            case ServiceDslPackage.SERVICE_MODEL__DTO_REFERENCES:
                getDtoReferences().clear();
                return;
            case ServiceDslPackage.SERVICE_MODEL__CRUD_SERVICES:
                getCrudServices().clear();
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
            case ServiceDslPackage.SERVICE_MODEL__METHODS:
                return methods != null && !methods.isEmpty();
            case ServiceDslPackage.SERVICE_MODEL__DTO_REFERENCES:
                return dtoReferences != null && !dtoReferences.isEmpty();
            case ServiceDslPackage.SERVICE_MODEL__CRUD_SERVICES:
                return crudServices != null && !crudServices.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ServiceModelImpl
