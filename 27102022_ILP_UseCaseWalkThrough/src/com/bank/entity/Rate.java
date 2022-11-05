package com.bank.entity;

import java.util.Arrays;
import java.util.Date;

public class Rate {
	private int[] min;
	private int[] max;
	private double[] rate;
	
	
	public Rate() {
		
	}


	public int[] getMin() {
		return min;
	}


	public void setMin(int[] min) {
		this.min = min;
	}


	public int[] getMax() {
		return max;
	}


	public void setMax(int[] max) {
		this.max = max;
	}


	public double[] getRate() {
		return rate;
	}


	public void setRate(double[] rate) {
		this.rate = rate;
	}


	@Override
	public String toString() {
		return "Rate [min=" + Arrays.toString(min) + ", max=" + Arrays.toString(max) + ", rate=" + Arrays.toString(rate)
				+ "]";
	}

	
	
	

}
