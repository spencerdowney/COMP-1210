import java.io.FileNotFoundException;
/** **/
public class BunniesPart2 {

   /**
   * @param args the args.
   * @throws FileNotFoundException out the window.
   */
   public static void main(String[] args) throws FileNotFoundException {
   
      BunnyList b = new BunnyList();
      
      b.readBunnyFile(args[0]);
      System.out.println(b.summary()); 
      System.out.println(b.listByName());
      System.out.println(b.listByCost());
      System.out.println(b.excludedRecordsList());
   }
}