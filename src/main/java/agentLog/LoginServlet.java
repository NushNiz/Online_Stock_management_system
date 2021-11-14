package agentLog;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = request.getParameter("aid");
		String password = request.getParameter("password");
		
		try {
			
			List<Agent> AgentDetails = AgentDBUtil.validate(username, password);
			request.setAttribute("AgentDetails", AgentDetails);
			
			if(AgentDetails.size()!=0) {
				RequestDispatcher disp = request.getRequestDispatcher("AgentAccount.jsp");
				disp.forward(request, response);
				}
			else {
				
				RequestDispatcher disp = request.getRequestDispatcher("agentLogin.jsp");
				disp.forward(request, response);
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
