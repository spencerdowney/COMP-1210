import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


/** */
public class ConicalFrustumList2MenuApp {

   /**
    * @param args Command line arguments (not used).
    * @throws FileNotFoundException if file not found.
    */
   public static void main(String[] args) throws FileNotFoundException {
   
      Scanner userInput = new Scanner(System.in);
      String code = "";
      String fileName = "no file name";
      String listName = "no list name";
      String label;
      double radius1;
      double radius2;
      double height;
      ConicalFrustum[] inputList = new ConicalFrustum[20];
      ConicalFrustumList2 cfList = new ConicalFrustumList2(listName,
                                                                inputList, 0);
      ConicalFrustum cf;
      
      // print codes
      System.out.println("ConicalFrustum List System Menu" 
         + "\nR - Read File and Create ConicalFrustum List"
         + "\nP - Print ConicalFrustum List"
         + "\nS - Print Summary"
         + "\nA - Add ConicalFrustum"
         + "\nD - Delete ConicalFrustum"
         + "\nF - Find ConicalFrustum"
         + "\nE - Edit ConicalFrustum"
         + "\nQ - Quit");
       
       // request code  
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = userInput.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toLowerCase();
         char codeChar = code.charAt(0);
      
         switch(codeChar) {
            case 'r' : // read file
               System.out.print("\tFile name: ");
               fileName = userInput.nextLine();
               Scanner scanFile = new Scanner(new File(fileName));
               cfList = cfList.readFile(fileName);
               System.out.println("\tFile read in and ConicalFrustum List"
                  + " created\n");
               break;
            case 'p': // print list
               System.out.println("\n" + cfList);
               break;
            case 's': // print summary
               System.out.println("\n" + cfList.summaryInfo() + "\n");
               break;
            case 'a': // add conical frustum
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               System.out.print("\tRadius1: ");
               radius1 = Double.parseDouble(userInput.nextLine());
               System.out.print("\tRadius2: ");
               radius2 = Double.parseDouble(userInput.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(userInput.nextLine());
               cfList.addConicalFrustum(label, radius1, radius2, height);
               System.out.println("\t*** ConicalFrustum added ***\n");
               break;
            case 'd': // delete conical frustum
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               cf = cfList.findConicalFrustum(label);
               if (cf != null) {
                  cfList.deleteConicalFrustum(label);
                  System.out.println("\t\"" + cf.getLabel() + "\" deleted\n");
                  break;
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
                  break;
               }
            case 'f': // find conical frustum
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               if (cfList.findConicalFrustum(label) != null) {
                  System.out.println(cfList.findConicalFrustum(label) + "\n");
                  break;
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
                  break;
               }
            case 'e': // edit conical frustum
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               System.out.print("\tRadius1: ");
               radius1 = Double.parseDouble(userInput.nextLine());
               System.out.print("\tRadius2: ");
               radius2 = Double.parseDouble(userInput.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(userInput.nextLine());
               cf = cfList.findConicalFrustum(label);
               if (cfList.editConicalFrustum(label, radius1, radius2, height)) {
                  cfList.editConicalFrustum(cf.getLabel(), radius1, radius2,
                     +height);
                  System.out.println("\t\"" + label
                     + "\" successfully edited\n");
                  break;
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
                  break;
               }
            case 'q': // quit
               break;
            default : // invalid code
               System.out.println("\t*** invalid code ***\n");
         }
      } while (!code.equalsIgnoreCase("q"));
   } 
}