import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.JOptionPane;

public class TicGUI extends JFrame
{

JButton[][] buttons = new JButton[3][3];
JFrame frame = new JFrame("TicTacToe");                    //Global frame and grid button variables
JButton reset = new JButton("Reset");             //Create reset button for game
JOptionPane turn;
int moveCounter = 9;
boolean gameWon = false;
int WhoseTurn = 1;
int whichBoard = 5;
JPanel game = new JPanel(new GridLayout(3,3));

public TicGUI()                                        //Tic tac default constructor which adds and dimensions Jframe
{
 super();
 JButton[][] buttons = new JButton[3][3];

 int moveCounter = 9;
 boolean gameWon = false;




 for(int i = 0; i < 3; i++)                      //Create grid of buttons for tic tac toe game
  {
   for(int j = 0; j < 3; j++)
     {
      buttons[i][j] = new JButton();                //Instantiating buttons
      buttons[i][j].setText("");
      buttons[i][j].setVisible(true);

      game.setPreferredSize(new Dimension(900,900));
      game.add(buttons[i][j]);
      buttons[i][j].addActionListener(new myActionListener());        //Adding response event to buttons
     }
  }
}

private void checkWin(int row, int col)
{
    try {
    if (buttons[0][2].getText()==buttons[1][2].getText()&& buttons[1][2].getText()==buttons[2][2].getText()&& buttons[2][2].getText()==buttons[0][2].getText()&& buttons[1][2].getText()!="")
    {
      gameWon = true;
      WhoseTurn = 0;
      System.out.println(buttons[1][2].getText()+ " wins!!!");
      JOptionPane.showMessageDialog(frame, buttons[1][2].getText()+ " wins!!!");
   }
    if (buttons[0][1].getText()==buttons[1][1].getText()&& buttons[1][1].getText()==buttons[2][1].getText()&& buttons[2][1].getText()==buttons[0][1].getText()&& buttons[1][1].getText()!="")
   {
      gameWon = true;
      WhoseTurn = 0;
      System.out.println(buttons[1][1].getText()+ " wins!!!");
      JOptionPane.showMessageDialog(frame, buttons[1][1].getText()+ " wins!!!");
   }
    if (buttons[0][0].getText()==buttons[1][0].getText()&& buttons[1][0].getText()==buttons[2][0].getText()&& buttons[2][0].getText()==buttons[0][0].getText()&& buttons[1][0].getText()!="")
   {
      gameWon = true;
      WhoseTurn = 0;
      System.out.println(buttons[1][0].getText()+ " wins!!!");
      JOptionPane.showMessageDialog(frame, buttons[1][0].getText()+ " wins!!!");
   }
    if (buttons[2][0].getText()==buttons[2][1].getText()&& buttons[2][1].getText()==buttons[2][2].getText()&& buttons[2][2].getText()==buttons[2][0].getText()&& buttons[2][1].getText()!="")
   {
      gameWon = true;
      WhoseTurn = 0;
      System.out.println(buttons[2][1].getText()+ " wins!!!");
      JOptionPane.showMessageDialog(frame, buttons[2][1].getText()+ " wins!!!");
   }
    if (buttons[1][0].getText()==buttons[1][1].getText()&& buttons[1][1].getText()==buttons[1][2].getText()&& buttons[1][2].getText()==buttons[1][0].getText()&& buttons[1][1].getText()!="")
   {
      gameWon = true;
      WhoseTurn = 0;
      System.out.println(buttons[1][1].getText()+ " wins!!!");
      JOptionPane.showMessageDialog(frame, buttons[1][1].getText()+ " wins!!!");
   }
    if (buttons[0][0].getText()==buttons[0][1].getText()&& buttons[0][1].getText()==buttons[0][2].getText()&& buttons[0][2].getText()==buttons[0][0].getText()&& buttons[0][1].getText()!="")
   {
      gameWon = true;
      WhoseTurn = 0;
      System.out.println(buttons[0][1].getText()+ " wins!!!");
      JOptionPane.showMessageDialog(frame, buttons[0][1].getText()+ " wins!!!");
   }
   if (buttons[0][0].getText()==buttons[1][1].getText()&& buttons[1][1].getText()==buttons[2][2].getText()&& buttons[2][2].getText()==buttons[0][0].getText()&& buttons[1][1].getText()!="")
   {
      gameWon = true;
      WhoseTurn = 0;
      System.out.println(buttons[1][1].getText()+ " wins!!!");
      JOptionPane.showMessageDialog(frame, buttons[1][1].getText()+ " wins!!!");
   }
   if (buttons[0][2].getText()==buttons[1][1].getText()&& buttons[1][1].getText()==buttons[2][0].getText()&& buttons[2][0].getText()==buttons[0][2].getText()&& buttons[1][1].getText()!="")
   {
      gameWon = true;
      WhoseTurn = 0;
      System.out.println(buttons[1][1].getText()+ " wins!!!");
      JOptionPane.showMessageDialog(frame, buttons[1][1].getText()+ " wins!!!");
   }
    }catch(Exception e) {
        gameWon = true;
      WhoseTurn = 0;
      System.out.println("Stalemate");
      JOptionPane.showMessageDialog(frame, "Stalemate");
    }
}

private void compTurn(int count)
{
int randomMove=count;
Random num = new Random();
randomMove = num.nextInt(randomMove)+1;


}

private void initialize()             //Initialize tic tac toe game board
{
  JPanel mainPanel = new JPanel(new BorderLayout());         //create main panel container to put layer others on top
  JPanel menu = new JPanel(new BorderLayout());
  JPanel game = new JPanel(new GridLayout(9,3));
  //JPanel game2 = new JPanel(new GridLayout(3,3));                    //Create two more panels with layouts for buttons

  //frame.add(mainPanel);                                         //add main container panel to frame

  //mainPanel.setPreferredSize(new Dimension(325,425));
  menu.setPreferredSize(new Dimension(300,50));                     //Setting dimensions of panels
  game.setPreferredSize(new Dimension(900,900));
  //game2.setPreferr.edSize(new Dimension(300,300));

  mainPanel.add(menu, BorderLayout.NORTH);                   //Add two panels to the main container panel
  mainPanel.add(game, BorderLayout.SOUTH);
  //mainPanel.add(game2,BorderLayout.CENTER);

  //Add both start/reset buttons to menu container panel
  //menu.add(reset, BorderLayout.NORTH);

  //reset.addActionListener(new myActionListener());

for(int i = 0; i < 9; i++)                      //Create grid of buttons for tic tac toe game
 {
  for(int j = 0; j < 9; j++)
    {

     buttons[i][j] = new JButton();                //Instantiating buttons
     buttons[i][j].setText("");
     buttons[i][j].setVisible(true);

     game.add(buttons[i][j]);
     buttons[i][j].addActionListener(new myActionListener());        //Adding response event to buttons

    }
 }

}

private class myActionListener implements ActionListener
{      //Implementing action listener for buttons
 public void actionPerformed(ActionEvent a)
  {
   //Display X's or O's on the buttons
   if(gameWon == false)
   {
   if(a.getSource() == buttons[0][0])                  //Checking which button is pressed
     {
       buttons[0][0].setText("X");
       buttons[0][0].setEnabled(false);
       WhoseTurn = 2;
       moveCounter--;
       compTurn(moveCounter);
       checkWin(0,0);
     }
   else if(a.getSource() == buttons[0][1])
     {
       buttons[0][1].setText("X");
       buttons[0][1].setEnabled(false);
       WhoseTurn = 2;
       moveCounter--;
       compTurn(moveCounter);
       checkWin(0,1);
     }
   else if(a.getSource() == buttons[1][0])
    {
      buttons[1][0].setText("X");
      buttons[1][0].setEnabled(false);
      WhoseTurn = 2;
      moveCounter--;
      compTurn(moveCounter);
      checkWin(1,0);
    }
   else if(a.getSource() == buttons[1][1])
    {
      buttons[1][1].setText("X");
      buttons[1][1].setEnabled(false);
      WhoseTurn = 2;
      moveCounter--;
      compTurn(moveCounter);
      checkWin(1,1);
    }
   else if(a.getSource() == buttons[1][2])
    {
      buttons[1][2].setText("X");
      buttons[1][2].setEnabled(false);
      WhoseTurn = 2;
      moveCounter--;
      compTurn(moveCounter);
      checkWin(1,2);
    }
   else if(a.getSource() == buttons[2][2])
    {
     buttons[2][2].setText("X");
     buttons[2][2].setEnabled(false);
     WhoseTurn = 2;
     moveCounter--;
     compTurn(moveCounter);
     checkWin(2,2);
    }
   else if(a.getSource() == buttons[0][2])
    {
     buttons[0][2].setText("X");
     buttons[0][2].setEnabled(false);
     WhoseTurn = 2;
     moveCounter--;
     compTurn(moveCounter);
     checkWin(0,2);
    }
   else if(a.getSource() == buttons[2][1])
    {
     buttons[2][1].setText("X");
     buttons[2][1].setEnabled(false);
     WhoseTurn = 2;
     moveCounter--;
     compTurn(moveCounter);
     checkWin(2,1);
    }
   else if(a.getSource() == buttons[2][0])
    {
     buttons[2][0].setText("X");
     buttons[2][0].setEnabled(false);
     WhoseTurn = 2;
     moveCounter--;
     compTurn(moveCounter);
     checkWin(2,0);
    }
   }
   //if(a.getSource() == reset)
     //{
      //  for(int i = 0; i < 3; i++)
        // {
          // for(int j = 0; j < 3; j++)
            //{
              //  gameWon = false;
               //buttons[i][j].setText("");
               //buttons[i][j].setEnabled(true);
               //moveCounter = 9;
               //WhoseTurn = 1;

            //}
         //}
       //}
  }
 }

public static void main(String[] args)
{
  TicGUI game = new TicGUI();         //main method and instantiating tic tac object and calling initialize function
  //game.initialize();
  game.makeGame();

 }

public void makeGame()
{
  TicGUI[] tac = new TicGUI[9];

  TicGUI game1 = new TicGUI();
  TicGUI game2 = new TicGUI();
  TicGUI game3 = new TicGUI();
  TicGUI game4 = new TicGUI();
  TicGUI game5= new TicGUI();
  TicGUI game6 = new TicGUI();
  TicGUI game7 = new TicGUI();
  TicGUI game8 = new TicGUI();
  TicGUI game9 = new TicGUI();

  tac[0] = game1;
  tac[1] = game2;
  tac[2] = game3;
  tac[3] = game4;
  tac[4] = game5;
  tac[5] = game6;
  tac[6] = game7;
  tac[7] = game8;
  tac[8] = game9;

  frame.setSize(1000, 1000);
  frame.setDefaultCloseOperation(EXIT_ON_CLOSE);        //Setting dimension of Jframe and setting parameters
  frame.setVisible(true);
  frame.setResizable(false);
  JPanel mainPanel = new JPanel(new BorderLayout());         //create main panel container to put layer others on top
  JPanel menu = new JPanel(new BorderLayout());
  JPanel gameDisplay = new JPanel(new GridLayout(3,3,10,10));

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

  mainPanel.add(menu, BorderLayout.NORTH);                   //Add two panels to the main container panel
  mainPanel.add(gameDisplay, BorderLayout.SOUTH);


}





























}
