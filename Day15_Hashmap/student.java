package Day15_Hashmap;

import java.util.Scanner;

public class student {
	
	Scanner scan = new Scanner(System.in);
	String name,program;
	int age;
	
	student(String name, String program, int age) {
		System.out.print("Enter Name : ");
		this.name = scan.nextLine();
		System.out.print("Enter Program : ");
		this.program = scan.nextLine();
		System.out.print("Enter Age : ");
		this.age = Integer.parseInt(scan.nextLine());;
	}
	
	void introduce() {
		System.out.println(" ");
		System.out.println("Hello " + name);
		System.out.println("You are a " + program + " Student ");
		System.out.print("And a " + age + " years old");
		System.out.println(" ");
		System.out.println(" ");
	}

}
