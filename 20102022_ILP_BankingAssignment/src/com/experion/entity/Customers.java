package com.experion.entity;

import java.util.ArrayList;

public class Customers {
	private String customerId;
	private String customerName;
	private ArrayList<Account> customerAccounts;
	
	public Customers(String customerId, String customerName, ArrayList<Account> customerAccounts) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAccounts = customerAccounts;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public ArrayList<Account> getCustomerAccounts() {
		return customerAccounts;
	}
	public void setCustomerAccounts(ArrayList<Account> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}
	
	
	
}
