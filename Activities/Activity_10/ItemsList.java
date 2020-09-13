/**
* Activity 10.
* @author Spencer Downey - COMP 1210 - section 012.
* @version 4/9/18.
*/
public class ItemsList {

   private InventoryItem[] inventory;
   private int count;
   
    /** **/
   public ItemsList() {
   
      inventory = new InventoryItem[20];
      count = 0;
   }
    /** @param itemIn the itemIn. **/
   public void addItem(InventoryItem itemIn) {
   
      inventory[count] = itemIn;
      count++;
   }
    
    /** 
    * @param electronicsSurcharge the electronicsSurcharge.
    * @return total the total.
    **/
   public double calculateTotal(double electronicsSurcharge) {
   
      double total = 0;
      for (int i = 0; i < count; i++) {
      
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   
   /** @return output the output. **/
   public String toString() {
   
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      
      return output;
   }
   
   
}