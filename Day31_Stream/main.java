package Day31_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<String> fruitList = Arrays.asList("ORANGE","MANGO","Grapes","PINEAPPLe","Apple");
		
		fruitList.stream()
				 .filter(list -> list.equals(list.toUpperCase()))
				 .map(list -> list.toLowerCase())
				 .forEach(list -> System.out.println("Fruits : " + list));
		
		System.out.println();
		
		List<Integer> numbers = Arrays.asList(5, 12, 9, 20, 7, 15);
		
		numbers.stream()
				.filter(num -> num > 10)
				.map(num -> num * 2)
				.forEach(result -> System.out.println("Result :" + result));
		
		System.out.println();
		
		List<String> words = Arrays.asList("Java", "Python", "C", "JavaScript", "Go", "Ruby");
		
		List<String> filteredWords = words.stream()
				.filter(word -> word.length() > 3)
				.map(convert -> convert.toUpperCase())
				.collect(Collectors.toList());
		
		filteredWords.forEach(word -> System.out.println(word));
		
		System.out.println();

		List<Integer> numbers1 = Arrays.asList(3,8,12,5,20,7,10);
		
		List<Integer> filterAndSquared = numbers1.stream()
													.filter(even -> even % 2 == 0)
													.map(multiply -> multiply * multiply)
													.collect(Collectors.toList());
		
		filterAndSquared.forEach(s -> System.out.println(s));
		
		System.out.println();

		List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David", "Eve", "Frank");
		
		List<String> filterAndLower = names.stream()
											.filter(name -> name.startsWith("C"))
											.map(lower -> lower.toLowerCase())
											.collect(Collectors.toList());
		
		filterAndLower.forEach(s -> System.out.println(s));
		
		System.out.println();

		List<Integer> nums = Arrays.asList(2, 4, 6, 8, 10);
		
		nums.stream()
			.map(multiply -> multiply *3)
			.forEach(s -> System.out.println("Resutl :" + s));
		
		System.out.println();

		List<Integer> score = Arrays.asList(55, 72, 88, 45, 90, 67, 100, 38);
		
		List<String> newScore = score.stream()
										.filter(grade -> grade > 70)
										.map(convert -> "Score : " + convert)
										.collect(Collectors.toList());
		newScore.forEach(s -> System.out.println(s));
		
		System.out.println();

		List<Double> productPrices = Arrays.asList(5.0, 12.5, 7.3, 20.0, 3.5, 15.0);
		
		List<String> newProductPrices = productPrices.stream()
														.filter(less -> less > 5.0)
														.map(rate -> rate * 56.0)
														.map(price -> price > 1000 ? price * 0.8 : price)
														.map(symbol -> "₱" + symbol)
														.collect(Collectors.toList());
		newProductPrices.forEach(s -> System.out.println(s));

		
	}

}
