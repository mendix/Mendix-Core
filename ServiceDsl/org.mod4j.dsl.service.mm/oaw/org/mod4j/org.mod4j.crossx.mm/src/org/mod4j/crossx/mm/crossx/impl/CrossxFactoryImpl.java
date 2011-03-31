/**
 * (c) Mod4j and contributors
 *
 * $Id$
 */
package org.mendix.crossx.mm.crossx.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mendix.crossx.mm.crossx.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CrossxFactoryImpl extends EFactoryImpl implements CrossxFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CrossxFactory init() {
        try {
            CrossxFactory theCrossxFactory = (CrossxFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mendix.org/mendix.crossx"); 
            if (theCrossxFactory != null) {
                return theCrossxFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CrossxFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CrossxFactoryImpl() {
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
            case CrossxPackage.MODEL_INFO: return createModelInfo();
            case CrossxPackage.SYMBOL: return createSymbol();
            case CrossxPackage.SYMBOL_PROPERTY: return createSymbolProperty();
            case CrossxPackage.LITERAL_SYMBOL_PROPERTY: return createLiteralSymbolProperty();
            case CrossxPackage.REFERENCE_SYMBOL_PROPERTY: return createReferenceSymbolProperty();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelInfo createModelInfo() {
        ModelInfoImpl modelInfo = new ModelInfoImpl();
        return modelInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Symbol createSymbol() {
        SymbolImpl symbol = new SymbolImpl();
        return symbol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SymbolProperty createSymbolProperty() {
        SymbolPropertyImpl symbolProperty = new SymbolPropertyImpl();
        return symbolProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralSymbolProperty createLiteralSymbolProperty() {
        LiteralSymbolPropertyImpl literalSymbolProperty = new LiteralSymbolPropertyImpl();
        return literalSymbolProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReferenceSymbolProperty createReferenceSymbolProperty() {
        ReferenceSymbolPropertyImpl referenceSymbolProperty = new ReferenceSymbolPropertyImpl();
        return referenceSymbolProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CrossxPackage getCrossxPackage() {
        return (CrossxPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CrossxPackage getPackage() {
        return CrossxPackage.eINSTANCE;
    }

} //CrossxFactoryImpl
