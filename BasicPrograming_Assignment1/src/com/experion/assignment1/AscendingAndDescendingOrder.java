package com.experion.assignment1;

import java.util.Scanner;

public class AscendingAndDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int numbers[] = new int[4];
		int temporaryValue;
		
		System.out.println("Enter four numbers: ");
		for(int count=0;count<numbers.length;count++) {
			numbers[count] = scanner.nextInt();			
		}
		
		//Ascending Order
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++)
				if(numbers[i]>numbers[j]) {
					temporaryValue = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temporaryValue;		
				}	
		}
		
		System.out.print("Ascending Order - ");
		for(int count=0;count<numbers.length;count++) {
			
			System.out.print(numbers[count]+" ");
		}	
			
		//Descending Order
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++)
				if(numbers[i]<numbers[j]) {
					temporaryValue = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temporaryValue;		
				}	
		}
			
		System.out.print("Descending Order - ");
		for(int count=0;count<numbers.length;count++) {
			
			System.out.print(numbers[count]+" ");
		}	

	}

}
