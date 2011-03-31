/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.service.mm.ServiceDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mendix.dsl.service.mm.ServiceDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceDslFactoryImpl extends EFactoryImpl implements ServiceDslFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ServiceDslFactory init() {
        try {
            ServiceDslFactory theServiceDslFactory = (ServiceDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mendix.org/service"); 
            if (theServiceDslFactory != null) {
                return theServiceDslFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ServiceDslFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceDslFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ServiceDslPackage.SERVICE_MODEL: return createServiceModel();
            case ServiceDslPackage.MODEL_ELEMENT: return createModelElement();
            case ServiceDslPackage.DTO_REFERENCE: return createDtoReference();
            case ServiceDslPackage.CUSTOM_METHOD: return createCustomMethod();
            case ServiceDslPackage.CRUD_SERVICE: return createCrudService();
            case ServiceDslPackage.SPECIAL_METHOD: return createSpecialMethod();
            case ServiceDslPackage.SERVICE_METHOD: return createServiceMethod();
            case ServiceDslPackage.PARAMETER: return createParameter();
            case ServiceDslPackage.ASSOCIATION_METHOD: return createAssociationMethod();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case ServiceDslPackage.METHOD_TYPE:
                return createMethodTypeFromString(eDataType, initialValue);
            case ServiceDslPackage.COLLECTION_TYPE:
                return createCollectionTypeFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case ServiceDslPackage.METHOD_TYPE:
                return convertMethodTypeToString(eDataType, instanceValue);
            case ServiceDslPackage.COLLECTION_TYPE:
                return convertCollectionTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceModel createServiceModel() {
        ServiceModelImpl serviceModel = new ServiceModelImpl();
        return serviceModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelElement createModelElement() {
        ModelElementImpl modelElement = new ModelElementImpl();
        return modelElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtoReference createDtoReference() {
        DtoReferenceImpl dtoReference = new DtoReferenceImpl();
        return dtoReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CustomMethod createCustomMethod() {
        CustomMethodImpl customMethod = new CustomMethodImpl();
        return customMethod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CrudService createCrudService() {
        CrudServiceImpl crudService = new CrudServiceImpl();
        return crudService;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecialMethod createSpecialMethod() {
        SpecialMethodImpl specialMethod = new SpecialMethodImpl();
        return specialMethod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceMethod createServiceMethod() {
        ServiceMethodImpl serviceMethod = new ServiceMethodImpl();
        return serviceMethod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Parameter createParameter() {
        ParameterImpl parameter = new ParameterImpl();
        return parameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssociationMethod createAssociationMethod() {
        AssociationMethodImpl associationMethod = new AssociationMethodImpl();
        return associationMethod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MethodType createMethodTypeFromString(EDataType eDataType, String initialValue) {
        MethodType result = MethodType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMethodTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CollectionType createCollectionTypeFromString(EDataType eDataType, String initialValue) {
        CollectionType result = CollectionType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCollectionTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceDslPackage getServiceDslPackage() {
        return (ServiceDslPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ServiceDslPackage getPackage() {
        return ServiceDslPackage.eINSTANCE;
    }

} //ServiceDslFactoryImpl
