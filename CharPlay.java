public class CharPlay
{
   public static void main(String[] args)
   {
      String name = "Harry";
      char start = name.charAt(0);
      char last = name.charAt(4);
      
      System.out.print(start);
      System.out.print(last);
      System.out.println();
      
      String greeting = "Hello, world";
      String sub = greeting.substring(0,5);
      String sub2 = greeting.substring(7,12);
      String tail = greeting.substring(7);
      String all = greeting.substring(0);
         System.out.println(sub);
         System.out.println(sub2);
         System.out.println(tail);
         System.out.println(all);
      
   }   
}      