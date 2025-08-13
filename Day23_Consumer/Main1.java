	package Day23_Consumer;
	
	import java.util.List;
	import java.util.function.*;
	import java.util.ArrayList;
	import java.util.Arrays;
	public class Main1 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		//	List<String> fruits = List.of("Avocado","","","Pineapple","Grapes"); cant accept null
			List<String> fruits = new ArrayList<>(Arrays.asList("Avocado","","Orange",null,"Grapes")); // can accept null value
			Consumer<String> printFruits = safePrinting("Fruits");
			
			fruit(fruits,printFruits);
			
			List<Number> number = new ArrayList<>(Arrays.asList(1.0,2.23f,3,4,6,null));
			Consumer<Number> printNumbers = safePrinting("Number");
			fruit(number,printNumbers);
	
		}
		
		public static <T> void fruit(List<T> fruits, Consumer<T> condition) {
			fruits.forEach(condition);
		}
	
		public static <T> Consumer<T> safePrinting(String message) {
			String prefix = (message == null || message.isBlank()) ? "<no message>" : message;
			return s -> {
				if(s == null) {
					System.out.println(prefix +  " | <Null Value>");
				} else if(s instanceof String s1) {
					if(s1.isBlank()) {
					System.out.println(prefix + " | <Empty String>");
				     } else
				    System.out.println(prefix + " | " + s1.toUpperCase() + " | " + s1.length() + " Letter | " + "Starts with : " + s1.charAt(0)); 
			  
				} else System.out.println(prefix + " | " + s + " | Type: " + s.getClass().getSimpleName());
		};	
		}
	}
	
	
