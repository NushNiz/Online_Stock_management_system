package productDetails;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteProductDetails")
public class DeleteProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    
	 public DeleteProductDetails() {
	        super();
	    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String id = request.getParameter("id");
		boolean complete;
		
		complete = ProductDBUtil.deleteProductsDetails(id);
		
		if (complete == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("Success.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Unsuccess.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
	}
		
	}


