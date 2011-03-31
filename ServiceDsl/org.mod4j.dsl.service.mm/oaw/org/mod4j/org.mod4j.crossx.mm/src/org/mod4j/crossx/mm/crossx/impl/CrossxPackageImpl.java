/**
 * (c) Mod4j and contributors
 *
 * $Id$
 */
package org.mendix.crossx.mm.crossx.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mendix.crossx.mm.crossx.CrossxFactory;
import org.mendix.crossx.mm.crossx.CrossxPackage;
import org.mendix.crossx.mm.crossx.LiteralSymbolProperty;
import org.mendix.crossx.mm.crossx.ModelInfo;
import org.mendix.crossx.mm.crossx.ReferenceSymbolProperty;
import org.mendix.crossx.mm.crossx.Symbol;
import org.mendix.crossx.mm.crossx.SymbolProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CrossxPackageImpl extends EPackageImpl implements CrossxPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modelInfoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass symbolEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass symbolPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass literalSymbolPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referenceSymbolPropertyEClass = null;

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
     * @see org.mendix.crossx.mm.crossx.CrossxPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private CrossxPackageImpl() {
        super(eNS_URI, CrossxFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link CrossxPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static CrossxPackage init() {
        if (isInited) return (CrossxPackage)EPackage.Registry.INSTANCE.getEPackage(CrossxPackage.eNS_URI);

        // Obtain or create and register package
        CrossxPackageImpl theCrossxPackage = (CrossxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CrossxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CrossxPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theCrossxPackage.createPackageContents();

        // Initialize created meta-data
        theCrossxPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theCrossxPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CrossxPackage.eNS_URI, theCrossxPackage);
        return theCrossxPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModelInfo() {
        return modelInfoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModelInfo_Symbols() {
        return (EReference)modelInfoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelInfo_LastChanged() {
        return (EAttribute)modelInfoEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelInfo_Modelname() {
        return (EAttribute)modelInfoEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelInfo_Resource() {
        return (EAttribute)modelInfoEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelInfo_Dslname() {
        return (EAttribute)modelInfoEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSymbol() {
        return symbolEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSymbol_Name() {
        return (EAttribute)symbolEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSymbol_Type() {
        return (EAttribute)symbolEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSymbol_Properties() {
        return (EReference)symbolEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSymbol_SubSymbols() {
        return (EReference)symbolEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSymbol_Owner() {
        return (EReference)symbolEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSymbol_Parent() {
        return (EReference)symbolEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSymbolProperty() {
        return symbolPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSymbolProperty_Name() {
        return (EAttribute)symbolPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSymbolProperty_SubProperties() {
        return (EReference)symbolPropertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLiteralSymbolProperty() {
        return literalSymbolPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLiteralSymbolProperty_Value() {
        return (EAttribute)literalSymbolPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReferenceSymbolProperty() {
        return referenceSymbolPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getReferenceSymbolProperty_Type() {
        return (EAttribute)referenceSymbolPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getReferenceSymbolProperty_Modelname() {
        return (EAttribute)referenceSymbolPropertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getReferenceSymbolProperty_Symbolname() {
        return (EAttribute)referenceSymbolPropertyEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CrossxFactory getCrossxFactory() {
        return (CrossxFactory)getEFactoryInstance();
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
        modelInfoEClass = createEClass(MODEL_INFO);
        createEReference(modelInfoEClass, MODEL_INFO__SYMBOLS);
        createEAttribute(modelInfoEClass, MODEL_INFO__LAST_CHANGED);
        createEAttribute(modelInfoEClass, MODEL_INFO__MODELNAME);
        createEAttribute(modelInfoEClass, MODEL_INFO__RESOURCE);
        createEAttribute(modelInfoEClass, MODEL_INFO__DSLNAME);

        symbolEClass = createEClass(SYMBOL);
        createEAttribute(symbolEClass, SYMBOL__NAME);
        createEAttribute(symbolEClass, SYMBOL__TYPE);
        createEReference(symbolEClass, SYMBOL__PROPERTIES);
        createEReference(symbolEClass, SYMBOL__SUB_SYMBOLS);
        createEReference(symbolEClass, SYMBOL__OWNER);
        createEReference(symbolEClass, SYMBOL__PARENT);

        symbolPropertyEClass = createEClass(SYMBOL_PROPERTY);
        createEAttribute(symbolPropertyEClass, SYMBOL_PROPERTY__NAME);
        createEReference(symbolPropertyEClass, SYMBOL_PROPERTY__SUB_PROPERTIES);

        literalSymbolPropertyEClass = createEClass(LITERAL_SYMBOL_PROPERTY);
        createEAttribute(literalSymbolPropertyEClass, LITERAL_SYMBOL_PROPERTY__VALUE);

        referenceSymbolPropertyEClass = createEClass(REFERENCE_SYMBOL_PROPERTY);
        createEAttribute(referenceSymbolPropertyEClass, REFERENCE_SYMBOL_PROPERTY__TYPE);
        createEAttribute(referenceSymbolPropertyEClass, REFERENCE_SYMBOL_PROPERTY__MODELNAME);
        createEAttribute(referenceSymbolPropertyEClass, REFERENCE_SYMBOL_PROPERTY__SYMBOLNAME);
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
        literalSymbolPropertyEClass.getESuperTypes().add(this.getSymbolProperty());
        referenceSymbolPropertyEClass.getESuperTypes().add(this.getSymbolProperty());

        // Initialize classes and features; add operations and parameters
        initEClass(modelInfoEClass, ModelInfo.class, "ModelInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getModelInfo_Symbols(), this.getSymbol(), this.getSymbol_Owner(), "symbols", null, 0, -1, ModelInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelInfo_LastChanged(), ecorePackage.getEString(), "lastChanged", "", 0, 1, ModelInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelInfo_Modelname(), ecorePackage.getEString(), "modelname", null, 0, 1, ModelInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelInfo_Resource(), ecorePackage.getEString(), "resource", "[unknown]", 0, 1, ModelInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelInfo_Dslname(), ecorePackage.getEString(), "dslname", null, 0, 1, ModelInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(symbolEClass, Symbol.class, "Symbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSymbol_Name(), ecorePackage.getEString(), "name", null, 0, 1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSymbol_Type(), ecorePackage.getEString(), "type", null, 0, 1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSymbol_Properties(), this.getSymbolProperty(), null, "properties", null, 0, -1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSymbol_SubSymbols(), this.getSymbol(), this.getSymbol_Parent(), "subSymbols", null, 0, -1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSymbol_Owner(), this.getModelInfo(), this.getModelInfo_Symbols(), "owner", null, 0, 1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSymbol_Parent(), this.getSymbol(), this.getSymbol_SubSymbols(), "parent", null, 0, 1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(symbolPropertyEClass, SymbolProperty.class, "SymbolProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSymbolProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, SymbolProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSymbolProperty_SubProperties(), this.getSymbolProperty(), null, "subProperties", null, 0, -1, SymbolProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(literalSymbolPropertyEClass, LiteralSymbolProperty.class, "LiteralSymbolProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLiteralSymbolProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, LiteralSymbolProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(referenceSymbolPropertyEClass, ReferenceSymbolProperty.class, "ReferenceSymbolProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getReferenceSymbolProperty_Type(), ecorePackage.getEString(), "type", null, 0, 1, ReferenceSymbolProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getReferenceSymbolProperty_Modelname(), ecorePackage.getEString(), "modelname", null, 0, 1, ReferenceSymbolProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getReferenceSymbolProperty_Symbolname(), ecorePackage.getEString(), "symbolname", null, 0, 1, ReferenceSymbolProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //CrossxPackageImpl
