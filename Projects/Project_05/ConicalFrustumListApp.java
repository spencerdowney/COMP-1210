import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
 
/**
* Project 5.
* @author Spencer Downey - COMP 1210 - section 012.
* @version 2/21/18.
*/
public class ConicalFrustumListApp {
   
   /**
   * @param args - not used.
   * @throws FileNotFoundException the FileNotFoundException.
   */
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner scan = new Scanner(System.in);
      
      //Prompt to put in the file name.
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      System.out.print("\n");
      
      //Adds the conical frustums in the file to the array list.
      ArrayList<ConicalFrustum> myList = new ArrayList<ConicalFrustum>();
      Scanner scanFile = new Scanner(new File(fileName));
      String cfListName = scanFile.nextLine();
      
      //Reads the information.
      while (scanFile.hasNext()) {
         String label = scanFile.next();
         double radius1 = scanFile.nextDouble();
         double radius2 = scanFile.nextDouble();
         double height = scanFile.nextDouble();
         
         ConicalFrustum c = new ConicalFrustum(label, radius1,
                                               radius2, height);
         myList.add(c);           
      }
      
      scanFile.close();
      
      ConicalFrustumList myCfList = new ConicalFrustumList(cfListName, myList);
      
      System.out.println(myCfList + "\n");
      
      System.out.println(myCfList.summaryInfo());
   }
}