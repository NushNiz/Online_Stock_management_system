package feedback;

public class Feedback {
	
	
	private String UserName;
	private String Name;
	private String Status;
	private String Rating;
	private String Comment;
	
	public Feedback(String userName, String name, String status, String rating, String comment) {
		super();
		UserName = userName;
		Name = name;
		Status = status;
		Rating = rating;
		Comment = comment;
	}

	public String getUserName() {
		return UserName;
	}


	public String getName() {
		return Name;
	}


	public String getStatus() {
		return Status;
	}

	public String getRating() {
		return Rating;
	}

	public String getComment() {
		return Comment;
	}

	
	
	
	

}
