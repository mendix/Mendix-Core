/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.service.mm.ServiceDsl.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.mendix.dsl.service.mm.ServiceDsl.*;

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
 * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage
 * @generated
 */
public class ServiceDslSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ServiceDslPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceDslSwitch() {
        if (modelPackage == null) {
            modelPackage = ServiceDslPackage.eINSTANCE;
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
            case ServiceDslPackage.SERVICE_MODEL: {
                ServiceModel serviceModel = (ServiceModel)theEObject;
                T result = caseServiceModel(serviceModel);
                if (result == null) result = caseModelElement(serviceModel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ServiceDslPackage.MODEL_ELEMENT: {
                ModelElement modelElement = (ModelElement)theEObject;
                T result = caseModelElement(modelElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ServiceDslPackage.DTO_REFERENCE: {
                DtoReference dtoReference = (DtoReference)theEObject;
                T result = caseDtoReference(dtoReference);
                if (result == null) result = caseModelElement(dtoReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ServiceDslPackage.CUSTOM_METHOD: {
                CustomMethod customMethod = (CustomMethod)theEObject;
                T result = caseCustomMethod(customMethod);
                if (result == null) result = caseServiceMethod(customMethod);
                if (result == null) result = caseModelElement(customMethod);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ServiceDslPackage.CRUD_SERVICE: {
                CrudService crudService = (CrudService)theEObject;
                T result = caseCrudService(crudService);
                if (result == null) result = caseModelElement(crudService);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ServiceDslPackage.SPECIAL_METHOD: {
                SpecialMethod specialMethod = (SpecialMethod)theEObject;
                T result = caseSpecialMethod(specialMethod);
                if (result == null) result = caseServiceMethod(specialMethod);
                if (result == null) result = caseModelElement(specialMethod);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ServiceDslPackage.SERVICE_METHOD: {
                ServiceMethod serviceMethod = (ServiceMethod)theEObject;
                T result = caseServiceMethod(serviceMethod);
                if (result == null) result = caseModelElement(serviceMethod);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ServiceDslPackage.PARAMETER: {
                Parameter parameter = (Parameter)theEObject;
                T result = caseParameter(parameter);
                if (result == null) result = caseModelElement(parameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ServiceDslPackage.ASSOCIATION_METHOD: {
                AssociationMethod associationMethod = (AssociationMethod)theEObject;
                T result = caseAssociationMethod(associationMethod);
                if (result == null) result = caseServiceMethod(associationMethod);
                if (result == null) result = caseModelElement(associationMethod);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceModel(ServiceModel object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Dto Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dto Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDtoReference(DtoReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Custom Method</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Custom Method</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCustomMethod(CustomMethod object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Crud Service</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Crud Service</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCrudService(CrudService object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Special Method</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Special Method</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSpecialMethod(SpecialMethod object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Method</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Method</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceMethod(ServiceMethod object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParameter(Parameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Association Method</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Association Method</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssociationMethod(AssociationMethod object) {
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

} //ServiceDslSwitch
