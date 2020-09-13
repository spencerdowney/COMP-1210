import java.io.FileNotFoundException;
/** **/
public class BunniesPart3 {

   /**
   * @param args the args.
   * @throws FileNotFoundException out the window.
   */
   public static void main(String[] args) {
   
      BunnyList b = new BunnyList();
      
      try
      {
         if (args.length == 0) {
            System.out.println("*** File name not provided by command "
                               + "line argument. \n Program ending.");
            return;
         }
         b.readBunnyFile(args[0]);
      }
      
      catch (FileNotFoundException e) 
      {
         System.out.println("*** File not found. \nProgram ending.");
      
      }
   
      System.out.println(b.summary()); 
      System.out.println(b.listByName());
      System.out.println(b.listByCost());
      System.out.println(b.excludedRecordsList());
   }
}