package Day17_LambdaExpression;
import java.util.InputMismatchException;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		int first = 0,second = 0;
		try {
			System.out.print("First Number  : ");
			first = Integer.parseInt(scan.nextLine());
		
			System.out.print("Second Number : ");
			second = Integer.parseInt(scan.nextLine());
		
		} catch(InputMismatchException  e) {
			System.out.print("Enter an Integer!!");
		} catch(NumberFormatException e1) {
			System.out.println("Enter an Integer!!");
		}
		
		Calculator addition = (a,b) -> {
			System.out.println(a + " + " + b + " is equal to " + (a+b));
			 return a+b;
		};
		
		Calculator subtraction = (a,b) -> {
			System.out.println(a + " - " + b + " is equal to " + (a-b));
			return a-b;

		};
		
		Calculator multiplication = (a,b) -> {
			System.out.println(a + " * " + b + " is equal to " + (a*b));
			return a*b;

		};
		
		Calculator division = (a,b) -> {
			System.out.println(a + " / " + b + " is equal to " + (a/b));
			return a/b;

		};
		
		addition.operator(first,second);
		subtraction.operator(first, second);
		multiplication.operator(first, second);
		
		if(second != 0) 
		division.operator(first,second);
		else System.out.print("Cant Divide " + first + " to " + second);
		scan.close();

	}

}
