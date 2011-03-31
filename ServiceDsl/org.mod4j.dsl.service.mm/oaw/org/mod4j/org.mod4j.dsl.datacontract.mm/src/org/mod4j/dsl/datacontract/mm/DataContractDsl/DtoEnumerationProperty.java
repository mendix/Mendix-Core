/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.datacontract.mm.DataContractDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dto Enumeration Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty#getType <em>Type</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty#getDefaultValueAsString <em>Default Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDtoEnumerationProperty()
 * @model
 * @generated
 */
public interface DtoEnumerationProperty extends DtoDataProperty {
	/**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(EnumerationDto)
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDtoEnumerationProperty_Type()
     * @model
     * @generated
     */
	EnumerationDto getType();

	/**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
	void setType(EnumerationDto value);

    /**
     * Returns the value of the '<em><b>Default Value As String</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value As String</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value As String</em>' attribute.
     * @see #setDefaultValueAsString(String)
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDtoEnumerationProperty_DefaultValueAsString()
     * @model
     * @generated
     */
    String getDefaultValueAsString();

    /**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty#getDefaultValueAsString <em>Default Value As String</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value As String</em>' attribute.
     * @see #getDefaultValueAsString()
     * @generated
     */
    void setDefaultValueAsString(String value);

} // DtoEnumerationProperty
