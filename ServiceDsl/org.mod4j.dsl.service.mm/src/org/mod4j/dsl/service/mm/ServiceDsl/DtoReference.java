/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.service.mm.ServiceDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dto Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.DtoReference#getModelname <em>Modelname</em>}</li>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.DtoReference#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getDtoReference()
 * @model
 * @generated
 */
public interface DtoReference extends ModelElement {
    /**
     * Returns the value of the '<em><b>Modelname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modelname</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modelname</em>' attribute.
     * @see #setModelname(String)
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getDtoReference_Modelname()
     * @model
     * @generated
     */
    String getModelname();

    /**
     * Sets the value of the '{@link org.mendix.dsl.service.mm.ServiceDsl.DtoReference#getModelname <em>Modelname</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Modelname</em>' attribute.
     * @see #getModelname()
     * @generated
     */
    void setModelname(String value);

    /**
     * Returns the value of the '<em><b>Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.service.mm.ServiceDsl.ServiceModel#getDtoReferences <em>Dto References</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' container reference.
     * @see #setModel(ServiceModel)
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getDtoReference_Model()
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceModel#getDtoReferences
     * @model opposite="dtoReferences" transient="false"
     * @generated
     */
    ServiceModel getModel();

    /**
     * Sets the value of the '{@link org.mendix.dsl.service.mm.ServiceDsl.DtoReference#getModel <em>Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' container reference.
     * @see #getModel()
     * @generated
     */
    void setModel(ServiceModel value);

} // DtoReference
