package uttt;

import java.util.*;
/**
 *
 * @author Alex Dagilis
 */
public class PlayGame
{
  private String gameType = "";
  private ArrayList<Board> global = new ArrayList<Board>();
  private Scanner scan = new Scanner(System.in);
  private int WIndex = -1;
  private int prevMove = -1;
  //Constructor that sets the default to UTTT
  public PlayGame(){
      gameType = "ultimate";
      createGame();
  }
  //Constructor that checks what kind of game the user wants to play
  public PlayGame(String gt){
      gameType = gt.toLowerCase();
      gameType = gameType.trim();
      createGame();
    }

  public void createGame(){
    if (gameType.equals("basic")){
      Board basicGameBoard = new Board();
      while (basicGameBoard.checkWin() == false){
        System.out.println("Please make your next move. (Enter a number between 1 and 8)");
        int moveLoc = scan.nextInt();
        basicGameBoard.checkMove(moveLoc);
      }
      System.out.println("Congrats! " + basicGameBoard.declareWin() + " wins!");
    }

    else if(gameType.equals("ultimate")){
      buildUTTTBoard();
    }
  }

  public void buildUTTTBoard();
  {
    Board topLeft = new Board(1);
    Board topMid = new Board(2);
    Board topRight = new Board(3);
    Board midLeft = new Board(4);
    Board midMid = new Board(5);
    Board midRight = new Board(6);
    Board botLeft = new Board(7);
    Board botMid = new Board(8);
    Board botRight = new Board(9);
    global.add(topLeft);
    global.add(topMid);
    global.add(topRight);
    global.add(midLeft);
    global.add(midMid);
    global.add(midRight);
    global.add(botLeft);
    global.add(botMid);
    global.add(botRight);
  }

  public boolean checkUltimateWin(){
    if (topLeft.declareWin() == topMid.declareWin() && topLeft.declareWin() == topRight.declareWin() && topLeft.declareWin() != ' ')
    {
      WIndex = 0;
      return true;
    }
    else if (midLeft.declareWin() == midMid.declareWin() && midLeft.declareWin() == midRight.declareWin() && midLeft.declareWin() != ' ')
    {
      WIndex = 3;
      return true;
    }
    else if(botLeft.declareWin() == botMid.declareWin() && botLeft.declareWin() == botRight.declareWin() && botLeft.declareWin() != ' ')
    {
      WIndex = 6;
      return true;
    }
    else if (topLeft.declareWin() == midLeft.declareWin() && topLeft.declareWin() == botLeft.declareWin() && topLeft.declareWin() != ' ')
    {
      WIndex = 0;
      return true;
    }
    else if (topMid.declareWin() == midMid.declareWin() && topMid.declareWin() == botMid.declareWin() && topMid.declareWin() != ' ')
    {
      WIndex = 1;
      return true;
    }
    else if (topRight.declareWin() == midRight.declareWin() && topRight.declareWin() == botRight.declareWin() && topRight.declareWin() != ' ')
    {
      WIndex = 2;
      return true;
    }
    else if (topLeft.declareWin() == midMid.declareWin() && topLeft.declareWin() == botRight.declareWin() && topLeft.declareWin() != ' ')
    {
      WIndex = 0;
      return true;
    }
    else if (topRight.declareWin() == midMid.declareWin() && topRight.declareWin() == botLeft.declareWin() && topLeft.declareWin() != ' ')
    {
      WIndex = 2;
      return true;
    }
    else
        return false;
  }

  private char declareUltimateWin(){
    retrun global.get(i).declareWin();
  }

}
