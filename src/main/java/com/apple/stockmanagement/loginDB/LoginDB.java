package com.apple.stockmanagement.loginDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.apple.stockmanagement.loginbean.LoginStaff;

public class LoginDB {
	
	//creating database connection
	
	private String dburl = "jdbc:mysql://localhost:3306/userdb";
	private String dbuname = "root";
	private String dbpassword = "3661433";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	//loading the databaase driver
	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		
	}
	
	//getting database connection
		public Connection getConnection() {
			
			Connection con = null;
			try {
				con = DriverManager.getConnection(dburl,dbuname, dbpassword );
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return con;
		}
		
	//validating  login
		
	public boolean validate(LoginStaff loginStaff) {
		loadDriver(dbDriver) ;
		Connection con = getConnection();
		
		boolean status = false;
		String sql = "select * from staff where sname = ? and password= ?"; //writing sql query
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, loginStaff.getUsername());
			ps.setString(2, loginStaff.getPassword());
			
			ResultSet rs = ps.executeQuery();
			status = rs.next();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		return status;
		
		
	}

}
