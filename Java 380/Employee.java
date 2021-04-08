/*******************
Name:Brendan McCullagh

Date:20210323

Notes:Thank you
*******************/

//Employee.java

import java.util.Scanner;

class Employee
{

   private int employeeID;
   private String employeeName;
   private int employeeAge;
   private float employeeSalary; 
   
   // Thios gets Employee Data
   public void GetData()
   {
   
      Scanner sc = new Scanner(System.in); 
      
      System.out.println();
      
      System.out.print("Enter Employee Id: ");
      employeeID = sc.nextInt();
      sc.nextLine();    // Need this to consume the new line character after the integer entry
      
      System.out.print("Enter Employee Name: ");
      employeeName = sc.nextLine();
      
      System.out.print("Enter Employee Age: ");
      employeeAge = sc.nextInt();
      
      System.out.print(" Enter Employee Salary: ");
      employeeSalary = sc.nextFloat();
      
      System.out.println();
      
   }
   
   //Output Employee Data
   public void PutData()
   {
   
      System.out.printf("%-10s %-25s %-5s %-10", employeeID, employeeName, employeeAge, employeeSalary);
      
   }
   
}