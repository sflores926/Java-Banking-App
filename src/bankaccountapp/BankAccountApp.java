package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();
		
		String file = "/Users/sflores/Downloads/NewBankAccounts (1).csv";
		
		List <String[]> newAccountHolders = utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolders) {
//			System.out.println("NEW ACCOUNT");
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
//			System.out.println(
//					name + " " + sSN + " " + accountType + " $" + initDeposit
//					);
			if (accountType.equals("Savings")) {
//				System.out.println("OPEN A SAVINGS ACCOUNT");
				accounts.add(new Savings(name, sSN, initDeposit));
			}
			else if(accountType.equals("Checking")) {
//				System.out.println("OPEN A CHECKING ACCOUNT");
				accounts.add(new Checking(name, sSN, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
			
//			System.out.println(accountHolder[0]);
//			System.out.println(accountHolder[1]);
//			System.out.println(accountHolder[2]);
//			System.out.println(accountHolder[3]);
		}
		
		// Read CSV File and create new accounts based on that data
		for (Account acc : accounts) {
			System.out.println("************************");
			acc.showInfo();
		}
		
		//methods to play around with
//		accounts.get((int) Math.random() * accounts.size()).deposit(1000);
		
//		accounts.get(5).showInfo();
		
		
		
//		Checking chkacc1 = new Checking("Adri Flores", "321456789", 1500);
//		
//		Savings savacc1 = new Savings("Leo Flores", "456657897", 2500);
		
//		savacc1.
//		savacc1.compound();
//		savacc1.showInfo();
//		
//		System.out.println("*****************************");
//		chkacc1.showInfo();
		
		
//		savacc1.deposit(5000);
//		savacc1.withdraw(200);
//		savacc1.transfer("Brokerage", 3000);
		
		
		
		
		

	}

}
