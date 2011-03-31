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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mendix.crossx.mm.crossx.CrossxPackage;
import org.mendix.crossx.mm.crossx.ModelInfo;
import org.mendix.crossx.mm.crossx.Symbol;
import org.mendix.crossx.mm.crossx.SymbolProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mendix.crossx.mm.crossx.impl.SymbolImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mendix.crossx.mm.crossx.impl.SymbolImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.mendix.crossx.mm.crossx.impl.SymbolImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mendix.crossx.mm.crossx.impl.SymbolImpl#getSubSymbols <em>Sub Symbols</em>}</li>
 *   <li>{@link org.mendix.crossx.mm.crossx.impl.SymbolImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.mendix.crossx.mm.crossx.impl.SymbolImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymbolImpl extends EObjectImpl implements Symbol {
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
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected EList<SymbolProperty> properties;

    /**
     * The cached value of the '{@link #getSubSymbols() <em>Sub Symbols</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubSymbols()
     * @generated
     * @ordered
     */
    protected EList<Symbol> subSymbols;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SymbolImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CrossxPackage.Literals.SYMBOL;
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
            eNotify(new ENotificationImpl(this, Notification.SET, CrossxPackage.SYMBOL__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CrossxPackage.SYMBOL__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SymbolProperty> getProperties() {
        if (properties == null) {
            properties = new EObjectContainmentEList<SymbolProperty>(SymbolProperty.class, this, CrossxPackage.SYMBOL__PROPERTIES);
        }
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Symbol> getSubSymbols() {
        if (subSymbols == null) {
            subSymbols = new EObjectContainmentWithInverseEList<Symbol>(Symbol.class, this, CrossxPackage.SYMBOL__SUB_SYMBOLS, CrossxPackage.SYMBOL__PARENT);
        }
        return subSymbols;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelInfo getOwner() {
        if (eContainerFeatureID() != CrossxPackage.SYMBOL__OWNER) return null;
        return (ModelInfo)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwner(ModelInfo newOwner, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOwner, CrossxPackage.SYMBOL__OWNER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwner(ModelInfo newOwner) {
        if (newOwner != eInternalContainer() || (eContainerFeatureID() != CrossxPackage.SYMBOL__OWNER && newOwner != null)) {
            if (EcoreUtil.isAncestor(this, newOwner))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newOwner != null)
                msgs = ((InternalEObject)newOwner).eInverseAdd(this, CrossxPackage.MODEL_INFO__SYMBOLS, ModelInfo.class, msgs);
            msgs = basicSetOwner(newOwner, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CrossxPackage.SYMBOL__OWNER, newOwner, newOwner));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Symbol getParent() {
        if (eContainerFeatureID() != CrossxPackage.SYMBOL__PARENT) return null;
        return (Symbol)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParent(Symbol newParent, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParent, CrossxPackage.SYMBOL__PARENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParent(Symbol newParent) {
        if (newParent != eInternalContainer() || (eContainerFeatureID() != CrossxPackage.SYMBOL__PARENT && newParent != null)) {
            if (EcoreUtil.isAncestor(this, newParent))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParent != null)
                msgs = ((InternalEObject)newParent).eInverseAdd(this, CrossxPackage.SYMBOL__SUB_SYMBOLS, Symbol.class, msgs);
            msgs = basicSetParent(newParent, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CrossxPackage.SYMBOL__PARENT, newParent, newParent));
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
            case CrossxPackage.SYMBOL__SUB_SYMBOLS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubSymbols()).basicAdd(otherEnd, msgs);
            case CrossxPackage.SYMBOL__OWNER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOwner((ModelInfo)otherEnd, msgs);
            case CrossxPackage.SYMBOL__PARENT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParent((Symbol)otherEnd, msgs);
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
            case CrossxPackage.SYMBOL__PROPERTIES:
                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
            case CrossxPackage.SYMBOL__SUB_SYMBOLS:
                return ((InternalEList<?>)getSubSymbols()).basicRemove(otherEnd, msgs);
            case CrossxPackage.SYMBOL__OWNER:
                return basicSetOwner(null, msgs);
            case CrossxPackage.SYMBOL__PARENT:
                return basicSetParent(null, msgs);
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
            case CrossxPackage.SYMBOL__OWNER:
                return eInternalContainer().eInverseRemove(this, CrossxPackage.MODEL_INFO__SYMBOLS, ModelInfo.class, msgs);
            case CrossxPackage.SYMBOL__PARENT:
                return eInternalContainer().eInverseRemove(this, CrossxPackage.SYMBOL__SUB_SYMBOLS, Symbol.class, msgs);
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
            case CrossxPackage.SYMBOL__NAME:
                return getName();
            case CrossxPackage.SYMBOL__TYPE:
                return getType();
            case CrossxPackage.SYMBOL__PROPERTIES:
                return getProperties();
            case CrossxPackage.SYMBOL__SUB_SYMBOLS:
                return getSubSymbols();
            case CrossxPackage.SYMBOL__OWNER:
                return getOwner();
            case CrossxPackage.SYMBOL__PARENT:
                return getParent();
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
            case CrossxPackage.SYMBOL__NAME:
                setName((String)newValue);
                return;
            case CrossxPackage.SYMBOL__TYPE:
                setType((String)newValue);
                return;
            case CrossxPackage.SYMBOL__PROPERTIES:
                getProperties().clear();
                getProperties().addAll((Collection<? extends SymbolProperty>)newValue);
                return;
            case CrossxPackage.SYMBOL__SUB_SYMBOLS:
                getSubSymbols().clear();
                getSubSymbols().addAll((Collection<? extends Symbol>)newValue);
                return;
            case CrossxPackage.SYMBOL__OWNER:
                setOwner((ModelInfo)newValue);
                return;
            case CrossxPackage.SYMBOL__PARENT:
                setParent((Symbol)newValue);
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
            case CrossxPackage.SYMBOL__NAME:
                setName(NAME_EDEFAULT);
                return;
            case CrossxPackage.SYMBOL__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case CrossxPackage.SYMBOL__PROPERTIES:
                getProperties().clear();
                return;
            case CrossxPackage.SYMBOL__SUB_SYMBOLS:
                getSubSymbols().clear();
                return;
            case CrossxPackage.SYMBOL__OWNER:
                setOwner((ModelInfo)null);
                return;
            case CrossxPackage.SYMBOL__PARENT:
                setParent((Symbol)null);
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
            case CrossxPackage.SYMBOL__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case CrossxPackage.SYMBOL__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case CrossxPackage.SYMBOL__PROPERTIES:
                return properties != null && !properties.isEmpty();
            case CrossxPackage.SYMBOL__SUB_SYMBOLS:
                return subSymbols != null && !subSymbols.isEmpty();
            case CrossxPackage.SYMBOL__OWNER:
                return getOwner() != null;
            case CrossxPackage.SYMBOL__PARENT:
                return getParent() != null;
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
        result.append(", type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //SymbolImpl
