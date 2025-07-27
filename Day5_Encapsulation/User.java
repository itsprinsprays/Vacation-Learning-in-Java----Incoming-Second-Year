package Day5;

import javax.swing.JOptionPane;

public class User {
	
	private int userID;
	private String section;
	private String fullname;
	
	User(int userID, String fullname, String section) {
		 if (userID < 0) {
			 	JOptionPane.showMessageDialog(null, "User ID cannot be negative");
		 }
		this.userID = userID;
		this.section = section;
		this.fullname = fullname;

	}
	
	
	int getuserID() {
		return userID;
	}
	
	String getsection() {
		return section;
	}
	
	String getfullname() {
		return fullname;
	}
	
	void setfullname(String fullname) {
		this.fullname = fullname;
	}
  
	void setsection(String section) {
		this.section = section;
	}
	

}
