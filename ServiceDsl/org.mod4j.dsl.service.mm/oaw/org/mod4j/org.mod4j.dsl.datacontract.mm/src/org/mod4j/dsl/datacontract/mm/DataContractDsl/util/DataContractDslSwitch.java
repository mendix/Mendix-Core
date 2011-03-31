/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.datacontract.mm.DataContractDsl.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.mendix.dsl.datacontract.mm.DataContractDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage
 * @generated
 */
public class DataContractDslSwitch<T> {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static DataContractDslPackage modelPackage;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DataContractDslSwitch() {
        if (modelPackage == null) {
            modelPackage = DataContractDslPackage.eINSTANCE;
        }
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case DataContractDslPackage.DATA_CONTRACT_MODEL: {
                DataContractModel dataContractModel = (DataContractModel)theEObject;
                T result = caseDataContractModel(dataContractModel);
                if (result == null) result = caseModelElement(dataContractModel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DataContractDslPackage.DTO: {
                Dto dto = (Dto)theEObject;
                T result = caseDto(dto);
                if (result == null) result = caseModelElement(dto);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DataContractDslPackage.BUSINESS_CLASS_DTO: {
                BusinessClassDto businessClassDto = (BusinessClassDto)theEObject;
                T result = caseBusinessClassDto(businessClassDto);
                if (result == null) result = caseDto(businessClassDto);
                if (result == null) result = caseModelElement(businessClassDto);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DataContractDslPackage.DTO_PROPERTY: {
                DtoProperty dtoProperty = (DtoProperty)theEObject;
                T result = caseDtoProperty(dtoProperty);
                if (result == null) result = caseModelElement(dtoProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DataContractDslPackage.DTO_DATA_PROPERTY: {
                DtoDataProperty dtoDataProperty = (DtoDataProperty)theEObject;
                T result = caseDtoDataProperty(dtoDataProperty);
                if (result == null) result = caseDtoProperty(dtoDataProperty);
                if (result == null) result = caseModelElement(dtoDataProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DataContractDslPackage.DTO_STRING_PROPERTY: {
                DtoStringProperty dtoStringProperty = (DtoStringProperty)theEObject;
                T result = caseDtoStringProperty(dtoStringProperty);
                if (result == null) result = caseDtoDataProperty(dtoStringProperty);
                if (result == null) result = caseDtoProperty(dtoStringProperty);
                if (result == null) result = caseModelElement(dtoStringProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DataContractDslPackage.DTO_BOOLEAN_PROPERTY: {
                DtoBooleanProperty dtoBooleanProperty = (DtoBooleanProperty)theEObject;
                T result = caseDtoBooleanProperty(dtoBooleanProperty);
                if (result == null) result = caseDtoDataProperty(dtoBooleanProperty);
                if (result == null) result = caseDtoProperty(dtoBooleanProperty);
                if (result == null) result = caseModelElement(dtoBooleanProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DataContractDslPackage.ENUMERATION_DTO: {
                EnumerationDto enumerationDto = (EnumerationDto)theEObject;
                T result = caseEnumerationDto(enumerationDto);
                if (result == null) result = caseModelElement(enumerationDto);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DataContractDslPackage.ENUMERATION_DTO_LITERAL: {
                EnumerationDtoLiteral enumerationDtoLiteral = (EnumerationDtoLiteral)theEObject;
                T result = caseEnumerationDtoLiteral(enumerationDtoLiteral);
                if (result == null) result = caseModelElement(enumerationDtoLiteral);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DataContractDslPackage.MODEL_ELEMENT: {
                ModelElement modelElement = (ModelElement)theEObject;
                T result = caseModelElement(modelElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DataContractDslPackage.CUSTOM_DTO: {
                CustomDto customDto = (CustomDto)theEObject;
                T result = caseCustomDto(customDto);
                if (result == null) result = caseDto(customDto);
                if (result == null) result = caseModelElement(customDto);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DataContractDslPackage.DTO_INTEGER_PROPERTY: {
                DtoIntegerProperty dtoIntegerProperty = (DtoIntegerProperty)theEObject;
                T result = caseDtoIntegerProperty(dtoIntegerProperty);
                if (result == null) result = caseDtoDataProperty(dtoIntegerProperty);
                if (result == null) result = caseDtoProperty(dtoIntegerProperty);
                if (result == null) result = caseModelElement(dtoIntegerProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DataContractDslPackage.DTO_DECIMAL_PROPERTY: {
                DtoDecimalProperty dtoDecimalProperty = (DtoDecimalProperty)theEObject;
                T result = caseDtoDecimalProperty(dtoDecimalProperty);
                if (result == null) result = caseDtoDataProperty(dtoDecimalProperty);
                if (result == null) result = caseDtoProperty(dtoDecimalProperty);
                if (result == null) result = caseModelElement(dtoDecimalProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DataContractDslPackage.DTO_ENUMERATION_PROPERTY: {
                DtoEnumerationProperty dtoEnumerationProperty = (DtoEnumerationProperty)theEObject;
                T result = caseDtoEnumerationProperty(dtoEnumerationProperty);
                if (result == null) result = caseDtoDataProperty(dtoEnumerationProperty);
                if (result == null) result = caseDtoProperty(dtoEnumerationProperty);
                if (result == null) result = caseModelElement(dtoEnumerationProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DataContractDslPackage.DTO_DATE_TIME_PROPERTY: {
                DtoDateTimeProperty dtoDateTimeProperty = (DtoDateTimeProperty)theEObject;
                T result = caseDtoDateTimeProperty(dtoDateTimeProperty);
                if (result == null) result = caseDtoDataProperty(dtoDateTimeProperty);
                if (result == null) result = caseDtoProperty(dtoDateTimeProperty);
                if (result == null) result = caseModelElement(dtoDateTimeProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DataContractDslPackage.BUSINESS_CLASS_PROPERTY_REFERENCE: {
                BusinessClassPropertyReference businessClassPropertyReference = (BusinessClassPropertyReference)theEObject;
                T result = caseBusinessClassPropertyReference(businessClassPropertyReference);
                if (result == null) result = caseModelElement(businessClassPropertyReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DataContractDslPackage.BUSINESS_CLASS_ASSOCIATION_ROLE_REFERENCE: {
                BusinessClassAssociationRoleReference businessClassAssociationRoleReference = (BusinessClassAssociationRoleReference)theEObject;
                T result = caseBusinessClassAssociationRoleReference(businessClassAssociationRoleReference);
                if (result == null) result = caseModelElement(businessClassAssociationRoleReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DataContractDslPackage.DTO_ASSOCIATION_ROLE_PROPERTY: {
                DtoAssociationRoleProperty dtoAssociationRoleProperty = (DtoAssociationRoleProperty)theEObject;
                T result = caseDtoAssociationRoleProperty(dtoAssociationRoleProperty);
                if (result == null) result = caseDtoProperty(dtoAssociationRoleProperty);
                if (result == null) result = caseModelElement(dtoAssociationRoleProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DataContractDslPackage.EXTERNAL_REFERENCE: {
                ExternalReference externalReference = (ExternalReference)theEObject;
                T result = caseExternalReference(externalReference);
                if (result == null) result = caseModelElement(externalReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Data Contract Model</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Contract Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDataContractModel(DataContractModel object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Dto</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dto</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDto(Dto object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Business Class Dto</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Business Class Dto</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBusinessClassDto(BusinessClassDto object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Dto Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dto Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDtoProperty(DtoProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Dto Data Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dto Data Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDtoDataProperty(DtoDataProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Dto String Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dto String Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDtoStringProperty(DtoStringProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Dto Boolean Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dto Boolean Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDtoBooleanProperty(DtoBooleanProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Enumeration Dto</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enumeration Dto</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseEnumerationDto(EnumerationDto object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Enumeration Dto Literal</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enumeration Dto Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseEnumerationDtoLiteral(EnumerationDtoLiteral object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseModelElement(ModelElement object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Custom Dto</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Custom Dto</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCustomDto(CustomDto object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Dto Integer Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dto Integer Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDtoIntegerProperty(DtoIntegerProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Dto Decimal Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dto Decimal Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDtoDecimalProperty(DtoDecimalProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Dto Enumeration Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dto Enumeration Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDtoEnumerationProperty(DtoEnumerationProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Dto Date Time Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dto Date Time Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDtoDateTimeProperty(DtoDateTimeProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Business Class Property Reference</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Business Class Property Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBusinessClassPropertyReference(BusinessClassPropertyReference object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Business Class Association Role Reference</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Business Class Association Role Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBusinessClassAssociationRoleReference(BusinessClassAssociationRoleReference object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Dto Association Role Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dto Association Role Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDtoAssociationRoleProperty(DtoAssociationRoleProperty object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>External Reference</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>External Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseExternalReference(ExternalReference object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
	public T defaultCase(EObject object) {
        return null;
    }

} //DataContractDslSwitch
