package com.apple.stockmanagement.regDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.apple.stockmanagement.Reg.Staff;

public class SRegisterDB {
	
	//creating database connection
	private String urldb = "jdbc:mysql://localhost:3306/userdb";
	private String unamedb = "root";
	private String passworddb ="3661433";
	private String driverdb ="com.mysql.jdbc.Driver";
	
	//loading mysql driver
	public void loadDriver(String driverdb) {
		
		try {
			Class.forName(driverdb);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	//get database connection
	public Connection getconnection() {
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(urldb,unamedb,passworddb);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	}
	
	
	public String insert(Staff staff) {
		
		loadDriver(driverdb);
		
		Connection con = getconnection();
		
		String result = "Infromation Inserted Successfully";
		//inserting values through sql query
		String sql = "insert into staff values (?,?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);		
		ps.setString(1, staff.getSname());
		ps.setString(2, staff.getPassword());
		ps.setString(3, staff.getEmail());
		ps.setString(4, staff.getPhone());
		ps.setString(5, staff.getAddress());
		ps.setString(6, staff.getStype());
		ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			result ="Data not Entered";
		}
		
		
		return result;
	}

}
