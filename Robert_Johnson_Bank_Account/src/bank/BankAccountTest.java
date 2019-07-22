package bank;
import java.util.Random;
import java.text.DecimalFormat;

public class BankAccountTest {
	public static void main(String[] args) {
	// The class should have the following attributes: (string) account number, (double) checking balance, (double) savings balance.
		BankAccount user = new BankAccount();

		System.out.println("Hello " + user.getAcctNum());
		System.out.println("Currently there are " + user.getAccts() + " account(s).");
		System.out.println(user.addChkBal(3000.00));
		
		System.out.println("Your current checking balance is $" + user.getChkBal() );
		System.out.println("Your current saving balance is $" + user.getSavBal() );
		System.out.println("Your total balance is $" + String.format("%.2f", user.getTotBal()));
		
		System.out.println(user.withChkBal(4000.00));
		System.out.println("Your current checking balance is $" + user.getChkBal() );
		System.out.println("Your total balance is $" + String.format("%.2f", user.getTotBal()));
	}
}
