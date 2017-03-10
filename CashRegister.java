public class CashRegister
{
   private int itemCount;
   private double totalPrice;
   
   public void addItem(double price)
   {
      itemCount++;
      totalPrice = totalPrice + price;
   }
   
   public double getTotal()
   {
      return totalPrice;
   }
   
   public int getCount()
   {
      return itemCount;
   }
   
   public int getDollars()
   {
      int dollars = (int) totalPrice;
      return dollars;
   }   
   
   public void clear()
   {
      itemCount = 0;
      totalPrice = 0;
   }
}               