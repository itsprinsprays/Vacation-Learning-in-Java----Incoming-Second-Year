package Day2_Object;
import Day1_Methods.print;

public class person {

	public person(String firstname,String lastname, int age,char sex) {
	
		print.pl("Your name is : " + firstname + " " + lastname);
		print.pl("Your age is : " + age);
		print.p("Your sex is : " + sex);
		
	}
}
