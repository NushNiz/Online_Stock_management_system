package com.Payment;

import java.sql.Connection;
//import java.sql.ResultSet;
import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;



public class PaymentDBUtil {
	

	private static boolean isSuccess;
	private static Connection con=null;
	private static Statement stmt=null;
	//private static ResultSet rs=null;
	
	
	public static boolean insertSales(String pname,String uniPrice, String qtty,String card,String name, String no, String cvc) {
		
		isSuccess = false;
		
		try {
			
			con = PaymentDBConnect.getConnection();
			stmt = con.createStatement();
			
    		Integer qty = Integer.parseInt(qtty);
			double fprice = Double.parseDouble(uniPrice);
			
			Sales pr = new Sales();
			double p = pr.calcTotalPrice(qty, fprice);
			String pri = String.valueOf(p);
			
			
			String sql="insert into  stockmanagemant.salespayments values (0,'"+pname+"','"+uniPrice+"','"+qtty+"','"+pri+"','"+card+"','"+name+"','"+no+"','"+cvc+"')";
			int rs= stmt.executeUpdate(sql);
			
			
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
