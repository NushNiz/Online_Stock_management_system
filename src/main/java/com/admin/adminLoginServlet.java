package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adminLoginServlet")
public class adminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//in order to use js must use printwriter and set content type
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String username= request.getParameter("uname");
		String password = request.getParameter("pass");
		
		boolean isTrue;
		isTrue=AdminDBUtil.validate(username, password);
		
		if(isTrue==true) {
			List<Admin> adminDetails=AdminDBUtil.getAdmin(username);
			request.setAttribute("AdminDetails", adminDetails);
			
			RequestDispatcher dis=request.getRequestDispatcher("adminAccount.jsp");
			dis.forward(request, response);
		}
		//Js message 
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your Username or Password is incorrect!');");
			out.println("location='adminLogin.jsp'");
			out.println("</script>");
		}
		
		
	} 
	
}
	


