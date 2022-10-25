package com.experion.entity;


public class Card extends Product {

	private String cardNumber;
	private  double cardBalance;
	public Card(String productName, String cardNumber, double cardBalance) {
		super(productName);
		this.cardNumber = cardNumber;
		this.cardBalance = cardBalance;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public double getCardBalance() {
		return cardBalance;
	}
	public void setCardBalance(double cardBalance) {
		this.cardBalance = cardBalance;
	}
	@Override
	public void checkProductValidity() {

		System.out.println("Validty Check of Card called");
		
	}
	
		
}
