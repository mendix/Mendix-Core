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

import org.mendix.dsl.service.mm.ServiceDsl.CollectionType;
import org.mendix.dsl.service.mm.ServiceDsl.CustomMethod;
import org.mendix.dsl.service.mm.ServiceDsl.DtoReference;
import org.mendix.dsl.service.mm.ServiceDsl.Parameter;
import org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.impl.ParameterImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.impl.ParameterImpl#getCollection <em>Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends ModelElementImpl implements Parameter {
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected DtoReference type;

    /**
     * The default value of the '{@link #getCollection() <em>Collection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCollection()
     * @generated
     * @ordered
     */
    protected static final CollectionType COLLECTION_EDEFAULT = CollectionType.SINGLE;
    /**
     * The cached value of the '{@link #getCollection() <em>Collection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCollection()
     * @generated
     * @ordered
     */
    protected CollectionType collection = COLLECTION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ServiceDslPackage.Literals.PARAMETER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtoReference getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (DtoReference)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServiceDslPackage.PARAMETER__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtoReference basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(DtoReference newType) {
        DtoReference oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServiceDslPackage.PARAMETER__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CustomMethod getMethod() {
        if (eContainerFeatureID() != ServiceDslPackage.PARAMETER__METHOD) return null;
        return (CustomMethod)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMethod(CustomMethod newMethod, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newMethod, ServiceDslPackage.PARAMETER__METHOD, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMethod(CustomMethod newMethod) {
        if (newMethod != eInternalContainer() || (eContainerFeatureID() != ServiceDslPackage.PARAMETER__METHOD && newMethod != null)) {
            if (EcoreUtil.isAncestor(this, newMethod))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newMethod != null)
                msgs = ((InternalEObject)newMethod).eInverseAdd(this, ServiceDslPackage.CUSTOM_METHOD__IN_PARAMETERS, CustomMethod.class, msgs);
            msgs = basicSetMethod(newMethod, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServiceDslPackage.PARAMETER__METHOD, newMethod, newMethod));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CollectionType getCollection() {
        return collection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCollection(CollectionType newCollection) {
        CollectionType oldCollection = collection;
        collection = newCollection == null ? COLLECTION_EDEFAULT : newCollection;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServiceDslPackage.PARAMETER__COLLECTION, oldCollection, collection));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ServiceDslPackage.PARAMETER__METHOD:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetMethod((CustomMethod)otherEnd, msgs);
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
            case ServiceDslPackage.PARAMETER__METHOD:
                return basicSetMethod(null, msgs);
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
            case ServiceDslPackage.PARAMETER__METHOD:
                return eInternalContainer().eInverseRemove(this, ServiceDslPackage.CUSTOM_METHOD__IN_PARAMETERS, CustomMethod.class, msgs);
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
            case ServiceDslPackage.PARAMETER__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case ServiceDslPackage.PARAMETER__METHOD:
                return getMethod();
            case ServiceDslPackage.PARAMETER__COLLECTION:
                return getCollection();
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
            case ServiceDslPackage.PARAMETER__TYPE:
                setType((DtoReference)newValue);
                return;
            case ServiceDslPackage.PARAMETER__METHOD:
                setMethod((CustomMethod)newValue);
                return;
            case ServiceDslPackage.PARAMETER__COLLECTION:
                setCollection((CollectionType)newValue);
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
            case ServiceDslPackage.PARAMETER__TYPE:
                setType((DtoReference)null);
                return;
            case ServiceDslPackage.PARAMETER__METHOD:
                setMethod((CustomMethod)null);
                return;
            case ServiceDslPackage.PARAMETER__COLLECTION:
                setCollection(COLLECTION_EDEFAULT);
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
            case ServiceDslPackage.PARAMETER__TYPE:
                return type != null;
            case ServiceDslPackage.PARAMETER__METHOD:
                return getMethod() != null;
            case ServiceDslPackage.PARAMETER__COLLECTION:
                return collection != COLLECTION_EDEFAULT;
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
        result.append(" (collection: ");
        result.append(collection);
        result.append(')');
        return result.toString();
    }

} //ParameterImpl
