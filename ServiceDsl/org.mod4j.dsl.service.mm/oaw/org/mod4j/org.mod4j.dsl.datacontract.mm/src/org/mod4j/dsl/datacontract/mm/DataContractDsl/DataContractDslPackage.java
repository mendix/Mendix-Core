/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.datacontract.mm.DataContractDsl;

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
 * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslFactory
 * @model kind="package"
 * @generated
 */
public interface DataContractDslPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "DataContractDsl";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://www.mendix.org/datacontract";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "datacontract";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	DataContractDslPackage eINSTANCE = org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl.init();

	/**
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.ModelElementImpl
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getModelElement()
     * @generated
     */
	int MODEL_ELEMENT = 9;

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
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractModelImpl <em>Data Contract Model</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractModelImpl
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDataContractModel()
     * @generated
     */
	int DATA_CONTRACT_MODEL = 0;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_CONTRACT_MODEL__NAME = MODEL_ELEMENT__NAME;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_CONTRACT_MODEL__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Dtos</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_CONTRACT_MODEL__DTOS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Enumerations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_CONTRACT_MODEL__ENUMERATIONS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>External References</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_CONTRACT_MODEL__EXTERNAL_REFERENCES = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
     * The number of structural features of the '<em>Data Contract Model</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_CONTRACT_MODEL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoImpl <em>Dto</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoImpl
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDto()
     * @generated
     */
	int DTO = 1;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO__NAME = MODEL_ELEMENT__NAME;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Datacontract Model</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO__DATACONTRACT_MODEL = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Dto</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassDtoImpl <em>Business Class Dto</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassDtoImpl
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getBusinessClassDto()
     * @generated
     */
	int BUSINESS_CLASS_DTO = 2;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BUSINESS_CLASS_DTO__NAME = DTO__NAME;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BUSINESS_CLASS_DTO__DESCRIPTION = DTO__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Datacontract Model</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BUSINESS_CLASS_DTO__DATACONTRACT_MODEL = DTO__DATACONTRACT_MODEL;

	/**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BUSINESS_CLASS_DTO__PROPERTIES = DTO_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Base</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BUSINESS_CLASS_DTO__BASE = DTO_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Property References</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BUSINESS_CLASS_DTO__PROPERTY_REFERENCES = DTO_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Association References</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BUSINESS_CLASS_DTO__ASSOCIATION_REFERENCES = DTO_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Creatable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BUSINESS_CLASS_DTO__CREATABLE = DTO_FEATURE_COUNT + 4;

	/**
     * The number of structural features of the '<em>Business Class Dto</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BUSINESS_CLASS_DTO_FEATURE_COUNT = DTO_FEATURE_COUNT + 5;

	/**
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyImpl <em>Dto Property</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyImpl
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoProperty()
     * @generated
     */
	int DTO_PROPERTY = 3;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_PROPERTY__NAME = MODEL_ELEMENT__NAME;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_PROPERTY__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_PROPERTY__DATA_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Business Class Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_PROPERTY__BUSINESS_CLASS_DTO = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Custom Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_PROPERTY__CUSTOM_DTO = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Mandatory For Creation</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_PROPERTY__MANDATORY_FOR_CREATION = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_PROPERTY__NULLABLE = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Writable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_PROPERTY__WRITABLE = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
     * The number of structural features of the '<em>Dto Property</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_PROPERTY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoDataPropertyImpl <em>Dto Data Property</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoDataPropertyImpl
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoDataProperty()
     * @generated
     */
	int DTO_DATA_PROPERTY = 4;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DATA_PROPERTY__NAME = DTO_PROPERTY__NAME;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DATA_PROPERTY__DESCRIPTION = DTO_PROPERTY__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DATA_PROPERTY__DATA_TYPE = DTO_PROPERTY__DATA_TYPE;

	/**
     * The feature id for the '<em><b>Business Class Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DATA_PROPERTY__BUSINESS_CLASS_DTO = DTO_PROPERTY__BUSINESS_CLASS_DTO;

	/**
     * The feature id for the '<em><b>Custom Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DATA_PROPERTY__CUSTOM_DTO = DTO_PROPERTY__CUSTOM_DTO;

	/**
     * The feature id for the '<em><b>Mandatory For Creation</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DATA_PROPERTY__MANDATORY_FOR_CREATION = DTO_PROPERTY__MANDATORY_FOR_CREATION;

	/**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DATA_PROPERTY__NULLABLE = DTO_PROPERTY__NULLABLE;

	/**
     * The feature id for the '<em><b>Writable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DATA_PROPERTY__WRITABLE = DTO_PROPERTY__WRITABLE;

	/**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DATA_PROPERTY__HAS_DEFAULT = DTO_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Dto Data Property</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DATA_PROPERTY_FEATURE_COUNT = DTO_PROPERTY_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoStringPropertyImpl <em>Dto String Property</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoStringPropertyImpl
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoStringProperty()
     * @generated
     */
	int DTO_STRING_PROPERTY = 5;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_STRING_PROPERTY__NAME = DTO_DATA_PROPERTY__NAME;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_STRING_PROPERTY__DESCRIPTION = DTO_DATA_PROPERTY__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_STRING_PROPERTY__DATA_TYPE = DTO_DATA_PROPERTY__DATA_TYPE;

	/**
     * The feature id for the '<em><b>Business Class Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_STRING_PROPERTY__BUSINESS_CLASS_DTO = DTO_DATA_PROPERTY__BUSINESS_CLASS_DTO;

	/**
     * The feature id for the '<em><b>Custom Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_STRING_PROPERTY__CUSTOM_DTO = DTO_DATA_PROPERTY__CUSTOM_DTO;

	/**
     * The feature id for the '<em><b>Mandatory For Creation</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_STRING_PROPERTY__MANDATORY_FOR_CREATION = DTO_DATA_PROPERTY__MANDATORY_FOR_CREATION;

	/**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_STRING_PROPERTY__NULLABLE = DTO_DATA_PROPERTY__NULLABLE;

	/**
     * The feature id for the '<em><b>Writable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_STRING_PROPERTY__WRITABLE = DTO_DATA_PROPERTY__WRITABLE;

	/**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_STRING_PROPERTY__HAS_DEFAULT = DTO_DATA_PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_STRING_PROPERTY__DEFAULT_VALUE = DTO_DATA_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Dto String Property</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_STRING_PROPERTY_FEATURE_COUNT = DTO_DATA_PROPERTY_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoBooleanPropertyImpl <em>Dto Boolean Property</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoBooleanPropertyImpl
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoBooleanProperty()
     * @generated
     */
	int DTO_BOOLEAN_PROPERTY = 6;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_BOOLEAN_PROPERTY__NAME = DTO_DATA_PROPERTY__NAME;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_BOOLEAN_PROPERTY__DESCRIPTION = DTO_DATA_PROPERTY__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_BOOLEAN_PROPERTY__DATA_TYPE = DTO_DATA_PROPERTY__DATA_TYPE;

	/**
     * The feature id for the '<em><b>Business Class Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_BOOLEAN_PROPERTY__BUSINESS_CLASS_DTO = DTO_DATA_PROPERTY__BUSINESS_CLASS_DTO;

	/**
     * The feature id for the '<em><b>Custom Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_BOOLEAN_PROPERTY__CUSTOM_DTO = DTO_DATA_PROPERTY__CUSTOM_DTO;

	/**
     * The feature id for the '<em><b>Mandatory For Creation</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_BOOLEAN_PROPERTY__MANDATORY_FOR_CREATION = DTO_DATA_PROPERTY__MANDATORY_FOR_CREATION;

	/**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_BOOLEAN_PROPERTY__NULLABLE = DTO_DATA_PROPERTY__NULLABLE;

	/**
     * The feature id for the '<em><b>Writable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_BOOLEAN_PROPERTY__WRITABLE = DTO_DATA_PROPERTY__WRITABLE;

	/**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_BOOLEAN_PROPERTY__HAS_DEFAULT = DTO_DATA_PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_BOOLEAN_PROPERTY__DEFAULT_VALUE = DTO_DATA_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Dto Boolean Property</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_BOOLEAN_PROPERTY_FEATURE_COUNT = DTO_DATA_PROPERTY_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.EnumerationDtoImpl <em>Enumeration Dto</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.EnumerationDtoImpl
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getEnumerationDto()
     * @generated
     */
	int ENUMERATION_DTO = 7;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ENUMERATION_DTO__NAME = MODEL_ELEMENT__NAME;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ENUMERATION_DTO__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Literals</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ENUMERATION_DTO__LITERALS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Base</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ENUMERATION_DTO__BASE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Datacontract Model</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ENUMERATION_DTO__DATACONTRACT_MODEL = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
     * The number of structural features of the '<em>Enumeration Dto</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ENUMERATION_DTO_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.EnumerationDtoLiteralImpl <em>Enumeration Dto Literal</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.EnumerationDtoLiteralImpl
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getEnumerationDtoLiteral()
     * @generated
     */
	int ENUMERATION_DTO_LITERAL = 8;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ENUMERATION_DTO_LITERAL__NAME = MODEL_ELEMENT__NAME;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ENUMERATION_DTO_LITERAL__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ENUMERATION_DTO_LITERAL__VALUE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Enumeration Dto Literal</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ENUMERATION_DTO_LITERAL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.CustomDtoImpl <em>Custom Dto</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.CustomDtoImpl
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getCustomDto()
     * @generated
     */
	int CUSTOM_DTO = 10;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CUSTOM_DTO__NAME = DTO__NAME;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CUSTOM_DTO__DESCRIPTION = DTO__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Datacontract Model</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CUSTOM_DTO__DATACONTRACT_MODEL = DTO__DATACONTRACT_MODEL;

	/**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CUSTOM_DTO__PROPERTIES = DTO_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Custom Dto</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CUSTOM_DTO_FEATURE_COUNT = DTO_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoIntegerPropertyImpl <em>Dto Integer Property</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoIntegerPropertyImpl
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoIntegerProperty()
     * @generated
     */
	int DTO_INTEGER_PROPERTY = 11;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_INTEGER_PROPERTY__NAME = DTO_DATA_PROPERTY__NAME;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_INTEGER_PROPERTY__DESCRIPTION = DTO_DATA_PROPERTY__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_INTEGER_PROPERTY__DATA_TYPE = DTO_DATA_PROPERTY__DATA_TYPE;

	/**
     * The feature id for the '<em><b>Business Class Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_INTEGER_PROPERTY__BUSINESS_CLASS_DTO = DTO_DATA_PROPERTY__BUSINESS_CLASS_DTO;

	/**
     * The feature id for the '<em><b>Custom Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_INTEGER_PROPERTY__CUSTOM_DTO = DTO_DATA_PROPERTY__CUSTOM_DTO;

	/**
     * The feature id for the '<em><b>Mandatory For Creation</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_INTEGER_PROPERTY__MANDATORY_FOR_CREATION = DTO_DATA_PROPERTY__MANDATORY_FOR_CREATION;

	/**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_INTEGER_PROPERTY__NULLABLE = DTO_DATA_PROPERTY__NULLABLE;

	/**
     * The feature id for the '<em><b>Writable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_INTEGER_PROPERTY__WRITABLE = DTO_DATA_PROPERTY__WRITABLE;

	/**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_INTEGER_PROPERTY__HAS_DEFAULT = DTO_DATA_PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_INTEGER_PROPERTY__DEFAULT_VALUE = DTO_DATA_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Dto Integer Property</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_INTEGER_PROPERTY_FEATURE_COUNT = DTO_DATA_PROPERTY_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoDecimalPropertyImpl <em>Dto Decimal Property</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoDecimalPropertyImpl
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoDecimalProperty()
     * @generated
     */
	int DTO_DECIMAL_PROPERTY = 12;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DECIMAL_PROPERTY__NAME = DTO_DATA_PROPERTY__NAME;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DECIMAL_PROPERTY__DESCRIPTION = DTO_DATA_PROPERTY__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DECIMAL_PROPERTY__DATA_TYPE = DTO_DATA_PROPERTY__DATA_TYPE;

	/**
     * The feature id for the '<em><b>Business Class Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DECIMAL_PROPERTY__BUSINESS_CLASS_DTO = DTO_DATA_PROPERTY__BUSINESS_CLASS_DTO;

	/**
     * The feature id for the '<em><b>Custom Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DECIMAL_PROPERTY__CUSTOM_DTO = DTO_DATA_PROPERTY__CUSTOM_DTO;

	/**
     * The feature id for the '<em><b>Mandatory For Creation</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DECIMAL_PROPERTY__MANDATORY_FOR_CREATION = DTO_DATA_PROPERTY__MANDATORY_FOR_CREATION;

	/**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DECIMAL_PROPERTY__NULLABLE = DTO_DATA_PROPERTY__NULLABLE;

	/**
     * The feature id for the '<em><b>Writable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DECIMAL_PROPERTY__WRITABLE = DTO_DATA_PROPERTY__WRITABLE;

	/**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DECIMAL_PROPERTY__HAS_DEFAULT = DTO_DATA_PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DECIMAL_PROPERTY__DEFAULT_VALUE = DTO_DATA_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Dto Decimal Property</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DECIMAL_PROPERTY_FEATURE_COUNT = DTO_DATA_PROPERTY_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoEnumerationPropertyImpl <em>Dto Enumeration Property</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoEnumerationPropertyImpl
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoEnumerationProperty()
     * @generated
     */
	int DTO_ENUMERATION_PROPERTY = 13;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ENUMERATION_PROPERTY__NAME = DTO_DATA_PROPERTY__NAME;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ENUMERATION_PROPERTY__DESCRIPTION = DTO_DATA_PROPERTY__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ENUMERATION_PROPERTY__DATA_TYPE = DTO_DATA_PROPERTY__DATA_TYPE;

	/**
     * The feature id for the '<em><b>Business Class Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ENUMERATION_PROPERTY__BUSINESS_CLASS_DTO = DTO_DATA_PROPERTY__BUSINESS_CLASS_DTO;

	/**
     * The feature id for the '<em><b>Custom Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ENUMERATION_PROPERTY__CUSTOM_DTO = DTO_DATA_PROPERTY__CUSTOM_DTO;

	/**
     * The feature id for the '<em><b>Mandatory For Creation</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ENUMERATION_PROPERTY__MANDATORY_FOR_CREATION = DTO_DATA_PROPERTY__MANDATORY_FOR_CREATION;

	/**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ENUMERATION_PROPERTY__NULLABLE = DTO_DATA_PROPERTY__NULLABLE;

	/**
     * The feature id for the '<em><b>Writable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ENUMERATION_PROPERTY__WRITABLE = DTO_DATA_PROPERTY__WRITABLE;

	/**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_ENUMERATION_PROPERTY__HAS_DEFAULT = DTO_DATA_PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ENUMERATION_PROPERTY__TYPE = DTO_DATA_PROPERTY_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Default Value As String</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_ENUMERATION_PROPERTY__DEFAULT_VALUE_AS_STRING = DTO_DATA_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Dto Enumeration Property</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ENUMERATION_PROPERTY_FEATURE_COUNT = DTO_DATA_PROPERTY_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoDateTimePropertyImpl <em>Dto Date Time Property</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoDateTimePropertyImpl
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoDateTimeProperty()
     * @generated
     */
	int DTO_DATE_TIME_PROPERTY = 14;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DATE_TIME_PROPERTY__NAME = DTO_DATA_PROPERTY__NAME;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DATE_TIME_PROPERTY__DESCRIPTION = DTO_DATA_PROPERTY__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DATE_TIME_PROPERTY__DATA_TYPE = DTO_DATA_PROPERTY__DATA_TYPE;

	/**
     * The feature id for the '<em><b>Business Class Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DATE_TIME_PROPERTY__BUSINESS_CLASS_DTO = DTO_DATA_PROPERTY__BUSINESS_CLASS_DTO;

	/**
     * The feature id for the '<em><b>Custom Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DATE_TIME_PROPERTY__CUSTOM_DTO = DTO_DATA_PROPERTY__CUSTOM_DTO;

	/**
     * The feature id for the '<em><b>Mandatory For Creation</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DATE_TIME_PROPERTY__MANDATORY_FOR_CREATION = DTO_DATA_PROPERTY__MANDATORY_FOR_CREATION;

	/**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DATE_TIME_PROPERTY__NULLABLE = DTO_DATA_PROPERTY__NULLABLE;

	/**
     * The feature id for the '<em><b>Writable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DATE_TIME_PROPERTY__WRITABLE = DTO_DATA_PROPERTY__WRITABLE;

	/**
     * The feature id for the '<em><b>Has Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DATE_TIME_PROPERTY__HAS_DEFAULT = DTO_DATA_PROPERTY__HAS_DEFAULT;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_DATE_TIME_PROPERTY__DEFAULT_VALUE = DTO_DATA_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Dto Date Time Property</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_DATE_TIME_PROPERTY_FEATURE_COUNT = DTO_DATA_PROPERTY_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassPropertyReferenceImpl <em>Business Class Property Reference</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassPropertyReferenceImpl
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getBusinessClassPropertyReference()
     * @generated
     */
	int BUSINESS_CLASS_PROPERTY_REFERENCE = 15;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BUSINESS_CLASS_PROPERTY_REFERENCE__NAME = MODEL_ELEMENT__NAME;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BUSINESS_CLASS_PROPERTY_REFERENCE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BUSINESS_CLASS_PROPERTY_REFERENCE__DTO = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Business Class Property Reference</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BUSINESS_CLASS_PROPERTY_REFERENCE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassAssociationRoleReferenceImpl <em>Business Class Association Role Reference</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassAssociationRoleReferenceImpl
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getBusinessClassAssociationRoleReference()
     * @generated
     */
	int BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE = 16;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__NAME = MODEL_ELEMENT__NAME;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Dto Type</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Business Class Association Role Reference</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoAssociationRolePropertyImpl <em>Dto Association Role Property</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoAssociationRolePropertyImpl
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoAssociationRoleProperty()
     * @generated
     */
	int DTO_ASSOCIATION_ROLE_PROPERTY = 17;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ASSOCIATION_ROLE_PROPERTY__NAME = DTO_PROPERTY__NAME;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ASSOCIATION_ROLE_PROPERTY__DESCRIPTION = DTO_PROPERTY__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ASSOCIATION_ROLE_PROPERTY__DATA_TYPE = DTO_PROPERTY__DATA_TYPE;

	/**
     * The feature id for the '<em><b>Business Class Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ASSOCIATION_ROLE_PROPERTY__BUSINESS_CLASS_DTO = DTO_PROPERTY__BUSINESS_CLASS_DTO;

	/**
     * The feature id for the '<em><b>Custom Dto</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ASSOCIATION_ROLE_PROPERTY__CUSTOM_DTO = DTO_PROPERTY__CUSTOM_DTO;

	/**
     * The feature id for the '<em><b>Mandatory For Creation</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ASSOCIATION_ROLE_PROPERTY__MANDATORY_FOR_CREATION = DTO_PROPERTY__MANDATORY_FOR_CREATION;

	/**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ASSOCIATION_ROLE_PROPERTY__NULLABLE = DTO_PROPERTY__NULLABLE;

	/**
     * The feature id for the '<em><b>Writable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ASSOCIATION_ROLE_PROPERTY__WRITABLE = DTO_PROPERTY__WRITABLE;

	/**
     * The feature id for the '<em><b>Dto Type</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ASSOCIATION_ROLE_PROPERTY__DTO_TYPE = DTO_PROPERTY_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Ordered</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ASSOCIATION_ROLE_PROPERTY__ORDERED = DTO_PROPERTY_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_ASSOCIATION_ROLE_PROPERTY__MULTIPLICITY = DTO_PROPERTY_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Dto Association Role Property</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_ASSOCIATION_ROLE_PROPERTY_FEATURE_COUNT = DTO_PROPERTY_FEATURE_COUNT + 3;

	/**
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.ExternalReferenceImpl
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getExternalReference()
     * @generated
     */
	int EXTERNAL_REFERENCE = 18;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXTERNAL_REFERENCE__NAME = MODEL_ELEMENT__NAME;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXTERNAL_REFERENCE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Modelname</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXTERNAL_REFERENCE__MODELNAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Datacontract Model</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXTERNAL_REFERENCE__DATACONTRACT_MODEL = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Keyword</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTERNAL_REFERENCE__KEYWORD = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>External Reference</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXTERNAL_REFERENCE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;


	/**
     * The meta object id for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.Multiplicity <em>Multiplicity</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.Multiplicity
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getMultiplicity()
     * @generated
     */
    int MULTIPLICITY = 19;


    /**
     * Returns the meta object for class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel <em>Data Contract Model</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Contract Model</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel
     * @generated
     */
	EClass getDataContractModel();

	/**
     * Returns the meta object for the containment reference list '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel#getDtos <em>Dtos</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Dtos</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel#getDtos()
     * @see #getDataContractModel()
     * @generated
     */
	EReference getDataContractModel_Dtos();

	/**
     * Returns the meta object for the containment reference list '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel#getEnumerations <em>Enumerations</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Enumerations</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel#getEnumerations()
     * @see #getDataContractModel()
     * @generated
     */
	EReference getDataContractModel_Enumerations();

	/**
     * Returns the meta object for the containment reference list '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel#getExternalReferences <em>External References</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>External References</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel#getExternalReferences()
     * @see #getDataContractModel()
     * @generated
     */
	EReference getDataContractModel_ExternalReferences();

	/**
     * Returns the meta object for class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.Dto <em>Dto</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.Dto
     * @generated
     */
	EClass getDto();

	/**
     * Returns the meta object for the container reference '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.Dto#getDatacontractModel <em>Datacontract Model</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Datacontract Model</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.Dto#getDatacontractModel()
     * @see #getDto()
     * @generated
     */
	EReference getDto_DatacontractModel();

	/**
     * Returns the meta object for class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto <em>Business Class Dto</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Class Dto</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto
     * @generated
     */
	EClass getBusinessClassDto();

	/**
     * Returns the meta object for the containment reference list '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getProperties()
     * @see #getBusinessClassDto()
     * @generated
     */
	EReference getBusinessClassDto_Properties();

	/**
     * Returns the meta object for the reference '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getBase <em>Base</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Base</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getBase()
     * @see #getBusinessClassDto()
     * @generated
     */
	EReference getBusinessClassDto_Base();

	/**
     * Returns the meta object for the containment reference list '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getPropertyReferences <em>Property References</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property References</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getPropertyReferences()
     * @see #getBusinessClassDto()
     * @generated
     */
	EReference getBusinessClassDto_PropertyReferences();

	/**
     * Returns the meta object for the containment reference list '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getAssociationReferences <em>Association References</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Association References</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getAssociationReferences()
     * @see #getBusinessClassDto()
     * @generated
     */
	EReference getBusinessClassDto_AssociationReferences();

	/**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#isCreatable <em>Creatable</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Creatable</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#isCreatable()
     * @see #getBusinessClassDto()
     * @generated
     */
	EAttribute getBusinessClassDto_Creatable();

	/**
     * Returns the meta object for class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty <em>Dto Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Property</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty
     * @generated
     */
	EClass getDtoProperty();

	/**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#getDataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Type</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#getDataType()
     * @see #getDtoProperty()
     * @generated
     */
	EAttribute getDtoProperty_DataType();

	/**
     * Returns the meta object for the container reference '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#getBusinessClassDto <em>Business Class Dto</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Business Class Dto</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#getBusinessClassDto()
     * @see #getDtoProperty()
     * @generated
     */
	EReference getDtoProperty_BusinessClassDto();

	/**
     * Returns the meta object for the container reference '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#getCustomDto <em>Custom Dto</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Custom Dto</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#getCustomDto()
     * @see #getDtoProperty()
     * @generated
     */
	EReference getDtoProperty_CustomDto();

	/**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#isMandatoryForCreation <em>Mandatory For Creation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mandatory For Creation</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#isMandatoryForCreation()
     * @see #getDtoProperty()
     * @generated
     */
	EAttribute getDtoProperty_MandatoryForCreation();

	/**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#isNullable <em>Nullable</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nullable</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#isNullable()
     * @see #getDtoProperty()
     * @generated
     */
	EAttribute getDtoProperty_Nullable();

	/**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#isWritable <em>Writable</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Writable</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#isWritable()
     * @see #getDtoProperty()
     * @generated
     */
	EAttribute getDtoProperty_Writable();

	/**
     * Returns the meta object for class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDataProperty <em>Dto Data Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Data Property</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDataProperty
     * @generated
     */
	EClass getDtoDataProperty();

	/**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDataProperty#isHasDefault <em>Has Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Has Default</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDataProperty#isHasDefault()
     * @see #getDtoDataProperty()
     * @generated
     */
    EAttribute getDtoDataProperty_HasDefault();

    /**
     * Returns the meta object for class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoStringProperty <em>Dto String Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto String Property</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoStringProperty
     * @generated
     */
	EClass getDtoStringProperty();

	/**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoStringProperty#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoStringProperty#getDefaultValue()
     * @see #getDtoStringProperty()
     * @generated
     */
    EAttribute getDtoStringProperty_DefaultValue();

    /**
     * Returns the meta object for class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoBooleanProperty <em>Dto Boolean Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Boolean Property</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoBooleanProperty
     * @generated
     */
	EClass getDtoBooleanProperty();

	/**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoBooleanProperty#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoBooleanProperty#getDefaultValue()
     * @see #getDtoBooleanProperty()
     * @generated
     */
    EAttribute getDtoBooleanProperty_DefaultValue();

    /**
     * Returns the meta object for class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto <em>Enumeration Dto</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enumeration Dto</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto
     * @generated
     */
	EClass getEnumerationDto();

	/**
     * Returns the meta object for the containment reference list '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto#getLiterals <em>Literals</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Literals</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto#getLiterals()
     * @see #getEnumerationDto()
     * @generated
     */
	EReference getEnumerationDto_Literals();

	/**
     * Returns the meta object for the reference '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto#getBase <em>Base</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Base</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto#getBase()
     * @see #getEnumerationDto()
     * @generated
     */
	EReference getEnumerationDto_Base();

	/**
     * Returns the meta object for the container reference '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto#getDatacontractModel <em>Datacontract Model</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Datacontract Model</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto#getDatacontractModel()
     * @see #getEnumerationDto()
     * @generated
     */
	EReference getEnumerationDto_DatacontractModel();

	/**
     * Returns the meta object for class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDtoLiteral <em>Enumeration Dto Literal</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enumeration Dto Literal</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDtoLiteral
     * @generated
     */
	EClass getEnumerationDtoLiteral();

	/**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDtoLiteral#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDtoLiteral#getValue()
     * @see #getEnumerationDtoLiteral()
     * @generated
     */
	EAttribute getEnumerationDtoLiteral_Value();

	/**
     * Returns the meta object for class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.ModelElement <em>Model Element</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model Element</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.ModelElement
     * @generated
     */
	EClass getModelElement();

	/**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.ModelElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.ModelElement#getName()
     * @see #getModelElement()
     * @generated
     */
	EAttribute getModelElement_Name();

	/**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.ModelElement#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.ModelElement#getDescription()
     * @see #getModelElement()
     * @generated
     */
	EAttribute getModelElement_Description();

	/**
     * Returns the meta object for class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.CustomDto <em>Custom Dto</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Custom Dto</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.CustomDto
     * @generated
     */
	EClass getCustomDto();

	/**
     * Returns the meta object for the containment reference list '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.CustomDto#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.CustomDto#getProperties()
     * @see #getCustomDto()
     * @generated
     */
	EReference getCustomDto_Properties();

	/**
     * Returns the meta object for class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoIntegerProperty <em>Dto Integer Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Integer Property</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoIntegerProperty
     * @generated
     */
	EClass getDtoIntegerProperty();

	/**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoIntegerProperty#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoIntegerProperty#getDefaultValue()
     * @see #getDtoIntegerProperty()
     * @generated
     */
    EAttribute getDtoIntegerProperty_DefaultValue();

    /**
     * Returns the meta object for class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDecimalProperty <em>Dto Decimal Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Decimal Property</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDecimalProperty
     * @generated
     */
	EClass getDtoDecimalProperty();

	/**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDecimalProperty#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDecimalProperty#getDefaultValue()
     * @see #getDtoDecimalProperty()
     * @generated
     */
    EAttribute getDtoDecimalProperty_DefaultValue();

    /**
     * Returns the meta object for class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty <em>Dto Enumeration Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Enumeration Property</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty
     * @generated
     */
	EClass getDtoEnumerationProperty();

	/**
     * Returns the meta object for the reference '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty#getType()
     * @see #getDtoEnumerationProperty()
     * @generated
     */
	EReference getDtoEnumerationProperty_Type();

	/**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty#getDefaultValueAsString <em>Default Value As String</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value As String</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty#getDefaultValueAsString()
     * @see #getDtoEnumerationProperty()
     * @generated
     */
    EAttribute getDtoEnumerationProperty_DefaultValueAsString();

    /**
     * Returns the meta object for class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDateTimeProperty <em>Dto Date Time Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Date Time Property</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDateTimeProperty
     * @generated
     */
	EClass getDtoDateTimeProperty();

	/**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDateTimeProperty#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDateTimeProperty#getDefaultValue()
     * @see #getDtoDateTimeProperty()
     * @generated
     */
    EAttribute getDtoDateTimeProperty_DefaultValue();

    /**
     * Returns the meta object for class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference <em>Business Class Property Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Class Property Reference</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference
     * @generated
     */
	EClass getBusinessClassPropertyReference();

	/**
     * Returns the meta object for the container reference '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference#getDto <em>Dto</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Dto</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference#getDto()
     * @see #getBusinessClassPropertyReference()
     * @generated
     */
	EReference getBusinessClassPropertyReference_Dto();

	/**
     * Returns the meta object for class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference <em>Business Class Association Role Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Class Association Role Reference</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference
     * @generated
     */
	EClass getBusinessClassAssociationRoleReference();

	/**
     * Returns the meta object for the container reference '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference#getDto <em>Dto</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Dto</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference#getDto()
     * @see #getBusinessClassAssociationRoleReference()
     * @generated
     */
	EReference getBusinessClassAssociationRoleReference_Dto();

	/**
     * Returns the meta object for the reference '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference#getDtoType <em>Dto Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Dto Type</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference#getDtoType()
     * @see #getBusinessClassAssociationRoleReference()
     * @generated
     */
	EReference getBusinessClassAssociationRoleReference_DtoType();

	/**
     * Returns the meta object for class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoAssociationRoleProperty <em>Dto Association Role Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Association Role Property</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoAssociationRoleProperty
     * @generated
     */
	EClass getDtoAssociationRoleProperty();

	/**
     * Returns the meta object for the reference '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoAssociationRoleProperty#getDtoType <em>Dto Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Dto Type</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoAssociationRoleProperty#getDtoType()
     * @see #getDtoAssociationRoleProperty()
     * @generated
     */
	EReference getDtoAssociationRoleProperty_DtoType();

	/**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoAssociationRoleProperty#isOrdered <em>Ordered</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ordered</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoAssociationRoleProperty#isOrdered()
     * @see #getDtoAssociationRoleProperty()
     * @generated
     */
	EAttribute getDtoAssociationRoleProperty_Ordered();

	/**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoAssociationRoleProperty#getMultiplicity <em>Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Multiplicity</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoAssociationRoleProperty#getMultiplicity()
     * @see #getDtoAssociationRoleProperty()
     * @generated
     */
    EAttribute getDtoAssociationRoleProperty_Multiplicity();

    /**
     * Returns the meta object for class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference <em>External Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>External Reference</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference
     * @generated
     */
	EClass getExternalReference();

	/**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference#getModelname <em>Modelname</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Modelname</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference#getModelname()
     * @see #getExternalReference()
     * @generated
     */
	EAttribute getExternalReference_Modelname();

	/**
     * Returns the meta object for the container reference '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference#getDatacontractModel <em>Datacontract Model</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Datacontract Model</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference#getDatacontractModel()
     * @see #getExternalReference()
     * @generated
     */
	EReference getExternalReference_DatacontractModel();

	/**
     * Returns the meta object for the attribute '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference#getKeyword <em>Keyword</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Keyword</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference#getKeyword()
     * @see #getExternalReference()
     * @generated
     */
    EAttribute getExternalReference_Keyword();

    /**
     * Returns the meta object for enum '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.Multiplicity <em>Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Multiplicity</em>'.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.Multiplicity
     * @generated
     */
    EEnum getMultiplicity();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	DataContractDslFactory getDataContractDslFactory();

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
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractModelImpl <em>Data Contract Model</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractModelImpl
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDataContractModel()
         * @generated
         */
		EClass DATA_CONTRACT_MODEL = eINSTANCE.getDataContractModel();

		/**
         * The meta object literal for the '<em><b>Dtos</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DATA_CONTRACT_MODEL__DTOS = eINSTANCE.getDataContractModel_Dtos();

		/**
         * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DATA_CONTRACT_MODEL__ENUMERATIONS = eINSTANCE.getDataContractModel_Enumerations();

		/**
         * The meta object literal for the '<em><b>External References</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DATA_CONTRACT_MODEL__EXTERNAL_REFERENCES = eINSTANCE.getDataContractModel_ExternalReferences();

		/**
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoImpl <em>Dto</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoImpl
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDto()
         * @generated
         */
		EClass DTO = eINSTANCE.getDto();

		/**
         * The meta object literal for the '<em><b>Datacontract Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DTO__DATACONTRACT_MODEL = eINSTANCE.getDto_DatacontractModel();

		/**
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassDtoImpl <em>Business Class Dto</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassDtoImpl
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getBusinessClassDto()
         * @generated
         */
		EClass BUSINESS_CLASS_DTO = eINSTANCE.getBusinessClassDto();

		/**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference BUSINESS_CLASS_DTO__PROPERTIES = eINSTANCE.getBusinessClassDto_Properties();

		/**
         * The meta object literal for the '<em><b>Base</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference BUSINESS_CLASS_DTO__BASE = eINSTANCE.getBusinessClassDto_Base();

		/**
         * The meta object literal for the '<em><b>Property References</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference BUSINESS_CLASS_DTO__PROPERTY_REFERENCES = eINSTANCE.getBusinessClassDto_PropertyReferences();

		/**
         * The meta object literal for the '<em><b>Association References</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference BUSINESS_CLASS_DTO__ASSOCIATION_REFERENCES = eINSTANCE.getBusinessClassDto_AssociationReferences();

		/**
         * The meta object literal for the '<em><b>Creatable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute BUSINESS_CLASS_DTO__CREATABLE = eINSTANCE.getBusinessClassDto_Creatable();

		/**
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyImpl <em>Dto Property</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoPropertyImpl
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoProperty()
         * @generated
         */
		EClass DTO_PROPERTY = eINSTANCE.getDtoProperty();

		/**
         * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute DTO_PROPERTY__DATA_TYPE = eINSTANCE.getDtoProperty_DataType();

		/**
         * The meta object literal for the '<em><b>Business Class Dto</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DTO_PROPERTY__BUSINESS_CLASS_DTO = eINSTANCE.getDtoProperty_BusinessClassDto();

		/**
         * The meta object literal for the '<em><b>Custom Dto</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DTO_PROPERTY__CUSTOM_DTO = eINSTANCE.getDtoProperty_CustomDto();

		/**
         * The meta object literal for the '<em><b>Mandatory For Creation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute DTO_PROPERTY__MANDATORY_FOR_CREATION = eINSTANCE.getDtoProperty_MandatoryForCreation();

		/**
         * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute DTO_PROPERTY__NULLABLE = eINSTANCE.getDtoProperty_Nullable();

		/**
         * The meta object literal for the '<em><b>Writable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute DTO_PROPERTY__WRITABLE = eINSTANCE.getDtoProperty_Writable();

		/**
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoDataPropertyImpl <em>Dto Data Property</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoDataPropertyImpl
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoDataProperty()
         * @generated
         */
		EClass DTO_DATA_PROPERTY = eINSTANCE.getDtoDataProperty();

		/**
         * The meta object literal for the '<em><b>Has Default</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DTO_DATA_PROPERTY__HAS_DEFAULT = eINSTANCE.getDtoDataProperty_HasDefault();

        /**
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoStringPropertyImpl <em>Dto String Property</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoStringPropertyImpl
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoStringProperty()
         * @generated
         */
		EClass DTO_STRING_PROPERTY = eINSTANCE.getDtoStringProperty();

		/**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DTO_STRING_PROPERTY__DEFAULT_VALUE = eINSTANCE.getDtoStringProperty_DefaultValue();

        /**
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoBooleanPropertyImpl <em>Dto Boolean Property</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoBooleanPropertyImpl
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoBooleanProperty()
         * @generated
         */
		EClass DTO_BOOLEAN_PROPERTY = eINSTANCE.getDtoBooleanProperty();

		/**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DTO_BOOLEAN_PROPERTY__DEFAULT_VALUE = eINSTANCE.getDtoBooleanProperty_DefaultValue();

        /**
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.EnumerationDtoImpl <em>Enumeration Dto</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.EnumerationDtoImpl
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getEnumerationDto()
         * @generated
         */
		EClass ENUMERATION_DTO = eINSTANCE.getEnumerationDto();

		/**
         * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ENUMERATION_DTO__LITERALS = eINSTANCE.getEnumerationDto_Literals();

		/**
         * The meta object literal for the '<em><b>Base</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ENUMERATION_DTO__BASE = eINSTANCE.getEnumerationDto_Base();

		/**
         * The meta object literal for the '<em><b>Datacontract Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ENUMERATION_DTO__DATACONTRACT_MODEL = eINSTANCE.getEnumerationDto_DatacontractModel();

		/**
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.EnumerationDtoLiteralImpl <em>Enumeration Dto Literal</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.EnumerationDtoLiteralImpl
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getEnumerationDtoLiteral()
         * @generated
         */
		EClass ENUMERATION_DTO_LITERAL = eINSTANCE.getEnumerationDtoLiteral();

		/**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ENUMERATION_DTO_LITERAL__VALUE = eINSTANCE.getEnumerationDtoLiteral_Value();

		/**
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.ModelElementImpl
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getModelElement()
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
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.CustomDtoImpl <em>Custom Dto</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.CustomDtoImpl
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getCustomDto()
         * @generated
         */
		EClass CUSTOM_DTO = eINSTANCE.getCustomDto();

		/**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CUSTOM_DTO__PROPERTIES = eINSTANCE.getCustomDto_Properties();

		/**
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoIntegerPropertyImpl <em>Dto Integer Property</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoIntegerPropertyImpl
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoIntegerProperty()
         * @generated
         */
		EClass DTO_INTEGER_PROPERTY = eINSTANCE.getDtoIntegerProperty();

		/**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DTO_INTEGER_PROPERTY__DEFAULT_VALUE = eINSTANCE.getDtoIntegerProperty_DefaultValue();

        /**
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoDecimalPropertyImpl <em>Dto Decimal Property</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoDecimalPropertyImpl
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoDecimalProperty()
         * @generated
         */
		EClass DTO_DECIMAL_PROPERTY = eINSTANCE.getDtoDecimalProperty();

		/**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DTO_DECIMAL_PROPERTY__DEFAULT_VALUE = eINSTANCE.getDtoDecimalProperty_DefaultValue();

        /**
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoEnumerationPropertyImpl <em>Dto Enumeration Property</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoEnumerationPropertyImpl
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoEnumerationProperty()
         * @generated
         */
		EClass DTO_ENUMERATION_PROPERTY = eINSTANCE.getDtoEnumerationProperty();

		/**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DTO_ENUMERATION_PROPERTY__TYPE = eINSTANCE.getDtoEnumerationProperty_Type();

		/**
         * The meta object literal for the '<em><b>Default Value As String</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DTO_ENUMERATION_PROPERTY__DEFAULT_VALUE_AS_STRING = eINSTANCE.getDtoEnumerationProperty_DefaultValueAsString();

        /**
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoDateTimePropertyImpl <em>Dto Date Time Property</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoDateTimePropertyImpl
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoDateTimeProperty()
         * @generated
         */
		EClass DTO_DATE_TIME_PROPERTY = eINSTANCE.getDtoDateTimeProperty();

		/**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DTO_DATE_TIME_PROPERTY__DEFAULT_VALUE = eINSTANCE.getDtoDateTimeProperty_DefaultValue();

        /**
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassPropertyReferenceImpl <em>Business Class Property Reference</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassPropertyReferenceImpl
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getBusinessClassPropertyReference()
         * @generated
         */
		EClass BUSINESS_CLASS_PROPERTY_REFERENCE = eINSTANCE.getBusinessClassPropertyReference();

		/**
         * The meta object literal for the '<em><b>Dto</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference BUSINESS_CLASS_PROPERTY_REFERENCE__DTO = eINSTANCE.getBusinessClassPropertyReference_Dto();

		/**
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassAssociationRoleReferenceImpl <em>Business Class Association Role Reference</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.BusinessClassAssociationRoleReferenceImpl
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getBusinessClassAssociationRoleReference()
         * @generated
         */
		EClass BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE = eINSTANCE.getBusinessClassAssociationRoleReference();

		/**
         * The meta object literal for the '<em><b>Dto</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO = eINSTANCE.getBusinessClassAssociationRoleReference_Dto();

		/**
         * The meta object literal for the '<em><b>Dto Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE__DTO_TYPE = eINSTANCE.getBusinessClassAssociationRoleReference_DtoType();

		/**
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoAssociationRolePropertyImpl <em>Dto Association Role Property</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DtoAssociationRolePropertyImpl
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getDtoAssociationRoleProperty()
         * @generated
         */
		EClass DTO_ASSOCIATION_ROLE_PROPERTY = eINSTANCE.getDtoAssociationRoleProperty();

		/**
         * The meta object literal for the '<em><b>Dto Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DTO_ASSOCIATION_ROLE_PROPERTY__DTO_TYPE = eINSTANCE.getDtoAssociationRoleProperty_DtoType();

		/**
         * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute DTO_ASSOCIATION_ROLE_PROPERTY__ORDERED = eINSTANCE.getDtoAssociationRoleProperty_Ordered();

		/**
         * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DTO_ASSOCIATION_ROLE_PROPERTY__MULTIPLICITY = eINSTANCE.getDtoAssociationRoleProperty_Multiplicity();

        /**
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.ExternalReferenceImpl
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getExternalReference()
         * @generated
         */
		EClass EXTERNAL_REFERENCE = eINSTANCE.getExternalReference();

		/**
         * The meta object literal for the '<em><b>Modelname</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute EXTERNAL_REFERENCE__MODELNAME = eINSTANCE.getExternalReference_Modelname();

		/**
         * The meta object literal for the '<em><b>Datacontract Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference EXTERNAL_REFERENCE__DATACONTRACT_MODEL = eINSTANCE.getExternalReference_DatacontractModel();

        /**
         * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTERNAL_REFERENCE__KEYWORD = eINSTANCE.getExternalReference_Keyword();

        /**
         * The meta object literal for the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.Multiplicity <em>Multiplicity</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.Multiplicity
         * @see org.mendix.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslPackageImpl#getMultiplicity()
         * @generated
         */
        EEnum MULTIPLICITY = eINSTANCE.getMultiplicity();

	}

} //DataContractDslPackage
