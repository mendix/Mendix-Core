/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.datacontract.mm.DataContractDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDataProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dto Data Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoDataPropertyImpl#isHasDefault <em>Has Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DtoDataPropertyImpl extends DtoPropertyImpl implements DtoDataProperty {
	/**
     * The default value of the '{@link #isHasDefault() <em>Has Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isHasDefault()
     * @generated
     * @ordered
     */
    protected static final boolean HAS_DEFAULT_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isHasDefault() <em>Has Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isHasDefault()
     * @generated
     * @ordered
     */
    protected boolean hasDefault = HAS_DEFAULT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected DtoDataPropertyImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return DataContractDslPackage.Literals.DTO_DATA_PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isHasDefault() {
        return hasDefault;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHasDefault(boolean newHasDefault) {
        boolean oldHasDefault = hasDefault;
        hasDefault = newHasDefault;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataContractDslPackage.DTO_DATA_PROPERTY__HAS_DEFAULT, oldHasDefault, hasDefault));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DataContractDslPackage.DTO_DATA_PROPERTY__HAS_DEFAULT:
                return isHasDefault();
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
            case DataContractDslPackage.DTO_DATA_PROPERTY__HAS_DEFAULT:
                setHasDefault((Boolean)newValue);
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
            case DataContractDslPackage.DTO_DATA_PROPERTY__HAS_DEFAULT:
                setHasDefault(HAS_DEFAULT_EDEFAULT);
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
            case DataContractDslPackage.DTO_DATA_PROPERTY__HAS_DEFAULT:
                return hasDefault != HAS_DEFAULT_EDEFAULT;
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
        result.append(" (hasDefault: ");
        result.append(hasDefault);
        result.append(')');
        return result.toString();
    }

} //DtoDataPropertyImpl
