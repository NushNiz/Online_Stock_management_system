package addCart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class addDBUtil {
		
		public static boolean addToCart (String id, String name, String company, String quantity, String price) {
	    	
			boolean isSuccess = false;
			
			//create the DB connection
	    	String url = "jdbc:mysql://localhost:3306/stockmanagement";
			String user = "root";
			String pwd = "3661433";
			
			try {

	    		Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection(url, user, pwd);
	    		Statement stmt = con.createStatement();
	    		
	    		//convert string to integer and string to double
	    		Integer qty = Integer.parseInt(quantity);
				double fprice = Double.parseDouble(price);
				
				//create an object from Price class
				Price pr = new Price();
				//call the method and passing the parameters 
				double p = pr.calcTotalPrice(qty, fprice);
				//convert double to string
				String pri = String.valueOf(p);
	    		//add into the database
	    		String sql = "insert into stockmanagement.cusomer1(id,name,company,qty,totalPrice) values('"+id+"', '"+name+"', '"+company+"', '"+qty+"', '"+pri+"')";
	    		
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
