package productsPage;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/productsServlet")
public class productsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//display products retrieved from the database
		List<Products> productDetails = productsDBUtil.getProducts();
		request.setAttribute("productDetails", productDetails);
			
		RequestDispatcher dis = request.getRequestDispatcher("products.jsp");
		dis.forward(request, response);
		
		
	}

}