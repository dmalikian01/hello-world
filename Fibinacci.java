import java.util.*;

public class Fibinacci
{
   public static void main(String[] args)
   {
      for ( int i = 1; i < 17; i++)
      {
         System.out.println(fib(i));
      }
   }  

public static int fib(int n)
{
   if ( n == 0 )
   {
      return 0;
   }
   
   else if ( n == 1 )
   {
      return 1;
   }
      
   else 
   {
      return fib(n-1) + (n-2);
   }
}   
}
            