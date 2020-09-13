import java.util.Comparator;
/** **/
public class CostComparator implements Comparator<Bunny> {
         
   /**
   * @param b1 the b1.
   * @param b2 the b2.
   * @return a number based on cost.
   */
   public int compare(Bunny b1, Bunny b2) {
   
      if (b1.estimatedMonthlyCost() < b2.estimatedMonthlyCost()) {
         return -1;
      }
      else if (b1.estimatedMonthlyCost() > b2.estimatedMonthlyCost()) {
         return 1;
      }
      else {
         return 0;
      }
   }
}