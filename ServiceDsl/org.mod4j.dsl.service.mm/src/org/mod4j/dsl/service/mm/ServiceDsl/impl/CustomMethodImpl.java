/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.service.mm.ServiceDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mendix.dsl.service.mm.ServiceDsl.CustomMethod;
import org.mendix.dsl.service.mm.ServiceDsl.DtoReference;
import org.mendix.dsl.service.mm.ServiceDsl.Parameter;
import org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.impl.CustomMethodImpl#getOutParameter <em>Out Parameter</em>}</li>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.impl.CustomMethodImpl#getInParameters <em>In Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomMethodImpl extends ServiceMethodImpl implements CustomMethod {
    /**
     * The cached value of the '{@link #getOutParameter() <em>Out Parameter</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutParameter()
     * @generated
     * @ordered
     */
    protected Parameter outParameter;

    /**
     * The cached value of the '{@link #getInParameters() <em>In Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInParameters()
     * @generated
     * @ordered
     */
    protected EList<Parameter> inParameters;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CustomMethodImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ServiceDslPackage.Literals.CUSTOM_METHOD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Parameter getOutParameter() {
        return outParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutParameter(Parameter newOutParameter, NotificationChain msgs) {
        Parameter oldOutParameter = outParameter;
        outParameter = newOutParameter;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServiceDslPackage.CUSTOM_METHOD__OUT_PARAMETER, oldOutParameter, newOutParameter);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutParameter(Parameter newOutParameter) {
        if (newOutParameter != outParameter) {
            NotificationChain msgs = null;
            if (outParameter != null)
                msgs = ((InternalEObject)outParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServiceDslPackage.CUSTOM_METHOD__OUT_PARAMETER, null, msgs);
            if (newOutParameter != null)
                msgs = ((InternalEObject)newOutParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServiceDslPackage.CUSTOM_METHOD__OUT_PARAMETER, null, msgs);
            msgs = basicSetOutParameter(newOutParameter, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServiceDslPackage.CUSTOM_METHOD__OUT_PARAMETER, newOutParameter, newOutParameter));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Parameter> getInParameters() {
        if (inParameters == null) {
            inParameters = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, ServiceDslPackage.CUSTOM_METHOD__IN_PARAMETERS, ServiceDslPackage.PARAMETER__METHOD);
        }
        return inParameters;
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
            case ServiceDslPackage.CUSTOM_METHOD__IN_PARAMETERS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInParameters()).basicAdd(otherEnd, msgs);
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
            case ServiceDslPackage.CUSTOM_METHOD__OUT_PARAMETER:
                return basicSetOutParameter(null, msgs);
            case ServiceDslPackage.CUSTOM_METHOD__IN_PARAMETERS:
                return ((InternalEList<?>)getInParameters()).basicRemove(otherEnd, msgs);
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
            case ServiceDslPackage.CUSTOM_METHOD__OUT_PARAMETER:
                return getOutParameter();
            case ServiceDslPackage.CUSTOM_METHOD__IN_PARAMETERS:
                return getInParameters();
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
            case ServiceDslPackage.CUSTOM_METHOD__OUT_PARAMETER:
                setOutParameter((Parameter)newValue);
                return;
            case ServiceDslPackage.CUSTOM_METHOD__IN_PARAMETERS:
                getInParameters().clear();
                getInParameters().addAll((Collection<? extends Parameter>)newValue);
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
            case ServiceDslPackage.CUSTOM_METHOD__OUT_PARAMETER:
                setOutParameter((Parameter)null);
                return;
            case ServiceDslPackage.CUSTOM_METHOD__IN_PARAMETERS:
                getInParameters().clear();
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
            case ServiceDslPackage.CUSTOM_METHOD__OUT_PARAMETER:
                return outParameter != null;
            case ServiceDslPackage.CUSTOM_METHOD__IN_PARAMETERS:
                return inParameters != null && !inParameters.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //CustomMethodImpl
