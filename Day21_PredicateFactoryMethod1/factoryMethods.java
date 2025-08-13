package Day21_PredicateFactoryMethod1;

import java.util.List;
import java.util.function.Predicate;

public class factoryMethods {
	
	public static Predicate<String> isUppercase() {
		return word -> word.equals(word.toUpperCase()); 
	}
	
	public static Predicate<String> startsWithVowel() {
		return word -> {
			if(word == null || word.isEmpty()) return false;
			char first = Character.toUpperCase(word.charAt(0));
			return first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U';
		};
	}
	
	public static Predicate<String> endsWithDigits() {
		return word -> {
			 if (word == null || word.isEmpty()) return false;
			char dig = word.charAt(word.length() - 1);
			return Character.isDigit(dig);
			
		};
		
	}	
	
	public static void checkword(List<String> words, Predicate<String> ConditionIs, Predicate<String> ConditionStarts, Predicate<String> ConditionEnds) {
			
		for(String word : words) {
			Predicate<String> combine = ConditionIs.and(ConditionStarts).and(ConditionEnds);
			if(combine.test(word)) {
				System.out.println("Checking : " + word);
				System.out.println("Qualified");
			} else {
				System.out.println("Checking : " + word);
				System.out.println("Not Qualified");
			}
			System.out.println("");										                                                												
		}
	}
}
