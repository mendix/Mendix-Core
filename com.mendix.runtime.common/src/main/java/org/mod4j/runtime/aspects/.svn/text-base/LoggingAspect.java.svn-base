package org.mod4j.runtime.aspects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.springframework.core.Ordered;

/**
 * Interceptor class to inject logging / tracing.
 */
public class LoggingAspect implements Ordered {

    /**
     * Logs the entry of an advised method.
     * 
     * @param call The intercepted {@link JoinPoint}.
     */
    public void logBefore(final JoinPoint call) {
        final Log log = getLog(call);

        if (log.isTraceEnabled()) {
            log.trace("Entering method [" + call.getSignature().getName() + "]");
        }
    }

    /**
     * Logs the exit (regardless of successful return or exception, aka 'finally') of an advised method.
     * 
     * @param call The intercepted {@link JoinPoint}.
     */
    public void logAfter(final JoinPoint call) {
        final Log log = getLog(call);

        if (log.isTraceEnabled()) {
            log.trace("Exiting method [" + call.getSignature().getName() + "]");
        }
    }

    /**
     * Get the {@link Log} for the advised method. Note that commons-logging caches the returned object, making this a
     * cheap operation.
     * 
     * @param call Used to determine the advised method.
     * @return The {@link Log} for the advised method.
     */
    private Log getLog(final JoinPoint call) {
        return LogFactory.getLog(call.getTarget().getClass());
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
