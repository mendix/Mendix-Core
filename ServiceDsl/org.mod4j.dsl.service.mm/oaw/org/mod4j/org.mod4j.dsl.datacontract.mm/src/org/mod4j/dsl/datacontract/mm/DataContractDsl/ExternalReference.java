/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.datacontract.mm.DataContractDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference#getModelname <em>Modelname</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference#getDatacontractModel <em>Datacontract Model</em>}</li>
 *   <li>{@link org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference#getKeyword <em>Keyword</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getExternalReference()
 * @model
 * @generated
 */
public interface ExternalReference extends ModelElement {
	/**
     * Returns the value of the '<em><b>Modelname</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Modelname</em>' attribute.
     * @see #setModelname(String)
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getExternalReference_Modelname()
     * @model default=""
     * @generated
     */
	String getModelname();

	/**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference#getModelname <em>Modelname</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Modelname</em>' attribute.
     * @see #getModelname()
     * @generated
     */
	void setModelname(String value);

	/**
     * Returns the value of the '<em><b>Datacontract Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel#getExternalReferences <em>External References</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datacontract Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Datacontract Model</em>' container reference.
     * @see #setDatacontractModel(DataContractModel)
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getExternalReference_DatacontractModel()
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel#getExternalReferences
     * @model opposite="externalReferences" transient="false"
     * @generated
     */
	DataContractModel getDatacontractModel();

	/**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference#getDatacontractModel <em>Datacontract Model</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Datacontract Model</em>' container reference.
     * @see #getDatacontractModel()
     * @generated
     */
	void setDatacontractModel(DataContractModel value);

    /**
     * Returns the value of the '<em><b>Keyword</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Keyword</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Keyword</em>' attribute.
     * @see #setKeyword(String)
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getExternalReference_Keyword()
     * @model
     * @generated
     */
    String getKeyword();

    /**
     * Sets the value of the '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference#getKeyword <em>Keyword</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Keyword</em>' attribute.
     * @see #getKeyword()
     * @generated
     */
    void setKeyword(String value);

} // ExternalReference
