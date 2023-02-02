package bankaccountapp;

public class Savings extends Account {
// List properties specific to the Savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	
// Constructor to initialize settings to the Savings properties
	public Savings(String name, String sSn, double initDeposit) {
		super(name, sSn, initDeposit);
		accountNumber =  "1" + accountNumber;
		setSafetyDepositBox();
		
		
//		System.out.println("NEW SAVINGS ACCOUNT");
//		System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
		
//		System.out.println(name);
	}
	
	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		rate = getBaseRate() - .25;
//		System.out.println("Implement Rate for Savings");
	}
	
// Generate 3 digit box id and 4 digit key
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
//		System.out.println(safetyDepositBoxID);
	}
	
// List any methods specific to the Savings account
	public void showInfo() {
//		System.out.println("ACCOUNT TYPE: Savings");
		super.showInfo();
		System.out.println(
				" Your Savings Account Features:" +
				"\n Safety Deposit Box ID: " + safetyDepositBoxID +
				"\n Safety Deposit Box Key: " + safetyDepositBoxKey
				);
	
	}


	


}
