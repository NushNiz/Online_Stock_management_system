package updateCart;

import addCart.totPrice;

public class UpdatedPrice implements totPrice{

	public double calcTotal_UpdatePrice(int qty1, int qty2, double price) {
		//calculate the total price according to the updated quantity
		double p = (price/qty1)*qty2;
		
		return p;
	}

	@Override
	public double calcTotalPrice(int qty, double price) {
		// TODO Auto-generated method stub
		return 0;
	}

}
