/**
 * (c) Mod4j and contributors
 *
 * $Id$
 */
package org.mendix.crossx.mm.crossx.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.mendix.crossx.mm.crossx.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mendix.crossx.mm.crossx.CrossxPackage
 * @generated
 */
public class CrossxAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CrossxPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CrossxAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = CrossxPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CrossxSwitch<Adapter> modelSwitch =
        new CrossxSwitch<Adapter>() {
            @Override
            public Adapter caseModelInfo(ModelInfo object) {
                return createModelInfoAdapter();
            }
            @Override
            public Adapter caseSymbol(Symbol object) {
                return createSymbolAdapter();
            }
            @Override
            public Adapter caseSymbolProperty(SymbolProperty object) {
                return createSymbolPropertyAdapter();
            }
            @Override
            public Adapter caseLiteralSymbolProperty(LiteralSymbolProperty object) {
                return createLiteralSymbolPropertyAdapter();
            }
            @Override
            public Adapter caseReferenceSymbolProperty(ReferenceSymbolProperty object) {
                return createReferenceSymbolPropertyAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.mendix.crossx.mm.crossx.ModelInfo <em>Model Info</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.crossx.mm.crossx.ModelInfo
     * @generated
     */
    public Adapter createModelInfoAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mendix.crossx.mm.crossx.Symbol <em>Symbol</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.crossx.mm.crossx.Symbol
     * @generated
     */
    public Adapter createSymbolAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mendix.crossx.mm.crossx.SymbolProperty <em>Symbol Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.crossx.mm.crossx.SymbolProperty
     * @generated
     */
    public Adapter createSymbolPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mendix.crossx.mm.crossx.LiteralSymbolProperty <em>Literal Symbol Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.crossx.mm.crossx.LiteralSymbolProperty
     * @generated
     */
    public Adapter createLiteralSymbolPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mendix.crossx.mm.crossx.ReferenceSymbolProperty <em>Reference Symbol Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.crossx.mm.crossx.ReferenceSymbolProperty
     * @generated
     */
    public Adapter createReferenceSymbolPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //CrossxAdapterFactory
