package org.mod4j.runtime.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author Eric Jan Malotaux
 */
public class MinLengthValidator implements Validator {
    private String field;

    private int min;

    private Class clazz;

    /**
     * @param field
     * @param max
     */
    public MinLengthValidator(Class clazz, String field, int min) {
        this.clazz = clazz;
        this.field = field;
        this.min = min;
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
            if (length < min) {
                errors.rejectValue(field, "field.length.min", new Integer[] { new Integer(min), new Integer(length) },
                        field + " should be at least " + min + " long, but was " + length);
            }
        }
    }

}
