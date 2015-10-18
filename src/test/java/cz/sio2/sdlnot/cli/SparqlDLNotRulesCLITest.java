package cz.sio2.sdlnot.cli;

import com.sun.org.apache.regexp.internal.RE;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * User: blaskmir
 * Date: 18/10/15
 */
public class SparqlDLNotRulesCLITest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testMain() throws Exception {

        String RESOURCES_DIR = "./src/test/resources/";

        String[] args = {
                "-o", "http://onto.sio2.cz/sdlnot-rules/onto-test-1",
                "-m", RESOURCES_DIR + "test-case-1/mapping",
                "-d", RESOURCES_DIR + "test-case-1/queries", };

        SparqlDLNotRulesCLI.main(args);

    }
}