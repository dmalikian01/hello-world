import java.util.*;

public class Palindrome
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter a Palindrome: ");
         
         String s = in.next();
         
         boolean poly = true;
         
         for (int i = 0, j = s.length()-1; i <= j; i++, j--)
         
            if(s.charAt(i) != s.charAt(j))
            {
               poly = false;
               break;
            }
            
            if (poly)
            {
               System.out.println("Palindrome");
            }
            else
            {
               System.out.println("Not Palindrome");
            }
         
      }
   }         
                     
      
     