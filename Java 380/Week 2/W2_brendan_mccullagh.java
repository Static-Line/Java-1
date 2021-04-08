/*******************
  Name:Brendan McCullagh

  Date:20210213

 Notes: Tacos  
*******************/

import java.util.Scanner;

// This tells CMD line to import scaner

class WhileLoopWithBreak {

   public static void main(String[] args) {
   
      int n;
   
      Scanner input = new Scanner(System.in);
    
   
      while (true) {
      
         System.out.print("Please enter a number:");
      
         n = input.nextInt();
      
         if (n != 0) 
         
         // program will run until 0 is sselected
         {
         
            continue;
         
         }
         
         else {
            System.out.print("You entered 0... now exiting program!");
         
            break;
         
         }
      
      }
   
   }

}