/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.datacontract.mm.DataContractDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dto String Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoStringProperty#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDtoStringProperty()
 * @model
 * @generated
 */
public interface DtoStringProperty extends DtoDataProperty {

    /**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(String)
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDtoStringProperty_DefaultValue()
     * @model
     * @generated
     */
    String getDefaultValue();

    /**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoStringProperty#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue(String value);
} // DtoStringProperty
