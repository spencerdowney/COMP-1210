import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** **/
public class PetBunnyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void gettersTest() {
   
      PetBunny pb = new PetBunny("Floppy", "Holland Lop", 3.5);
      
      Assert.assertEquals("getName test", "Floppy", pb.getName());
      
      Assert.assertEquals("getBreed test", "Holland Lop", pb.getBreed());
      
      Assert.assertEquals("getweight test", 3.5, pb.getWeight(), 0.1);
      
      Assert.assertEquals("getBunnyCount test", 
                              pb.getBunnyCount(), pb.getBunnyCount());
   }
   
   /** test of setter methods. **/
   @Test public void settersTest() {
   
      PetBunny pb = new PetBunny("Floppy", "Holland Lop", 3.5);
      
      pb.setName("Greg");
      pb.setBreed("Dumb");
      pb.setWeight(1);
      Assert.assertEquals("setName test", "Greg", pb.getName());
      
      Assert.assertEquals("setBreed test", "Dumb", pb.getBreed());
      
      Assert.assertEquals("setWeight test", 1, pb.getWeight(), 0.1);
   }
   
   /** test of the monthly cost. **/
   @Test public void monthlyCostTest() {
   
      PetBunny pb = new PetBunny("Floppy", "Holland Lop", 3.5);
      
      Assert.assertEquals("cost test", 6.48, pb.estimatedMonthlyCost(), 0.01);
   }
   
   /** test of toString. **/
   @Test public void toStringTest() {
   
      PetBunny pb = new PetBunny("Floppy", "Holland Lop", 3.5);
      
      String output = "Floppy (PetBunny)   Breed: Holland Lop   Weight: 3.5"
                      + "\nEstimated Monthly Cost: $6.48";
                      
      Assert.assertEquals("toString test", output, pb.toString());
   }
   
   /** test of equals method. **/
   @Test public void equalsTest() {
   
       //Equals method has 4 conditions so we need 5 tests.
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      PetBunny pb2 = new PetBunny("Floppy", "Holland Lop", 3.5);
      Assert.assertEquals("equals test",
                        true, pb1.equals(pb2));
   
       //Test of false if names don't match.
      pb2 = new PetBunny("Greg", "Holland Lop", 3.5);
      Assert.assertEquals("equals false test",
                                   false, pb1.equals(pb2));
       
       //Test of false if breeds don't match.
      pb2 = new PetBunny("Floppy", "dumb", 3.5);
      Assert.assertEquals("equals false test",
                                false, pb1.equals(pb2));
   
       //Test of false if weights don't match.
      pb2 = new PetBunny("Floppy", "Holland Lop", 1);
      Assert.assertEquals("equals false test",
                                false, pb1.equals(pb2));
   
       //Is pb1 equal to a string?
      Assert.assertEquals("equals false test",
                                false, pb1.equals("obj"));
   
       //Test of hashcode.
      Assert.assertEquals("equals false test",
                         0, pb1.hashCode());
      
      //Test of compareTo.                  
      pb2 = new PetBunny("Floppy", "Holland Lop", 3.5);
      Assert.assertEquals("compareTo test", 0, pb1.compareTo(pb2));
   }
   
   
}
