package com.apple.stockmanagement.contactus;

	public class contactUs {
	
	private String fname;	//Declaring Variables
	private String lname;
	private String email;
	private String phone;
	private String message;
	
	public contactUs() {
		super();
	} //default constructor

	public contactUs(String fname, String lname, String email, String phone, String message) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.message = message;
	} //overloaded constructor

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
