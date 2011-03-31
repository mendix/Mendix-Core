/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.datacontract.mm.DataContractDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mendix.dsl.datacontract.mm.DataContractDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataContractDslFactoryImpl extends EFactoryImpl implements DataContractDslFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static DataContractDslFactory init() {
        try {
            DataContractDslFactory theDataContractDslFactory = (DataContractDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mendix.org/datacontract"); 
            if (theDataContractDslFactory != null) {
                return theDataContractDslFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DataContractDslFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DataContractDslFactoryImpl() {
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
            case DataContractDslPackage.DATA_CONTRACT_MODEL: return createDataContractModel();
            case DataContractDslPackage.DTO: return createDto();
            case DataContractDslPackage.BUSINESS_CLASS_DTO: return createBusinessClassDto();
            case DataContractDslPackage.DTO_PROPERTY: return createDtoProperty();
            case DataContractDslPackage.DTO_DATA_PROPERTY: return createDtoDataProperty();
            case DataContractDslPackage.DTO_STRING_PROPERTY: return createDtoStringProperty();
            case DataContractDslPackage.DTO_BOOLEAN_PROPERTY: return createDtoBooleanProperty();
            case DataContractDslPackage.ENUMERATION_DTO: return createEnumerationDto();
            case DataContractDslPackage.ENUMERATION_DTO_LITERAL: return createEnumerationDtoLiteral();
            case DataContractDslPackage.MODEL_ELEMENT: return createModelElement();
            case DataContractDslPackage.CUSTOM_DTO: return createCustomDto();
            case DataContractDslPackage.DTO_INTEGER_PROPERTY: return createDtoIntegerProperty();
            case DataContractDslPackage.DTO_DECIMAL_PROPERTY: return createDtoDecimalProperty();
            case DataContractDslPackage.DTO_ENUMERATION_PROPERTY: return createDtoEnumerationProperty();
            case DataContractDslPackage.DTO_DATE_TIME_PROPERTY: return createDtoDateTimeProperty();
            case DataContractDslPackage.BUSINESS_CLASS_PROPERTY_REFERENCE: return createBusinessClassPropertyReference();
            case DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE: return createBusinessClassAssociationRoleReference();
            case DataContractDslPackage.DTO_ASSOCIATION_ROLE_PROPERTY: return createDtoAssociationRoleProperty();
            case DataContractDslPackage.EXTERNAL_REFERENCE: return createExternalReference();
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
            case DataContractDslPackage.MULTIPLICITY:
                return createMultiplicityFromString(eDataType, initialValue);
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
            case DataContractDslPackage.MULTIPLICITY:
                return convertMultiplicityToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DataContractModel createDataContractModel() {
        DataContractModelImpl dataContractModel = new DataContractModelImpl();
        return dataContractModel;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Dto createDto() {
        DtoImpl dto = new DtoImpl();
        return dto;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BusinessClassDto createBusinessClassDto() {
        BusinessClassDtoImpl businessClassDto = new BusinessClassDtoImpl();
        return businessClassDto;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DtoProperty createDtoProperty() {
        DtoPropertyImpl dtoProperty = new DtoPropertyImpl();
        return dtoProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DtoDataProperty createDtoDataProperty() {
        DtoDataPropertyImpl dtoDataProperty = new DtoDataPropertyImpl();
        return dtoDataProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DtoStringProperty createDtoStringProperty() {
        DtoStringPropertyImpl dtoStringProperty = new DtoStringPropertyImpl();
        return dtoStringProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DtoBooleanProperty createDtoBooleanProperty() {
        DtoBooleanPropertyImpl dtoBooleanProperty = new DtoBooleanPropertyImpl();
        return dtoBooleanProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EnumerationDto createEnumerationDto() {
        EnumerationDtoImpl enumerationDto = new EnumerationDtoImpl();
        return enumerationDto;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EnumerationDtoLiteral createEnumerationDtoLiteral() {
        EnumerationDtoLiteralImpl enumerationDtoLiteral = new EnumerationDtoLiteralImpl();
        return enumerationDtoLiteral;
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
	public CustomDto createCustomDto() {
        CustomDtoImpl customDto = new CustomDtoImpl();
        return customDto;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DtoIntegerProperty createDtoIntegerProperty() {
        DtoIntegerPropertyImpl dtoIntegerProperty = new DtoIntegerPropertyImpl();
        return dtoIntegerProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DtoDecimalProperty createDtoDecimalProperty() {
        DtoDecimalPropertyImpl dtoDecimalProperty = new DtoDecimalPropertyImpl();
        return dtoDecimalProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DtoEnumerationProperty createDtoEnumerationProperty() {
        DtoEnumerationPropertyImpl dtoEnumerationProperty = new DtoEnumerationPropertyImpl();
        return dtoEnumerationProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DtoDateTimeProperty createDtoDateTimeProperty() {
        DtoDateTimePropertyImpl dtoDateTimeProperty = new DtoDateTimePropertyImpl();
        return dtoDateTimeProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BusinessClassPropertyReference createBusinessClassPropertyReference() {
        BusinessClassPropertyReferenceImpl businessClassPropertyReference = new BusinessClassPropertyReferenceImpl();
        return businessClassPropertyReference;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BusinessClassAssociationRoleReference createBusinessClassAssociationRoleReference() {
        BusinessClassAssociationRoleReferenceImpl businessClassAssociationRoleReference = new BusinessClassAssociationRoleReferenceImpl();
        return businessClassAssociationRoleReference;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DtoAssociationRoleProperty createDtoAssociationRoleProperty() {
        DtoAssociationRolePropertyImpl dtoAssociationRoleProperty = new DtoAssociationRolePropertyImpl();
        return dtoAssociationRoleProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExternalReference createExternalReference() {
        ExternalReferenceImpl externalReference = new ExternalReferenceImpl();
        return externalReference;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Multiplicity createMultiplicityFromString(EDataType eDataType, String initialValue) {
        Multiplicity result = Multiplicity.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMultiplicityToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DataContractDslPackage getDataContractDslPackage() {
        return (DataContractDslPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static DataContractDslPackage getPackage() {
        return DataContractDslPackage.eINSTANCE;
    }

} //DataContractDslFactoryImpl
