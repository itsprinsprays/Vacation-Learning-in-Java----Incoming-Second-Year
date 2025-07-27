package Day10_Array;
import java.util.Scanner;
public class Student {
	
	Scanner scan = new Scanner(System.in);
	String section,course,year;
	private String firstname,lastname;
	
	Student(String firstname,String lastname,String section,String course, String year){
	    this.firstname = firstname;
	    this.lastname = lastname;
	    this.section = section;
	    this.course = course;
	    this.year = year;
	}
	
	Student(){
		
	}
	
	void ask() {
		
		System.out.print("Enter Firstname :");
		this.firstname = scan.nextLine();
		
		System.out.print("Enter Lastname  :");
		this.lastname = scan.nextLine();
		
		System.out.print("Enter Section   :");
		this.section = scan.nextLine();
		
		System.out.print("Enter Course    :");
		this.course = scan.nextLine();
		
		System.out.print("Enter Year      :");
		this.year = scan.nextLine();
		
	}
	
	void studentInfo() {
		System.out.println("Fullname : " + firstname + " " + lastname);
		System.out.println("Section  : " + section);
		System.out.println("Course   : " + course);
		System.out.println("Year     : " + year);
	}
	
	
	
	void setfirstname(String firstname) {
		this.firstname = firstname;
		
	}
	
	void setlastname(String firstname) {
		this.firstname = firstname;
		
	}
	
	String getfirstname() {
		return firstname;
	}
	
	String getlastname() {
		return lastname;
	}
	

}
