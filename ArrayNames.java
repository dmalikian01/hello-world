import java.util.*;

public class ArrayNames
{
   public static void main(String[] args)
   {
      String[] names = new String[5];
      
      int[] scores = new int[5];
      
      
      Scanner in = new Scanner(System.in);
      
      System.out.println("Type five names and scores seperated by space ");
      for (int i = 0; i < 5; i++)
      {
         names[i] = in.next();
         scores[i] = in.nextInt();
      
         System.out.println(names[i] + "\t" + scores[i]);
      }
      
      int largest = scores[0];
         for (int i = 1; i < scores.length; i++)
         {
            if (scores[i] > largest)
            {
               largest = scores[i];
            }
              
         }
         System.out.println(largest);
     }
}         

              
         
         
