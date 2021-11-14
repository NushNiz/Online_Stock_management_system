package agentLog;

public class Agent {
	
	private int AgentID;
	private String Name;
	private String UserName;
	private String Password;
	
	public Agent(int agentID, String name, String userName, String password) {
		AgentID = agentID;
		Name = name;
		UserName = userName;
		Password = password;
	}

	public Agent() {
		// TODO Auto-generated constructor stub
	}

	public int getAgentID() {
		return AgentID;
	}

	

	public String getName() {
		return Name;
	}

	

	public String getUserName() {
		return UserName;
	}

	

	public String getPassword() {
		return Password;
	}

	public void setUsername(String username) {
		UserName=username;
	}
	
	public void setPassword(String password) {
		Password=password;
	}

}
