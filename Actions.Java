/*******************
Name:Brendan McCullagh

Date:20210305

Notes:
*******************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Actions extends JFrame implements ActionListener
{

   //Create the components (textarea and buttons)
   
   private JFrame programFrame;
   
   private JPanel programPanel1;
   private Jpanel programPanel2;
   
   private JButton programButton1;
   private JButton programButton2;
   private JButton programButton3;
   private JButton programButton4;
   private JButton programButton5; 
   
   private JTextField programTextField;
   
   
   public Actions()
{

   //create the window (include a close operation)
   
   programFrame = new JFrame("ENTD-380 Assignment #5"); // Create a new winmdow frame
   programFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Specifies program exit when the frame is closed
   propgramFrame.setSize(600,400); //Specifies the initial size of the window frame in pixels
   
   //create the container (include FlowLayout)
   
   programPanel = new JPanel1(); create the first panel

add the event listeners (button.addActionListener)

add the components
}

public void actionPerformed(ActionEvent event)
{
add the event handler( if statements and event.getSource should be used here)
}

public static void main (String[] args)
{ Actions eg = new Actions(); }
}