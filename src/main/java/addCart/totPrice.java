package addCart;

public interface totPrice {

	double calcTotalPrice(int qty, double price); //calculate total price to add to the cart
	
	double calcTotal_UpdatePrice(int qty1, int qty2, double price); //calculate the total price according to the updated quantity
}
