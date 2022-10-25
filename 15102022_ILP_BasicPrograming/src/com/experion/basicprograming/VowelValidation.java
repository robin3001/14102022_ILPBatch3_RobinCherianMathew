package com.experion.basicprograming;

import java.util.Scanner;

public class VowelValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char character;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character to check its vowel or not: ");
		
		character = scanner.next().charAt(0);
		
		switch(character) {
			case 'a': System.out.println("Vowel");
			break;
			case 'A': System.out.println("Vowel");
			break;
			case 'e': System.out.println("Vowel");
			break;
			case 'E': System.out.println("Vowel");
			break;
			case 'i': System.out.println("Vowel");
			break;
			case 'I': System.out.println("Vowel");
			break;
			case 'o': System.out.println("Vowel");
			break;
			case 'O': System.out.println("Vowel");
			break;
			case 'U': System.out.println("Vowel");
			break;
			case 'u': System.out.println("Vowel");
			break;
			default: System.out.println("Not a Vowel");
			break;
			
		
		}
		

	}

}
