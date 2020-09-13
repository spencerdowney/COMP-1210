/**
* Activity 4.
* @author Spencer Downey - COMP 1210 - section 012.
* @version 2/5/18.
*/

public class UserInfo
{
   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   // constructor
   
   /**
   * This sets information to the variables.
   * @param firstNameIn Command line arguments - not used.
   * @param lastNameIn Command line arguments - not used.
   */
   public UserInfo(String firstNameIn, String lastNameIn)
   {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
   // methods
   
   /**
   * Outputs the information.
   * @return output.
   */
   public String toString()
   {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) 
      {
         output += "Offline";
      }
      else
      {
         output += "Online";
      }
      return output;
   }
   
    /**
    * Used to set the location.
    * @param locationIn Command line arguments - not used.
    */
   public void setLocation(String locationIn)
   {
      location = locationIn;
   }
   
    /**
    * Used to set the age.
    * @param ageIn Command line arguments - not used.
    * @return isSet.
    */
   public boolean setAge(int ageIn)
   {
      boolean isSet = false;
      if (ageIn > 0) 
      {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   
    /**
    * Used to get the age.
    * @return age.
    */
   public int getAge()
   {
      return age;
   }
   
    /**
    * Used to get the location.
    * @return location.
    */
   public String getLocation()
   {
      return location;
   }
         
    /**
    * Used to log off.
    */
   public void logOff()
   {
      status = OFFLINE;
   }
   
    /**
    * Used to log on.
    */
   public void logOn()
   {
      status = ONLINE;
   }
}