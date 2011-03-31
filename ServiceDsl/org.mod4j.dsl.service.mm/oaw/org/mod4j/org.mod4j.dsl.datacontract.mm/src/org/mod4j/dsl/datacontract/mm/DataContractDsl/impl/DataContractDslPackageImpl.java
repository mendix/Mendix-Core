/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.datacontract.mm.DataContractDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference;
import org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto;
import org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference;
import org.mendix.dsl.datacontract.mm.DataContractDsl.CustomDto;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslFactory;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel;
import org.mendix.dsl.datacontract.mm.DataContractDsl.Dto;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DtoAssociationRoleProperty;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DtoBooleanProperty;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDataProperty;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDateTimeProperty;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDecimalProperty;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DtoIntegerProperty;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty;
import org.mendix.dsl.datacontract.mm.DataContractDsl.DtoStringProperty;
import org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto;
import org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDtoLiteral;
import org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference;
import org.mendix.dsl.datacontract.mm.DataContractDsl.ModelElement;
import org.mendix.dsl.datacontract.mm.DataContractDsl.Multiplicity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataContractDslPackageImpl extends EPackageImpl implements DataContractDslPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataContractModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass businessClassDtoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoDataPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoStringPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoBooleanPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass enumerationDtoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass enumerationDtoLiteralEClass = null;

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
    private EClass customDtoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoIntegerPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoDecimalPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoEnumerationPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoDateTimePropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass businessClassPropertyReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass businessClassAssociationRoleReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoAssociationRolePropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass externalReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum multiplicityEEnum = null;

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
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private DataContractDslPackageImpl() {
        super(eNS_URI, DataContractDslFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link DataContractDslPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static DataContractDslPackage init() {
        if (isInited) return (DataContractDslPackage)EPackage.Registry.INSTANCE.getEPackage(DataContractDslPackage.eNS_URI);

        // Obtain or create and register package
        DataContractDslPackageImpl theDataContractDslPackage = (DataContractDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataContractDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataContractDslPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theDataContractDslPackage.createPackageContents();

        // Initialize created meta-data
        theDataContractDslPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theDataContractDslPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(DataContractDslPackage.eNS_URI, theDataContractDslPackage);
        return theDataContractDslPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataContractModel() {
        return dataContractModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataContractModel_Dtos() {
        return (EReference)dataContractModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataContractModel_Enumerations() {
        return (EReference)dataContractModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataContractModel_ExternalReferences() {
        return (EReference)dataContractModelEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDto() {
        return dtoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDto_DatacontractModel() {
        return (EReference)dtoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBusinessClassDto() {
        return businessClassDtoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBusinessClassDto_Properties() {
        return (EReference)businessClassDtoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBusinessClassDto_Base() {
        return (EReference)businessClassDtoEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBusinessClassDto_PropertyReferences() {
        return (EReference)businessClassDtoEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBusinessClassDto_AssociationReferences() {
        return (EReference)businessClassDtoEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBusinessClassDto_Creatable() {
        return (EAttribute)businessClassDtoEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoProperty() {
        return dtoPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDtoProperty_DataType() {
        return (EAttribute)dtoPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDtoProperty_BusinessClassDto() {
        return (EReference)dtoPropertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDtoProperty_CustomDto() {
        return (EReference)dtoPropertyEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDtoProperty_MandatoryForCreation() {
        return (EAttribute)dtoPropertyEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDtoProperty_Nullable() {
        return (EAttribute)dtoPropertyEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDtoProperty_Writable() {
        return (EAttribute)dtoPropertyEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoDataProperty() {
        return dtoDataPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDtoDataProperty_HasDefault() {
        return (EAttribute)dtoDataPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoStringProperty() {
        return dtoStringPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDtoStringProperty_DefaultValue() {
        return (EAttribute)dtoStringPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoBooleanProperty() {
        return dtoBooleanPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDtoBooleanProperty_DefaultValue() {
        return (EAttribute)dtoBooleanPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEnumerationDto() {
        return enumerationDtoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumerationDto_Literals() {
        return (EReference)enumerationDtoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumerationDto_Base() {
        return (EReference)enumerationDtoEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumerationDto_DatacontractModel() {
        return (EReference)enumerationDtoEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEnumerationDtoLiteral() {
        return enumerationDtoLiteralEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEnumerationDtoLiteral_Value() {
        return (EAttribute)enumerationDtoLiteralEClass.getEStructuralFeatures().get(0);
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
    public EClass getCustomDto() {
        return customDtoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCustomDto_Properties() {
        return (EReference)customDtoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoIntegerProperty() {
        return dtoIntegerPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDtoIntegerProperty_DefaultValue() {
        return (EAttribute)dtoIntegerPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoDecimalProperty() {
        return dtoDecimalPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDtoDecimalProperty_DefaultValue() {
        return (EAttribute)dtoDecimalPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoEnumerationProperty() {
        return dtoEnumerationPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDtoEnumerationProperty_Type() {
        return (EReference)dtoEnumerationPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDtoEnumerationProperty_DefaultValueAsString() {
        return (EAttribute)dtoEnumerationPropertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoDateTimeProperty() {
        return dtoDateTimePropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDtoDateTimeProperty_DefaultValue() {
        return (EAttribute)dtoDateTimePropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBusinessClassPropertyReference() {
        return businessClassPropertyReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBusinessClassPropertyReference_Dto() {
        return (EReference)businessClassPropertyReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBusinessClassAssociationRoleReference() {
        return businessClassAssociationRoleReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBusinessClassAssociationRoleReference_Dto() {
        return (EReference)businessClassAssociationRoleReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBusinessClassAssociationRoleReference_DtoType() {
        return (EReference)businessClassAssociationRoleReferenceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoAssociationRoleProperty() {
        return dtoAssociationRolePropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDtoAssociationRoleProperty_DtoType() {
        return (EReference)dtoAssociationRolePropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDtoAssociationRoleProperty_Ordered() {
        return (EAttribute)dtoAssociationRolePropertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDtoAssociationRoleProperty_Multiplicity() {
        return (EAttribute)dtoAssociationRolePropertyEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExternalReference() {
        return externalReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExternalReference_Modelname() {
        return (EAttribute)externalReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExternalReference_DatacontractModel() {
        return (EReference)externalReferenceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExternalReference_Keyword() {
        return (EAttribute)externalReferenceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getMultiplicity() {
        return multiplicityEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataContractDslFactory getDataContractDslFactory() {
        return (DataContractDslFactory)getEFactoryInstance();
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
        dataContractModelEClass = createEClass(DATA_CONTRACT_MODEL);
        createEReference(dataContractModelEClass, DATA_CONTRACT_MODEL__DTOS);
        createEReference(dataContractModelEClass, DATA_CONTRACT_MODEL__ENUMERATIONS);
        createEReference(dataContractModelEClass, DATA_CONTRACT_MODEL__EXTERNAL_REFERENCES);

        dtoEClass = createEClass(DTO);
        createEReference(dtoEClass, DTO__DATACONTRACT_MODEL);

        businessClassDtoEClass = createEClass(BUSINESS_CLASS_DTO);
        createEReference(businessClassDtoEClass, BUSINESS_CLASS_DTO__PROPERTIES);
        createEReference(businessClassDtoEClass, BUSINESS_CLASS_DTO__BASE);
        createEReference(businessClassDtoEClass, BUSINESS_CLASS_DTO__PROPERTY_REFERENCES);
        createEReference(businessClassDtoEClass, BUSINESS_CLASS_DTO__ASSOCIATION_REFERENCES);
        createEAttribute(businessClassDtoEClass, BUSINESS_CLASS_DTO__CREATABLE);

        dtoPropertyEClass = createEClass(DTO_PROPERTY);
        createEAttribute(dtoPropertyEClass, DTO_PROPERTY__DATA_TYPE);
        createEReference(dtoPropertyEClass, DTO_PROPERTY__BUSINESS_CLASS_DTO);
        createEReference(dtoPropertyEClass, DTO_PROPERTY__CUSTOM_DTO);
        createEAttribute(dtoPropertyEClass, DTO_PROPERTY__MANDATORY_FOR_CREATION);
        createEAttribute(dtoPropertyEClass, DTO_PROPERTY__NULLABLE);
        createEAttribute(dtoPropertyEClass, DTO_PROPERTY__WRITABLE);

        dtoDataPropertyEClass = createEClass(DTO_DATA_PROPERTY);
        createEAttribute(dtoDataPropertyEClass, DTO_DATA_PROPERTY__HAS_DEFAULT);

        dtoStringPropertyEClass = createEClass(DTO_STRING_PROPERTY);
        createEAttribute(dtoStringPropertyEClass, DTO_STRING_PROPERTY__DEFAULT_VALUE);

        dtoBooleanPropertyEClass = createEClass(DTO_BOOLEAN_PROPERTY);
        createEAttribute(dtoBooleanPropertyEClass, DTO_BOOLEAN_PROPERTY__DEFAULT_VALUE);

        enumerationDtoEClass = createEClass(ENUMERATION_DTO);
        createEReference(enumerationDtoEClass, ENUMERATION_DTO__LITERALS);
        createEReference(enumerationDtoEClass, ENUMERATION_DTO__BASE);
        createEReference(enumerationDtoEClass, ENUMERATION_DTO__DATACONTRACT_MODEL);

        enumerationDtoLiteralEClass = createEClass(ENUMERATION_DTO_LITERAL);
        createEAttribute(enumerationDtoLiteralEClass, ENUMERATION_DTO_LITERAL__VALUE);

        modelElementEClass = createEClass(MODEL_ELEMENT);
        createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
        createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);

        customDtoEClass = createEClass(CUSTOM_DTO);
        createEReference(customDtoEClass, CUSTOM_DTO__PROPERTIES);

        dtoIntegerPropertyEClass = createEClass(DTO_INTEGER_PROPERTY);
        createEAttribute(dtoIntegerPropertyEClass, DTO_INTEGER_PROPERTY__DEFAULT_VALUE);

        dtoDecimalPropertyEClass = createEClass(DTO_DECIMAL_PROPERTY);
        createEAttribute(dtoDecimalPropertyEClass, DTO_DECIMAL_PROPERTY__DEFAULT_VALUE);

        dtoEnumerationPropertyEClass = createEClass(DTO_ENUMERATION_PROPERTY);
        createEReference(dtoEnumerationPropertyEClass, DTO_ENUMERATION_PROPERTY__TYPE);
        createEAttribute(dtoEnumerationPropertyEClass, DTO_ENUMERATION_PROPERTY__DEFAULT_VALUE_AS_STRING);

        dtoDateTimePropertyEClass = createEClass(DTO_DATE_TIME_PROPERTY);
        createEAttribute(dtoDateTimePropertyEClass, DTO_DATE_TIME_PROPERTY__DEFAULT_VALUE);

        businessClassPropertyReferenceEClass = createEClass(BUSINESS_CLASS_PROPERTY_REFERENCE);
        createEReference(businessClassPropertyReferenceEClass, BUSINESS_CLASS_PROPERTY_REFERENCE__DTO);

        businessClassAssociationRoleReferenceEClass = createEClass(BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE);
        createEReference(businessClassAssociationRoleReferenceEClass, BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO);
        createEReference(businessClassAssociationRoleReferenceEClass, BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO_TYPE);

        dtoAssociationRolePropertyEClass = createEClass(DTO_ASSOCIATION_ROLE_PROPERTY);
        createEReference(dtoAssociationRolePropertyEClass, DTO_ASSOCIATION_ROLE_PROPERTY__DTO_TYPE);
        createEAttribute(dtoAssociationRolePropertyEClass, DTO_ASSOCIATION_ROLE_PROPERTY__ORDERED);
        createEAttribute(dtoAssociationRolePropertyEClass, DTO_ASSOCIATION_ROLE_PROPERTY__MULTIPLICITY);

        externalReferenceEClass = createEClass(EXTERNAL_REFERENCE);
        createEAttribute(externalReferenceEClass, EXTERNAL_REFERENCE__MODELNAME);
        createEReference(externalReferenceEClass, EXTERNAL_REFERENCE__DATACONTRACT_MODEL);
        createEAttribute(externalReferenceEClass, EXTERNAL_REFERENCE__KEYWORD);

        // Create enums
        multiplicityEEnum = createEEnum(MULTIPLICITY);
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
        dataContractModelEClass.getESuperTypes().add(this.getModelElement());
        dtoEClass.getESuperTypes().add(this.getModelElement());
        businessClassDtoEClass.getESuperTypes().add(this.getDto());
        dtoPropertyEClass.getESuperTypes().add(this.getModelElement());
        dtoDataPropertyEClass.getESuperTypes().add(this.getDtoProperty());
        dtoStringPropertyEClass.getESuperTypes().add(this.getDtoDataProperty());
        dtoBooleanPropertyEClass.getESuperTypes().add(this.getDtoDataProperty());
        enumerationDtoEClass.getESuperTypes().add(this.getModelElement());
        enumerationDtoLiteralEClass.getESuperTypes().add(this.getModelElement());
        customDtoEClass.getESuperTypes().add(this.getDto());
        dtoIntegerPropertyEClass.getESuperTypes().add(this.getDtoDataProperty());
        dtoDecimalPropertyEClass.getESuperTypes().add(this.getDtoDataProperty());
        dtoEnumerationPropertyEClass.getESuperTypes().add(this.getDtoDataProperty());
        dtoDateTimePropertyEClass.getESuperTypes().add(this.getDtoDataProperty());
        businessClassPropertyReferenceEClass.getESuperTypes().add(this.getModelElement());
        businessClassAssociationRoleReferenceEClass.getESuperTypes().add(this.getModelElement());
        dtoAssociationRolePropertyEClass.getESuperTypes().add(this.getDtoProperty());
        externalReferenceEClass.getESuperTypes().add(this.getModelElement());

        // Initialize classes and features; add operations and parameters
        initEClass(dataContractModelEClass, DataContractModel.class, "DataContractModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataContractModel_Dtos(), this.getDto(), this.getDto_DatacontractModel(), "dtos", null, 0, -1, DataContractModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataContractModel_Enumerations(), this.getEnumerationDto(), this.getEnumerationDto_DatacontractModel(), "enumerations", null, 0, -1, DataContractModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataContractModel_ExternalReferences(), this.getExternalReference(), this.getExternalReference_DatacontractModel(), "externalReferences", null, 0, -1, DataContractModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dtoEClass, Dto.class, "Dto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDto_DatacontractModel(), this.getDataContractModel(), this.getDataContractModel_Dtos(), "datacontractModel", null, 0, 1, Dto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(businessClassDtoEClass, BusinessClassDto.class, "BusinessClassDto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBusinessClassDto_Properties(), this.getDtoProperty(), this.getDtoProperty_BusinessClassDto(), "properties", null, 0, -1, BusinessClassDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBusinessClassDto_Base(), this.getExternalReference(), null, "base", null, 0, 1, BusinessClassDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBusinessClassDto_PropertyReferences(), this.getBusinessClassPropertyReference(), this.getBusinessClassPropertyReference_Dto(), "propertyReferences", null, 0, -1, BusinessClassDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBusinessClassDto_AssociationReferences(), this.getBusinessClassAssociationRoleReference(), this.getBusinessClassAssociationRoleReference_Dto(), "associationReferences", null, 0, -1, BusinessClassDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBusinessClassDto_Creatable(), ecorePackage.getEBoolean(), "creatable", null, 0, 1, BusinessClassDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dtoPropertyEClass, DtoProperty.class, "DtoProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDtoProperty_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, DtoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDtoProperty_BusinessClassDto(), this.getBusinessClassDto(), this.getBusinessClassDto_Properties(), "businessClassDto", null, 0, 1, DtoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDtoProperty_CustomDto(), this.getCustomDto(), this.getCustomDto_Properties(), "customDto", null, 0, 1, DtoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDtoProperty_MandatoryForCreation(), ecorePackage.getEBoolean(), "mandatoryForCreation", "false", 0, 1, DtoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDtoProperty_Nullable(), ecorePackage.getEBoolean(), "nullable", "true", 0, 1, DtoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDtoProperty_Writable(), ecorePackage.getEBoolean(), "writable", "true", 0, 1, DtoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dtoDataPropertyEClass, DtoDataProperty.class, "DtoDataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDtoDataProperty_HasDefault(), ecorePackage.getEBoolean(), "hasDefault", "false", 0, 1, DtoDataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dtoStringPropertyEClass, DtoStringProperty.class, "DtoStringProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDtoStringProperty_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, DtoStringProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dtoBooleanPropertyEClass, DtoBooleanProperty.class, "DtoBooleanProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDtoBooleanProperty_DefaultValue(), ecorePackage.getEBooleanObject(), "defaultValue", null, 0, 1, DtoBooleanProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(enumerationDtoEClass, EnumerationDto.class, "EnumerationDto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEnumerationDto_Literals(), this.getEnumerationDtoLiteral(), null, "literals", null, 0, -1, EnumerationDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumerationDto_Base(), this.getExternalReference(), null, "base", null, 0, 1, EnumerationDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumerationDto_DatacontractModel(), this.getDataContractModel(), this.getDataContractModel_Enumerations(), "datacontractModel", null, 0, 1, EnumerationDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(enumerationDtoLiteralEClass, EnumerationDtoLiteral.class, "EnumerationDtoLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEnumerationDtoLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, EnumerationDtoLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(customDtoEClass, CustomDto.class, "CustomDto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCustomDto_Properties(), this.getDtoProperty(), this.getDtoProperty_CustomDto(), "properties", null, 0, -1, CustomDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dtoIntegerPropertyEClass, DtoIntegerProperty.class, "DtoIntegerProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDtoIntegerProperty_DefaultValue(), ecorePackage.getEIntegerObject(), "defaultValue", null, 0, 1, DtoIntegerProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dtoDecimalPropertyEClass, DtoDecimalProperty.class, "DtoDecimalProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDtoDecimalProperty_DefaultValue(), ecorePackage.getEBigDecimal(), "defaultValue", null, 0, 1, DtoDecimalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dtoEnumerationPropertyEClass, DtoEnumerationProperty.class, "DtoEnumerationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDtoEnumerationProperty_Type(), this.getEnumerationDto(), null, "type", null, 0, 1, DtoEnumerationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDtoEnumerationProperty_DefaultValueAsString(), ecorePackage.getEString(), "defaultValueAsString", null, 0, 1, DtoEnumerationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dtoDateTimePropertyEClass, DtoDateTimeProperty.class, "DtoDateTimeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDtoDateTimeProperty_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, DtoDateTimeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(businessClassPropertyReferenceEClass, BusinessClassPropertyReference.class, "BusinessClassPropertyReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBusinessClassPropertyReference_Dto(), this.getBusinessClassDto(), this.getBusinessClassDto_PropertyReferences(), "dto", null, 0, 1, BusinessClassPropertyReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(businessClassAssociationRoleReferenceEClass, BusinessClassAssociationRoleReference.class, "BusinessClassAssociationRoleReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBusinessClassAssociationRoleReference_Dto(), this.getBusinessClassDto(), this.getBusinessClassDto_AssociationReferences(), "dto", null, 0, 1, BusinessClassAssociationRoleReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBusinessClassAssociationRoleReference_DtoType(), this.getDto(), null, "dtoType", null, 0, 1, BusinessClassAssociationRoleReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dtoAssociationRolePropertyEClass, DtoAssociationRoleProperty.class, "DtoAssociationRoleProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDtoAssociationRoleProperty_DtoType(), this.getDto(), null, "dtoType", null, 0, 1, DtoAssociationRoleProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDtoAssociationRoleProperty_Ordered(), ecorePackage.getEBoolean(), "ordered", "false", 0, 1, DtoAssociationRoleProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDtoAssociationRoleProperty_Multiplicity(), this.getMultiplicity(), "multiplicity", "ONE", 0, 1, DtoAssociationRoleProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(externalReferenceEClass, ExternalReference.class, "ExternalReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getExternalReference_Modelname(), ecorePackage.getEString(), "modelname", "", 0, 1, ExternalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExternalReference_DatacontractModel(), this.getDataContractModel(), this.getDataContractModel_ExternalReferences(), "datacontractModel", null, 0, 1, ExternalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExternalReference_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, ExternalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(multiplicityEEnum, Multiplicity.class, "Multiplicity");
        addEEnumLiteral(multiplicityEEnum, Multiplicity.NONE);
        addEEnumLiteral(multiplicityEEnum, Multiplicity.ONE);
        addEEnumLiteral(multiplicityEEnum, Multiplicity.MANY);

        // Create resource
        createResource(eNS_URI);
    }

} //DataContractDslPackageImpl
