package org.mod4j.runtime.test;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.Jdk14Logger;
import org.easymock.classextension.EasyMock;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.is;

/**
 * Base for Tests that need to verify that loglines are properly written.
 */
public abstract class AbstractLoggingTest {

    /**
     * Can be used to set the {@link Level}. Is set to {@link Level#ALL} in the {@link Before} and the old {@link Level}
     * will be reset in the {@link After}.
     */
    protected Logger logger;

    /** Can be used to 'listen in' on the messages written to the log. Subclass has to do the replay/verify. */
    protected Handler mockHandler;

    private Level oldLevel;

    /**
     * Setup environment before tests. If subclasses override this method, don't forget to call super!
     */
    @Before
    public void setUp() {
        // Get the log for the class under test.
        final Log log = getLog();

        // If the underlying logging implementation changes, fail.
        assertThat(log, is(Jdk14Logger.class));

        // Make the logger available to the individual tests.
        logger = ((Jdk14Logger) log).getLogger();

        // Save oldLevel so we can reset it afterwards.
        oldLevel = logger.getLevel();

        // Set Level 'all' so we receive all events.
        logger.setLevel(Level.ALL);

        // Create a MockHandler that can be used to verify log messages.
        mockHandler = EasyMock.createMock(Handler.class);

        // Add the MockHandler to the logger.
        logger.addHandler(mockHandler);
    }

    /**
     * The {@link Log} we'll work with. Has to be implemented by the subclass.
     * 
     * @return The {@link Log} we'll work with.
     */
    protected abstract Log getLog();

    /**
     * Cleanup after tests. If subclasses override this method, don't forget to call super!
     */
    @After
    public void tearDown() {
        // Restore the prior loglevel.
        logger.setLevel(oldLevel);

        // Remove the mock handler.
        logger.removeHandler(mockHandler);
    }

}
