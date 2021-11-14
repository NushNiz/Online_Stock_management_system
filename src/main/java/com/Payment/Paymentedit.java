package com.Payment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.Payment.*;

@WebServlet("/Paymentedit")
public class Paymentedit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//boolean isSuccess;
		 Connection con=null;
		 Statement stmt=null;
		ResultSet rs2;
		 
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();

		

		try {
			
				con=PaymentDBConnect.getConnection();
				stmt=con.createStatement();
				
				String pid=request.getParameter("product_id");
				String pname=request.getParameter("product_n");
				String uprice=request.getParameter("u_price");
				String ship=request.getParameter("quantity");
				//String tot=request.getParameter("total");
				String ctype=request.getParameter("card");
				String fname=request.getParameter("fname");
				String cno=request.getParameter("number");
				String cvc=request.getParameter("cvc");
				
				String q = null;
				String sql2 = "select shipment from stockmanagemant.salespayments where product_id='"+pid+"'";
				rs2 = stmt.executeQuery(sql2);
				
				//Integer qty1 = Integer.parseInt(q);
				Integer qty2 = Integer.parseInt(ship);
				double fprice = Double.parseDouble(uprice);
				
				updatePayment pr = new updatePayment();
				double p = pr.calcTotal_UpdatePrice(qty2, fprice);
				String pri = String.valueOf(p);
				
				String sql="update stockmanagemant.salespayments set product_name='"+pname+"', unit_price='"+uprice+"' ,shipment='"+qty2+"', total_price='"+pri+"',card_type='"+ctype+"',full_name='"+fname+"',card_no='"+cno+"',cvc='"+cvc+"'"+"where product_id='"+pid+"'";
				int rs=stmt.executeUpdate(sql);
				
				
				out.println("<script type='text/javascript'>");
				out.println("alert('Data added Successfuly!');");
				out.println("location='viewSales'");
				out.println("</script>");
				
				
				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}



