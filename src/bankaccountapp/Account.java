package bankaccountapp;

public abstract class Account implements IBaseRate {
// List common properties for savings and checking accounts
	private String name;
	private String sSn;
	private double balance;
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	

// Constructor to set base properties and initialize the account
	public Account(String name, String sSn, double initDeposit) {
//		System.out.println("NAME: " + name);
//		System.out.print("NEW ACCOUNT: ");
		
		this.name = name;
		this.sSn = sSn;
		balance = initDeposit;
		
//		System.out.println("NAME: " + name + " SSN: " + sSn + " BALANCE: $" + balance);
		
		
//		Set account number
		index++;
		this.accountNumber = setAccountNumber();
		setRate();
//		System.out.println(getBaseRate());
//		System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
		
		
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN = sSn.substring(sSn.length()-2, sSn.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
		
	}
	
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);
		printBalance();
	}
	
// List common methods -transactions
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawling $" + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transferring $" + amount + " to " + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your Balance is now: $" + balance);
	}
	
// showInfo()
	public void showInfo() {
		System.out.println(
				"NAME: " + name +
				"\nACCOUNT NUMBER: " + accountNumber +
				"\nBALANCE: " + balance +
				"\nRate: " + rate + "%"
				);
	}
	
}
