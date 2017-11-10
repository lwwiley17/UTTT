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
    private static final char[] EMPTY     [' ',' ',' ',' ',' ',' ',' ',' ',' '];
    private static final char[] X_FILLED  ['X','X','X','X','X','X','X','X','X'];
    private static final char[] O_FILLED  ['O','O','O','O','O','O','O','O','O'];

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

    @Test public void buildBoardEMPTY() {
        this.board.buildBoard();
        assertEquals(EMPTY, this.action.getBoard());
    }

    @test public void buildBoardX(){
      this.board.buildBoard();
      this.board.setBoard('X')
      assertEquals(X_FILLED, this.action.getBoard());
    }

    @test public void buildBoardO(){
      this.board,buildBoard();
      this.board.setBoard('O')
      assertEquals(O_FILLED, this.action.getBoard());
    }
