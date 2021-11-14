package addingSupply;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import addingSupply.AddingProducts;

public class ProductDBUtil {
	
	//insertProductDetails method to insert details
	public static boolean insertProductDetails(String id, String name, String price, String company, String description) {
		
		boolean complete = false;
		
		String url ="jdbc:mysql://localhost:3306/stockmanagement";
		String user = "root";
		String pw = "3661433";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,pw);
			Statement stm = con.createStatement();
			
			String sql = "insert into stockmanagement.productdetails values ('"+id+"', '"+name+"', '"+price+"', '"+company+"', '"+description+"')";
			int result = stm.executeUpdate(sql);
			
			if(result > 0) {
				complete = true;
			}
			
			else
				complete = false;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return complete;
	}
	
	//updateProductDetails method to update details
	public static boolean updateProductDetails(String id, String name, String price, String company, String description) {
		
		boolean complete = false;
		
		String url ="jdbc:mysql://localhost:3306/stockmanagement";
		String user = "root";
		String pw = "3661433";
		
try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,pw);
			Statement stm = con.createStatement();
			
			String sql = "update stockmanagement.productdetails set Name='"+name+"',Price='"+price+"', Company='"+company+"', Description='"+description+"' "
					+ "where ProductID='"+id+"'";
			int result = stm.executeUpdate(sql);
			
			if(result > 0) {
				complete = true;
			}
			
			else
				complete = false;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return complete;
	}
	
	//method to read details of products
	public static List<Product> getProductDetails(){
		
		ArrayList<Product> prdt = new ArrayList<>();
		
		String url ="jdbc:mysql://localhost:3306/stockmanagement";
		String user = "root";
		String pw = "3661433";
		
		
try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,pw);
			Statement stm = con.createStatement();
			
			String sql = "select * from stockmanagement.productdetails";
			ResultSet result = stm.executeQuery(sql);
			
			while(result.next()) {
				String ID =result.getString(1);
				String Name =result.getString(2);
				String Price =result.getString(3);
				String Company =result.getString(4);
				String Description =result.getString(5);
				
				
				Product p = new Product(ID,Name,Price,Company,Description);
				prdt.add(p);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return prdt;
		
		
	}
	
	//adding product details mehtod
	public static boolean addProductDetails(String id,String name, String company, String quantity, String description) {
		
		boolean complete = false;
		
		String url ="jdbc:mysql://localhost:3306/stockmanagement";
		String user = "root";
		String pw = "3661433";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,pw);
			Statement stm = con.createStatement();
			
			String sql = "insert into stockmanagement.addproducts  values ('"+id+"','"+name+"', '"+company+"', '"+quantity+"', '"+description+"')";
			int result = stm.executeUpdate(sql);
			
			if(result > 0) {
				complete = true;
			}
			
			else
				complete = false;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return complete;
	}
	
	//mehtod to read added product details
	public static List<AddingProducts> getAddedProductDetails(){
		
		ArrayList<AddingProducts> prdt = new ArrayList<>();
		
		String url ="jdbc:mysql://localhost:3306/stockmanagement";
		String user = "root";
		String pw = "3661433";
		
		
try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,pw);
			Statement stm = con.createStatement();
			
			String sql = "select * from stockmanagement.addproducts";
			ResultSet result = stm.executeQuery(sql);
			
			while(result.next()) {
				String ID =result.getString(1);
				String Name =result.getString(2);
				String Company =result.getString(3);
				String Quantity =result.getString(4);
				String Description =result.getString(5);
				
				
				AddingProducts p = new AddingProducts(ID,Name,Company,Quantity,Description);
				prdt.add(p);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return prdt;
		
		
	}
	
	
	
	//method to update added product details 
	public static boolean updateAddedProductDetails(String id, String name,  String company, String quantity, String description) {
		
		boolean complete = false;
		
		String url ="jdbc:mysql://localhost:3306/stockmanagement";
		String user = "root";
		String pw = "3661433";
		
try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,pw);
			Statement stm = con.createStatement();
			
			String sql = "update stockmanagement.addproducts set Name='"+name+"',Company='"+company+"', Quantity='"+quantity+"', Description='"+description+"' "
					+ "where ID='"+id+"'";
			int result = stm.executeUpdate(sql);
			
			if(result > 0) {
				complete = true;
			}
			
			else
				complete = false;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return complete;
	}
	
	
	
	
	
	
	
	
	

}
