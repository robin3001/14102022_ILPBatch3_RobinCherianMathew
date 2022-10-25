package com.experion.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
		
	public static Product createProduct() {
		
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
//		int sl = 1;
		Product product = new Product(productCode,productName,productDescription,productPrice,openDate,validityDate,expiryDate,active);
		
		product.setSerialNo(product.getSerialNo() + 1);
		product.setSerialNoOriginal(product.getSerialNo());
//		sl++;
		return product;
		
//		product.setProductCode(productCode);
		
//		product.setProductName(productName);
//	
//		
//		product.setProductDescription(productDescription);
//	
//		
//		product.setProductPrice(productPrice);
//
//		product.setOpenDate(openDate);
//		
//		product.setValidityDate(validityDate);
//	
//		
//		product.setExpiryDate(expiryDate);
//
//		
//		product.setActive(active);


	}

	public static void displayProductDetails(ArrayList<Product> productList) {
		
		
//		System.out.println("The product code is - "+product.getProductCode());
//		System.out.println("The product Name is - "+product.getProductName());
//		System.out.println("The product Description is - "+product.getProductDescription());
//		System.out.println("The product Price is - "+product.getProductPrice());
//		System.out.println("The product Open Time is - "+product.getOpenDate());
//		System.out.println("The product Validity is - "+product.getValidityDate());
//		System.out.println("The product Expiry is - "+product.getExpiryDate());
//		System.out.println("The product Active is - "+product.isActive());
		
		
		System.out.println("SL NO" + "    " +
				"Product Code" + "    " + "Product Name" + "    " + "Product Description" + "    " + "Product Price"
						+ "    " + "Open Date" + "    " + "Validity Date" + "    " + "Expiry Date" + "    " + "Active");
		for (Product product: productList) {
		System.out.println( "    " +product.getSerialNoOriginal() + "    " +product.getProductCode() + "    " + product.getProductName() + "    " + product.getProductDescription() + "    " + product.getProductPrice()
				+ "    " + product.getOpenDate() + "    " + product.getValidityDate() + "    " + product.getExpiryDate() + "    " + product.isActive());

		}


	}


}
