package com.apple.stockmanagement.contactusServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.apple.stockmanagement.contactus.contactUs;
import com.apple.stockmanagement.contactusDB.contactUsDB;



/**
 * Servlet implementation class contactUsServlet
 */
@WebServlet("/contactUsServlet")
public class contactUsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contactUsServlet() {
        super();
    }//default constructor of contactusServlet

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Getting data through parameters
		
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			String message = request.getParameter("message");
			contactUs contactus = new contactUs(fname,lname,email,phone,message); //creating new object of contactus
			contactUsDB sdb = new contactUsDB();
			String result = sdb.insert(contactus);
			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("ContactusSuccess.jsp");
			dispatcher.forward(request, response);
			
			
			
			
			
			
		
			}
		
		
	
		
	}

