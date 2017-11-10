package uttt;

import java.util.*;
/**
 *
 * @author Luke  Wiley, Kyle Oprisko, Alexander Dagilis
 */
public class UTTT
{
  private static char[] boardArr = new char[9];

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

  public void checkWin(){
    return;
  }

  public void declareWin(){
    return;
  }

  public void checkMove(){
    return;
  }

  public void placeMove(){
    return;
  }


}
