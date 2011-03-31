/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.service.mm.ServiceDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mendix.dsl.service.mm.ServiceDsl.AssociationMethod;
import org.mendix.dsl.service.mm.ServiceDsl.CollectionType;
import org.mendix.dsl.service.mm.ServiceDsl.CrudService;
import org.mendix.dsl.service.mm.ServiceDsl.CustomMethod;
import org.mendix.dsl.service.mm.ServiceDsl.DtoReference;
import org.mendix.dsl.service.mm.ServiceDsl.MethodType;
import org.mendix.dsl.service.mm.ServiceDsl.ModelElement;
import org.mendix.dsl.service.mm.ServiceDsl.Parameter;
import org.mendix.dsl.service.mm.ServiceDsl.ServiceDslFactory;
import org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage;
import org.mendix.dsl.service.mm.ServiceDsl.ServiceMethod;
import org.mendix.dsl.service.mm.ServiceDsl.ServiceModel;
import org.mendix.dsl.service.mm.ServiceDsl.SpecialMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceDslPackageImpl extends EPackageImpl implements ServiceDslPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modelElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass customMethodEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass crudServiceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specialMethodEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceMethodEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass parameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass associationMethodEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum methodTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum collectionTypeEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ServiceDslPackageImpl() {
        super(eNS_URI, ServiceDslFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ServiceDslPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ServiceDslPackage init() {
        if (isInited) return (ServiceDslPackage)EPackage.Registry.INSTANCE.getEPackage(ServiceDslPackage.eNS_URI);

        // Obtain or create and register package
        ServiceDslPackageImpl theServiceDslPackage = (ServiceDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServiceDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServiceDslPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theServiceDslPackage.createPackageContents();

        // Initialize created meta-data
        theServiceDslPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theServiceDslPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ServiceDslPackage.eNS_URI, theServiceDslPackage);
        return theServiceDslPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getServiceModel() {
        return serviceModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getServiceModel_Methods() {
        return (EReference)serviceModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getServiceModel_DtoReferences() {
        return (EReference)serviceModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getServiceModel_CrudServices() {
        return (EReference)serviceModelEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModelElement() {
        return modelElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelElement_Name() {
        return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelElement_Description() {
        return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoReference() {
        return dtoReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDtoReference_Modelname() {
        return (EAttribute)dtoReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDtoReference_Model() {
        return (EReference)dtoReferenceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCustomMethod() {
        return customMethodEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCustomMethod_OutParameter() {
        return (EReference)customMethodEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCustomMethod_InParameters() {
        return (EReference)customMethodEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCrudService() {
        return crudServiceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCrudService_Dto() {
        return (EReference)crudServiceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCrudService_Model() {
        return (EReference)crudServiceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecialMethod() {
        return specialMethodEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecialMethod_Dto() {
        return (EReference)specialMethodEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getServiceMethod() {
        return serviceMethodEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getServiceMethod_Type() {
        return (EAttribute)serviceMethodEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getServiceMethod_Model() {
        return (EReference)serviceMethodEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getParameter() {
        return parameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameter_Type() {
        return (EReference)parameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameter_Method() {
        return (EReference)parameterEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameter_Collection() {
        return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssociationMethod() {
        return associationMethodEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssociationMethod_Main() {
        return (EReference)associationMethodEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssociationMethod_Part() {
        return (EReference)associationMethodEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAssociationMethod_Rolename() {
        return (EAttribute)associationMethodEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getMethodType() {
        return methodTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getCollectionType() {
        return collectionTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceDslFactory getServiceDslFactory() {
        return (ServiceDslFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        serviceModelEClass = createEClass(SERVICE_MODEL);
        createEReference(serviceModelEClass, SERVICE_MODEL__METHODS);
        createEReference(serviceModelEClass, SERVICE_MODEL__DTO_REFERENCES);
        createEReference(serviceModelEClass, SERVICE_MODEL__CRUD_SERVICES);

        modelElementEClass = createEClass(MODEL_ELEMENT);
        createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
        createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);

        dtoReferenceEClass = createEClass(DTO_REFERENCE);
        createEAttribute(dtoReferenceEClass, DTO_REFERENCE__MODELNAME);
        createEReference(dtoReferenceEClass, DTO_REFERENCE__MODEL);

        customMethodEClass = createEClass(CUSTOM_METHOD);
        createEReference(customMethodEClass, CUSTOM_METHOD__OUT_PARAMETER);
        createEReference(customMethodEClass, CUSTOM_METHOD__IN_PARAMETERS);

        crudServiceEClass = createEClass(CRUD_SERVICE);
        createEReference(crudServiceEClass, CRUD_SERVICE__DTO);
        createEReference(crudServiceEClass, CRUD_SERVICE__MODEL);

        specialMethodEClass = createEClass(SPECIAL_METHOD);
        createEReference(specialMethodEClass, SPECIAL_METHOD__DTO);

        serviceMethodEClass = createEClass(SERVICE_METHOD);
        createEAttribute(serviceMethodEClass, SERVICE_METHOD__TYPE);
        createEReference(serviceMethodEClass, SERVICE_METHOD__MODEL);

        parameterEClass = createEClass(PARAMETER);
        createEReference(parameterEClass, PARAMETER__TYPE);
        createEReference(parameterEClass, PARAMETER__METHOD);
        createEAttribute(parameterEClass, PARAMETER__COLLECTION);

        associationMethodEClass = createEClass(ASSOCIATION_METHOD);
        createEReference(associationMethodEClass, ASSOCIATION_METHOD__MAIN);
        createEReference(associationMethodEClass, ASSOCIATION_METHOD__PART);
        createEAttribute(associationMethodEClass, ASSOCIATION_METHOD__ROLENAME);

        // Create enums
        methodTypeEEnum = createEEnum(METHOD_TYPE);
        collectionTypeEEnum = createEEnum(COLLECTION_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        serviceModelEClass.getESuperTypes().add(this.getModelElement());
        dtoReferenceEClass.getESuperTypes().add(this.getModelElement());
        customMethodEClass.getESuperTypes().add(this.getServiceMethod());
        crudServiceEClass.getESuperTypes().add(this.getModelElement());
        specialMethodEClass.getESuperTypes().add(this.getServiceMethod());
        serviceMethodEClass.getESuperTypes().add(this.getModelElement());
        parameterEClass.getESuperTypes().add(this.getModelElement());
        associationMethodEClass.getESuperTypes().add(this.getServiceMethod());

        // Initialize classes and features; add operations and parameters
        initEClass(serviceModelEClass, ServiceModel.class, "ServiceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getServiceModel_Methods(), this.getServiceMethod(), this.getServiceMethod_Model(), "methods", null, 0, -1, ServiceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getServiceModel_DtoReferences(), this.getDtoReference(), this.getDtoReference_Model(), "dtoReferences", null, 0, -1, ServiceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getServiceModel_CrudServices(), this.getCrudService(), this.getCrudService_Model(), "crudServices", null, 0, -1, ServiceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dtoReferenceEClass, DtoReference.class, "DtoReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDtoReference_Modelname(), ecorePackage.getEString(), "modelname", null, 0, 1, DtoReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDtoReference_Model(), this.getServiceModel(), this.getServiceModel_DtoReferences(), "model", null, 0, 1, DtoReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(customMethodEClass, CustomMethod.class, "CustomMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCustomMethod_OutParameter(), this.getParameter(), null, "outParameter", null, 0, 1, CustomMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCustomMethod_InParameters(), this.getParameter(), this.getParameter_Method(), "inParameters", null, 0, -1, CustomMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(crudServiceEClass, CrudService.class, "CrudService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCrudService_Dto(), this.getDtoReference(), null, "dto", null, 0, 1, CrudService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCrudService_Model(), this.getServiceModel(), this.getServiceModel_CrudServices(), "model", null, 0, 1, CrudService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(specialMethodEClass, SpecialMethod.class, "SpecialMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSpecialMethod_Dto(), this.getDtoReference(), null, "dto", null, 0, 1, SpecialMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(serviceMethodEClass, ServiceMethod.class, "ServiceMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getServiceMethod_Type(), this.getMethodType(), "type", "Custom", 0, 1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getServiceMethod_Model(), this.getServiceModel(), this.getServiceModel_Methods(), "model", null, 0, 1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getParameter_Type(), this.getDtoReference(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameter_Method(), this.getCustomMethod(), this.getCustomMethod_InParameters(), "method", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameter_Collection(), this.getCollectionType(), "collection", "SINGLE", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(associationMethodEClass, AssociationMethod.class, "AssociationMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAssociationMethod_Main(), this.getDtoReference(), null, "main", null, 0, 1, AssociationMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssociationMethod_Part(), this.getDtoReference(), null, "part", null, 0, 1, AssociationMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAssociationMethod_Rolename(), ecorePackage.getEString(), "rolename", null, 0, 1, AssociationMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(methodTypeEEnum, MethodType.class, "MethodType");
        addEEnumLiteral(methodTypeEEnum, MethodType.CREATE);
        addEEnumLiteral(methodTypeEEnum, MethodType.READ);
        addEEnumLiteral(methodTypeEEnum, MethodType.UPDATE);
        addEEnumLiteral(methodTypeEEnum, MethodType.DELETE);
        addEEnumLiteral(methodTypeEEnum, MethodType.FIND);
        addEEnumLiteral(methodTypeEEnum, MethodType.CUSTOM);
        addEEnumLiteral(methodTypeEEnum, MethodType.ADDTO);
        addEEnumLiteral(methodTypeEEnum, MethodType.REMOVEFROM);
        addEEnumLiteral(methodTypeEEnum, MethodType.GETFROM);
        addEEnumLiteral(methodTypeEEnum, MethodType.LISTALL);

        initEEnum(collectionTypeEEnum, CollectionType.class, "CollectionType");
        addEEnumLiteral(collectionTypeEEnum, CollectionType.SINGLE);
        addEEnumLiteral(collectionTypeEEnum, CollectionType.LIST);

        // Create resource
        createResource(eNS_URI);
    }

} //ServiceDslPackageImpl
