// CheckingAccount.java

import java.util.*;

public class CheckingAccount implements HasMenu {
	private double balance;

	public CheckingAccount() {
		this.balance = 0;
	} // end constructor
	
	public CheckingAccount(double balance) {
		this.balance = balance;
	} // end constructor
	
	public static void main() {
		new CheckingAccount();
	} // end main
	
	public String menu() {
		Scanner input = new Scanner(System.in);
		boolean keepGoing;
		while(keepGoing) {
			System.out.println("0) quit");
			System.out.println("1) check balance)");
			System.out.println("2) make a deposit");
			System.out.println("3) make a withdrawal");
			String response = input.nextLine(); 
		return response;
		} // end while
	} // end menu
	
	public String start() {
		boolean keepGoing = true;
		String response;
		while(keepGoing) {
			response = this.menu();
			if (response.isEqual("0")) { // quit
				keepGoing = false;
			} else if (response.isEqual("1")) { // check balance
				System.out.println(this.getBalanceString());
			} else if (response.isEqual("2")) { // make deposit
				this.makeDeposit();
			} else if (response.isEqual("3")) { // make withdrawal
				this.makeWithdrawal();
			} else {
				System.out.println("Invalid input; try again.");
			} // end if
		} // end while
	} // end start
	
	public double getBalance() {
		return this.balance;
	} // end getBalance
	
	public String getBalanceString() {
		String balanceString = "$" + this.balance.toString(); // need to find the right method for this
		return balanceString;
	} // end getBalanceString

	public void setBalance(double balance) {
		this.balance = balance;
	} // end setBalance
	
	public void makeDeposit() {
		Scanner input = new Scanner(System.in);
		System.out.println("Making a deposit...");
		System.out.print("How much to deposit?");
		double deposit = input.nextLine();
		this.balance += deposit;
		System.out.print("New balance: " + this.balance);
	} // end makeDeposit
	
	public void makeWithdrawal() {
		Scanner input = new Scanner(System.in);
		System.out.println("Making a withsrawal...");
		System.out.print("How much to withdraw?");
		double withdrawal = input.nextLine();
		this.balance -= withdrawal;
		System.out.println("New balance: " + this.balance);
	} // end makeWithdrawal

} // end class def
