package Day29_Function;


import java.util.function.Function;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer, String> colorFunction = s-> {
			if(s == 1) return "red";
			else if(s == 2) return "blue";
			else if(s == 3) return "green";
			else return "Unknown Color";
		};
		
		System.out.println(colorFunction.apply(3));
		System.out.println(colorFunction.apply(5));

		
		System.out.println("");
		
		Function<Integer, String> evenOddFunction = s -> (s % 2 == 0) ? "Even" : "Odd";
		
		System.out.println(evenOddFunction.apply(5));
		System.out.println(evenOddFunction.apply(22));

		
		System.out.println("");

		Function<Integer, String> gradeFunction = s -> {
			return (s >= 90) ? "A" :
            	   (s >= 80) ? "B" :
            	   (s >= 70) ? "C" :
            	   (s >= 60) ? "D" : "F";
				
		};
		
		System.out.println("Your Grade is " + gradeFunction.apply(88));
		System.out.println("Your Grade is " + gradeFunction.apply(50));
		
		System.out.println("");
		
		Function<String, Integer> lengthFunction = s -> s.length();
		
		System.out.println("The word Java has " + lengthFunction.apply("Java") + " Letters");
		System.out.println("The word JavaScript has " + lengthFunction.apply("JavaScript") + " Letters");
		
		System.out.println("");

		Function<Integer, Boolean> multipleOfFive = s-> (s % 5 == 0) ? true : false; 
		
		System.out.println(multipleOfFive.apply(12)); 
		System.out.println(multipleOfFive.apply(10)); 
		
		System.out.println("");

		Function<String, String> passwordChecker = s-> {
			if(s.length() >= 8 && s.matches(".*\\d.*")) return "Strong Password";
			else if(s.length() >= 8 ) return "Weak Password (add numbers)";
			else if(s.length() <= 7 ) return "Too Short";
			return "Invalid";
		};
		
		System.out.println(passwordChecker.apply("abc"));
		System.out.println(passwordChecker.apply("abcdefgh"));
		System.out.println(passwordChecker.apply("abc12345"));

		System.out.println("");
		
		Function<Integer, String> ageCategory = s-> {
			if(s <= 0) return "Invalid age";
			if(s >= 20) return "Adult";
			if(s >= 13) return "Teen";
			return "Child";
		};
		
		System.out.println(ageCategory.apply(10));  
		System.out.println(ageCategory.apply(-1));  
		System.out.println(ageCategory.apply(25));


	}

}
