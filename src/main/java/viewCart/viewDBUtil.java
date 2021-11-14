package viewCart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import addCart.cart;

public class viewDBUtil {

	 public static List<cart> getProducts() {
	    	
	    	ArrayList<cart> product = new ArrayList<>();
	    	
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
	    		String sql = "select * from  stockmanagement.cusomer1";
	    		
	    		ResultSet rs = stmt.executeQuery(sql);
	    		rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    			int id = rs.getInt(1);
	    			String name = rs.getString(2);
	    			String company = rs.getString(3);
	    			String quantity = rs.getString(4);
	    			String totPrice = rs.getString(5);
	    			
	    			cart c = new cart(id, name, company, quantity, totPrice);
	    			product.add(c);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}	
	    	return product;	
	    }
}
