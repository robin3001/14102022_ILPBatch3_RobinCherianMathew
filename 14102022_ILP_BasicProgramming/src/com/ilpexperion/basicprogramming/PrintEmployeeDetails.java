package com.ilpexperion.basicprogramming;

public class PrintEmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String trainingName = "**********************Welcome to ILP Program**************";
		String employeeName = "Robin Cherian Mathew";
		int employeeAge = 21;
		char employeegender = 'M';
		double employeecgpa = 7.18; //if float we need to put 7.18f
		
		System.out.println(""+trainingName);
		System.out.println("Name"+"                 "+ " Age"+"   "+" Gender"+"   "+ "CGPA");
		System.out.print(employeeName+"   "+employeeAge+"     "+employeegender+ "      "+employeecgpa);
		
		
		

	}

}
