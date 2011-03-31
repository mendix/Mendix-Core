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

import org.mendix.dsl.service.mm.ServiceDsl.DtoReference;
import org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage;
import org.mendix.dsl.service.mm.ServiceDsl.ServiceModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dto Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.impl.DtoReferenceImpl#getModelname <em>Modelname</em>}</li>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.impl.DtoReferenceImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DtoReferenceImpl extends ModelElementImpl implements DtoReference {
    /**
     * The default value of the '{@link #getModelname() <em>Modelname</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelname()
     * @generated
     * @ordered
     */
    protected static final String MODELNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getModelname() <em>Modelname</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelname()
     * @generated
     * @ordered
     */
    protected String modelname = MODELNAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DtoReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ServiceDslPackage.Literals.DTO_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getModelname() {
        return modelname;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModelname(String newModelname) {
        String oldModelname = modelname;
        modelname = newModelname;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServiceDslPackage.DTO_REFERENCE__MODELNAME, oldModelname, modelname));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceModel getModel() {
        if (eContainerFeatureID() != ServiceDslPackage.DTO_REFERENCE__MODEL) return null;
        return (ServiceModel)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(ServiceModel newModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newModel, ServiceDslPackage.DTO_REFERENCE__MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(ServiceModel newModel) {
        if (newModel != eInternalContainer() || (eContainerFeatureID() != ServiceDslPackage.DTO_REFERENCE__MODEL && newModel != null)) {
            if (EcoreUtil.isAncestor(this, newModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, ServiceDslPackage.SERVICE_MODEL__DTO_REFERENCES, ServiceModel.class, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServiceDslPackage.DTO_REFERENCE__MODEL, newModel, newModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ServiceDslPackage.DTO_REFERENCE__MODEL:
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
            case ServiceDslPackage.DTO_REFERENCE__MODEL:
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
            case ServiceDslPackage.DTO_REFERENCE__MODEL:
                return eInternalContainer().eInverseRemove(this, ServiceDslPackage.SERVICE_MODEL__DTO_REFERENCES, ServiceModel.class, msgs);
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
            case ServiceDslPackage.DTO_REFERENCE__MODELNAME:
                return getModelname();
            case ServiceDslPackage.DTO_REFERENCE__MODEL:
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
            case ServiceDslPackage.DTO_REFERENCE__MODELNAME:
                setModelname((String)newValue);
                return;
            case ServiceDslPackage.DTO_REFERENCE__MODEL:
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
            case ServiceDslPackage.DTO_REFERENCE__MODELNAME:
                setModelname(MODELNAME_EDEFAULT);
                return;
            case ServiceDslPackage.DTO_REFERENCE__MODEL:
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
            case ServiceDslPackage.DTO_REFERENCE__MODELNAME:
                return MODELNAME_EDEFAULT == null ? modelname != null : !MODELNAME_EDEFAULT.equals(modelname);
            case ServiceDslPackage.DTO_REFERENCE__MODEL:
                return getModel() != null;
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
        result.append(" (modelname: ");
        result.append(modelname);
        result.append(')');
        return result.toString();
    }

} //DtoReferenceImpl
