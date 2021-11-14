package com.Payment;

public class Sales implements salesCalculation{
	
	@Override
public double calcTotalPrice(int qty, double price) {
		
		double totalPrice;
		
		totalPrice = qty*price;
		
		return totalPrice;
	}

	public double calcTotal_UpdatePrice(int qty2, double price) {
		// TODO Auto-generated method stub
		return 0;
	}


}
