package Day27_Pred_Cons;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> student = new ArrayList<>(Arrays.asList(
					new Student("Prince",20,'M'),
					new Student("Andrei",18,'M'),
					new Student("Dada",20,'F')
				));
		
		Consumer<Student> printD = Student.printDetails();
		Predicate<Student> printIG = Student.isGender();
		
		Student.processStudent(student, printIG, printD);

	}

}
