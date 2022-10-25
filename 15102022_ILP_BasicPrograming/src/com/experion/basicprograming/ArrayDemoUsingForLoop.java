package com.experion.basicprograming;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemoUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String productName[] = new String[5];
		System.out.println("Enter 5 product Name: ");
		
		for(int count=0;count<productName.length;count++) {
			productName[count] = scanner.nextLine();
		}
		
		for(int count=0;count<productName.length;count++) {
			System.out.print(productName[count]+" ");
		}	
	}

}
