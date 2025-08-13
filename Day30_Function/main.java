package Day30_Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class main {
	
    public static void main(String[] args) {
    	
    	Function<String, String> addExclamation = s -> s + "!";
    	Function<String, String> makeStars = s -> "***" + s + "***";
    	
    	Function<String, String> combined = addExclamation.andThen(makeStars);
    	Function<String, String> combined1 = addExclamation.compose(makeStars);
    	System.out.println(combined.apply("world"));  
    	System.out.println(combined1.apply("world"));
    	
    	System.out.println();
    	
    	Function<Integer, Integer> doubleIt = s -> s*2;	
    	Function<Integer, Integer> squareIt = s -> s*s;
   
    	Function<Integer, String> addLabel = number ->   "Result : " + number ;
    	
    	Function<Integer, String> andThen = doubleIt.andThen(squareIt).andThen(addLabel);
    	Function<Integer, String> compose = doubleIt.compose(squareIt).andThen(addLabel);

    	System.out.println(andThen.apply(5));
    	System.out.println(compose.apply(5));
    	
    	
    	System.out.println();
    	
    	Function<Integer, Double> NumberToHalf = s -> s * .5;
    	Function<Double, String> DoubleToMoneyString = s -> "Money : " + s;
    	Function<String, Integer> CountCharacters = s ->  s.length();
    	
    	Function<Integer, Integer> ChainInteger = NumberToHalf.andThen(DoubleToMoneyString).andThen(CountCharacters);
    
    	
    	System.out.println(ChainInteger.apply(200));
    	


    	
    	
    	
    	
    }
}
