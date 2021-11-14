package productsPage;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/staffViewProductsServlet")
public class staffViewProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//display the staff view of the products
		List<Products> productDetails = productsDBUtil.getProducts();
		request.setAttribute("productDetails", productDetails);
			
		RequestDispatcher dis = request.getRequestDispatcher("staffViewProducts.jsp");
		dis.forward(request, response);
		
		
	}

}