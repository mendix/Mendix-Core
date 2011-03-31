package org.mendix.runtime.exception;

/**
 * Thrown when a business rule is violated. Attribute constraints are also considered business rules.
 * 
 * @author Eric Jan Malotaux
 * 
 */
@SuppressWarnings("serial")
public class BusinessRuleException extends RuntimeException {

    /**
     * Constructs a new business rule exception with <code>null</code> as its detail message. The cause is not
     * initialized, and may subsequently be initialized by a call to {@link #initCause}.
     */
    public BusinessRuleException() {
        super();
    }

    /**
     * Constructs a new business rule exception with the specified detail message and cause.
     * <p>
     * Note that the detail message associated with <code>cause</code> is <i>not</i> automatically incorporated in
     * this business rule exception's detail message.
     * 
     * @param message
     *            the detail message (which is saved for later retrieval by the {@link #getMessage()} method).
     * @param cause
     *            the cause (which is saved for later retrieval by the {@link #getCause()} method). (A <tt>null</tt>
     *            value is permitted, and indicates that the cause is nonexistent or unknown.)
     */
    public BusinessRuleException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new business rule exception with the specified detail message. The cause is not initialized, and may
     * subsequently be initialized by a call to {@link #initCause}.
     * 
     * @param message
     *            the detail message. The detail message is saved for later retrieval by the {@link #getMessage()}
     *            method.
     */
    public BusinessRuleException(String message) {
        super(message);
    }

    /**
     * Constructs a new business rule exception with the specified cause and a detail message of
     * <tt>(cause==null ? null : cause.toString())</tt> (which typically contains the class and detail message of
     * <tt>cause</tt>). This constructor is useful for business rule exceptions that are little more than wrappers
     * for other throwables.
     * 
     * @param cause
     *            the cause (which is saved for later retrieval by the {@link #getCause()} method). (A <tt>null</tt>
     *            value is permitted, and indicates that the cause is nonexistent or unknown.)
     */
    public BusinessRuleException(Throwable cause) {
        super(cause);
    }

}
