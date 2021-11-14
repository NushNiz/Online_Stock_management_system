package com.Payment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Payment.PaymentDBConnect;

@WebServlet("/PaymentDelete")
public class PaymentDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean isSuccess;
		 Connection con=null;
		 Statement stmt=null;
		//ResultSet rs=null;
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		try {
			
			con=PaymentDBConnect.getConnection();
			stmt=con.createStatement();
			
			
			String pid=request.getParameter("product_id");
			
			
			String sql="delete from stockmanagemant.salespayments where product_id='"+pid+"'";
			int rs=stmt.executeUpdate(sql);
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Shipment deleted!');");
			out.println("location='SalesInsert.jsp'");
			out.println("</script>");
			
			
			
	}
	catch(Exception e) {
		e.printStackTrace();
	}

}

}