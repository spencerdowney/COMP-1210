/**
* Activity 11.
* @author Spencer Downey - COMP 1210 - section 012.
* @version 4/16/18.
*/
public class Division {

   /**
   * @param num the num.
   * @param denom the denom.
   * @return the num divided by the denom.
   */
   public static int intDivide(int num, int denom) {
   
      try {
         return num / denom;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
   
   /**
   * @param num the num.
   * @param denom the denom.
   * @return result the result.
   */
   public static double decimalDivide(int num, int denom) {
   
      if (denom == 0) {
         throw new IllegalArgumentException("The denominator "
              + "cannot be zero.");
      }
      return ((double) num / (double) denom);
   }
}