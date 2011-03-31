/**
 * 
 */
package org.mod4j.runtime.validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.mod4j.runtime.validation.BusinessRuleUtils;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

/**
 * @author Eric Jan Malotaux *
 */
public class BusinessRuleUtilsTest {

    class ObjectToValidate {
        private String stringValue;

        private Long longValue;

        private Integer integerValue;

        public Long getLongValue() {
            return longValue;
        }

        public void setLongValue(Long longValue) {
            this.longValue = longValue;
        }

        public Integer getIntegerValue() {
            return integerValue;
        }

        public void setIntegerValue(Integer inteerValue) {
            this.integerValue = integerValue;
        }

        public ObjectToValidate(String value) {
            this.stringValue = value;
        }

        public ObjectToValidate(Long value) {
            this.longValue = value;
        }

        public ObjectToValidate(Integer value) {
            this.integerValue = value;
        }

        public String getStringValue() {
            return stringValue;
        }

        public void setStringValue(String value) {
            this.stringValue = value;
        }
    }

    /**
     * Test method for
     * {@link org.mod4j.runtime.validation.BusinessRuleUtils#validateEmptyOrWhitespace(org.springframework.validation.Errors, java.lang.String)}.
     */
    @Test
    public void testValidateEmptyOrWhitespace() {
        Object target = new ObjectToValidate("");
        Errors errors = new BindException(target, "target");
        BusinessRuleUtils.validateEmptyOrWhitespace(errors, "stringValue");
        assertTrue(errors.hasErrors());
        assertEquals("field.required", errors.getFieldError("stringValue").getCode());
    }

    /**
     * Test method for
     * {@link org.mod4j.runtime.validation.BusinessRuleUtils#validateMinLength(org.springframework.validation.Errors, java.lang.String, int)}.
     */
    @Test
    public void testValidateMinLengthFail() {
        ObjectToValidate target = new ObjectToValidate("12");
        Errors errors = new BindException(target, "target");
        BusinessRuleUtils.validateMinLength(errors, "stringValue", 3);
        assertTrue(errors.hasErrors());
        FieldError error = errors.getFieldError("stringValue");
        assertNotNull(error);
        assertEquals("field.length.min", error.getCode());
        assertEquals("stringValue should be at least 3 long, but was 2", error.getDefaultMessage());
    }

    private void autoBoxer(Object obj) {

        if (obj instanceof String) {
            System.out.println("Its a String:  " + obj);
        } else if (obj instanceof Integer) {
            System.out.println("Its a Integer:  " + obj);
        } else if (obj instanceof Long) {
            System.out.println("Its a Long:  " + obj);
        }

    }

    @Test
    public void testAutoboing() {
        autoBoxer(5);
        autoBoxer(5L);
        autoBoxer("5");
        autoBoxer("5 hello");
    }

    /**
     * Test method for
     * {@link org.mod4j.runtime.validation.BusinessRuleUtils#validateMinLength(org.springframework.validation.Errors, java.lang.String, int)}.
     */
    @Test
    public void testValidateMinLengthSucceed() {
        ObjectToValidate target = new ObjectToValidate("123");
        Errors errors = new BindException(target, "target");
        BusinessRuleUtils.validateMinLength(errors, "stringValue", 3);
        assertFalse(errors.hasErrors());
        target.setStringValue("1234");
        BusinessRuleUtils.validateMinLength(errors, "stringValue", 3);
        assertFalse(errors.hasErrors());
    }

    /**
     * Test method for
     * {@link org.mod4j.runtime.validation.BusinessRuleUtils#validateMaxLength(org.springframework.validation.Errors, java.lang.String, int)}.
     */
    @Test
    public void testValidateMaxLengthFail() {
        ObjectToValidate target = new ObjectToValidate("1234");
        Errors errors = new BindException(target, "target");
        BusinessRuleUtils.validateMaxLength(errors, "stringValue", 3);
        assertTrue(errors.hasErrors());
        FieldError error = errors.getFieldError("stringValue");
        assertNotNull(error);
        assertEquals("field.length.max", error.getCode());
        assertEquals("stringValue should be at most 3 long, but was 4", error.getDefaultMessage());
    }

