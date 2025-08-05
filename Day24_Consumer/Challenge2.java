package Day24_Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Challenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Challenge 2: Prefix, Null and Empty Printing
		List<String> fruit = new ArrayList<>(Arrays.asList("Apple"," ","Banana",null,"Orange"));
		
		Consumer<String> printFruits = safePrinting("Fruit : ");

		fruits(fruit,printFruits);
	}
	
	public static <T> void fruits(List<T> word, Consumer<T> condition) {
		word.forEach(condition);
	}
	
	public static <T> Consumer<T> safePrinting(String message) {
		String prefix = (message == null || message.isBlank()) ? "<Nothing>" : message;
		return s -> {
			if(s == null) {
				System.out.println(prefix + " Null Value");
			} else if(s instanceof String s1) {
				if(s1.isBlank()) {
					System.out.println(prefix + " Empty String");
				} else {
					System.out.println(prefix + " " + s1);
				}
			}else {
				System.out.println("Type : " + s.getClass().getSimpleName());
			}
		};
	}

}
