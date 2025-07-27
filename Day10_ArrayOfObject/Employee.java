package Day10_ArrayOfObject;
import Day1_Methods.print;
public class Employee {
	String firstname,lastname,jobtitle;
	
	Employee(String firstname, String lastname, String jobtitle) {
			this.firstname = firstname;
			this.lastname = lastname;
			this.jobtitle = jobtitle;
		
	}
	
	void introduceSelf() {
		print.pl("Fullname : " + firstname + " " + lastname);
		print.p("Jobtitle : " + jobtitle);
		System.out.println();
		
		
	}

}
