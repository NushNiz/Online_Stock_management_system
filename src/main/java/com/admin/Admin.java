package com.admin;

public class Admin {
	private int a_id;
	private String a_name;
	private String a_email;
	private String a_phone;
	private String a_userName;
	private String a_password;
	
	public Admin(int a_id, String a_name, String a_email, String a_phone, String a_userName, String a_password) {
		super();
		this.a_id = a_id;
		this.a_name = a_name;
		this.a_email = a_email;
		this.a_phone = a_phone;
		this.a_userName = a_userName;
		this.a_password = a_password;
	}

	public int getA_id() {
		return a_id;
	}

	public String getA_name() {
		return a_name;
	}

	public String getA_email() {
		return a_email;
	}

	public String getA_phone() {
		return a_phone;
	}

	public String getA_userName() {
		return a_userName;
	}

	public String getA_password() {
		return a_password;
	}

	
}
