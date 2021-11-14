package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		boolean isSuccess;
		 Connection con=null;
		 Statement stmt=null;
		//ResultSet rs=null;
		
		//in order to use js must use printwriter and set content type
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		//getting details that to be update
		
		try {
			
				con=adminDBConnect.getConnection();
				stmt=con.createStatement();
				
				
				String empid=request.getParameter("empID");
				String empname=request.getParameter("empName");
				String empemail=request.getParameter("empEmail");
				String empphone=request.getParameter("empPhone");
				String emppos=request.getParameter("empPos");
				
				String sql="update employee set empName='"+empname+"', empEmail='"+empemail+"' ,empPhone='"+empphone+"', empPosition='"+emppos+"'"+"where empID='"+empid+"'";
				int rs=stmt.executeUpdate(sql);
				
				
				out.println("<script type='text/javascript'>");
				out.println("alert('Data added Successfuly!');");
				out.println("location='ViewEmployeesServlet'");
				out.println("</script>");
				
				
				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}

	}


