/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.service.mm.ServiceDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Special Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.SpecialMethod#getDto <em>Dto</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getSpecialMethod()
 * @model
 * @generated
 */
public interface SpecialMethod extends ServiceMethod {
    /**
     * Returns the value of the '<em><b>Dto</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dto</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dto</em>' reference.
     * @see #setDto(DtoReference)
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getSpecialMethod_Dto()
     * @model
     * @generated
     */
    DtoReference getDto();

    /**
     * Sets the value of the '{@link org.mendix.dsl.service.mm.ServiceDsl.SpecialMethod#getDto <em>Dto</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dto</em>' reference.
     * @see #getDto()
     * @generated
     */
    void setDto(DtoReference value);

} // SpecialMethod
