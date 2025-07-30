package Day20_PredicateFactoryMethod;

import java.util.List;
import java.util.function.Predicate;
public class mainPredicate {
	
	public static void main(String[] args) {
		
		charMethod c = new charMethod();
		
		List<String> word = List.of("Apple", "Banana", "Avocado", "Carrot");
		
		Predicate<String> endsWithA =  c.endsWith('a');
		
		c.checkWord(word, endsWithA);
	}

}	
