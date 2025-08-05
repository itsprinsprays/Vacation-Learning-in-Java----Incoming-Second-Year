package Day24_Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Challenge3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Number> number = new ArrayList<>(Arrays.asList(10, 0, -5, 25));
		Consumer<Number> num = safePrinting("Processing number : ");
		number(number,num);
		
	}

	public static <T> void number(List<T> word, Consumer<T> condition) {
		word.forEach(condition);
	}
	
	public static <T> Consumer <T> safePrinting(String message) {
		String prefix = (message == null || message.isBlank()) ? "<nothing is in parameter>" : message;
		return s-> {
			if(s == null) System.out.println("Null Value");
			else if(s instanceof String s1) {
				if(s1.isBlank()) System.out.println(prefix + " Empty Value");
				else System.out.println(prefix + s1);
		}	else if(s instanceof Integer s2) {
				if(s2 == 0) System.out.println(prefix + s2 + " (Zero Detected)");
				else if (s2 < 0) System.out.println(prefix + s2 + " (Negative Number)");
				else System.out.println(prefix + s);
		}
	};
}
}