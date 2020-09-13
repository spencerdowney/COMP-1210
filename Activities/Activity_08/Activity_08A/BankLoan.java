/**
* Activity 8A.
* @author Spencer Downey - COMP 1210 - section 012.
* @version 3/19/18.
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;

   /**
   * @param customerNameIn the customerNameIn.
   * @param interestRateIn the interestRateIn.
   */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }

   /**
   * @param amount the amount;
   * @return true or false.
   */
   public static boolean isAmountValid(double amount) {
   
      if (amount >= 0) {
         return true;
      }
      return false;
   }
   
   /**
   * @param loan the loan.
   * @return true or false.
   */
   public static boolean isInDebt(BankLoan loan) {
   
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   
   /**
   * @return loansCreated the loansCreated.
   */
   public static int getLoansCreated() {
   
      return loansCreated;
   }
   
   /**
   *
   */
   public static void resetLoansCreated() {
      
      loansCreated = 0;
   }
   
   /**
   * @param amount the amount.
   * @return wasLoanMade the wasLoanMade.
   */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

   /**
   * @param amountPaid the amountPaid.
   * @return Math.abs(newBalanace) the new balanace.
   */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
   * @return balance the balance.
   */
   public double getBalance() {
      return balance;
   }
   
   /**
   * @param interestRateIn the interestRateIn.
   * @return true or false.
   */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   * @return interestRate the interestRate.
   */
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
   * 
   */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
   * @return output the output.
   */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

   
}
