package com.Payment;

public class Payment {
	
	private int p_id;
	private String p_name;
	private String uni_price;
	private String ship;
	private String tot;
	private String c_type;
	private String f_name;
	private String no;
	private String cvc;
	
	
	public Payment(int p_id, String p_name, String uni_price, String ship, String tot, String c_type, String f_name,
			String no, String cvc) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.uni_price = uni_price;
		this.ship = ship;
		this.tot = tot;
		this.c_type = c_type;
		this.f_name = f_name;
		this.no = no;
		this.cvc = cvc;
	}
	
	
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getUni_price() {
		return uni_price;
	}
	public void setUni_price(String uni_price) {
		this.uni_price = uni_price;
	}
	public String getShip() {
		return ship;
	}
	public void setShip(String ship) {
		this.ship = ship;
	}
	public String getTot() {
		return tot;
	}
	public void setTot(String tot) {
		this.tot = tot;
	}
	public String getC_type() {
		return c_type;
	}
	public void setC_type(String c_type) {
		this.c_type = c_type;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getCvc() {
		return cvc;
	}
	public void setCvc(String cvc) {
		this.cvc = cvc;
	}

}
