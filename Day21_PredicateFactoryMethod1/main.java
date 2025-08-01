package Day21_PredicateFactoryMethod1;

import java.util.List;
import java.util.function.Predicate;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = List.of("APPLE", "ORANGE1", "BANANA", "AVOCADO", "EGGPLANT7", "ICE");
		
		Predicate<String> isUppercase = factoryMethods.isUppercase();
		
		Predicate<String>  startsWith = factoryMethods.startsWithVowel();
		
		Predicate<String>  endsWithDigits = factoryMethods.endsWithDigits();
		
		factoryMethods.checkword(words, isUppercase, startsWith, endsWithDigits);
		

	}

}
