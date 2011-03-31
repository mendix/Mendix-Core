/**
 * (c) Mod4j and contributors
 *
 * $Id$
 */
package org.mendix.crossx.mm.crossx.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mendix.crossx.mm.crossx.CrossxPackage;
import org.mendix.crossx.mm.crossx.ReferenceSymbolProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Symbol Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mendix.crossx.mm.crossx.impl.ReferenceSymbolPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.mendix.crossx.mm.crossx.impl.ReferenceSymbolPropertyImpl#getModelname <em>Modelname</em>}</li>
 *   <li>{@link org.mendix.crossx.mm.crossx.impl.ReferenceSymbolPropertyImpl#getSymbolname <em>Symbolname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceSymbolPropertyImpl extends SymbolPropertyImpl implements ReferenceSymbolProperty {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

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
     * The default value of the '{@link #getSymbolname() <em>Symbolname</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSymbolname()
     * @generated
     * @ordered
     */
    protected static final String SYMBOLNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSymbolname() <em>Symbolname</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSymbolname()
     * @generated
     * @ordered
     */
    protected String symbolname = SYMBOLNAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReferenceSymbolPropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CrossxPackage.Literals.REFERENCE_SYMBOL_PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CrossxPackage.REFERENCE_SYMBOL_PROPERTY__TYPE, oldType, type));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CrossxPackage.REFERENCE_SYMBOL_PROPERTY__MODELNAME, oldModelname, modelname));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSymbolname() {
        return symbolname;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSymbolname(String newSymbolname) {
        String oldSymbolname = symbolname;
        symbolname = newSymbolname;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CrossxPackage.REFERENCE_SYMBOL_PROPERTY__SYMBOLNAME, oldSymbolname, symbolname));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CrossxPackage.REFERENCE_SYMBOL_PROPERTY__TYPE:
                return getType();
            case CrossxPackage.REFERENCE_SYMBOL_PROPERTY__MODELNAME:
                return getModelname();
            case CrossxPackage.REFERENCE_SYMBOL_PROPERTY__SYMBOLNAME:
                return getSymbolname();
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
            case CrossxPackage.REFERENCE_SYMBOL_PROPERTY__TYPE:
                setType((String)newValue);
                return;
            case CrossxPackage.REFERENCE_SYMBOL_PROPERTY__MODELNAME:
                setModelname((String)newValue);
                return;
            case CrossxPackage.REFERENCE_SYMBOL_PROPERTY__SYMBOLNAME:
                setSymbolname((String)newValue);
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
            case CrossxPackage.REFERENCE_SYMBOL_PROPERTY__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case CrossxPackage.REFERENCE_SYMBOL_PROPERTY__MODELNAME:
                setModelname(MODELNAME_EDEFAULT);
                return;
            case CrossxPackage.REFERENCE_SYMBOL_PROPERTY__SYMBOLNAME:
                setSymbolname(SYMBOLNAME_EDEFAULT);
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
            case CrossxPackage.REFERENCE_SYMBOL_PROPERTY__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case CrossxPackage.REFERENCE_SYMBOL_PROPERTY__MODELNAME:
                return MODELNAME_EDEFAULT == null ? modelname != null : !MODELNAME_EDEFAULT.equals(modelname);
            case CrossxPackage.REFERENCE_SYMBOL_PROPERTY__SYMBOLNAME:
                return SYMBOLNAME_EDEFAULT == null ? symbolname != null : !SYMBOLNAME_EDEFAULT.equals(symbolname);
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
        result.append(" (type: ");
        result.append(type);
        result.append(", modelname: ");
        result.append(modelname);
        result.append(", symbolname: ");
        result.append(symbolname);
        result.append(')');
        return result.toString();
    }

} //ReferenceSymbolPropertyImpl
