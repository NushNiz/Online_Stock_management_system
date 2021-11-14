package agentLog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class AgentDBUtil {

	//method to validate agent username and password
	public static List<Agent> validate(String username, String password){
		
		ArrayList<Agent> Agent = new ArrayList<>();
		
		//database connection
		String url ="jdbc:mysql://localhost:3306/stockmanagement";
		String user = "root";
		String pw = "3661433";
		
		//validate
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,pw);
			Statement stm = con.createStatement();
			
			String sql = "select * from stockmanagement.agent where UserName='"+username+"' and Password='"+password+"'";
			ResultSet result = stm.executeQuery(sql);
			
			if(result.next()) {
				int AgentID = result.getInt(1);
				String Name = result.getString(2);
				String UserName = result.getString(3);
				String Password = result.getString(4);
				
				Agent a=new Agent(AgentID, Name, UserName, Password);
				Agent.add(a);
				
				
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return Agent;
		
	}

	

}
