/**
* Activity 9.
* @author Spencer Downey - COMP 1210 - section 012.
* @version 4/2/18.
*/
public class InventoryItem {

   //Variables.
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   /**
   * @param nameIn the nameIn.
   * @param priceIn the priceIn.
   */
   public InventoryItem(String nameIn, double priceIn) {
   
      name = nameIn;
      price = priceIn;
   }
   
   /**
   * @return name the name.
   */
   public String getName() {
   
      return name;
   }
   
   /**
   * @return price including tax.
   */
   public double calculateCost() {
   
      return (price * (1 + taxRate));
   }
   
   /**
   * @param taxRateIn the taxRateIn.
   */
   public static void setTaxRate(double taxRateIn) {
   
      taxRate = taxRateIn;
   }
   
   /**
   * @return the string with the information.
   */
   public String toString() {
   
      return name + ": $" + calculateCost();
   }
}