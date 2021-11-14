package feedback;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FeedbackDBUtil {
	
	//insert feedback details
	public static boolean insertFeedbackDetails(String username, String name, String status, String rating,String comment) {
	
	boolean complete = false;
	
	String url ="jdbc:mysql://localhost:3306/stockmanagement";
	String user = "root";
	String pw = "3661433";
	
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,user,pw);
		Statement stm = con.createStatement();
		
		String sql = "insert into stockmanagement.feedback values ('"+username+"', '"+name+"', '"+status+"', '"+rating+"', '"+comment+"')";
		int result = stm.executeUpdate(sql);
		
		if(result > 0) {
			complete = true;
		}
		
		else
			complete = false;
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	return complete;
}

}
