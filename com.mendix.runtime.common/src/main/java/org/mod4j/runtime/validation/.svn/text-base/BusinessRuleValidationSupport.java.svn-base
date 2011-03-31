/**
 * 
 */
package org.mod4j.runtime.validation;

import java.net.BindException;
import java.util.LinkedList;
import java.util.List;

import org.mod4j.runtime.exception.BusinessRuleException;
import org.springframework.validation.Validator;

/**
 * @author Eric Jan Malotaux
 */
public class BusinessRuleValidationSupport {
    
    private boolean active = true;
    
    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * 
     */
    public BusinessRuleValidationSupport(Object object) {
        this.validationTemplate = new BusinessRuleValidationTemplate(object);
    }

    protected List<Validator> validators = new LinkedList<Validator>();

    protected final BusinessRuleValidationTemplate validationTemplate;

    /**
     * Add the given <code>validator</code> to the collection of validators that will be executed on this object when
     * the {@link #validate()} method is called. The validators will be invoked in the order they were added.
     * 
     * @param validator -
     *            the validator being added.
     */
    public void addValidator(Validator validator) {
        if (!validators.contains(validator)) {
            validators.add(validator);
        }
    }

    /**
     * Validate this object.
     * 
     * If active, validation is performed by calling every {@link Validator} added by the {@link #addValidator(Validator)} method,
     * in the order they were added.
     * 
     * @throws BusinessRuleException -
     *             thrown when one or more errors are found. The exception thrown has as its cause a
     *             {@link BindException} containing information on all errors found.
     */
    public void validate() throws BusinessRuleException {
        
        if (isActive()) {
            validationTemplate.invokeValidators(validators);    
        }
    }
}
