import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** **/
public class ShowBunnyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. 
   *  @throws NegativeValueException if odd.
   */
   @Test public void gettersTest() throws NegativeValueException {
   
      ShowBunny sb = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);
      
      Assert.assertEquals("getName test", "Bigun", sb.getName());
      
      Assert.assertEquals("getBreed test", "Flemish Giant", sb.getBreed());
      
      Assert.assertEquals("getweight test", 14.6, sb.getWeight(), 0.1);
      
      Assert.assertEquals("getGroomingCost test", 
                              22.0, sb.getGroomingCost(), 0.01);
      
      Assert.assertEquals("getBunnyCount test", 
                              sb.getBunnyCount(), sb.getBunnyCount());
   }
   
   /** test of setter methods. 
   *  @throws NegativeValueException if odd.
   */
   @Test public void settersTest() throws NegativeValueException {
   
      ShowBunny sb = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);
      
      sb.setName("Greg");
      sb.setBreed("Dumb");
      sb.setWeight(1);
      sb.setGroomingCost(8);
      Assert.assertEquals("setName test", "Greg", sb.getName());
      
      Assert.assertEquals("setBreed test", "Dumb", sb.getBreed());
      
      Assert.assertEquals("setWeight test", 1, sb.getWeight(), 0.1);
      
      Assert.assertEquals("setGroomingCost test", 
                                    8, sb.getGroomingCost(), 0.01);
   }
   
   /** test of the monthly cost. 
   *  @throws NegativeValueException if odd.
   */
   @Test public void monthlyCostTest() throws NegativeValueException {
   
      ShowBunny sb = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);
      
      Assert.assertEquals("cost test", 62.15, sb.estimatedMonthlyCost(), 0.01);
   }
   
   /** test of toString. 
   *  @throws NegativeValueException if odd.
   */
   @Test public void toStringTest() throws NegativeValueException {
   
      ShowBunny sb = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);
      
      String output = "Bigun (ShowBunny)   Breed: Flemish Giant   Weight: 14.6"
                      + "\nEstimated Monthly Cost: $62.15"
                      + " (includes $22.00 for grooming)";
                      
      Assert.assertEquals("toString test", output, sb.toString());
   }
   
   /** test of equals method. 
   *  @throws NegativeValueException if odd.
   */
   @Test public void equalsTest() throws NegativeValueException {
   
       //Equals method has 4 conditions so we need 5 tests.
      ShowBunny sb1 = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);
      ShowBunny sb2 = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);
      Assert.assertEquals("equals test",
                        true, sb1.equals(sb2));
   
       //Test of false if names don't match.
      sb2 = new ShowBunny("greg", "Flemish Giant", 14.6, 22.0);
      Assert.assertEquals("equals false test",
                                   false, sb1.equals(sb2));
       
       //Test of false if breeds don't match.
      sb2 = new ShowBunny("Bigun", "dumb", 14.6, 25.0);
      Assert.assertEquals("equals false test",
                                false, sb1.equals(sb2));
   
       //Test of false if weights don't match.
      sb2 = new ShowBunny("Bigun", "English", 2, 22.0);
      Assert.assertEquals("equals false test",
                                false, sb1.equals(sb2));
   
       //Is sb1 equal to a string?
      Assert.assertEquals("equals false test",
                                false, sb1.equals("obj"));
   
       //Test of hashcode.
      Assert.assertEquals("equals false test",
                         0, sb1.hashCode());
      
      //Test of compareTo.                  
      sb2 = new ShowBunny("Bigun", "English", 14.6, 25.0);
      Assert.assertEquals("compareTo test", 0, sb1.compareTo(sb2));
   }
   
   
}
