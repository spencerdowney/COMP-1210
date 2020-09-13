import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** **/
public class CostComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. 
   *  @throws NegativeValueException if odd.
   */
   @Test public void defaultTest() throws NegativeValueException {
      CostComparator c = new CostComparator();
      Bunny b1 = new HouseBunny("Humphrey", "FatBoi", 16.8, 0.5);
      Bunny b2 = new JumpingBunny("Greg", "SmallBoi", 7.5, 10);
      Assert.assertEquals("compare test", 1, c.compare(b1, b2));
      
      b1 = new HouseBunny("Humphrey", "FatBoi", 16.8, 10);
      b2 = new HouseBunny("Humphrey", "FatBoi", 16.8, 11);
      Assert.assertEquals("", -1, c.compare(b1, b2));
      
      b1 = new JumpingBunny("Greg", "SmallBoi", 7.5, 0.5);
      b2 = new JumpingBunny("Greg", "SmallBoi", 7.5, 0.5);
      Assert.assertEquals("", 0, c.compare(b1, b2));
   }
}
