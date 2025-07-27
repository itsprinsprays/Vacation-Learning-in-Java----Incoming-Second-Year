package Day2_ClassObjects;
import Day1_Methods.print;
import java.util.Scanner;
public class ClassObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		print.p("Enter FirstName : ");
		String firstname = scan.nextLine();
		
		print.p("Enter LastName : ");
		String lastname = scan.nextLine();
		
		print.p("Enter Sex : ");
		char sex = scan.next().charAt(0);
		
		print.p("Enter Age : ");
		int age = scan.nextInt();
		
		person p = new person(firstname,lastname,age,sex);

	}

}
