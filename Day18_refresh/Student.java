package Day18_refresh;
import java.util.Scanner;
public class Student {
	private String name,email;
	private String id;
	Scanner scan = new Scanner(System.in);
	
	Student(String name,String email, String id) {
		this.id = id;
		this.email = email;
		this.name = name;
	}
	
	
	public static Student fromInput(Scanner scan) throws ValidationException {
		
		try {
		System.out.print("Enter id : ");
		String id = scan.nextLine();
		
		System.out.print("Enter email : ");
		String email = scan.nextLine();
		if(!email.contains("@") || !email.contains(".")) throw new ValidationException("Email Must Contain @ and .");

		System.out.print("Enter Name : ");
		String name = scan.nextLine();
		
		System.out.println("Register Succesfully");
		return new Student(name, email, id);
		} catch(ValidationException  e) {
			System.out.println(e);
		}
		return null;
		
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
