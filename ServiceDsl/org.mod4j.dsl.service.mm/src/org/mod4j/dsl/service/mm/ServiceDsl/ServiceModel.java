/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.service.mm.ServiceDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.ServiceModel#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.ServiceModel#getDtoReferences <em>Dto References</em>}</li>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.ServiceModel#getCrudServices <em>Crud Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getServiceModel()
 * @model
 * @generated
 */
public interface ServiceModel extends ModelElement {
    /**
     * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
     * The list contents are of type {@link org.mendix.dsl.service.mm.ServiceDsl.ServiceMethod}.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.service.mm.ServiceDsl.ServiceMethod#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Methods</em>' containment reference list.
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getServiceModel_Methods()
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceMethod#getModel
     * @model opposite="model" containment="true"
     * @generated
     */
    EList<ServiceMethod> getMethods();

    /**
     * Returns the value of the '<em><b>Dto References</b></em>' containment reference list.
     * The list contents are of type {@link org.mendix.dsl.service.mm.ServiceDsl.DtoReference}.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.service.mm.ServiceDsl.DtoReference#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dto References</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dto References</em>' containment reference list.
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getServiceModel_DtoReferences()
     * @see org.mendix.dsl.service.mm.ServiceDsl.DtoReference#getModel
     * @model opposite="model" containment="true"
     * @generated
     */
    EList<DtoReference> getDtoReferences();

    /**
     * Returns the value of the '<em><b>Crud Services</b></em>' containment reference list.
     * The list contents are of type {@link org.mendix.dsl.service.mm.ServiceDsl.CrudService}.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.service.mm.ServiceDsl.CrudService#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Crud Services</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Crud Services</em>' containment reference list.
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getServiceModel_CrudServices()
     * @see org.mendix.dsl.service.mm.ServiceDsl.CrudService#getModel
     * @model opposite="model" containment="true"
     * @generated
     */
    EList<CrudService> getCrudServices();

} // ServiceModel
