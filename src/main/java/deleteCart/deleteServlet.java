package deleteCart;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import addCart.cart;
import viewCart.viewDBUtil;

@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the parameter passed by products.jsp
		String id = request.getParameter("id");
		boolean isTrue;
		
		isTrue = deleteDBUtil.deleteItem(id);
		
		if (isTrue == true) { //if deleted from the cart, display cart1.jsp
			List<cart> productDetails = viewDBUtil.getProducts();
			request.setAttribute("productDetails", productDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("cart1.jsp");
			dis.forward(request, response);
			
		}else { //if do not deleted from the cart, display viewProducts.jsp
			List<cart> productDetails = viewDBUtil.getProducts();
			request.setAttribute("productDetails", productDetails);
			
			RequestDispatcher rdispatcher = request.getRequestDispatcher("CustomerLoginHome.jsp");
			rdispatcher.forward(request, response);
		}
	}

}
