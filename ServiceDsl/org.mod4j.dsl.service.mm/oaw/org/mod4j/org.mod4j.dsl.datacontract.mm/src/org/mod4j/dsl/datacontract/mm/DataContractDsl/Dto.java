/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.datacontract.mm.DataContractDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.Dto#getDatacontractModel <em>Datacontract Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDto()
 * @model
 * @generated
 */
public interface Dto extends ModelElement {
	/**
     * Returns the value of the '<em><b>Datacontract Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel#getDtos <em>Dtos</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datacontract Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Datacontract Model</em>' container reference.
     * @see #setDatacontractModel(DataContractModel)
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDto_DatacontractModel()
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel#getDtos
     * @model opposite="dtos" transient="false"
     * @generated
     */
	DataContractModel getDatacontractModel();

	/**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.Dto#getDatacontractModel <em>Datacontract Model</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Datacontract Model</em>' container reference.
     * @see #getDatacontractModel()
     * @generated
     */
	void setDatacontractModel(DataContractModel value);

} // Dto
