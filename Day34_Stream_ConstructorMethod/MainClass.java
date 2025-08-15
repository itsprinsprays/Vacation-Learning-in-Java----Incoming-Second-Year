package Day34_Stream_ConstructorMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> titles = Arrays.asList(
			    "Java Programming", 
			    "Spring Boot Guide", 
			    "Python Basics", 
			    "Algorithms"
			);
		
		List<Book> newTitles = titles.stream()
									.filter(s -> s.contains("Java"))
									.map(Book::new)
									.filter(s -> s.getPages() > 300)
									.collect(Collectors.toList());
								
		newTitles.forEach(System.out::println);
		
		System.out.println();
		
		List<String> studentNames = Arrays.asList("Alice", "Bob", "Charlie", "Diana");
		
		List<Student> newStudentNames = studentNames.stream()
										.map(Student::new)
										.filter(s -> s.getScore() >= 75)
										.collect(Collectors.toList());
		
		newStudentNames.forEach(System.out::println);
		
		System.out.println();
		
		List<String> employeeNames = Arrays.asList("John", "Emma", "Liam", "Olivia", "Noah");

		List<Employee> newEmployeeNames = employeeNames.stream()
										.map(Employee::new)
										.filter(s -> s.getName().startsWith("J") || s.getName().startsWith("L"))
										.map(s -> {
											if(s.getName().startsWith("L")) {
												s.setDepartment("IT");
											}
											return s;
										})
										.collect(Collectors.toList());
		
		newEmployeeNames.forEach(System.out::println);

	}

}
