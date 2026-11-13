// Customer.java

import java.util.*;

public class Customer extends User implements HasMenu {
	private CheckingAccount checking;
	private SavingsAccount savings;

	public Customer();
	public Customer(userName, PIN);
	public void main();
	public void start();
	public String menu();
	public void changePin();
	public String getReport();
} // end class def
