import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** **/
public class HouseBunnyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. 
   *   @throws NegativeValueException if odd.
   */
   @Test public void gettersTest() throws NegativeValueException {
   
      HouseBunny hb = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      
      Assert.assertEquals("getName test", "Spot", hb.getName());
      
      Assert.assertEquals("getBreed test", "Really Mixed", hb.getBreed());
      
      Assert.assertEquals("getweight test", 5.8, hb.getWeight(), 0.1);
      
      Assert.assertEquals("getWearAndTear test", 
                              0.15, hb.getWearAndTear(), 0.01);
      
      Assert.assertEquals("getBunnyCount test", 
                              hb.getBunnyCount(), hb.getBunnyCount());
   }
   
   /** test of setter methods. 
   *  @throws NegativeValueException if odd.
   */
   @Test public void settersTest() throws NegativeValueException {
   
      HouseBunny hb = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      
      hb.setName("Greg");
      hb.setBreed("Dumb");
      hb.setWeight(1);
      hb.setWearAndTear(8);
      Assert.assertEquals("setName test", "Greg", hb.getName());
      
      Assert.assertEquals("setBreed test", "Dumb", hb.getBreed());
      
      Assert.assertEquals("setWeight test", 1, hb.getWeight(), 0.1);
      
      Assert.assertEquals("getweight test", 8, hb.getWearAndTear(), 0.01);
   }
   
   /** test of the monthly cost. 
   *  @throws NegativeValueException if odd.
   */
   @Test public void monthlyCostTest() throws NegativeValueException {
   
      HouseBunny hb = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      
      Assert.assertEquals("cost test", 15.01, hb.estimatedMonthlyCost(), 0.01);
   }
   
   /** test of toString. 
   *  @throws NegativeValueException if odd.
   */
   @Test public void toStringTest() throws NegativeValueException {
   
      HouseBunny hb = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      
      String output = "Spot (HouseBunny)   Breed: Really Mixed   Weight: 5.8"
                      + "\nEstimated Monthly Cost: $15.01"
                      + " (includes 15.0% for wear and tear)";
                      
      Assert.assertEquals("toString test", output, hb.toString());
   }
   
   /** test of equals method. 
   *  @throws NegativeValueException if odd.
   */
   @Test public void equalsTest() throws NegativeValueException {
   
       //Equals method has 4 conditions so we need 5 tests.
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      HouseBunny hb2 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      Assert.assertEquals("equals test",
                        true, hb1.equals(hb2));
   
       //Test of false if names don't match.
      hb2 = new HouseBunny("greg", "Really Mixed", 5.8, 0.15);
      Assert.assertEquals("equals false test",
                                   false, hb1.equals(hb2));
       
       //Test of false if breeds don't match.
      hb2 = new HouseBunny("Spot", "dumb", 5.8, 0.15);
      Assert.assertEquals("equals false test",
                                false, hb1.equals(hb2));
   
       //Test of false if weights don't match.
      hb2 = new HouseBunny("Spot", "Really Mixed", 2, 0.15);
      Assert.assertEquals("equals false test",
                                false, hb1.equals(hb2));
   
       //Is hb1 equal to a string?
      Assert.assertEquals("equals false test",
                                false, hb1.equals("obj"));
   
       //Test of hashcode.
      Assert.assertEquals("equals false test",
                         0, hb1.hashCode());
      
      //Test of compareTo.                  
      hb2 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      Assert.assertEquals("compareTo test", 0, hb1.compareTo(hb2));
   }
   
   
}
