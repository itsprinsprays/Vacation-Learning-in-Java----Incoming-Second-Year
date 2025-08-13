package Day19_Predicate;

import java.util.List;
import java.util.function.Predicate;

public class Predicate3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = List.of("APPLE", "ORANGE1", "BANANA", "AVOCADO", "EGGPLANT7", "ICE");
		
		Predicate<String> isUpperCase = word -> {
			boolean result = word.equals(word.toUpperCase());
			return result;	
		};
		
		Predicate<String> startsWithVowel = word -> {
			char first = Character.toUpperCase(word.charAt(0));
			return first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U';
		};
		
		Predicate<String> endsWithDigit = word -> {
			char dig = word.charAt(word.length() - 1);
			return Character.isDigit(dig);
		};
		
		for(String word: words) {
			if(isUpperCase.and(startsWithVowel).and(endsWithDigit.negate()).test(word)) {
				System.out.println("Checking : " + word);
				System.out.println("Qualified");
				System.out.println("");
			} else {
				System.out.println("Checking : " + word);
				System.out.println("Not Qualified");
				System.out.println("");

			}
		}

	}

}
