import java.util.ArrayList;

/**
* Activity 6.
* @author Spencer Downey - COMP 1210 - section 012.
* @version 2/26/18.
*/

public class Temperatures {

   //Instance Variables.
   private ArrayList<Integer> temperatures;
   
   /**
   * Constructor.
   * @param temperaturesIn the temperaturesIn.
   */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
   
      temperatures = temperaturesIn;
   }
   
   //Methods.
   
   /**
   * @return low the low.
   */
   public int getLowTemp() {
      
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   
   
   /**
   * @return high the high.
   */
   public int getHighTemp() {
   
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
   
   /**
   * @param lowIn the lowIn.
   * @return lowIn the lowIn.
   */
   public int lowerMinimum(int lowIn) {
   
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
   /**
   * @param highIn the highIn.
   * @return highIn the highIn.
   */
   public int higherMaximum(int highIn) {
   
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
   /**
   * @return string the string.
   */
   public String toString() {
   
      
      return "\tTemperatures: " + temperatures
           + "\n\tLow: " + getLowTemp()
           + "\n\tHigh: " + getHighTemp();
   }
   

}