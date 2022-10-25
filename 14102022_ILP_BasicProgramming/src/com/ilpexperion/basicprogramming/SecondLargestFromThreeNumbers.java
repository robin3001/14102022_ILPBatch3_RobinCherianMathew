package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SecondLargestFromThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		int ThirdNumber;
		int secondLargest;
		System.out.println("Enter a First number: ");
		firstNumber = scanner.nextInt();
		
		System.out.println("Enter a Second number: ");
		secondNumber = scanner.nextInt();
		
		System.out.println("Enter a Third number: ");
		ThirdNumber = scanner.nextInt();
		
		if(firstNumber>secondNumber && firstNumber>ThirdNumber) {
			if(secondNumber>ThirdNumber) {
				System.out.println("Second Largest is Second Number ");
			}else {
				System.out.println("Second Largest is Third Number ");
			}
			
		}else if(secondNumber>firstNumber && secondNumber>ThirdNumber) {
			if(firstNumber>ThirdNumber) {
				System.out.println("Second Largest is First Number ");
			}else {
				System.out.println("Second Largest is Third Number ");
			}
			
		}else if(secondNumber>firstNumber) {
			
				System.out.println("Second Largest is Second Number ");
		}else {
				System.out.println("Second Largest is First Number ");
		}
			
	}

}
