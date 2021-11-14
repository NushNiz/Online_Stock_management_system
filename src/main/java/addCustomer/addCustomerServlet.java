package addCustomer;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addCustomerServlet
 */
@WebServlet("/addCustomerServlet")
public class addCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the parameters passed by customerRegister.jsp
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String userName = request.getParameter("userName");
		String paswd = request.getParameter("paswd");
		
		boolean isTrue;
		
		isTrue = addCustomerDBUtil.addCustomer(id, name, email, phone, userName, paswd);
		
		if (isTrue == true) { //if added to the cart, display home
			
			RequestDispatcher rd = request.getRequestDispatcher("CustomerLoginHome.jsp");
			rd.forward(request, response);
			
		}else { //if do not added to the cart, display customerRegister.jsp
			RequestDispatcher rd = request.getRequestDispatcher("customerRegister.jsp");
			rd.forward(request, response);
		}
		
	}

	

}
