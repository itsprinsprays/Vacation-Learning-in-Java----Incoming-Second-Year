package Day24_Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Challenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//✅ Challenge 1: Filter and Print Non-Empty Strings
		List<String> java = new ArrayList<>(Arrays.asList("Java", "", "Stream", "", "API"));
		
		Consumer<String> printLanguage = safePrinting("");
		language(java, printLanguage);

	}
	
	public static <T> void language(List<T> word, Consumer<T> condition) {
		word.forEach(condition);
	}
	
	public static <T> Consumer<T>safePrinting(String message) {
		return s -> {
			if(s == null) {
				
			} else if(s instanceof String s1) {
				if(s1.isBlank()) {
					System.out.print("");
				} else {
					System.out.println(s1);
				}
			}else {
				System.out.print("Type : " + s.getClass().getSimpleName());
			}
		};
	}

}
