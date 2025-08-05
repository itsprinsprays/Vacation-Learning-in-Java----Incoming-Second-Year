package Day24_Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Challenge4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Student> stud = new ArrayList<>(Arrays.asList(
					new Student("Prince",20,"BSIT"),
					new Student("Andrei",18,"BSCpE"),
					new Student("Lannce",18,"BSCS")
					));
			
			Consumer<Student> print = safePrinting("Students : ");
			printStudent(stud,print);
			
	

	}
	
	public static<T> void printStudent(List<T> word, Consumer<T> printing ) {
		word.forEach(printing);
	}
	
	public static <T> Consumer<T> safePrinting(String message) {
		String prefix = (message == null || message.isBlank()) ? "<Nothing is in parameter>" : message;
		return s -> {
			if (s == null) System.out.println(prefix + " Null Value");
			else if(s instanceof Student student) {
				 System.out.println(prefix + "|Name : " + student.getName() + " |Age : " + student.getAge() + " |Program : " + student.getProgram() );
			}else System.out.println("Type : " + s.getClass().getSimpleName());
		};
	}


}
