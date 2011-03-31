/**
 * 
 */
package org.mod4j.runtime.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author emalotau
 * 
 */
public class NotEmptyOrWhitespaceValidator implements Validator {
    private String field;

    private Class clazz;

    /**
     * @param field
     * @param clazz
     */
    public NotEmptyOrWhitespaceValidator(Class clazz, String field) {
        this.clazz = clazz;
        this.field = field;
    }

    /**
     * {@inheritDoc}
     */
    public boolean supports(Class clazz) {
        return this.clazz.isAssignableFrom(clazz);
    }

    /**
     * {@inheritDoc}
     */
    public void validate(Object target, Errors errors) {
        if (errors.getFieldValue(field) != null) {
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, field, "field.required");
        }
    }
}
