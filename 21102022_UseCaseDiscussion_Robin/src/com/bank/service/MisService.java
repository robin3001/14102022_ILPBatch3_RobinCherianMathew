package com.bank.service;

import java.util.Scanner;

public class MisService {
	
	public static String enterAccountChoice() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which account you want to open\n1. Savings Max Account\n2.Current Account\n3. Loan Account (type account name here): ");
		String customerAccountChoice = scanner.nextLine();
		return customerAccountChoice;
		
	}

}
