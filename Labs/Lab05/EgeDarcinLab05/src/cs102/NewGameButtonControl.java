

import javax.swing.*;
import java.awt.event.*;
import cs102.*;

/*Class Discription: This class is used to create the new game button for Hangman.
 * This is both a view and controls class.
 */
public class NewGameButtonControl extends JButton implements ActionListener, IHangmanView
{
  //properties
  private Hangman hangman;
  
  //contructor
  public NewGameButtonControl(Hangman hangman)
  {
    super("New Game");
    this.hangman = hangman;
    this.addActionListener(this);//adding controls
    this.setEnabled(false);
  }
  
  //implementing ActionListener
  public void actionPerformed(ActionEvent event)
  {
    hangman.initNewGame();
    this.setEnabled(false); // disables after one use
    
  }
  
  //implementing IHangmanView
  ////re-enables the newgame button when the game is over
  public void updateView(Hangman hangman)
  {
    if ( hangman.isGameOver())
    {
      this.setEnabled(true);
    }
  }
  
  
}//end of class NewGameButtonControl