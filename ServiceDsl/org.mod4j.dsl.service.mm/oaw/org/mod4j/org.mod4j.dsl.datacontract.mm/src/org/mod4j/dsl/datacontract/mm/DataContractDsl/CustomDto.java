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
 * A representation of the model object '<em><b>Custom Dto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.CustomDto#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getCustomDto()
 * @model
 * @generated
 */
public interface CustomDto extends Dto {
	/**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
     * The list contents are of type {@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty}.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#getCustomDto <em>Custom Dto</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference list.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getCustomDto_Properties()
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty#getCustomDto
     * @model opposite="customDto" containment="true"
     * @generated
     */
	EList<DtoProperty> getProperties();

} // CustomDto
