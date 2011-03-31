/**
 * 
 */
package org.mod4j.runtime.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author Johan Vogelzang
 */
public class RegExpValidator implements Validator {

    private String field;

    private String regExp;

    private Class clazz;

    /**
     * Validator for regular expressions
     * @param clazz The class that supports validation of regular expressions
     * @param field The field to validate
     * @param regExp The regular expression which the the <code>field</code> must apply to
     */
    public RegExpValidator(Class clazz, String field, String regExp) {
        this.clazz = clazz;
        this.field = field;
        this.regExp = regExp;
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
            
            if (!value.matches(regExp)) {
                errors.rejectValue(field, "field.regexp.match", new String[] { value, regExp },
                        field + " with value '"  + value + "' does not match regular expression " + regExp);
            }
        }
    }

}
