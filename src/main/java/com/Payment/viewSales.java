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

import com.Payment.PaymentDBUtil;


@WebServlet("/viewSales")
public class viewSales extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 boolean isSuccess;
		 Connection con=null;
		 Statement stmt=null;
		ResultSet rs=null;
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		try {
			
				con=PaymentDBConnect.getConnection();
				stmt=con.createStatement();
				String sql = "select * from stockmanagemant.salespayments;";
				rs=stmt.executeQuery(sql);
				
				out.println("<br>");
				out.println("<br>");
				out.println("<link rel=\'stylesheet\' href=\'https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\' integrity=\'sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T'crossorigin=\'anonymous\'>");	
				out.println("<table cellspacing='0' width='350px' border='1' class='table table-success table-striped'>");
				out.println("<h1>");
				out.println("<center>");
				out.println("Shipment Details");
				out.println("</h1>");
				out.println("</center>");
				out.println("<tr>");
				out.println("<td> Product ID </td>");
				out.println("<td> Product Name </td>");
				out.println("<td> Unit price </td>");
				out.println("<td> Shipment </td>");
				out.println("<td> Total Price</td>");
				out.println("<td> Card type</td>");
				out.println("<td> Full name</td>");
				out.println("<td> Card number</td>");
				out.println("<td> CV </td>");
				
				out.println("<td> Edit</td>");
				out.println("<td> Delete</td>");
				
				out.println("</tr>");
					while(rs.next()) {
						out.println("<tr>");
						out.println("<td>"+rs.getString("product_id")+ "</td>");
						out.println("<td>"+rs.getString("product_name")+ "</td>");
						out.println("<td>"+rs.getString("unit_price")+ "</td>");
						out.println("<td>"+rs.getString("shipment")+ "</td>");
						out.println("<td>"+rs.getString("total_price")+ "</td>");
						out.println("<td>"+rs.getString("card_type")+ "</td>");
						out.println("<td>"+rs.getString("full_name")+ "</td>");
						out.println("<td>"+rs.getString("card_no")+ "</td>");
						out.println("<td>"+rs.getString("cvc")+ "</td>");
						
						out.println("<td>"+"<a href='paymentEditReturn?product_id=" + rs.getString("product_id")+ "'>"+"<input type='submit' name='submit' value='Edit' class='btn btn-outline-info'>"+"</a>" +"</td>");
						out.println("<td>"+"<a href='PaymentDelete?product_id=" + rs.getString("product_id")+ "'>"+"<input type='submit' name='submit' value='Delete' class='btn btn-outline-info'>"+"</a>" +"</td>");
						
						out.println("</tr>");
					}
				out.println("</table>");
				out.println("<a href='SalesInsert.jsp'>"+"<input  type='submit\' name=\'submit\' value=\'Back\' class=\'btn btn-outline-info\'>"+"</a>");
			
	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}


