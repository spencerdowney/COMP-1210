import java.util.Scanner;

/**
* Project 4.
* @author Spencer Downey - COMP 1210 - section 012.
* @version 2/7/18.
*/

public class ConicalFrustumApp
{

   /**
   * Command to print out the string.
   * @param args Command line arguments - not used.
   */
   public static void main(String[] args)
   {
      
      //Variables and other stuff.
      Scanner userInput = new Scanner(System.in);
      String label;
      double radius1;
      double radius2;
      double height;
      
      //Prints out instruction.
      System.out.println("Enter label, radius1, radius2, "
         + "and height for a conical frustum.");
        
      //Prints out the label.   
      System.out.print("\tlabel: ");
      label = userInput.nextLine();
      
      //prints out radius 1 depending on the input.
      System.out.print("\tradius1: ");
      radius1 = userInput.nextDouble();
      if (radius1 < 0) {
         System.out.print("Error: radius1 must be non-negative.");
         return;
      }
   
      //Prints out radius 2 depending on the input.
      System.out.print("\tradius2: ");
      radius2 = userInput.nextDouble();
      if (radius2 < 0) {
         System.out.print("Error: radius2 must be non-negative.");
         return;
      }
      
      //Prints out the height
      System.out.print("\theight: ");
      height = userInput.nextDouble();
      
      //Prints out the end of the message
      if (height < 0) {
         System.out.print("Error: height must be non-negative.");
         return;
      }
      ConicalFrustum cf = new ConicalFrustum(label, radius1, radius2, height);
      System.out.print(cf.toString());
   }
}
