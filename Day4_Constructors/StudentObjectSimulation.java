package Day4_Constructors;

import Day1_Methods.print;
import java.util.Scanner;


public class StudentObjectSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		print.p("Enter Firstname : ");
		String firstname = scan.nextLine();
		
		print.p("Enter Lastname  : ");
		String lastname = scan.nextLine();
		
		print.p("Enter Program   : ");
		String course = scan.nextLine();
		
		print.p("Enter Year      : ");
		String year = scan.nextLine();
		
		print.p("Enter Section   : ");
		String section = scan.nextLine();
		
		print.p("Enter Midterm Grade : ");
		int midtermGrade = scan.nextInt();
		
		print.p("Enter Final Grade : ");
		int finalGrade = scan.nextInt();
		
		print.pl("------------ INFORMATION ------------");
		
		StudentInfo SI = new StudentInfo(firstname,lastname,year,course,section,midtermGrade,finalGrade);
		
		SI.introduceSelf();
		SI.evaluateGrade();
		
		scan.close();
	}


}
