package updateCart;

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

@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the parameters passed by products.jsp
		String id = request.getParameter("id");
		String quantity = request.getParameter("quantity");
		String totPrice = request.getParameter("price");
		
		boolean isTrue;
		isTrue = updateDBUtil.updateCart(id, quantity, totPrice);
		
		if(isTrue == true) { //if the cart is updated, display cart1.jsp
			List<cart> productDetails = viewDBUtil.getProducts();
			request.setAttribute("productDetails", productDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("cart1.jsp");
			dis.forward(request, response);
		}else { //if the cart is not updated, display updateQty.jsp
			List<cart> productDetails = viewDBUtil.getProducts();
			request.setAttribute("productDetails", productDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("updateQty.jsp");
			dis.forward(request, response);
		}
		
	}

}
