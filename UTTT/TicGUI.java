import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class TicGUI extends JFrame
{
JButton[][] buttons = new JButton[3][3];
JFrame frame = new JFrame("TicTacToe");                    //Global frame and grid button variables
JButton reset = new JButton("Reset");             //Create reset button for game

int moveCounter;
boolean gameWon;
int allowMoves;
boolean totalwin = false;
char winner;

public static int WhoseTurn = 0;

JPanel game = new JPanel(new GridLayout(3,3));

public static TicGUI[] tac = new TicGUI[9];

public TicGUI()                                        //Tic tac default constructor which adds and dimensions Jframe
{
 super("Ultimate Tic Tac Toe");

 moveCounter = 9;
 gameWon = false;
 winner = ' ';
 allowMoves = 10;

 for(int i = 0; i < 3; i++)                      //Create grid of buttons for tic tac toe game
  {
   for(int j = 0; j < 3; j++)
     {
      buttons[i][j] = new JButton();                //Instantiating buttons
      buttons[i][j].setText("");
      buttons[i][j].setVisible(true);
      buttons[i][j].setFont(new Font("Courier", Font.BOLD,75));

      game.add(buttons[i][j]);
      buttons[i][j].addActionListener(new myActionListener());        //Adding response event to buttons
     }
  }

}

private void checkWin(int row, int col)
{
  Color myRed = new Color(255, 0, 0);
  Color myGreen = new Color(0, 225, 0);
    try {
    if (buttons[0][2].getText()==buttons[1][2].getText()&& buttons[1][2].getText()==buttons[2][2].getText()&& buttons[2][2].getText()==buttons[0][2].getText()&& buttons[1][2].getText()!="")
    {
      gameWon = true;
      System.out.println(buttons[1][2].getText()+ " wins!!!");
      JOptionPane.showMessageDialog(frame, buttons[1][2].getText()+ " wins a square!");
      setWinner(buttons[1][2].getText().charAt(0));
      if (buttons[1][2].getText().equals("X"))
      {
        for(int i = 0; i < 3; i++)
         {
          for(int j = 0; j < 3; j++)
          {
             buttons[i][j].setBackground(myRed);
          }
         }
      }
      else
      {
        for(int i = 0; i < 3; i++)
         {
          for(int j = 0; j < 3; j++)
          {
             buttons[i][j].setBackground(myGreen);
          }
         }
      }
   }
    if (buttons[0][1].getText()==buttons[1][1].getText()&& buttons[1][1].getText()==buttons[2][1].getText()&& buttons[2][1].getText()==buttons[0][1].getText()&& buttons[1][1].getText()!="")
   {
      gameWon = true;
      System.out.println(buttons[1][1].getText()+ " wins!!!");
      JOptionPane.showMessageDialog(frame, buttons[1][1].getText()+ " wins a square!");
      setWinner(buttons[1][1].getText().charAt(0));
      if (buttons[1][1].getText().equals("X"))
      {
        for(int i = 0; i < 3; i++)
         {
          for(int j = 0; j < 3; j++)
          {
             buttons[i][j].setBackground(myRed);
          }
         }
      }
      else
      {
        for(int i = 0; i < 3; i++)
         {
          for(int j = 0; j < 3; j++)
          {
             buttons[i][j].setBackground(myGreen);
          }
         }
      }
   }
    if (buttons[0][0].getText()==buttons[1][0].getText()&& buttons[1][0].getText()==buttons[2][0].getText()&& buttons[2][0].getText()==buttons[0][0].getText()&& buttons[1][0].getText()!="")
   {
      gameWon = true;
      System.out.println(buttons[1][0].getText()+ " wins!!!");
      JOptionPane.showMessageDialog(frame, buttons[1][0].getText()+ " wins  a square!");
      setWinner(buttons[1][0].getText().charAt(0));
      if (buttons[1][0].getText().equals("X"))
      {
        for(int i = 0; i < 3; i++)
         {
          for(int j = 0; j < 3; j++)
          {
             buttons[i][j].setBackground(myRed);
          }
         }
      }
      else
      {
        for(int i = 0; i < 3; i++)
         {
          for(int j = 0; j < 3; j++)
          {
             buttons[i][j].setBackground(myGreen);
          }
         }
      }
   }
    if (buttons[2][0].getText()==buttons[2][1].getText()&& buttons[2][1].getText()==buttons[2][2].getText()&& buttons[2][2].getText()==buttons[2][0].getText()&& buttons[2][1].getText()!="")
   {
      gameWon = true;
      System.out.println(buttons[2][1].getText()+ " wins!!!");
      JOptionPane.showMessageDialog(frame, buttons[2][1].getText()+ " wins a square!");
      setWinner(buttons[2][1].getText().charAt(0));
      if (buttons[2][1].getText().equals("X"))
      {
        for(int i = 0; i < 3; i++)
         {
          for(int j = 0; j < 3; j++)
          {
             buttons[i][j].setBackground(myRed);
          }
         }
      }
      else
      {
        for(int i = 0; i < 3; i++)
         {
          for(int j = 0; j < 3; j++)
          {
             buttons[i][j].setBackground(myGreen);
          }
         }
      }

   }
    if (buttons[1][0].getText()==buttons[1][1].getText()&& buttons[1][1].getText()==buttons[1][2].getText()&& buttons[1][2].getText()==buttons[1][0].getText()&& buttons[1][1].getText()!="")
   {
      gameWon = true;
      System.out.println(buttons[1][1].getText()+ " wins!!!");
      JOptionPane.showMessageDialog(frame, buttons[1][1].getText()+ " wins  a square!");
      setWinner(buttons[1][1].getText().charAt(0));
      if (buttons[1][1].getText().equals("X"))
      {
        for(int i = 0; i < 3; i++)
         {
          for(int j = 0; j < 3; j++)
          {
             buttons[i][j].setBackground(myRed);
          }
         }
      }
      else
      {
        for(int i = 0; i < 3; i++)
         {
          for(int j = 0; j < 3; j++)
          {
             buttons[i][j].setBackground(myGreen);
          }
         }
      }
   }
    if (buttons[0][0].getText()==buttons[0][1].getText()&& buttons[0][1].getText()==buttons[0][2].getText()&& buttons[0][2].getText()==buttons[0][0].getText()&& buttons[0][1].getText()!="")
   {
      gameWon = true;
      System.out.println(buttons[0][1].getText()+ " wins!!!");
      JOptionPane.showMessageDialog(frame, buttons[0][1].getText()+ " wins  a square!");
      setWinner(buttons[0][1].getText().charAt(0));
      if (buttons[0][1].getText().equals("X"))
      {
        for(int i = 0; i < 3; i++)
         {
          for(int j = 0; j < 3; j++)
          {
             buttons[i][j].setBackground(myRed);
          }
         }
      }
      else
      {
        for(int i = 0; i < 3; i++)
         {
          for(int j = 0; j < 3; j++)
          {
             buttons[i][j].setBackground(myGreen);
          }
         }
      }
   }
   if (buttons[0][0].getText()==buttons[1][1].getText()&& buttons[1][1].getText()==buttons[2][2].getText()&& buttons[2][2].getText()==buttons[0][0].getText()&& buttons[1][1].getText()!="")
   {
      gameWon = true;
      System.out.println(buttons[1][1].getText()+ " wins  a square!");
      JOptionPane.showMessageDialog(frame, buttons[1][1].getText()+ " wins  a square!");
      setWinner(buttons[1][1].getText().charAt(0));
      if (buttons[1][1].getText().equals("X"))
      {
        for(int i = 0; i < 3; i++)
         {
          for(int j = 0; j < 3; j++)
          {
             buttons[i][j].setBackground(myRed);
          }
         }
      }
      else
      {
        for(int i = 0; i < 3; i++)
         {
          for(int j = 0; j < 3; j++)
          {
             buttons[i][j].setBackground(myGreen);
          }
         }
      }
   }
   if (buttons[0][2].getText()==buttons[1][1].getText()&& buttons[1][1].getText()==buttons[2][0].getText()&& buttons[2][0].getText()==buttons[0][2].getText()&& buttons[1][1].getText()!="")
   {
      gameWon = true;
      // WhoseTurn = 0;
      System.out.println(buttons[1][1].getText()+ " wins!!!");
      JOptionPane.showMessageDialog(frame, buttons[1][1].getText()+ " wins  a square!");
      setWinner(buttons[1][1].getText().charAt(0));
      if (buttons[1][1].getText().equals("X"))
      {
        for(int i = 0; i < 3; i++)
         {
          for(int j = 0; j < 3; j++)
          {
             buttons[i][j].setBackground(myRed);
          }
         }
      }
      else
      {
        for(int i = 0; i < 3; i++)
         {
          for(int j = 0; j < 3; j++)
          {
             buttons[i][j].setBackground(myGreen);
          }
         }
      }
   }

   if (moveCounter == 0 && gameWon == false)
   {
     allowMoves = 10;
     gameWon = true;

     JOptionPane.showMessageDialog(frame, "Stalemate in this block");
     setWinner('t');
     for(int i = 0; i < 3; i++)
      {
       for(int j = 0; j < 3; j++)
       {
          buttons[i][j].setBackground(Color.yellow);
       }
      }
   }

    }catch(Exception e) {
        allowMoves = 10;
        gameWon = true;
        System.out.println("Stalemate");
        JOptionPane.showMessageDialog(frame, "Stalemate");
    }
}

private void setWinner(char c)
{
  winner = c;
}

private void compTurn(int count)
{
  int randomMove=count;
  Random num = new Random();
  randomMove = num.nextInt(randomMove)+1;
}


private class myActionListener implements ActionListener
{      //Implementing action listener for buttons
 public void actionPerformed(ActionEvent a)
  {
   //Display X's or O's on the buttons
   //allowMoves;
   Color myRed = new Color(255, 0, 0);
   Color myGreen = new Color(0, 225, 0);

   if (gameWon==false)
   {
   if(a.getSource() == buttons[0][0] && !buttons[0][0].getText().equals("X") && !buttons[0][0].getText().equals("O"))                  //Checking which button is pressed
     {
       allowMoves = 0;
       if (WhoseTurn % 2 == 1)
       {
         buttons[0][0].setText("O");
         buttons[0][0].setBackground(myGreen);
       }
       else
       {
         buttons[0][0].setText("X");
         buttons[0][0].setBackground(myRed);
       }
       buttons[0][0].setEnabled(false);
       WhoseTurn ++;
       moveCounter--;
       checkWin(0,0);
       playwhere(allowMoves);
     }
   else if(a.getSource() == buttons[0][1] && !buttons[0][1].getText().equals("X") && !buttons[0][1].getText().equals("O"))
     {
       allowMoves = 1;
       if (WhoseTurn % 2 == 1)
       {
         buttons[0][1].setText("O");
         buttons[0][1].setBackground(myGreen);
       }
       else
       {
         buttons[0][1].setText("X");
         buttons[0][1].setBackground(myRed);
       }
       buttons[0][1].setEnabled(false);
       WhoseTurn ++;
       moveCounter--;
       //compTurn(moveCounter);
       checkWin(0,1);
       playwhere(allowMoves);
     }
   else if(a.getSource() == buttons[1][0] && !buttons[1][0].getText().equals("X") && !buttons[1][0].getText().equals("O"))
    {
      allowMoves= 3;
      if (WhoseTurn % 2 == 1)
      {
        buttons[1][0].setText("O");
        buttons[1][0].setBackground(myGreen);
      }
      else
      {
        buttons[1][0].setText("X");
        buttons[1][0].setBackground(myRed);
      }

      buttons[1][0].setEnabled(false);
      WhoseTurn ++;
      moveCounter--;
      //compTurn(moveCounter);
      checkWin(1,0);
      playwhere(allowMoves);
    }
   else if(a.getSource() == buttons[1][1] && !buttons[1][1].getText().equals("X") && !buttons[1][1].getText().equals("O"))
    {
      allowMoves = 4;
      if (WhoseTurn % 2 == 1)
      {
        buttons[1][1].setText("O");
        buttons[1][1].setBackground(myGreen);
      }
      else
      {
        buttons[1][1].setText("X");
        buttons[1][1].setBackground(myRed);
      }
      buttons[1][1].setEnabled(false);
      WhoseTurn ++;
      moveCounter--;
      //compTurn(moveCounter);
      checkWin(1,1);
      playwhere(allowMoves);
    }
   else if(a.getSource() == buttons[1][2] && !buttons[1][2].getText().equals("X") && !buttons[1][2].getText().equals("O"))
    {
      allowMoves = 5;
      if (WhoseTurn % 2 == 1)
      {
        buttons[1][2].setText("O");
        buttons[1][2].setBackground(myGreen);
      }
      else
      {
        buttons[1][2].setText("X");
        buttons[1][2].setBackground(myRed);
      }

      buttons[1][2].setEnabled(false);
      WhoseTurn ++;
      moveCounter--;
      //compTurn(moveCounter);
      checkWin(1,2);
      playwhere(allowMoves);
    }
   else if(a.getSource() == buttons[2][2] && !buttons[2][2].getText().equals("X") && !buttons[2][2].getText().equals("O"))
    {
    allowMoves = 8;
     if (WhoseTurn % 2 == 1)
     {
      buttons[2][2].setText ("O");
      buttons[2][2].setBackground(myGreen);
    }
    else
    {
      buttons[2][2].setText("X");
      buttons[2][2].setBackground(myRed);
    }

     buttons[2][2].setEnabled(false);
     WhoseTurn ++;
     moveCounter--;
     //compTurn(moveCounter);
     checkWin(2,2);
     playwhere(allowMoves);
    }
   else if(a.getSource() == buttons[0][2] && !buttons[0][2].getText().equals("X") && !buttons[0][2].getText().equals("O"))
    {
      allowMoves = 2;
     if (WhoseTurn % 2 == 1)
     {
      buttons[0][2].setText("O");
      buttons[0][2].setBackground(myGreen);
      }
      else
      {
        buttons[0][2].setText("X");
        buttons[0][2].setBackground(myRed);
      }

     buttons[0][2].setEnabled(false);
     WhoseTurn ++;
     moveCounter--;
     //compTurn(moveCounter);
     checkWin(0,2);
     playwhere(allowMoves);
    }
   else if(a.getSource() == buttons[2][1] && !buttons[2][1].getText().equals("X") && !buttons[2][1].getText().equals("O"))
    {
      allowMoves = 7;
     if (WhoseTurn % 2 == 1)
     {
      buttons[2][1].setText("O");
      buttons[2][1].setBackground(myGreen);
      }
     else
     {
       buttons[2][1].setText("X");
       buttons[2][1].setBackground(myRed);
     }

     buttons[2][1].setEnabled(false);
     WhoseTurn ++;
     moveCounter--;
     //compTurn(moveCounter);
     checkWin(2,1);
     playwhere(allowMoves);
    }
   else if(a.getSource() == buttons[2][0] && !buttons[2][0].getText().equals("X") && !buttons[2][0].getText().equals("O"))
    {
      allowMoves = 6;
     if (WhoseTurn % 2 == 1)
     {
      buttons[2][0].setText("O");
      buttons[2][0].setBackground(myGreen);
    }
    else
    {
      buttons[2][0].setText("X");
      buttons[2][0].setBackground(myRed);
    }

     buttons[2][0].setEnabled(false);
     WhoseTurn ++;
     moveCounter--;
     //compTurn(moveCounter);
     checkWin(2,0);
     playwhere(allowMoves);
    }
    overallwin();
    }

   if(a.getSource() == reset)
     {
       resetGame();
      }
  }
 }


public static void main(String[] args)
{
  TicGUI play = new TicGUI();         //main method and instantiating tic tac object and calling initialize function
  play.Game();
 }

public void Game()
{
   TicGUI game1 = new TicGUI();
   TicGUI game2 = new TicGUI();
   TicGUI game3 = new TicGUI();
   TicGUI game4 = new TicGUI();
   TicGUI game5 = new TicGUI();
   TicGUI game6 = new TicGUI();
   TicGUI game7 = new TicGUI();
   TicGUI game8 = new TicGUI();
   TicGUI game9 = new TicGUI();

   tac[0] = game1;
   tac[1] = game4;
   tac[2] = game7;
   tac[3] = game2;
   tac[4] = game5;
   tac[5] = game8;
   tac[6] = game3;
   tac[7] = game6;
   tac[8] = game9;

   //frame.setSize(1000, 1000);
   frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
   frame.setDefaultCloseOperation(EXIT_ON_CLOSE);        //Setting dimension of Jframe and setting parameters
   frame.setVisible(true);
   frame.setResizable(true);
   JPanel mainPanel = new JPanel(new BorderLayout());         //create main panel container to put layer others on top
   //mainPanel.add(reset)
   JPanel menu = new JPanel(new BorderLayout());
   JPanel gameDisplay = new JPanel(new GridLayout(3,3,200,40));

  gameDisplay.add(game1.game);
  gameDisplay.add(game4.game);
  gameDisplay.add(game7.game);
  gameDisplay.add(game2.game);
  gameDisplay.add(game5.game);
  gameDisplay.add(game8.game);
  gameDisplay.add(game3.game);
  gameDisplay.add(game6.game);
  gameDisplay.add(game9.game);

  frame.add(mainPanel);                                         //add main container panel to frame

  //mainPanel.setPreferredSize(new Dimension(325,425));
  menu.setPreferredSize(new Dimension(1000,50));                     //Setting dimensions of panels
  gameDisplay.setPreferredSize(new Dimension(900,900));

  mainPanel.add(reset, BorderLayout.NORTH);
  reset.addActionListener(new myActionListener());                  //Add two panels to the main container panel
  mainPanel.add(gameDisplay, BorderLayout.SOUTH);
}
public void overallwin()
{
  System.out.println(WhoseTurn);
  char c1= tac[0].winner;
  char c2= tac[1].winner;
  char c3= tac[2].winner;
  char c4= tac[3].winner;  //c stands for char of whatever game
  char c5= tac[4].winner;
  char c6= tac[5].winner;
  char c7= tac[6].winner;
  char c8= tac[7].winner;
  char c9= tac[8].winner;


  if(c1 == c2 && c1 == c3 && c1 != ' ')
  {
      this.totalwin =true;
      JOptionPane.showMessageDialog(frame, "Winner");
  }
  if(c1 == c4 && c1 == c7 && c1 != ' ')
   {
      this.totalwin =true;
      JOptionPane.showMessageDialog(frame, "Winner");
   }
   if(c1 == c5 && c1 == c9 && c1 != ' ')
    {
       this.totalwin =true;
       JOptionPane.showMessageDialog(frame, "Winner");
    }
    if(c2 == c5 && c2 == c8 && c2 != ' ')
     {
        this.totalwin =true;
        JOptionPane.showMessageDialog(frame, "Winner");
     }
     if(c3 == c6 && c3 == c9 && c3 != ' ')
      {
         this.totalwin =true;
         JOptionPane.showMessageDialog(frame, "Winner");
      }
      if(c3 == c5 && c3 == c7 && c3 != ' ')
       {
          this.totalwin =true;
          JOptionPane.showMessageDialog(frame, "Winner");
       }
       if(c4 == c5 && c4 == c6 && c4 != ' ')
        {
           this.totalwin =true;
           JOptionPane.showMessageDialog(frame, "Winner");
        }
        if(c7 == c8 && c7 == c9 && c7 != ' ')
         {
            this.totalwin =true;
            JOptionPane.showMessageDialog(frame, "Winner");
         }

}
public void playwhere(int go)
{

  if(go != 10 && tac[go].gameWon == false)
  {
    for(int i=0; i < 3; i++)
    {
      for(int j= 0; j < 3; j++)
      {
        for(int k = 0; k < 9; k ++)
        {
            if(k != go)
              tac[k].buttons[i][j].setEnabled(false);
            if(k == go && tac[k].gameWon != true)
              tac[k].buttons[i][j].setEnabled(true);
        }
      }
    }
  }

  else
  {
    for(int i=0; i < 3; i++)
    {
      for(int j= 0; j < 3; j++)
      {
        for(int k = 0; k < 9; k ++)
        {
              tac[k].buttons[i][j].setEnabled(true);
        }
      }
    }
  }
}
public void resetGame()
{
  for(int i=0; i < 3; i++)
  {
    for(int j= 0; j < 3; j++)
    {
      for(int k = 0; k < 9; k ++)
      {
        tac[k].gameWon = false;
        tac[k].buttons[i][j].setText("");
        tac[k].buttons[i][j].setEnabled(true);
        tac[k].moveCounter = 9;
        WhoseTurn = 1;
        tac[k].buttons[i][j].setBackground(null);
      }
    }
  }

}
}
