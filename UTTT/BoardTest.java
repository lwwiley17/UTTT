package uttt;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * ActionTest (JUnit 4)
 * @author  Luke Wiley
 * @version 11/8/2017
 */
public class BoardTest {
    //private static final String DEFAULT_LABEL       = "Action label";
    private static final char[] EMPTY     = new char[]{' ',' ',' ',' ',' ',' ',' ',' ',' '};
    private static final char[] X_FILLED  = new char[]{'X','X','X','X','X','X','X','X','X'};
    private static final char[] O_FILLED  = new char[]{'O','O','O','O','O','O','O','O','O'};

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
        this.board = new Board();
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
        this.board.buildBoard();
        assertArrayEquals("buildBoardEMPTY failed",EMPTY, this.board.getBoard());
    }

    //Testing a board filled with X's
    @Test public void buildBoardX(){
      this.board.buildBoard();
      this.board.setBoard('X');
      assertArrayEquals("buildBoardX failed",X_FILLED, this.board.getBoard());

    }

    //Testing a board filled with O's
    @Test public void buildBoardO(){
      this.board.buildBoard();
      this.board.setBoard('O');
      assertArrayEquals("buildBoardO failed",O_FILLED, this.board.getBoard());
    }


    //testing a move in the Topleft
    @Test public void placeMoveTopLeft()
    {
      this.board.buildBoard();
      this.board.placeMove(1);
      assertArrayEquals("placeMoveTopLeft failed",['X',' ',' ',' ',' ',' ',' ',' ',' '], this.board.getBoard());
    }

    //testing a move in the middle
    @Test public void placeMoveTopLeft()
    {
      this.board.buildBoard();
      this.board.placeMove(5);
      assertArrayEquals("placeMoveTopLeft failed",[' ',' ',' ',' ','X',' ',' ',' ',' '], this.board.getBoard());
    }

    //testing a move in the BottomRight
    @Test public void placeMoveTopLeft()
    {
      this.board.buildBoard();
      this.board.placeMove(9);
      assertArrayEquals("placeMoveTopLeft failed",[' ',' ',' ',' ',' ',' ',' ',' ','X'], this.board.getBoard());
    }

    //testing for an O going in an X spot
    @Test public void checkMoveXStays()
    {
      this.board.buildBoard();
      this.board.placeMove(1);
      this.board.placeMove(1);
      assertArrayEquals("checkMoveXStays failed",['X',' ',' ',' ',' ',' ',' ',' ',' '], this.board.getBoard());
    }

    @Test public void checkMoveOStays()
    {
      this.board.buildBoard();
      this.board.placeMove(1);
      this.board.placeMove(2);
      this.board.placeMove(2);
      assertArrayEquals("checkMoveOStays failed",['X','O',' ',' ',' ',' ',' ',' ',' '], this.board.getBoard());
    }

    //Testing for checking a win in the top row
    @Test public void checkWinTopRowWin()
    {
      this.board.buildBoard();
      this.board.setBoard(['X','X','X',' ',' ',' ',' ',' ',' ']);
      assertTrue("checkWinTopRowWin failed",this.board.checkWin());
    }

    //Testing for checking a win in the top row
    @Test public void checkWinTopRowWin()
    {
      this.board.buildBoard();
      this.board.setBoard(['X','X','X',' ',' ',' ',' ',' ',' ']);
      assertTrue("checkWinTopRowWin failed",this.board.checkWin());
    }

    //Testing for checking a win in the middle row
    @Test public void checkWinMiddleRowWin()
    {
      this.board.buildBoard();
      this.board.setBoard([' ',' ',' ','X','X','X',' ',' ',' ']);
      assertTrue("checkWinMiddleRowWin failed",this.board.checkWin());
    }

    //Testing for checking a win in the bottom row
    @Test public void checkWinBottomRowWin()
    {
      this.board.buildBoard();
      this.board.setBoard([' ',' ',' ',' ',' ',' ','X','X','X']);
      assertTrue("checkWinBottomRowWin fialed",this.board.checkWin());
    }

    //Testing for checking a win in the left column
    @Test public void checkWinLeftColumnWin()
    {
      this.board.buildBoard();
      this.board.setBoard(['X',' ',' ','X',' ',' ','X',' ',' ']);
      assertTrue("checkWinTopRowWin failed",this.board.checkWin());
    }

    //Testing for checking a win in the middle column
    @Test public void checkWinMiddleColumnWin()
    {
      this.board.buildBoard();
      this.board.setBoard([' ','X',' ',' ','X',' ',' ','X',' ']);
      assertTrue("checkWinTopRowWin failed",this.board.checkWin());
    }

    //Testing for checking a win in the right column
    @Test public void checkWinRightColumnWin()
    {
      this.board.buildBoard();
      this.board.setBoard([' ',' ','X',' ',' ','X',' ',' ','X']);
      assertTrue("checkWinTopRowWin failed",this.board.checkWin());
    }

    //declaring X wins
    @Test public void declareWinX()
    {
      this.board.buildBoard();
      this.board.setBoard(['X','X','X',' ',' ',' ',' ',' ',' '])
      assertEquals("X Wins",this.board.declareWin());
    }

    //declaring O Wins
    @Test public void declareWinX()
    {
      this.board.buildBoard();
      this.board.setBoard(['O','O','O',' ',' ',' ',' ',' ',' '])
      assertEquals("O Wins",this.board.declareWin());
    }

  }
