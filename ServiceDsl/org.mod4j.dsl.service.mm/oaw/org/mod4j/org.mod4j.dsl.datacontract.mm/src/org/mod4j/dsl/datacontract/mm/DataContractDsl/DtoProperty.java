/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.datacontract.mm.DataContractDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dto Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#getBusinessClassDto <em>Business Class Dto</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#getCustomDto <em>Custom Dto</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#isMandatoryForCreation <em>Mandatory For Creation</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#isWritable <em>Writable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDtoProperty()
 * @model
 * @generated
 */
public interface DtoProperty extends ModelElement {
	/**
     * Returns the value of the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Data Type</em>' attribute.
     * @see #setDataType(String)
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDtoProperty_DataType()
     * @model
     * @generated
     */
	String getDataType();

	/**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#getDataType <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Type</em>' attribute.
     * @see #getDataType()
     * @generated
     */
	void setDataType(String value);

	/**
     * Returns the value of the '<em><b>Business Class Dto</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Class Dto</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Business Class Dto</em>' container reference.
     * @see #setBusinessClassDto(BusinessClassDto)
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDtoProperty_BusinessClassDto()
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getProperties
     * @model opposite="properties" transient="false"
     * @generated
     */
	BusinessClassDto getBusinessClassDto();

	/**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#getBusinessClassDto <em>Business Class Dto</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Business Class Dto</em>' container reference.
     * @see #getBusinessClassDto()
     * @generated
     */
	void setBusinessClassDto(BusinessClassDto value);

	/**
     * Returns the value of the '<em><b>Custom Dto</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.CustomDto#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Dto</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Custom Dto</em>' container reference.
     * @see #setCustomDto(CustomDto)
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDtoProperty_CustomDto()
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.CustomDto#getProperties
     * @model opposite="properties" transient="false"
     * @generated
     */
	CustomDto getCustomDto();

	/**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#getCustomDto <em>Custom Dto</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Custom Dto</em>' container reference.
     * @see #getCustomDto()
     * @generated
     */
	void setCustomDto(CustomDto value);

	/**
     * Returns the value of the '<em><b>Mandatory For Creation</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory For Creation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Mandatory For Creation</em>' attribute.
     * @see #setMandatoryForCreation(boolean)
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDtoProperty_MandatoryForCreation()
     * @model default="false"
     * @generated
     */
	boolean isMandatoryForCreation();

	/**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#isMandatoryForCreation <em>Mandatory For Creation</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mandatory For Creation</em>' attribute.
     * @see #isMandatoryForCreation()
     * @generated
     */
	void setMandatoryForCreation(boolean value);

	/**
     * Returns the value of the '<em><b>Nullable</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nullable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Nullable</em>' attribute.
     * @see #setNullable(boolean)
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDtoProperty_Nullable()
     * @model default="true"
     * @generated
     */
	boolean isNullable();

	/**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#isNullable <em>Nullable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nullable</em>' attribute.
     * @see #isNullable()
     * @generated
     */
	void setNullable(boolean value);

	/**
     * Returns the value of the '<em><b>Writable</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Writable</em>' attribute.
     * @see #setWritable(boolean)
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDtoProperty_Writable()
     * @model default="true"
     * @generated
     */
	boolean isWritable();

	/**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#isWritable <em>Writable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Writable</em>' attribute.
     * @see #isWritable()
     * @generated
     */
	void setWritable(boolean value);

} // DtoProperty
