//package uttt;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * ActionTest (JUnit 4)
 * @author  Luke Wiley
 * @version 11/20/2017
 */
public class PlayGameTest {
    //private static final String DEFAULT_LABEL       = "Action label";


    private PlayGame game;

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
        this.game = new PlayGame();
    }
    /**
     * Tears down the test fixture after each test method.
     */
    @After public void tearDown() {
        this.board = null;
    }

    // testing for the creation of the Tic Tac Toe board


    //Testing an empty board
    @Test public void buildBoardEMPTY() {
        this.createGame.buildUTTTBoard();
        assertArrayEquals("buildBoardEMPTY failed",EMPTY, this.board.getBoard());
    }
}
