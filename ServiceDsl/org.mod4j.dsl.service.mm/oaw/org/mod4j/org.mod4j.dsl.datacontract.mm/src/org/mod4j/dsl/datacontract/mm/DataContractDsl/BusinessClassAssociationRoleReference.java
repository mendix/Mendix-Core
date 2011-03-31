/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.datacontract.mm.DataContractDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Class Association Role Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference#getDto <em>Dto</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference#getDtoType <em>Dto Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getBusinessClassAssociationRoleReference()
 * @model
 * @generated
 */
public interface BusinessClassAssociationRoleReference extends ModelElement {
	/**
     * Returns the value of the '<em><b>Dto</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getAssociationReferences <em>Association References</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dto</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Dto</em>' container reference.
     * @see #setDto(BusinessClassDto)
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getBusinessClassAssociationRoleReference_Dto()
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getAssociationReferences
     * @model opposite="associationReferences" transient="false"
     * @generated
     */
	BusinessClassDto getDto();

	/**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference#getDto <em>Dto</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dto</em>' container reference.
     * @see #getDto()
     * @generated
     */
	void setDto(BusinessClassDto value);

	/**
     * Returns the value of the '<em><b>Dto Type</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dto Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Dto Type</em>' reference.
     * @see #setDtoType(Dto)
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getBusinessClassAssociationRoleReference_DtoType()
     * @model
     * @generated
     */
	Dto getDtoType();

	/**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference#getDtoType <em>Dto Type</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dto Type</em>' reference.
     * @see #getDtoType()
     * @generated
     */
	void setDtoType(Dto value);

} // BusinessClassAssociationRoleReference
