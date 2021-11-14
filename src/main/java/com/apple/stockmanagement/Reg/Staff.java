package com.apple.stockmanagement.Reg;


public class Staff {
	//declaring variables
	private String sname;
	private String password;
	private String email;
	private String address;
	private String phone;
	private String stype;

	
	
	public Staff() {
		super();
	}//staff default constructor

	public Staff(String sname, String password, String email, String address, String phone, String stype) {
		super();
		this.sname = sname;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.stype = stype;
	}//staff overloaded constructor

	//implimenting getters and setters 
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStype() {
		return stype;
	}

	public void setStype(String stype) {
		this.stype = stype;
	}
	
	

}
