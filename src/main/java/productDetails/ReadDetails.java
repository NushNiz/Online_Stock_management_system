package productDetails;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import productDetails.Product;
import productDetails.ProductDBUtil;

@WebServlet("/ReaddDetails")
public class ReadDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//String id = request.getParameter("id");
		
		

		try {
			
			List<Product> ReadDetails = ProductDBUtil.getProductDetails();
			request.setAttribute("ReadDetails", ReadDetails);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher disp = request.getRequestDispatcher("ProductAccount.jsp");
		disp.forward(request, response);
		
		
		
		
	}

}
