package Day13_tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		
		do {
			
		try {
		
		System.out.print("Enter Integer : ");
		int num = scan.nextInt();
		
		int square = num * num;
		
		System.out.println("Square : " + square);
		num1--;
		
		} catch(InputMismatchException e) {
			scan.nextLine();
			System.out.println("Integers Only!");
		} 
		
		
		}while(num1>=0);
		
		scan.close();
}
}
