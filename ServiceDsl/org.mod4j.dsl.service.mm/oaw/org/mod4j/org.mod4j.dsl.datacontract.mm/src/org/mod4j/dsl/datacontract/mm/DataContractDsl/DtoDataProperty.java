/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.datacontract.mm.DataContractDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dto Data Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDataProperty#isHasDefault <em>Has Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDtoDataProperty()
 * @model
 * @generated
 */
public interface DtoDataProperty extends DtoProperty {

    /**
     * Returns the value of the '<em><b>Has Default</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Has Default</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Has Default</em>' attribute.
     * @see #setHasDefault(boolean)
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDtoDataProperty_HasDefault()
     * @model default="false"
     * @generated
     */
    boolean isHasDefault();

    /**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDataProperty#isHasDefault <em>Has Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Has Default</em>' attribute.
     * @see #isHasDefault()
     * @generated
     */
    void setHasDefault(boolean value);
} // DtoDataProperty
