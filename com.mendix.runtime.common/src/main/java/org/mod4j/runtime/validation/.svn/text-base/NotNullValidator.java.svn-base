/**
 * 
 */
package org.mod4j.runtime.validation;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author emalotau
 * 
 */
public class NotNullValidator implements Validator {
    private String field;

    private Class clazz;

    /**
     * @param field
     * @param clazz
     */
    public NotNullValidator(Class clazz, String field) {
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
        Assert.notNull(errors, "Errors object must not be null");
        Object value = errors.getFieldValue(field);
        if (value == null || !StringUtils.hasLength(value.toString())) {
            errors.rejectValue(field, "field.required", field + " should not be null");
        }
    }
}
