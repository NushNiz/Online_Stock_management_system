package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateAdminServlet")
public class updateAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		//updating admin details using parameters
		String id=request.getParameter("adid");
		String name=request.getParameter("adname");
		String email=request.getParameter("admail");
		String phone = request.getParameter("adphone");
		String username=request.getParameter("aduname");
		String password = request.getParameter("adpass");
		
		boolean isTrue;
		
		isTrue=AdminDBUtil.updateAdmin(id, name, email, phone, username, password);
		
		if(isTrue==true) {
			
			List<Admin> adminDetails=AdminDBUtil.getAdminDetails(id);
			request.setAttribute("AdminDetails", adminDetails);
			
			RequestDispatcher dis= request.getRequestDispatcher("adminAccount.jsp");
			dis.forward(request, response);
		}
		else {
			List<Admin> adminDetails=AdminDBUtil.getAdminDetails(id);
			request.setAttribute("AdminDetails", adminDetails);
			
			RequestDispatcher dis= request.getRequestDispatcher("adminAccount.jsp");
			dis.forward(request, response);
		}
	}

}
