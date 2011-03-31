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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mendix.crossx.mm.crossx.CrossxPackage;
import org.mendix.crossx.mm.crossx.SymbolProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mendix.crossx.mm.crossx.impl.SymbolPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mendix.crossx.mm.crossx.impl.SymbolPropertyImpl#getSubProperties <em>Sub Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymbolPropertyImpl extends EObjectImpl implements SymbolProperty {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getSubProperties() <em>Sub Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubProperties()
     * @generated
     * @ordered
     */
    protected EList<SymbolProperty> subProperties;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SymbolPropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CrossxPackage.Literals.SYMBOL_PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CrossxPackage.SYMBOL_PROPERTY__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SymbolProperty> getSubProperties() {
        if (subProperties == null) {
            subProperties = new EObjectContainmentEList<SymbolProperty>(SymbolProperty.class, this, CrossxPackage.SYMBOL_PROPERTY__SUB_PROPERTIES);
        }
        return subProperties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CrossxPackage.SYMBOL_PROPERTY__SUB_PROPERTIES:
                return ((InternalEList<?>)getSubProperties()).basicRemove(otherEnd, msgs);
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
            case CrossxPackage.SYMBOL_PROPERTY__NAME:
                return getName();
            case CrossxPackage.SYMBOL_PROPERTY__SUB_PROPERTIES:
                return getSubProperties();
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
            case CrossxPackage.SYMBOL_PROPERTY__NAME:
                setName((String)newValue);
                return;
            case CrossxPackage.SYMBOL_PROPERTY__SUB_PROPERTIES:
                getSubProperties().clear();
                getSubProperties().addAll((Collection<? extends SymbolProperty>)newValue);
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
            case CrossxPackage.SYMBOL_PROPERTY__NAME:
                setName(NAME_EDEFAULT);
                return;
            case CrossxPackage.SYMBOL_PROPERTY__SUB_PROPERTIES:
                getSubProperties().clear();
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
            case CrossxPackage.SYMBOL_PROPERTY__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case CrossxPackage.SYMBOL_PROPERTY__SUB_PROPERTIES:
                return subProperties != null && !subProperties.isEmpty();
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
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //SymbolPropertyImpl
