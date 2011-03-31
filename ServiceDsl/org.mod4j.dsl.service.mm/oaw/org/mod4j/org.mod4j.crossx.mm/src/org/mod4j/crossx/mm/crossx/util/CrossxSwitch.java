/**
 * (c) Mod4j and contributors
 *
 * $Id$
 */
package org.mendix.crossx.mm.crossx.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.mendix.crossx.mm.crossx.*;

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
 * @see org.mendix.crossx.mm.crossx.CrossxPackage
 * @generated
 */
public class CrossxSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CrossxPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CrossxSwitch() {
        if (modelPackage == null) {
            modelPackage = CrossxPackage.eINSTANCE;
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
            case CrossxPackage.MODEL_INFO: {
                ModelInfo modelInfo = (ModelInfo)theEObject;
                T result = caseModelInfo(modelInfo);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CrossxPackage.SYMBOL: {
                Symbol symbol = (Symbol)theEObject;
                T result = caseSymbol(symbol);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CrossxPackage.SYMBOL_PROPERTY: {
                SymbolProperty symbolProperty = (SymbolProperty)theEObject;
                T result = caseSymbolProperty(symbolProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CrossxPackage.LITERAL_SYMBOL_PROPERTY: {
                LiteralSymbolProperty literalSymbolProperty = (LiteralSymbolProperty)theEObject;
                T result = caseLiteralSymbolProperty(literalSymbolProperty);
                if (result == null) result = caseSymbolProperty(literalSymbolProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CrossxPackage.REFERENCE_SYMBOL_PROPERTY: {
                ReferenceSymbolProperty referenceSymbolProperty = (ReferenceSymbolProperty)theEObject;
                T result = caseReferenceSymbolProperty(referenceSymbolProperty);
                if (result == null) result = caseSymbolProperty(referenceSymbolProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModelInfo(ModelInfo object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Symbol</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Symbol</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSymbol(Symbol object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Symbol Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Symbol Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSymbolProperty(SymbolProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Literal Symbol Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Literal Symbol Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLiteralSymbolProperty(LiteralSymbolProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reference Symbol Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reference Symbol Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReferenceSymbolProperty(ReferenceSymbolProperty object) {
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

} //CrossxSwitch
