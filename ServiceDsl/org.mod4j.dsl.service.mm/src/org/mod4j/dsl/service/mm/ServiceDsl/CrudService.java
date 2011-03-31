/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.service.mm.ServiceDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crud Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.CrudService#getDto <em>Dto</em>}</li>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.CrudService#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getCrudService()
 * @model
 * @generated
 */
public interface CrudService extends ModelElement {
    /**
     * Returns the value of the '<em><b>Dto</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dto</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dto</em>' reference.
     * @see #setDto(DtoReference)
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getCrudService_Dto()
     * @model
     * @generated
     */
    DtoReference getDto();

    /**
     * Sets the value of the '{@link org.mendix.dsl.service.mm.ServiceDsl.CrudService#getDto <em>Dto</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dto</em>' reference.
     * @see #getDto()
     * @generated
     */
    void setDto(DtoReference value);

    /**
     * Returns the value of the '<em><b>Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.service.mm.ServiceDsl.ServiceModel#getCrudServices <em>Crud Services</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' container reference.
     * @see #setModel(ServiceModel)
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getCrudService_Model()
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceModel#getCrudServices
     * @model opposite="crudServices" transient="false"
     * @generated
     */
    ServiceModel getModel();

    /**
     * Sets the value of the '{@link org.mendix.dsl.service.mm.ServiceDsl.CrudService#getModel <em>Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' container reference.
     * @see #getModel()
     * @generated
     */
    void setModel(ServiceModel value);

} // CrudService
