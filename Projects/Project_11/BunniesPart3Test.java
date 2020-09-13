import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/** **/
public class BunniesPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   * @throws FileNotFoundException out the window.
   */
   @Test public void defaultTest() throws FileNotFoundException {
      BunniesPart3 bPart3Obj = new BunniesPart3(); // test constructor
      Bunny.resetBunnyCount();
      String[] args = {"bunnies2.txt"};
      BunniesPart3.main(args);
      Assert.assertEquals(4, Bunny.getBunnyCount());
   }
   
   /**
   * @throws FileNotFoundException out the window.
   */
   @Test public void argsTest() throws FileNotFoundException {
      BunniesPart3 bPart3Obj = new BunniesPart3(); // test constructor
      Bunny.resetBunnyCount();
      String[] args = {};
      BunniesPart3.main(args);
      Assert.assertEquals(0, Bunny.getBunnyCount());
   }
}
