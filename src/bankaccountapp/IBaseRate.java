package bankaccountapp;

public interface IBaseRate {
// Write a method that returns the base rate
	
// Checking account use 15% of the base rate

// Savings uses .25 points less than the base rate

// for loop
	
	default double getBaseRate() {
		return 2.5;
	}

}
