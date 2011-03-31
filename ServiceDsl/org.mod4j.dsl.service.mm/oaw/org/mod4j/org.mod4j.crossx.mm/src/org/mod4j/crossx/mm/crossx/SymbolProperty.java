/**
 * (c) Mod4j and contributors
 *
 * $Id$
 */
package org.mendix.crossx.mm.crossx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.crossx.mm.crossx.SymbolProperty#getName <em>Name</em>}</li>
 *   <li>{@link org.mendix.crossx.mm.crossx.SymbolProperty#getSubProperties <em>Sub Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.crossx.mm.crossx.CrossxPackage#getSymbolProperty()
 * @model
 * @generated
 */
public interface SymbolProperty extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.mendix.crossx.mm.crossx.CrossxPackage#getSymbolProperty_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.mendix.crossx.mm.crossx.SymbolProperty#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Sub Properties</b></em>' containment reference list.
     * The list contents are of type {@link org.mendix.crossx.mm.crossx.SymbolProperty}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Properties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Properties</em>' containment reference list.
     * @see org.mendix.crossx.mm.crossx.CrossxPackage#getSymbolProperty_SubProperties()
     * @model containment="true"
     * @generated
     */
    EList<SymbolProperty> getSubProperties();

} // SymbolProperty
