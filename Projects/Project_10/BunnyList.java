import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.text.DecimalFormat;

/**
* Project 10.
* @author Spencer Downey - COMP 1210 - section 012.
* @version 4/16/18.
*/
public class BunnyList { 
 
   // instance variables
   private String listName; 
   private Bunny[] bunnyList;
   private String[] excludedRecords;
   
   // constructor
   /**   **/
   public BunnyList() {
   
      listName = "not yet assigned";
      bunnyList = new Bunny[0];
      excludedRecords = new String[0];
   }
   
   // methods
   /**
    * @param fileNameIn the file.
    * @throws FileNotFoundException if file not found.
    */
   public void readBunnyFile(String fileNameIn) 
      throws FileNotFoundException {
      Scanner scanFile1 = new Scanner(new File(fileNameIn));
      String name = "";
      String breed = "";
      double weight = 0;
      double other = 0;
   
      listName = scanFile1.nextLine();
      
      while (scanFile1.hasNext()) { 
         String bunnyLine = scanFile1.nextLine();
         Scanner scanFile2 = new Scanner(bunnyLine).useDelimiter(",");
         char bunnyCode = scanFile2.next().toLowerCase().charAt(0);
         name = scanFile2.next().trim();
         breed = scanFile2.next().trim();
         weight = Double.parseDouble(scanFile2.next());
         switch (bunnyCode) {
            case 'p' : // pet bunny 
               PetBunny pB = new PetBunny(name, breed, weight);
               this.addBunny(pB);
               break;
            case 'h' : // house bunny  
               other = Double.parseDouble(scanFile2.next());
               HouseBunny hB = new HouseBunny(name, breed, weight, other);
               this.addBunny(hB);
               break;
            case 'j' : // jumping bunny  
               other = Double.parseDouble(scanFile2.next());
               JumpingBunny jB = new JumpingBunny(name, breed, weight, other);
               this.addBunny(jB);
               break;
            case 's' : // show bunny  
               other = Double.parseDouble(scanFile2.next());
               ShowBunny sB = new ShowBunny(name, breed, weight, other);
               this.addBunny(sB);
               break;
            default: // default
               this.addExcludedRecord(bunnyLine);
               break;
         }
      }
      scanFile1.close();
   }
   
   /**
    * @return listName the listName.
    */
   public String getListName() {
      return listName;
   }
   
   /**
    * @param listNameIn the listName.
    */
   public void setListName(String listNameIn) {
      listName = listNameIn;
   }
   
   /**
    * @return bunnyList the bunnyList.
    */
   public Bunny[] getBunnyList() {
      return bunnyList;
   }
   
   /**
    * @return excludedRecords the excludedRecords.
    */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
   
   /**
    * @param bunnyIn the bunnyIn.
    */
   public void addBunny(Bunny bunnyIn) {
      bunnyList = Arrays.copyOf(bunnyList, bunnyList.length + 1);
      bunnyList[bunnyList.length - 1] = bunnyIn;
   }
   
   /**
    * @param stringIn the stringIn.
    */
   public void addExcludedRecord(String stringIn) {
      excludedRecords = Arrays.copyOf(excludedRecords,
         excludedRecords.length + 1);
      excludedRecords[excludedRecords.length - 1] = stringIn;
   }
   
   /**
    * @return result the result.
    */
   public String toString() {
      String result = "";
      for (int i = 0; i < bunnyList.length; i++) {
         result += "\n" + bunnyList[i].toString() + "\n";
      }
      return result;
   }
   
   /**
    * @return result the result.
    */
   public double totalEstimatedMonthlyCost() {
      double result = 0;
      for (int i = 0; i < bunnyList.length; i++) {
         result += bunnyList[i].estimatedMonthlyCost();
      }
      return result;
   }
   
   /**
    * @return result the result.
    */
   public String summary() {
      DecimalFormat fmt1 = new DecimalFormat("$#,##0.00;($#,##0.00)");
      String result = "------------------------------\n"
         + "Summary for " + listName + "\n"
         + "------------------------------\n" + "Number of Bunnies: " 
         + bunnyList.length + "\nTotal Estimated Monthly Cost: "
         + fmt1.format(totalEstimatedMonthlyCost()) + "\n\n";
      return result;
   }
   
   /**
    * @return result the result.
    */
   public String listByName() {
      String result = "------------------------------\n"
         + "Bunnies by Name\n"
         + "------------------------------\n\n";
      Arrays.sort(bunnyList);
      for (int i = 0; i < bunnyList.length; i++) {
         result += bunnyList[i].toString() + "\n\n";
      }
      return result;
   }
   
   
   /**
    * @return result the result.
    */
   public String listByCost() {
      String result = "------------------------------\n"
         + "Bunnies by Cost\n"
         + "------------------------------\n\n";
      Arrays.sort(bunnyList, new CostComparator());
      for (int i = 0; i < bunnyList.length; i++) {
         result += bunnyList[i].toString() + "\n\n";
      }
      return result;
   }
   
   /**
    * @return result the result.
    */
   public String excludedRecordsList() {
      String result = "------------------------------\n"
         + "Excluded Records\n"
         + "------------------------------\n\n"; 
      for (int i = 0; i < excludedRecords.length; i++) {
         result += excludedRecords[i].toString() + "\n\n";
      }
      return result;
   }
}