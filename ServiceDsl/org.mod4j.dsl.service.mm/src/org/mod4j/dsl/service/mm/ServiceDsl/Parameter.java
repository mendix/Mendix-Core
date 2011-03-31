/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.service.mm.ServiceDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.Parameter#getMethod <em>Method</em>}</li>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.Parameter#getCollection <em>Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends ModelElement {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(DtoReference)
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getParameter_Type()
     * @model
     * @generated
     */
    DtoReference getType();

    /**
     * Sets the value of the '{@link org.mendix.dsl.service.mm.ServiceDsl.Parameter#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(DtoReference value);

    /**
     * Returns the value of the '<em><b>Method</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.service.mm.ServiceDsl.CustomMethod#getInParameters <em>In Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Method</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Method</em>' container reference.
     * @see #setMethod(CustomMethod)
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getParameter_Method()
     * @see org.mendix.dsl.service.mm.ServiceDsl.CustomMethod#getInParameters
     * @model opposite="inParameters" transient="false"
     * @generated
     */
    CustomMethod getMethod();

    /**
     * Sets the value of the '{@link org.mendix.dsl.service.mm.ServiceDsl.Parameter#getMethod <em>Method</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Method</em>' container reference.
     * @see #getMethod()
     * @generated
     */
    void setMethod(CustomMethod value);

    /**
     * Returns the value of the '<em><b>Collection</b></em>' attribute.
     * The default value is <code>"SINGLE"</code>.
     * The literals are from the enumeration {@link org.mendix.dsl.service.mm.ServiceDsl.CollectionType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Collection</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Collection</em>' attribute.
     * @see org.mendix.dsl.service.mm.ServiceDsl.CollectionType
     * @see #setCollection(CollectionType)
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getParameter_Collection()
     * @model default="SINGLE"
     * @generated
     */
    CollectionType getCollection();

    /**
     * Sets the value of the '{@link org.mendix.dsl.service.mm.ServiceDsl.Parameter#getCollection <em>Collection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Collection</em>' attribute.
     * @see org.mendix.dsl.service.mm.ServiceDsl.CollectionType
     * @see #getCollection()
     * @generated
     */
    void setCollection(CollectionType value);

} // Parameter
