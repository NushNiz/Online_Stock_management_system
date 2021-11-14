package addCustomer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class addCustomerDBUtil {
	
	public static boolean addCustomer (String id, String name, String email, String phone, String userName, String paswd) {
    	
		boolean isSuccess = false;
		
		//create the DB connection
    	String url = "jdbc:mysql://localhost:3306/stockmanagement";
		String user = "root";
		String pwd = "3661433";
		
		try {

    		Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pwd);
    		Statement stmt = con.createStatement();
    		//add into the database
    		String sql = "insert into  stockmanagement.cusomerlogin(id,name,email,phone,userName,pwd) values(0, '"+name+"', '"+email+"', '"+phone+"', '"+userName+"', '"+paswd+"')";
    		
    		int rs = stmt.executeUpdate(sql);
			
    		if(rs>0) {
    			isSuccess = true;
    		}else {
    			isSuccess = false;
    		}
    		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}

}
