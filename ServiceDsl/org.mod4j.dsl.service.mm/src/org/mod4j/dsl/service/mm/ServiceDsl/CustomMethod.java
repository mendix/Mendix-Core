/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.service.mm.ServiceDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.CustomMethod#getOutParameter <em>Out Parameter</em>}</li>
 *   <li>{@link org.mendix.dsl.service.mm.ServiceDsl.CustomMethod#getInParameters <em>In Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getCustomMethod()
 * @model
 * @generated
 */
public interface CustomMethod extends ServiceMethod {
    /**
     * Returns the value of the '<em><b>Out Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Out Parameter</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Out Parameter</em>' containment reference.
     * @see #setOutParameter(Parameter)
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getCustomMethod_OutParameter()
     * @model containment="true"
     * @generated
     */
    Parameter getOutParameter();

    /**
     * Sets the value of the '{@link org.mendix.dsl.service.mm.ServiceDsl.CustomMethod#getOutParameter <em>Out Parameter</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Out Parameter</em>' containment reference.
     * @see #getOutParameter()
     * @generated
     */
    void setOutParameter(Parameter value);

    /**
     * Returns the value of the '<em><b>In Parameters</b></em>' containment reference list.
     * The list contents are of type {@link org.mendix.dsl.service.mm.ServiceDsl.Parameter}.
     * It is bidirectional and its opposite is '{@link org.mendix.dsl.service.mm.ServiceDsl.Parameter#getMethod <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>In Parameters</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>In Parameters</em>' containment reference list.
     * @see org.mendix.dsl.service.mm.ServiceDsl.ServiceDslPackage#getCustomMethod_InParameters()
     * @see org.mendix.dsl.service.mm.ServiceDsl.Parameter#getMethod
     * @model opposite="method" containment="true"
     * @generated
     */
    EList<Parameter> getInParameters();

} // CustomMethod
