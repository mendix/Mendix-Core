/**
 * (c) Mod4j and contributors
 *
 * $Id$
 */
package org.mendix.crossx.mm.crossx;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mendix.crossx.mm.crossx.CrossxPackage
 * @generated
 */
public interface CrossxFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CrossxFactory eINSTANCE = org.mendix.crossx.mm.crossx.impl.CrossxFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Model Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Model Info</em>'.
     * @generated
     */
    ModelInfo createModelInfo();

    /**
     * Returns a new object of class '<em>Symbol</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Symbol</em>'.
     * @generated
     */
    Symbol createSymbol();

    /**
     * Returns a new object of class '<em>Symbol Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Symbol Property</em>'.
     * @generated
     */
    SymbolProperty createSymbolProperty();

    /**
     * Returns a new object of class '<em>Literal Symbol Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Literal Symbol Property</em>'.
     * @generated
     */
    LiteralSymbolProperty createLiteralSymbolProperty();

    /**
     * Returns a new object of class '<em>Reference Symbol Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reference Symbol Property</em>'.
     * @generated
     */
    ReferenceSymbolProperty createReferenceSymbolProperty();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    CrossxPackage getCrossxPackage();

} //CrossxFactory
