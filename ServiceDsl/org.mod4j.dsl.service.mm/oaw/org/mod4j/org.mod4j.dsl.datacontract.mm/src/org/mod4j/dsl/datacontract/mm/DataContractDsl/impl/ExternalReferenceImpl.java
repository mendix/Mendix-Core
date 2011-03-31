/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.datacontract.mm.DataContractDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel;
import org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.ExternalReferenceImpl#getModelname <em>Modelname</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.ExternalReferenceImpl#getDatacontractModel <em>Datacontract Model</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.ExternalReferenceImpl#getKeyword <em>Keyword</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalReferenceImpl extends ModelElementImpl implements ExternalReference {
	/**
     * The default value of the '{@link #getModelname() <em>Modelname</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getModelname()
     * @generated
     * @ordered
     */
	protected static final String MODELNAME_EDEFAULT = "";

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
     * The default value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeyword()
     * @generated
     * @ordered
     */
    protected static final String KEYWORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeyword()
     * @generated
     * @ordered
     */
    protected String keyword = KEYWORD_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ExternalReferenceImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return DataContractDslPackage.Literals.EXTERNAL_REFERENCE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, DataContractDslPackage.EXTERNAL_REFERENCE__MODELNAME, oldModelname, modelname));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DataContractModel getDatacontractModel() {
        if (eContainerFeatureID() != DataContractDslPackage.EXTERNAL_REFERENCE__DATACONTRACT_MODEL) return null;
        return (DataContractModel)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetDatacontractModel(DataContractModel newDatacontractModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newDatacontractModel, DataContractDslPackage.EXTERNAL_REFERENCE__DATACONTRACT_MODEL, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDatacontractModel(DataContractModel newDatacontractModel) {
        if (newDatacontractModel != eInternalContainer() || (eContainerFeatureID() != DataContractDslPackage.EXTERNAL_REFERENCE__DATACONTRACT_MODEL && newDatacontractModel != null)) {
            if (EcoreUtil.isAncestor(this, newDatacontractModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDatacontractModel != null)
                msgs = ((InternalEObject)newDatacontractModel).eInverseAdd(this, DataContractDslPackage.DATA_CONTRACT_MODEL__EXTERNAL_REFERENCES, DataContractModel.class, msgs);
            msgs = basicSetDatacontractModel(newDatacontractModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataContractDslPackage.EXTERNAL_REFERENCE__DATACONTRACT_MODEL, newDatacontractModel, newDatacontractModel));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKeyword(String newKeyword) {
        String oldKeyword = keyword;
        keyword = newKeyword;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataContractDslPackage.EXTERNAL_REFERENCE__KEYWORD, oldKeyword, keyword));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DataContractDslPackage.EXTERNAL_REFERENCE__DATACONTRACT_MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetDatacontractModel((DataContractModel)otherEnd, msgs);
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
            case DataContractDslPackage.EXTERNAL_REFERENCE__DATACONTRACT_MODEL:
                return basicSetDatacontractModel(null, msgs);
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
            case DataContractDslPackage.EXTERNAL_REFERENCE__DATACONTRACT_MODEL:
                return eInternalContainer().eInverseRemove(this, DataContractDslPackage.DATA_CONTRACT_MODEL__EXTERNAL_REFERENCES, DataContractModel.class, msgs);
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
            case DataContractDslPackage.EXTERNAL_REFERENCE__MODELNAME:
                return getModelname();
            case DataContractDslPackage.EXTERNAL_REFERENCE__DATACONTRACT_MODEL:
                return getDatacontractModel();
            case DataContractDslPackage.EXTERNAL_REFERENCE__KEYWORD:
                return getKeyword();
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
            case DataContractDslPackage.EXTERNAL_REFERENCE__MODELNAME:
                setModelname((String)newValue);
                return;
            case DataContractDslPackage.EXTERNAL_REFERENCE__DATACONTRACT_MODEL:
                setDatacontractModel((DataContractModel)newValue);
                return;
            case DataContractDslPackage.EXTERNAL_REFERENCE__KEYWORD:
                setKeyword((String)newValue);
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
            case DataContractDslPackage.EXTERNAL_REFERENCE__MODELNAME:
                setModelname(MODELNAME_EDEFAULT);
                return;
            case DataContractDslPackage.EXTERNAL_REFERENCE__DATACONTRACT_MODEL:
                setDatacontractModel((DataContractModel)null);
                return;
            case DataContractDslPackage.EXTERNAL_REFERENCE__KEYWORD:
                setKeyword(KEYWORD_EDEFAULT);
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
            case DataContractDslPackage.EXTERNAL_REFERENCE__MODELNAME:
                return MODELNAME_EDEFAULT == null ? modelname != null : !MODELNAME_EDEFAULT.equals(modelname);
            case DataContractDslPackage.EXTERNAL_REFERENCE__DATACONTRACT_MODEL:
                return getDatacontractModel() != null;
            case DataContractDslPackage.EXTERNAL_REFERENCE__KEYWORD:
                return KEYWORD_EDEFAULT == null ? keyword != null : !KEYWORD_EDEFAULT.equals(keyword);
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
        result.append(", keyword: ");
        result.append(keyword);
        result.append(')');
        return result.toString();
    }

} //ExternalReferenceImpl
