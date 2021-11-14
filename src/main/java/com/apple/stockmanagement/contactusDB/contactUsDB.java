package com.apple.stockmanagement.contactusDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.apple.stockmanagement.contactus.contactUs;

public class contactUsDB {
	
	 /*Creating Database Connection*/
	
	private String jdbcURL="jdbc:mysql://localhost:3306/userdb";
	private String jdbcUsername="root";
	private String jdbcPassword="3661433";
	private String driverdb ="com.mysql.jdbc.Driver";
	

	public void loadDriver(String driverdb) {
		
		try {
			Class.forName(driverdb);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	//getting connection from driver
	
	public Connection getconnection() {
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	//Implimenting insert crud for Contactus 
	
	public String insert(contactUs contactss) {
		
		loadDriver(driverdb);
		Connection con = getconnection();
		String result = "Infromation Inserted Successfully";
		String sql = "insert into contactus values (?,?,?,?,?)";  //Writing SQL Query
		PreparedStatement ps;
		
		try {
			ps = con.prepareStatement(sql);		
		ps.setString(1, contactss.getFname());
		ps.setString(2, contactss.getLname());
		ps.setString(3, contactss.getEmail());
		ps.setString(4, contactss.getPhone());
		ps.setString(5, contactss.getMessage());
		ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			result ="Data not Entered";
		}
		
		
		return result;
	}
}
