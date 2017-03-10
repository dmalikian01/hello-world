public class ArrayPrimes
{
   public static void main(String[] args)
   {
      int[] primes = {2, 3, 5, 7, 11};
      
      for (int i = 0; i < 2; i++)
      {
         primes[4-i] = primes[i];
         
         System.out.println(primes[i]);
      }
   }
}         