package com.experion.basicprograming;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String productName[] = new String[5];
		System.out.println("Enter 5 product Name: ");
		
		productName[0] = scanner.nextLine();
		productName[1] = scanner.nextLine();	
		productName[2] = scanner.nextLine();
		productName[3] = scanner.nextLine();
		productName[4] = scanner.nextLine();

		
		System.out.println(productName[0]+" "+productName[1]+" "+productName[2]+" "+productName[3]+" "+productName[4]);

	}

}
