/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.service.mm.ServiceDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslFactory
 * @model kind="package"
 * @generated
 */
public interface ServiceDslPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "ServiceDsl";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.mendix.org/service";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "service";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ServiceDslPackage eINSTANCE = org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl.init();

    /**
     * The meta object id for the '{@link org.mendix.dsl.service.mm.ServiceDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ModelElementImpl
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getModelElement()
     * @generated
     */
    int MODEL_ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_ELEMENT__NAME = 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_ELEMENT__DESCRIPTION = 1;

    /**
     * The number of structural features of the '<em>Model Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_ELEMENT_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceModelImpl <em>Service Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceModelImpl
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getServiceModel()
     * @generated
     */
    int SERVICE_MODEL = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_MODEL__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_MODEL__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Methods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_MODEL__METHODS = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Dto References</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_MODEL__DTO_REFERENCES = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Crud Services</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_MODEL__CRUD_SERVICES = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Service Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_MODEL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.mendix.dsl.service.mm.ServiceDsl.impl.DtoReferenceImpl <em>Dto Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.DtoReferenceImpl
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getDtoReference()
     * @generated
     */
    int DTO_REFERENCE = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_REFERENCE__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_REFERENCE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Modelname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_REFERENCE__MODELNAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_REFERENCE__MODEL = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Dto Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_REFERENCE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceMethodImpl <em>Service Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceMethodImpl
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getServiceMethod()
     * @generated
     */
    int SERVICE_METHOD = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_METHOD__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_METHOD__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_METHOD__TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_METHOD__MODEL = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Service Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_METHOD_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.mendix.dsl.service.mm.ServiceDsl.impl.CustomMethodImpl <em>Custom Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.CustomMethodImpl
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getCustomMethod()
     * @generated
     */
    int CUSTOM_METHOD = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_METHOD__NAME = SERVICE_METHOD__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_METHOD__DESCRIPTION = SERVICE_METHOD__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_METHOD__TYPE = SERVICE_METHOD__TYPE;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_METHOD__MODEL = SERVICE_METHOD__MODEL;

    /**
     * The feature id for the '<em><b>Out Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_METHOD__OUT_PARAMETER = SERVICE_METHOD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>In Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_METHOD__IN_PARAMETERS = SERVICE_METHOD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Custom Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_METHOD_FEATURE_COUNT = SERVICE_METHOD_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.mendix.dsl.service.mm.ServiceDsl.impl.CrudServiceImpl <em>Crud Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.CrudServiceImpl
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getCrudService()
     * @generated
     */
    int CRUD_SERVICE = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRUD_SERVICE__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRUD_SERVICE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Dto</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRUD_SERVICE__DTO = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRUD_SERVICE__MODEL = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Crud Service</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CRUD_SERVICE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.mendix.dsl.service.mm.ServiceDsl.impl.SpecialMethodImpl <em>Special Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.SpecialMethodImpl
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getSpecialMethod()
     * @generated
     */
    int SPECIAL_METHOD = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIAL_METHOD__NAME = SERVICE_METHOD__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIAL_METHOD__DESCRIPTION = SERVICE_METHOD__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIAL_METHOD__TYPE = SERVICE_METHOD__TYPE;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIAL_METHOD__MODEL = SERVICE_METHOD__MODEL;

    /**
     * The feature id for the '<em><b>Dto</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIAL_METHOD__DTO = SERVICE_METHOD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Special Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIAL_METHOD_FEATURE_COUNT = SERVICE_METHOD_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.mendix.dsl.service.mm.ServiceDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ParameterImpl
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getParameter()
     * @generated
     */
    int PARAMETER = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Method</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__METHOD = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Collection</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__COLLECTION = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.mendix.dsl.service.mm.ServiceDsl.impl.AssociationMethodImpl <em>Association Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.AssociationMethodImpl
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getAssociationMethod()
     * @generated
     */
    int ASSOCIATION_METHOD = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_METHOD__NAME = SERVICE_METHOD__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_METHOD__DESCRIPTION = SERVICE_METHOD__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_METHOD__TYPE = SERVICE_METHOD__TYPE;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_METHOD__MODEL = SERVICE_METHOD__MODEL;

    /**
     * The feature id for the '<em><b>Main</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_METHOD__MAIN = SERVICE_METHOD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Part</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_METHOD__PART = SERVICE_METHOD_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Rolename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_METHOD__ROLENAME = SERVICE_METHOD_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Association Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_METHOD_FEATURE_COUNT = SERVICE_METHOD_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.mendix.dsl.service.mm.ServiceDsl.MethodType <em>Method Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mendix.dsl.service.mm.ServiceDsl.MethodType
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getMethodType()
     * @generated
     */
    int METHOD_TYPE = 9;


    /**
     * The meta object id for the '{@link org.mendix.dsl.service.mm.ServiceDsl.CollectionType <em>Collection Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mendix.dsl.service.mm.ServiceDsl.CollectionType
     * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getCollectionType()
     * @generated
     */
    int COLLECTION_TYPE = 10;


    /**
     * Returns the meta object for class '{@link org.mendix.dsl.service.mm.ServiceDsl.ServiceModel <em>Service Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Model</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceModel
     * @generated
     */
    EClass getServiceModel();

    /**
     * Returns the meta object for the containment reference list '{@link org.mendix.dsl.service.mm.ServiceDsl.ServiceModel#getMethods <em>Methods</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Methods</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceModel#getMethods()
     * @see #getServiceModel()
     * @generated
     */
    EReference getServiceModel_Methods();

    /**
     * Returns the meta object for the containment reference list '{@link org.mendix.dsl.service.mm.ServiceDsl.ServiceModel#getDtoReferences <em>Dto References</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Dto References</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceModel#getDtoReferences()
     * @see #getServiceModel()
     * @generated
     */
    EReference getServiceModel_DtoReferences();

    /**
     * Returns the meta object for the containment reference list '{@link org.mendix.dsl.service.mm.ServiceDsl.ServiceModel#getCrudServices <em>Crud Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Crud Services</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceModel#getCrudServices()
     * @see #getServiceModel()
     * @generated
     */
    EReference getServiceModel_CrudServices();

    /**
     * Returns the meta object for class '{@link org.mendix.dsl.service.mm.ServiceDsl.ModelElement <em>Model Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model Element</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.ModelElement
     * @generated
     */
    EClass getModelElement();

    /**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.service.mm.ServiceDsl.ModelElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.ModelElement#getName()
     * @see #getModelElement()
     * @generated
     */
    EAttribute getModelElement_Name();

    /**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.service.mm.ServiceDsl.ModelElement#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.ModelElement#getDescription()
     * @see #getModelElement()
     * @generated
     */
    EAttribute getModelElement_Description();

    /**
     * Returns the meta object for class '{@link org.mendix.dsl.service.mm.ServiceDsl.DtoReference <em>Dto Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Reference</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.DtoReference
     * @generated
     */
    EClass getDtoReference();

    /**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.service.mm.ServiceDsl.DtoReference#getModelname <em>Modelname</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Modelname</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.DtoReference#getModelname()
     * @see #getDtoReference()
     * @generated
     */
    EAttribute getDtoReference_Modelname();

    /**
     * Returns the meta object for the container reference '{@link org.mendix.dsl.service.mm.ServiceDsl.DtoReference#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Model</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.DtoReference#getModel()
     * @see #getDtoReference()
     * @generated
     */
    EReference getDtoReference_Model();

    /**
     * Returns the meta object for class '{@link org.mendix.dsl.service.mm.ServiceDsl.CustomMethod <em>Custom Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Custom Method</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.CustomMethod
     * @generated
     */
    EClass getCustomMethod();

    /**
     * Returns the meta object for the containment reference '{@link org.mendix.dsl.service.mm.ServiceDsl.CustomMethod#getOutParameter <em>Out Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Out Parameter</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.CustomMethod#getOutParameter()
     * @see #getCustomMethod()
     * @generated
     */
    EReference getCustomMethod_OutParameter();

    /**
     * Returns the meta object for the containment reference list '{@link org.mendix.dsl.service.mm.ServiceDsl.CustomMethod#getInParameters <em>In Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>In Parameters</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.CustomMethod#getInParameters()
     * @see #getCustomMethod()
     * @generated
     */
    EReference getCustomMethod_InParameters();

    /**
     * Returns the meta object for class '{@link org.mendix.dsl.service.mm.ServiceDsl.CrudService <em>Crud Service</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Crud Service</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.CrudService
     * @generated
     */
    EClass getCrudService();

    /**
     * Returns the meta object for the reference '{@link org.mendix.dsl.service.mm.ServiceDsl.CrudService#getDto <em>Dto</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Dto</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.CrudService#getDto()
     * @see #getCrudService()
     * @generated
     */
    EReference getCrudService_Dto();

    /**
     * Returns the meta object for the container reference '{@link org.mendix.dsl.service.mm.ServiceDsl.CrudService#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Model</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.CrudService#getModel()
     * @see #getCrudService()
     * @generated
     */
    EReference getCrudService_Model();

    /**
     * Returns the meta object for class '{@link org.mendix.dsl.service.mm.ServiceDsl.SpecialMethod <em>Special Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Special Method</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.SpecialMethod
     * @generated
     */
    EClass getSpecialMethod();

    /**
     * Returns the meta object for the reference '{@link org.mendix.dsl.service.mm.ServiceDsl.SpecialMethod#getDto <em>Dto</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Dto</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.SpecialMethod#getDto()
     * @see #getSpecialMethod()
     * @generated
     */
    EReference getSpecialMethod_Dto();

    /**
     * Returns the meta object for class '{@link org.mendix.dsl.service.mm.ServiceDsl.ServiceMethod <em>Service Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Method</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceMethod
     * @generated
     */
    EClass getServiceMethod();

    /**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.service.mm.ServiceDsl.ServiceMethod#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceMethod#getType()
     * @see #getServiceMethod()
     * @generated
     */
    EAttribute getServiceMethod_Type();

    /**
     * Returns the meta object for the container reference '{@link org.mendix.dsl.service.mm.ServiceDsl.ServiceMethod#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Model</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceMethod#getModel()
     * @see #getServiceMethod()
     * @generated
     */
    EReference getServiceMethod_Model();

    /**
     * Returns the meta object for class '{@link org.mendix.dsl.service.mm.ServiceDsl.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.Parameter
     * @generated
     */
    EClass getParameter();

    /**
     * Returns the meta object for the reference '{@link org.mendix.dsl.service.mm.ServiceDsl.Parameter#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.Parameter#getType()
     * @see #getParameter()
     * @generated
     */
    EReference getParameter_Type();

    /**
     * Returns the meta object for the container reference '{@link org.mendix.dsl.service.mm.ServiceDsl.Parameter#getMethod <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Method</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.Parameter#getMethod()
     * @see #getParameter()
     * @generated
     */
    EReference getParameter_Method();

    /**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.service.mm.ServiceDsl.Parameter#getCollection <em>Collection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Collection</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.Parameter#getCollection()
     * @see #getParameter()
     * @generated
     */
    EAttribute getParameter_Collection();

    /**
     * Returns the meta object for class '{@link org.mendix.dsl.service.mm.ServiceDsl.AssociationMethod <em>Association Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Association Method</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.AssociationMethod
     * @generated
     */
    EClass getAssociationMethod();

    /**
     * Returns the meta object for the reference '{@link org.mendix.dsl.service.mm.ServiceDsl.AssociationMethod#getMain <em>Main</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Main</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.AssociationMethod#getMain()
     * @see #getAssociationMethod()
     * @generated
     */
    EReference getAssociationMethod_Main();

    /**
     * Returns the meta object for the reference '{@link org.mendix.dsl.service.mm.ServiceDsl.AssociationMethod#getPart <em>Part</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Part</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.AssociationMethod#getPart()
     * @see #getAssociationMethod()
     * @generated
     */
    EReference getAssociationMethod_Part();

    /**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.service.mm.ServiceDsl.AssociationMethod#getRolename <em>Rolename</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rolename</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.AssociationMethod#getRolename()
     * @see #getAssociationMethod()
     * @generated
     */
    EAttribute getAssociationMethod_Rolename();

    /**
     * Returns the meta object for enum '{@link org.mendix.dsl.service.mm.ServiceDsl.MethodType <em>Method Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Method Type</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.MethodType
     * @generated
     */
    EEnum getMethodType();

    /**
     * Returns the meta object for enum '{@link org.mendix.dsl.service.mm.ServiceDsl.CollectionType <em>Collection Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Collection Type</em>'.
     * @see org.mendix.dsl.service.mm.ServiceDsl.CollectionType
     * @generated
     */
    EEnum getCollectionType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ServiceDslFactory getServiceDslFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceModelImpl <em>Service Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceModelImpl
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getServiceModel()
         * @generated
         */
        EClass SERVICE_MODEL = eINSTANCE.getServiceModel();

        /**
         * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_MODEL__METHODS = eINSTANCE.getServiceModel_Methods();

        /**
         * The meta object literal for the '<em><b>Dto References</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_MODEL__DTO_REFERENCES = eINSTANCE.getServiceModel_DtoReferences();

        /**
         * The meta object literal for the '<em><b>Crud Services</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_MODEL__CRUD_SERVICES = eINSTANCE.getServiceModel_CrudServices();

        /**
         * The meta object literal for the '{@link org.mendix.dsl.service.mm.ServiceDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ModelElementImpl
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getModelElement()
         * @generated
         */
        EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getModelElement_Description();

        /**
         * The meta object literal for the '{@link org.mendix.dsl.service.mm.ServiceDsl.impl.DtoReferenceImpl <em>Dto Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.DtoReferenceImpl
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getDtoReference()
         * @generated
         */
        EClass DTO_REFERENCE = eINSTANCE.getDtoReference();

        /**
         * The meta object literal for the '<em><b>Modelname</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DTO_REFERENCE__MODELNAME = eINSTANCE.getDtoReference_Modelname();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DTO_REFERENCE__MODEL = eINSTANCE.getDtoReference_Model();

        /**
         * The meta object literal for the '{@link org.mendix.dsl.service.mm.ServiceDsl.impl.CustomMethodImpl <em>Custom Method</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.CustomMethodImpl
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getCustomMethod()
         * @generated
         */
        EClass CUSTOM_METHOD = eINSTANCE.getCustomMethod();

        /**
         * The meta object literal for the '<em><b>Out Parameter</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CUSTOM_METHOD__OUT_PARAMETER = eINSTANCE.getCustomMethod_OutParameter();

        /**
         * The meta object literal for the '<em><b>In Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CUSTOM_METHOD__IN_PARAMETERS = eINSTANCE.getCustomMethod_InParameters();

        /**
         * The meta object literal for the '{@link org.mendix.dsl.service.mm.ServiceDsl.impl.CrudServiceImpl <em>Crud Service</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.CrudServiceImpl
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getCrudService()
         * @generated
         */
        EClass CRUD_SERVICE = eINSTANCE.getCrudService();

        /**
         * The meta object literal for the '<em><b>Dto</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CRUD_SERVICE__DTO = eINSTANCE.getCrudService_Dto();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CRUD_SERVICE__MODEL = eINSTANCE.getCrudService_Model();

        /**
         * The meta object literal for the '{@link org.mendix.dsl.service.mm.ServiceDsl.impl.SpecialMethodImpl <em>Special Method</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.SpecialMethodImpl
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getSpecialMethod()
         * @generated
         */
        EClass SPECIAL_METHOD = eINSTANCE.getSpecialMethod();

        /**
         * The meta object literal for the '<em><b>Dto</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SPECIAL_METHOD__DTO = eINSTANCE.getSpecialMethod_Dto();

        /**
         * The meta object literal for the '{@link org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceMethodImpl <em>Service Method</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceMethodImpl
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getServiceMethod()
         * @generated
         */
        EClass SERVICE_METHOD = eINSTANCE.getServiceMethod();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_METHOD__TYPE = eINSTANCE.getServiceMethod_Type();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_METHOD__MODEL = eINSTANCE.getServiceMethod_Model();

        /**
         * The meta object literal for the '{@link org.mendix.dsl.service.mm.ServiceDsl.impl.ParameterImpl <em>Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ParameterImpl
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getParameter()
         * @generated
         */
        EClass PARAMETER = eINSTANCE.getParameter();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

        /**
         * The meta object literal for the '<em><b>Method</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER__METHOD = eINSTANCE.getParameter_Method();

        /**
         * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER__COLLECTION = eINSTANCE.getParameter_Collection();

        /**
         * The meta object literal for the '{@link org.mendix.dsl.service.mm.ServiceDsl.impl.AssociationMethodImpl <em>Association Method</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.AssociationMethodImpl
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getAssociationMethod()
         * @generated
         */
        EClass ASSOCIATION_METHOD = eINSTANCE.getAssociationMethod();

        /**
         * The meta object literal for the '<em><b>Main</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSOCIATION_METHOD__MAIN = eINSTANCE.getAssociationMethod_Main();

        /**
         * The meta object literal for the '<em><b>Part</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSOCIATION_METHOD__PART = eINSTANCE.getAssociationMethod_Part();

        /**
         * The meta object literal for the '<em><b>Rolename</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSOCIATION_METHOD__ROLENAME = eINSTANCE.getAssociationMethod_Rolename();

        /**
         * The meta object literal for the '{@link org.mendix.dsl.service.mm.ServiceDsl.MethodType <em>Method Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mendix.dsl.service.mm.ServiceDsl.MethodType
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getMethodType()
         * @generated
         */
        EEnum METHOD_TYPE = eINSTANCE.getMethodType();

        /**
         * The meta object literal for the '{@link org.mendix.dsl.service.mm.ServiceDsl.CollectionType <em>Collection Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mendix.dsl.service.mm.ServiceDsl.CollectionType
         * @see org.mendix.dsl.service.mm.ServiceDsl.impl.ServiceDslPackageImpl#getCollectionType()
         * @generated
         */
        EEnum COLLECTION_TYPE = eINSTANCE.getCollectionType();

    }

} //ServiceDslPackage
