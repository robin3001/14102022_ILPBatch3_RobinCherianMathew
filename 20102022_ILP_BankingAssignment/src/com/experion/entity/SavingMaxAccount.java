package com.experion.entity;

public class SavingMaxAccount extends Account {
	
	private double accountBalance;


	public SavingMaxAccount(int accountNumber, String accountType, double accountBalance) {
		super(accountNumber, accountType);
		this.accountBalance = accountBalance;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	

}
