package feedback;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddFeedback")
public class AddFeedback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  public AddFeedback() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = request.getParameter("username");
		String name = request.getParameter("name");
		String status = request.getParameter("status");
		String rating = request.getParameter("rating");
		String comment = request.getParameter("comment");
		
		boolean complete;
		
		complete = FeedbackDBUtil.insertFeedbackDetails(username, name, status, rating,comment);
		
		if(complete == true) {
			RequestDispatcher disp1 = request.getRequestDispatcher("Success.jsp");
			disp1.forward(request, response);
			
		}
		else {
			RequestDispatcher disp2 = request.getRequestDispatcher("Unsuccess.jsp");
			disp2.forward(request, response);
		}
		
	}

}
