package Day19_Predicate;

import java.util.function.Predicate;

public class mainPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> isPositive = num -> num > 0;
		System.out.println(isPositive.test(-5));
		
		Predicate<Integer> isGreater = first -> first > 10;
		System.out.println(isGreater.test(15));
		
		Predicate<Integer> isEven = num1 -> num1 % 2 == 0 , g10 = num1 -> num1 > 10;
		System.out.println(isEven.and(g10).test(12));
		System.out.println(isEven.and(g10).test(9));
		
		Predicate<String> isUpperCase = name -> name.equals(name.toUpperCase()) , startsWithA = name -> name.startsWith("A");
		System.out.println(isUpperCase.and(startsWithA).test("APPLE"));
		
		Predicate<String> endsWithDot = sentence -> sentence.endsWith(".") , isQuestion = sentence -> sentence.endsWith("?");
		System.out.println(endsWithDot.or(isQuestion).test("Hello world?"));
				
		startsWithA = sentence1 -> sentence1.startsWith("A");
		System.out.println(startsWithA.negate().test("Banana"));
		
		isUpperCase = sentence2 -> sentence2.equals(sentence2.toUpperCase()); startsWithA = sentence2 -> sentence2.startsWith("A");
		System.out.println(isUpperCase.and(startsWithA).negate().test("Banana"));
		
		Predicate<String> containtsAt = sentence3 -> sentence3.contains("@"); endsWithDot = sentence3 -> sentence3.endsWith(".");
		System.out.print(containtsAt.or(endsWithDot).negate().test("hello.world"));

	}
	
}
