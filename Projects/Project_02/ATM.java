import java.util.Scanner;
/**
* Class with the purpose of printing the amount 
* and type of bills required to reach a certain amount.
*
* Project 2
* @author Spencer Downey - COMP 1210 - section 012
* @version 1/24/18
*/
public class ATM
{
   /**
   * Command to print out various calculations based
   * on amounts entered in manually.
   *@param args Command line arguments - not used.
   */
   public static void main(String[] args) 
   {
      Scanner userInput = new Scanner(System.in);
      int amount = 0;
      
      //Prompt the user for the amount to be dispensed
      System.out.print("Enter the amount: ");
      amount = userInput.nextInt();
      
      if (amount < 300) {
      
         //command to print out a phrase
         System.out.println("Bills by denomination: ");
         
         //command to print out the number of twenties
         int twenties = (amount / 20);
         System.out.println("\t$20: " 
            + (twenties));
            
         //command to print out the number of tens
         int tens = ((amount - (20 * (twenties))) / 10);
         System.out.println("\t$10: " 
            + ((tens))); 
            
         //command to print out the number of fives
         int fives = ((amount - ((20 * (twenties)) + (10 * (tens)))) / 5);
         System.out.println("\t$5: " 
            + ((fives)));
         
         //command to print out the number of ones
         int ones = ((amount - ((20 * (twenties)) + (10 * (tens)) 
            + +(5 * (fives)))));
         System.out.println("\t$1: " + (ones));
         
         //command to print out the math
         System.out.println("$" + amount + " = (" + twenties + " * $20) + "
            + "(" + tens + " * $10) + (" + fives + " * $5)"
            + " + (" + ones + " * $1)");
      }
      else {
         //command to show you're past the limit
         System.out.println("Limit of $300 exceeded!");
      }
   }
}