/*******************
Name:Brendan McCullagh

Date:20210215

Notes:
*******************/

public class ReturnValue
{
   public static void main(String[] args)
   {
      String myName = "Tacos";
      String myMessage = sub(myName);
      System.out.println (myMessage); 
   }
   // This method returns a string with a message
   public static String sub(String aMessage)
   {
   // addition to previous message which adds n    
      String newMessage = aMessage + " are delicious"; 
      return newMessage; 
   }
}