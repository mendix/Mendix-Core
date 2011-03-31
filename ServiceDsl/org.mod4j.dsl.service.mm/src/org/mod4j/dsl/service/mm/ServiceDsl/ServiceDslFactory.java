/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.service.mm.ServiceDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage
 * @generated
 */
public interface ServiceDslFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ServiceDslFactory eINSTANCE = org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Service Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Model</em>'.
     * @generated
     */
    ServiceModel createServiceModel();

    /**
     * Returns a new object of class '<em>Model Element</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Model Element</em>'.
     * @generated
     */
    ModelElement createModelElement();

    /**
     * Returns a new object of class '<em>Dto Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dto Reference</em>'.
     * @generated
     */
    DtoReference createDtoReference();

    /**
     * Returns a new object of class '<em>Custom Method</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Custom Method</em>'.
     * @generated
     */
    CustomMethod createCustomMethod();

    /**
     * Returns a new object of class '<em>Crud Service</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Crud Service</em>'.
     * @generated
     */
    CrudService createCrudService();

    /**
     * Returns a new object of class '<em>Special Method</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Special Method</em>'.
     * @generated
     */
    SpecialMethod createSpecialMethod();

    /**
     * Returns a new object of class '<em>Service Method</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Method</em>'.
     * @generated
     */
    ServiceMethod createServiceMethod();

    /**
     * Returns a new object of class '<em>Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parameter</em>'.
     * @generated
     */
    Parameter createParameter();

    /**
     * Returns a new object of class '<em>Association Method</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Association Method</em>'.
     * @generated
     */
    AssociationMethod createAssociationMethod();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ServiceDslPackage getServiceDslPackage();

} //ServiceDslFactory
