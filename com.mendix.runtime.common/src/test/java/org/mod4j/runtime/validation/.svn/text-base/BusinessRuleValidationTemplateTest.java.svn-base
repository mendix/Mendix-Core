package org.mod4j.runtime.validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Test;
import org.mod4j.runtime.exception.BusinessRuleException;
import org.mod4j.runtime.validation.BusinessRuleValidationTemplate;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class BusinessRuleValidationTemplateTest {
    public class TestValidator implements Validator {

        @SuppressWarnings("unchecked")
        public boolean supports(Class clazz) {
            return clazz.isAssignableFrom(ObjectToValidate.class);
        }

        public void validate(Object target, Errors errors) {
            errors.reject("this.is.an.error");
        }
    }

    public class ObjectToValidate {
        private String value;

        public ObjectToValidate(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    @Test
    public void testInvokeValidator() {
        ObjectToValidate target = new ObjectToValidate("value");
        BusinessRuleValidationTemplate template = new BusinessRuleValidationTemplate(target);
        try {
            template.invokeValidator(new TestValidator());
            fail("Expected BusinessRuleException");
        } catch (BusinessRuleException e) {
            Errors errors = (Errors) e.getCause();
            assertEquals("this.is.an.error", errors.getGlobalError().getCode());
        }
    }

    @Test
    public void testInvokeValidators() {
        ObjectToValidate target = new ObjectToValidate("value");
        BusinessRuleValidationTemplate template = new BusinessRuleValidationTemplate(target);
        try {
            template.invokeValidators(Arrays.asList(new Validator[] { new TestValidator(), new TestValidator() }));
            fail("Expected BusinessRuleException");
        } catch (BusinessRuleException e) {
            Errors errors = (Errors) e.getCause();
            assertEquals(2, errors.getErrorCount());
            assertEquals("this.is.an.error", errors.getGlobalError().getCode());
        }
    }
}
