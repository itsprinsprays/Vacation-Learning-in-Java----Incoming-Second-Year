package Day28_Pred_Cons;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ProcessStudent {
	
	public static Predicate<Student> filterAge() {
		return s -> s.getAge() >= 18;
	}
	
	public static Consumer<Student> printdetails() {
		return s-> {
			System.out.println("Name " + s.getName().toUpperCase());
			System.out.println("Age : " + s.getAge());
			System.out.println("");
		};
	}
	
	public static void checkStudent(List<Student> studentlist, Predicate<Student> condition, Consumer<Student> action ) {
		for(Student stud : studentlist) {
			if(condition.test(stud)) {
				action.accept(stud);
			}
		}
	}

}
