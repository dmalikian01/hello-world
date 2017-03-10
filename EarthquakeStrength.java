import java.util.*;

public class EarthquakeStrength
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a magnitude on the Richter scale: ");
      double richter = in.nextDouble();
      String description = getDescription(richter);
      System.out.println(description);
   }
   
   public static String getDescription(double richter)
   {
      if (richter >= 8.0)
      {
         return "Most structures fall";
      }
      if (richter >= 7.0)
      {
         return "Many buildings destroyed";
      }
      if (richter >= 6.0)
      {
         return "Many buildings considerably damaged, some collapse";
      }
      if (richter >= 4.5)
      {
         return "Damage to poorly constructed buildings";
      }
      return "No destruction of buildings";
   }
   
}                    