package productsPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class productsDBUtil {

	 public static List<Products> getProducts() {
	    	
	    	ArrayList<Products> product = new ArrayList<>();
	    	
	    	//create the DB connection
	    	String url = "jdbc:mysql://localhost:3306/stockmanagement";
			String user = "root";
			String pwd = "3661433";
	    	
	    	try {
	    		
	    		Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection(url, user, pwd);
	    		Statement stmt = con.createStatement();
	    		//retrieve from database
	    		String sql = "select * from  stockmanagement.stock";
	    		
	    		ResultSet rs = stmt.executeQuery(sql);
	    		rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    			int id = rs.getInt(1);
	    			String name = rs.getString(2);
	    			String company = rs.getString(3);
	    			String price = rs.getString(4);
	    			String quantity = rs.getString(5);
	    			String exp_date = rs.getString(6);
	    			String description = rs.getString(7);
	    			
	    			Products c = new Products(id, name, company, price, quantity, exp_date, description);
	    			product.add(c);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}	
	    	return product;	
	    }
}
