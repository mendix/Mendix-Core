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
 * A representation of the model object '<em><b>Data Contract Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel#getDtos <em>Dtos</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel#getExternalReferences <em>External References</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDataContractModel()
 * @model
 * @generated
 */
public interface DataContractModel extends ModelElement {
	/**
     * Returns the value of the '<em><b>Dtos</b></em>' containment reference list.
     * The list contents are of type {@link org.mendix.dsl.datacontract.mm.DataContractDsl.Dto}.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.Dto#getDatacontractModel <em>Datacontract Model</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dtos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Dtos</em>' containment reference list.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDataContractModel_Dtos()
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.Dto#getDatacontractModel
     * @model opposite="datacontractModel" containment="true"
     * @generated
     */
	EList<Dto> getDtos();

	/**
     * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
     * The list contents are of type {@link org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto}.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto#getDatacontractModel <em>Datacontract Model</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Enumerations</em>' containment reference list.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDataContractModel_Enumerations()
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto#getDatacontractModel
     * @model opposite="datacontractModel" containment="true"
     * @generated
     */
	EList<EnumerationDto> getEnumerations();

	/**
     * Returns the value of the '<em><b>External References</b></em>' containment reference list.
     * The list contents are of type {@link org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference}.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference#getDatacontractModel <em>Datacontract Model</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>External References</em>' containment reference list.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDataContractModel_ExternalReferences()
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference#getDatacontractModel
     * @model opposite="datacontractModel" containment="true"
     * @generated
     */
	EList<ExternalReference> getExternalReferences();

} // DataContractModel
