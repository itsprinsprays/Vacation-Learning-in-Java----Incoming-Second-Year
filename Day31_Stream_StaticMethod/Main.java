package Day31_Stream_StaticMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	String name;
	int grades;
	
	Student(String name, int grades) {
		this.name = name;
		this.grades = grades;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList = new ArrayList<Student>(Arrays.asList(
					new Student("prince",98),
					new Student("renz",95),
					new Student("ryhlle",65),
					new Student("mckencee", 70)
				));
		
		List<String> updateList = studentList.stream()
									.filter(s -> s.grades >= 75)
									.map(s -> new Student(s.name.substring(0,1).toLowerCase() + s.name.substring(1).toUpperCase(), s.grades))  
									.map(s -> s.name + " - Passed (" + s.grades + ")")
									.map(s -> s.toUpperCase())
									.collect(Collectors.toList());
		
		updateList.forEach(System.out::println);
		
		System.out.println();
		
		
		List<String> numbers = Arrays.asList("25", "9", "16", "4");
		
		List<Double> collect = numbers.stream()
									.map(Integer::parseInt)
									.map(Math::sqrt)
									.collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
		System.out.println();

		
		List<String> names = Arrays.asList("  PRINCE ", "reNz  ", "  mCkenCEE");
		
		names.stream()
			.map(String::trim)
			.map(String::toLowerCase)
			.map(Main::Capitalize)
			.forEach(System.out::println);
		
		System.out.println();

		
		List<Integer> numbers1 = Arrays.asList(3, 7, 2, 10, 5, 8);
		
		numbers1.stream()
			.filter(Main::isEven)
			.map(Math::sqrt)
			.forEach(System.out::println);
	}
	
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
	
	public static int convert(Double n) {
		return n.intValue();
	}

	
	static String Capitalize(String s) {
		return s.substring(0,1).toUpperCase() + s.substring(1);
	}
	
	
}
