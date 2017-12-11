package uttt;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * ActionTest (JUnit 4)
 * @author  Luke Wiley
 * @version 11/20/2017
 */
public class PlayGameTest {
    //private static final String DEFAULT_LABEL       = "Action label";
    private static final char[] EMPTY     = new char[]{' ',' ',' ',' ',' ',' ',' ',' ',' '};
    private static final char[] MIDDLE_X  = new char[]{' ',' ',' ',' ','X',' ',' ',' ',' '};
    private static final char[] MID_ROW_WIN = new char[]{' ',' ',' ','X','X','X',' ',' ',' '};


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
        this.game.createGame.buildUTTTBoard();
    }
    /**
     * Tears down the test fixture after each test method.
     */
    @After public void tearDown() {
        this.game = null;
    }

    // testing for the creation of the Tic Tac Toe board


    //Testing the building of the global board
    @Test public void buildBoard()) {
      assertEquals(9,this.game.global.length());
    }

    //taking an integer and then returning the corresponding board
    @Test public void getLocalBoard(){
      assertArrayEquals("getLocalBoard failed",EMPTY, this.game.getLocalBoard(0));
    }

    //making sure that this can be used for checking wins later
    @Test public void setLocalBoard(){
      this.game.setLocalBoard(0,MIDDLE_X);
      assertArrayEquals("setLocalBoard failed",MIDDLE_X, this.game.getLocalBoard(0));

    }

    //making sure the locked next moves are set in place
    @Test public void nextMoveLocation(){
      this.game.getMove(0);
      assertEquals(0, this.game.getNextMoveLocation());
    }

    @Test public void nextMoveFree(){
      this.game.setLocalBoard(0,MID_ROW_WIN);
      this.game.nextMove(0);
      assertTrue(this.game.nextMoveFree());
    }

    @Test public void declareUtimateWin(){
      this.game.setLocalBoard(0,MID_ROW_WIN);
      this.game.setLocalBoard(1,MID_ROW_WIN);
      this.game.setLocalBoard(2,MID_ROW_WIN);
      assertTrue(this.game.checkWinner());
    }

    //getLocalBoard, access eah local board
    //setBoard, setting each board for further checking other tests
    //checkUltimateWin, winning the biggest board
    //declareUltimateWin,
    //createGame
    //buildUTTTBoard
    //nextMove, storing the move of the previous player to then send the next player to the corresponding local board, and then if the board is won, rewards a free move

}
