/**
*
*/
public class PetBunny extends Bunny {

   /**
   * Variable.
   */
   public static final double BASE_COST = 1.85;
   
   /**
   * @param nameIn the nameIn.
   * @param breedIn the breedIn.
   * @param weightIn the weightIn.
   * @throws NegativeValueException ok cool.
   */
   public PetBunny(String nameIn, String breedIn, double weightIn)
                                    throws NegativeValueException {
   
      super(nameIn, breedIn, weightIn);
   }
   
   /**
   * @return the estimated monthly cost.
   */
   public double estimatedMonthlyCost() {
   
      return BASE_COST * weight;
   }
   
}