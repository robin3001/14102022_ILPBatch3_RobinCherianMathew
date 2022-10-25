package com.experion.basicprograming;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemoUsingForeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String productNames[] = new String[5];
		
		System.out.println("Enter 5 product Name: ");
		
		for(int count=0;count<productNames.length;count++) {
			productNames[count] = scanner.nextLine();
		}
		
		for (String productName : productNames)
			System.out.print(productName+" "+productName.length());
		
	}

}
