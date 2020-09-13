import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
* Project 7.
* @author Spencer Downey - COMP 1210 - section 012.
* @version 3/7/18.
*/

public class ConicalFrustumList2 {
   
   //Fields.
   private String listName = "";
   private ConicalFrustum[] cfList;
   private int elements;
   
   //Constructor
   /**
   * @param listNameIn the listNameIn.
   * @param cfListIn the cfListIn.
   * @param elementsIn the elementsIn.
   */
   public ConicalFrustumList2(String listNameIn, 
                     ConicalFrustum[] cfListIn, int elementsIn) {
   
      listName = listNameIn;
      cfList = cfListIn;
      elements = elementsIn;
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
      if (elements == 0) {
         return 0;
      }
      else {
         return elements;
      }
   }
   
   //TotalSurfaceArea method.
   /**
   * @return totalSA the totalSA.
   */
   public double totalSurfaceArea() 
   {
      double totalSA = 0;
      if (elements == 0) {
         return 0;
      }
      else {
         int i = 0;
         while (i < elements) {
            totalSA += cfList[i].totalSurfaceArea();
            i++;
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
      if (elements == 0) {
         return 0;
      }
      else {
         int i = 0;
         while (i < elements) {
            totalVol += cfList[i].volume();
            i++;
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
      if (elements == 0) {
         return 0;
      }
      else {
         int i = 0;
         while (i < elements) {
            aveSA += (cfList[i].totalSurfaceArea() / elements);
            i++;
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
      if (elements == 0) {
         return 0;
      }
      else {
         int i = 0;
         while (i < elements) {
            aveVol += (cfList[i].volume() / elements);
            i++;
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
      int i = 0;
      String output;
      output = listName + "\n"; 
      while (i < elements) {
         output += "\n" + cfList[i].toString() + "\n";
         i++;
      }
      return output;
   }
   
   //summaryInfo method.
   /**
   * @return result the result.
   */
   public String summaryInfo() 
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----"; 
      result += "\nNumber of ConicalFrustum Objects: " 
                                 + numberOfConicalFrustums();
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea()); 
      result += "\nTotal Volume: "  + df.format(totalVolume());
      result += "\nAverage Surface Area: "  + df.format(averageSurfaceArea());
      result += "\nAverage Volume: " + df.format(averageVolume());
      return result;
   }
   
   /**
   * @return cfList the cfList.
   */
   public ConicalFrustum[] getList() {
   
      return cfList;
   }
   
   /**
   * @param fileNameIn the fileNameIn.
   * @return cL the cL.
   * @throws FileNotFoundException the FileNotFoundException.
   */
   public ConicalFrustumList2 readFile(String fileNameIn) 
                                       throws FileNotFoundException {
   
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ConicalFrustum[] myList = new ConicalFrustum[20];
      String cListName = "";
      int numFrustums = 0;
      double radius1 = 0, radius2 = 0, height = 0;
      String label = "";
      
      cListName = scanFile.nextLine(); 
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         radius1 = Double.parseDouble(scanFile.nextLine());
         radius2 = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         
         ConicalFrustum c = new ConicalFrustum(label, radius1, radius2, height);
         myList[numFrustums] = c;
         numFrustums++;         
      }
      scanFile.close();
      
      ConicalFrustumList2 cL = new ConicalFrustumList2(cListName,
                                                myList, numFrustums);
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
      cfList[elements] = c;
      elements++;
   }
   
   /**
   * @param labelIn the labelIn.
   * @return result the result.
   */
   public ConicalFrustum findConicalFrustum(String labelIn) {
   
      ConicalFrustum result = null;
      for (int i = 0; i < elements; i++) {
         
         if (cfList[i].getLabel().equalsIgnoreCase(labelIn)) {
            
            result = cfList[i];
            break;
         }
      }
      return result;
   }
   
   /**
   * @param labelIn the labelIn.
   * @return cf the cf.
   */
   public ConicalFrustum deleteConicalFrustum(String labelIn) {
   
      ConicalFrustum result = null;
      
      for (int i = 0; i < elements; i++) {
      
         if (cfList[i].getLabel().equalsIgnoreCase(labelIn)) {
            result = cfList[i];
            for (int j = i; j < elements - 1; j++) {
            
               cfList[j] = cfList[j + 1];
            }
            cfList[elements - 1] = null;
            elements--;
            break;
         }
      }  
      return result;
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
               
      for (int i = 0; i < elements; i++) {
      
         if (cfList[i].getLabel().equalsIgnoreCase(label)) {
         
            cfList[i].setRadius1(radius1);
            cfList[i].setRadius2(radius2);
            cfList[i].setHeight(height);
            return true;
         }
      } 
      return false; 
   }
   
   /**
   * @return result the result.
   */
   public ConicalFrustum findConicalFrustumWithLeastHeight() {
   
      ConicalFrustum result = null;
      if (numberOfConicalFrustums() > 0) {
      
         double height = cfList[1].getHeight();
         for (int i = 0; i < numberOfConicalFrustums(); i++) {
            if ((cfList[i].getHeight()) < height) {
               height = cfList[i].getHeight();
               result = cfList[i];
            }         
         }
      }
      return result;
   }
   
   /**
   * @return result the result.
   */
   public ConicalFrustum findConicalFrustumWithGreatestHeight() {
   
      ConicalFrustum result = null;
      if (numberOfConicalFrustums() > 0) {
      
         double height = cfList[1].getHeight();
         for (int i = 0; i < numberOfConicalFrustums(); i++) {
            if ((cfList[i].getHeight()) > height) {
               height = cfList[i].getHeight();
               result = cfList[i];
            }         
         }
      }
      return result;
   }
   
   /**
   * @return result the result.
   */
   public ConicalFrustum findConicalFrustumWithLeastVolume() {
   
      ConicalFrustum result = null;
      if (numberOfConicalFrustums() > 0) {
      
         double volume = cfList[1].volume();
         for (int i = 0; i < numberOfConicalFrustums(); i++) {
            if ((cfList[i].volume()) < volume) {
               volume = cfList[i].volume();
               result = cfList[i];
            }         
         }
      }
      return result;
   }
   
   /**
   * @return result the result.
   */
   public ConicalFrustum findConicalFrustumWithGreatestVolume() {
   
      ConicalFrustum result = null;
      if (numberOfConicalFrustums() > 0) {
      
         double volume = cfList[1].volume();
         for (int i = 0; i < numberOfConicalFrustums(); i++) {
            if ((cfList[i].volume()) > volume) {
               volume = cfList[i].volume();
               result = cfList[i];
            }         
         }
      }
      return result;
   }
}
