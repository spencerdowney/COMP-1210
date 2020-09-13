/**
* Project 4.
* @author Spencer Downey - COMP 1210 - section 012.
* @version 2/7/18.
*/
public class Scores {

   //instance variables.
   private int[] numbers;
   
   /**
   * Constructor.
   * @param numbersIn the numbersIn.
   */
   public Scores(int[] numbersIn) {
   
      numbers = numbersIn;
   }
   /**
   * @return evens the evens.
   */
   public int[] findEvens() {
   
      int numberEvens = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      
      int[] evens = new int[numberEvens];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   
   /**
   * @return odds the odds.
   */
   public int[] findOdds() {
   
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   
   /**
   * @return double the double.
   */
   public double calculateAverage() {
   
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      return ((double) sum / numbers.length);
   }
   
   /**
   * @return result the result.
   */
   public String toString() {
   
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
   
   /**
   * @return result the result.
   */
   public String toStringInReverse() {
   
      String result = "";
      
      for (int i = numbers.length - 1; i > -1; i--) {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
}