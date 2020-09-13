import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/** **/
public class BunniesPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   * @throws FileNotFoundException out the window.
   */
   @Test public void defaultTest() throws FileNotFoundException {
      BunniesPart2 bPart2Obj = new BunniesPart2(); // test constructor
      Bunny.resetBunnyCount();
      String[] args = {"bunnies1.txt"};
      BunniesPart2.main(args);
      Assert.assertEquals(4, Bunny.getBunnyCount());
   }
}
