import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
*
*/
public class ConicalFrustumList2Test {

   private String file1 = "conical_frustum_data_1.txt";
   
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test of getName. **/
   @Test public void getNameTest() {
      
      ConicalFrustum[] cArray = new ConicalFrustum[20];
      cArray[0] = new ConicalFrustum("cf1", 3, 4, 5);
      cArray[1] = new ConicalFrustum("cf2", 3, 5, 5);
      cArray[2] = new ConicalFrustum("cf3", 3, 3, 3);
      
      ConicalFrustumList2 cList = 
                  new ConicalFrustumList2("Test List", cArray, 3);
      
      Assert.assertEquals("getName Test",
                           "Test List", cList.getName());
   }
   
   /** A test of numberOfConicalFrustums. **/
   @Test public void numberOfConicalFrustumsTest() {
   
      ConicalFrustum[] cArray = new ConicalFrustum[20];
      cArray[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cArray[1] = new ConicalFrustum("Medium", 5.1, 10.2, 15.9);
      cArray[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      
      ConicalFrustumList2 cList = 
               new ConicalFrustumList2("Test List", cArray, 3);
      
      Assert.assertEquals("numberOfConicalFrustums Test",
                           3, cList.numberOfConicalFrustums());
                           
      ConicalFrustumList2 cList2 = 
               new ConicalFrustumList2("Test List", null, 0);
      
      Assert.assertEquals("numberOfConicalFrustums Test",
                           0, cList2.numberOfConicalFrustums());
   }
   
    /** A test of total and average methods. **/
   @Test public void totalAndAverageTest() {
   
      ConicalFrustum[] cArray = new ConicalFrustum[20];
      cArray[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cArray[1] = new ConicalFrustum("Medium", 5.1, 10.2, 15.9);
      cArray[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cList = 
               new ConicalFrustumList2("Test List", cArray, 3);
      
      Assert.assertEquals("totalSurfaceArea test", 407734.026,
                               cList.totalSurfaceArea(), 0.001);
                                    
      Assert.assertEquals("totalVolume test", 18023600.645,
                               cList.totalVolume(), 0.001);
                                    
      Assert.assertEquals("averageSurfaceArea test", 135911.342,
               cList.averageSurfaceArea(), 0.001);                              
   
      Assert.assertEquals("averageVolume test", 6007866.882,
                                    cList.averageVolume(), 0.001);
                                    
      ConicalFrustumList2 cList2 = 
               new ConicalFrustumList2("Test List", null, 0);
               
      Assert.assertEquals("totalSurfaceArea null test", 0,
                               cList2.totalSurfaceArea(), 0.001);
                                    
      Assert.assertEquals("totalVolume null test", 0,
                               cList2.totalVolume(), 0.001);
                                    
      Assert.assertEquals("averageSurfaceArea null test", 0,
              cList2.averageSurfaceArea(), 0.001);                              
   
      Assert.assertEquals("averageVolume null test", 0,
                                    cList2.averageVolume(), 0.001);
   }
   
   /** A test of toString method. **/
   @Test public void toStringTest() {
   
      ConicalFrustum[] cArray = new ConicalFrustum[20];
      cArray[0] = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      cArray[1] = new ConicalFrustum("Medium", 5.1, 10.2, 15.9);
      cArray[2] = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      ConicalFrustumList2 cList = 
               new ConicalFrustumList2("Test List", cArray, 3);
      
      Assert.assertEquals("toString Test",
                           true, 
                           cList.toString().
                    contains("ConicalFrustum \"Small\" with radius1 = 0.5,"
                             + " radius2 = 0.75, and height = 0.25 has:"));
   }
   
   /**
   * A test of summaryInfo method. 
   * @throws FileNotFoundException the FileNotFoundException.
   */
   @Test public void summaryTest() 
                  throws FileNotFoundException {
   
      ConicalFrustum[] cArray = new ConicalFrustum[20];
      ConicalFrustumList2 cList = 
                     new ConicalFrustumList2("listName", cArray, 0);
      cList = cList.readFile(file1);
      
      
      String expected = "----- Summary for Conical Frustum Test List -----"
                        + "\nNumber of ConicalFrustum Objects: 3"
                        + "\nTotal Surface Area: 407,734.026"
                        + "\nTotal Volume: 18,023,600.645"
                        + "\nAverage Surface Area: 135,911.342"
                        + "\nAverage Volume: 6,007,866.882";
      Assert.assertEquals("summaryInfo Test", 
                     expected, cList.summaryInfo());
   }
   
   /** test of getList method. **/
   @Test public void getListTest() {
   
      ConicalFrustum[] cArray = new ConicalFrustum[20];
      ConicalFrustumList2 cList = 
                     new ConicalFrustumList2("listName", cArray, 0);
      Assert.assertArrayEquals(cArray, cList.getList());
   }
   
   /** 
   * test of readFile method. 
   * @throws FileNotFoundException the FileNotFoundException.
   */
   @Test public void readFileTest() 
                     throws FileNotFoundException {
   
      ConicalFrustum[] cArray = new ConicalFrustum[20];
      ConicalFrustumList2 cList = 
                     new ConicalFrustumList2("listName", cArray, 0);
      cList = cList.readFile(file1);
      Assert.assertEquals("readFile test",
                           "Conical Frustum Test List", 
                           cList.getName());
   }
   
   /** 
   * test of addConicalFrustum method. 
   * @throws FileNotFoundException the FileNotFoundException.
   */
   @Test public void addConicalFrustumTest() 
                     throws FileNotFoundException {
   
      ConicalFrustum[] cArray = new ConicalFrustum[20];
      ConicalFrustumList2 cList = 
                     new ConicalFrustumList2("listName", cArray, 0);
      cList = cList.readFile(file1);
      
      ConicalFrustum c = new ConicalFrustum("George", 7, 7, 7);
      cList.addConicalFrustum("George", 7, 7, 7);
      ConicalFrustum[] cA = cList.getList();
         
      Assert.assertEquals("addConicalFrustum Test",
                           c, cA[3]);
   }
   
   /** 
   * test of findConicalFrustum method. 
   * @throws FileNotFoundException the FileNotFoundException.
   */
   @Test public void findConicalFrustumTest() 
                     throws FileNotFoundException {
   
      ConicalFrustum[] cArray = new ConicalFrustum[20];
      ConicalFrustumList2 cList = 
                     new ConicalFrustumList2("listName", cArray, 0);
      cList = cList.readFile(file1);
      
      ConicalFrustum c = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
               
      Assert.assertEquals("findConicalFrustum test", 
                     c, cList.findConicalFrustum("Small"));
                     
      Assert.assertEquals("findConicalFrustum test", 
                     null, cList.findConicalFrustum("Charlie"));
   }
   
   /** 
   * test of deleteConicalFrustum method. 
   * @throws FileNotFoundException the FileNotFoundException.
   */
   @Test public void deleteConicalFrustumTest1() 
                     throws FileNotFoundException {
   
      ConicalFrustum[] cArray = new ConicalFrustum[20];
      ConicalFrustumList2 cList = 
                     new ConicalFrustumList2("listName", cArray, 0);
      cList = cList.readFile(file1);
      Assert.assertEquals(null, cList.deleteConicalFrustum("wow"));  
   }

   /** 
   * test of deleteConicalFrustum method. 
   * @throws FileNotFoundException the FileNotFoundException.
   */
   @Test public void deleteConicalFrustumTest2() 
                     throws FileNotFoundException {
   
      ConicalFrustum[] cArray = new ConicalFrustum[20];
      ConicalFrustumList2 cList = 
                     new ConicalFrustumList2("listName", cArray, 0);
      cList = cList.readFile(file1);
      ConicalFrustum c = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      Assert.assertEquals(c, cList.deleteConicalFrustum("small"));
   }

   /** 
   * test of editConicalFrustum method. 
   * @throws FileNotFoundException the FileNotFoundException.
   */
   @Test public void editConicalFrustumTest1() 
                     throws FileNotFoundException {
   
      ConicalFrustum[] cArray = new ConicalFrustum[20];
      ConicalFrustumList2 cList = 
                     new ConicalFrustumList2("listName", cArray, 0);
      cList = cList.readFile(file1);
      Assert.assertFalse(cList.editConicalFrustum("gregory", 1, 2, 3));
   }
   
   /** 
   * test of editConicalFrustum method. 
   * @throws FileNotFoundException the FileNotFoundException.
   */
   @Test public void editConicalFrustumTest2() 
                     throws FileNotFoundException {
   
      ConicalFrustum[] cArray = new ConicalFrustum[20];
      ConicalFrustumList2 cList = 
                     new ConicalFrustumList2("listName", cArray, 0);
      cList = cList.readFile(file1);
      Assert.assertTrue(cList.editConicalFrustum("small", 0.5, 0.75, 0.25));
   }
   
   /** 
   * test of least and greatest methods. 
   * @throws FileNotFoundException the FileNotFoundException.
   */
   @Test public void leastAndGreatestTest() 
                     throws FileNotFoundException {
   
      ConicalFrustum[] cArray = new ConicalFrustum[20];
      ConicalFrustumList2 cList = 
                     new ConicalFrustumList2("listName", cArray, 0);
      cList = cList.readFile(file1);
      ConicalFrustum c1 = new ConicalFrustum("Small", 0.5, 0.75, 0.25);
      ConicalFrustum c2 = new ConicalFrustum("Medium", 5.1, 10.2, 15.9);
      ConicalFrustum c3 = new ConicalFrustum("Large", 98.32, 199.0, 250.0);
      
      Assert.assertEquals("least height test", c1,
                     cList.findConicalFrustumWithLeastHeight());
      
      Assert.assertEquals("greatest height test", c3,
                     cList.findConicalFrustumWithGreatestHeight());
      
      Assert.assertEquals("least volume test", c1,
                     cList.findConicalFrustumWithLeastVolume());
      
      Assert.assertEquals("greatest volume test", c3,
                     cList.findConicalFrustumWithGreatestVolume());
                     
      ConicalFrustumList2 cList2 = 
                     new ConicalFrustumList2("listName", null, 0);
                     
      Assert.assertEquals("least height null test", null,
                     cList2.findConicalFrustumWithLeastHeight());
      
      Assert.assertEquals("greatest height null test", null,
                     cList2.findConicalFrustumWithGreatestHeight());
      
      Assert.assertEquals("least volume null test", null,
                     cList2.findConicalFrustumWithLeastVolume());
      
      Assert.assertEquals("greatest volume null test", null,
                     cList2.findConicalFrustumWithGreatestVolume());
   }
}
