package productDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StockDBUtil implements Common{

	//method to get the details of the products where quantity less than 10
	public static List<Stock> getProductDetails(){
		
		ArrayList<Stock> prdt = new ArrayList<>();
		
		String url ="jdbc:mysql://localhost:3306/stockmanagement";
		String user = "root";
		String pw = "3661433";
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,pw);
			Statement stm = con.createStatement();
			
			String sql = "select * from stockmanagement.stocks where Quantity < 10";
			ResultSet result = stm.executeQuery(sql);
			
			while(result.next()) {
				String ID =result.getString(1);
				String Name =result.getString(2);
				String Company =result.getString(3);
				String Price =result.getString(4);
				String Quantity =result.getString(5);
				String ExpireDate =result.getString(6);
				String Description =result.getString(7);
				
			
				Stock s = new Stock(ID,Name,Company,Price,Quantity,ExpireDate,Description);
				prdt.add(s);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return prdt;
		
		
	}

}
