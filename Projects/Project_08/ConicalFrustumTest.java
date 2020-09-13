import org.junit.Assert; 	
 //import static org.junit.Assert.*; 	
import org.junit.Before;	
import org.junit.Test;
 
 /**	
 * 	
 */ 	
public class ConicalFrustumTest {  	
  	
    /** Fixture initialization (common initialization	
     *  for all tests). **/	
   @Before public void setUp() {  	
   }
 	
    /** A test of getters, setters, and methods that return big numbers. **/
   @Test public void defaultTest() {
   
      ConicalFrustum c = new ConicalFrustum("Frustum", 0.5, 0.75, 0.25);
       
      Assert.assertEquals("getLabel test", "Frustum", c.getLabel());
       
      Assert.assertEquals("getRadius1 test", 0.5, c.getRadius1(), 0.000001);
       
      Assert.assertEquals("getRadius2 test", 0.75, c.getRadius2(), 0.000001);
       
      Assert.assertEquals("getHeight test", 0.25, c.getHeight(), 0.000001);
       
      Assert.assertEquals("volume test", 0.311,
                                    c.volume(), 0.001);
                                    
      Assert.assertEquals("slantHeight test", 0.354,
                                    c.slantHeight(), 0.001);	
                                    
      Assert.assertEquals("lateralSurfaceArea test", 1.388,
                                    c.lateralSurfaceArea(), 0.001);
                                    
      Assert.assertEquals("totalSurfaceArea test", 3.941,
                                    c.totalSurfaceArea(), 0.001);	
   }
    	
     /** Test of setter methods. **/
   @Test public void settersTest() {	
      ConicalFrustum c = new ConicalFrustum("Frustum", 0.5, 0.75, 0.25);
     	
       //setLabel method test.
      Assert.assertEquals("setLabel test", true, c.setLabel("Frustum"));
      Assert.assertEquals("setLabel false test", false, c.setLabel(null));
   
       //setRadius1 method test.
      Assert.assertEquals("setRadius1 test", true, c.setRadius1(0.5));
      Assert.assertEquals("setRadius1 false test", false, c.setRadius1(-0.5));
   
       //setRadius2 method test.
      Assert.assertEquals("setRadius2 test", true, c.setRadius2(0.75));
      Assert.assertEquals("setRadius2 false test", false, c.setRadius2(-0.75));
       
       //setHeight method test.
      Assert.assertEquals("setHeight test", true, c.setHeight(0.25));
      Assert.assertEquals("setHeight false test", false, c.setHeight(-0.25));	
   }
    
     /** test of toString method. **/
   @Test public void toStringTest() {
   
      ConicalFrustum c = new ConicalFrustum("Frustum", 0.5, 0.75, 0.25);
      Assert.assertEquals("toString test", "ConicalFrustum "
                            + "\"Frustum\" with radius1 = 0.5, " 	
                            + "radius2 = 0.75, and height = 0.25 has:\n"
                            + "\tvolume = 0.311 cubic units\n"	
                            + "\tslant height = 0.354 units\n"	  	
                            + "\tlateral surface area = 1.388 units\n"
                            + "\ttotal surface area = 3.941 square units",
                              c.toString());
   }
    
    /** test of equals method. **/
   @Test public void equalsTest() {
   
       //Equals method has 5 conditions so we need 6 tests.
      ConicalFrustum c1 = new ConicalFrustum("Frustum", 0.5, 0.75, 0.25);
      ConicalFrustum c2 = new ConicalFrustum("Frustum", 0.5, 0.75, 0.25);
      Assert.assertEquals("equals test",
                        true, c1.equals(c2));
   
       //Test of false if labels don't match.
      c2 = new ConicalFrustum("ConicalFrustum", 0.5, 0.75, 0.25);
      Assert.assertEquals("equals false test",
                                   false, c1.equals(c2));
       
       //Test of false if radius1's don't match.
      c2 = new ConicalFrustum("Frustum", 8, 0.75, 0.25);
      Assert.assertEquals("equals false test",
                                false, c1.equals(c2));
   
       //Test of false if radius2's don't match.
      c2 = new ConicalFrustum("Frustum", 0.5, 8, 0.25);
      Assert.assertEquals("equals false test",
                                false, c1.equals(c2));
   
       //Test of false if heights don't match.
      c2 = new ConicalFrustum("Frustum", 0.5, 0.75, 8);
      Assert.assertEquals("equals false test",
                                false, c1.equals(c2));
   
       //Is c1 equal to a string?
      Assert.assertEquals("equals false test",
                                false, c1.equals("obj"));
   
       //Test of hashcode.
      Assert.assertEquals("equals false test",
                         0, c1.hashCode());
   }
   
   /** Test of count methods. **/
   @Test public void countTest() {
   
      ConicalFrustum c = new ConicalFrustum("Frustum", 0.5, 0.75, 0.25);
      Assert.assertEquals("getCount test", c.getCount(), c.getCount());
      c.resetCount();
      Assert.assertEquals("resetCount test", 0, c.getCount());
   }
 	
}