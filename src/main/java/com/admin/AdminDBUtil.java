package com.admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AdminDBUtil {
	
	private static boolean isSuccess;
	private static Connection con=null;
	private static Statement stmt=null;
	private static ResultSet rs=null;
	
	//validation of the loggin
	public static boolean validate(String userName, String password) {
		try {
			con= adminDBConnect.getConnection();
			stmt=con.createStatement();
			String sql="select * from stockmanagemant.admin where admin_username='"+userName+"' and admin_password='"+password+"'";
			rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
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
	
	public static List<Admin> getAdmin (String userName){
		
		ArrayList<Admin> ad= new ArrayList<>();
		
		//validation
		
		try {
			con=adminDBConnect.getConnection();
			stmt=con.createStatement();
			String sql = "select * from stockmanagemant.admin where admin_username='"+userName+"'";
			rs=stmt.executeQuery(sql);
			//getting details from the db col number
			while(rs.next()) {
				int id= rs.getInt(1);
				String name=rs.getString(2);
				String email = rs.getString(3);
				String phone=rs.getString(4);
				String usern = rs.getString(5);
				String pw = rs.getString(6);
				
				Admin a = new Admin(id,name,email,phone,usern,pw);
				ad.add(a);
				
			}
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return ad;
	}
	
	
	public static boolean updateAdmin(String id, String name, String email, String phone, String username, String password) {
		
		//executeUpdate is used for insertions executeUpdate cannot be used for insertions
		//Below statement returns 2 values 1 & 0. If it returns 1 then insertion is success.
		try {
			
			con = adminDBConnect.getConnection();
			stmt = con.createStatement();
			String sql="update stockmanagemant.admin set admin_name='"+name+"', admin_email='"+email+"', admin_phone='"+phone+"', admin_username='"+username+"', admin_password='"+password+"'"+"where admin_id='"+id+"'";
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
		
		public static List<Admin> getAdminDetails(String id) {
			
			int convertId = Integer.parseInt(id);
			
			ArrayList<Admin> admin = new ArrayList<>();	
			
			//executeupdate is used for Updates and deletes executeupdate cannot be used for insertions
			
			try {
				con = adminDBConnect.getConnection();
				stmt=con.createStatement();
				String sql="select * from stockmanagemant.admin where admin_id='"+convertId+"'";
				rs=stmt.executeQuery(sql);
				
				while(rs.next()) {
					
					int aid=rs.getInt(1);
					String name=rs.getString(2);
					String email=rs.getString(3);
					String phone=rs.getString(4);
					String username=rs.getString(5);
					String password=rs.getString(6);
					
					Admin ad= new Admin(aid,name,email,phone,username,password);
					admin.add(ad);
					
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
					
			return admin;
		
		}
		
		public static boolean deleteAdmin(String id) {
			int covId=Integer.parseInt(id);
			
			//executeUpdate is used forupdates and deletes executeUpdate cannot be used for insertions
			//Below statement returns 2 values 1 & 0. If it returns 1 then insertion is success.
			
			try {
				
				con=adminDBConnect.getConnection();
				stmt=con.createStatement();
				String sql="delete from stockmanagemant.admin where admin_id='"+covId+"'";
				int r=stmt.executeUpdate(sql);
				
				if(r>0) {
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
	


