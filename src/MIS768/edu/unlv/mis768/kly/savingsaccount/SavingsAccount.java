package edu.unlv.mis768.kly.savingsaccount;

public class SavingsAccount {
	
	private double balance;
	private double interestRate;
		
		public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double iRate) { // public void setInterestRate(double interestRate) {
		// this.interestRate = interestRate;
		if(iRate<0)
			iRate=0;
		else if(iRate>.01)
			iRate /=100;
		interestRate=iRate;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit (double amount) {
		if (amount<0)
			amount=0;
		balance+= amount;
	}
	public void withdraw (double amount) {
		if (amount<0)
			amount=0;
		balance-= amount;
		
	}
	public void addInterest() {
		balance += interestRate * balance;
	}
		public SavingsAccount() {
		
	}
	public SavingsAccount(double iRate, double bal) {
		if(bal<0)
			bal=0;
		
		balance = bal;
		
		if(iRate<0)
			iRate=0;
		else if(iRate>.01)
			iRate /=100;
		interestRate=iRate;
	}

}
