/*******************
Name: brendan mccullagh

Date:20210308

Notes:none
*******************/


import javax.swing.*; 
import java.awt.BorderLayout;


public class LottoWinner
{
  
   public static void main(String[] args)
   {
   
   //Generate an array  of four integers and set them initiallu to zero
   int[] a = new int[] {0,0,0,0};
   
   //Loop through the Lotto number generation
   while (true)
   {
      
      //Generate a random number from 1 to 99
      int n = (int) Math.ceil(Math.random() * 99);
      
      //Assign generated number to array item
      if(a[0] == 0)
      {

         a[0] = n; //Replace zero with Lotto number f0r first array item 
         
     }
    else if (a[1] == 0)
     {
     
        a[1] = n;// replace zero with Lotto number for second array item
        
   }     
   else if (a[2] == 0)
   {
   
      a[2] = n;//Replace zero withj Lotto number for the third array item
   
   }
   else if (a[3] == 0)
   {
   
      a[3] = n; // Replace zero with Lotto number for fourth array item
      
   }
   else
   {
   
      break; // All lotto number have beengenerated, break out of the WHILE loop

      }

   }
   
   //Print out lotto results message 
   System.out.print("Winning Numbers are: ");
   
   //Loop through the array containing the lotto numbers and print to screen
   for(int i = 0; i < 4; i++)
   {  
      
      System.out.print(a[i]); 
      
      if (i < 3)
      {
      
         System.out.print(","); 
   
      }
      
   }
   
   // Invoke GUI-based Lotto results display
   showResultsInGUI(a);
   
   }   
   
   private static void showResultsInGUI(int[] lottoResults)
   {
   
      JFrame lottoResultsFrame = new JFrame ("Lotto Results");
      lottoResultsFrame.setLocation(800,400);
      lottoResultsFrame.setSize(300,100);
      lottoResultsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Specifies program to exit when the frame is closedd
      
      JLabel lottoResultsLabel1 = new JLabel("The Lotto Results are!");
      JLabel lottoResultsLabel2 = new JLabel(lottoResults[0] + "    " + lottoResults[1] + "    " + lottoResults[2] + "    " + lottoResults[3]);
      
      JPanel lottoResultsPanel1 = new JPanel();
      lottoResultsPanel1.add(lottoResultsLabel1); 
      
      JPanel lottoResultsPanel2 = new JPanel();
      lottoResultsPanel2.add(lottoResultsLabel2);
      
      lottoResultsFrame.getContentPane().add(BorderLayout.NORTH, lottoResultsPanel1);
      lottoResultsFrame.getContentPane().add(BorderLayout.SOUTH, lottoResultsPanel2);
      
      lottoResultsFrame.setResizable(false); //Don't allow resizing of the window frame
      lottoResultsFrame.setVisible(true); // Allow the window to be seen

   }

}  