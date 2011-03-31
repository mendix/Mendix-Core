package org.mod4j.runtime.validation;

import java.util.List;

import org.mod4j.runtime.exception.BusinessRuleException;
import org.springframework.util.ClassUtils;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Template class that simplifies business rule validation. The central method is {@link #execute}, supporting
 * validations implementing the {@link BusinessRuleValidationCallback} interface. It provides for the creation of an
 * {@link Errors} object for storing all errors found while validating fields of a particular object in the
 * {@link BusinessRuleValidationCallback#doValidate(Object, Errors)} method. After all validations are executed and the
 * results collected in the {@link Errors} object and if one or more errors are found, a {@link BusinessRuleException}
 * is thrown that wraps the the {@link BindException} object that implements the {@link Errors} object is thrown as an
 * exception.
 * 
 * @author Eric Jan Malotaux
 */
public class BusinessRuleValidationTemplate {
    private Object object;

    /**
     * Creates a new BusinessRuleValidationTemplate instance. Field validations are performed on named fields of the
     * given <code>object</code>.
     * 
     * @param object
     */
    public BusinessRuleValidationTemplate(Object object) {
        this.object = object;
    }

    /**
     * Invoke the given <code>validator</code> on the current object.
     * 
     * @param validator
     * @throws BusinessRuleException
     *             when the validator finds an error.
     */
    public void invokeValidator(final Validator validator) {
        execute(new BusinessRuleValidationCallback() {
            public void doValidate(Object object, Errors errors) {
                ValidationUtils.invokeValidator(validator, object, errors);
            }
        });
    }

    /**
     * Invoke the given <code>validators</code> on the current object.
     * 
     * @param validators -
     *            the validators to invoke.
     * @throws BusinessRuleException -
     *             thrown when one of the validators finds an error.
     */
    public void invokeValidators(final List<Validator> validators) {
        execute(new BusinessRuleValidationCallback() {
            public void doValidate(Object object, Errors errors) {
                for (Validator validator : validators) {
                    ValidationUtils.invokeValidator(validator, object, errors);
                }
            }
        });
    }

    /**
     * Execute the {@link BusinessRuleValidationCallback#doValidate(Object, Errors)} method of the given
     * <code>action</code> on the current object.
     * 
     * @param action -
     *            the {@link BusinessRuleValidationCallback} to invoke its
     *            {@link BusinessRuleValidationCallback#doValidate(Object, Errors)} method on.
     * @throws BusinessRuleException -
     *             thrown when the {@link BusinessRuleValidationCallback#doValidate(Object, Errors)} method added one
     *             ore more errors to its <code>errors</code> object.
     */
    public void execute(BusinessRuleValidationCallback action) {
        BindException errors = new BindException(object, ClassUtils.getShortNameAsProperty(object.getClass()));
        action.doValidate(object, errors);
        if (errors.hasErrors()) {
            throw new BusinessRuleException(errors);
        }
    }
}
