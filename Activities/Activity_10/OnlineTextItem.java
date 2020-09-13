/**
*
*/
public abstract class OnlineTextItem extends InventoryItem {

   /**
   * @param nameIn the nameIn.
   * @param priceIn the priceIn.
   */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   
   /**
   * @return price the price.
   */
   public double calculateCost() {
   
      return price;
   }
}