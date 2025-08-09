package Day28_Pred_Cons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList = new ArrayList<>(Arrays.asList(
				new Student("Prince",20),
				new Student("Renz",19),
				new Student("Raj", 16),
				new Student("Andrei", 18),
				new Student("Leanna", 15)
				));
		
		Predicate<Student> studentFilter = ProcessStudent.filterAge();
		
		Consumer<Student> studentPrint = ProcessStudent.printdetails();
		
		ProcessStudent.checkStudent(studentList, studentFilter, studentPrint);

	}

}
