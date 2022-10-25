package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Card;
import com.experion.entity.Loan;
import com.experion.entity.Product;

public class ProductUtility {

	public static void main(String[] args) {
		
//		 Account account = new Account("Womens savings Account","ACC1987677",10000);
//		 AccountService  accountService =new AccountService();
//		 accountService.depositeCash(account, 20000);
//		 accountService.depositeCash(account, 0,"robincherian@okaxis");
//		 accountService.depositeCash(account, "CHEQW087677",10000);
		
		Product product = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Account 2.Card 3.Loan");
		int choice = scanner.nextInt();
		if(choice == 1) {
			product = new Account("Womens savings Account","ACC1987677",10000);
		}else if(choice == 2) {
			product = new Card("Master Card","CARD1987677",10000);
		}else if(choice == 3) {
			product = new Loan("Home Loan","LOAN1987677",1000000);
		}
		product.checkProductValidity();
	}
}
