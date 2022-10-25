package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SwapNumberWithTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		int tempVariable;
		
		System.out.println("Enter First Number: ");
		firstNumber=scanner.nextInt();
		
		System.out.println("Enter Second Number: ");
		secondNumber=scanner.nextInt();
		
		System.out.println("Number Before Swap, First Number: "+firstNumber+", Second Number: "+secondNumber);
		
		//Swap
		tempVariable = firstNumber;
		firstNumber = secondNumber;
		secondNumber = tempVariable;
		
		System.out.println("Number After Swap, First Number: "+firstNumber+", Second Number: "+secondNumber);
		
		

	}

}
