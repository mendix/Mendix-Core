/**
 * (c) Mod4j and contributors
 *
 * $Id$
 */
package org.mendix.crossx.mm.crossx.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mendix.crossx.mm.crossx.CrossxPackage;
import org.mendix.crossx.mm.crossx.ModelInfo;
import org.mendix.crossx.mm.crossx.Symbol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mendix.crossx.mm.crossx.impl.ModelInfoImpl#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link org.mendix.crossx.mm.crossx.impl.ModelInfoImpl#getLastChanged <em>Last Changed</em>}</li>
 *   <li>{@link org.mendix.crossx.mm.crossx.impl.ModelInfoImpl#getModelname <em>Modelname</em>}</li>
 *   <li>{@link org.mendix.crossx.mm.crossx.impl.ModelInfoImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.mendix.crossx.mm.crossx.impl.ModelInfoImpl#getDslname <em>Dslname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelInfoImpl extends EObjectImpl implements ModelInfo {
    /**
     * The cached value of the '{@link #getSymbols() <em>Symbols</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSymbols()
     * @generated
     * @ordered
     */
    protected EList<Symbol> symbols;

    /**
     * The default value of the '{@link #getLastChanged() <em>Last Changed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastChanged()
     * @generated
     * @ordered
     */
    protected static final String LAST_CHANGED_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getLastChanged() <em>Last Changed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastChanged()
     * @generated
     * @ordered
     */
    protected String lastChanged = LAST_CHANGED_EDEFAULT;

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
     * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResource()
     * @generated
     * @ordered
     */
    protected static final String RESOURCE_EDEFAULT = "[unknown]";

    /**
     * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResource()
     * @generated
     * @ordered
     */
    protected String resource = RESOURCE_EDEFAULT;

    /**
     * The default value of the '{@link #getDslname() <em>Dslname</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDslname()
     * @generated
     * @ordered
     */
    protected static final String DSLNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDslname() <em>Dslname</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDslname()
     * @generated
     * @ordered
     */
    protected String dslname = DSLNAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModelInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CrossxPackage.Literals.MODEL_INFO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Symbol> getSymbols() {
        if (symbols == null) {
            symbols = new EObjectContainmentWithInverseEList<Symbol>(Symbol.class, this, CrossxPackage.MODEL_INFO__SYMBOLS, CrossxPackage.SYMBOL__OWNER);
        }
        return symbols;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLastChanged() {
        return lastChanged;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLastChanged(String newLastChanged) {
        String oldLastChanged = lastChanged;
        lastChanged = newLastChanged;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CrossxPackage.MODEL_INFO__LAST_CHANGED, oldLastChanged, lastChanged));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CrossxPackage.MODEL_INFO__MODELNAME, oldModelname, modelname));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getResource() {
        return resource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResource(String newResource) {
        String oldResource = resource;
        resource = newResource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CrossxPackage.MODEL_INFO__RESOURCE, oldResource, resource));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDslname() {
        return dslname;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDslname(String newDslname) {
        String oldDslname = dslname;
        dslname = newDslname;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CrossxPackage.MODEL_INFO__DSLNAME, oldDslname, dslname));
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
            case CrossxPackage.MODEL_INFO__SYMBOLS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSymbols()).basicAdd(otherEnd, msgs);
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
            case CrossxPackage.MODEL_INFO__SYMBOLS:
                return ((InternalEList<?>)getSymbols()).basicRemove(otherEnd, msgs);
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
            case CrossxPackage.MODEL_INFO__SYMBOLS:
                return getSymbols();
            case CrossxPackage.MODEL_INFO__LAST_CHANGED:
                return getLastChanged();
            case CrossxPackage.MODEL_INFO__MODELNAME:
                return getModelname();
            case CrossxPackage.MODEL_INFO__RESOURCE:
                return getResource();
            case CrossxPackage.MODEL_INFO__DSLNAME:
                return getDslname();
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
            case CrossxPackage.MODEL_INFO__SYMBOLS:
                getSymbols().clear();
                getSymbols().addAll((Collection<? extends Symbol>)newValue);
                return;
            case CrossxPackage.MODEL_INFO__LAST_CHANGED:
                setLastChanged((String)newValue);
                return;
            case CrossxPackage.MODEL_INFO__MODELNAME:
                setModelname((String)newValue);
                return;
            case CrossxPackage.MODEL_INFO__RESOURCE:
                setResource((String)newValue);
                return;
            case CrossxPackage.MODEL_INFO__DSLNAME:
                setDslname((String)newValue);
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
            case CrossxPackage.MODEL_INFO__SYMBOLS:
                getSymbols().clear();
                return;
            case CrossxPackage.MODEL_INFO__LAST_CHANGED:
                setLastChanged(LAST_CHANGED_EDEFAULT);
                return;
            case CrossxPackage.MODEL_INFO__MODELNAME:
                setModelname(MODELNAME_EDEFAULT);
                return;
            case CrossxPackage.MODEL_INFO__RESOURCE:
                setResource(RESOURCE_EDEFAULT);
                return;
            case CrossxPackage.MODEL_INFO__DSLNAME:
                setDslname(DSLNAME_EDEFAULT);
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
            case CrossxPackage.MODEL_INFO__SYMBOLS:
                return symbols != null && !symbols.isEmpty();
            case CrossxPackage.MODEL_INFO__LAST_CHANGED:
                return LAST_CHANGED_EDEFAULT == null ? lastChanged != null : !LAST_CHANGED_EDEFAULT.equals(lastChanged);
            case CrossxPackage.MODEL_INFO__MODELNAME:
                return MODELNAME_EDEFAULT == null ? modelname != null : !MODELNAME_EDEFAULT.equals(modelname);
            case CrossxPackage.MODEL_INFO__RESOURCE:
                return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
            case CrossxPackage.MODEL_INFO__DSLNAME:
                return DSLNAME_EDEFAULT == null ? dslname != null : !DSLNAME_EDEFAULT.equals(dslname);
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
        result.append(" (lastChanged: ");
        result.append(lastChanged);
        result.append(", modelname: ");
        result.append(modelname);
        result.append(", resource: ");
        result.append(resource);
        result.append(", dslname: ");
        result.append(dslname);
        result.append(')');
        return result.toString();
    }

} //ModelInfoImpl
