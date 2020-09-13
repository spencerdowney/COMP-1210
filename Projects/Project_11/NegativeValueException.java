
/**
* Project 11.
* @author Spencer Downey - COMP 1210 - section 012.
* @version 4/18/18.
*/
public class NegativeValueException extends Exception {

   /** **/
   public NegativeValueException() {
   
      super("Numeric values must be nonnegative");
   }
}