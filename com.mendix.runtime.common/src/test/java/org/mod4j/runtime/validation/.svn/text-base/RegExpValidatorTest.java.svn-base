/**
 * 
 */
package org.mod4j.runtime.validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mod4j.runtime.validation.RegExpValidator;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author Johan Vogelzang
 * 
 */
public class RegExpValidatorTest {
    
    public static final String EMAILADDRESS_REGEXP = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";

    @Test
    public void testSupports() {
        Validator validator = new RegExpValidator(ClassToTest.class, "stringProperty", EMAILADDRESS_REGEXP);
        assertTrue(validator.supports(ClassToTest.class));
        assertFalse(validator.supports(String.class));
    }

    @Test
    public void testValidateSucces() {
        Object object = new ClassToTest("aaa.bbb@ccc.dd");
        Validator validator = new RegExpValidator(ClassToTest.class, "stringProperty", EMAILADDRESS_REGEXP);
        Errors errors = new BindException(object, "object");
        validator.validate(object, errors);
        assertFalse(errors.hasErrors());
    }

    @Test
    public void testValidateFailure() {
        Object object = new ClassToTest("aaa@bbb");
        Validator validator = new RegExpValidator(ClassToTest.class, "stringProperty", EMAILADDRESS_REGEXP);
        Errors errors = new BindException(object, "object");
        validator.validate(object, errors);
        assertTrue(errors.hasErrors());
        assertEquals("field.regexp.match", errors.getFieldError().getCode());
    }

    @Test
    public void testValidateNull() {
        Object object = new ClassToTest(null);
        Validator validator = new RegExpValidator(ClassToTest.class, "stringProperty", EMAILADDRESS_REGEXP);
        Errors errors = new BindException(object, "object");
        validator.validate(object, errors);
        assertFalse(errors.hasErrors());
    }

    class ClassToTest {
        private String stringProperty;

        public ClassToTest(String value) {
            this.stringProperty = value;
        }

        public String getStringProperty() {
            return stringProperty;
        }

        public void setStringProperty(String stringProperty) {
            this.stringProperty = stringProperty;
        }
    }

}
