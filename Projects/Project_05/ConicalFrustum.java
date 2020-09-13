import java.text.DecimalFormat;

/**
* Project 4.
* @author Spencer Downey - COMP 1210 - section 012.
* @version 2/7/18.
*/

public class ConicalFrustum {
   // variables
   private String label = "";
   private double radius1 = 0;
   private double radius2 = 0;
   private double height = 0;
   
   /**
   * This is the constructor for the class.
   * @param labelIn the label.
   * @param radius1In the radius1.
   * @param radius2In the radius2.
   * @param heightIn the height.
   */
   public ConicalFrustum(String labelIn, double radius1In,
       double radius2In, double heightIn) {
       
      setLabel(labelIn);
      setRadius1(radius1In);
      setRadius2(radius2In);
      setHeight(heightIn);
   }
   
   /**
   * @return label.
   */
   public String getLabel() {
   
      return label;
   }
   
   /**
   * Sets the label.
   * @param labelIn the label.
   * @return labelIn the label.
   */
   public boolean setLabel(String labelIn)
   {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   * @return radius1.
   */
   public double getRadius1()
   {
      return radius1;
   }
   
   /**
   * Sets a vallue to radius1.
   * @param radius1In Command line arguments - not used.
   * @return radiusIn.
   */
   public boolean setRadius1(double radius1In)
   {
      if (radius1In > 0)
      {
         radius1 = radius1In;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   * Gets Radius 2.
   * @return radius2.
   */
   public double getRadius2()
   {
      return radius2;
   }
   
   /**
   * Sets radius 2.
   * @param radius2In the radius2.
   * @return radius2In.
   */
   public boolean setRadius2(double radius2In)
   {
      if (radius2In > 0) 
      {
         radius2 = radius2In;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   * @return height.
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
   * @param heightIn the heightIn.
   * @return heigntIn.
   */
   public boolean setHeight(double heightIn)
   {
      if (heightIn < 0) 
      {
         return false;
      }
      else {
         height = heightIn;
         return true;
      }
   }
   
   /**
   * @return volume.
   * Determines the volume.
   */
   public double volume()
   {
      double vol = ((Math.PI * height) / 3) * (Math.pow(radius1, 2)
         + Math.pow(radius2, 2) + (radius1 * radius2));
      return vol;
   }
   
   /**
   * Determines the slantHeight.
   * @return  slantH.
   */
   public double slantHeight()
   {
      double slantH = Math.sqrt(Math.pow((radius1 - radius2), 2)
         + Math.pow(height, 2));
      return slantH;
   }
   
   /**
   * Determines the lateral surface area.
   * @return lateralSA.
   */
   public double lateralSurfaceArea()
   {
      double lateralSA = Math.PI * (radius1 + radius2) * slantHeight();
      return lateralSA;
   }
   
   /**
   * Determines the total surface area.
   * @return TSA.
   */
   public double totalSurfaceArea()
   {
      double totalSA = Math.PI * (Math.pow(radius1, 2) 
         + Math.pow(radius2, 2) + (radius1 + radius2) * slantHeight());
      return totalSA;
   }
   
   /**
   * Strings everything together.
   * @return output.
   */
   public String toString()
   {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      String output = "ConicalFrustum \"" + label + "\" with radius1 = " 
         + fmt.format(radius1) + ", radius2 = " + fmt.format(radius2) 
         + ", and height = " + fmt.format(height) + " has:\n";
      output += "\tvolume = " + fmt.format(volume()) + " cubic units\n";
      output += "\tslant height = " + fmt.format(slantHeight()) + " units\n";
      output += "\tlateral surface area = " 
         + fmt.format(lateralSurfaceArea()) + " units\n";
      output += "\ttotal surface area = " 
         + fmt.format(totalSurfaceArea()) + " square units";
      return output;
   }
}