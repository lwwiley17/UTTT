package uttt;

import java.util.*;
/**
 *
 * @author Alex Dagilis
 */
public class Board
{
  private static char[] boardArr = new char[9];
  private static int WIndex = -1;
  private int moveCount = 0;
  private int location = 0;
  public Board(){
      buildBoard();
  }

  public Board(int loc){
    location = loc;
    buildBoard();
  }

  public void buildBoard(){
      for (int i = 0; i < boardArr.length; i++){
        boardArr[i] = ' ';
      }
  }

public char[] getBoard(){
  return boardArr;
}

  public void printBoard(){
      char[] tempArr = getBoard();
      String retString = "";
      int count = 0;
      for (int i = 0; i < tempArr.length; i++){
          if(count == 2){
            retString += tempArr[i] + "\n";
            count = 0;
          }
          else {
            retString += tempArr[i] + " | ";
          }

          count++;
      }
  }

  public void setBoard(char[] Entry){
    for (int i = 0; i < boardArr.length; i++){
        boardArr[i] = Entry[i];
    }
  }

  public void setBoard(char Entry){
    for (int i = 0; i < boardArr.length; i++){
        boardArr[i] = Entry;
    }
  }


  public boolean checkWin(){
    if (boardArr[0] == boardArr[1] && boardArr[0] == boardArr[2] && boardArr[0] != ' ')
    {
      WIndex = 0;
      return true;
    }
    else if (boardArr[3] == boardArr[4] && boardArr[3] == boardArr[5] && boardArr[3] != ' ')
    {
      WIndex = 3;
      return true;
    }
    else if (boardArr[6] == boardArr[7] && boardArr[6] == boardArr[8] && boardArr[6] != ' ')
    {
      WIndex = 6;
      return true;
    }
    else if (boardArr[0] == boardArr[3] && boardArr[0] == boardArr[6] && boardArr[0] != ' ')
    {
      WIndex = 0;
      return true;
    }
    else if (boardArr[1] == boardArr[4] && boardArr[1] == boardArr[7] && boardArr[1] != ' ')
    {
      WIndex = 1;
      return true;
    }
    else if (boardArr[2] == boardArr[5] && boardArr[2] == boardArr[8] && boardArr[2] != ' ')
    {
      WIndex = 2;
      return true;
    }
    else if (boardArr[0] == boardArr[4] && boardArr[0] == boardArr[8] && boardArr[0] != ' ')
    {
      WIndex = 0;
      return true;
    }
    else if (boardArr[2] == boardArr[4] && boardArr[2] == boardArr[6] && boardArr[2] != ' ')
    {
      WIndex = 2;
      return true;
    }
    else
        return false;
  }


  public char declareWin(){
    if (this.checkWin() == true){
      if (boardArr[WIndex] == 'O'){
        return 'O';
      }
      else {
        return 'X';
      }
    }
    else
      return 'T';
  }

  public void checkMove(int moveLoc){
    if (boardArr[moveLoc] == ' ')
      placeMove(moveLoc);
    else
      placeMove(-1);
  }

  public void placeMove(int moveLoc){

   if (moveLoc >= 0 && moveLoc <= 8 && moveCount % 2 == 1){
      boardArr[moveLoc] = 'O';
      moveCount++;
      System.out.println("Move Made");
    }
  else if (moveLoc >= 0 && moveLoc <= 8 && moveCount % 2 == 0){
      boardArr[moveLoc] = 'X';
      moveCount++;
      System.out.println("Move Made");
    }
    else{
      System.out.println("Please Pick Another Spot to Move");
    }
  }
}
