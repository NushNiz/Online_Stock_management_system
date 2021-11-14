package updateCart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class updateDBUtil {
	
	public static boolean updateCart(String id, String quantity, String price){
		
		boolean isSuccess = false;
		
		//create the DB connection
		String url = "jdbc:mysql://localhost:3306/stockmanagement";
		String user = "root";
		String pwd = "3661433";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			

			Connection con = DriverManager.getConnection(url, user, pwd);
			Statement stmt = con.createStatement();
			
			String q = null;
			//retrieve from database
			String sql2 = "select qty from  stockmanagement.cusomer1 where id='"+id+"'";
			ResultSet rs2 = stmt.executeQuery(sql2);
			while(rs2.next()) {
			q = rs2.getString("qty");
			}
			//convertion of data types
			Integer qty1 = Integer.parseInt(q);
			Integer qty2 = Integer.parseInt(quantity);
			double fprice = Double.parseDouble(price);
			
			UpdatedPrice pr = new UpdatedPrice();
			double p = pr.calcTotal_UpdatePrice(qty1, qty2, fprice);
			String pri = String.valueOf(p);
			//update the database
    		String sql = "update  stockmanagement.cusomer1 set qty ='"+qty2+"'"+", totalPrice = '"+pri+"'"+ "where id='"+id+"'";
    		
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
