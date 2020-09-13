import java.text.DecimalFormat;

/**
* Project 9.
* @author Spencer Downey - COMP 1210 - section 012.
* @version 4/4/18.
*/
public abstract class Bunny {

   //Variables
   protected String name;
   protected String breed;
   protected double weight;
   protected static int bunnyCount;
   
   /**
   * @param nameIn the nameIn.
   * @param breedIn the breedIn.
   * @param weightIn the weightIn.
   */
   public Bunny(String nameIn, String breedIn, double weightIn) {
   
      name = nameIn;
      breed = breedIn;
      weight = weightIn;
      bunnyCount++;
   }
   
   /**
   * @return name the name.
   */
   public String getName() {
   
      return name;
   }
   
   /**
   * @param nameIn the nameIn.
   */
   public void setName(String nameIn) {
   
      name = nameIn;
   }
   
   /**
   * @return breed the breed.
   */
   public String getBreed() {
   
      return breed;
   }
   
   /**
   * @param breedIn the breedIn.
   */
   public void setBreed(String breedIn) {
   
      breed = breedIn;
   }
   
   /**
   * @return weight the weight.
   */
   public double getWeight() {
   
      return weight;
   }
   
   /**
   * @param weightIn the weightIn.
   */
   public void setWeight(double weightIn) {
   
      weight = weightIn;
   }
   
   /**
   * @return bunnyCount the bunnyCount.
   */
   public static int getBunnyCount() {
   
      return bunnyCount;
   }
   
   /**
   * Sets bunnyCount equal to 0.
   */
   public static void resetBunnyCount() {
   
      bunnyCount = 0;
   }
   
   /**
   * @return the estimated monthly cost.
   */
   public abstract double estimatedMonthlyCost();
   
   /**
   * @return output the output.
   */
   public String toString() {
   
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      String output = getName() + " (" + this.getClass().getName() + ")   "
                    + "Breed: " + getBreed() + "   Weight: " + getWeight()
                    + "\nEstimated Monthly Cost: " 
                    + df.format(estimatedMonthlyCost());
      return output;
   }
   
   /**
   * @param obj the obj.
   * @return true or false.
   */
   public boolean equals(Object obj) {
   
      if (!(obj instanceof Bunny)) {
         return false;
      }
      else {
         Bunny b = (Bunny) obj;
         return (name.equalsIgnoreCase(b.getName())
               && breed.equalsIgnoreCase(b.getBreed())
               && Math.abs(weight - b.getWeight()) < .000001);
      }
   }
   
   /**
   * @return 0 the 0.
   */
   public int hashCode() {
      return 0;
   }
   
   /**
   * @param b the b.
   * @return 0 the 0.
   */
   public int compareTo(Bunny b) {
   
      int result = this.name.compareTo(b.name);
      return result;
   }
   
}