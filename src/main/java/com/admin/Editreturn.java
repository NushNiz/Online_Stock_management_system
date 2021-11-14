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

@WebServlet("/Editreturn")
public class Editreturn extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//boolean isSuccess;
		 Connection con=null;
		 Statement stmt=null;
		ResultSet rs=null;
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		//Setting bg image
		out.println("<style type='text/css'>" + 
				"	body{" + 
				"		font-family: Hind Semibold;" + 
				"		background-image: url('images/updateEmp.jpg');"+
				"		background-repeat: no-repeat;"+
				"		background-attachment: fixed;"+
				"		background-size: cover;"+
				"}"+
				"</style>");
		
		String eid=request.getParameter("empID");
		
		//execute query is used for updates and deletes
		try {
			
				con=adminDBConnect.getConnection();
				stmt=con.createStatement();
				String sql = "select * from employee where empID='"+eid+"'";
				rs=stmt.executeQuery(sql);
				
				//Catching all the delatils and updating using js
				while(rs.next()) {
					out.println("<br>");
					
					out.println("<link rel=\'stylesheet\' href=\'https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\' integrity=\'sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T'crossorigin=\'anonymous\'>");
					out.println("<h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Update Employee Data!</h1>"+"<br>");
					out.println("<form action='EditServlet' method='post'");
					out.println("<table cellspacing='1' width='50px' border='1'>");
					out.println("<tr>");
					out.println("<td><b>&nbsp;&nbsp;&nbsp;&nbsp;Emp Id</b><input type='text' name='empID' id='empID' class='form-control' readonly value='"+rs.getString("empID") +"'</td> ");
					out.println("<br>");
					out.println("<td><b>&nbsp;&nbsp;&nbsp;&nbsp;Emp Name</b><input type='text' name='empName' id='empName' class='form-control' value='"+rs.getString("empName")+"'</td>");
					out.println("<br>");
					out.println("</tr>");
					out.println("<tr>");
					out.println("<td><b>&nbsp;&nbsp;&nbsp;&nbsp;Emp Email</b></td>");
					out.println("<td><input type='text' name='empEmail' id='empEmail' class='form-control' value='"+rs.getString("empEmail")+"'</td></tr>"+"<br>");
					
					out.println("<td><b>&nbsp;&nbsp;&nbsp;&nbsp;Emp Phone</b></td>");
					out.println("<td><input type='text' name='empPhone' id='empPhone' class='form-control' value='"+rs.getString("empPhone")+"'</td></tr>"+"<br>");
					
					out.println("<td><b>&nbsp;&nbsp;&nbsp;&nbsp;Emp Pos</b></td>");
					out.println("<td><input type='text' name='empPos' id='empPos' class='form-control' readonly value='"+rs.getString("empPosition")+"'</td></tr>"+"<br>");
					
					out.println("<td colspan='2'>&nbsp;&nbsp;&nbsp;&nbsp;<input type='submit' value='Edit' class='btn btn-secondary' </td></tr>");
					
					
					out.println("</table>");
					
					out.println("</form>");
				}
				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}

	}


