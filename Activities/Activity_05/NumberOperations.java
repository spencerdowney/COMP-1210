/**
* Activity 5.
* @author Spencer Downey - COMP 1210 - section 012.
* @version 2/19/18.
*/

public class NumberOperations 
{
   private int number;
   
   /**
   * Constructor.
   * @param numberIn the numberIn;
   */
   public NumberOperations(int numberIn) 
   {
      number = numberIn;
   }

   /**
   *  @return number the number.
   */
   public int getValue()
   {
      return number;
   }

   /**
   * @return output the output.
   */
   public String oddsUnder()
   {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;   
      }
      return output;
   }

   /**
   *  @return output the output.
   */
   public String powersTwoUnder()
   {
      String output = "";
      int powers = 1;
      while (powers < number) {
         
         output += powers + "\t"; // concatenate to output
         powers = powers * 2; // get next power of 2
      }
      return output;
   }

   /**
   * @param compareNumber the compareNumber.
   * @return isGreater the isGreater.
   */
   public int isGreater(int compareNumber)
   {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }

   /**
   * @return toString the toString.
   */
   public String toString()
   {
      return number + "";
   }
}