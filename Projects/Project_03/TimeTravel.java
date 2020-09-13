import java.util.Scanner;
import java.text.DecimalFormat;

/**
* Class with the purpose of traveling through time.
*
* Project 3
* @author Spencer Downey - COMP 1210 - section 012
* @version 1/31/18
*/

public class TimeTravel
{
   /**
   * Command that prints out all our information.
   * @param args Command line arguments - not used.
   */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String ticketCodeInput = "";
      double ticketCode = 0;
      
      //Prints prompt to enter the ticket code
      System.out.print("Enter ticket code: ");
      ticketCodeInput = userInput.nextLine();
      ticketCodeInput = ticketCodeInput.trim();
      
      System.out.println();
      
      double codeLength = ticketCodeInput.length();
      
      if (codeLength >= 26)
      {
         //Strings and command necessary to print the time.
         String time1 = ticketCodeInput.substring(0, 2);
         String time2 = ticketCodeInput.substring(2, 4);
         System.out.print("Time: " + time1 + ":" + time2);
         
         //Strings and command necessary to print the date.
         String date1 = ticketCodeInput.substring(4, 6);
         String date2 = ticketCodeInput.substring(6, 8);
         String date3 = ticketCodeInput.substring(8, 12);
         System.out.print("   Date: " + date1 + "/" + date2 + "/" + date3);
         
         //Strings and command necessary to pring the seat.
         String seat = ticketCodeInput.substring(22, 25);
         System.out.println("   Seat: " + seat);
         
         //Strings and command for printing the itenerary.
         String itinerary = 
            ticketCodeInput.substring(25, ticketCodeInput.length());
         System.out.println("Itinerary: " 
            + itinerary);
         
         //Strings and command for printing out the price
         String price = ticketCodeInput.substring(13, 20);
         double ticketPrice = Double.parseDouble(price);
         DecimalFormat fmt1 = new DecimalFormat("$###,###.00");
         System.out.print("Price: " + fmt1.format(ticketPrice));
         
         //If-else statement to determine discount.
         char discountSymbol = ticketCodeInput.charAt(12);
         double discount = 0;
         
         if (discountSymbol == ('s'))
         {
            discount = .50;
         }
         else if (discountSymbol == ('e'))
         {
            discount = .25;
         }
         else 
         {
            discount = 0;
         }
         
         //Command to print out cost.
         double cost = (ticketPrice - (ticketPrice * discount));
         System.out.print("   Cost: " + fmt1.format(cost));
         
         //Command to print out category
         System.out.println("   Category: " + discountSymbol);
         
         //Command to print out prize number
         DecimalFormat fmt2 = new DecimalFormat("0000");
         int prizeNumber = (int) (Math.random() * 9999);
         System.out.print("Prize Number: " + fmt2.format(prizeNumber));
      } 
      else
      {
         System.out.println("*** Invalid ticket code ***");
         System.out.println("Ticket code must have at least 26 characters.");
      }
   }
}