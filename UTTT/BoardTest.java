//package uttt;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * ActionTest (JUnit 4)
 * @author  Luke Wiley
 * @version 11/20/2017
 */
public class BoardTest {
    //private static final String DEFAULT_LABEL       = "Action label";
    private static final char[] EMPTY     = new char[]{' ',' ',' ',' ',' ',' ',' ',' ',' '};
    private static final char[] X_FILLED  = new char[]{'X','X','X','X','X','X','X','X','X'};
    private static final char[] O_FILLED  = new char[]{'O','O','O','O','O','O','O','O','O'};
    private static final char[] TOP_LEFT_X= new char[]{'X',' ',' ',' ',' ',' ',' ',' ',' '};
    private static final char[] MIDDLE_X  = new char[]{' ',' ',' ',' ','X',' ',' ',' ',' '};
    private static final char[] BOT_RITE_X= new char[]{' ',' ',' ',' ',' ',' ',' ',' ','X'};
    private static final char[] XO_STAYS  = new char[]{'X','O',' ',' ',' ',' ',' ',' ',' '};

    private static final char[] TOP_ROW_WIN = new char[]{'X','X','X',' ',' ',' ',' ',' ',' '};
    private static final char[] MID_ROW_WIN = new char[]{' ',' ',' ','X','X','X',' ',' ',' '};
    private static final char[] BOT_ROW_WIN = new char[]{' ',' ',' ',' ',' ',' ','X','X','X'};
    private static final char[] LEFT_COL_WIN = new char[]{'X',' ',' ','X',' ',' ','X',' ',' '};
    private static final char[] MID_COL_WIN = new char[]{' ','X',' ',' ','X',' ',' ','X',' '};
    private static final char[] RIGHT_COL_WIN = new char[]{' ',' ','X',' ',' ','X',' ',' ','X'};
    private static final char[] NEGATIVE_DIAG = new char[]{'X',' ',' ',' ','X',' ',' ',' ','X'};
    private static final char[] POSITIVE_DIAG = new char[]{' ',' ','X',' ','X',' ','X',' ',' '};

    private static final char[] O_TOP_ROW_WIN = new char[]{'O','O','O',' ',' ',' ',' ',' ',' '};

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
      this.board.checkMove(0);
      assertArrayEquals("placeMoveTopLeft failed",TOP_LEFT_X, this.board.getBoard());
    }

    //testing a move in the middle
    @Test public void placeMoveMiddle()
    {
      this.board.buildBoard();
      this.board.checkMove(4);
      assertArrayEquals("placeMoveTopLeft failed",MIDDLE_X, this.board.getBoard());
    }

    //testing a move in the BottomRight
    @Test public void placeMoveBotRight()
    {
      this.board.buildBoard();
      this.board.checkMove(8);
      assertArrayEquals("placeMoveTopLeft failed",BOT_RITE_X, this.board.getBoard());
    }

    //testing for an O going in an X spot
    @Test public void checkMoveXStays()
    {
      this.board.buildBoard();
      this.board.placeMove(0);
      this.board.placeMove(0);
      assertArrayEquals("checkMoveXStays failed",TOP_LEFT_X, this.board.getBoard());
    }

    @Test public void checkMoveOStays()
    {
      this.board.buildBoard();
      this.board.checkMove(0);
      this.board.checkMove(1);
      this.board.checkMove(1);
      assertArrayEquals("checkMoveOStays failed",XO_STAYS, this.board.getBoard());
    }

    //Testing for checking a win in the top row
    @Test public void checkWinTopRowWin()
    {
      this.board.buildBoard();
      this.board.setBoard(TOP_ROW_WIN);
      assertTrue("checkWinTopRowWin failed",this.board.checkWin());
    }

    //Testing for checking a win in the top row
    @Test public void checkWinTopRowWin()
    {
      this.board.buildBoard();
      this.board.setBoard(TOP_ROW_WIN);
      assertTrue("checkWinTopRowWin failed",this.board.checkWin());
    }

    //Testing for checking a win in the middle row
    @Test public void checkWinMiddleRowWin()
    {
      this.board.buildBoard();
      this.board.setBoard(MID_ROW_WIN);
      assertTrue("checkWinMiddleRowWin failed",this.board.checkWin());
    }

    //Testing for checking a win in the bottom row
    @Test public void checkWinBottomRowWin()
    {
      this.board.buildBoard();
      this.board.setBoard(BOT_ROW_WIN);
      assertTrue("checkWinBottomRowWin fialed",this.board.checkWin());
    }

    //Testing for checking a win in the left column
    @Test public void checkWinLeftColumnWin()
    {
      this.board.buildBoard();
      this.board.setBoard(LEFT_COL_WIN);
      assertTrue("checkWinTopRowWin failed",this.board.checkWin());
    }

    //Testing for checking a win in the middle column
    @Test public void checkWinMiddleColumnWin()
    {
      this.board.buildBoard();
      this.board.setBoard(MID_COL_WIN);
      assertTrue("checkWinTopRowWin failed",this.board.checkWin());
    }

    //Testing for checking a win in the right column
    @Test public void checkWinRightColumnWin()
    {
      this.board.buildBoard();
      this.board.setBoard(RIGHT_COL_WIN);
      assertTrue("checkWinTopRowWin failed",this.board.checkWin());
    }

    //Testing for checking a win in the diagonal from top left to bottom right (negative slope)
    @Test public void checkWinNegaiveDiagonal()
    {
      this.board.buildBoard();
      this.board.setBoard(NEGATIVE_DIAG);
      assertTrue("checkWinNegaiveDiagonal failed",this.board.checkWin());
    }

    //Testing for checking a win in the diagonal from top right to bottom left (positve slope)
    @Test public void checkWinPositiveDiagonal()
    {
      this.board.buildBoard();
      this.board.setBoard(POSITIVE_DIAG);
      assertTrue("checkWinPositiveDiagonal failed",this.board.checkWin());
    }


    //declaring X wins
    @Test public void declareWinX()
    {
      this.board.buildBoard();
      this.board.setBoard(TOP_ROW_WIN);
      assertEquals('X',this.board.declareWin());
    }

    //declaring O Wins
    @Test public void declareWinO()
    {
      this.board.buildBoard();
      this.board.setBoard(O_TOP_ROW_WIN);
      assertEquals('O',this.board.declareWin());
    }

  }
