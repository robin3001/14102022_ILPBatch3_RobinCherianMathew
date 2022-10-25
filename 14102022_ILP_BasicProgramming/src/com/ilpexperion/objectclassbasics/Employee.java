package com.ilpexperion.objectclassbasics;

public class Employee {

	String employeeName = "Robin Cherian Mathew";
	int employeeAge = 21;
	char employeegender = 'M';
	double employeecgpa = 7.18; 
	
	public void displayEmployeeDetails() {
		
		System.out.println("**********************Welcome to ILP Program**************");
		System.out.println("Name"+"                 "+ " Age"+"   "+" Gender"+"   "+ "CGPA");
		System.out.print(employeeName+"   "+employeeAge+"     "+employeegender+ "      "+employeecgpa);
	}
}
