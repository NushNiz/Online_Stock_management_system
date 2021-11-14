package com.apple.stockmanagement.loginservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.apple.stockmanagement.loginDB.LoginDB;
import com.apple.stockmanagement.loginbean.LoginStaff;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		LoginStaff loginstaff = new LoginStaff();
		loginstaff.setUsername(username);
		loginstaff.setPassword(password);
		
		LoginDB logindb = new LoginDB();
		if(logindb.validate(loginstaff)) {
			
			response.sendRedirect("StaffHome.jsp");
		}
		//display alert if User Name OR Password is Incorrcet
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('User Name OR Password is Incorrcet.! Please Try Again');");
			out.println("location='StaffLogin.jsp'");
			out.println("</script>");
		}
	}

}
