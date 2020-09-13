import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
* Project 5.
* @author Spencer Downey - COMP 1210 - section 012.
* @version 2/21/18.
*/

public class ConicalFrustumList {
   
   //Fields.
   private String listName = "";
   private ArrayList<ConicalFrustum> cfList;
   
   //Constructor
   /**
   * @param listNameIn the listNameIn.
   * @param cfListIn the cfListIn.
   */
   public ConicalFrustumList(String listNameIn, 
                     ArrayList<ConicalFrustum> cfListIn) {
   
      listName = listNameIn;
      cfList = cfListIn;
   }
   
   //GetName method.
   /**
   * @return listName the listName.
   */
   public String getName() 
   {
      return listName;
   }
   
   //NumberOfConicalFrustums method.
   /**
   * @return numOfCfs the numOfCfs.
   */
   public int numberOfConicalFrustums() 
   {
      if (cfList.size() == 0) {
         return 0;
      }
      else {
         return cfList.size();
      }
   }
   
   //TotalSurfaceArea method.
   /**
   * @return totalSA the totalSA.
   */
   public double totalSurfaceArea() 
   {
      double totalSA = 0;
      if (cfList.size() == 0) {
         return 0;
      }
      else {
         int index = 0;
         while (index < cfList.size()) {
            totalSA += cfList.get(index).totalSurfaceArea();
            index++;
         }
         return totalSA;
      }
   }
   
   //TotalVolume method.
   /**
   * @return totalVol the totalVol.
   */
   public double totalVolume() 
   {
      double totalVol = 0;
      if (cfList.size() == 0) {
         return 0;
      }
      else {
         int index = 0;
         while (index < cfList.size()) {
            totalVol += cfList.get(index).volume();
            index++;
         }
         return totalVol;
      }
   }
   
   //AverageSurfaceArea method.
   /**
   * @return aveSA the aveSA.
   */
   public double averageSurfaceArea() 
   {
      double aveSA = 0;
      if (cfList.size() == 0) {
         return 0;
      }
      else {
         int index = 0;
         while (index < cfList.size()) {
            aveSA += (cfList.get(index).totalSurfaceArea() / cfList.size());
            index++;
         }
         return aveSA;
      }
   }
   
   //AverageVolume method.
   /**
   * @return aveVol the aveVol.
   */
   public double averageVolume() 
   {
      double aveVol = 0;
      if (cfList.size() == 0) {
         return 0;
      }
      else {
         int index = 0;
         while (index < cfList.size()) {
            aveVol += (cfList.get(index).volume() / cfList.size());
            index++;
         }
         return aveVol;
      }
   
   }
   
   //toString method.
   /**
   * @return output the output.
   */
   public String toString() 
   {
      int index = 0;
      String output;
      output = listName + "\n"; 
      while (index < cfList.size()) {
         output += "\n" + cfList.get(index).toString() + "\n";
         index++;
      }
      return output;
   }
   
   //summaryInfo method.
   /**
   * @return summary the summary.
   */
   public String summaryInfo() 
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String summary = "----- Summary for " + getName()
         + " -----\nNumber of ConicalFrustum Objects: "
         + numberOfConicalFrustums() + "\nTotal Surface Area: "
         + df.format(totalSurfaceArea()) + "\nTotal Volume: "
         + df.format(totalVolume()) + "\nAverage Surface Area: "
         + df.format(averageSurfaceArea()) + "\nAverage Volume: "
         + df.format(averageVolume()) + "\n";
      return summary;
   }
   
   /**
   * @return cfList the cfList.
   */
   public ArrayList<ConicalFrustum> getList() {
   
      return cfList;
   }
   
   /**
   * @param fileNameIn the fileNameIn.
   * @return cL the cL.
   * @throws FileNotFoundException the FileNotFoundException.
   */
   public ConicalFrustumList readFile(String fileNameIn) 
                                       throws FileNotFoundException {
   
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<ConicalFrustum> myList = new ArrayList<ConicalFrustum>();
      String cListName = "";
      double radius1 = 0, radius2 = 0, height = 0;
      String label = "";
      
      cListName = scanFile.nextLine(); 
           
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         radius1 = Double.parseDouble(scanFile.nextLine());
         radius2 = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         myList.add(new ConicalFrustum(label, 
                                 radius1, radius2, height));          
      }
      scanFile.close();
      
      ConicalFrustumList cL = new ConicalFrustumList(cListName, myList);
      return cL;
   }
   
   /**
   * @param label the label.
   * @param radius1 the radius1.
   * @param radius2 the radius2.
   * @param height the height.
   */
   public void addConicalFrustum(String label, double radius1,
                                           double radius2, double height) {
                                           
      ConicalFrustum c = new ConicalFrustum(label, radius1, radius2, height);
      cfList.add(c);
   }
   
   /**
   * @param labelIn the labelIn.
   * @return result the result.
   */
   public ConicalFrustum findConicalFrustum(String labelIn) {
   
      ConicalFrustum result = null;
      int index = -1;
      for (ConicalFrustum c : cfList) {
         
         if (c.getLabel().equalsIgnoreCase(labelIn)) {
            
            index = cfList.indexOf(c);
            break;
         }
      }
      
      if (index >= 0) {
      
         result = cfList.get(index);
      }
      return result;
   }
   
   /**
   * @param labelIn the labelIn.
   * @return cf the cf.
   */
   public ConicalFrustum deleteConicalFrustum(String labelIn) {
   
      ConicalFrustum cf = null;
      cf = findConicalFrustum(labelIn);
      cfList.remove(cf);
      return cf;
   }
   
   /**
   * @param label the label.
   * @param radius1 the radius1.
   * @param radius2 the radius2.
   * @param height the height. 
   * @return cf the cf.
   */
   public boolean editConicalFrustum(String label,
                      double radius1, double radius2, double height) {
   
      int index = cfList.indexOf(findConicalFrustum(label));
      ConicalFrustum cf = deleteConicalFrustum(label);
      if (cf != null) {
         cfList.add(index, new ConicalFrustum(label, radius1, radius2, height));
         return true;
      }
      else {
         return false;
      }
   }
}