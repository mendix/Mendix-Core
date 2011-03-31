/**
 * (c) Mod4j and contributors
 *
 * $Id$
 */
package org.mendix.crossx.mm.crossx;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Symbol Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.crossx.mm.crossx.LiteralSymbolProperty#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.crossx.mm.crossx.CrossxPackage#getLiteralSymbolProperty()
 * @model
 * @generated
 */
public interface LiteralSymbolProperty extends SymbolProperty {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see org.mendix.crossx.mm.crossx.CrossxPackage#getLiteralSymbolProperty_Value()
     * @model
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link org.mendix.crossx.mm.crossx.LiteralSymbolProperty#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

} // LiteralSymbolProperty
