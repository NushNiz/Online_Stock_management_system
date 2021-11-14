package com.Payment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/salesInsert")
public class salesInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();

		//String id= request.getParameter("p_id");
		String name=request.getParameter("product_n");
		String uPrice=request.getParameter("u_price");
		String ship=request.getParameter("quantity");
		//String total=request.getParameter("tot");
		String type=request.getParameter("card");
		String fname=request.getParameter("fname");
		String number=request.getParameter("number");
		String cvc=request.getParameter("cvc");
		
		boolean isTrue;
		isTrue = PaymentDBUtil.insertSales(name,uPrice, ship,type,fname, number, cvc);
		
		if(isTrue==true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Sales added successfuly!');");
			out.println("location='viewSales'");
			out.println("</script>");
		}
		else {
			out.println("<font color='red'>Record failed!</font>");
		}
	}

}
