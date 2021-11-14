package productsPage;

public class Products {
	
	private int id;
	private String name;
	private String company;
	private String price;
	private String quantity;
	private String exp_date;
	private String description;
	
	public Products(int id, String name, String company, String price, String quantity, String exp_date,
			String description) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
		this.quantity = quantity;
		this.exp_date = exp_date;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	public String getPrice() {
		return price;
	}

	public String getQuantity() {
		return quantity;
	}

	public String getExp_date() {
		return exp_date;
	}

	public String getDescription() {
		return description;
	}


}
