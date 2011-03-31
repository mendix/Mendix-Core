/**
 * (c) Mod4j and contributors
 *
 * $Id$
 */
package org.mendix.crossx.mm.crossx;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.mendix.crossx.mm.crossx.CrossxFactory
 * @model kind="package"
 * @generated
 */
public interface CrossxPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "crossx";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.mendix.org/mendix.crossx";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "crossx";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CrossxPackage eINSTANCE = org.mendix.crossx.mm.crossx.impl.CrossxPackageImpl.init();

    /**
     * The meta object id for the '{@link org.mendix.crossx.mm.crossx.impl.ModelInfoImpl <em>Model Info</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mendix.crossx.mm.crossx.impl.ModelInfoImpl
     * @see org.mendix.crossx.mm.crossx.impl.CrossxPackageImpl#getModelInfo()
     * @generated
     */
    int MODEL_INFO = 0;

    /**
     * The feature id for the '<em><b>Symbols</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_INFO__SYMBOLS = 0;

    /**
     * The feature id for the '<em><b>Last Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_INFO__LAST_CHANGED = 1;

    /**
     * The feature id for the '<em><b>Modelname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_INFO__MODELNAME = 2;

    /**
     * The feature id for the '<em><b>Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_INFO__RESOURCE = 3;

    /**
     * The feature id for the '<em><b>Dslname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_INFO__DSLNAME = 4;

    /**
     * The number of structural features of the '<em>Model Info</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_INFO_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.mendix.crossx.mm.crossx.impl.SymbolImpl <em>Symbol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mendix.crossx.mm.crossx.impl.SymbolImpl
     * @see org.mendix.crossx.mm.crossx.impl.CrossxPackageImpl#getSymbol()
     * @generated
     */
    int SYMBOL = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYMBOL__NAME = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYMBOL__TYPE = 1;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYMBOL__PROPERTIES = 2;

    /**
     * The feature id for the '<em><b>Sub Symbols</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYMBOL__SUB_SYMBOLS = 3;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYMBOL__OWNER = 4;

    /**
     * The feature id for the '<em><b>Parent</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYMBOL__PARENT = 5;

    /**
     * The number of structural features of the '<em>Symbol</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYMBOL_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.mendix.crossx.mm.crossx.impl.SymbolPropertyImpl <em>Symbol Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mendix.crossx.mm.crossx.impl.SymbolPropertyImpl
     * @see org.mendix.crossx.mm.crossx.impl.CrossxPackageImpl#getSymbolProperty()
     * @generated
     */
    int SYMBOL_PROPERTY = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYMBOL_PROPERTY__NAME = 0;

    /**
     * The feature id for the '<em><b>Sub Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYMBOL_PROPERTY__SUB_PROPERTIES = 1;

    /**
     * The number of structural features of the '<em>Symbol Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYMBOL_PROPERTY_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.mendix.crossx.mm.crossx.impl.LiteralSymbolPropertyImpl <em>Literal Symbol Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mendix.crossx.mm.crossx.impl.LiteralSymbolPropertyImpl
     * @see org.mendix.crossx.mm.crossx.impl.CrossxPackageImpl#getLiteralSymbolProperty()
     * @generated
     */
    int LITERAL_SYMBOL_PROPERTY = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_SYMBOL_PROPERTY__NAME = SYMBOL_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Sub Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_SYMBOL_PROPERTY__SUB_PROPERTIES = SYMBOL_PROPERTY__SUB_PROPERTIES;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_SYMBOL_PROPERTY__VALUE = SYMBOL_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Literal Symbol Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_SYMBOL_PROPERTY_FEATURE_COUNT = SYMBOL_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.mendix.crossx.mm.crossx.impl.ReferenceSymbolPropertyImpl <em>Reference Symbol Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mendix.crossx.mm.crossx.impl.ReferenceSymbolPropertyImpl
     * @see org.mendix.crossx.mm.crossx.impl.CrossxPackageImpl#getReferenceSymbolProperty()
     * @generated
     */
    int REFERENCE_SYMBOL_PROPERTY = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_SYMBOL_PROPERTY__NAME = SYMBOL_PROPERTY__NAME;

    /**
     * The feature id for the '<em><b>Sub Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_SYMBOL_PROPERTY__SUB_PROPERTIES = SYMBOL_PROPERTY__SUB_PROPERTIES;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_SYMBOL_PROPERTY__TYPE = SYMBOL_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Modelname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_SYMBOL_PROPERTY__MODELNAME = SYMBOL_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Symbolname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_SYMBOL_PROPERTY__SYMBOLNAME = SYMBOL_PROPERTY_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Reference Symbol Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_SYMBOL_PROPERTY_FEATURE_COUNT = SYMBOL_PROPERTY_FEATURE_COUNT + 3;


    /**
     * Returns the meta object for class '{@link org.mendix.crossx.mm.crossx.ModelInfo <em>Model Info</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model Info</em>'.
     * @see org.mendix.crossx.mm.crossx.ModelInfo
     * @generated
     */
    EClass getModelInfo();

    /**
     * Returns the meta object for the containment reference list '{@link org.mendix.crossx.mm.crossx.ModelInfo#getSymbols <em>Symbols</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Symbols</em>'.
     * @see org.mendix.crossx.mm.crossx.ModelInfo#getSymbols()
     * @see #getModelInfo()
     * @generated
     */
    EReference getModelInfo_Symbols();

    /**
     * Returns the meta object for the attribute '{@link org.mendix.crossx.mm.crossx.ModelInfo#getLastChanged <em>Last Changed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Last Changed</em>'.
     * @see org.mendix.crossx.mm.crossx.ModelInfo#getLastChanged()
     * @see #getModelInfo()
     * @generated
     */
    EAttribute getModelInfo_LastChanged();

    /**
     * Returns the meta object for the attribute '{@link org.mendix.crossx.mm.crossx.ModelInfo#getModelname <em>Modelname</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Modelname</em>'.
     * @see org.mendix.crossx.mm.crossx.ModelInfo#getModelname()
     * @see #getModelInfo()
     * @generated
     */
    EAttribute getModelInfo_Modelname();

    /**
     * Returns the meta object for the attribute '{@link org.mendix.crossx.mm.crossx.ModelInfo#getResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resource</em>'.
     * @see org.mendix.crossx.mm.crossx.ModelInfo#getResource()
     * @see #getModelInfo()
     * @generated
     */
    EAttribute getModelInfo_Resource();

    /**
     * Returns the meta object for the attribute '{@link org.mendix.crossx.mm.crossx.ModelInfo#getDslname <em>Dslname</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dslname</em>'.
     * @see org.mendix.crossx.mm.crossx.ModelInfo#getDslname()
     * @see #getModelInfo()
     * @generated
     */
    EAttribute getModelInfo_Dslname();

    /**
     * Returns the meta object for class '{@link org.mendix.crossx.mm.crossx.Symbol <em>Symbol</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Symbol</em>'.
     * @see org.mendix.crossx.mm.crossx.Symbol
     * @generated
     */
    EClass getSymbol();

    /**
     * Returns the meta object for the attribute '{@link org.mendix.crossx.mm.crossx.Symbol#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.mendix.crossx.mm.crossx.Symbol#getName()
     * @see #getSymbol()
     * @generated
     */
    EAttribute getSymbol_Name();

    /**
     * Returns the meta object for the attribute '{@link org.mendix.crossx.mm.crossx.Symbol#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.mendix.crossx.mm.crossx.Symbol#getType()
     * @see #getSymbol()
     * @generated
     */
    EAttribute getSymbol_Type();

    /**
     * Returns the meta object for the containment reference list '{@link org.mendix.crossx.mm.crossx.Symbol#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see org.mendix.crossx.mm.crossx.Symbol#getProperties()
     * @see #getSymbol()
     * @generated
     */
    EReference getSymbol_Properties();

    /**
     * Returns the meta object for the containment reference list '{@link org.mendix.crossx.mm.crossx.Symbol#getSubSymbols <em>Sub Symbols</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Symbols</em>'.
     * @see org.mendix.crossx.mm.crossx.Symbol#getSubSymbols()
     * @see #getSymbol()
     * @generated
     */
    EReference getSymbol_SubSymbols();

    /**
     * Returns the meta object for the container reference '{@link org.mendix.crossx.mm.crossx.Symbol#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Owner</em>'.
     * @see org.mendix.crossx.mm.crossx.Symbol#getOwner()
     * @see #getSymbol()
     * @generated
     */
    EReference getSymbol_Owner();

    /**
     * Returns the meta object for the container reference '{@link org.mendix.crossx.mm.crossx.Symbol#getParent <em>Parent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent</em>'.
     * @see org.mendix.crossx.mm.crossx.Symbol#getParent()
     * @see #getSymbol()
     * @generated
     */
    EReference getSymbol_Parent();

    /**
     * Returns the meta object for class '{@link org.mendix.crossx.mm.crossx.SymbolProperty <em>Symbol Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Symbol Property</em>'.
     * @see org.mendix.crossx.mm.crossx.SymbolProperty
     * @generated
     */
    EClass getSymbolProperty();

    /**
     * Returns the meta object for the attribute '{@link org.mendix.crossx.mm.crossx.SymbolProperty#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.mendix.crossx.mm.crossx.SymbolProperty#getName()
     * @see #getSymbolProperty()
     * @generated
     */
    EAttribute getSymbolProperty_Name();

    /**
     * Returns the meta object for the containment reference list '{@link org.mendix.crossx.mm.crossx.SymbolProperty#getSubProperties <em>Sub Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Properties</em>'.
     * @see org.mendix.crossx.mm.crossx.SymbolProperty#getSubProperties()
     * @see #getSymbolProperty()
     * @generated
     */
    EReference getSymbolProperty_SubProperties();

    /**
     * Returns the meta object for class '{@link org.mendix.crossx.mm.crossx.LiteralSymbolProperty <em>Literal Symbol Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Literal Symbol Property</em>'.
     * @see org.mendix.crossx.mm.crossx.LiteralSymbolProperty
     * @generated
     */
    EClass getLiteralSymbolProperty();

    /**
     * Returns the meta object for the attribute '{@link org.mendix.crossx.mm.crossx.LiteralSymbolProperty#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.mendix.crossx.mm.crossx.LiteralSymbolProperty#getValue()
     * @see #getLiteralSymbolProperty()
     * @generated
     */
    EAttribute getLiteralSymbolProperty_Value();

    /**
     * Returns the meta object for class '{@link org.mendix.crossx.mm.crossx.ReferenceSymbolProperty <em>Reference Symbol Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference Symbol Property</em>'.
     * @see org.mendix.crossx.mm.crossx.ReferenceSymbolProperty
     * @generated
     */
    EClass getReferenceSymbolProperty();

    /**
     * Returns the meta object for the attribute '{@link org.mendix.crossx.mm.crossx.ReferenceSymbolProperty#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.mendix.crossx.mm.crossx.ReferenceSymbolProperty#getType()
     * @see #getReferenceSymbolProperty()
     * @generated
     */
    EAttribute getReferenceSymbolProperty_Type();

    /**
     * Returns the meta object for the attribute '{@link org.mendix.crossx.mm.crossx.ReferenceSymbolProperty#getModelname <em>Modelname</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Modelname</em>'.
     * @see org.mendix.crossx.mm.crossx.ReferenceSymbolProperty#getModelname()
     * @see #getReferenceSymbolProperty()
     * @generated
     */
    EAttribute getReferenceSymbolProperty_Modelname();

    /**
     * Returns the meta object for the attribute '{@link org.mendix.crossx.mm.crossx.ReferenceSymbolProperty#getSymbolname <em>Symbolname</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Symbolname</em>'.
     * @see org.mendix.crossx.mm.crossx.ReferenceSymbolProperty#getSymbolname()
     * @see #getReferenceSymbolProperty()
     * @generated
     */
    EAttribute getReferenceSymbolProperty_Symbolname();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CrossxFactory getCrossxFactory();

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
         * The meta object literal for the '{@link org.mendix.crossx.mm.crossx.impl.ModelInfoImpl <em>Model Info</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mendix.crossx.mm.crossx.impl.ModelInfoImpl
         * @see org.mendix.crossx.mm.crossx.impl.CrossxPackageImpl#getModelInfo()
         * @generated
         */
        EClass MODEL_INFO = eINSTANCE.getModelInfo();

        /**
         * The meta object literal for the '<em><b>Symbols</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_INFO__SYMBOLS = eINSTANCE.getModelInfo_Symbols();

        /**
         * The meta object literal for the '<em><b>Last Changed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_INFO__LAST_CHANGED = eINSTANCE.getModelInfo_LastChanged();

        /**
         * The meta object literal for the '<em><b>Modelname</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_INFO__MODELNAME = eINSTANCE.getModelInfo_Modelname();

        /**
         * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_INFO__RESOURCE = eINSTANCE.getModelInfo_Resource();

        /**
         * The meta object literal for the '<em><b>Dslname</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_INFO__DSLNAME = eINSTANCE.getModelInfo_Dslname();

        /**
         * The meta object literal for the '{@link org.mendix.crossx.mm.crossx.impl.SymbolImpl <em>Symbol</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mendix.crossx.mm.crossx.impl.SymbolImpl
         * @see org.mendix.crossx.mm.crossx.impl.CrossxPackageImpl#getSymbol()
         * @generated
         */
        EClass SYMBOL = eINSTANCE.getSymbol();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SYMBOL__NAME = eINSTANCE.getSymbol_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SYMBOL__TYPE = eINSTANCE.getSymbol_Type();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYMBOL__PROPERTIES = eINSTANCE.getSymbol_Properties();

        /**
         * The meta object literal for the '<em><b>Sub Symbols</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYMBOL__SUB_SYMBOLS = eINSTANCE.getSymbol_SubSymbols();

        /**
         * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYMBOL__OWNER = eINSTANCE.getSymbol_Owner();

        /**
         * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYMBOL__PARENT = eINSTANCE.getSymbol_Parent();

        /**
         * The meta object literal for the '{@link org.mendix.crossx.mm.crossx.impl.SymbolPropertyImpl <em>Symbol Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mendix.crossx.mm.crossx.impl.SymbolPropertyImpl
         * @see org.mendix.crossx.mm.crossx.impl.CrossxPackageImpl#getSymbolProperty()
         * @generated
         */
        EClass SYMBOL_PROPERTY = eINSTANCE.getSymbolProperty();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SYMBOL_PROPERTY__NAME = eINSTANCE.getSymbolProperty_Name();

        /**
         * The meta object literal for the '<em><b>Sub Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYMBOL_PROPERTY__SUB_PROPERTIES = eINSTANCE.getSymbolProperty_SubProperties();

        /**
         * The meta object literal for the '{@link org.mendix.crossx.mm.crossx.impl.LiteralSymbolPropertyImpl <em>Literal Symbol Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mendix.crossx.mm.crossx.impl.LiteralSymbolPropertyImpl
         * @see org.mendix.crossx.mm.crossx.impl.CrossxPackageImpl#getLiteralSymbolProperty()
         * @generated
         */
        EClass LITERAL_SYMBOL_PROPERTY = eINSTANCE.getLiteralSymbolProperty();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LITERAL_SYMBOL_PROPERTY__VALUE = eINSTANCE.getLiteralSymbolProperty_Value();

        /**
         * The meta object literal for the '{@link org.mendix.crossx.mm.crossx.impl.ReferenceSymbolPropertyImpl <em>Reference Symbol Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mendix.crossx.mm.crossx.impl.ReferenceSymbolPropertyImpl
         * @see org.mendix.crossx.mm.crossx.impl.CrossxPackageImpl#getReferenceSymbolProperty()
         * @generated
         */
        EClass REFERENCE_SYMBOL_PROPERTY = eINSTANCE.getReferenceSymbolProperty();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REFERENCE_SYMBOL_PROPERTY__TYPE = eINSTANCE.getReferenceSymbolProperty_Type();

        /**
         * The meta object literal for the '<em><b>Modelname</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REFERENCE_SYMBOL_PROPERTY__MODELNAME = eINSTANCE.getReferenceSymbolProperty_Modelname();

        /**
         * The meta object literal for the '<em><b>Symbolname</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REFERENCE_SYMBOL_PROPERTY__SYMBOLNAME = eINSTANCE.getReferenceSymbolProperty_Symbolname();

    }

} //CrossxPackage
