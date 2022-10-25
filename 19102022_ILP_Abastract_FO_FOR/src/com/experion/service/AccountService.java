package com.experion.service;

import com.experion.entity.Account;

public class AccountService {

	public void depositeCash(Account account, double amount) {
		
		System.out.println("Depositing money over the counter");
	}
	
	public void depositeCash(Account account,String chequeName , double amount) {
		System.out.println("Depositing money via cheque");
	}

	public void depositeCash(Account account, double amount,String upicode) {
		System.out.println("Depositing money through Online");
	}
	

	

}
