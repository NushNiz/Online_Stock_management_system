package viewCart;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import addCart.cart;

@WebServlet("/viewServlet")
public class viewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//display cart
		List<cart> productDetails = viewDBUtil.getProducts();
		request.setAttribute("productDetails", productDetails);
			
		RequestDispatcher dis = request.getRequestDispatcher("cart1.jsp");
		dis.forward(request, response);
		
		
	}

}