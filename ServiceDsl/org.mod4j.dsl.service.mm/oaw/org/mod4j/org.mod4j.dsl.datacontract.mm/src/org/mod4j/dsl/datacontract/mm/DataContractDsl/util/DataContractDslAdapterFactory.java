/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mendix.dsl.datacontract.mm.DataContractDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.mendix.dsl.datacontract.mm.DataContractDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage
 * @generated
 */
public class DataContractDslAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static DataContractDslPackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DataContractDslAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = DataContractDslPackage.eINSTANCE;
        }
    }

	/**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
	@Override
	public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

	/**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected DataContractDslSwitch<Adapter> modelSwitch =
		new DataContractDslSwitch<Adapter>() {
            @Override
            public Adapter caseDataContractModel(DataContractModel object) {
                return createDataContractModelAdapter();
            }
            @Override
            public Adapter caseDto(Dto object) {
                return createDtoAdapter();
            }
            @Override
            public Adapter caseBusinessClassDto(BusinessClassDto object) {
                return createBusinessClassDtoAdapter();
            }
            @Override
            public Adapter caseDtoProperty(DtoProperty object) {
                return createDtoPropertyAdapter();
            }
            @Override
            public Adapter caseDtoDataProperty(DtoDataProperty object) {
                return createDtoDataPropertyAdapter();
            }
            @Override
            public Adapter caseDtoStringProperty(DtoStringProperty object) {
                return createDtoStringPropertyAdapter();
            }
            @Override
            public Adapter caseDtoBooleanProperty(DtoBooleanProperty object) {
                return createDtoBooleanPropertyAdapter();
            }
            @Override
            public Adapter caseEnumerationDto(EnumerationDto object) {
                return createEnumerationDtoAdapter();
            }
            @Override
            public Adapter caseEnumerationDtoLiteral(EnumerationDtoLiteral object) {
                return createEnumerationDtoLiteralAdapter();
            }
            @Override
            public Adapter caseModelElement(ModelElement object) {
                return createModelElementAdapter();
            }
            @Override
            public Adapter caseCustomDto(CustomDto object) {
                return createCustomDtoAdapter();
            }
            @Override
            public Adapter caseDtoIntegerProperty(DtoIntegerProperty object) {
                return createDtoIntegerPropertyAdapter();
            }
            @Override
            public Adapter caseDtoDecimalProperty(DtoDecimalProperty object) {
                return createDtoDecimalPropertyAdapter();
            }
            @Override
            public Adapter caseDtoEnumerationProperty(DtoEnumerationProperty object) {
                return createDtoEnumerationPropertyAdapter();
            }
            @Override
            public Adapter caseDtoDateTimeProperty(DtoDateTimeProperty object) {
                return createDtoDateTimePropertyAdapter();
            }
            @Override
            public Adapter caseBusinessClassPropertyReference(BusinessClassPropertyReference object) {
                return createBusinessClassPropertyReferenceAdapter();
            }
            @Override
            public Adapter caseBusinessClassAssociationRoleReference(BusinessClassAssociationRoleReference object) {
                return createBusinessClassAssociationRoleReferenceAdapter();
            }
            @Override
            public Adapter caseDtoAssociationRoleProperty(DtoAssociationRoleProperty object) {
                return createDtoAssociationRolePropertyAdapter();
            }
            @Override
            public Adapter caseExternalReference(ExternalReference object) {
                return createExternalReferenceAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

	/**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
	@Override
	public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


	/**
     * Creates a new adapter for an object of class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel <em>Data Contract Model</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DataContractModel
     * @generated
     */
	public Adapter createDataContractModelAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.Dto <em>Dto</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.Dto
     * @generated
     */
	public Adapter createDtoAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto <em>Business Class Dto</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassDto
     * @generated
     */
	public Adapter createBusinessClassDtoAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty <em>Dto Property</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoProperty
     * @generated
     */
	public Adapter createDtoPropertyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDataProperty <em>Dto Data Property</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDataProperty
     * @generated
     */
	public Adapter createDtoDataPropertyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoStringProperty <em>Dto String Property</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoStringProperty
     * @generated
     */
	public Adapter createDtoStringPropertyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoBooleanProperty <em>Dto Boolean Property</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoBooleanProperty
     * @generated
     */
	public Adapter createDtoBooleanPropertyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto <em>Enumeration Dto</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDto
     * @generated
     */
	public Adapter createEnumerationDtoAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDtoLiteral <em>Enumeration Dto Literal</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.EnumerationDtoLiteral
     * @generated
     */
	public Adapter createEnumerationDtoLiteralAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.ModelElement <em>Model Element</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.ModelElement
     * @generated
     */
	public Adapter createModelElementAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.CustomDto <em>Custom Dto</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.CustomDto
     * @generated
     */
	public Adapter createCustomDtoAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoIntegerProperty <em>Dto Integer Property</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoIntegerProperty
     * @generated
     */
	public Adapter createDtoIntegerPropertyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDecimalProperty <em>Dto Decimal Property</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDecimalProperty
     * @generated
     */
	public Adapter createDtoDecimalPropertyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty <em>Dto Enumeration Property</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty
     * @generated
     */
	public Adapter createDtoEnumerationPropertyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDateTimeProperty <em>Dto Date Time Property</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoDateTimeProperty
     * @generated
     */
	public Adapter createDtoDateTimePropertyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference <em>Business Class Property Reference</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference
     * @generated
     */
	public Adapter createBusinessClassPropertyReferenceAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference <em>Business Class Association Role Reference</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.BusinessClassAssociationRoleReference
     * @generated
     */
	public Adapter createBusinessClassAssociationRoleReferenceAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.DtoAssociationRoleProperty <em>Dto Association Role Property</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.DtoAssociationRoleProperty
     * @generated
     */
	public Adapter createDtoAssociationRolePropertyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference <em>External Reference</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mendix.dsl.datacontract.mm.DataContractDsl.ExternalReference
     * @generated
     */
	public Adapter createExternalReferenceAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
	public Adapter createEObjectAdapter() {
        return null;
    }

} //DataContractDslAdapterFactory
