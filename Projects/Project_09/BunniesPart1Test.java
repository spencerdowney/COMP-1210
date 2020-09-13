import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** **/
public class BunniesPart1Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void defaultTest() {
      BunniesPart1 vp1 = new BunniesPart1();
      Bunny.resetBunnyCount();
      BunniesPart1.main(null);
      Assert.assertEquals("Bunny.BunnyCount should be 4. ", 
                                4, Bunny.getBunnyCount());
   }
}
