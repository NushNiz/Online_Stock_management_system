package deleteCart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class deleteDBUtil {
	
	public static boolean deleteItem (String id){
	
	boolean isSuccess = false;
	
	Integer convID = Integer.parseInt(id);
	
	//create the DB connection
	String url = "jdbc:mysql://localhost:3306/stockmanagement";
	String user = "root";
	String pwd = "3661433";
	
	try {

		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, user, pwd);
		Statement stmt = con.createStatement();
		//delete from database
		String sql = "delete from  stockmanagement.cusomer1  where id ='"+convID+"'";
		
		int r = stmt.executeUpdate(sql);
		
		if(r > 0) {
			isSuccess = true;
		}else {
			isSuccess = false;
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
	
	}
}
