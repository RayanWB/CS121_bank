// CheckingAccount.java

import java.util.*;
//import java.lang.Math.round(); // might need for balanceString

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
		boolean keepGoing = true;
		Scanner input = new Scanner(System.in);
		while (keepGoing) {
			System.out.println("0) quit");
			System.out.println("1) check balance)");
			System.out.println("2) make a deposit");
			System.out.println("3) make a withdrawal");
			String response = input.nextLine(); 
			try { // in case response isn't an integer
				int responseInt = Integer.intValue();
				if (Integer.min(responseInt, 0).equals(0)) { // if within lower boundary...
					if (Integer.max(responseInt, 4).equals(4)) {
						keepGoing = false;
					}
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} // end while
		
		return response;
	} // end menu
	
	public void start() {
		boolean keepGoing = true;
		String response;
		while(keepGoing) {
			response = this.menu();
			if (response.equals(0)) { // quit
				keepGoing = false;
			} else if (response.equals(1)) { // check balance
				System.out.println("Check Balance");
				System.out.println(this.getBalanceString());
			} else if (response.equals(2)) { // make deposit
				this.makeDeposit();
			} else if (response.equals(3)) { // make withdrawal
				this.makeWithdrawal();
			} else {
				System.out.println("Invalid input; try again.");
				System.out.println();
			} // end if
		} // end while
	} // end start
	
	public double getBalance() {
		return this.balance;
	} // end getBalance
	
	public String getBalanceString() {
		String balanceString = String.format("$%1$2f", this.balance); // formats balance as a string with precision to two decimal places (?)
		return balanceString;
	} // end getBalanceString

	public void setBalance(double balance) {
		this.balance = balance;
	} // end setBalance
	
	public void makeDeposit() {
		Scanner input = new Scanner(System.in);
		System.out.println("Making a deposit...");
		System.out.print("How much to deposit? ");
		double deposit = Double.valueOf(input.nextLine()); // asks for deposit amount 
		this.balance += deposit; // adds deposit to balance
		System.out.print("New balance: " + this.balance);
	} // end makeDeposit
	
	public void makeWithdrawal() {
		Scanner input = new Scanner(System.in);
		System.out.println("Making a withdrawal...");
		System.out.print("How much to withdraw?");
		double withdrawal = Double.valueOf(input.nextLine()); // asks for withdrawal amount
		this.balance -= withdrawal; // removes withdrawal from balance
		System.out.println("New balance: " + this.balance);
	} // end makeWithdrawal

} // end class def
