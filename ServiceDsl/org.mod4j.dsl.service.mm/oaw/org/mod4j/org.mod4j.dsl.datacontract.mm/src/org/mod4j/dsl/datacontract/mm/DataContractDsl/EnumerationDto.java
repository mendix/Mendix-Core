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
 * A representation of the model object '<em><b>Enumeration Dto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto#getLiterals <em>Literals</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto#getBase <em>Base</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto#getDatacontractModel <em>Datacontract Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getEnumerationDto()
 * @model
 * @generated
 */
public interface EnumerationDto extends ModelElement {
	/**
     * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
     * The list contents are of type {@link org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDtoLiteral}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Literals</em>' containment reference list.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getEnumerationDto_Literals()
     * @model containment="true"
     * @generated
     */
	EList<EnumerationDtoLiteral> getLiterals();

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
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getEnumerationDto_Base()
     * @model
     * @generated
     */
	ExternalReference getBase();

	/**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto#getBase <em>Base</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base</em>' reference.
     * @see #getBase()
     * @generated
     */
	void setBase(ExternalReference value);

	/**
     * Returns the value of the '<em><b>Datacontract Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel#getEnumerations <em>Enumerations</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datacontract Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Datacontract Model</em>' container reference.
     * @see #setDatacontractModel(DataContractModel)
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getEnumerationDto_DatacontractModel()
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel#getEnumerations
     * @model opposite="enumerations" transient="false"
     * @generated
     */
	DataContractModel getDatacontractModel();

	/**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto#getDatacontractModel <em>Datacontract Model</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Datacontract Model</em>' container reference.
     * @see #getDatacontractModel()
     * @generated
     */
	void setDatacontractModel(DataContractModel value);

} // EnumerationDto
