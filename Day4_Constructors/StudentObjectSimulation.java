package Day4_Constructors;

import Day1_Methods.print;
import java.util.Scanner;


public class StudentObjectSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String firstname = null,lastname = null,course = null,section = null,year = null;
		double midtermGrade = 0,finalGrade = 0;
		
		print.p("Enter Firstname : ");
		firstname = scan.nextLine();
		
		print.p("Enter Lastname : ");
		lastname = scan.nextLine();
		
		print.p("Enter Program : ");
		course = scan.nextLine();
		
		print.p("Enter Year : ");
		year = scan.nextLine();
		
		print.p("Enter Section : ");
		section = scan.nextLine();
		
		print.p("Enter Midterm Grade : ");
		midtermGrade = scan.nextInt();
		
		print.p("Enter Final Grade : ");
		finalGrade = scan.nextInt();
		
		print.pl("------------ INFORMATION ------------");
		
		StudentInfo SI = new StudentInfo(firstname,lastname,year,course,section,midtermGrade,finalGrade);
		
		SI.introduceSelf();
		SI.evaluateGrade();
		
		scan.close();
	}


}