    /**
     * Test method for
     * {@link org.mod4j.runtime.validation.BusinessRuleUtils#validateMaxLength(org.springframework.validation.Errors, java.lang.String, int)}.
     */
    @Test
    public void testValidateMaxLengthSucceed() {
        ObjectToValidate target = new ObjectToValidate("123");
        Errors errors = new BindException(target, "target");
        BusinessRuleUtils.validateMaxLength(errors, "stringValue", 3);
        assertFalse(errors.hasErrors());
        target.setStringValue("12");
        BusinessRuleUtils.validateMaxLength(errors, "stringValue", 3);
        assertFalse(errors.hasErrors());
    }

    @Test
    public void testValidateMaxValueFail() {
        ObjectToValidate target = new ObjectToValidate(5L);
        Errors errors = new BindException(target, "target");
        BusinessRuleUtils.validateMaxValue(errors, "longValue", 4);
        assertTrue(errors.hasErrors());
        FieldError error = errors.getFieldError();
        assertNotNull(error);
        assertEquals("field.value.max", error.getCode());
        assertEquals("longValue should be at most 4, but was 5", error.getDefaultMessage());
    }

    @Test
    public void testValidateMaxValueSucceed() {
        ObjectToValidate target = new ObjectToValidate(5L);
        Errors errors = new BindException(target, "target");
        BusinessRuleUtils.validateMaxValue(errors, "longValue", 5);
        assertFalse(errors.hasErrors());
        BusinessRuleUtils.validateMaxValue(errors, "longValue", 6);
        assertFalse(errors.hasErrors());
    }

    @Test
    public void testValidateMaxValueSucceedWithInteger() {
        ObjectToValidate target = new ObjectToValidate(new Integer(7));
        Errors errors = new BindException(target, "target");
        BusinessRuleUtils.validateMaxValue(errors, "integerValue", 8);
        assertFalse(errors.hasErrors());
        BusinessRuleUtils.validateMaxValue(errors, "integerValue", 9);
        assertFalse(errors.hasErrors());
    }

    @Test
    public void testValidateMinValueFail() {
        ObjectToValidate target = new ObjectToValidate(5L);
        Errors errors = new BindException(target, "target");
        BusinessRuleUtils.validateMinValue(errors, "longValue", 6);
        assertTrue(errors.hasErrors());
        FieldError error = errors.getFieldError();
        assertNotNull(error);
        assertEquals("field.value.min", error.getCode());
        assertEquals("longValue should be at least 6, but was 5", error.getDefaultMessage());
    }

    @Test
    public void testValidateMinValueSucceed() {
        ObjectToValidate target = new ObjectToValidate(5L);
        Errors errors = new BindException(target, "target");
        BusinessRuleUtils.validateMinValue(errors, "longValue", 5);
        assertFalse(errors.hasErrors());
        BusinessRuleUtils.validateMinValue(errors, "longValue", 4);
        assertFalse(errors.hasErrors());
    }

    @Test
    public void testValidateMinValueSucceedWithInteger() {
        ObjectToValidate target = new ObjectToValidate(new Integer(5));
        Errors errors = new BindException(target, "target");
        BusinessRuleUtils.validateMinValue(errors, "integerValue", 5);
        assertFalse(errors.hasErrors());
        BusinessRuleUtils.validateMinValue(errors, "integerValue", 2);
        assertFalse(errors.hasErrors());
    }

    @Test
    public void testValidateMinLengthWithLong() {
        ObjectToValidate target = new ObjectToValidate(5L);
        Errors errors = new BindException(target, "target");
        try {
            BusinessRuleUtils.validateMinLength(errors, "longValue", 5);
            fail("Expected ClassCastException");
        } catch (ClassCastException e) {
            // Expected
        }
    }

    @Test
    public void testValidateMaxLengthWithLong() {
        ObjectToValidate target = new ObjectToValidate(5L);
        Errors errors = new BindException(target, "target");
        try {
            BusinessRuleUtils.validateMaxLength(errors, "longValue", 5);
            fail("Expected ClassCastException");
        } catch (ClassCastException e) {
            // Expected
        }
    }

    @Test
    public void testValidateMinValueWithString() {
        ObjectToValidate target = new ObjectToValidate("value");
        Errors errors = new BindException(target, "target");
        BusinessRuleUtils.validateMinValue(errors, "longValue", 5);
    }

    @Test
    public void testValidateMaxValueWithString() {
        ObjectToValidate target = new ObjectToValidate("value");
        Errors errors = new BindException(target, "target");
        try {
            BusinessRuleUtils.validateMaxValue(errors, "longValue", 5);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

}
