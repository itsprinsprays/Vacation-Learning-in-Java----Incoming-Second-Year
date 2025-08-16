package Day35_Stream_ThreeReferenceMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass1 {
	
	public static void main(String[] args) {
		
		List<String> rawBooks = Arrays.asList(
			    "the hunger games",
			    "harry potter and the deathly hallows",
			    "the fault in our stars",
			    "ready player one",
			    "atomic habits"
			);
		
		processBook process = new processBook();
		
		List<Book> newRawBooks = rawBooks.stream()	
									.map(Book::new)
									.filter(process::isYear)
									.map(processBook::capitalizeTitle)
									.collect(Collectors.toList());
		
		newRawBooks.forEach(System.out::println);
									
		
	}

}
