public class Clock
{
   private int hours;
   private int minutes;
   
   public Clock (int hr, int min)
   {
      hours = hr;
      minutes = min;
   }
   
   public void setHours(int hr)
   {
      hours = hr;
   }
   
   public void setMinutes(int min)
   {
      minutes = min;
   }
   
   public int getHours()
   {
      return hours;
   }
   
   public int getMinutes()
   {
      return minutes;
   }
   
   public void printAmPm()
   {
      int hours , minutes;
      String ampm;
      
      if(getHours() > 12)
      {
         hours = getHours() - 12;
         ampm = "P.M ";
      }
      else
      {
         hours = getHours();
         ampm = "A.M ";
      }
      System.out.println("The time is: " + hours + ":" + getMinutes() + " " + ampm);
   }
   public String toString()
   {
      return ("hours: " + hours + " minutes: " + minutes);
   }
}                              