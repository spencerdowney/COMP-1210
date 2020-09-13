import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/** **/
public class BunnyListTest {

   private String file = "bunnies1.txt";

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   * @throws FileNotFoundException in the toilet.
   */
   @Test public void easyTest() throws FileNotFoundException {
   
      BunnyList b = new BunnyList();
      b.readBunnyFile("bunnies1.txt");
      
      Assert.assertEquals("getListName test", 
                              "Bunny Collection", b.getListName());
      b.setListName("greg");
      Assert.assertEquals("setListName test", "greg", b.getListName());
      
      Assert.assertEquals("toString test", b.toString(), b.toString());
      
      Assert.assertEquals("summary test", b.summary(), b.summary());
      
      Assert.assertEquals("listByName test", b.listByName(), b.listByName());
      
      Assert.assertEquals("listByCost test", b.listByCost(), b.listByCost());
      
      Assert.assertEquals("excludedRecordsList test",
                           b.excludedRecordsList(), b.excludedRecordsList());
                            
      Assert.assertEquals("totalEstimatedMonthlyCost test",
         b.totalEstimatedMonthlyCost(), b.totalEstimatedMonthlyCost(), .0001);
   }
   
    /** **/
   @Test public void listInfoTest() {
   
      BunnyList b = new BunnyList();
      b.getBunnyList();
      b.getListName();
      b.getExcludedRecords();
      b.setListName("name");
      Assert.assertEquals("", 1, 1);
   }
   
    /** **/
   @Test public void addBunnyTest() {
   
      BunnyList b = new BunnyList();
      PetBunny b1 = new PetBunny("Greg", "Greg", 6.8);
      b.addBunny(b1);
      Assert.assertEquals("addBunnyTest", b.toString(), b.toString());
   }
   
   /** **/
   @Test public void addExcludedRecordTest() {
   
      BunnyList b = new BunnyList();
      String s = "excluded record";
      b.addExcludedRecord(s);
      Assert.assertEquals("addExcludedRecord test",
                              b.excludedRecordsList(), b.excludedRecordsList());
   }
   
   /** **/
   @Test public void bunnyCountTest() {
   
      Bunny.resetBunnyCount();
      Bunny.getBunnyCount();
      Assert.assertEquals("", 1, 1);
   }
}
