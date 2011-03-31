package org.mod4j.runtime.validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mod4j.runtime.validation.NotNullValidator;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author Eric Jan Malotaux
 */
public class NotNullValidatorTest {

    @Test
    public void testSupports() {
        Validator validator = new NotNullValidator(ClassToTest.class, "stringProperty");
        assertTrue(validator.supports(ClassToTest.class));
        assertFalse(validator.supports(String.class));
    }

    @Test
    public void testValidateSucces() {
        Object object = new ClassToTest("123");
        Validator validator = new NotNullValidator(ClassToTest.class, "stringProperty");
        Errors errors = new BindException(object, "object");
        validator.validate(object, errors);
        assertFalse(errors.hasErrors());
    }

    @Test
    public void testValidateFailure() {
        Object object = new ClassToTest(null);
        Validator validator = new NotNullValidator(ClassToTest.class, "stringProperty");
        Errors errors = new BindException(object, "object");
        validator.validate(object, errors);
        assertTrue(errors.hasErrors());
        assertEquals("field.required", errors.getFieldError().getCode());
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

    class SubclassOfClassToTest extends ClassToTest {
        public SubclassOfClassToTest(String value) {
            super(value);
        }
    }
}
