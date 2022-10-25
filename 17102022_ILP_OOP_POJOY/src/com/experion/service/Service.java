package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	
	Product product = new Product();
	
	public void inputProductDetails() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Product Code: ");
		String productCode = scanner.nextLine();
		System.out.println("Enter Product Name: ");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Description: ");
		String productDescription = scanner.nextLine();
		System.out.println("Enter Product Price: ");
		double productPrice = scanner.nextDouble();
		scanner.nextLine(); //Clear the buffer
		System.out.println("Enter Product Open Date: ");
		String openDate = scanner.nextLine();
		System.out.println("Enter Product Validity: ");
		String validityDate = scanner.nextLine();
		System.out.println("Enter Product expiry Date: ");
		String expiryDate = scanner.nextLine();
		System.out.println("Enter Product Active or not: ");
		boolean active = scanner.nextBoolean();
		
		product.setProductCode(productCode);

		
		product.setProductName(productName);
	
		
		product.setProductDescription(productDescription);
	
		
		product.setProductPrice(productPrice);

		product.setOpenDate(openDate);
		
		product.setValidityDate(validityDate);
	
		
		product.setExpiryDate(expiryDate);

		
		product.setActive(active);

	}

	public void displayProductDetails() {
		
		System.out.println("The product code is - "+product.getProductCode());
		System.out.println("The product Name is - "+product.getProductName());
		System.out.println("The product Description is - "+product.getProductDescription());
		System.out.println("The product Price is - "+product.getProductPrice());
		System.out.println("The product Open Time is - "+product.getOpenDate());
		System.out.println("The product Validity is - "+product.getValidityDate());
		System.out.println("The product Expiry is - "+product.getExpiryDate());
		System.out.println("The product Active is - "+product.isActive());
		
		System.out.println(
				"Product Code" + "    " + "Product Name" + "    " + "Product Description" + "    " + "Product Price"
						+ "    " + "Open Date" + "    " + "Validity Date" + "    " + "Expiry Date" + "    " + "Active");
		System.out.println( "    " +product.getProductCode() + "    " + product.getProductName() + "    " + product.getProductDescription() + "    " + product.getProductPrice()
				+ "    " + product.getOpenDate() + "    " + product.getValidityDate() + "    " + product.getExpiryDate() + "    " + product.isActive());



	}


}
