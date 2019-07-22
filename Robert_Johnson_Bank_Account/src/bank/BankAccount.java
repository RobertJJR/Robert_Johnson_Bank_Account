package bank;
import java.util.Random;
import java.text.DecimalFormat;

public class BankAccount {
	// The class should have the following attributes: (string) account number, (double) checking balance, (double) savings balance.
	private String account;
	private double chkbal = 0;
	private double savbal = 0;
	//Create a class member (static) that has the number of accounts created thus far.
	private static int numberOfAccts = 0;
	//Create a class member (static) that tracks the total amount of money stored in every account created.
	private static double totalAmt = 0;
	//Create a private method that returns a random ten digit account number.
	private static String AcctNum() {
		String aNum = "";
			for (int i = 0; i < 10; i++) {
				int x = (int)(Math.random() * 10);
				aNum += x;
			}
		return aNum;
	}
	
	public BankAccount() {
		this.account = AcctNum();
		numberOfAccts++;
	}
	
	public String getAcctNum() {
		return AcctNum();
	}
	public int getAccts() {
		return numberOfAccts;
	}
	//Create a getter method for the user's checking account balance.
	public double getChkBal() {
		return chkbal;
		
	}
	//Create a getter method for the user's saving account balance.
	public double getSavBal() {
		return savbal;
	}
	//Create a method to see the total money from the checking and saving.
	public double getTotBal() {
		return savbal + chkbal;
	}
	// Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
	
	//Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
//____________________________________________________________________________________________________________
	
	public String addChkBal(double num) {
        this.chkbal += num;
        return "Deposited $" + num + " to Checkings";
    }
	
	public String withChkBal(double num) {
		int x = (int) num;
		if(x > chkbal) {
			return "You attempted to withdraw $" + x + ", you don't got enough pal.";
		}
		else {
			this.chkbal -=num;	
			return "Withdrew $" + num + " to Checkings";
		}
	}
}
