package productDetails;

public class Stock {
	
	
	private String ID;
	private String Name;
	private String Company;
	private String Price;
	private String Quantity;
	private String ExpireDate;
	private String Description;
	
	public Stock(String iD, String name, String company, String price, String quantity, String expireDate,String description) {
		super();
		ID = iD;
		Name = name;
		Company = company;
		Price = price;
		Quantity = quantity;
		ExpireDate = expireDate;
		Description = description;
	}

	public String getID() {
		return ID;
	}


	public String getName() {
		return Name;
	}


	public String getCompany() {
		return Company;
	}


	public String getPrice() {
		return Price;
	}


	public String getQuantity() {
		return Quantity;
	}


	public String getExpireDate() {
		return ExpireDate;
	}


	public String getDescription() {
		return Description;
	}

	
	

}
