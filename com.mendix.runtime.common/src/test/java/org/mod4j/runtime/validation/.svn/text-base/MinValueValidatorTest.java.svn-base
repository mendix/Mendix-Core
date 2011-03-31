/**
 * 
 */
package org.mod4j.runtime.validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mod4j.runtime.validation.MinValueValidator;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author Eric Jan Malotaux
 */
public class MinValueValidatorTest {

    @Test
    public void testSupportsSucceeds() {
        Validator validator = new MinValueValidator(ClassToTest.class, "", 0);
        assertTrue(validator.supports(ClassToTest.class));
        assertTrue(validator.supports(SubclassOfClassToTest.class));
    }

    @Test
    public void testSupportsFails() {
        Validator validator = new MinValueValidator(ClassToTest.class, "", 0);
        assertFalse(validator.supports(Object.class));
    }

    @Test
    public void testIntHasErrors() {
        ClassToTest objectToTest = new ClassToTest();
        Errors errors = new BindException(objectToTest, "objectToTest");
        Validator validator = new MinValueValidator(ClassToTest.class, "intProperty", 3);
        validator.validate(objectToTest, errors);
        assertTrue(errors.hasErrors());
        assertEquals("field.value.min", errors.getFieldError().getCode());
    }

    @Test
    public void testIntIsValid() {
        ClassToTest objectToTest = new ClassToTest();
        objectToTest.setIntProperty(3);
        Errors errors = new BindException(objectToTest, "objectToTest");
        Validator validator = new MinValueValidator(ClassToTest.class, "intProperty", 3);
        validator.validate(objectToTest, errors);
        assertFalse(errors.hasErrors());
    }

    @Test
    public void testIntegerWithNull() {
        ClassToTest objectToTest = new ClassToTest();
        Errors errors = new BindException(objectToTest, "objectToTest");
        Validator validator = new MinValueValidator(ClassToTest.class, "integerProperty", 3);
        validator.validate(objectToTest, errors);
        assertFalse(errors.hasErrors());
    }

    @Test
    public void testIntegerWithError() {
        ClassToTest objectToTest = new ClassToTest();
        objectToTest.setIntegerProperty(2);
        Errors errors = new BindException(objectToTest, "objectToTest");
        Validator validator = new MinValueValidator(ClassToTest.class, "integerProperty", 3);
        validator.validate(objectToTest, errors);
        assertTrue(errors.hasErrors());
        assertEquals("field.value.min", errors.getFieldError().getCode());
    }

    @Test
    public void testIntegerIsValid() {
        ClassToTest objectToTest = new ClassToTest();
        objectToTest.setIntegerProperty(3);
        Errors errors = new BindException(objectToTest, "objectToTest");
        Validator validator = new MinValueValidator(ClassToTest.class, "integerProperty", 3);
        validator.validate(objectToTest, errors);
        assertFalse(errors.hasErrors());
    }

    class ClassToTest {
        private int intProperty;

        private Integer integerProperty;

        public int getIntProperty() {
            return intProperty;
        }

        public void setIntProperty(int intProperty) {
            this.intProperty = intProperty;
        }

        public Integer getIntegerProperty() {
            return integerProperty;
        }

        public void setIntegerProperty(Integer integerProperty) {
            this.integerProperty = integerProperty;
        }
    }

    class SubclassOfClassToTest extends ClassToTest {
    }
}
