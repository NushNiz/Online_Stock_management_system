package customerLogin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cusLoginServlet")
public class cusLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the parameters passed by customerLogin.jsp
		String username = request.getParameter("uid");
		String password = request.getParameter("pwd");
		
		
		try {
			List<Customer> customerDetails = CustomerDBUtil.validate(username, password);
			request.setAttribute("customerDetails", customerDetails);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("CustomerLoginHome.jsp");
		dis.forward(request, response);
	
		}
		
}