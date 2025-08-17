package Day36_StreamAddToolkit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
		
		List<String> rawBooks = Arrays.asList(
			    "Harry Potter, 5",
			    "The Hobbit, 4",
			    "Harry Potter, 5",   // duplicate
			    "Atomic Habits, 3",
			    "Ready Player One, 4",
			    "The Fault in Our Stars, 2",
			    "Dune, 5",
			    "1984, 4",
			    "The Hunger Games, 5",
			    "Animal Farm, 3"
			);
		
		List<Book> newRawBooks = rawBooks.stream()
									.distinct()
									.map(Book::from)
									.filter(Book::isRating)
									.sorted(Book::compare)
									.skip(1)
									.limit(3)
									.toList();
		
		newRawBooks.forEach(System.out::println);
		
		System.out.println();
		
		List<String> numbers = Arrays.asList(
			    "10", "5", "20", "10", "30", "25", "5", "40", "15", "35"
			);
		
		List<Integer> newNumbers = numbers.stream()
										.distinct()
										.map(Integer::parseInt)
										.filter(s -> s > 15)
										.sorted(Comparator.reverseOrder()) //.sorted((a,b) -> Integer.compare(b,a))
										.skip(1)
										.limit(3)
										.map(s -> s * 2)
										.toList();
		
		newNumbers.forEach(System.out::println);
		
		System.out.println();

		List<String> rawProducts = Arrays.asList(
			    "Laptop-2000",
			    "Mouse-500",
			    "Keyboard-1500",
			    "Monitor-3000",
			    "Laptop-2000",   // duplicate
			    "Headset-1200",
			    "Mousepad-300",
			    "Monitor-3000"   // duplicate
			);
		
		

		
		
	}

}
