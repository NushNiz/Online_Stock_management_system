package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteAdminServlet")
public class DeleteAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("adid");
		
		boolean isTrue;
		isTrue=AdminDBUtil.deleteAdmin(id);
		
		if(isTrue==true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("adminInsert.jsp");
			dispatcher.forward(request, response);
		}
		else {
			List<Admin> adminDetails=AdminDBUtil.getAdminDetails(id);
			request.setAttribute("AdminDetails", adminDetails);
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("adminAccount.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
