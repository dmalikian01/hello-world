public class Cubes
{

   public static double cubeVolume(double sideLength)
   
   {
      double volume = sideLength * sideLength * sideLength;
      return volume;
   }
   
   public static void main(String[] args)
   {
     
   double result1 = cubeVolume(2);
   double result2 = cubeVolume(10);
   System.out.println(result1);
   System.out.println(result2);
   
   }   
   
   
}   
   
         