/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.datacontract.mm.DataContractDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Class Dto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getBase <em>Base</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getPropertyReferences <em>Property References</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getAssociationReferences <em>Association References</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#isCreatable <em>Creatable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getBusinessClassDto()
 * @model
 * @generated
 */
public interface BusinessClassDto extends Dto {
	/**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
     * The list contents are of type {@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty}.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#getBusinessClassDto <em>Business Class Dto</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference list.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getBusinessClassDto_Properties()
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#getBusinessClassDto
     * @model opposite="businessClassDto" containment="true"
     * @generated
     */
	EList<DtoProperty> getProperties();

	/**
     * Returns the value of the '<em><b>Base</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Base</em>' reference.
     * @see #setBase(ExternalReference)
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getBusinessClassDto_Base()
     * @model
     * @generated
     */
	ExternalReference getBase();

	/**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getBase <em>Base</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base</em>' reference.
     * @see #getBase()
     * @generated
     */
	void setBase(ExternalReference value);

	/**
     * Returns the value of the '<em><b>Property References</b></em>' containment reference list.
     * The list contents are of type {@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference}.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference#getDto <em>Dto</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Property References</em>' containment reference list.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getBusinessClassDto_PropertyReferences()
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference#getDto
     * @model opposite="dto" containment="true"
     * @generated
     */
	EList<BusinessClassPropertyReference> getPropertyReferences();

	/**
     * Returns the value of the '<em><b>Association References</b></em>' containment reference list.
     * The list contents are of type {@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference}.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference#getDto <em>Dto</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Association References</em>' containment reference list.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getBusinessClassDto_AssociationReferences()
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference#getDto
     * @model opposite="dto" containment="true"
     * @generated
     */
	EList<BusinessClassAssociationRoleReference> getAssociationReferences();

	/**
     * Returns the value of the '<em><b>Creatable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creatable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Creatable</em>' attribute.
     * @see #setCreatable(boolean)
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getBusinessClassDto_Creatable()
     * @model
     * @generated
     */
	boolean isCreatable();

	/**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#isCreatable <em>Creatable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Creatable</em>' attribute.
     * @see #isCreatable()
     * @generated
     */
	void setCreatable(boolean value);

} // BusinessClassDto
