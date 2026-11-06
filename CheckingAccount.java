// CheckingAccount.java

public class CheckingAccount {
	private double balance;

	public CheckingAccount() {
		this.balance = 0;
	} // end constructor
	
	public CheckingAccount(double balance) {
		this.balance = balance;
	} // end constructor
	
	public static main() {
		new CheckingAccount()
	} // end main
	
	public String menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("0) quit");
		System.out.println("1) check balance)");
		System.out.println("2) make a deposit");
		System.out.println("3) make a withdrawal");
		String response = input.nextLine(); 
		return response;
	} // end menu
	
	public void start() {
	} // end start
	
	public double getBalance() {
		return this.balance;
	} // end getBalance
	
	public string getBalanceString() {
		String balanceString = this.balance.toString(); // need to find the right method for this
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
