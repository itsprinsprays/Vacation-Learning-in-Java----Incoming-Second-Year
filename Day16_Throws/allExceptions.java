package Day16_throws;
import java.util.Scanner;
public class allExceptions {
	
	static Scanner scan = new Scanner(System.in);

	static String name, email,password,confirm;
	static int age;
	public static void scan() throws EmptyFieldException, InvalidEmailException, WeakPasswordException, WrongPasswordException {
		
		System.out.print("Enter Name       : ");
		name = scan.nextLine();
		
		System.out.print("Enter Age        : ");
		age = Integer.parseInt(scan.nextLine());
		
		System.out.print("Enter Email      : ");
		email = scan.nextLine();
		
		System.out.print("Enter Password   : ");
		password = scan.nextLine();
		
		
		if(name.isEmpty()) throw new EmptyFieldException("Please Input your name");
			
		if(age < 13 ) throw new IllegalArgumentException("Needs to be 13 up ");
		
		if(!email.contains("@") || !email.contains(".")) throw new InvalidEmailException("Please Input @ or .");

		if(password.length() < 6 ) throw new WeakPasswordException("Password must at least 6 characters");
		else if(password.matches(".*[a-zA-Z].*") && !password.matches(".*[0-9].*")) throw new WeakPasswordException("Password must also contain number!");
		else if(!password.matches(".*[a-zA-Z].*") && password.matches(".*[0-9].*")) throw new WeakPasswordException("Password must also contain letters!");
		
		System.out.print("Confirm Password : ");
		confirm = scan.nextLine();
		if(!password.equals(confirm)) throw new WrongPasswordException("Password Mismatch");
		System.out.println("Signing Succesfully");
		
	}
	
	public static void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Email : " + email);
		System.out.print("Password : ");
		for(int i = 0; i < password.length(); i++) {
			System.out.print("*");
		}
	}
	

	
}
