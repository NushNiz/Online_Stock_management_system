package addCustomer;

public class customer {
	
	private int id;
	private String name;
	private String email;
	private String phone;
	private String userName;
	private String paswd;
	
	public customer(int id, String name, String email, String phone, String userName, String paswd) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.userName = userName;
		this.paswd = paswd;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPaswd() {
		return paswd;
	}
	public void setPaswd(String pwd) {
		this.paswd = pwd;
	}
	

}
