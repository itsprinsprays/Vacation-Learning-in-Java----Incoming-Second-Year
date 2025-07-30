package Day20_PredicateFactoryMethod;
import java.util.List;
import java.util.function.Predicate;

public class charMethod {
	
		public static Predicate<String> endsWith(char letter) {
			return word -> word.endsWith(String.valueOf(letter));
		}
	
	public static void checkWord(List<String> words, Predicate<String> conditions) {
		for(String word : words) {
			if(conditions.test(word)) {
				System.out.println(word + " matches condition");
			} else {
				System.out.println(word + " does not match");
			}
			
		}		
		
	}

}
