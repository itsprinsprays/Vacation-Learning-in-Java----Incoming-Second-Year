package Day20_PredicateFactoryMethod;

import java.util.List;
import java.util.function.Predicate;
public class mainPredicate {
	
	public static void main(String[] args) {
		

		
		List<String> word = List.of("Apple", "Banana", "Avocado", "Carrot");
		
		Predicate<String> endsWithA =  charMethod.endsWith('a');
		
		charMethod.checkWord(word, endsWithA);
	}

}	
