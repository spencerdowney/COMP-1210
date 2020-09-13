import java.util.Scanner;
import java.text.DecimalFormat;

/**
* Class with the purpose of evaluating an expression.
*
* Project 3
* @author Spencer Downey - COMP 1210 - section 012
* @version 1/31/18
*/

public class ExpressionEvaluator
{
   /**
   * Command to evaluate the expression.
   * @param args Command line arguments - not used.
   */

   public static void main(String[] args) 
   {
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      
      //Prompts the user to enter a value for x
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      //Doubles for the actual equation
      double xIntOne = (Math.pow(x, 10));
      double abs = Math.abs((10.4 * xIntOne) - x + 1);
      double sqrt = Math.sqrt(abs);
      double xIntTwo = Math.pow(x, 4);
      double xIntThree = Math.pow(x, 2);
      double result = ((sqrt) / ((3.5 * xIntTwo) + (2.5 * xIntThree) 
         + +(1.5 * x) + 0.5));
      
      //Prints result
      System.out.println("Result: "
         + result);
         
      //Ints and command for printing out digits on the left side   
      String string = Double.toString(result);   
      int period = string.indexOf(".");
      int length = string.length();
      String leftSide = string.substring(0, period);
      System.out.println("# digits to left of decimal point: "
         + leftSide.length());
       
      //String and command for printing out digits on right side   
      String rightSide = string.substring(period + 1, length);
      System.out.println("# digits to right of decimal point: "
         + rightSide.length());   
         
      DecimalFormat df = new DecimalFormat("#,##0.0####");
      System.out.println("Formatted Result: "
         + df.format(result));
   }
}