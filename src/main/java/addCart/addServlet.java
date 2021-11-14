package addCart;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import viewCart.viewDBUtil;

@WebServlet("/addServlet")
public class addServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the parameters passed by products.jsp
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String company = request.getParameter("company");
		String quantity = request.getParameter("quantity");
		String price = request.getParameter("price");
		
		boolean isTrue;
		
		isTrue = addDBUtil.addToCart(id, name, company, quantity, price);
		
		if (isTrue == true) { //if added to the cart, display cart1.jsp
			List<cart> productDetails = viewDBUtil.getProducts();
			request.setAttribute("productDetails", productDetails);
			
			RequestDispatcher rd = request.getRequestDispatcher("cart1.jsp");
			rd.forward(request, response);
			
		}else { //if do not added to the cart, display viewProducts.jsp
			RequestDispatcher rd = request.getRequestDispatcher("viewProducts.jsp");
			rd.forward(request, response);
		}
	}

}