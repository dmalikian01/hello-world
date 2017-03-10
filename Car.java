public class Car
{
   private double fuelEfficiency;
   private double gasLevel;
   public static String model = "GPC Sports";
   
   public Car(double fuelEfficiency)
   {
      this.fuelEfficiency = fuelEfficiency;
      gasLevel = 0;
   }
   
   public void addGas(double gas)
   {
      this.gasLevel = gasLevel + gas;
   }
   
   public void drive(double distance)
   {
      gasLevel -= distance / fuelEfficiency;
   }
   
   public double getGasLevel()
   {
      return gasLevel;
   }
   
   public static void addYear(int year)
   {
      int y = year;
      
      
   }   
   
   public static void main(String[] args)
   {  
       
      System.out.println(Car.model);
      Car [] TaxiCom = new Car[2];
        
      Car myHybrid = new Car(50);  // 50 miles per gallon
      Car yourHybrid = new Car(25);
      TaxiCom[0] = myHybrid;
      TaxiCom[1] = yourHybrid;
      
      
      myHybrid.addGas(20); // tank 20 gallons      
      myHybrid.drive(100); // drive 100 miles
      
      yourHybrid.addGas(20);
      yourHybrid.drive(100);
      
      System.out.println(TaxiCom[0].getGasLevel()); // print fuel remaining
      System.out.println(TaxiCom[1].getGasLevel());
      System.out.println(TaxiCom[0].model);
   }
}                  
      