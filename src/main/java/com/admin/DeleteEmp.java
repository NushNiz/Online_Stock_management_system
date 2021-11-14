package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteEmp")
public class DeleteEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean isSuccess;
		 Connection con=null;
		 Statement stmt=null;
		//ResultSet rs=null;
		
		//in order to use js must use printwriter and set content type
		 
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		
		
		try {
			
				con=adminDBConnect.getConnection();
				stmt=con.createStatement();
				
				
				String empid=request.getParameter("empID");
				
				
				String sql="delete from employee where empID='"+empid+"'";
				int rs=stmt.executeUpdate(sql);
				
				//Js message
				
				out.println("<script type='text/javascript'>");
				out.println("alert('Account deleted!');");
				out.println("location='AddEmployee.jsp'");
				out.println("</script>");
				
				
				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}

}
