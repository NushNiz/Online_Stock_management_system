package com.admin;

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

@WebServlet("/ViewEmployeesServlet")
public class ViewEmployeesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 boolean isSuccess;
		 Connection con=null;
		 Statement stmt=null;
		ResultSet rs=null;
		
		//in order to use js must use printwriter and set content type
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.println("<body>"+
					"<div style='background-image: linear-gradient(#360033, #0b8793); height:1000px;'>"
					);
		try {
			
				con=adminDBConnect.getConnection();
				stmt=con.createStatement();
				String sql = "select * from employee";
				rs=stmt.executeQuery(sql);
			out.println("<br>");
			out.println("<br>");
			
			out.println("<link rel=\'stylesheet\' href=\'https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\' integrity=\'sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T'crossorigin=\'anonymous\'>");	
			out.println("<table cellspacing='0' width='350px' border='1' class='table table-hover'>");
			out.println("<tr  class='table-light'>");
			
			out.println("<td><b> EmpId </b></td>");
			out.println("<td><b> Emp Name</b> </td>");
			out.println("<td><b> Emp Email </b> </td>");
			out.println("<td><b> Emp Phone </b></td>");
			out.println("<td><b> Emp Position </b></td>");
			out.println("<td><b> Edit </b></td>");
			out.println("<td><b> Delete </b></td>");
			
			out.println("</tr>");
				while(rs.next()) {
					out.println("<tr class='table-secondary'>");
					out.println("<td>"+rs.getString("empID")+ "</td>");
					out.println("<td>"+rs.getString("empName")+ "</td>");
					out.println("<td>"+rs.getString("empEmail")+ "</td>");
					out.println("<td>"+rs.getString("empPhone")+ "</td>");
					out.println("<td>"+rs.getString("empPosition")+ "</td>");
					
					out.println("<td>"+"<a href='Editreturn?empID=" + rs.getString("empID")+ "'>"+"<input type='submit\' name=\'submit\' value=\'Edit\' class=\'btn btn-outline-info\'>"+"</a>" +"</td>");
					out.println("<td>"+"<a href='DeleteEmp?empID=" + rs.getString("empID")+ "'>"+"<input type='submit\' name=\'submit\' value=\'Delete\' class=\'btn btn-outline-info\'>"+"</a>" +"</td>");
					out.println("</tr>");
				}
			out.println("</table>");
			out.println("<a href='AddEmployee.jsp'>"+"<input  type='submit\' name=\'submit\' value=\'Back\' class=\'btn btn-outline-info\'>"+"</a>");
			out.println("</div>"+"</body>");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
		

}
