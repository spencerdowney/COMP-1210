/**
* Activity 9.
* @author Spencer Downey - COMP 1210 - section 012.
* @version 4/2/18.
*/
public class ElectronicsItem extends InventoryItem {

   //Variables.
   protected double weight;
   /**
   *
   */
   public static final double SHIPPING_COST = 1.5;
   
   /**
   * @param nameIn the nameIn.
   * @param priceIn the priceIn.
   * @param weightIn the weightIn.
   */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
   
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
   /**
   * @return the calculated cost.
   */
   public double calculateCost() {
   
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}