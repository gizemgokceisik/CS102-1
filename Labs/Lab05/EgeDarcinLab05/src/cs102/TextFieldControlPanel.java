import cs102.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/* @Class Discription: This is a controls class for Hangman. It displays an input textfield
 */
public class TextFieldControlPanel extends JPanel implements ActionListener 
{
  //properties
  private JTextField textField;
  private Hangman hangman;
  
  //contructor
  public TextFieldControlPanel(Hangman hangman)
  {
    super();
    this.hangman = hangman;
    textField = new JTextField(10);//max length of 10
    
    //styling
    textField.setFont(new Font(textField.getFont().getName(), Font.BOLD, 25));
    
    this.add(textField); //adding textField to the panel
    textField.addActionListener(this);//adding controls to the textfield
  }
  
  //implementing ActionListener
  //takes the input in the textField and uses tryThis for all the characters in the input field
  public void actionPerformed(ActionEvent e)
  {
    String str = textField.getText();
    
    //tryThis for all characters
    for (int i = 0; i < str.length(); i++)
    {
      hangman.tryThis(str.charAt(i));
    }
    //changes the textfield to an empty one
    textField.setText("");
  }
  
}//end of class TextFieldControlPanel