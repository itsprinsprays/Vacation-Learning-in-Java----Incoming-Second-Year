package Day23_Consumer;

import java.util.List;
import java.util.function.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruits = List.of("Avocado","Orange","Apple","Pineapple","Grapes");
		
		Consumer<String> printfruits = SafePrinting("");
		fruit(fruits,printfruits);
		
		
	}
	
	public static void fruit(List<String> word, Consumer<String> situation) {
		word.forEach(situation);
	}

	public static Consumer<String> SafePrinting(String message) {
		String prefix = (message == null || message.isBlank()) ? "<no message>" : message;  //tweaks for parameter used	
		return s -> {
			if(s == null || s.isBlank()) {
				System.out.println(prefix + " <Empty>");
			} else {
				System.out.println(prefix + s.toUpperCase() + " "+ "("+ s.length() + " Letters)");
			}
			
		};
	}
}
