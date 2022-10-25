package com.experion.assignment1;

import java.util.Scanner;

public class ArrangeNumbersInDescendingOrder {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numbers[] = new int[3];
		int temporaryValue;
		
		//Customer Input
		System.out.println("Enter three numbers: ");
		for(int count=0;count<numbers.length;count++) {
			numbers[count] = scanner.nextInt();			
		}	
		
		//Arranged into descending Order
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++)
				if(numbers[i]<numbers[j]) {
					temporaryValue = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temporaryValue;		
				}	
		}
		
		
		System.out.println("Numbers in descending order : ");
		for(int count=0;count<numbers.length;count++) {

			System.out.print(numbers[count]+" ");
		}	
	}

}
