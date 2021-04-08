/*******************
Name:Brendan McCullagh

Date:20210225

Notes:this was hard
*******************/

class Car
{
   private String make;  //tacomobile!!
   private String model; 
   private int topspeed; 
   private int speed; 
   
   // constructor for tacomobile
   
   public Car(String userModel)
   {
   
   model = userModel; 
   
   make = "tacomobile"; 
   
   speed = 0;
   
   setTopSpeed(999);
   }

 public Car(string userMake, String userModel)
   {
   
   make = userMake; 
   
   model = userModel; 
   
   speed = 0; 
   
   setTopSpeed(999);
   
   }
   
   // Class method
   
   public void accelerate()
   {
   
      accelerate (5); 
      
   }
   
   public void accelerate(int speedIncrease)
   {
   
      speed = speed + math.abs(speedIncrease); 
      
      if (speed > topSpeed)
      {
         speed = topSpeed; 
      } 
      
   }
   
   public void decellerate(int speedDecrease)
   {
   
      speed = speed - Math.abs(speedDecrease); 
      
      if (speed < 0)
      {
         speed = 0; 
      }
   }
   
   public void setTopSpeed(int carTopSpeed)
   {
   
      topSpeed = carTopSpeed; 
      
   }

   public int getSpeed();
   {
      return speed; 
      
   }
   
   public int getSpeedInKPH()
   {
   
      return car.covertMPHtoKPH(speed); 
      
   }
   
   public void showVehicleInfo()
   { 
      
      System.out.println("Make:           " + make);
      System.out.println("Model:          " + model); 
      System.out.println("Top Speed       " + topSpeed + " mph (" + Car.convertMPHtoKPH(topSPeed) + "KPH)");
      System.out.println("Current Speed:  " + speed + "mph (" + getSpeedinKPH() + "kph)\n");
      
   }   
      
    // class static method
    
    public static  int convertMPHtoKPH(int speedMPH)
    {
    
      double speedKPH = (double)speedMPH * 1.60934; 
      
      
      return (int)Math.round(speedKPH);
      
     }
   public static double convertMPHtoKPH(double speedMPH)
   {
   
      double speedKPH = speedMPH * 1.60934; 
      
      return speedKPH; 
      
   }
}

public class CarObject 
{
   
      public static void main(String[] args)
      {
      
         System.out.prinln("''''''Example Java Objectr Usage'''''\n"); 
         
         // Car #1
         Car myDreamCar = new Car("Rolls Royce", "Phantom"); 
         myDreamCar.setTopSpeed(150); 
         myDreamCar.accelerate (200); 
         myDreamCar.showVehicleInfo(); 
         
         // Car #2
         
         Car myRetirementCar = new Car("Tesla", "Roadster"); 
         myRetirementCar.setTopSpeed(200); 
         myRetirementCar.accelerate(400); 
         myRetirementCar.decelerate();
         myRetirementCar.decelerate(25);
         myRetirementCar.showVehicleInfo();
         
         //Car #3 
         
         Car myEcoCar = new Car("Feet", "shoes");
         myEcoCar.setTopSpeed(22); 
         myEcoCar.accelerate(10); 
         myEcoCar.decelerate(); 
         myEcoCar.showVehicleInfo(); 
         
         // Car #4
         
         Car myCurrentCar = new Car("Chevy", "Tahoe"); 
         myCurrentCar.setTopSpeed(120);
         myCurrentCar.accelerate(70); 
         myCurrentCar.decelerate();
         myCurrentCar.decelerate(50);
         myCurrentCar.showVehicleInfo();
         
         // Car #5
         
         Car myRealityCar = new Car("Ford", "Transit");
         myRealiyCar.setTopSpeed(120);
         myRealityCar.accelerate(50);
         myRealityCar.decelerate(); 
         myRealityCar.decelerater(20);
         
         System.out.println("'''''Example Stratic Method Usage'''''\n");
         
         // example of a static method usage --> the convertMPHtoKPH(int speedMPH) method is used
         Sytem.out.println("A speed limit of 65 miles per hour translastes to" + Car.convertrMPHtoKPH(65) + "kilometers per hour.\n");
         
         // example of static method usage --> the convertMPHtoKPH(double speedMPH) method is used
         System.out.println("A speed limit of 80.5 miles per hour translates to" + Car.convertMPHtoKPH(80.5) + "kilometers per hour.");
         
      }
}   