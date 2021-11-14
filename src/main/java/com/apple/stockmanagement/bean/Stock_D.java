package com.apple.stockmanagement.bean;

public class Stock_D {
	//declaring variables 
	protected int id;
	protected String name;
	protected String company;
	protected String price;
	protected String quantity;
	protected String exp_date;
	protected String discripition;
	
	public Stock_D() {
	}//Stock default Constructor

	public Stock_D(String name, String company, String price, String quantity, String exp_date, String discripition) {
		super();
		this.name = name;
		this.company = company;
		this.price = price;
		this.quantity = quantity;
		this.exp_date = exp_date;
		this.discripition = discripition;
	}//Stock overloaded constructor

	public Stock_D(int id, String name, String company, String price, String quantity, String exp_date,
			String discripition) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
		this.quantity = quantity;
		this.exp_date = exp_date;
		this.discripition = discripition;
	}//Stock overloaded constructor

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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getExp_date() {
		return exp_date;
	}

	public void setExp_date(String exp_date) {
		this.exp_date = exp_date;
	}

	public String getDiscripition() {
		return discripition;
	}

	public void setDiscripition(String discripition) {
		this.discripition = discripition;
	}
	
	
	

}
