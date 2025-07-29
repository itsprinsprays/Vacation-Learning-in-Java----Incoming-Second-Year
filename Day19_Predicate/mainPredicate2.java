package Day19_Predicate;

import java.util.List;
import java.util.function.Predicate;

public class mainPredicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = List.of("Prince","ANDREI","Dada","LANCE");
		
		Predicate<String> isUpperCase = name -> {
			System.out.println("Checking name : " + name);
			boolean result = name.equals(name.toUpperCase());
			System.out.println("is UpperCase? : " + result);
			return result;
		};
		
		for(String name:names) {
			System.out.println(" ");
			if(isUpperCase.test(name)) {
				System.out.println(name + " is UpperCase");
			} else System.out.println(name + " is not UpperCase");
		}

	}

}
