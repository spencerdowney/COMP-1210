import java.util.Scanner;
/**
* Class with the purpose of determining the slope
* and x and y intercepts.
*
* Project 2
* @author Spencer Downey - COMP 1210 - section 012
* @version 1/26/18
*/
public class SlopeIntercept
{
   /**
    * Command to print out the slope and intercepts.
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) 
   {
      Scanner userInput = new Scanner(System.in);
      double x1 = 0;
      double x2 = 0;
      double y1 = 0;
      double y2 = 0;
      
      //Prints the first part of the instructions.
      System.out.println("Enter the X and Y coordinates of starting point: ");
      
      //Instructs the user to put in the first x-coordinate.
      System.out.print("\tx1 = ");
      x1 = userInput.nextInt();
      
      //Instructs the user to put in the first y-coordinate.
      System.out.print("\ty1 = ");
      y1 = userInput.nextInt();
      
      //Prints the second part of the instructions.
      System.out.println("Enter the X and Y coordinates of ending point: ");
      
      //Instructs the user to put in the second x-coordinate.
      System.out.print("\tx2 = ");
      x2 = userInput.nextInt();
      
      //Instructs the user to put in the second y-coordinate.
      System.out.print("\ty2 = ");
      y2 = userInput.nextInt();
      
      //Does the math and prints the slope if x1 isn't equal to x2.
      double slope = ((y2 - y1) / (x2 - x1));
      if (x1 == x2) {
         System.out.println("Slope: \"undefined\"");
      }
      else {
         System.out.println("Slope: " + slope);
      
         //Does math and prints the y-intercept.
         double yint = (y1 - (slope * x1));
         System.out.println("Y intercept: " + yint);
      
         //Does math and prints the x-intercept if y1 isn't equal to y2.
         double xint = ((-1) * (yint / slope));
         if (y1 == y2) {
            System.out.println("X intercept: \"undefined\"");
         }
         else {
            System.out.println("X intercept: " + xint);
         }
      }
   }
}