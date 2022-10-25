package com.experion.basicprograming;

import java.util.Scanner;

public class FindDayFromInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dayNumber;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to find corresponding day of the week: ");
		
		dayNumber = scanner.nextInt();
	
		switch(dayNumber) {
			case 1: System.out.println("Monday");
			break;
			
			case 2: System.out.println("Tuesday");
			break;
			case 3: System.out.println("Wednesday");
			break;
			case 4: System.out.println("Thursday");
			break;
			case 5: System.out.println("Friday");
			break;
			case 6: System.out.println("Saturday");
			break;
			case 7: System.out.println("Sunday");
			break;
			default: System.out.println("Not Valid");
			break;
			
		
		}
		

	}

}
