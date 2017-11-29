package uttt;

import java.util.*;
/**
 *
 * @author Alex Dagilis
 */
public class PlayGame
{
  String gameType;
  Scanner scan = new Scanner(system.in);
  //Constructor that sets the default to UTTT
  public PlayGame(){
      gameType = "ultimate";
      createGame();
  }
  //Constructor that checks what kind of game the user wants to play
  public PlayGame(String gt){
      gameType = gt.toLowerCase();
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
      Board[] ultimateBoardArr = new Board[9];
    }
  }

}
