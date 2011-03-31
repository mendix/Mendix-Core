/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.service.mm.ServiceDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.AssociationMethod#getMain <em>Main</em>}</li>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.AssociationMethod#getPart <em>Part</em>}</li>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.AssociationMethod#getRolename <em>Rolename</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getAssociationMethod()
 * @model
 * @generated
 */
public interface AssociationMethod extends ServiceMethod {
    /**
     * Returns the value of the '<em><b>Main</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Main</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Main</em>' reference.
     * @see #setMain(DtoReference)
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getAssociationMethod_Main()
     * @model
     * @generated
     */
    DtoReference getMain();

    /**
     * Sets the value of the '{@link org.mendix.dsl.service.mm.ServiceDsl.AssociationMethod#getMain <em>Main</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Main</em>' reference.
     * @see #getMain()
     * @generated
     */
    void setMain(DtoReference value);

    /**
     * Returns the value of the '<em><b>Part</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Part</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Part</em>' reference.
     * @see #setPart(DtoReference)
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getAssociationMethod_Part()
     * @model
     * @generated
     */
    DtoReference getPart();

    /**
     * Sets the value of the '{@link org.mendix.dsl.service.mm.ServiceDsl.AssociationMethod#getPart <em>Part</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Part</em>' reference.
     * @see #getPart()
     * @generated
     */
    void setPart(DtoReference value);

    /**
     * Returns the value of the '<em><b>Rolename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rolename</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rolename</em>' attribute.
     * @see #setRolename(String)
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getAssociationMethod_Rolename()
     * @model
     * @generated
     */
    String getRolename();

    /**
     * Sets the value of the '{@link org.mendix.dsl.service.mm.ServiceDsl.AssociationMethod#getRolename <em>Rolename</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rolename</em>' attribute.
     * @see #getRolename()
     * @generated
     */
    void setRolename(String value);

} // AssociationMethod
