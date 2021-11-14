package customerLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDBUtil {
	
	public static List<Customer> validate(String username, String password){
		
		ArrayList<Customer> cust = new ArrayList<>();
		
		//create the DB connection
		String url = "jdbc:mysql://localhost:3306/stockmanagement";
		String user = "root";
		String pwd = "3661433";
				
		//validate
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pwd);
			Statement stmt = con.createStatement();
			//retrieve from database
			String sql = "select * from  stockmanagement.cusomerlogin where userName ='"+username+"' and pwd='"+password+"'";
			
			ResultSet results = stmt.executeQuery(sql);
			if(results.next()) {
				int id = results.getInt(1);
				String name = results.getString(2);
				String email = results.getString(3);
				String phone = results.getString(4);
				String userName = results.getString(5);
				String paswd = results.getString(6);
				
				Customer c = new Customer(id, name, email, phone, userName, paswd);
				cust.add(c);
			}
					
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return cust;
	}

}
