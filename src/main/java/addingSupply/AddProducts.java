package addingSupply;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddProducts
 */
@WebServlet("/AddProducts")
public class AddProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String company = request.getParameter("company");
		String quantity = request.getParameter("qty");
		String description = request.getParameter("description");
		
		boolean complete;
		
		complete = ProductDBUtil.addProductDetails(id,name, company, quantity, description);
		
		if(complete == true) {
			RequestDispatcher disp1 = request.getRequestDispatcher("SuccessA.jsp");
			disp1.forward(request, response);
			
		}
		else {
			RequestDispatcher disp2 = request.getRequestDispatcher("UnsuccessA.jsp");
			disp2.forward(request, response);
		}
		
	}
		
	}


