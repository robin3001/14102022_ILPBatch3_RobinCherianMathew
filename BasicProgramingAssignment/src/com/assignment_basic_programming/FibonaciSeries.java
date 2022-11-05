package com.assignment_basic_programming;

import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args) {
		// Program to print the Fibonacci series 0 1 1 2 3 5 8 ………. n
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit - ");
		int seriesLimit = scanner.nextInt();
		
		
		int i = 1,  firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + seriesLimit + " terms:");

	    while (i <=seriesLimit) {
	      System.out.print(firstTerm +" " );

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;

	      i++;

	}}}
