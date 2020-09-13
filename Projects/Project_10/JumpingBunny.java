import java.text.DecimalFormat;

/**
*
*/
public class JumpingBunny extends PetBunny {

   private double trainingCost;
   /**
   *
   */
   public static final double BASE_COST = 2.50;
   
   /**
   * @param nameIn the nameIn.
   * @param breedIn the breedIn.
   * @param weightIn the weightIn.
   * @param trainingCostIn the trainingCostIn.
   */
   public JumpingBunny(String nameIn, String breedIn,
                     double weightIn, double trainingCostIn) {
   
      super(nameIn, breedIn, weightIn);
      trainingCost = trainingCostIn;
   }
   
   /**
   * @return wearAndTear the wearAndTear.
   */
   public double getTrainingCost() {
   
      return trainingCost;
   }
   
   /**
   * @param trainingCostIn the trainingCostIn.
   */
   public void setTrainingCost(double trainingCostIn) {
   
      trainingCost = trainingCostIn;
   }
   
   /**
   * @return the estimated monthly cost.
   */
   public double estimatedMonthlyCost() {
   
      return BASE_COST * weight + trainingCost;
   }
   
   /**
   * @return the string.
   */
   
   public String toString() {
   
      DecimalFormat df = new DecimalFormat("$#,###0.00");
      return super.toString() + " (includes " + df.format(trainingCost)
                            + " for training)";
   }
}