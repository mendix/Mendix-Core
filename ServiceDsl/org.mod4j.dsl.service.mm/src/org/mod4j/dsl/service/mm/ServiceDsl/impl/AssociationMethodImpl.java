/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.service.mm.ServiceDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mendix.dsl.service.mm.ServiceDsl.AssociationMethod;
import org.mendix.dsl.service.mm.ServiceDsl.DtoReference;
import org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.impl.AssociationMethodImpl#getMain <em>Main</em>}</li>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.impl.AssociationMethodImpl#getPart <em>Part</em>}</li>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.impl.AssociationMethodImpl#getRolename <em>Rolename</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationMethodImpl extends ServiceMethodImpl implements AssociationMethod {
    /**
     * The cached value of the '{@link #getMain() <em>Main</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMain()
     * @generated
     * @ordered
     */
    protected DtoReference main;

    /**
     * The cached value of the '{@link #getPart() <em>Part</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPart()
     * @generated
     * @ordered
     */
    protected DtoReference part;

    /**
     * The default value of the '{@link #getRolename() <em>Rolename</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRolename()
     * @generated
     * @ordered
     */
    protected static final String ROLENAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRolename() <em>Rolename</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRolename()
     * @generated
     * @ordered
     */
    protected String rolename = ROLENAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssociationMethodImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ServiceDslPackage.Literals.ASSOCIATION_METHOD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtoReference getMain() {
        if (main != null && main.eIsProxy()) {
            InternalEObject oldMain = (InternalEObject)main;
            main = (DtoReference)eResolveProxy(oldMain);
            if (main != oldMain) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServiceDslPackage.ASSOCIATION_METHOD__MAIN, oldMain, main));
            }
        }
        return main;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtoReference basicGetMain() {
        return main;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMain(DtoReference newMain) {
        DtoReference oldMain = main;
        main = newMain;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServiceDslPackage.ASSOCIATION_METHOD__MAIN, oldMain, main));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtoReference getPart() {
        if (part != null && part.eIsProxy()) {
            InternalEObject oldPart = (InternalEObject)part;
            part = (DtoReference)eResolveProxy(oldPart);
            if (part != oldPart) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServiceDslPackage.ASSOCIATION_METHOD__PART, oldPart, part));
            }
        }
        return part;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtoReference basicGetPart() {
        return part;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPart(DtoReference newPart) {
        DtoReference oldPart = part;
        part = newPart;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServiceDslPackage.ASSOCIATION_METHOD__PART, oldPart, part));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRolename(String newRolename) {
        String oldRolename = rolename;
        rolename = newRolename;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServiceDslPackage.ASSOCIATION_METHOD__ROLENAME, oldRolename, rolename));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ServiceDslPackage.ASSOCIATION_METHOD__MAIN:
                if (resolve) return getMain();
                return basicGetMain();
            case ServiceDslPackage.ASSOCIATION_METHOD__PART:
                if (resolve) return getPart();
                return basicGetPart();
            case ServiceDslPackage.ASSOCIATION_METHOD__ROLENAME:
                return getRolename();
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
            case ServiceDslPackage.ASSOCIATION_METHOD__MAIN:
                setMain((DtoReference)newValue);
                return;
            case ServiceDslPackage.ASSOCIATION_METHOD__PART:
                setPart((DtoReference)newValue);
                return;
            case ServiceDslPackage.ASSOCIATION_METHOD__ROLENAME:
                setRolename((String)newValue);
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
            case ServiceDslPackage.ASSOCIATION_METHOD__MAIN:
                setMain((DtoReference)null);
                return;
            case ServiceDslPackage.ASSOCIATION_METHOD__PART:
                setPart((DtoReference)null);
                return;
            case ServiceDslPackage.ASSOCIATION_METHOD__ROLENAME:
                setRolename(ROLENAME_EDEFAULT);
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
            case ServiceDslPackage.ASSOCIATION_METHOD__MAIN:
                return main != null;
            case ServiceDslPackage.ASSOCIATION_METHOD__PART:
                return part != null;
            case ServiceDslPackage.ASSOCIATION_METHOD__ROLENAME:
                return ROLENAME_EDEFAULT == null ? rolename != null : !ROLENAME_EDEFAULT.equals(rolename);
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
        result.append(" (rolename: ");
        result.append(rolename);
        result.append(')');
        return result.toString();
    }

} //AssociationMethodImpl
