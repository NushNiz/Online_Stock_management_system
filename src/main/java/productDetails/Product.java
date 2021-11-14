package productDetails;

public class Product {
	
	
	private String ProductID;
	private String Name;
	private String Price;
	private String Company;
	private String Description;
	
	public Product(String productID, String name, String price, String company, String description) {
		super();
		ProductID = productID;
		Name = name;
		Price = price;
		Company = company;
		Description = description;
	}

	public String getProductID() {
		return ProductID;
	}


	public String getName() {
		return Name;
	}


	public String getPrice() {
		return Price;
	}


	public String getCompany() {
		return Company;
	}


	public String getDescription() {
		return Description;
	}

	
	

}
