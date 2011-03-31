/**
 * 
 */
package org.mod4j.runtime.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author Eric Jan Malotaux
 */
public class MaxLengthValidator implements Validator {
    private String field;

    private int max;

    private Class clazz;

    /**
     * @param field
     * @param max
     */
    public MaxLengthValidator(Class clazz, String field, int max) {
        this.clazz = clazz;
        this.field = field;
        this.max = max;
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public boolean supports(Class clazz) {
        return this.clazz.isAssignableFrom(clazz);
    }

    /**
     * {@inheritDoc}
     */
    public void validate(Object target, Errors errors) {
        String value = (String) errors.getFieldValue(field);
        if (value != null) {
            int length = value.length();
            if (length > max) {
                errors.rejectValue(field, "field.length.max", new Integer[] { new Integer(max), new Integer(length) },
                        field + " should be at most " + max + " long, but was " + length);
            }
        }
    }

}
