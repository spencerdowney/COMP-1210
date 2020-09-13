import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** **/
public class JumpingBunnyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. 
   *  @throws NegativeValueException if odd.
   */
   @Test public void gettersTest() throws NegativeValueException {
   
      JumpingBunny jb = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      
      Assert.assertEquals("getName test", "Speedy", jb.getName());
      
      Assert.assertEquals("getBreed test", "English", jb.getBreed());
      
      Assert.assertEquals("getweight test", 6.3, jb.getWeight(), 0.1);
      
      Assert.assertEquals("getTrainingCost test", 
                              25.0, jb.getTrainingCost(), 0.01);
      
      Assert.assertEquals("getBunnyCount test", 
                              jb.getBunnyCount(), jb.getBunnyCount());
   }
   
   /** test of setter methods. 
   *  @throws NegativeValueException if odd.
   */
   @Test public void settersTest() throws NegativeValueException {
   
      JumpingBunny jb = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      
      jb.setName("Greg");
      jb.setBreed("Dumb");
      jb.setWeight(1);
      jb.setTrainingCost(8);
      Assert.assertEquals("setName test", "Greg", jb.getName());
      
      Assert.assertEquals("setBreed test", "Dumb", jb.getBreed());
      
      Assert.assertEquals("setWeight test", 1, jb.getWeight(), 0.1);
      
      Assert.assertEquals("setTrainingCost test", 
                                    8, jb.getTrainingCost(), 0.01);
   }
   
   /** test of the monthly cost. 
   *  @throws NegativeValueException if odd.
   */
   @Test public void monthlyCostTest() throws NegativeValueException {
   
      JumpingBunny jb = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      
      Assert.assertEquals("cost test", 40.75, jb.estimatedMonthlyCost(), 0.01);
   }
   
   /** test of toString. 
   *  @throws NegativeValueException if odd.
   */
   @Test public void toStringTest() throws NegativeValueException {
   
      JumpingBunny jb = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      
      String output = "Speedy (JumpingBunny)   Breed: English   Weight: 6.3"
                      + "\nEstimated Monthly Cost: $40.75"
                      + " (includes $25.00 for training)";
                      
      Assert.assertEquals("toString test", output, jb.toString());
   }
   
   /** test of equals method. 
   *  @throws NegativeValueException if odd.
   */
   @Test public void equalsTest() throws NegativeValueException {
   
       //Equals method has 4 conditions so we need 5 tests.
      JumpingBunny jb1 = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      JumpingBunny jb2 = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      Assert.assertEquals("equals test",
                        true, jb1.equals(jb2));
   
       //Test of false if names don't match.
      jb2 = new JumpingBunny("greg", "Really Mixed", 6.3, 0.15);
      Assert.assertEquals("equals false test",
                                   false, jb1.equals(jb2));
       
       //Test of false if breeds don't match.
      jb2 = new JumpingBunny("Speedy", "dumb", 6.3, 25.0);
      Assert.assertEquals("equals false test",
                                false, jb1.equals(jb2));
   
       //Test of false if weights don't match.
      jb2 = new JumpingBunny("Speedy", "English", 2, 0.15);
      Assert.assertEquals("equals false test",
                                false, jb1.equals(jb2));
   
       //Is jb1 equal to a string?
      Assert.assertEquals("equals false test",
                                false, jb1.equals("obj"));
   
       //Test of hashcode.
      Assert.assertEquals("equals false test",
                         0, jb1.hashCode());
      
      //Test of compareTo.                  
      jb2 = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      Assert.assertEquals("compareTo test", 0, jb1.compareTo(jb2));
   }
   
   
}
