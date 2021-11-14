package com.apple.stockmanagement.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;


import com.apple.stockmanagement.bean.Stock_D;
import com.apple.stockmanagement.dao.Stock_DB;

@WebServlet("/")
public class Stock_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private Stock_DB stock_db;
       
 
	public void init(ServletConfig config) throws ServletException {
		stock_db = new Stock_DB();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		//gettinf actions to switch 
	try {
		switch(action) {
		case "/new":showNewForm(request, response);
			break;
		
		case "/insert":insertStock(request, response);
			break;
		
		case "/delete":deleteStock(request, response);
			break;
			
		case "/edit":showEditForm(request, response);
			break;
		
		case "/update":updateStock(request, response);
			break;
			
		default:listUser(request, response);
			break;
		}
		}catch(SQLException ex) {
			throw new ServletException(ex);
		
	}
			
		
	}
	
	//implimenting listUser method
	private void listUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
		List<Stock_D> listUser = stock_db.selectAllStocks();
		request.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
		dispatcher.forward(request, response);

		
	}
	//implimenting updatestock method
	private void updateStock(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String company = request.getParameter("company");
		String price = request.getParameter("price");
		String quantity = request.getParameter("quantity");
		String exp_date = request.getParameter("exp_date");
		String discripition = request.getParameter("discripition");
		
		Stock_D user = new Stock_D(id, name, company, price, quantity,exp_date,discripition);
		stock_db.updateStock(user);
		response.sendRedirect("list");
		

		
	}

	//implimenting showdetails method
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Stock_D existingStock = stock_db.selectStock(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		request.setAttribute("stock",existingStock);
		dispatcher.forward(request, response);
		
		
	}
	//implimenting deletestock method
	private void deleteStock(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException{
		int id = Integer.parseInt(request.getParameter("id"));
		stock_db.deleteStock(id);
		response.sendRedirect("list");
		
		
	}
	//implimenting insertstock method
	private void insertStock(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		String name = request.getParameter("name");
		String company = request.getParameter("company");
		String price = request.getParameter("price");
		String quantity = request.getParameter("quantity");
		String exp_date = request.getParameter("exp_date");
		String discripition = request.getParameter("discripition");
		
		Stock_D newstock = new Stock_D(name, company, price, quantity,exp_date,discripition);
		stock_db.insertStock(newstock);
		response.sendRedirect("list");
		
	}
	//implimenting shownewform method
	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		dispatcher.forward(request, response);
		
	}
	

		

		

	

}
