package org.mod4j.runtime.validation;

import org.springframework.util.Assert;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

/**
 * This class implements some common checks on fields. It uses the {@link ValidationUtils} class of the Spring framework
 * to collect and report errors.
 * 
 * @author Eric Jan Malotaux
 * 
 * @deprecated
 */
public class BusinessRuleUtils {

    /**
     * Reject the given field if the value is empty or just contains whitespace.
     * 
     * An 'empty' value in this context means either null, the empty string "", or consisting wholly of whitespace.
     * 
     * The object whose field is being validated does not need to be passed in because the Errors instance can resolve
     * field values by itself (it will usually hold an internal reference to the target object).
     * 
     * @param errors
     * @param field
     * 
     * @deprecated
     */
    public static void validateEmptyOrWhitespace(Errors errors, String field) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, field, "field.required");
    }

    /**
     * Reject the given field if the string value is shorter than the minimum length given in <code>min</code>.
     * 
     * The object whose field is being validated does not need to be passed in because the Errors instance can resolve
     * field values by itself (it will usually hold an internal reference to the target object).
     * 
     * @param errors
     * @param field
     * @param min
     * 
     * @deprecated
     */
    public static void validateMinLength(Errors errors, String field, int min) {
        String value = (String) errors.getFieldValue(field);
        Assert.notNull(value);
        int length = value.length();
        if (length < min) {
            errors.rejectValue(field, "field.length.min", new Integer[] { new Integer(min), new Integer(length) },
                    field + " should be at least " + min + " long, but was " + length);
        }
    }

    /**
     * Reject the given field if the string value is shorter than the maximum length given in <code>max</code>.
     * 
     * The object whose field is being validated does not need to be passed in because the Errors instance can resolve
     * field values by itself (it will usually hold an internal reference to the target object).
     * 
     * @param errors
     * @param field
     * @param max
     * 
     * @deprecated
     */
    public static void validateMaxLength(Errors errors, String field, int max) {
        String value = (String) errors.getFieldValue(field);
        Assert.notNull(value);
        int length = value.length();
        if (length > max) {
            errors.rejectValue(field, "field.length.max", new Integer[] { new Integer(max), new Integer(length) },
                    field + " should be at most " + max + " long, but was " + length);
        }
    }

    /**
     * Reject the given field if the <code>long</code> value is more than the maximum value given in <code>max</code>.
     * 
     * The object whose field is being validated does not need to be passed in because the Errors instance can resolve
     * field values by itself (it will usually hold an internal reference to the target object).
     * 
     * @param errors
     * @param field
     * @param max
     * 
     * @deprecated
     */
    public static void validateMaxValue(Errors errors, String field, long max) {

        Long value = null;

        if (errors.getFieldValue(field) instanceof Integer) {
            value = ((Integer) errors.getFieldValue(field)).longValue();
        } else if (errors.getFieldValue(field) instanceof Long) {
            value = ((Long) errors.getFieldValue(field));
        }
        Assert.notNull(value);
        if (value > max) {
            errors.rejectValue(field, "field.value.max", new Long[] { new Long(max), new Long(value) }, field
                    + " should be at most " + max + ", but was " + value);
        }
    }

    /**
     * Reject the given field if the <code>long</code> value is less than the minimum value given in <code>min</code>.
     * 
     * The object whose field is being validated does not need to be passed in because the Errors instance can resolve
     * field values by itself (it will usually hold an internal reference to the target object).
     * 
     * @param errors
     * @param field
     * @param min
     * @deprecated
     */
    public static void validateMinValue(Errors errors, String field, long min) {

        Long value = null;

        if (errors.getFieldValue(field) instanceof Integer) {
            value = ((Integer) errors.getFieldValue(field)).longValue();
        } else if (errors.getFieldValue(field) instanceof Long) {
            value = ((Long) errors.getFieldValue(field));
        }

        if (value != null) {
            Assert.notNull(value);
            if (value < min) {
                errors.rejectValue(field, "field.value.min", new Long[] { new Long(min), new Long(value) }, field
                        + " should be at least " + min + ", but was " + value);
            }
        }
    }
}
