import java.util.*;

public class Sorting
{
   public static void main(String[] args)
   {
      int[] values = {2, 8, 5, 6, 1, 100};
      
      System.out.println(Arrays.toString(values));
      
      Arrays.sort(values);
      
      int searchedValue = 6;
      
      boolean found = false;
      int low = 0; 
      int pos = 0;
      int high = values.length - 1;
      
      while (low <= high && !found)
      {
         pos = (low + high) / 2;
         
         if (values[pos] == searchedValue)
         {
            found = true;
         }
         else if (values[pos] < searchedValue)
         {
            low = pos + 1;
         }   
         else 
         {
            high = pos - 1;
         }
      }
      if (found)
            System.out.println("Found at position " + pos);
      else
            System.out.println("Not found.");
     }
  }          
         
        
               
      