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

  public void buildUTTTBoard()
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

}
