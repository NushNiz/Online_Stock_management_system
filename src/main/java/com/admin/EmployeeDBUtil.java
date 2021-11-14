package com.admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDBUtil {
	private static boolean isSuccess;
	private static Connection con=null;
	private static Statement stmt=null;
	private static ResultSet rs=null;
	
	public static boolean insertEmp(String name, String email, String phone,String pos) {
		 isSuccess=false;
		
		try {
			
			con=adminDBConnect.getConnection();
			stmt=con.createStatement();
			String sql ="insert into employee values(0,'"+name+"','"+email+"','"+phone+"','"+pos+"')" ;
			
			//executeUpdate is used for insertions executeQuery cannot be used for insertions
			//Below statement returns 2 values 1 & 0. If it returns 1 then insertion is success.
			
			int rs=stmt.executeUpdate(sql);
			

			if(rs>0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
		
	}
	

}