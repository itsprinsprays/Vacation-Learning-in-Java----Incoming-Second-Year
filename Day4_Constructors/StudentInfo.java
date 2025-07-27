package Day4;
import Day1.print;
import java.util.Scanner;

public class StudentInfo {
	
		Scanner scan = new Scanner(System.in);
		String firstname,lastname,course,section,year;
		double midtermGrade,finalGrade,average;
	
	StudentInfo(String firstname, String lastname, String year, String course, String section, double midtermGrade, double finalGrade){
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.year = year;
		this.course = course;
		this.section = section;
		this.midtermGrade = midtermGrade;
		this.finalGrade = finalGrade;
		
		
	}
	
	 void introduceSelf() {
		print.pl("Fullname : " + firstname + " " + lastname);
		print.pl("Program  : " + course);
		print.pl("Year     : " + year);
		print.pl("Section  : " + section);
	}
	 
	 void evaluateGrade() {
		 String remarks = "";
		 average = (midtermGrade + finalGrade) / 2;

		 if(average > 100) remarks = "Invalid Grades";
		 else if (average >= 98) remarks = "With Highest Honors";
		 else if (average >= 95) remarks = "With High Honors";
		 else if (average >= 90) remarks = "With Honors";
		 else if (average >= 75) remarks = "Passed";
		 else remarks = "Failed";
		 
		 print.pl("Average  : " + average);
		 print.pl("Remarks  : " + remarks);
	 }

}
