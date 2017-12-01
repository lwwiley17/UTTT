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


    @Test public void createGame(){

    }

    //taking an integer and then
    @Test public void getLocalBoard(){

    }

    @Test public void checkUltimateWin(){

    }

    @Test public void declareUtimateWin(){

    }

    @Test public void buildUTTTBoard(){

    }

    @Test public void nextMoveNormal(){

    }

    @Test public void nextMoveFree(){

    }
    //getLocalBoard, access eah local board
    //setBoard, setting each board for further checking other tests
    //checkUltimateWin, winning the biggest board
    //declareUltimateWin,
    //createGame
    //buildUTTTBoard
    //nextMove, storing the move of the previous player to then send the next player to the corresponding local board, and then if the board is won, rewards a free move
}
