package org.mod4j.runtime.validation;

import org.springframework.util.Assert;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author Eric Jan Malotaux
 * 
 */
public class MaxValueValidator implements Validator {

    private String field;

    private long max;

    private Class clazz;

    /**
     * @param field
     * @param max
     */
    public MaxValueValidator(Class clazz, String field, long max) {
        this.clazz = clazz;
        this.field = field;
        this.max = max;
    }

    @SuppressWarnings("unchecked")
    public boolean supports(Class clazz) {
        return this.clazz.isAssignableFrom(clazz);
    }

    public void validate(Object target, Errors errors) {

        Long value = null;

        if (errors.getFieldValue(field) instanceof Integer) {
            value = ((Integer) errors.getFieldValue(field)).longValue();
        } else if (errors.getFieldValue(field) instanceof Long) {
            value = ((Long) errors.getFieldValue(field));
        }

        if (value != null) {
            Assert.notNull(value);
            if (value > max) {
                errors.rejectValue(field, "field.value.max", new Long[] { new Long(max), new Long(value) }, field
                        + " should be at most " + max + ", but was " + value);
            }
        }
    }
}
