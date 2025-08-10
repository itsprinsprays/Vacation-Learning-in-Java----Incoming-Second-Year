package Day29_Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   List<Student> students = new ArrayList<Student>(Arrays.asList(
		            new Student("Alice", 99, 99),
		            new Student("Bob", 90, 90),
		            new Student("Charlie", 75,90)
		        ));
		   	
		   Function<Student, String> gwaFunction = Student.calculateGWA(); 
		   
		   Student.printStudent(students, gwaFunction);
		   
//		   for(Student s : students) {
//			   System.out.println(gwaFunction.apply(s));
//		   }
		   

	}

}
