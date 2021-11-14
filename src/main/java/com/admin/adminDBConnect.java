package com.admin;

import java.sql.Connection;
//Db connection details
import java.sql.DriverManager;

public class adminDBConnect {
	
	private static String url = "jdbc:mysql://localhost:3306/stockmanagemant";
	private static String user = "root";
	private static String pass ="3661433";
	private static Connection con;
		
		public static Connection getConnection() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				con= DriverManager.getConnection(url, user, pass);
			}
			catch(Exception e) {
				System.out.println("Database connection is not successful !!");
			}
			
			return con;
		}

	}

