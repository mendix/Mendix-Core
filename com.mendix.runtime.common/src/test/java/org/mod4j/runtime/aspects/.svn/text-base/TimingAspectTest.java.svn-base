package org.mod4j.runtime.aspects;

import java.util.logging.Level;
import java.util.logging.LogRecord;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.easymock.Capture;
import org.easymock.classextension.EasyMock;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;
import org.mod4j.runtime.test.AbstractLoggingTest;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import static org.easymock.EasyMock.capture;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

/**
 * Test for {@link TimingAspect}.
 */
public class TimingAspectTest extends AbstractLoggingTest {

    /** Used to return as method name */
    private static final String DUMMY_METHOD_NAME = "dummy";

    /**
     * Test the {@link TimingAspect#time(ProceedingJoinPoint)} method.
     * 
     * @throws Throwable Not expect.
     */
    @Test
    public void testTiming() throws Throwable {
        // Class under test.
        final TimingAspect timingAspect = new TimingAspect();
        /*
         * Set up the mocks.
         */
        final ProceedingJoinPoint call = createMock(ProceedingJoinPoint.class);
        // Return this class as target. That means this classname will be written to the log.
        expect(call.getTarget()).andReturn(this);
        final Signature signature = createMock(Signature.class);
        expect(call.getSignature()).andReturn(signature);
        expect(signature.getName()).andReturn(DUMMY_METHOD_NAME);
        // Throw an exception so we can verify the logline is still written in the finally.
        expect(call.proceed()).andThrow(new IllegalArgumentException());

        // This should be the log message
        final Capture<LogRecord> capturedLogRecord = new Capture<LogRecord>();
        mockHandler.publish(capture(capturedLogRecord));

        EasyMock.replay(mockHandler);
        replay(call, signature);
        try {
            timingAspect.time(call);
            fail("Should have thrown an exception here");
        } catch (final IllegalArgumentException illegalArgumentException) {
            // expected
        }
        EasyMock.verify(mockHandler);
        verify(call, signature);

        // Validate the written logline
        // Since we don't know the actual ms, we'll just check on the first part of the logline.
        final String expectedMessagePrefix = "Execution of method [" + DUMMY_METHOD_NAME + "] in";
        assertThat(capturedLogRecord.getValue().getMessage(), JUnitMatchers.containsString(expectedMessagePrefix));
    }

    /**
     * Test the {@link TimingAspect#time(ProceedingJoinPoint)} method with loglevel set to 'info', which should in
     * nothing but a call to proceed().
     * 
     * @throws Throwable Not expected.
     */
    @Test
    public void testNoLogging() throws Throwable {
        // Class under test.
        final TimingAspect timingAspect = new TimingAspect();

        // Override the loglevel: set it do info (not fine enough to log trace level).
        logger.setLevel(Level.INFO);

        // Should only trigger the proceed and do nothing else.
        final ProceedingJoinPoint call = createMock(ProceedingJoinPoint.class);
        expect(call.getTarget()).andReturn(this);
        expect(call.proceed()).andReturn(null);

        EasyMock.replay(mockHandler);
        replay(call);
        timingAspect.time(call);
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

}
