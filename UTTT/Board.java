package uttt;

import java.util.*;
/**
 *
 * @author Luke  Wiley, Kyle Oprisko, Alexander Dagilis
 */
public class Board
{
  private static char[] boardArr = new char[9];
  private static int WIndex = -1;

  public Board(){
      buildBoard();
  }

  public void buildBoard(){
      for (int i = 0; i < boardArr.length(); i++){
        boardArr[i] = ' ';
      }
  }

public int[] getBoard(){
  return boardArr;
}

  public void printBoard(){
      int[] tempArr = getBoard();
      String retString = "";
      int count = 0;
      for (int i = 0; i < tempArr.length(); i++){
          if(count == 2){
            retString += tempArr[i] + "\n"
            count = 0;
          }
          else {
            retString += tempArr[i] + " | ";
          }

          count++;
      }
  }

  public void setBoard(char Entry){
    for int(i = 0; i < boardArr.length(); i++){
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
    if (checkWin == true){
      if (boardArr[wIndex] == 'O'){
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

   if (moveLoc >= 0 && moveLoc <= 8){
      boardArr[moveLoc] = 'O';
      System.out.println("Move Made");
    }
    else{
      System.out.println("Please Pick Another Spot to Move");
    }
  }
}
