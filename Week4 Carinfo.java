/*******************
Name:Brendan McCullagh

Date:20210225

Notes:
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
   
   set TopSpeed (999); 
   }

 public car(string userMake, String userModel)
   {
   
   make = userMake; 
   
   model = userModel; 
   
   speed = 0; 
   
   setTopSpeed;
   
   }
   
   // Class method
   
   public void accelerate()
   {
   
      accelerate (5); 
      
   }
   
   public void accelerate(int speedIncrease)
   {
   
      speed - speed + math.abs(speedIncrease); 
      
      if (spoeed > topSpeed)
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

   public int getSpeed()
   
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
      System.out.println("Top Speed       " + topSpeed + " mph(" car.convertMPHtoKPH(topSPeed) + "KPH)");
      System.out.println("Current Speed:  " + speed + "mph(" + getSpeedinKPH() + "kph)\n");
      
   }   
      
    // class static method
    
    public static  int convertMPHtoKPH(int speedMPH)
    {
    
      double speedKPH = (double)speedMPH * 1.60934; 
      
      return speed KPH; 
      
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
         
         Car myEcoCar = new ("Feet", "shoes");
         myEcoCar.setTopSpeed(22); 
         myEcoCar.accelerate(10); 
         myEcoCar.decelerate(); 
         myEcoCar.showVehicleInfo(); 
         
         // Car #4
         
         Car myCurrentCar = new car("Chevy", "Tahoe"); 
         myCurrentCar.setTopSpeed(120);
         myCurrentCar.accelerate(70); 
         myCurrentCar.decelerate();
         myCurrentCar.decelerate(50);
         myCurrentCar.showVehicleInfo(); 