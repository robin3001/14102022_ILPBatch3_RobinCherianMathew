package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class PrintEmployeeDetailsScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String trainingName = "**********************Welcome to ILP Program**************";
		String employeeName;
		int employeeAge;
		char employeeGender;
		double employeeCgpa; 
		
		System.out.println("Enter your Employee Name: ");
		employeeName = scanner.nextLine();
		
		System.out.println("Enter your Employee Age: ");
		employeeAge = scanner.nextInt();
		
		System.out.println("Enter your Employee Gender: ");
		employeeGender = scanner.next().charAt(0);
		
		System.out.println("Enter your Employee CGPA: ");
		employeeCgpa = scanner.nextDouble();
		
		System.out.println(""+trainingName);
		System.out.println("Name"+"                 "+ " Age"+"   "+" Gender"+"   "+ "CGPA");
		System.out.print(employeeName+"   "+employeeAge+"     "+employeeGender+ "      "+employeeCgpa);
		
		
		

	}

}
