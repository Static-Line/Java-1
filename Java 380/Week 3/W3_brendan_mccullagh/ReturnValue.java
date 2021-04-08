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
   public static String sub(String aMessage)
   {
      String newMessage = aMessage + " are delicious"; 
      return newMessage; 
   }
}