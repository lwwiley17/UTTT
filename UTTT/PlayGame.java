package uttt;

import java.util.*;
/**
 *
 * @author Alex Dagilis
 */
public class PlayGame
{
  String gameType;
  //Constructor that sets the default to UTTT
  public PlayGame(){
      gameType = "ultimate";
  }
  //Constructor that checks what kind of game the user wants to play
  public PlayGame(String gt){
      gameType = gt.toLowerCase();
  }

  public void createGame(){
    if (gameType.equals("basic")){
      Board basicGameBoard = new Board();
    }

    else if(gameType.equals("ultimate")){
    }
  }

}
