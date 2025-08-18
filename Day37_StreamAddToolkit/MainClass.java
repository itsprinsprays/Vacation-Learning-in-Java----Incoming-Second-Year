package Day37_StreamAddToolkit;

import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		List<String> students = Arrays.asList("Anna", "Ben", "Carla", "David");
		
		String combine = students.stream()
								.reduce("", (a, b) -> (a.isEmpty()) ? b : a + ", " + b);
		
		System.out.println(combine);
		
		System.out.println();
		
		List<String> words = List.of("java", "springboot", "api", "stream", "reduce");
		
		String longest = words.stream()
								.reduce("", (a,b) -> a.length() > b.length() ? a:b);
		
	
		
		System.out.println(longest);
		
		System.out.println();

		List<Integer> numbers = List.of(3, 5, 7, 2, 8, 10, 1);
		
		int sum = numbers.stream()
							.reduce(0, (num1,num2) -> num1+num2);
		
		int product = numbers.stream()
				.reduce(1, (num1,num2) -> num1*num2);
		
		
		System.out.println(sum);
		System.out.println(product);


		
		

		
		
	
	}
}
