package personalizedlerningplatform;

public abstract class User {
	protected String name;
	protected String email;
	protected String userId;
	
	public User(String name, String email, String userId) {
		this.name = name;
		this.email = email;
		this.userId = userId;
	}
	
	public void displayInfo() {
	    System.out.println("Name   : " + name);
	    System.out.println("Email  : " + email);
	    System.out.println("UserID : " + userId);
	}

}
