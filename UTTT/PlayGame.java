package uttt;

import java.util.*;
/**
 *
 * @author Alex Dagilis
 */
public class PlayGame
{
  String gameType;
  private ArrayList<Board> global = new ArrayList<Board>();
  //Constructor that sets the default to UTTT
  public PlayGame(){
      gameType = "ultimate";
  }
  //Constructor that checks what kind of game the user wants to play
  public PlayGame(String gt){
      gameType = gt.toLowerCase();
      gametype = gameType.trim();
  }

  public void createGame(){
    if (gameType.equals("basic")){
      Board basicGameBoard = new Board();
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

}
