public class CashRegisterDemo
{
   public static void main(String[] args)
   {
      CashRegister register1 = new CashRegister();
      register1.addItem(0.90);
      register1.addItem(0.95);
      register1.addItem(5.45);
      
      CashRegister register2 = new CashRegister();
      register2.addItem(1.90);
      
      double result = register1.getTotal();
      int total = register1.getCount();
      
      double result2 = register2.getTotal();
      int total2 = register2.getCount();
     
      System.out.printf("%.2f", result);
      System.out.println();
      System.out.println(total);
      System.out.printf("%.2f", result2);
      System.out.println();
      System.out.println(total2);
      
      register1.clear();
      System.out.println(register1.getCount());
      System.out.println("Expected: 0");
      System.out.printf("%.2f\n" , register1.getTotal());
      System.out.println("Expected: 0.00");
      
      
  
      
      
   }
}      