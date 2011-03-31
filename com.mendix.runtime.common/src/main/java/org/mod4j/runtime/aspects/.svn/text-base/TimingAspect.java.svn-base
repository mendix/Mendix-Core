package org.mod4j.runtime.aspects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;

/**
 * Aspect to trace the time a method call has taken to complete.
 * 
 * @author Philippe Tjon-a-Hen
 */
public class TimingAspect implements Ordered {

    /**
     * Logs the delta between entry and exit of an advised method.
     * 
     * @param call The intercepted {@link ProceedingJoinPoint}.
     * @return The object the intercepted method call returns.
     * @throws Throwable Any {@link Throwable} thrown by the intercepted method call.
     */
    public Object time(final ProceedingJoinPoint call) throws Throwable {
        final long startTimer = System.currentTimeMillis();

        try {
            return call.proceed();
        } finally {
            final Log log = LogFactory.getLog(call.getTarget().getClass());
            if (log.isTraceEnabled()) {
                final long delta = System.currentTimeMillis() - startTimer;
                log.trace("Execution of method [" + call.getSignature().getName() + "] in " + delta + " milliseconds");
            }
        }
    }

    private int order;

    /**
     * {@inheritDoc}
     */
    public int getOrder() {
        return order;
    }

    /**
     * Allows the order of this aspect to be set.
     * 
     * @param order the order to set.
     */
    public void setOrder(final int order) {
        this.order = order;
    }

}
