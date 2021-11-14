package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeRegServlet")
public class EmployeeRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		try {
		//String id= request.getParameter("empId");
			String name= request.getParameter("empName");
			String email=request.getParameter("empemail");
			String phone=request.getParameter("empPhone");
			String pos=request.getParameter("empPos");
			
			boolean isTrue;
			isTrue = EmployeeDBUtil.insertEmp(name, email, phone, pos);
			
			//js message 
			if(isTrue == true) {
				out.println("<script type='text/javascript'>");
				out.println("alert('Record added successfuly!');");
				out.println("location='ViewEmployeesServlet'");
				out.println("</script>");
				
			}else {
				out.println("<font color='red'>Record failed!</font>");
			}
	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
