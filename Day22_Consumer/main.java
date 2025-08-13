	package Day22_Consumer;
import java.util.List;
import java.util.Locale;
import java.util.function.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> said = s -> System.out.println("You said : " +s.toLowerCase());
		said.accept("FROG");
		
		Consumer<String> says = said("You Said");
		says.accept("FROG");
	
		System.out.println("");
		
		Consumer<String> printer = makePrinter();
		printer.accept("HELLO");
		printer.accept("");
		printer.accept("");
		
		System.out.println("");
		
		
		List<String> animals = List.of("Cat", "Dog", "Elephant");

		Consumer<String> prnt = s -> System.out.println("Animal: " + s.toUpperCase());
		printWords(animals, prnt);

	}
	
	public static Consumer<String> said(String message) {
		return s-> {	
			if(s == null || s.isEmpty()) {
				System.out.println(message + " : <nothing>");
			} else {
				System.out.println(message + " : " + s.toLowerCase());
			}
		};
	} 
	
	public static Consumer<String> makePrinter(){
		return c -> {
		if(c == null || c.isEmpty()){
		System.out.println("No input");
	}	else{
		System.out.println(c.toLowerCase(Locale.ROOT));
	}
	};

}	
	public static void printWords(List<String> words, Consumer<String> action) {
		words.forEach(action);
		//Alternative
//	    for (String word : words) {
//	        action.accept(word); // call .accept() on each word
//	    }
	  
	}

}
