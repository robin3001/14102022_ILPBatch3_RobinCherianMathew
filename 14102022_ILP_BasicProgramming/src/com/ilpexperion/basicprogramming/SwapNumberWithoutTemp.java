package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SwapNumberWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		
		System.out.println("Enter First Number: ");
		firstNumber=scanner.nextInt();
		
		System.out.println("Enter Second Number: ");
		secondNumber=scanner.nextInt();
		
		System.out.println("Number Before Swap, First Number: "+firstNumber+", Second Number: "+secondNumber);
		
		//Swap
		firstNumber = firstNumber+secondNumber;
		secondNumber = firstNumber-secondNumber;
		firstNumber = firstNumber-secondNumber;
		
		
		System.out.println("Number After Swap, First Number: "+firstNumber+", Second Number: "+secondNumber);
		
		

	}

}
