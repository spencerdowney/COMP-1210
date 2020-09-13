import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** **/
public class NegativeValueExceptionTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** **/
   @Test public void negativeValueExceptionTest() { 
      boolean thrown = false;
      try {
         HouseBunny hb = new HouseBunny("Spot", "Mixed", 8, -0.08); 
      }
      catch (NegativeValueException e) 
      {
         thrown = true;
      }
      Assert.assertTrue("Expected NegativeValueException to be thrown.",
         thrown); /* or alternatively: */
      Assert.assertEquals("Expected NegativeValueException to be thrown.",
                            true, thrown);
   }
}
