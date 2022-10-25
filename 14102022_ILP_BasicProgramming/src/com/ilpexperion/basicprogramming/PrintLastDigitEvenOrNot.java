package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class PrintLastDigitEvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int inputNumber;
		int lastNumber;
		System.out.println("Enter a number: ");
		inputNumber = scanner.nextInt();
		
		lastNumber = inputNumber % 10;
		
		if(lastNumber%2 == 0)
		{
			System.out.println("The Number is Even");
		}
		
		if(lastNumber%2 != 0)
		{
			System.out.println("The Number is odd");
		}
		
		
		
		
		
		
		
		
		

	}

}
