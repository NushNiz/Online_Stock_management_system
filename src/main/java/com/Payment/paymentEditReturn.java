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

import com.Payment.PaymentDBConnect;

@WebServlet("/paymentEditReturn")
public class paymentEditReturn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//boolean isSuccess;
		 Connection con=null;
		 Statement stmt=null;
		ResultSet rs=null;
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		String pid=request.getParameter("product_id");
		
		try {
			
			con=PaymentDBConnect.getConnection();
			stmt=con.createStatement();
			String sql = "select * from stockmanagemant.salespayments where product_id='"+pid+"'";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				out.println("<br>");
				
				out.println("<link rel=\'stylesheet\' href=\'https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\' integrity=\'sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T'crossorigin=\'anonymous\'>");
				out.println("<h1>Update Shipment Data!</h1>"+"<br>");
				out.println("<form action='Paymentedit' method='post'");
				out.println("<table cellspacing='1' width='250px' border='1' class='table-success'>");
				out.println("<tr>");
				out.println("<td><b>Product Id</b><input type='text' name='product_id' id='product_id' class='form-control' readonly value='"+rs.getString("product_id") +"'</td> ");
				out.println("<br>");
				out.println("<td><b>Product Name</b><input type='text' name='product_n' id='product_n' class='form-control' readonly value='"+rs.getString("product_name")+"'</td>");
				out.println("<br>");
				out.println("<tr>");
				
				out.println("<td><b>Unit Price</b></td>");
				out.println("<td><input type='text' name='u_price' id='u_price' class='form-control' value='"+rs.getString("unit_price")+"'</td></tr>"+"<br>");
				
				out.println("<td><b>Shipment</b></td>");
				out.println("<td><input type='text' name='quantity' id='quantity' class='form-control' value='"+rs.getString("shipment")+"'</td></tr>"+"<br>");
				
				//out.println("<td><b>Total price</b></td>");
				//out.println("<td><input type='text' name='total' id='total' class='form-control' value='"+rs.getString("total_price")+"'</td></tr>"+"<br>");
				
				out.println("<td><b>Card Type</b></td>");
				out.println("<td><input type='text' name='card' id='card' class='form-control' readonly value='"+rs.getString("card_type")+"'</td></tr>"+"<br>");
				
				out.println("<td><b>Full Name</b></td>");
				out.println("<td><input type='text' name='fname' id='fname' class='form-control' readonly value='"+rs.getString("full_name")+"'</td></tr>"+"<br>");
				
				out.println("<td><b>Card number</b></td>");
				out.println("<td><input type='text' name='number' id='number' class='form-control' readonly value='"+rs.getString("card_no")+"'</td></tr>"+"<br>");
				
				out.println("<td><b>CVC</b></td>");
				out.println("<td><input type='text' name='cvc' id='cvc' class='form-control' readonly value='"+rs.getString("cvc")+"'</td></tr>"+"<br>");
				
				out.println("<td colspan='2'><input type='submit' value='Edit' class='btn btn-outline-info' </td></tr>");
				
				
				out.println("</table>");
				
				out.println("</form>");
			}
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
