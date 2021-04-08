/*******************
Name:Brendan McCullagh

Date:20210323

Notes:Thank you
*******************/

//EmployeeDriver.java


class EmployeeDriver
{

   public static void main(String args[])
   {
   
      Employee[] emp = new Employee[3];
      
      for (int i=0; i<3; i++)
      {
      
         emp[i] = new Employee();
         
      }
      
      for (int i=0; i<3; i++)
      {
      
         System.out.println(" Enter details of Employee #" + (i+1)); 
         
         emp[i].GetData();
         
      }
      
      System.out.println("Details of Employees");
      
      for (int i=0; i<3; i++)
      {
      
         emp[i]. PutData();
         
      }
      
   }
    
}