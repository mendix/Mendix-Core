package org.mod4j.runtime.aspects;

import java.util.logging.Level;
import java.util.logging.LogRecord;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.easymock.Capture;
import org.easymock.classextension.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.mod4j.runtime.test.AbstractLoggingTest;

import static org.junit.Assert.assertThat;

import static org.easymock.EasyMock.capture;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

import static org.hamcrest.CoreMatchers.is;

/**
 * Test for {@link LoggingAspect}.
 */
public class LoggingAspectTest extends AbstractLoggingTest {

    /** Used to return as method name */
    private static final String DUMMY_METHOD_NAME = "dummy";
    private LoggingAspect loggingAspect;
    private JoinPoint call;

    /**
     * {@inheritDoc}
     */
    @Override
    @Before
    public void setUp() {
        loggingAspect = new LoggingAspect();
        call = createMock(JoinPoint.class);

        super.setUp();
    }

    /**
     * Test the {@link LoggingAspect#logAfter(JoinPoint)} method with loglevel set to 'all'.
     */
    @Test
    public void testLogAfter() {
        // Return this class as target. That means this classname will be written to the log.
        expect(call.getTarget()).andReturn(this);
        final Signature signature = expectGetName(call);

        // This should be the 'exiting' log message
        final Capture<LogRecord> capturedLogRecord = new Capture<LogRecord>();
        mockHandler.publish(capture(capturedLogRecord));

        EasyMock.replay(mockHandler);
        replay(call, signature);
        loggingAspect.logAfter(call);
        EasyMock.verify(mockHandler);
        verify(call, signature);

        // Validate the written logline
        final String expectedMessage = "Exiting method [" + DUMMY_METHOD_NAME + "]";
        assertThat(capturedLogRecord.getValue().getMessage(), is(expectedMessage));
    }

    /**
     * Test the {@link LoggingAspect#logBefore(JoinPoint)} method with loglevel set to 'all'.
     * 
     * @throws Throwable Not expected.
     */
    @Test
    public void testLogBefore() throws Throwable {
        // Return this class as target. That means this classname will be written to the log.
        expect(call.getTarget()).andReturn(this);
        final Signature signature = expectGetName(call);

        // This should be the 'entering' log message
        final Capture<LogRecord> capturedLogRecord = new Capture<LogRecord>();
        mockHandler.publish(capture(capturedLogRecord));

        EasyMock.replay(mockHandler);
        replay(call, signature);
        loggingAspect.logBefore(call);
        EasyMock.verify(mockHandler);
        verify(call, signature);

        // Validate the written logline
        final String expectedMessage = "Entering method [" + DUMMY_METHOD_NAME + "]";
        assertThat(capturedLogRecord.getValue().getMessage(), is(expectedMessage));
    }

    /**
     * Test the {@link LoggingAspect#logBefore(JoinPoint)} AND {@link LoggingAspect#logAfter(JoinPoint)} methods with
     * loglevel set to 'info', which should in nothing.
     */
    @Test
    public void testNoLogging() {
        // Override the loglevel: set it do info (which is not fine enough to log trace level).
        logger.setLevel(Level.INFO);

        // Two times, since we're testing both logBefore and logAfter
        expect(call.getTarget()).andReturn(this).times(2);

        EasyMock.replay(mockHandler);
        replay(call);
        loggingAspect.logBefore(call);
        loggingAspect.logAfter(call);
        EasyMock.verify(mockHandler);
        verify(call);
    }

    /**
     * @return The {@link Log} for the target (which is this class).
     */
    @Override
    protected Log getLog() {
        return LogFactory.getLog(this.getClass());
    }

    /**
     * Expect the steps to get the method name from the {@link JoinPoint}.
     * 
     * @param call The {@link JoinPoint} of which the {@link Signature} is retrieved.
     * @return The {@link Signature} with set behaviour, calling method should do replay / verify.
     */
    private static Signature expectGetName(final JoinPoint call) {
        final Signature signature = createMock(Signature.class);
        expect(call.getSignature()).andReturn(signature);
        expect(signature.getName()).andReturn(DUMMY_METHOD_NAME);
        return signature;
    }

}
