/**
* Activity 8B.
* @author Spencer Downey - COMP 1210 - section 012.
* @version 3/26/18.
*/
public class Customer implements Comparable<Customer> {

   private String name;
   private String location;
   private double balance;
   
   /**
   * @param nameIn the nameIn.
   */
   public Customer(String nameIn) {
   
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   /**
   * @param city the city.
   * @param state the state.
   */
   public void setLocation(String city, String state) {
   
      location = city + ", " + state;
   }
   
   /**
   * @param locationIn the locationIn.
   */
   public void setLocation(String locationIn) {
   
      location = locationIn;
   }
   
   /**
   * @param amount the amount.
   */
   public void changeBalance(double amount) {
   
      balance = balance + amount;
   }
   
   /**
   * @return location the location.
   */
   public String getLocation() {
   
      return location;
   }
   
   /**
   * @return balance the balance.
   */
   public double getBalance() {
   
      return balance;
   }
   
   /**
   * @return output the output.
   */
   public String toString() {
   
      String output = name + "\n" + location + "\n$" + balance;
      return output;
   }
   
   /**
   * @param obj the obj.
   * @return 0, -1, 1 depending on comparison.
   */
   public int compareTo(Customer obj) {
   
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }
}