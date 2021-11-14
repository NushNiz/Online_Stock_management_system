package com.Payment;


public class updatePayment implements salesCalculation {
	
public double calcTotal_UpdatePrice(int qty2, double price) {
		
		double p = price*qty2;
		
		return p;
	}

	@Override
	public double calcTotalPrice(int qty, double price) {
		// TODO Auto-generated method stub
		return 0;
	}


}
