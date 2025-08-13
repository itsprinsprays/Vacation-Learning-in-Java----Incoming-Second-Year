package Day27_Pred_Cons;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Student {
	
	private String name;
	private int age;
	private char gender;

	public Student(String name, int age, char gender) {
			this.name = name;
			this.age = age;
			this.gender = gender;
	}
	
	public static Predicate<Student> isGender() {
		return s-> s.getGender() != 'F';
	}
	
	public static Consumer<Student> printDetails() {
		return s-> {
			System.out.println("Name : " + s.getName());
			System.out.println("Age  : " + s.getAge());
			System.out.println("Gender : " + s.getGender());
			System.out.println("");
			
		};
	}
	
	public static void processStudent(List<Student> list, Predicate<Student> condition, Consumer<Student> action) {
		for(Student s : list) {
			if(condition.test(s)) {
				action.accept(s);
			}
		}
		 
	}
	
	
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	char getGender() {
		return gender;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	void setGender(char gender) {
		this.gender = gender;
	}
	

}
