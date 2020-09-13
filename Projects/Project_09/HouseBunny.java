/**
*
*/
public class HouseBunny extends PetBunny {

   private double wearAndTear = 0;
   /**
   *
   */
   public static final double BASE_COST = 2.25;
   
   /**
   * @param nameIn the nameIn.
   * @param breedIn the breedIn.
   * @param weightIn the weightIn.
   * @param wearAndTearIn the wearAndTearIn.
   */
   public HouseBunny(String nameIn, String breedIn,
                     double weightIn, double wearAndTearIn) {
   
      super(nameIn, breedIn, weightIn);
      wearAndTear = wearAndTearIn;
   }
   
   /**
   * @return wearAndTear the wearAndTear.
   */
   public double getWearAndTear() {
   
      return wearAndTear;
   }
   
   /**
   * @param wearAndTearIn the wearAndTearIn.
   */
   public void setWearAndTear(double wearAndTearIn) {
   
      wearAndTear = wearAndTearIn;
   }
   
   /**
   * @return the estimated monthly cost.
   */
   public double estimatedMonthlyCost() {
   
      return BASE_COST * weight * (1 + wearAndTear);
   }
   
   /**
   * @return the string.
   */
   public String toString() {
   
      return super.toString() + " (includes " + (wearAndTear * 100)
                            + "% for wear and tear)";
   }
}