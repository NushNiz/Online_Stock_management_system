package addCart;

public class cart {
	private int id;
	private String name;
	private String company;
	private String quantity;
	private String price;
	
	public cart(int id, String name, String company, String quantity, String price) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setTotPrice(String price) {
		this.price = price;
	}
	

}
