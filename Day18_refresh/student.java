package Day18_refresh;
import java.util.Scanner;
public class student {
	private String name,email;
	private String id;
	Scanner scan = new Scanner(System.in);
	
	
	student(String name, String email, String id) throws ValidationException {
		
		try {
		System.out.print("Enter id : ");
		this.id = scan.nextLine();
		
		System.out.print("Enter email : ");
		this.email = scan.nextLine();
		if(!this.email.contains("@") || !this.email.contains(".")) throw new ValidationException("Email Must Contain @ and .");

		System.out.print("Enter Name : ");
		this.name = scan.nextLine();
		
		System.out.println("Student " + name + " succesfully");
		
		} catch(ValidationException  e) {
			System.out.println(e);
		}
	}
	
	void record() {
		System.out.println("ID : " + this.id + " | " + " Name : "  + this.name + " | " + "Email : " + this.email);
		System.out.println("");
	}
	
	String getName() {
		return name;
	}
	
	String getEmail() {
		return email;
	}
	
	String getId() {
		return id;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setEmail(String email) {
		this.email = email;
	}
	
	void setId(String id) {
		this.id = id;
	}
	
 

}
