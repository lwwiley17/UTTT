package uttt;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * ActionTest (JUnit 4)
 * @author  Luke Wiley
 * @version 11/8/2017
 */
public class ActionTest {
    //private static final String DEFAULT_LABEL       = "Action label";
    private Board board;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Sets up the test fixture before each test method.
     */
    @Before public void setUp() {
        this.action = new Action(DEFAULT_LABEL, DEFAULT_DESCRIPTION,
                                prevPlace, nextPlace);
    }
    /**
     * Tears down the test fixture after each test method.
     */
    @After public void tearDown() {
        this.action = null;
    }
    
