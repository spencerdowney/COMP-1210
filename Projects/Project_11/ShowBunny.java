import java.text.DecimalFormat;
/**
*
*/
public class ShowBunny extends PetBunny {

   private double groomingCost;
   /** @final **/
   public static final double BASE_COST = 2.75;
   
   /**
   * @param nameIn the nameIn.
   * @param breedIn the breedIn.
   * @param weightIn the weightIn.
   * @param groomingCostIn the groomingCostIn.
   * @throws NegativeValueException ok cool.
   */
   public ShowBunny(String nameIn, String breedIn,
                     double weightIn, double groomingCostIn)
                     throws NegativeValueException {
   
      super(nameIn, breedIn, weightIn);
      groomingCost = groomingCostIn;
      if (groomingCost < 0) {
         bunnyCount--;
         throw new NegativeValueException();
      }
   }
   
   /**
   * @return groomingCost the groomingCost.
   */
   public double getGroomingCost() {
   
      return groomingCost;
   }
   
   /**
   * @param groomingCostIn the groomingCostIn.
   */
   public void setGroomingCost(double groomingCostIn) {
   
      groomingCost = groomingCostIn;
   }
   
   /**
   * @return the estimated monthly cost.
   */
   public double estimatedMonthlyCost() {
   
      return BASE_COST * weight + groomingCost;
   }
   
   /**
   * @return the string.
   */
   public String toString() {
   
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      return super.toString() + " (includes " + df.format(groomingCost)
                            + " for grooming)";
   }
}