

public class AreaOfRectangle
{
   public static void main(String[] args)
   {
      double result1 = areaOfRectangle(1,4);
      
      
      System.out.println("Area " +result1);
      System.out.println();
      
      
   }
      

/**
   Computes the area of a rectangle
   @param length the length
   @param width the width
   @return the area
*/

      public static double areaOfRectangle(double length, double width)
      {
         if (length <=0 || width <=0) {return 0;}
         
         double area = length * width;
         
         System.out.print( "L " + length +" ");
         System.out.print("W " + width + " ");
         return area;
         
  
      }   
}