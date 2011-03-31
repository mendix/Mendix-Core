/**
 * (c) Mod4j and contributors
 *
 * $Id$
 */
package org.mendix.crossx.mm.crossx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mendix.crossx.mm.crossx.ModelInfo#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link org.mendix.crossx.mm.crossx.ModelInfo#getLastChanged <em>Last Changed</em>}</li>
 *   <li>{@link org.mendix.crossx.mm.crossx.ModelInfo#getModelname <em>Modelname</em>}</li>
 *   <li>{@link org.mendix.crossx.mm.crossx.ModelInfo#getResource <em>Resource</em>}</li>
 *   <li>{@link org.mendix.crossx.mm.crossx.ModelInfo#getDslname <em>Dslname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mendix.crossx.mm.crossx.CrossxPackage#getModelInfo()
 * @model
 * @generated
 */
public interface ModelInfo extends EObject {
    /**
     * Returns the value of the '<em><b>Symbols</b></em>' containment reference list.
     * The list contents are of type {@link org.mendix.crossx.mm.crossx.Symbol}.
     * It is bidirectional and its opposite is '{@link org.mendix.crossx.mm.crossx.Symbol#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Symbols</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Symbols</em>' containment reference list.
     * @see org.mendix.crossx.mm.crossx.CrossxPackage#getModelInfo_Symbols()
     * @see org.mendix.crossx.mm.crossx.Symbol#getOwner
     * @model opposite="owner" containment="true"
     * @generated
     */
    EList<Symbol> getSymbols();

    /**
     * Returns the value of the '<em><b>Last Changed</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Changed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Changed</em>' attribute.
     * @see #setLastChanged(String)
     * @see org.mendix.crossx.mm.crossx.CrossxPackage#getModelInfo_LastChanged()
     * @model default=""
     * @generated
     */
    String getLastChanged();

    /**
     * Sets the value of the '{@link org.mendix.crossx.mm.crossx.ModelInfo#getLastChanged <em>Last Changed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Changed</em>' attribute.
     * @see #getLastChanged()
     * @generated
     */
    void setLastChanged(String value);

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
     * @see org.mendix.crossx.mm.crossx.CrossxPackage#getModelInfo_Modelname()
     * @model
     * @generated
     */
    String getModelname();

    /**
     * Sets the value of the '{@link org.mendix.crossx.mm.crossx.ModelInfo#getModelname <em>Modelname</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Modelname</em>' attribute.
     * @see #getModelname()
     * @generated
     */
    void setModelname(String value);

    /**
     * Returns the value of the '<em><b>Resource</b></em>' attribute.
     * The default value is <code>"[unknown]"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource</em>' attribute.
     * @see #setResource(String)
     * @see org.mendix.crossx.mm.crossx.CrossxPackage#getModelInfo_Resource()
     * @model default="[unknown]"
     * @generated
     */
    String getResource();

    /**
     * Sets the value of the '{@link org.mendix.crossx.mm.crossx.ModelInfo#getResource <em>Resource</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource</em>' attribute.
     * @see #getResource()
     * @generated
     */
    void setResource(String value);

    /**
     * Returns the value of the '<em><b>Dslname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dslname</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dslname</em>' attribute.
     * @see #setDslname(String)
     * @see org.mendix.crossx.mm.crossx.CrossxPackage#getModelInfo_Dslname()
     * @model
     * @generated
     */
    String getDslname();

    /**
     * Sets the value of the '{@link org.mendix.crossx.mm.crossx.ModelInfo#getDslname <em>Dslname</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dslname</em>' attribute.
     * @see #getDslname()
     * @generated
     */
    void setDslname(String value);

} // ModelInfo
