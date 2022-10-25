package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		
		//We can call static funtion with the class itself.
		int index = 0;
		char mainChoice;
		Scanner scanner = new Scanner(System.in);
		Product productList[] = new Product[3];
		
		do {
			System.out.println("1.Create Product 2.Display Product ");
			int choice = scanner.nextInt();
			switch(choice) {
				case 1:  productList[index] = Service.createProduct();
						 index++;
						 break;
				case 2: Service.displayProductDetails(productList);
			
			}
			
			System.out.println("Do you want to continue:  ");
			mainChoice = scanner.next().charAt(0);
		}while(mainChoice == 'y');
	
	}
	

}
