import java.util.*;

public class Array
{
   public static void main(String[] args)
   {
      double[] values = new double[10];
      
      double[] moreValues = {32, 54, 67.5, 29, 35, 55, 45, 34, 22, 33};
      
      System.out.println(moreValues[7]);
      
      int[] scores = {10, 9, 7, 4, 5 };
      int[] valuesTwo = scores;
      
      scores[3] = 10;
      System.out.println(valuesTwo[3]);

         int currentSize = 0;
         Scanner in = new Scanner(System.in);
         while (in.hasNextDouble())
         {
            if (currentSize < values.length)
            {
               values[currentSize] = in.nextDouble();
               currentSize++;
            }
         }      


}
   
   
  
}     