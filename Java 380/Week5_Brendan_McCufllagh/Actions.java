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
   private JPanel programPanel2;
   
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
   programFrame.setSize(600,400); //Specifies the initial size of the window frame in pixels
   
   //create the container (include FlowLayout)
   
   programPanel1 = new JPanel(); //create the first panel
   programPanel2 = new JPanel(); //Create the second panel
   
   programButton1 = new JButton("Button1"); // Create Button 1
   programButton2 = new JButton("Button2"); // Create Button 2
   programButton3 = new JButton("Button3"); // Create Button 3
   programButton4 = new JButton("Button4"); // Create Button 4
   programButton5 = new JButton("Button5"); // Create Button 5
  
  programTextField = new JTextField("None of the buttons have been pressed yet !!"); //create the text field
  programTextField.setHorizontalAlignment(JTextField.CENTER); //set center alignment for text field

   //add the event listeners (button.addActionListener)
   
   programButton1.addActionListener(this); // links the button with the ActionListener --> "this" refers to this object's actionperformed method
   programButton2.addActionListener(this); // links the button with the ActionListener --> "this" refers to this object's actionperformed method
   programButton3.addActionListener(this); // links the button with the ActionListener --> "this" refers to this object's actionperformed method
   programButton4.addActionListener(this); // links the button with the ActionListener --> "this" refers to this object's actionperformed method
   programButton5.addActionListener(this); // links the button with the ActionListener --> "this" refers to this object's actionperformed method

   //add the components
   
   programPanel1.add(programButton1); //add Button 1 to the first panel
   programPanel1.add(programButton2); //add Button 2 to the first panel
   programPanel1.add(programButton3); //add Button 3 to the first panel
   programPanel1.add(programButton4); //add Button 4 to the first panel
   programPanel1.add(programButton5); //add Button 5 to the first panel
   
   programPanel2.add(programTextField); //add the text are to the second panel
   
   programFrame.getContentPane().add(BorderLayout.NORTH, programPanel1); //Add the first panel to the top of the window frame
   programFrame.getContentPane().add(BorderLayout.SOUTH, programPanel2); //Add the second panel to the bottom of the window frame
   
   programFrame.pack(); // Remove spaces between GUI components
   programFrame.setResizable(false); //Don't allow resizing of the window frame
   programFrame.setVisible(true); // Allow the window frame to be seen

 }


 public void actionPerformed(ActionEvent event)
 {

   // add the event handler( if statements and event.getSource should be used here)
   if (event.getSource() == programButton1)
   {
   
      programTextField.setText("Button 1 was pressed !!");
      
   }
   else if (event.getSource() == programButton2)
   {
      
      programTextField.setText("Button 2 was pressed !!");
    
    }
    else if (event.getSource() == programButton3)
    {

      programTextField.setText("Button 3 was pressed!!"); 
 
   }
   else if (event.getSource() == programButton4)
   {
   
      programTextField.setText("Button 4 was pressed !!");
      
   }
   else
   {
   
      programTextField.setText("Button 5 was pressed !!");
      
   }
   
 }
 
}