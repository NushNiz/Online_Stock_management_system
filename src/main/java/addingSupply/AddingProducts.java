package addingSupply;

public class AddingProducts  {
	
	private String ID;
	private String Name;
	private String Company;
	private String Quantity;
	private String Description;
	
	
	public AddingProducts(String id, String name, String company, String quantity, String description) {
		super();
		ID = id;
		Name = name;
		Company = company;
		Quantity = quantity;
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
	
	public String getQuantity() {
		return Quantity;
	}
	
	public String getDescription() {
		return Description;
	}
	
	
	
	
	

}
