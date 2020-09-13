import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
   
/**
* Project 6.
* @author Spencer Downey - COMP 1210 - section 012.
* @version 2/28/18.
*/

public class ConicalFrustumListMenu {

   /**
   * 
   * @param args - is not used.
   * @throws FileNotFoundException if the file cannot be opened.
   */
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner scan = new Scanner(System.in);
      String listName = "no list name assigned";
      String fileName = "no file name";
      String code = "";
      String label;
      double r1, r2, h; 
      ArrayList<ConicalFrustum> myList = new ArrayList<ConicalFrustum>();
      ConicalFrustumList cl = new ConicalFrustumList(listName, myList);
      ConicalFrustum cf;
      
   
      System.out.println("ConicalFrustum List System Menu\n"
                       + "R - Read File and Create ConicalFrustum List\n"
                       + "P - Print ConicalFrustum List\n" 
                       + "S - Print Summary\n"
                       + "A - Add ConicalFrustum\n"   
                       + "D - Delete ConicalFrustum\n"   
                       + "F - Find ConicalFrustum\n"
                       + "E - Edit ConicalFrustum\n"
                       + "Q - Quit");
                       
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toLowerCase();
         char codeChar = code.charAt(0);
         
         switch(codeChar) {
            case 'r': // Read in File and Create ConicalFrustumList
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
               Scanner scanFile = new Scanner(new File(fileName));
               cl = cl.readFile(fileName);
               System.out.println("\tFile read in and "
                              + "ConicalFrustum List created\n");
               break; 
                    
            case 'p': // Print TriangleList
               System.out.print("\n" + cl + "\n");
               break;
               
            case 's': // Print Summary
               System.out.print("\n" + cl.summaryInfo() + "\n");
               break;
               
            case 'a': // Add conical frustum
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tRadius1: ");
               r1 = Double.parseDouble(scan.nextLine());
               System.out.print("\tRadius2: ");
               r2 = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               h = Double.parseDouble(scan.nextLine());
            
               cl.addConicalFrustum(label, r1, r2, h);
               System.out.println("\t*** ConicalFrustum added ***\n");
               break;
         
            case 'd': // Delete Conical Frustum Object
               System.out.print("\tLabel: ");
               label = scan.nextLine();
            
               if (cl.deleteConicalFrustum(label) != null) {
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;   
               
            case 'f': //Find Conical Frustum Object
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (cl.findConicalFrustum(label) != null) {
                  System.out.println(cl.findConicalFrustum(label) + "\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'e': // Edit Conical Frustum
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               System.out.print("\tRadius1: ");
               r1 = Double.parseDouble(scan.nextLine());
               System.out.print("\tRadius2: ");
               r2 = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               h = Double.parseDouble(scan.nextLine());
               
               if (cl.findConicalFrustum(label) != null) {
                  System.out.println("\t\"" + label 
                              + "\" successfully edited\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
            
            case 'q': // Quit
               break;
               
            default:  // no match, loop again
               System.out.println("\t*** invalid code ***\n");
               break; 
         }
      
      } while (!code.equalsIgnoreCase("Q"));   
      
   }
}
   
